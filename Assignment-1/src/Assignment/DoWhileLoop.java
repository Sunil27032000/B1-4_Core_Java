package Assignment;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		do
		{
			System.out.println("x:" +x);
			x++;
		}
		while(x<40);
		sc.close();

	}

}
