package Demo;

import org.testng.annotations.Test;

public class TestNGDependenciesdemo {
	
	
	@Test(dependsOnMethods= {"test2" , "test3" })
	public void Test1()
	{
		System.out.println("Iam inside the test1");
	}

	@Test
	public void Test2()
	{
		System.out.println("Iam inside the test2");
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Iam inside the test3");
	}

}
