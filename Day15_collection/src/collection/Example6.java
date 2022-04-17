package collection;

import java.util.Vector;

public class Example6 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(0,1);
		v.add(1,2);
		v.add(2,"Technical");
		v.add(3,"Technology");
		v.add(4 ,3);
		System.out.println(v);
	}

}
