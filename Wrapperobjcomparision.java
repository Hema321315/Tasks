package tasks2;

public class Wrapperobjcomparision {
	    private static final Integer autoBoxed2 = null;

		public static void main(String[] args) 
	    {
	                                           //  autoboxing
	        Integer i1 = 100;
	        Integer i2 = 100;
	        Integer i3 = new Integer(100);
	        System.out.println("i1 == i2: " + (i1 == i2));
	        System.out.println("i1.equals(i2): " + i1.equals(i2)); 

	        System.out.println("i1 == i3: " + (i1 == i3));
	        System.out.println("i1.equals(i3): " + i1.equals(i3));
	    }
	}
