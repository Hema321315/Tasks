package tasks2;

	import java.util.ArrayList;
	import java.util.List;
	public class Autoboxingunboxing {
	public static void main(String[] args) 
	{
	                                                       //  List of Double (wrapper type)
	        List<Double> doubleList = new ArrayList<>();

                                          	        // Add primitive double valuesa autoboxing happens here
	        doubleList.add(20.4);
	        doubleList.add(20.0);
	        doubleList.add(30.5);
	        doubleList.add(50.75);

	                                                  // Sum all elements — unboxing happens when retrieving values
	        double sum = 0.0;
	        for (double val : doubleList)//wwe assign wrapped to primitive
	        {                                       // unboxing from Double to double
	            sum=sum+ val;
	        }

	                                                 // display the average
	        double average = sum / doubleList.size();
	        System.out.println("Sum: " + sum);
	        System.out.println("Average: " + average);
	    }
	}
