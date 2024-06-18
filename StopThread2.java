package multithreading;

public class StopThread2 extends Thread{
	public void run() {
		for(int i=11;i<=20;i++) {
			System.out.println(i);
try {
	if(i==11) {
		currentThread().stop();
	}
}

	catch(Exception e) {
		e.printStackTrace();
	}
}
	}
}
