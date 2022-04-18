package Collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class Example21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<Integer,String> st=new TreeMap<Integer,String>();
		st.put(3, "three");
		st.put(2, "two");
		st.put(4, "four");
		System.out.println(st);
	}

}
