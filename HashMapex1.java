package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapex1 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put("ab", 1);
		hm.put("d", 4);
		System.out.println(hm);
		
		Set <String> keys=hm.keySet();
		System.out.println("keys= "+keys);
		
		Collection <Integer> c=hm.values();
		System.out.println(c);
		
		Set  s2=hm.entrySet();
		System.out.println("s2= "+s2);
		
		Iterator i=s2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
