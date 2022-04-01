package scanner;
import java.util.Scanner;
public class Example1 {
	
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	int age=s.nextInt();
	int Weight=s.nextInt();
	
	if(age>18 && Weight>50) {
		System.out.println(" Eliginle to Donate a blood");
	}
	else {
		System.out.println(" Eliginle to Donate a blood");
	}
	s.close();
	}

}
