package multithreading;

public class Thread3 extends Thread{
//	public void run() {
//		for(int i=21;i<=30;i++) {
//			System.out.print(i+"\t");
//		}
//	}
	
	public void run() {
		try {
		for(int i=21;i<30;i++) {
			if(i==29) {
			
					Thread.sleep(10000);
			}
					System.out.println(i+"\t");
		}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
		}
}
