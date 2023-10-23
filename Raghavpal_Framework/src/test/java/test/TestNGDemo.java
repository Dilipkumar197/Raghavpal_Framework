package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {
	
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
	public void Googlesearch() throws InterruptedException
	
	{
		 //driver.get("https://www.google.com/");
		 
		// driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Automation step by step");
		 
		 // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		  driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div/header/div/div[2]/ul/li/span/p")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    
	}
	
	@AfterTest
	public void teardown()
	
	{
		 
		      
		      driver.close();
		      
		      driver.quit();
	}
     
}
