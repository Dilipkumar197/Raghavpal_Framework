package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListenersdemo {
	
	@Test
	public void test1() {
		
		System.out.println(" iam inside test1");
	}

	@Test
	public void test2() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver" , "C:\\Program Files\\Chromedriver\\Chromedriver.exe");
		 ChromeOptions co = new  ChromeOptions();
	      co.addArguments("--remote-allow-origins=*");
	      WebDriver driver=new ChromeDriver(co);
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	      
	      driver.get("https://www.google.com/");
	      
	      driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("abcd");
	      
	      driver.findElement(By.xpath("//textarea[@name='c']")).sendKeys("King");
	
	}

	@Test
  public void test3() {
		
		System.out.println(" iam inside test3");
		throw new SkipException(" This test is skipped");
	}
}
