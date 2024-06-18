package Collections;

import java.util.PriorityQueue;

public class PriorityQueue_ex {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
//		pq.add("srh");
//		pq.add("rcb");
//		pq.add("csk");
//		pq.add("kkr");
//		pq.add("mumbai");
		pq.add(10);
		pq.add(3);
		pq.add(6);
		pq.add(7);
		pq.add(1);
		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println("peek - it will display the first first element= "+pq.peek());
		System.out.println("poll- it will del first- element= "+pq.poll());
		System.out.println("offer="+pq.offer(2));
		System.out.println(pq);

	}

}
