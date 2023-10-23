import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserTest {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver" , "C:\\Program Files\\Chromedriver\\Chromedriver.exe");
		 ChromeOptions co = new  ChromeOptions();
	      co.addArguments("--remote-allow-origins=*");
	      WebDriver driver=new ChromeDriver(co);
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      
	      Thread.sleep(4000);
	      
	      driver.findElement(By.xpath("//div[div[label[contains(text(),'Username')]]]/div[2]/input[1]")).sendKeys("Admin");
	      
	      
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	      
	      
	}
	      
}
