package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_ex {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("pallavi");
		al.add("gopi");
		al.add("mummy");
		al.add("daddy");
		System.out.println(al);
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			i.remove();
		}
		System.out.println(al);
		
	}

}
