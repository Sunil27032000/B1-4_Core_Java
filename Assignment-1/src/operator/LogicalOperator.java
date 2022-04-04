package operator;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=9,B=12;
		boolean res=(A>B && B<6);
		boolean res1=(A<B || B>6);
		boolean res2=!(A<B);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	}

}
