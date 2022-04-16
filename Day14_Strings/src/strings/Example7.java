package strings;

import java.util.StringTokenizer;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer str=new StringTokenizer("Java:CodeString",":",true);
		while(str.hasMoreTokens())
		System.out.println(str.nextToken());
	}

}
