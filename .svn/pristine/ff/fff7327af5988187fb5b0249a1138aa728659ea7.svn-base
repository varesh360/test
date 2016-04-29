package test.java.com.MusicGroup.scripts.B2BTestCases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_ChangePassword_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
//import test.java.com.MusicGroup.scripts.UnifiedTestCases.sample.LoginWindow;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;

public class B2B_ChangePassword extends DriverTestCase
{
	
	@Test
	public void B2BChangePassword() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_ChangePassword_Helper = new B2B_ChangePassword_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			
			System.out.println("opening required website --------"+B2BStore_URL);
			
		//	B2B_ChangePassword s = new B2B_ChangePassword();
			//	new Thread(s.new LoginWindow()).start();
			
			//Navigate to B2B Store url
			driver.get(B2BStore_URL);
			
			System.out.println("Website initiated. sleeping now");
//			Thread.sleep(10000);
//			System.out.println("Starting the thread now");
			
//			new Thread(s.new LoginWindow()).start();
			
			System.out.println("--------"+B2BStore_URL);
			///////////////////////////////////////////////////////////////////////////////////////////
			ExecutionLog.Log("Navigated to B2B store successfully.");
			
				
			//Verify Login page after successful login
					
			b2B_Login_Helper.b2BuserLogin(B2BUser, password);
			ExecutionLog.Log("Login into application successfully.");
			
			Thread.sleep(10000);
				
				
			//Verify ProductReview page after successful login
			String vSpace1Height= propertyReader.readApplicationFile("vSpace1Height_B2BChangePassword");
			String TextSpace1Height= propertyReader.readApplicationFile("TextSpace1Height_B2BChangePassword");
			String TextSpace3Height= propertyReader.readApplicationFile("TextSpace3Height_B2BChangePassword");
			String Gutter16Width= propertyReader.readApplicationFile("Gutter16Width_B2BChangePassword");
			String Width= propertyReader.readApplicationFile("Width_B2BInActiveAccount");
			String vSpace9Height= propertyReader.readApplicationFile("vSpace9Height_B2BInActiveAccount");
			String Gutter2Width= propertyReader.readApplicationFile("Gutter2Width_B2BInActiveAccount");
			String Gap17Width= propertyReader.readApplicationFile("Gap17Width_B2BInActiveAccount");
			//String gap17width= propertyReader.readApplicationFile("gap17width_B2BForgotPassword");
			b2b_ChangePassword_Helper.verifyChangePasswordPage(vSpace1Height,TextSpace1Height,TextSpace3Height,Gutter16Width,Width,Gutter2Width,vSpace9Height,Gap17Width);
			
			ExecutionLog.Log("Login into application successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("B2B_InActivePage");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("B2B_InActivePage");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}