package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.base.DriverScript;

public class homepage extends DriverScript {
	
	@FindBy(linkText="Log in") WebElement loginlinktextfield;
	@FindBy(linkText="Log out") WebElement logoutlinktextfield;
	
	public homepage()
	{
	    PageFactory.initElements(driver, this);
	}
  
	public void loginclick()
	{
		loginlinktextfield.click();
	}
	public String pagetitle()
	{
		return driver.getTitle();
		
		
	}
	public void logout()
	{
		logoutlinktextfield.click();
	}
}
