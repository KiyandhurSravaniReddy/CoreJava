package Collections;

import java.util.ArrayList;

public class ArrayListEX3 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1234);
		al.add(1235);
		al.add(1236);
		System.out.println("length 1= "+al);
		System.out.println("size= "+al.size());
		boolean status=al.isEmpty();
		System.out.println("status= "+status);
		al.add(678);
		System.out.println("length 2= "+al);
		System.out.println("size= "+al.size());
		al.removeAll(al);
		System.out.println("remove= "+al);
		al.add(989);
		System.out.println("length 3= "+al);
		System.out.println("size= "+al.size());
		al.add(0, 11l);
		al.add(1, 222);
		System.out.println("length 4= "+al);
		System.out.println("size= "+al.size());
		boolean status1=al.contains(111);
		System.out.println("al contaions= "+status1);
		boolean status2=al.contains(3.4);
		System.out.println("al contains= "+status2);
	}

}
