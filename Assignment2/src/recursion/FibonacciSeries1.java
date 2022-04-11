package recursion;

import java.util.Scanner;

public class FibonacciSeries1 
{
	public static void fibonacci(int n,int a, int b, int c, int count)
	{
		if (count ==n)
			return;
		else {
			count++;
			System.out.print(a+",");
			c=b;
			b=a;
			a=b+c;
			fibonacci(n,a,b,c,count);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt(),a=1,b=0,c=0,count=1;
		System.out.print("0,");
		fibonacci(n,a,b,c,count);
		sc.close();

	}

}
