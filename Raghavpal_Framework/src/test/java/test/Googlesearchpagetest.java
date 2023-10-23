package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Googlesearchpageobject;

public class Googlesearchpagetest {
	
	private static WebDriver driver= null;

	public static void main(String[] args) throws InterruptedException
	
	{
		Googlesearchtest();
	}

	public static void Googlesearchtest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		  driver.manage().window().maximize();
	      Thread.sleep(3000);
	      
	      Googlesearchpageobject searchpageobject =  new Googlesearchpageobject();
	      
	      driver.get("https://www.google.com/");
	      
	      searchpageobject.settextinsearchbox("A B C D");
	      
	      searchpageobject.Googlesearchbuttonclick();
	      
	      driver.close();
	      
	      
		
	}
	
	
}
