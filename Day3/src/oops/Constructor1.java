package oops;

public class Constructor1 {
	String str;
	int a;
	Constructor1()
	{
		str="Sunil";
		a=2703;
		
	}
	void display()
	{
		System.out.println(str+" "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor1 c=new Constructor1();
		c.display();
	}

}
