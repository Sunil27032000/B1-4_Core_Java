package api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				List<Integer>values=Arrays.asList(11,22,33);
				Optional<Integer>var=values.stream().reduce((a,b)->a+b);
				System.out.println(var);
	}

}
