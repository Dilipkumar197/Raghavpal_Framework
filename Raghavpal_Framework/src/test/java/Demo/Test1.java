package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 {
	
	 WebDriver driver =null;
	 
	  @BeforeTest
	  public void setUp() throws InterruptedException  {
		  
		     WebDriverManager.chromedriver().setup();
			 WebDriver driver = new ChromeDriver();
		      driver.manage().window().maximize();
		      Thread.sleep(3000);
		      
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
		  
	    //ERROR: Caught exception [unknown command []]
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  
		  driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div/header/div/div[2]/ul/li/span/p")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    driver.close();
	  }

	  @AfterTest()
	  public void tearDown() throws Exception {
	    driver.quit();
	   
	  }

	  

	  

	  
	  }
	


