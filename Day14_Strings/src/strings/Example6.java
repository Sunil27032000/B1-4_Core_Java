package strings;

import java.util.StringTokenizer;

public class Example6 {

	public static void main(String[] args) {
		StringTokenizer str=new StringTokenizer("Java:CodeString",":",false);
		while(str.hasMoreTokens())
		System.out.println(str.nextToken());
	}

}
