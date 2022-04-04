package decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int A	=sc.nextInt();
		switch(A)
		{
			case 1:
				System.out.println("Sunil");
			case 2:
				System.out.println("Hello");
				break;
			case 3:
				System.out.println("Sandeep");
				break;
			case 4:
				System.out.println("Renu");
				break;
			default:
				System.out.print("Invalid data");
sc.close();		}
	}

}
