package Tasks;
class Overloading {
	int add(int a, int b) { 
		return a + b; 
		} 
  double add(double a, double b) { 
		return a + b; 
		} 
 String add(String a, String b) { 
		return a + b; 
		} 
		} 
		public class Calculator { 
		public static void main(String[] args) { 
		Overloading ov = new Overloading(); 
		System.out.println("int  " + ov.add(2, 3)); 
		System.out.println("Double " + ov.add(2.5, 3.5)); 
		System.out.println("String  " + ov.add("Hello", "World")); 
		} 
		} 