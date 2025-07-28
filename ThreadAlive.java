package Tasks;

public class ThreadAlive {
	    public static void main(String[] args) {
	        Thread obj= new Thread(() -> {
	            try {
	                Thread.sleep(500);
	            } catch (InterruptedException e) {
	                System.out.println(e.getMessage());
	            }
	        });

	        System.out.println("Before start: " + obj.isAlive());

	        obj.start();
	        System.out.println("After start: " + obj.isAlive());

	        try {
	            obj.join();
	        } catch (InterruptedException e) {
	        	 System.out.println(e.getMessage());
	        }

	        System.out.println("After join: " + obj.isAlive()); // false
	    }
	}
