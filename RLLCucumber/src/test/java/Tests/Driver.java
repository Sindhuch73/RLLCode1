package Tests;


import java.util.UUID;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
public class Driver extends Tools{
	public static Logger logger;
	
	public static  void init() { 
		UUID uuid = UUID.randomUUID();
		logger = Logger.getLogger("SignUp");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
	       driver = new ChromeDriver();
			
			// maximize it
			driver.manage().window().maximize();
			
			// Navigate to http://dbankdemo.com/bank/login
			driver.get("http://dbankdemo.com/bank/login");
	       }
	 }


