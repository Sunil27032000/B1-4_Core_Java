package decisionmaking;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=30;
		int weight=150;
		if (age>=12)
		{
			if(weight>=40)
			{
				if(weight>=110)
				{
					System.out.println("Eligible for jumping");
				}
				else
				{
					System.out.println("Not eligible for jumping");
				}
			}
				else
				{
					System.out.println("Extra ropes will be added for jumping");
				}
			}
	}

}
