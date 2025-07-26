package Tasks;

public class RunnableCounter implements Runnable {
	public void run() {
		for( int i=0;i<=10;i++)
		{
			System.out.println("the number is:"+i);
	}
//		try {
//			Thread.sleep(1000);
//		}
//		catch (InterruptedException e)
//		{
//		System.out.println("there is an interrupt");
//	 }
		}
	public static void main(String[] args) {
		RunnableCounter obj =new RunnableCounter();
		Thread t1=new Thread(obj);
		t1.start();
	}

}
