package Collections;

import java.util.Stack;

public class Stack_ex {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add("white");
		s.add("black");
		System.out.println("s= "+s);
		s.contains("mohan");
		System.out.println("s contains= "+s);
		s.set(0, "mohan");
		System.out.println("set= "+s);
		System.out.println(s);
		// 4- lifo-last in first out
		String pr= (String) s.pop();
		System.out.println("delete = "+pr);
		System.out.println("peek= "+s.peek());
		System.out.println("push= "+s.push("red"));
		System.out.println("search= "+s.search("white"));
		System.out.println(s);
		System.out.println("empty= "+s.isEmpty());
		System.out.println(s);
		System.out.println("size= "+s.size());
		System.out.println("capacity= "+s.capacity());


	}

}
