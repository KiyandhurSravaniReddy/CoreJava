package Collections;

import java.util.HashMap;

public class MapCollection {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(0, "f1");
		hm.put(1, "f2");
		hm.put(2, "f3");
		hm.put(5, "f4");
		hm.put(6, "f5");
		hm.put(7, "f6");
		hm.put(8, "f7");
		System.out.println(hm);
		
		System.out.println(hm.containsKey(0));
	
		System.out.println(hm.containsValue("f9"));
		
		System.out.println(hm.get(8));
		
		System.out.println(hm.remove(0));
		
		System.out.println(hm.replace(6, "sap"));
		System.out.println(hm);

	}

}
