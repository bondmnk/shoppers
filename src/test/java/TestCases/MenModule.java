package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.ListnersImplementation.class)
public class MenModule {
	@Test
	public void Tc_Men_001Test() throws Throwable {
		
		System.out.println("Test case men- 1");
	}
	
}
