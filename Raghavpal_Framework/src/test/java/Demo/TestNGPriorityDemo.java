package Demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
 
	/*@Test (priority =3)
	public void test1()  {
		
		System.out.println( " iam inside the test1");
	}
	
	@Test(priority =1)
     public  void test2()  {
		
		
		System.out.println( " iam inside the test2");
	}
	
	@Test (priority =2)
     public  void test3()  {
 		
		
		System.out.println( " iam inside the test3");
 	}
 	
	*/
	
	@Test
	public void one()  {
		
		System.out.println( " iam the one");
	}
	
	@Test
     public  void two()  {
		
		
		System.out.println( " iam the two");
	}
	
	@Test 
     public  void three()  {
 		
		
		System.out.println( " iam the three");
 	}
 	
	
}
