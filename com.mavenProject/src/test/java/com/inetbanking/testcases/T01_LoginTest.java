package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.loginPage;

public class T01_LoginTest extends BaseClass{

	loginPage lp;
		@Test
		
		public void loginTest01()
		{
			driver.get(url);
			logger.info("Guru99 is opening");
			
			 lp= new loginPage(driver);
			
			lp.login();
			logger.info("Successfully logged into Guru 99");
			
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
			logger.info("Test case is successful");	
			}
				else
				{
					Assert.assertTrue(false);
					logger.info("TestCase is failed");
			}}
		
		
		
		}


