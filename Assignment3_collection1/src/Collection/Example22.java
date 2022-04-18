package Collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Example22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer,String> st=new TreeMap<Integer,String>();
		st.put(3, "three");
		st.put(2, "two");
		st.put(4, "four");
		System.out.println(st);
		System.out.println(st.firstEntry());
		System.out.println(st.lastEntry());

	}

}
