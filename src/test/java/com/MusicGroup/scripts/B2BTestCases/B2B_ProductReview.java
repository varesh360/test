/*==============================================================================================================================
 File Name    : B2B_ProductReview.java
 ClassName    : B2B_ProductReview
 Summary      : Contains automation scripts to login into B2B_ProductReview store.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/
package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_ProductReview_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;
import test.java.com.MusicGroup.util.DriverTestCase.LoginWindow;


public class B2B_ProductReview  extends DriverTestCase
{
	@Test
	public void ProductReviewCartB2B() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_ProductReview_Helper = new B2B_ProductReview_Helper(driver);
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
			String VSpace1Height= propertyReader.readApplicationFile("vSpace1Height_B2BProductReview");		
			String vSpace4Height= propertyReader.readApplicationFile("vSpace4Height_B2BProductReview");
			String vSpace14Height= propertyReader.readApplicationFile("vSpace14Height_B2BProductReview");
			String vSpace3Height= propertyReader.readApplicationFile("vSpace3Height_B2BProductReview");
			String vSpace9Height= propertyReader.readApplicationFile("vSpace9Height_B2BProductReview");
			String Gutter86width= propertyReader.readApplicationFile("Gutter86width_B2BProductReview");
			String Gap17Width= propertyReader.readApplicationFile("Gap17Width_B2BProductReview");
			String vSpace12Height= propertyReader.readApplicationFile("vSpace12Height_B2BProductReview");
			String Gutter8Width= propertyReader.readApplicationFile("Gutter8Width_B2BProductReview");
			String vSpace15Height= propertyReader.readApplicationFile("vSpace15Height_B2BProductReview");
			
			b2b_ProductReview_Helper.verifyProductReviewPage(VSpace1Height,vSpace4Height,vSpace14Height,vSpace3Height, vSpace9Height,Gutter86width, Gap17Width, vSpace12Height, Gutter8Width, vSpace15Height);
			
			ExecutionLog.Log("Login into application successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("B2B_ProductReview");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("B2B_ProductReview");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}