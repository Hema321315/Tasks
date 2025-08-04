package tasks2;
import java.io.Serializable;
		public class FilesTask5 implements Serializable {
	    private static final long serialVersionUID = 1L;

	    String name;
	    int rollNo;
	    int marks;

	    public FilesTask5 (String name, int rollNo, int marks) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.marks = marks;
	    }

	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Marks: " + marks);
	    }
	}
