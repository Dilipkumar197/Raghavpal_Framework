package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		
	 Getproperties(); 

	}

	public static void Getproperties () throws IOException {
	
		try {
			
			Properties prop = new Properties();
			
			String projectpath =System.getProperty("user.dir");
			InputStream input = new FileInputStream( projectpath+"/src/test/java/Config/Config.properties");
			prop.load(input);
			
			String browser =prop.getProperty("browser");
			
			System.out.println("browser");
			
		} 
		
		catch (FileNotFoundException e)
		
		{
			
			e.printStackTrace();
		}
	}
	
}
