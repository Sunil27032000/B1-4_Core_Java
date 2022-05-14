package enum1;

enum Bike{
	Pulser,R15,KTM,R3,CBZ
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=Bike.CBZ;
		switch (b) {
			case Pulser:
				System.out.println("PULSER");
				break;
			case R15:
				System.out.println("R15");
				break;
				
			case KTM:
				System.out.println("KTM");
				break;
			case CBZ:
				System.out.println("CBZ");
				break;
				default:
					System.out.println("Invalid Name");
			
		}
		
	}

}
