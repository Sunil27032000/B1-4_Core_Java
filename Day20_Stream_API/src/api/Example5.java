package api;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class Example5 {

	@Test
	void display() {
		// TODO Auto-generated method stub
		/*List<String>values=Arrays.asList("Sunil","Sunil","Sunil","Sunil","Sunil");
				Optional<String>var=values.stream().parallel().filter().findAny();
				assertTrue(var.isPresent());
				assertThat(var.get(),anyOf(is("Sunil")));
				values.stream().findAny().equals(values);*/
		
				List<String> values = Arrays.asList("A", "B", "C", "D");

			    Optional<String> var = values.stream().findFirst();

			    assertTrue(var.isPresent());
			    assertThat(var.get(), is("A"));
				System.out.println(values);
			
			}

			private void assertThat(String string, Object object) {
				// TODO Auto-generated method stub
				
			}

			private Object is(String string) {
				// TODO Auto-generated method stub
				return null;
	}

}
