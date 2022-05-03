package annotation;

class Parent1
{
	@Deprecated
	void print()
	{
		System.out.println("Here comes");
	}
	@Deprecated
	void print1()
	{
		System.out.println("Sunil");
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p=new Parent1();
		p.print();
		p.print1();
	}

}
