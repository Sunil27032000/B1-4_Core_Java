package Abst1;

public class Example1 {
	Example1()
	{
		System.out.println("Animal is created");
	}
	}
	class Tiger extends Example1
	{
		Tiger(){
		super();
		System.out.println("Tiger is created");
		}
	}
	class Main
	{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Tiger z=new Tiger();
	}

}
