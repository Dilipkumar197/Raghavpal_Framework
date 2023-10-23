package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extentreportsbasicdemo {
	
	private static WebDriver driver=null;

	public static void main(String[] args) {
		
		ExtentSparkReporter htmlreporter= new ExtentSparkReporter("Extentreports.html");
		
	   // create extent reports and attach reporter:
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);

		// to create tests and 
		
		ExtentTest test1 = extent.createTest("Google search Test one" , "to validate the google search functionality check");
		
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  test1.log(Status.INFO , "starting test case");
		  driver.get("https://www.google.com/");
		  
		  test1.pass("navigated to the Google .com page ");
		  
		  driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Automation step by step");
		  test1.pass("Entered the text in the search box ");
			 
		  
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		  test1.pass("clicking the search box button ");
		  driver.close();
		  
		  driver.quit();
		  
		  test1.info(" Test is completed ");
		  
		  // calling flush writes everything to log a file
		  
		  extent.flush();
	
		
	}

}
