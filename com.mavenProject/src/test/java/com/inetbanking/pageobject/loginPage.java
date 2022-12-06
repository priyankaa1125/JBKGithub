package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage
{
	
WebDriver driver;

public loginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(name="uid")
WebElement txt_username;

@FindBy(name="password")
WebElement txt_password;

@FindBy(name="btnLogin")
WebElement btnLogin;


public void login()
{
	txt_username.sendKeys("mngr26593");
	txt_password.sendKeys("123@123");
	btnLogin.click();
}


}
