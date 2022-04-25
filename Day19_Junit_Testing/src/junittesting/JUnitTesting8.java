package junittesting;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnitTesting8 {
	@BeforeAll   
	static void display()
	{
		System.out.println("Sunil");
	}
	@Test
	void display1()
	{
		System.out.println("Sandeep");
	}
}
