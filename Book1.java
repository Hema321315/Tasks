package Tasks;
class Book3 {
	String Title;
	String Author;
	int Price;
}
class Book extends Book3{
	void displayDetails() {
		Title="great";
		Author="Hemasree";
		Price=200;
		System.out.println(Title);
		System.out.println(Author);
		System.out.println(Price);
	}
}
class Book2 extends Book3
{
	void displayDetails2() {
	Title="thereis";
	Author="sisr";
	Price=300;
	System.out.println(Title);
	System.out.println(Author);
	System.out.println(Price);
	}
}
public class Book1 {
	public static void main(String[] args) {
		Book2 obj=new Book2();
		Book obj1=new Book();
		obj1.displayDetails();
		obj.displayDetails2();
		
	}

}
