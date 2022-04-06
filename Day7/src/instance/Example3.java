package instance;

public class Example3 {
	class Child extends Example3 {

		class Main

		{

		public void main(String[] args)

		{

		Child cobj = new Child();

		if (cobj instanceof Child)

		System.out.println("cobj is instance of Child");

		else

		System.out.println("cobj is NOT instance of Child");

		

		if (cobj instanceof Example3)

		System.out.println("cobj is instance of Parent");

		else

		System.out.println("cobj is NOT instance of Parent");

		}

		}
	}

}
