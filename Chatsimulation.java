package Javafundamentals;
	class Chat 
	{ 
	    boolean flag = true; 
	    synchronized void sayHi(String msg) { 
	        while(!flag)
	        { 
	            try {
	            	wait();
	            	} 
	            catch(Exception e) {} 
	        } 
	        System.out.println("Hi: " + msg); 
	        flag = false; 
	        notify(); 
	    } 
	 
	    synchronized void sayHello(String msg) { 
	        while(flag) 
	        { 
	            try { wait(); 
	            } catch(Exception e) {} 
	        } 
	        System.out.println("Hello: " + msg); 
	        flag = true; 
	        notify(); 
	    } 
	}
	public class Chatsimulation 
	{
		public static void main(String[] args)
		{ 
		
		Chat obj=new Chat();
		new Thread(() -> { 
			obj.sayHi("How are you?"); 
			obj.sayHi("What’s up?"); 
			}).start(); 
			new Thread(() -> { 
			obj.sayHello("I’m good!"); 
			obj.sayHello("Working on Java."); 
			}).start(); 
			} 
			} 