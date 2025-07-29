package casestudy2;import java.util.*;

//Abstract Product class
abstract class Product {
 protected String id, name;
 protected double price;
 protected int stock;

 public Product(String id, String name, double price, int stock)
 {
     this.id = id;
     this.name = name;
     this.price = price;
     this.stock = stock;
 }

 public abstract void displayDetails();

 public double getPrice()
 { 
	 return price;
	 }

 public boolean reduceStock(int qty) {
     if (stock >= qty) 
     {
         stock -= qty;
         return true;
     } 
     return false;
 }

 public void increaseStock(int qty)
 {
     stock += qty;
 }

 public int getStock()
 {
     return stock;
 }

 public String getName() 
 {
     return name;
 }
}

//Product subclasses
class Electronics extends Product 
{
 private String brand;
 private int warranty;
private int warrantyInMonths;

 public Electronics(String id, String name, double price, int stock, String brand, int warranty) {
     super(id, name, price, stock);
     this.brand = brand;
     this.warrantyInMonths = warranty;
 }

 @Override
 public void displayDetails() 
 {
     System.out.println("Electronics: " + name + "          Brand: " + brand +
             "  Warranty:" +warrantyInMonths + " months   Price: ₹" + price + "   Stock: " + stock);
 }
}

class Clothing extends Product 
{
 private String size, fabric;

 public Clothing(String id, String name, double price, int stock, String size, String fabric) {
     super(id, name, price, stock);
     this.size = size;
     this.fabric = fabric;
 }

 @Override
 public void displayDetails() 
 {
     System.out.println("Clothing: " + name + "   Size: " + size + "    Fabric: " + fabric + "    Price: ₹" + price + "    Stock: " + stock);
 }
}

class Book extends Product {
 private String author;

 public Book(String id, String name, double price, int stock, String author)
 {
     super(id, name, price, stock);
     this.author = author;
 }

 @Override
 public void displayDetails()
 {
     System.out.println("Book: " + name + "   Author: " + author +  "Price: ₹" + price);
 }
}

class Furniture extends Product
{
 private String material;

 public Furniture(String id, String name, double price, int stock, String material) 
 {
     super(id, name, price, stock);
     this.material = material;
 }

 @Override
 public void displayDetails()
 {
     System.out.println("Furniture: " + name + " Material: " + material +
             "  Price: ₹" + price + "  Stock: " + stock);
 }
}

//Functional interface
@FunctionalInterface
interface Discountable 
{
 double applyDiscount(double price);
}

//Abstract Payment class
abstract class Payment
{
 protected double amount;

 public Payment(double amount)
 {
     this.amount = amount;
 }

 public abstract void processPayment();
}

//UPI Payment
class UpiPayment extends Payment {
 private String upiId;

 public UpiPayment(double amount, String upiId) {
     super(amount);
     this.upiId = upiId;
 }

 @Override
 public void processPayment()
 {
     System.out.println("Paid ₹" + amount + " via UPI: " + upiId);
 }
}

//Card Payment
class CardPayment extends Payment 
{
 private String cardNumber;

 public CardPayment(double amount, String cardNumber)
 {
     super(amount);
     this.cardNumber = cardNumber;
 }

 @Override
 public void processPayment() 
 {
     System.out.println("Paid ₹" + amount + " using Card ending with: " +
             cardNumber.substring(cardNumber.length() - 4));
 }
}

//✅ New: Cash On Delivery
class CashOnDelivery extends Payment {
 public CashOnDelivery(double amount) {
     super(amount);
 }

 @Override
 public void processPayment() {
     System.out.println("Cash on Delivery: ₹" + amount + " to be paid at delivery.");
 }
}

//Customer class
class Customer
{
 private String name, email;

 public Customer(String name, String email)
 {
     this.name = name;
     this.email = email;
 }

 public void displayCustomer() 
 {
     System.out.println("Customer: " + name + "  Email: " + email);
 }

 public String getName() {
     return name;
 }
}

//Order class
class Order {
 enum Status { PLACED, CANCELLED }//

 private String id;
 private Customer customer;
 private List<Product> products;
 private double totalAmount;
 private Status status;

 public Order(String id, Customer customer, List<Product> products) {
     this.id = id;
     this.customer = customer;
     this.products = new ArrayList<>(products);
     this.totalAmount = calculateTotal();
     this.status = Status.PLACED;
 }

 private double calculateTotal() {
     return products.stream().mapToDouble(Product::getPrice).sum();
 }

 public boolean placeOrder(Payment payment, Discountable discount) {
     for (Product p : products) {
         if (!p.reduceStock(1)) {
             System.out.println("Out of stock for: " + p.getName());
             return false;
         }
     }

     customer.displayCustomer();
     products.forEach(Product::displayDetails);
     double discounted = discount.applyDiscount(totalAmount);
     System.out.println("Total after discount: ₹" + discounted);
     payment.amount = discounted;
     payment.processPayment();
     this.status = Status.PLACED;
     return true;
 }

 public void cancelOrder() {
     if (status == Status.PLACED) {
         products.forEach(p -> p.increaseStock(1));
         status = Status.CANCELLED;
         System.out.println("Order " + id + " cancelled. Stock restored.");
     } else {
         System.out.println("Order already cancelled.");
     }
 }

 public Status getStatus() {
     return status;
 }

 public String getId() {
     return id;
 }
}

//Main Application
public class EcommersApp {
 public static void main(String[] args) {
     // Products
     Product phone = new Electronics("HD34", "IQOO", 24000, 10, "VIVO", 12);
     Product dress = new Clothing("C202", "BIBA", 1500, 20, "L", "Cotton");
     Product book = new Book("B333", "CORE Java", 1000, 15, "Joshua Bloch");
     Product chair = new Furniture("F404", "Office-Chair", 5999, 5, "Wood");

     // Customer
     Customer customer = new Customer("Hemasrinivas", "hemasrinivas@example.com");

     // Order
     List<Product> productsInOrder = Arrays.asList(phone,dress, book, chair);
     Order order = new Order("ORDER01", customer, productsInOrder);

     // Discount using Lambda (10%)
     Discountable discount = price -> price * 0.9;

     // Choose Payment Method (COD here)
     Payment payment = new CashOnDelivery(0); // amount set inside placeOrder

     order.placeOrder(payment, discount);

     System.out.println("\n-- Cancelling Order --");
     order.cancelOrder();
 }
}

