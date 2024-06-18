package multithreading;

public class Sthread2 extends Thread{
	public void run() {
		for(int i=11;i<=20;i++) {
			System.out.print(i+"\t");
		}
	}
}
