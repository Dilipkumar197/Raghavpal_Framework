package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Googlesearchpage;



public class Googlesearchtest {
	
	private static WebDriver driver =null;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		  driver.manage().window().maximize();
	      Thread.sleep(3000);
	      driver.get("https://www.google.com/");
	      
	      Googlesearchpage.textbox_search(driver).sendKeys("Automation step by step");
	      
	      Googlesearchpage.button_search(driver).sendKeys(Keys.RETURN);
	      
           System.out.println(" Test completed succesfully");
	      
	      driver.close();
	      
	}

}
