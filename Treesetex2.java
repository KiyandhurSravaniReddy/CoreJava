package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetex2 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(30);
		ts.add(2);
		ts.add(2);
		System.out.println("ts= "+ts);
		TreeSet ts1=new TreeSet();
		ts1.add(8);
		ts1.add(7);
		ts1.addAll(ts);
		System.out.println("ts1= "+ts1);
		boolean b=ts.contains(1);
		System.out.println("status= "+b);
		Iterator i=ts1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
