package com.inetbanking.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utility.readConfig;



public class BaseClass {
	
	readConfig readconfig= new readConfig();

	public String url= readconfig.geturl();
	public String uname=readconfig.getusername();
	public String pass=readconfig.getPassword();
	public String browser=readconfig.getBrowser();
	
	public static WebDriver driver;
	
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	
	public void setUp(String browser)
	{
		logger= Logger.getLogger("BaseClass");
		PropertyConfigurator.configure("log4j.properties");
		
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriverlatest.exe");
		driver= new ChromeDriver();
		}
		
	
		
	}
	

 @AfterClass
 
 public void tearDown() { driver.quit(); }}

