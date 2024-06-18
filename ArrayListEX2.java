package Collections;

import java.util.ArrayList;

public class ArrayListEX2 {

	public static void main(String[] args) {
		ArrayList <String>al=new ArrayList<String>();
		al.add("abc");
		al.add(null);
		al.add("xyz");
		al.add("ijk");
		al.add("mno");
		System.out.println("list= "+al);
		System.out.println("size= "+al.size());
	}

}
