package tasks2;
import java.util.*; 

public class Studentschoolboard
{
	public static void main(String[] args) 
	{ 
	Map<String, List<Integer>> students = new HashMap<>(); 
	students.put("Hema", Arrays.asList(30, 40, 75)); 
	students.put("Bobby", Arrays.asList(30, 55, 90)); 
	students.put("Srinivas", Arrays.asList(58, 72,76)); 
	String topStud = ""; 
	double highestAvg = 0; 
	for (String name : students.keySet())
	{ 
	List<Integer> marks = students.get(name); 
	int sum = 0; 
	for (int mark : marks) sum += mark; 
	double avg = sum / (double) marks.size(); 
	System.out.println(name + " Average: " + avg); 
	if (avg > highestAvg) { 
	highestAvg = avg; 
	topStud= name; 
	} 
	} 
	System.out.println("Top Scorer: " + topStud + " with Avg: " + 
	highestAvg); 
	} 
	}
