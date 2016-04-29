package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_StoreAccountPopup_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;
import test.java.com.MusicGroup.util.DriverTestCase.LoginWindow;

public class B2B_StoreAccountPopup extends DriverTestCase
{
	@Test
	public void B2BStoreAccount() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_StoreAccountPopup_Helper = new B2B_StoreAccountPopup_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			
			//Navigate to B2B Store url

			B2B_ChangePassword s = new B2B_ChangePassword();
			new Thread(s.new LoginWindow()).start();
			driver.navigate().to(B2BStore_URL);
			ExecutionLog.Log("Navigated to B2B store successfully.");
			
            //Verify Login page after successful login
			
			b2B_Login_Helper.b2BuserLogin(B2BUser, password);
			ExecutionLog.Log("Login into application successfully.");
			
			Thread.sleep(10000);
				
				
			//Verify ProductReview page after successful login
			String textSpace3Height= propertyReader.readApplicationFile("textSpace3Height_B2BAccountStore");
			String textSpace5Height= propertyReader.readApplicationFile("textSpace5Height_B2BAccountStore");
			String gutter45width= propertyReader.readApplicationFile("gutter45width_B2BAccountStore");
			String vSpace9Height= propertyReader.readApplicationFile("vSpace9Height_B2BAccountStore");
			
			b2b_StoreAccountPopup_Helper.verifyStoreAccountPage(textSpace3Height,textSpace5Height,gutter45width,vSpace9Height);
			
			ExecutionLog.Log("Login into application successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("B2B_StoreResultPage");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("B2B_StoreResultPage");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}