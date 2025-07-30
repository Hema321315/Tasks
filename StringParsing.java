package tasks2;

public class StringParsing {
	public static void main(String[] args) {
	        String intStr = "123";
	        String doubleStr = "45.67";
	        String booleanStr = "true";

	                                                     // Convert strings to primitives
	        int i = Integer.parseInt(intStr);
	        double d = Double.parseDouble(doubleStr);
	        boolean b = Boolean.parseBoolean(booleanStr);

	        // Print the converted values and their types
	        System.out.println("Parsed int: " + i  + " (type: " + ((Object)i).getClass().getSimpleName()+")");
	        System.out.println("Parsed double: " + d + " (type: " + ((Object)d).getClass().getSimpleName()+")");
	        System.out.println("Parsed boolean: " + b + " (type: " + ((Object)b).getClass().getSimpleName()+")");
	    }
	}
