package Collections;

import java.util.HashSet;

public class HahSetex {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("muruga");
		hs.add("muruga");
		hs.add("shiva");
		hs.add("vinayaka");
		hs.add("baba");
		hs.add("venkatesh");
		hs.add("rama");
		hs.add("hanuman");
    	hs.add("krishna");
    	System.out.println(hs);
    	System.out.println(hs.contains("shiva"));
    	System.out.println(hs.hashCode());

	}

}
