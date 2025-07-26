package Tasks;

public class Thread1{
	 public static void main(String[] args)
	 {
	        Thread obj = new Thread(() ->
	        {
	            for (int i = 1; i <= 5; i++)
	            {
	                System.out.println("Thread1: " + i);
	                try {
	                    Thread.sleep(1000);
	                    
	                } catch (InterruptedException e)
	                {
	                    System.out.println("Thread1 interrupted.");
	                }
	            }
	        });

	        obj.start();
	        try {
	            obj.join(); // Main thread waits
	        } catch (InterruptedException e) {
	            System.out.println("Main thread interrupted.");
	        }

	        System.out.println("Main thread done.");
	    }
	}
