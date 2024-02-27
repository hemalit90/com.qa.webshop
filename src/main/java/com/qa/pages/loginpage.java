package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage extends homepage {
	
	@FindBy(id="Email") WebElement EmailTextField;
	@FindBy(id="Password" ) WebElement passwordTextField;
	@FindBy(xpath="//input[@class='button-1 login-button']") WebElement loginField;
	@FindBy(linkText="Forgot password?") WebElement ForgorpasswordlinkText;
	
	
	public loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String username)
	{  
		EmailTextField.sendKeys(username);
		
	}
    public void enterPassword(String password)
    {
    	passwordTextField.sendKeys(password);
    }
    public void loginclick()
    {
    	 loginField.click();
    }
    public boolean Forgotpassword()
    {
    	 return ForgorpasswordlinkText.isDisplayed();
    }
    
	
	
}
