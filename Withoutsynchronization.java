package Tasks;

public class Withoutsynchronization {
	    static int counter = 0; 

	    static class CounterThread extends Thread
	    {
	        public void run()
	        {
	            for (int i = 0; i < 1000; i++)
	            {
	                counter++;
	            }
	        }
	    }

	    public static void main(String[] args)
	    {
	        CounterThread t1 = new CounterThread();
	        CounterThread t2 = new CounterThread();
	        t1.start();
	        t2.start();
	        try {
	        	t1.join();
	        	t2.join();
	        }catch(Exception e)
	        {
	        	System.out.println("exception errived");
	        }
	        System.out.println("final counter value:"+counter);
	    }
}
