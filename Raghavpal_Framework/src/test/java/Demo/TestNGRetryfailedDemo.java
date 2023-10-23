package Demo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGRetryfailedDemo {
 
	
	@Test
	public void test1()
	
	{
		System.out.println("iam inside the test1");
	}
	
	
	@Test
  public void test2()
	
	{
		System.out.println(" iam inside the test2");
		//int i =1/0;
	}
  
	
	@Test
     public void test3()
	
	{
		System.out.println(" iam inside the test3");
		//Assert.assertTrue(false);
	}
}
