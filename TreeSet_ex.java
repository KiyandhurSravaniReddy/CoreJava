package Collections;

import java.util.TreeSet;

public class TreeSet_ex {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(8);
		ts.add(89);
		ts.add(890);
		ts.add(8900);
		ts.add(89000);
		ts.add(890000);
		ts.add(8900000);
		System.out.println(ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.remove(8));
		System.out.println(ts.subSet(8, 890));
		System.out.println(ts.descendingSet());
		System.out.println(ts.isEmpty());
		System.out.println(ts);


	}

}
