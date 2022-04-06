package Abst;
class Example11
{
	void display()
	{
		System.out.println("Hello Students");
	}
}
public class Example3 extends Example11
{
	 
	
	void display()
	{
		
		System.out.println("Welcome to C2TC");
	}

	public static void main(String[] args) 
	{
		Example3 e=new Example3();
		e.display();

	}

}
