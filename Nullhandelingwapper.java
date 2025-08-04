package tasks2;

public class Nullhandelingwapper {
	public static void main(String[] args)
	{ 
		Double salary = null; 
		try { 
		double net = salary + 1000; // NullPointerException 
		System.out.println("Net salary: " + net); 
		} catch (NullPointerException e)
		{ 
		System.out.println("Salary is null. Using default value."); 
		salary = 0.0; //we used default so we can add
		double net = salary + 1000; 
		System.out.println("Net salary: " + net); 
		} 
		} 
		} 
