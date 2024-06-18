package multithreading;

public class Thread2 extends Thread{

//	public void run() {
//		for(int i=11;i<=20;i++) {
//			System.out.print(i+"\t");
//		}
//	

	public void run() {
		try {
		for(int i=11;i<=20;i++) {
			if(i==15) {
				
					Thread.sleep(10000);
			}
					System.out.print(i+"\t");
		}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
	}
}
