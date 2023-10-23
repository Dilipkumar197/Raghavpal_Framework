package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumwaitdemo {

	
	public static void main(String[] args) throws InterruptedException {
		
		seleniumwait();
	}
	public static void seleniumwait() throws InterruptedException 
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
	      Thread.sleep(3000);
	      
	      // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      driver.get("https://www.google.com/");
	      
	      driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Automation step by step");
	      
	      driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).sendKeys(Keys.RETURN);
	      
	      // WebDriverWait wait = new WebDriverWait(driver , 10);
	      
	     // WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.id("abc")));
	      
	      driver.findElement(By.name("bcd")).click();
	      
	      driver.close();
	      
	      driver.quit();
	}
}
