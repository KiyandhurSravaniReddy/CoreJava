package multithreading;

public class Thread1 extends  Thread{

//	@Override
//	public void run() {
//		for(int i=1;i<=10;i++) {
//			System.out.print(i+"\t");
//		}
//	}
     public void run() {

		 try {
    	 for(int i=1;i<=10;i++) {
    		 if(i==5) {
					Thread.sleep(10000);
				} 
				 System.out.print(i+"\t");
    		 }
    		 }catch (InterruptedException e) {
					e.printStackTrace();
				}
    		 }
    		
    	 
	
	
}
