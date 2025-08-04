package tasks2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FilesTask12 {
	public static void main(String[] args) {
		        String fileName = "info.txt";
		        try {
		              FileWriter writer = new FileWriter(fileName);   
		            writer.write("Java I/O is powerful!\n");
		            writer.write("Learn Java step-by-step");
		            System.out.println("File written successfully.");
		        } catch (IOException e) {
		            System.out.println("An error occurred while writing to the file.");
		            e.printStackTrace();
		        }
		        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
		            String line;
		            while ((line = reader.readLine()) != null) {
		                System.out.println(line);
		            }
		        } catch (IOException e) {
		            System.out.println("An error occurred while reading the file.");
		            e.printStackTrace();
		        }
	}
}
		
