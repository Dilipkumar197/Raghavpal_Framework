package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo2 {
	
	 WebDriver driver =null;
	
	@BeforeTest
	public void setuptest() throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		  driver.manage().window().maximize();
	      Thread.sleep(3000);
	}
	
	
	@Test
	public void Googlesearch2()
	
	{
		 driver.get("https://www.google.com/");
		 
		 driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Automation step by step");
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		 
	}
	
	@Test
	public void Googlesearch3()
	
	{
		 driver.get("https://www.google.com/");
		 
		 driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Automation step by step");
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		 
	}
	
	@AfterTest
	public void teardown()
	
	{
		   System.out.println(" Test completed succesfully");
		      
		      driver.close();
		      
		      driver.quit();
	}

}
