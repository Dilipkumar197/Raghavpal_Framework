package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLog4j {
	
	
	private static Logger logger = LogManager.getLogger(DemoLog4j.class);

	public static void main(String[] args) {
		
         System.out.println("\n Hello world.........    \n");
         
         logger.info(" This is info message ");
         logger.fatal(" This is fatal message ");
         logger.warn(" This is Warning message ");
         logger.error(" This is error message ");
         
         
         
         System.out.println(" completed ");
         
	}

}
