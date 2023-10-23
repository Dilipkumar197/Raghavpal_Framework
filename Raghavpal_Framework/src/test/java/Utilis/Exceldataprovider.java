package Utilis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceldataprovider {

	
	    WebDriver driver =null;
		
		@BeforeTest
		public void setuptest() throws InterruptedException
		
		{
			  WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
			   driver.manage().window().maximize();
		       Thread.sleep(3000);
		}
		
		
		
	@Test(dataProvider="test1data")
	public void test1(String username , String password) throws InterruptedException {
		System.out.println( username + "     " + password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//try {
			 ///WebElement first_addbutton = driver.findElement(By.xpath("//input[@name='username']"));
			 
			// driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			 
			 //JavascriptExecutor executor = (JavascriptExecutor) driver;

	   	   	  // executor.executeScript("arguments[0].click();", first_addbutton);

		
		//} 
		//catch(Exception e) {

	   	   	   //System.out.println("Element not clickable");
			
			
		//}  
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		Thread.sleep(2000);
		
	}
	
	
	@DataProvider(name= "test1data" )
	public  Object [][] getData() {
		
		String excelpath="C:\\Users\\Dilipkumar\\OneDrive\\Desktop//Demodata1.xlsx";
		
		Object[][] data= testData(excelpath,"testdata");
		return data;
		
		
	}
	
	public  Object[][] testData(String excelpath , String Sheetname)  {
		
		Excelutils excel= new 	Excelutils(excelpath ,Sheetname);
		
		int rowCount=excel.getRowCount();
		int colCount=excel.getColCount();
		
		
		Object data[][]= new Object [rowCount-1][colCount];
				
				
		for(int i=1;i<rowCount; i++) {
			
			
			for(int j=0;j<rowCount; j++) {
				
				String cellData=excel.getCellDataString(i, j);
				
				//System.out.print(cellData + " ");
				 data [i-1] [j]= cellData;
				
			}
		
			//System.out.println();
			
			
		}
				
				return data;
				
	}

}
