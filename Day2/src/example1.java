import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter The Value Of A & B");
		int A=Sc.nextInt();
		int B=Sc.nextInt();
		System.out.println("Sum: "+(A+B));
		System.out.println("Sub: "+(A-B));
		System.out.println("Mul: "+(A*B));
		System.out.println("Div: "+(A/B));
		System.out.println("Mod: "+(A%B));
	}

}
