package tasks2;
import java.util.ArrayList;
import java.util.Collections;

public class GradesTracker {
	    public static void main(String[] args)
	    {
	        ArrayList<Integer> marks = new ArrayList<>();
	        marks.add(10);
	        marks.add(20);
	        marks.add(30);
	        marks.add(50);
	        marks.add(10);

	        System.out.println("Original marks: " + marks);

	                                                           // Remove the lowest mark
	        Integer minMark = Collections.min(marks);
	        System.out.println("removed min marks is:"+minMark);
	        marks.remove(minMark);

	        System.out.println("After removing lowest mark " + minMark  + marks);

	        //  max and min after the removing
	        Integer maxMark = Collections.max(marks);
	        Integer newMinMark = Collections.min(marks);

	        //  average
	        double sum = 0;
	        for (int avg : marks) {                            // unboxing
	            sum += avg;
	        }
	        double average = sum / marks.size();
	        System.out.println("Maximum mark: " + maxMark);
	        System.out.println("Minimum mark: " + newMinMark);
	        System.out.println("Average mark: " + average);
	    }
	}
