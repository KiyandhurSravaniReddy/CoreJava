package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetex4 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(1);
		ts.add(6);
		ts.add(9);
		ts.add(2);
		System.out.println("ts= "+ts);
		Iterator i=ts.iterator();
		while(i.hasNext()) {
			if((int)i.next()%2!=0) {
				i.remove();
			}
			System.out.println(i);
		}
		Iterator i1=ts.iterator();
		while(i.hasNext()) {
				System.out.println(i1.next());
		}
			
	}

}
