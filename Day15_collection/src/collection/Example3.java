package collection;

import java.util.LinkedList;

public class Example3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		LinkedList obj=new LinkedList <>();
		obj.add(34);
		obj.add(0,"Sunil");
		System.out.println(obj);
		 
		obj.add(42);
		obj.add(389);
		System.out.println(obj);
	
		@SuppressWarnings("rawtypes")
		LinkedList obj1=new LinkedList<>();
		obj1.add(456);
		obj1.add("Sunil");
		System.out.println(obj1);
		
		obj.add("Sandeep");
		obj.add(566);
		obj.add(4789);
		obj.add(7,"sunil");
		System.out.println(obj);
		
	}

}
