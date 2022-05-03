package LamdaExpression;

import java.util.ArrayList;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList<>();
		obj.add(12);
		obj.add(22);
		obj.add(42);
		System.out.println(obj);
		obj.forEach((n)->
		{
			System.out.println(n);
	});

}
}