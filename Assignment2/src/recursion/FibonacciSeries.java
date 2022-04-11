package recursion;

import java.util.Scanner;

public class FibonacciSeries 
{
	static int fiboncci(int n) {
		if(n==0 ||n==1) {
			return n;
		}
		else {
			return fiboncci(n-2)+fiboncci(n-1);
		}
	}

	public static void main(String[] args) 
	{
		FibonacciSeries obj=new FibonacciSeries();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=0;i<x;i++) 
		System.out.print(obj.fiboncci(i)+",");
		sc.close();
	}

}
