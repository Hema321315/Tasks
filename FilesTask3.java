package tasks2;


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class FilesTask3 {
	    public static void main(String[] args) {
	        String fileName = "info.txt";
	        int wordCount = 10;

	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;

	            while ((line = reader.readLine()) != null) {
	                // Split the line into words using whitespace as delimiter
	                String[] words = line.trim().split("\\s+");
	                
	                // Avoid counting empty lines
	                if (!line.trim().isEmpty()) {
	                    wordCount += words.length;
	                }
	            }

	            System.out.println("Total number of words: " + wordCount);
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file.");
	            e.printStackTrace();
	        }
	    }
	}
