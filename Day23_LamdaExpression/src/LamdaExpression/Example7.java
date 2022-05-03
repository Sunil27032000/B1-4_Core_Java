package LamdaExpression;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Runnable R1=new Runnable()
		{
			 @Override
			 public void run()
			 {
				 System.out.println("Class Name is: Lambda7");
			 }
		};*/
		
		//thread example using lambda expression
		
		Runnable R1=()->
		{
			System.out.println("Class Name is: Lambda7");
		};
		Thread t=new Thread(R1);
		t.start();
	}

}
