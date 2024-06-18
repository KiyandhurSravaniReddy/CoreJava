package Collections;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack <String>s=new Stack<>();
		s.add(null);
		s.push("white");
		s.push("red");
		System.out.println("s= "+s);
		String pop=s.pop();
		System.out.println(pop);
		System.out.println("s= "+s);
		String peek=s.peek();
		System.out.println("peek= "+peek);
		System.out.println("s= "+s);
		System.out.println(s.search("white"));

	}

}
