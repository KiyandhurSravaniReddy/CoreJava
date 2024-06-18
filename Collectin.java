package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Collectin {

	public static void main(String[] args) {
		Object [] arr=new Object [] {1,2,4,4};
		ArrayList al=new ArrayList(Arrays.asList(arr));
		al.add("werfc");
		al.add(null);
		al.add(123);
		al.add(123);
		System.out.println("arraylist= "+al);
		LinkedList li=new LinkedList();
		li.add("white");
		li.add("red");
		li.add("orange");
		System.out.println("linkeedlist= "+li);
	    li.addFirst("black");
	    System.out.println(li);
	    li.addAll(al);
	    System.out.println(li);

	}

}
