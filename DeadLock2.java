package multithreading;

public class DeadLock2 extends Thread{
	public void run() {
		try {
			System.out.println("t2=started");
			Thread.currentThread().wait();
			Thread.currentThread().notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
