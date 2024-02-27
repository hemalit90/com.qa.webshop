package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {
	/* This global variable is used across this whole project*/
	public static WebDriver  driver;
	Properties prop;
	/* This constructor responsible for loading the properties files */
	
	public DriverScript()
	{
		try
		{
		File file=new File("./src/test/resources/config/config.properties");
	
		FileInputStream fis=new FileInputStream(file);
		
		prop=new Properties();
		
		prop.load(fis);
		}
		catch(Exception e)
		{
		
		System.out.println("unable to load the property files");
		e.printStackTrace();
		
		}
	}
	

	
	public void Initapplication()
	{
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("browser in use" +browser);
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("browser in use" +browser);
			driver=new FirefoxDriver();
			driver.get("https://www.firefox.com/");
		}
		else
		{
			System.out.println("browser in use" +browser);
			driver=new EdgeDriver();
			
		}
			
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		GetUrl();
		
	}
	public void GetUrl()
	{
		 String URL=prop.getProperty("url");
		 driver.get(URL);
	}
  public static void quitdriver()
  {
	  driver.quit();
  }
  }

