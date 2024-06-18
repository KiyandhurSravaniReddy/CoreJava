package multithreading;

public class DeadLockExecution {

	public static void main(String[] args) {
		DeadLock1 d1=new DeadLock1();
		DeadLock2 d2=new DeadLock2();
		d1.start();
		d2.start();
	}

}
