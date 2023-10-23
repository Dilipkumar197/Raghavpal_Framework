package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Googlesearchpageobject {
	
	WebDriver driver= null;
	
	By text_box_search= By.xpath("//textarea[@name='q']");
	
	By button_click =By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]");
	
	
	public void Googlesearchpageobject(WebDriver driver) {
		
		this.driver=driver;
		
	}

       public void settextinsearchbox(String text) {
    	   
    	   driver.findElement(text_box_search).sendKeys(text);
	}

       public void Googlesearchbuttonclick() {
    	   
    	   driver.findElement(button_click).sendKeys(Keys.RETURN);
	}
       
}
