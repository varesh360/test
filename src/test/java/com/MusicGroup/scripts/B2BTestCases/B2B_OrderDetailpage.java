package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_OrderDetailPage_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;
import test.java.com.MusicGroup.util.DriverTestCase.LoginWindow;

public class B2B_OrderDetailpage extends DriverTestCase
{
	@Test
	public void ProductReviewCartB2B() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_OrderDetailPage_Helper = new B2B_OrderDetailPage_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			
			//Navigate to B2B Store urlsurya.kant	Wh!rLp0oL
			//B2B_ChangePassword s = new B2B_ChangePassword();
			//new Thread(s.new LoginWindow()).start();
			driver.navigate().to(B2BStore_URL);
			//B2B_ChangePassword s = new B2B_ChangePassword();
			//new Thread(s.new LoginWindow()).start();
			ExecutionLog.Log("Navigated to B2B store successfully.");
			
			//Verify Login page after successful login
					
			b2B_Login_Helper.b2BuserLogin(B2BUser, password);
			ExecutionLog.Log("Login into application successfully.");
			
			Thread.sleep(10000);
			
			//Verify ProductReview page after successful login
			String vSpace1Heighth= propertyReader.readApplicationFile("vSpace1Height_B2BOrderpage");		
			String vSpace12Height= propertyReader.readApplicationFile("vSpace12Height_B2BOrderpage");
			String Gutter16Width= propertyReader.readApplicationFile("Gutter16Width_B2BOrderpage");
			String vSpace9Height= propertyReader.readApplicationFile("vSpace9Height_B2BOrderpage");
			String vSpace15Height= propertyReader.readApplicationFile("vSpace15Height_B2BOrderpage");
			String gap17width= propertyReader.readApplicationFile("gap17width_B2BOrderpage");
			String celldemension53width= propertyReader.readApplicationFile("celldemension53width_B2BOrderpage");
			String celldemension53Height= propertyReader.readApplicationFile("celldemension53Height_B2BOrderpage");
			String celldemension54width= propertyReader.readApplicationFile("celldemension54width_B2BOrderpage");
			String celldemension54Height= propertyReader.readApplicationFile("celldemension54Height_B2BOrderpage");
			String gap36width= propertyReader.readApplicationFile("gap36width_B2BOrderpage");
			String gutter45width= propertyReader.readApplicationFile("gutter45width_B2BOrderpage");
			String vspace16Height= propertyReader.readApplicationFile("vspace16Height_B2BOrderpage");
			String gutter8width= propertyReader.readApplicationFile("gutter8width_B2BOrderpage");
			String gap44width= propertyReader.readApplicationFile("gap44width_B2BOrderpage");
			String vSpace4Height= propertyReader.readApplicationFile("vSpace4Height_B2BOrderpage");
			String vSpace10Height= propertyReader.readApplicationFile("vSpace10Height_B2BOrderpage");
			
			b2b_OrderDetailPage_Helper.verifyproductdetailpage(vSpace1Heighth, vSpace12Height,Gutter16Width,vSpace9Height,vSpace15Height,gap17width,celldemension53width,celldemension53Height,celldemension54width,celldemension54Height,gap36width,gutter45width,vspace16Height,gutter8width,gap44width,vSpace4Height,vSpace10Height);
			
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
