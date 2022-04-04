package looping;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<=N;i++)
		System.out.println("Value of I:" + i);
		sc.close();
	}

}
