package tasks2;
import java.util.HashSet;
import java.util.TreeSet;
public class Workingwithsets 
{
	    public static void main(String[] args) 
	    {
	        HashSet<String> items = new HashSet<String>();
	        items.add("Apple");
	        items.add("Banana");
	        items.add("Apple");   // Duplicate
	        items.add("Cherry");

	        System.out.println("HashSet: " + items);
	        TreeSet<Integer> numbers = new TreeSet<Integer>();
            numbers.add(5);
            numbers.add(2);
            numbers.add(8);
            numbers.add(1);
            numbers.add(3);

            System.out.println("Sorted TreeSet: " + numbers);
	    }
	}

