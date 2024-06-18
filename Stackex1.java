package Collections;

import java.util.Stack;

public class Stackex1 {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add("a");
		s.add(null);
		s.add("a");
		s.add(78);
		System.out.println("s= "+s);
		System.out.println("size= "+s.size());
		s.add("b");
		s.add(4, "c");
		System.out.println("s= "+s);
		System.out.println("size= "+s.size());
		 s.pop();
		System.out.println("li= "+s);
		s.push("z ");
		System.out.println("li= "+s);
	}

}
