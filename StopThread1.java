package multithreading;

public class StopThread1 extends Thread{
	public void run(){
		StopThread2 s2=new StopThread2();
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i==3) {
			s2.stop();
			}
		}
	}
}
