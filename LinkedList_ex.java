package Collections;

import java.util.*;

public class LinkedList_ex {

	public static void main(String[] args) {
		Deque ll=new LinkedList();
		ll.add(3);
		ll.add(9);
		ll.add(3);
		ll.add(9);
		ll.add(3);
		ll.add(9);
		System.out.println("li= "+ll);
		Collection li=new LinkedList();
		li.add(1);
		li.add(5);
		System.out.println("li= "+li);
		li.addAll(ll);
		System.out.println("li= "+li);
		li.removeAll(li);
		System.out.println("remove= "+li);
		li.contains(1);
		System.out.println("boolean= "+li);
		System.out.println(li);

	
	}

}
