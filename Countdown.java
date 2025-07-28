package Javafundamentals;

public class Countdown  extends Thread  {
		public void run()
		{ 
		for(int i = 10; i >= 1; i--) 
		{ 
		System.out.println("Countdownis : " + i); 
		try { Thread.sleep(1000);
		} catch(Exception e) {} 
		} 
		System.out.println("Time up"); 
		} 
		public static void main(String[] args) { 
		new Countdown().start(); 
		} 
		}
