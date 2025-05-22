package com.testcases;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.locaters.TestLocaters;
import com.utility.BaseTest;

public class TestCases extends BaseTest 
{
	 public static JavascriptExecutor js = (JavascriptExecutor) driver;

	 public static void loginApplication(String url) throws InterruptedException
		{
		  try 
			{	
			  driver.get(url);
			   /* =============== IMPLICIT WAIT ============= */
			   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   String Title = driver.getTitle();
			   System.out.println("Title of the Page "+ Title);
			   Reporter.log("page displayed");
			   js.executeScript("window.scrollBy(0,250)");
			   /* ===========  EXPLICIT WAIT ============== */
			   WebElement element = driver.findElement(By.xpath(TestLocaters.elements));
			   //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			   //wait.until(ExpectedConditions.elementToBeClickable(element));
			   element.click();
			   Thread.sleep(3000);
			}
			catch (Exception e) 
			{
			e.printStackTrace();
			Assert.fail("Unable to Login ");
			}	
		}	 
 public  static void textBox() throws InterruptedException
		{
		 /* =============== FLUENT WAIT =============== */
		  try 
			{	
			  Wait<WebDriver> wait = new FluentWait<>(driver)
	                  .withTimeout(Duration.ofSeconds(40))
	                  .pollingEvery(Duration.ofSeconds(3))
	                  .ignoring(TimeoutException.class);
	        try 
	        {
	            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(TestLocaters.text)));
	            element.click();
	            System.out.println("Element clicked successfully!");
	        }
	        catch (TimeoutException e) 
	        {
	            System.out.println("Timed out waiting for element to be clickable..");
	        }
	        
			  WebElement username = driver.findElement(By.id(TestLocaters.username));
			   js.executeScript("arguments[0].scrollIntoView();", username); 
			   username.sendKeys("ABC");
			   Thread.sleep(1000);
			   WebElement email = driver.findElement(By.id(TestLocaters.useremail));
			   /* ===== SEND VALUES USING JAVASCRIPT EXECUTOR ===== */
			   js.executeScript("arguments[0].value='abc@gmail.com';", email);
			   Thread.sleep(1000);
			   WebElement caddress = driver.findElement(By.id(TestLocaters.cadd));
			   js.executeScript("arguments[0].scrollIntoView();", caddress); 
			   caddress.sendKeys("XYZ");
			   Thread.sleep(1000);
			   WebElement paddress = driver.findElement(By.id(TestLocaters.padd));
			   js.executeScript("arguments[0].scrollIntoView();", paddress); 
			   paddress.sendKeys("XYZ");
			   Thread.sleep(1000);
			   WebElement submit = driver.findElement(By.id(TestLocaters.submit));
			   js.executeScript("arguments[0].scrollIntoView();", submit); 
			   submit.click();
			   Thread.sleep(3000);
			}
			catch (Exception e) 
			{
			e.printStackTrace();
			Assert.fail("Unable to enter text in text box ");
			}	
		}
	 
	 public static void dropDown() throws InterruptedException
		{
		  try 
			{
			  WebElement widgets = driver.findElement(By.xpath(TestLocaters.widgets));
			  
			   js.executeScript("arguments[0].scrollIntoView();", widgets); 
			   widgets.click();
			   Thread.sleep(1000);
			   WebElement selectmenu = driver.findElement(By.xpath(TestLocaters.selectmenu));
			   js.executeScript("arguments[0].scrollIntoView();", selectmenu); 
			   selectmenu.click();
			   Thread.sleep(1000);
			   WebElement menu = driver.findElement(By.xpath(TestLocaters.menu));
			   js.executeScript("arguments[0].scrollIntoView();", menu); 
			   Thread.sleep(1000);
			   WebElement value = driver.findElement(By.id(TestLocaters.selectoption));
			   Select values = new Select(value);
			   values.selectByIndex(3);
			   Thread.sleep(1000);
			}
			   catch (Exception e) 
				{
				e.printStackTrace();
				Assert.fail("Unable to select dropdown ");
				}	
		}	

	 public static void checkBox() throws InterruptedException
		{
		  try 
			{
			  WebElement element = driver.findElement(By.xpath(TestLocaters.elements));
			   js.executeScript("arguments[0].scrollIntoView();", element); 
			  element.click();
			   Thread.sleep(1000);
			  WebElement checkbox = driver.findElement(By.xpath(TestLocaters.checkbox));
			   js.executeScript("arguments[0].scrollIntoView();", checkbox); 
			   checkbox.click();
			   Thread.sleep(1000);
			   WebElement toggle = driver.findElement(By.xpath(TestLocaters.toggle));
			   js.executeScript("arguments[0].scrollIntoView();", toggle); 
			   toggle.click();	
			   Thread.sleep(1000);
			   WebElement desktop = driver.findElement(By.xpath(TestLocaters.desktop));
			   js.executeScript("arguments[0].scrollIntoView();", desktop); 
			   desktop.click();
			   Thread.sleep(1000);
			   WebElement documents = driver.findElement(By.xpath(TestLocaters.documents));
			   js.executeScript("arguments[0].scrollIntoView();", documents); 
			   documents.click();
			   Thread.sleep(1000);
			   WebElement downloads = driver.findElement(By.xpath(TestLocaters.downloads));
			   js.executeScript("arguments[0].scrollIntoView();", downloads); 
			   downloads.click();
			   Thread.sleep(1000);
			   downloads.click();
			   Thread.sleep(1000);
			}
			catch (Exception e) 
			{
			e.printStackTrace();
			Assert.fail("Unable to check in checkbox ");
			}	
		}

	 public static void dragAndDrop() throws InterruptedException
		{
		  try 
			{	
			  WebElement interact = driver.findElement(By.xpath(TestLocaters.interaction));
			   js.executeScript("arguments[0].scrollIntoView();", interact); 
			   interact.click();
			   WebElement droppable = driver.findElement(By.xpath(TestLocaters.droppable));
			   js.executeScript("window.scrollBy(0,500)");
			   droppable.isDisplayed();
			   Thread.sleep(5000);
			   droppable.click();
			   WebElement source = driver.findElement(By.id(TestLocaters.drag));
			   js.executeScript("arguments[0].scrollIntoView();", source); 
			   WebElement destination = driver.findElement(By.id(TestLocaters.drop));
			   Actions action = new Actions(driver);
			   action.dragAndDrop(source, destination).build().perform();
			   Thread.sleep(5000);
			}
			catch (Exception e) 
			{
			e.printStackTrace();
			Assert.fail("Unable to do drag and drop");
			}	
		}

	 public static void uploadFile() throws InterruptedException
		{
		  try 
			{
			  WebElement element = driver.findElement(By.xpath(TestLocaters.elements));
			   js.executeScript("arguments[0].scrollIntoView();", element); 
			  element.click();
			   Thread.sleep(1000);
			  WebElement upload = driver.findElement(By.xpath(TestLocaters.uploadFile));
			   js.executeScript("arguments[0].scrollIntoView();", upload); 
			   upload.click();
			   Thread.sleep(1000);
			  WebElement udtitle = driver.findElement(By.xpath(TestLocaters.udtitle));
				js.executeScript("arguments[0].scrollIntoView();", udtitle); 
				Thread.sleep(1000);
		   uploadFileCheck("C:\\Users\\praveen.a09\\Pictures\\Screenshots\\uploadFile.png");
		   uploadFileCheck("C:\\Users\\praveen.a09\\Pictures\\Screenshots\\Book1.xlsx");
		   uploadFileCheck("C:\\Users\\praveen.a09\\Pictures\\Screenshots\\Testfile.txt");
			}
			catch (Exception e) 
			{
			e.printStackTrace();
			Assert.fail("Unable to upload file ");
			}	
		}	 

	 public static void mouseOver() throws InterruptedException
		{
		  try 
			{
			  WebElement widgets = driver.findElement(By.xpath(TestLocaters.widgets));
			   js.executeScript("arguments[0].scrollIntoView();", widgets); 
			   widgets.click();
			   Thread.sleep(1000);
			   WebElement toolTip = driver.findElement(By.xpath(TestLocaters.toolTip));
			   js.executeScript("arguments[0].scrollIntoView();", toolTip); 
			   toolTip.click();
			   Thread.sleep(1000);  
			   WebElement ttbutton = driver.findElement(By.id(TestLocaters.ttbutton));
			   js.executeScript("arguments[0].scrollIntoView();", ttbutton); 
			   Actions action = new Actions(driver);
			   action.moveToElement(ttbutton).perform();
			   String tooltipText = ttbutton.getText(); 
			   System.out.println("Retrieved tooltip text as :"+tooltipText); 
			   Thread.sleep(1000);  
			}
			  catch (Exception e) 
				{
				e.printStackTrace();
				Assert.fail("Unable to do mouse hover ");
				}	
		}

	 
	 public static void frame() throws InterruptedException
		{
		  try 
			{
			  WebElement frame = driver.findElement(By.xpath(TestLocaters.frame));
			   js.executeScript("arguments[0].scrollIntoView();", frame); 
			   frame.click();
			   Thread.sleep(1000); 
			   WebElement nframe = driver.findElement(By.xpath(TestLocaters.nframe));
			   js.executeScript("arguments[0].scrollIntoView();", nframe); 
			   nframe.click();
			   Thread.sleep(1000); 
			   WebElement nsframe = driver.findElement(By.xpath(TestLocaters.nsframe));
			   js.executeScript("arguments[0].scrollIntoView();", nsframe); 
			   Thread.sleep(1000); 
               WebElement frame1=driver.findElement(By.id(TestLocaters.frame1));
               driver.switchTo().frame(frame1);
               WebElement frame1Element= driver.findElement(By.tagName("body"));
               String frame1Text=frame1Element.getText();
               System.out.println("Frame1 is :"+frame1Text);
               driver.switchTo().frame(0);
               WebElement frame2Element= driver.findElement(By.tagName("p"));
               String frame2Text=frame2Element.getText();
               System.out.println("Frame2 is :"+frame2Text);
               Thread.sleep(1000); 
               driver.switchTo().defaultContent();
               Thread.sleep(1000); 
			}
		catch (Exception e) 
		{
		e.printStackTrace();
		Assert.fail("Unable to switch between frames ");
		}	
		}

	 public static void calender() throws InterruptedException
		{
		  try 
			{
			  WebElement widgets = driver.findElement(By.xpath(TestLocaters.widgets));
			   js.executeScript("arguments[0].scrollIntoView();", widgets); 
			   widgets.click();
			   Thread.sleep(1000);
			   WebElement dp = driver.findElement(By.xpath(TestLocaters.dp));
			   js.executeScript("arguments[0].scrollIntoView();", dp); 
			   dp.click();
			   Thread.sleep(1000); 
			   WebElement dptitle = driver.findElement(By.xpath(TestLocaters.dptitle));
			   js.executeScript("arguments[0].scrollIntoView();", dptitle); 
			   Thread.sleep(1000); 
			  driver.findElement(By.id(TestLocaters.datepicker)).click();
			   WebElement month = driver.findElement(By.xpath(TestLocaters.month));
			   js.executeScript("arguments[0].scrollIntoView();", month); 
			   Select months = new Select(month);
			   months.selectByValue("9");
			   Thread.sleep(1000);
			   WebElement year = driver.findElement(By.xpath(TestLocaters.year));
			   Select years = new Select(year);
			   years.selectByValue("1999");
			   Thread.sleep(1000);
			   driver.findElement(By.xpath(TestLocaters.date)).click();
			   Thread.sleep(1000);
			   js.executeScript("arguments[0].scrollIntoView();", dptitle); 
			   Thread.sleep(1000);
			}
		  catch (Exception e) 
			{
			e.printStackTrace();
			Assert.fail("Unable to select date in calender ");			}	
		}
		 
	 public static void doubleClick() throws InterruptedException
		{
		  try 
			{
			  WebElement element = driver.findElement(By.xpath(TestLocaters.elements));
			   js.executeScript("arguments[0].scrollIntoView();", element); 
			  element.click();
			   Thread.sleep(1000);
			  WebElement buttons = driver.findElement(By.xpath(TestLocaters.buttons));
			   js.executeScript("arguments[0].scrollIntoView();", buttons); 
			   buttons.click();
			   Thread.sleep(1000);
			   WebElement dclick = driver.findElement(By.id(TestLocaters.dclick));
			   js.executeScript("arguments[0].scrollIntoView();", dclick); 
			   Actions action = new Actions(driver);
			   action.doubleClick(dclick).perform();
			   Thread.sleep(1000);
			   WebElement dmsg = driver.findElement(By.id(TestLocaters.dmsg));
			   js.executeScript("arguments[0].scrollIntoView();", dmsg); 
			   String dtext = dmsg.getText();
			   System.out.println("msg =  "+dtext);
			   String actualmsg="You have done a double click";
			   if(dtext.equals(actualmsg))
			   {
				   System.out.println("double click is working fine");
			   }
			   else
			   {
				   Assert.fail("dobule click is not working");
			   }
			}
			catch (Exception e) 
			{
			e.printStackTrace();
			Assert.fail("Unable to do double click ");
			}	
		}

	 public static void uploadFileCheck(String filepath) throws InterruptedException
		{
		  try 
			{
			  WebElement uploadFile = driver.findElement(By.id(TestLocaters.ufile));
			  uploadFile.sendKeys(filepath);
				Thread.sleep(1000);
				if(driver.findElement(By.id(TestLocaters.ufilepath)).isDisplayed())
				{
					System.out.println("File is uploaded");
				}
				else
				{
				 Assert.fail("Unable to upload file");
				}
			}
			catch (Exception e) 
			{
			e.printStackTrace();
			Assert.fail("Unable to upload file ");
			}	
		
			}
	 
	 public static void form() throws InterruptedException
		{
		  try 
			{	
			   WebElement forms = driver.findElement(By.xpath(TestLocaters.forms));
			   js.executeScript("arguments[0].scrollIntoView();", forms); 
			   forms.click();
			   Thread.sleep(1000);
			   WebElement pform = driver.findElement(By.xpath(TestLocaters.pform));
			   js.executeScript("arguments[0].scrollIntoView();", pform); 
			   pform.click();
			   Thread.sleep(1000);
			   WebElement username = driver.findElement(By.id(TestLocaters.fname));
			   js.executeScript("arguments[0].value='ABC';", username);
			   WebElement lname = driver.findElement(By.id(TestLocaters.lname));
			   js.executeScript("arguments[0].scrollIntoView();", lname); 
			   lname.sendKeys("DEF");
			   Thread.sleep(1000);
			   driver.findElement(By.id(TestLocaters.useremail)).sendKeys("abc@gmail.com");
			   WebElement gender =driver.findElement(By.xpath(TestLocaters.mgender));
			   js.executeScript("arguments[0].scrollIntoView();", gender); 
			   gender.click();
			   Thread.sleep(1000);
			   driver.findElement(By.id(TestLocaters.userno)).sendKeys("9876543210");
			   driver.findElement(By.id(TestLocaters.dob)).click();
			   WebElement month = driver.findElement(By.xpath(TestLocaters.month));
			   Select months = new Select(month);
			   months.selectByValue("9");
			   Thread.sleep(1000);
			   WebElement year = driver.findElement(By.xpath(TestLocaters.year));
			   Select years = new Select(year);
			   years.selectByValue("1999");
			   Thread.sleep(1000);
			   driver.findElement(By.xpath(TestLocaters.date)).click();
			   WebElement hobby = driver.findElement(By.id(TestLocaters.subject));
			   hobby.isDisplayed();
			   hobby.click();
			   Thread.sleep(1000);
			   driver.findElement(By.xpath(TestLocaters.hobby)).click();
			   driver.findElement(By.xpath(TestLocaters.hobby1)).click();
			   Thread.sleep(1000);
			   driver.findElement(By.xpath(TestLocaters.hobby1)).click();
			   Thread.sleep(1000);
			   WebElement uploadFile = driver.findElement(By.id(TestLocaters.upload));
			   uploadFile.sendKeys("C:\\Users\\praveen.a09\\Pictures\\Screenshots\\uploadFile.png");
			   WebElement address = driver.findElement(By.id(TestLocaters.address));
			   address.isDisplayed();
			   address.sendKeys("123");
			   WebElement states = driver.findElement(By.xpath(TestLocaters.state));
			   js.executeScript("arguments[0].scrollIntoView();", states); 
			   states.isDisplayed();
			   states.click();
			   WebElement statesOption = driver.findElement(By.xpath(TestLocaters.stateOption));
			   statesOption.isDisplayed();
			   statesOption.click();
			   WebElement cities = driver.findElement(By.xpath(TestLocaters.city));
			   js.executeScript("arguments[0].scrollIntoView();", cities); 
			   cities.isDisplayed();
			   cities.click();
			   WebElement cityOption = driver.findElement(By.xpath(TestLocaters.cityOption));
			   cityOption.isDisplayed();
			   cityOption.click();
			   driver.findElement(By.id(TestLocaters.submit)).click();
			   Thread.sleep(1000);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				Assert.fail("Unable to submit form ");
			}	
		   
		}
	 
		 public boolean isFileDownloaded(String downloadPath, String fileName) 
		 {
			  File dir = new File(downloadPath);
			  File[] dirContents = dir.listFiles();

			  for (int i = 0; i < dirContents.length; i++) {
			      if (dirContents[i].getName().equals(fileName)) 
			      {
			          return true;
			      }
			          }
			      return false;
			  }
	 
}
