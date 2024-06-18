package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetex1 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
//		ts.add("srava");
		ts.add(123);
		ts.add(67);
		ts.add(1);
//		ts.add(null);
//		ts.add(1);
		System.out.println("ts= "+ts);
		Iterator i=ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("size= "+ts.size());
	}

}
