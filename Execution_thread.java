package multithreading;

public class Execution_thread {

	public static void main(String[] args) {
		Sthread1 s1=new Sthread1();
		Thread t=new Thread(s1);
		t.start();
		t.setPriority(9);
		Sthread2 s2=new Sthread2();
		s2.start();
		t.setPriority(1);
	}

}
