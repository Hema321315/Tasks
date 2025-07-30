package tasks2;

public class Wappertoprimitive {
	public static void main(String[] args) {
	                                                   // Primitive values
		    int ival = 4;
	        double dval = 33.43;
	        char cval = 'A';

	                                                           // Convert primitives to wrappers
	        Integer intWrapper = Integer.valueOf(ival);
	        Double doubleWrapper = Double.valueOf(dval);
	        Character charWrapper = Character.valueOf(cval);

	                                                        // Convert wrappers back to primitives
	        int intPrimitive = intWrapper.intValue();
	        double doublePrimitive = doubleWrapper.doubleValue();
	        char charPrimitive = charWrapper.charValue();
	        System.out.println("Original int: " + ival + ", Wrapped: " + intWrapper + ", Primitive: " + intPrimitive);
	        System.out.println("Original double: " + dval + ", Wrapped: " + doubleWrapper + ", Primitive: " + doublePrimitive);
	        System.out.println("Original char: " + cval + ", Wrapped: " + charWrapper + ", Primitive: " + charPrimitive);
	    }
	}
