package multithreading;

public class Executionthread  {

	public static void main(String[] args) {
//		Thread1 t1=new Thread1();
		Thread t1=new Thread();
		t1.start();
//		t.setPriority(4);
		
		Thread2 t2=new Thread2();
		t2.start();
//		t2.setPriority(9);
		Thread3 t3=new Thread3();
		t3.start();
//		t3.setPriority(1);
//		Thread4 t4=new Thread4();
//		t4.start();
//		t4.setPriority(5);
	}

}
