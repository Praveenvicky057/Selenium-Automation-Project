package com.pages;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testcases.TestCases;
import com.utility.BaseTest;

public class TestPages extends BaseTest

{
	 
	  @Test(groups= {"Functional", "Regression", "Smoke"}, priority = 1)
	  @Parameters({"url"})
	  public void loginApplication(String url) throws InterruptedException 
	  {
		  TestCases.loginApplication(url);
	  }
	
	  @Test(groups= {"Smoke"}, priority = 2 )
	  public void textBox() throws InterruptedException 
	  {
		 TestCases.textBox();
	  }
	  
	  @Test(groups= {"Regression"}, priority = 3 )
	  public void calender() throws InterruptedException 
	  {
		TestCases.calender();
	  }
	  
	  @Test( groups= {"Functional"}, priority = 4 )
	  public void dragAndDrop() throws InterruptedException 
	  {
		  TestCases.dragAndDrop();
	  }
	  
	  @Test( groups= {"Regression"}, priority = 5 )
	  public void checkBox() throws InterruptedException 
	  {
		  TestCases.checkBox();
	  }
	  
	  @Test( groups= {"Smoke"}, priority = 6 )
	  public void mouseover() throws InterruptedException 
	  {
		  TestCases.mouseOver();
	  }
	  
	  @Test( groups= {"Functional"}, priority = 7)
	  public void uploadFile() throws InterruptedException 
	  {
		 TestCases.uploadFile();
	  }
	  
	  @Test( groups= { "Regression"}, priority = 8)
	  public void frame() throws InterruptedException 
	  {
		  TestCases.frame();
	  }
	  
	  @Test(  groups= {"Functional"}, priority = 9)
	  public void dropDown() throws InterruptedException 
	  {
		  TestCases.dropDown();
	  }
	  
	  @Test(groups= {"Smoke"}, priority = 10 )
	  public void doubleClick() throws InterruptedException 
	  {
		 TestCases.doubleClick();
	  }
	  
	  @Test(groups= {"Regression"}, priority = 11)
	  public void form() throws InterruptedException 
	  {
		  TestCases.form();
	  }
	  
	 
	  
	 
}
