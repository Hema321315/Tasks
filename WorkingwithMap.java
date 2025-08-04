package tasks2;

import java.util.*;

public class WorkingwithMap {
	    public static void main(String[] args) {
	        HashMap<Integer, String> studentMap = new HashMap<>();
	        studentMap.put(1, "Hema");
	        studentMap.put(2, "Sree");
	        studentMap.put(3, "Chaaram");
	        studentMap.put(4, "Divan");
	        studentMap.put(5, "Evans");

	      //use remove
	        studentMap.remove(3); // Removing 

	        //  entrySet() method used
	        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
	            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
	        }
	        //
	                String input = "hello";
	                HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();

	                for (char c : input.toCharArray())
	                {
	                    freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
	                }

	                System.out.println(freqMap); // Output: {h=1, e=1, l=2, o=1}
	    }
	    
	    
	    }
