package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_InActiveAccount_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;
import test.java.com.MusicGroup.util.DriverTestCase.LoginWindow;

public class B2B_InActiveAccount extends DriverTestCase
{
	@Test
	public void B2BStoreInActiveAccount() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_InActiveAccount_Helper = new B2B_InActiveAccount_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStoreProduction_URL");
			String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			
			//Navigate to B2B Store url
			//B2B_ChangePassword s = new B2B_ChangePassword();
			//new Thread(s.new LoginWindow()).start();
			driver.navigate().to(B2BStore_URL);
			
			//B2B_ChangePassword s = new B2B_ChangePassword();
		//	new Thread(s.new LoginWindow()).start();
			ExecutionLog.Log("Navigated to B2B store successfully.");
			
            //Verify Login page after successful loginb2BuserLoginInActive
			
			b2B_Login_Helper.b2BuserLoginInActive(B2BUser, password);
			//ExecutionLog.Log("Login into application successfully.");
			
			Thread.sleep(10000);
				
				
			//Verify ProductReview page after successful login
			String vSpace1Height= propertyReader.readApplicationFile("vSpace1Height_B2BInActiveAccount");
			String TextSpace1Height= propertyReader.readApplicationFile("TextSpace1Height_B2BInActiveAccount");
			String TextSpace3Height= propertyReader.readApplicationFile("TextSpace3Height_B2BInActiveAccount");
			String Gutter16Width= propertyReader.readApplicationFile("Gutter16Width_B2BInActivEAccount");
			String Width= propertyReader.readApplicationFile("Width_B2BInActiveAccount");
			String Paragraph1SpaceHeight= propertyReader.readApplicationFile("Paragraph1SpaceHeight_B2BInActiveAccount");
			String TextSpace15Height= propertyReader.readApplicationFile("TextSpace15Height_B2BInActiveAccount");
			String Gutter2Width= propertyReader.readApplicationFile("Gutter2Width_B2BInActiveAccount");
			//String gap17width= propertyReader.readApplicationFile("gap17width_B2BForgotPassword");
			b2b_InActiveAccount_Helper.verifyInActiveAccountPage(vSpace1Height,TextSpace1Height,TextSpace3Height,Gutter16Width,Width,Gutter2Width,Paragraph1SpaceHeight,TextSpace15Height);
			
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