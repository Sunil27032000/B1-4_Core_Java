package junittesting;

import org.junit.jupiter.api.Assumptions;

public class JUnitTesting11 {
	void accept()
	{
		System.setProperty("1", "Sunil");
		Assumptions.assumeTrue("Sunil".equals(System.getProperty("2")));
		
}
}