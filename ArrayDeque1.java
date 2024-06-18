package Collections;
import java.util.*;
public class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("banana");
		ad.add("grape");
		ad.add("pineapple");
		ad.add("cherry");
		ad.add("kiwi");
		ad.offer("mango");
		ad.offerFirst("pear");
		ad.offerLast("sapota");
		System.out.println("ad= "+ad);
		System.out.println(ad.poll());
		System.out.println(ad);

		System.out.println(ad.pollFirst());
		System.out.println(ad);

		System.out.println(ad.pollLast());
		System.out.println(ad);

		System.out.println(ad.peek());
		System.out.println(ad);
		System.out.println(ad.peekFirst());
		System.out.println(ad);

		System.out.println(ad.peekLast());
		System.out.println(ad);
	}

	 
}
