package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNGListeners implements ITestListener {
	
	
 
   public void onTeststart (ITestResult result) {
	   
	   System.out.println(" Test started  :"  +result.getName() );
	   
   }
	
  public void onTestsucess (ITestResult result) {
	   
	   System.out.println(" Test success  :"  +result.getName() );
	   
   }
	
  public void onTestfailure (ITestResult result) {
	   
	  System.out.println(" Test failure  :"  +result.getName() );
	   
	   
  }
  
  public void onTestskipped (ITestResult result) {
	   
	  System.out.println(" Test result  :"  +result.getName() );
	   
  }
  
  public void onTestFinish (ITestResult result) {
	   
	  System.out.println(" Test finish :"  +result.getName() );
	   
  }
   
}
