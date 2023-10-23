import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		  driver.manage().window().maximize();
	      Thread.sleep(3000);
	      driver.get("https://www.google.com/");
	      
	      WebElement textbox=driver.findElement(By.xpath("//textarea[@name='q']"));
	      
	      textbox.sendKeys("Automation step by step");
	      
	      driver.findElement(By.xpath("//input[@class='gNO89b']")).sendKeys(Keys.RETURN);
	      
	      System.out.println(" Test completed succesfully");
	      
	      driver.close();
	      
	      // List<WebElement> textbox1=driver.findElements(By.xpath("//textarea"));
	      
	      //int count =textbox1.size();
	      
	      // System.out.println("count of input tags : " +count);
	      
	   

	}

}
