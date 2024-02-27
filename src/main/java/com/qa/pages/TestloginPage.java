package com.qa.pages;

import org.testng.annotations.Test;

import com.qa.base.DriverScript;

public class TestloginPage extends DriverScript{
	
	@Test
	public  void gettile()
	{
		Initapplication();
	    homepage hometitle=new homepage();
	    String s1=hometitle.pagetitle();
	    
		System.out.println("print page title" +s1);
		driver.quit();
		
	}
	@Test
	public void sendloginElements()
	{
		Initapplication();
	    homepage hometitle=new homepage();
	    hometitle.loginclick();
	    String s1=hometitle.pagetitle();
		System.out.println("print page title" +s1);
		loginpage login=new loginpage();
		login.enterEmail("selauto1@test.com");
		login.enterPassword("Pass@123");
		login.loginclick();
		login.logout();
		String s2=hometitle.pagetitle();
		System.out.println("print page title" +s2);
		
	}
	
	

}
