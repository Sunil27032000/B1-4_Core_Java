package collection;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Integer> obj=new ArrayList<>();
		obj.add(10);
		obj.add(20);
		obj.add(40);
		obj.add(70);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains(15));
		
		System.out.println(obj.indexOf(10));
		System.out.println(obj.lastIndexOf(10));
		System.out.println(obj.get(3));
		obj.set(2, 101);
		System.out.println(obj);
		System.out.println(obj.isEmpty());
	}

}
