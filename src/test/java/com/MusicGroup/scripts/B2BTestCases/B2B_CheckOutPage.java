package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_CheckOutPage_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;
import test.java.com.MusicGroup.util.DriverTestCase.LoginWindow;

public class B2B_CheckOutPage extends DriverTestCase
{
	@Test
	public void ProductReviewCartB2B() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_CheckoutPage_helper = new B2B_CheckOutPage_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			
		//	B2B_ChangePassword s = new B2B_ChangePassword();
			//new Thread(s.new LoginWindow()).start();
			
			//Navigate to B2B Store url
			driver.navigate().to(B2BStore_URL);
			ExecutionLog.Log("Navigated to B2B store successfully.");
		//	B2B_ChangePassword s = new B2B_ChangePassword();
		//	new Thread(s.new LoginWindow()).start();
				
			//Verify Login page after successful login
					
		//	b2B_Login_Helper.b2BuserLogin(B2BUser, password);
			//ExecutionLog.Log("Login into application successfully.");
			
			Thread.sleep(10000);
			
			String quantity = propertyReader.readApplicationFile("quantity");
			String RefNumber = propertyReader.readApplicationFile("refnumber");
			
			//Verify ProductReview page after successful login
			String vSpace1Heighth= propertyReader.readApplicationFile("vSpace1Height_SignInPage");	
			String vSpace4Height= propertyReader.readApplicationFile("vSpace4Height_B2BCheckOutPage");		
			String vSpace12Height= propertyReader.readApplicationFile("vSpace12Height_B2BCheckOutPage");
			String textSpace1Height= propertyReader.readApplicationFile("textSpace1Height_B2BCheckOutPage");
			String gap9width= propertyReader.readApplicationFile("gap9width_B2BCheckOutPage");
			String vSpace10Height= propertyReader.readApplicationFile("vSpace10Height_B2BCheckOutPage");
			
			b2b_CheckoutPage_helper.verifyCheckOutpage(quantity,RefNumber,vSpace1Heighth,vSpace4Height,vSpace12Height,textSpace1Height,gap9width,vSpace10Height);
			
			ExecutionLog.Log("Login into application successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("B2B_OrderDetailPage");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("B2B_OrderDetailPage");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}
