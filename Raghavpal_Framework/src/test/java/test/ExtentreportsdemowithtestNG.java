package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentreportsdemowithtestNG {
	
	ExtentSparkReporter htmlreporter;
	
	ExtentReports extent;
	
	WebDriver driver;
	

	@BeforeSuite
	public void setup()
	
	{
		
	 htmlreporter= new ExtentSparkReporter("Extent.html");	
	 extent = new ExtentReports();
	extent.attachReporter(htmlreporter);

	}
	
	@BeforeTest
	public void setupTest()
	
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		  driver.manage().window().maximize();
		
	}

	
     @Test
	public void Test1()
	
	{
    	 ExtentTest test1 = extent.createTest("Google search Test two" , "to validate the google search functionality ");
    	 
    	 test1.log(Status.INFO , "to start the  test case");
    	 
    	 driver.get("https://www.google.com/");
 
    	 test1.pass("succesfully navigated to the google page ");
    	 test1.info(" Test is been  completed ");
    	 test1.fail(MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
    	 test1.addScreenCaptureFromPath("screenshot.png");
 	 	 
	}
     
     @AfterTest
     public void teardownTest()
     
     {
    	 driver.close();
		  
		  driver.quit();
		  
		  System.out.println(" Test is completed ");
     }
     
     
	@AfterSuite
     public void Teardown()
	
	{
		extent.flush();
	}
	
	
}
