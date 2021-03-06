package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_ForgotMusicId_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;
import test.java.com.MusicGroup.util.DriverTestCase.LoginWindow;

public class B2B_ForgotMusicId extends DriverTestCase
{
	@Test
	public void B2BStoreAccount() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_ForgotMusicId_Helper = new B2B_ForgotMusicId_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			//String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
		//	String password = propertyReader.readApplicationFile("B2BPassword");
			
			System.out.println("opening required website --------"+B2BStore_URL);
			
			//B2B_ChangePassword s = new B2B_ChangePassword();
			//new Thread(s.new LoginWindow()).start();
			
			//Navigate to B2B Store url
			driver.navigate().to(B2BStore_URL);
			ExecutionLog.Log("Navigated to B2B store successfully.");
			
            //Verify Login page after successful login
			
			//b2B_Login_Helper.b2BuserLogin(B2BUser, password);
			//ExecutionLog.Log("Login into application successfully.");
			
			Thread.sleep(10000);
				
				
			//Verify ProductReview page after successful login
			String vSpace1Height= propertyReader.readApplicationFile("vSpace1Height_B2BForgotPassword");
			String TextSpace1Height= propertyReader.readApplicationFile("TextSpace1Height_B2BForgotPassword");
			String TextSpace3Height= propertyReader.readApplicationFile("TextSpace3Height_B2BForgotPassword");
			String Gutter16Width= propertyReader.readApplicationFile("Gutter16Width_B2BForgotPassword");
			String Width= propertyReader.readApplicationFile("Width_B2BForgotPassword");
			String Gutter2Width= propertyReader.readApplicationFile("Gutter2Width_B2BForgotPassword");
			String textSpace10Height= propertyReader.readApplicationFile("textSpace10Height_B2BForgotPassword");
			String gap17width= propertyReader.readApplicationFile("gap17width_B2BForgotPassword");
			
			b2b_ForgotMusicId_Helper.verifyForgotMusicID(vSpace1Height,TextSpace1Height,TextSpace3Height,Gutter16Width,Width,Gutter2Width,textSpace10Height,gap17width);
			
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