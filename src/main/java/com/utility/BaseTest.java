package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class BaseTest 
{
	public static  WebDriver driver;
	
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite()
	{
		try 
		{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praveen.a09\\Documents\\Praveen Kumar A\\Testing\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		}
	
	@BeforeClass(alwaysRun = true)
	public void setUpApplication() 
	{
		try 
		{   
			
			driver  = new ChromeDriver();
			driver.manage().window().maximize();	
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	

	
	
	@AfterSuite(alwaysRun = true)
	public void closeApplication() 
	{
		try 
		{	
		driver.quit();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}	
	}

}
