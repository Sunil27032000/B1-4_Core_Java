package junittesting;

import org.junit.jupiter.api.Assumptions;

public class JUnitTesting12 {
	void accept()
	{
		System.setProperty("1", "Sunil");
		Assumptions.assumeTrue("Sunil".equals(System.getProperty("1")));
	}
		void accept1()
		{
			System.setProperty("2", "Sandeep");
			Assumptions.assumeFalse("Sandeep".equals(System.getProperty("2")));
			
			 
		}
}
