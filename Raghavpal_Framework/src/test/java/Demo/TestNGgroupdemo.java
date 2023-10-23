package Demo;

import org.testng.annotations.Test;

public class TestNGgroupdemo {
	
	@Test(groups = {"sanity"})
	public void test1()
	
	{
		System.out.println(" This is the test1");
		
	}
	
	

	@Test(groups = {"sanity" , "smoke"})
	public void test2()
	
	{
		System.out.println(" This is the test2");
		
	}

	

	@Test (groups = {"Resgression",})
	public void test3()
	
	{
		System.out.println(" This is the test3");
		
	}

	
	@Test
	public void test4()
	
	{
		System.out.println(" This is the test4");
		
	}

}
