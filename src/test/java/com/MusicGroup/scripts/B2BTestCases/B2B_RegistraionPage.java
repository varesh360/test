/*==============================================================================================================================
 File Name    : B2B_RegistrationPage.java
 ClassName    : B2B_RegistrationPage
 Summary      : Contains automation scripts to login into B2B_RegistrationPage store.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_RegistrationPage_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;
import test.java.com.MusicGroup.util.DriverTestCase.LoginWindow;

public class B2B_RegistraionPage extends DriverTestCase
{
	@Test
	public void ProductReviewCartB2B() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_RegistrationPage_Helper = new B2B_RegistrationPage_Helper(driver);
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
			
			
			
			//Verify ProductReview page after successful login
			String VSpace1Height= propertyReader.readApplicationFile("vSpace1Height_B2BRegistrationPage");
			String BodyCopyLeadingHeight= propertyReader.readApplicationFile("BodyCopyLeadingHeight_B2BRegistrationPage");
			String Width= propertyReader.readApplicationFile("Width_B2BRegistrationPage");
			String Gutter4Width= propertyReader.readApplicationFile("Gutter4Width_B2BRegistrationPage");
			String Gutter2Width= propertyReader.readApplicationFile("Gutter2Width_B2BRegistrationPage");
			String Gap1Width= propertyReader.readApplicationFile("Gap1Width_B2BRegistrationPage");
			String Gutter89Width= propertyReader.readApplicationFile("Gutter89Width_B2BRegistrationPage");
			String ParagraphSpace1Height= propertyReader.readApplicationFile("ParagraphSpace1Height_B2BRegistrationPage");
			
			b2b_RegistrationPage_Helper.verifyRegistraionPage(VSpace1Height, BodyCopyLeadingHeight, Width, Gutter4Width, Gutter2Width,Gap1Width, Gutter89Width, ParagraphSpace1Height);
			
			ExecutionLog.Log("Login into application successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("B2B_RegistrationPage");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("B2B_RegistrationPage");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}