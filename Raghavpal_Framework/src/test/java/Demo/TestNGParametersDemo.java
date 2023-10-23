package Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNGParametersDemo {
	
	@Test
	@Parameters({"My name"})
	public void test(String name)
	{
		
		System.out.println("name is :"+name);
	}

}
