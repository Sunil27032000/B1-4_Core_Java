package this1;

public class Example4 {
	String str;
	Example4()
	{
		str="Sunil";
	}
	Example4 get()
	{
		return this;
	}
	void display()
	{
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example4 c=new Example4();
		//c.display();
		c.get().display();

	}

}
