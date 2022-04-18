package Collection;

import java.util.LinkedHashSet;

public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> s=new LinkedHashSet<String>();
		s.add("hashtable");
		s.add("Queue");
		s.add("List");
		System.out.println(s);
		Object[] arr=s.toArray();
		for(int j=0;j<arr.length;j++)
			System.out.println(arr[j]);
	}

}
