package Tasks;
 public class MyprinterThread extends Thread
{
	 public void run()
	{ 
		for(int i=1;i<6;)
	{
			System.out.println("Hello From Thread!"+i);
			i++;
	}try 
	{
		Thread.sleep(10000);
		
	}
	catch(InterruptedException e)
	{
		System.out.println("there is an interruot");
	}
	}

 public static void main(String[]args)
 {
	 MyprinterThread obj=new MyprinterThread();
	 obj.start();
	 }
 }
 
 
