package Collections;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(12);
		v.add(00);
		v.add(null);
		v.add(12);
		System.out.println("vector= "+v);
		v.remove(0);
		System.out.println("remove= "+v);
		v.add(0, 89);
		System.out.println("adding= "+v);
		Vector <String>v1=new Vector<String>();
		v1.add("abc");
		v1.add("xyz");
		System.out.println("v1= "+v1);
		v.addAll(v1);
		System.out.println("adding addall= "+v);
		v.indexOf(3);
		System.out.println("v1 index= "+v);
	}

}
