package multithreading;

public class DaemonThread {

	public static void main(String[] args) {
		System.out.println("before= "+Thread.currentThread().getName());
		System.out.println("before= "+Thread.currentThread().getPriority());
		Thread.currentThread().setName("sanju");
		Thread.currentThread().setPriority(8);
		System.out.println("after= "+Thread.currentThread().getName());
		System.out.println("after= "+Thread.currentThread().getPriority());
		
	}

}
