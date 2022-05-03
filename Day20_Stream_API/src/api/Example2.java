package api;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] arr=new Integer[] {11,22,33};
		List<Integer>values=Arrays.asList(11,22,33,5,60,25,9,10,11,12,13);
		values.stream().filter(i->i<30).forEach(i->System.out.println(i));
		values.stream().sorted().forEach(i->System.out.println(i));
		values.stream().limit(5).forEach(i->System.out.println("HE IS THE BIGGEST CRIMINAL,THIS IS THE NATIONAL ISSUE" +i));
		//Stream<Integer>obj=Arrays.stream(arr)
		//System.out.println(var);
	}

}
