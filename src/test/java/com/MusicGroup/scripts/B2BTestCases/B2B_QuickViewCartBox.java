package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_QuickViewCartBox_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;
import test.java.com.MusicGroup.util.DriverTestCase.LoginWindow;

public class B2B_QuickViewCartBox extends DriverTestCase
{
	@Test
	public void B2BQuickViewCart() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_QuickViewCartBox_Helper = new B2B_QuickViewCartBox_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			

			//B2B_ChangePassword s = new B2B_ChangePassword();
			//new Thread(s.new LoginWindow()).start();
			//Navigate to B2B Store url
			driver.navigate().to(B2BStore_URL);
			ExecutionLog.Log("Navigated to B2B store successfully.");
			
            //Verify Login page after successful login
			
			b2B_Login_Helper.b2BuserLogin(B2BUser, password);
			ExecutionLog.Log("Login into application successfully.");
			
			Thread.sleep(10000);
				
				
			//Verify ProductReview page after successful login
			String TextSpace3Height= propertyReader.readApplicationFile("TextSpace3Height_ShoppingCartQuickView");
			String TextSpace5Height= propertyReader.readApplicationFile("TextSpace5Height_ShoppingCartQuickView");
			String FixedBoxImageWidth= propertyReader.readApplicationFile("FixedBoxImageWidth_ShoppingCartQuickView");
			String FixedBoxImageHeight= propertyReader.readApplicationFile("FixedBoxImageHeight_ShoppingCartQuickView");
			String Gutter45Width= propertyReader.readApplicationFile("Gutter45Width_ShoppingCartQuickView");
			String vSpace17Height= propertyReader.readApplicationFile("vSpace17Height_ShoppingCartQuickView");
			String vSpace9Height= propertyReader.readApplicationFile("vSpace9Height_ShoppingCartQuickView");
			String TextSpace4Height= propertyReader.readApplicationFile("TextSpace4Height_ShoppingCartQuickView");
			String TextSpace11Height= propertyReader.readApplicationFile("TextSpace11Height_ShoppingCartQuickView");
			String TextSpace16Height= propertyReader.readApplicationFile("TextSpace16Height_ShoppingCartQuickView");

			b2b_QuickViewCartBox_Helper.verifyQuickViewCart(TextSpace3Height,TextSpace5Height,FixedBoxImageWidth,FixedBoxImageHeight,Gutter45Width,vSpace17Height,vSpace9Height,TextSpace4Height,TextSpace11Height,TextSpace16Height);
			
			ExecutionLog.Log("Login into application successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("B2B_QuickViewCart");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("B2B_QuickViewCart");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}
