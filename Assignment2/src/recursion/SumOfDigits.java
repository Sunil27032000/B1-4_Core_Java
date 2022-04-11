package recursion;

import java.util.Scanner;

public class SumOfDigits 
{
	int sum=0;
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		SumOfDigits d=new SumOfDigits();
		int a=d.add(n);
		System.out.println("Sum:"+a);
		sc.close();
	}
	int add(int n) {
		int sum=n%10;
		if(n==0) {
			return 0;		
		}
		else
		{
			return sum+(n/10);
		}
	}

}
