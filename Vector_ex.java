package Collections;

import java.util.Arrays;
import java.util.*;

public class Vector_ex {

	public static void main(String[] args) {
		//creation of object
		Object []arr=new Object[] {12,45,67,98,null,12,9};
		Vector v=new Vector(Arrays.asList(arr));
		//adding of objects
//		v.add(34);
//		v.add(56);
//		v.add(null);
//		v.add(34);
//		v.add(9);
//		v.add(31);
		//Retrieval
		System.out.println("v= "+v);
		//verifying
		boolean stats=v.contains(9);
		System.out.println("STATUS= "+stats);
		//DELETING
//	     v.remove(31);
//		System.out.println("remove= "+v);
		//update of elements in a list
		 v.set(4, 43);
		System.out.println("update = "+v);
		System.out.println("total= "+v);
		System.out.println("size= "+v.size());
		System.out.println("capacity= "+v.capacity());

	}

}
// its synchronized & thread safe
// its legacy collection
//its good for multi threaading data is increased exponentiually