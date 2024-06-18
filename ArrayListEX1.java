package Collections;

import java.util.ArrayList;

public class ArrayListEX1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("sravani");
		al.add(123);
		al.add(4.5);
		al.add(null);
		al.add("sravani");
		System.out.println("list contains= "+al);
		System.out.println("size= "+al.size());
	}

}
