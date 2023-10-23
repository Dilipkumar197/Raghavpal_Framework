package Listeners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListenersdemo2 {
	
	@Test
	public void test4() {
		
		System.out.println(" iam inside test4");
	}

	@Test
	public void test5() {
		
		System.out.println(" iam inside test5");
	}

	@Test
  public void test6() {
		
		System.out.println(" iam inside test6");
		throw new SkipException(" This test is skipped");
	}
}
