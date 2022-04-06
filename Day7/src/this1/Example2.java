package this1;

public class Example2 {
	int a,b;
	void display(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void print()
	{
		System.out.println("Value of a: "+a);
		System.out.println("Value of a: "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e=new Example2();
		e.display(10, 25);
		e.print();

	}

}
