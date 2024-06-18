package Collections;

import java.util.ArrayList;

public class ArrayList_ex {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("abc");
		al.add("xyz");
		al.add("54");
		System.out.println("al= "+al);
		al.add("ikjh");
		System.out.println("al= "+al);
		al.set(2, null);
		System.out.println("set= "+al);
		al.remove(3);
		System.out.println("remove= "+al);
		for(String s:al) {
			System.out.println(s);
		}

	}

}
