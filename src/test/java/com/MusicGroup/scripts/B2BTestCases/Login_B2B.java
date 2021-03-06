/*==============================================================================================================================
 File Name    : TC_003_Login_B2B.java
 ClassName    : TC_003_Login_B2B
 Summary      : Contains automation scripts to login into B2B store.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.B2BTestCases;
import java.awt.Robot;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;

import org.openqa.selenium.Alert;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.event.KeyEvent;
public class Login_B2B extends DriverTestCase
{
	@Test
	public void loginB2B() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			
			//Navigate to B2B Store url
			driver.navigate().to(B2BStore_URL);

//profile = Selenium::WebDriver::Firefox::Profile.from_name 'seleniumprofile'
		//	WebDriverWait wait =new WebDriverWait(driver, 10);
			 /* Robot rb = new Robot();
		//	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			System.out.println("alert1"+alert1);
			alert1.sendKeys("surya.kant");
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyPress(KeyEvent.VK_ENTER);
			  Thread.sleep(5000);
			  Alert bb = driver.switchTo().alert();
		         bb.sendKeys("360Logica8932");

		         rb.keyPress(KeyEvent.VK_ENTER);
		         rb.keyPress(KeyEvent.VK_ENTER);*/
			//System.out.println("Wait is"+alert);
			//alert1.authenticateUsing(new UserAndPassword("surya.kant","360Logica8932"));
			ExecutionLog.Log("Navigated to B2B store successfully.");
			
			//Verify landing page after successful login
		b2B_Login_Helper.b2BuserLogin(B2BUser, password);
		ExecutionLog.Log("Login into application successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("TC_003_Login_B2B");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("TC_003_Login_B2B");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}
