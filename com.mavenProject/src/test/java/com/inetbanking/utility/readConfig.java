package com.inetbanking.utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;


public class readConfig {

	
	Properties pro;
	
	public readConfig() 
	{
		pro= new Properties();
		
		File scr= new File("./Confguration/config.properties");
		try {
		FileInputStream fis= new FileInputStream(scr);
		pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("exception is"+e.getMessage());
		}
		
	}

public String geturl()
{
	String url=pro.getProperty("url");
	return url;
}

public String getusername()
{
	String uname=pro.getProperty("uname");
	return uname;
}

public String getPassword()
{
	String pass=pro.getProperty("pass");
	return pass;
}

public String getBrowser()
{
	String browser=pro.getProperty("browser");
	return browser;
	
}
}


