package multithreading;

public class DeadLock1 extends Thread{
   public void run() {
	   try {
		   System.out.println("t1=thread");
		Thread.currentThread().wait();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   
   }
}
