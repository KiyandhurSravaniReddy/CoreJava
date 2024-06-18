package Collections;

import java.util.LinkedList;

public class LinkedListex2 {

	public static void main(String[] args) {
			 LinkedList<String> l=new LinkedList<String>();
			 l.add("sravs");
	
			 System.out.println("l= "+l);
			 System.out.println("size= "+l.size());
			 LinkedList <String>li=new LinkedList<String>();
	
			 li.add(null);
			 li.add("sweety");
			 System.out.println("li= "+li);
			 System.out.println("size= "+li.size());
			 LinkedList <String>li1=new LinkedList<String>();
			 li1.addAll(li);
			 li1.addAll(l);
			 System.out.println(li1);
			 System.out.println("size= "+li1.size());
			 LinkedList <String>li2=new LinkedList<String>();
			 li2.add("reddy");
			 li2.add("mohan");
			 li2.add("loki");
			 li2.addAll(li1);
			 System.out.println(li2);
			 System.out.println("size= "+li2.size());

	}

}
