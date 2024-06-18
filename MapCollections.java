package Collections;

import java.security.KeyStore.Entry;
import java.util.*;

public class MapCollections {

	public static void main(String[] args) {
		//creating the elements
		Map m=new HashMap();
		//adding 
		m.put(101, "white");
		m.put(102, "black");
		m.put(103, "red");
		System.out.println(m);
		
		//Retrieving the data
		Set<Integer> k=m.keySet();
		for(Integer keys:k) {
			System.out.println("fetching key= "+keys);
		}
		System.out.println(m.values());
		
		System.out.println("fetching value= "+m.get(103));
		//update on keys
		m.put(9, "red");
		System.out.println("update key= "+m);

		m.put(9, "pink");
		System.out.println("update = "+m);
		//update on value
		m.put(101,"purple");
		 System.out.println("update value= "+m);
		 //verification on keys
		 boolean b=m.containsKey(101);
		 System.out.println("keys= "+b);
		 boolean b1=m.containsKey(109);
		 System.out.println("keys= "+b1);
		 //verification on values
		 Boolean v=m.containsValue("purple");
		 System.out.println("values= "+v);
		 Boolean v1=m.containsValue("orange");
		 System.out.println("values= "+v1);
		 
		 //delete
		 m.remove(101);
			System.out.println("delete 1= "+m);
			m.remove(9, "pink");
			System.out.println("delete 2= "+m);
			m.replace(102, "simk");
//			System.out.println("replace value= "+m);
//			set <Entry>entries=m.entrySet();
//			for(Entry <Integer,String>entry:entries) {
//				Integer key=entry.getkey();
//				String value=entry.getvalue();
//				System.out.println(key+">>"+value);
			}

	
}
