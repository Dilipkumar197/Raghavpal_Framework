package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Googlesearchpage {

	private static WebElement element=null;
	
	public static WebElement textbox_search(WebDriver driver) {
		
		element =driver.findElement(By.xpath("//textarea[@name='q']"));
		return element;

	}

	
       public static WebElement button_search(WebDriver driver) {
		
	    element =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]"));
		return element;

	}

}
