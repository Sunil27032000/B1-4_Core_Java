package strings;

import java.util.StringTokenizer;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("KGF,Chapter2,Relesing on,14th April 2022",",");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
