package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapex2 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("sravs", 1);	
		hm.put("mohan", 2);
		hm.put("loki", 3);
		System.out.println("hm= "+hm);
		Set keys=hm.keySet();
		System.out.println("keys= "+keys);
		Collection c=hm.values();
		System.out.println(c);
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
