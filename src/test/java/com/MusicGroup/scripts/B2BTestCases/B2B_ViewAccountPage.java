/*==============================================================================================================================
 File Name    : B2B_ViewAccountPage.java
 ClassName    : B2B_ViewAccountPage
 Summary      : Contains automation scripts for B2B_ViewAccountPage store.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_ViewAccountPage_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;
import test.java.com.MusicGroup.util.DriverTestCase.LoginWindow;

public class B2B_ViewAccountPage extends DriverTestCase
{
	@Test
	public void B2BViewAccountPage() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_ViewAccountPage_Helper = new B2B_ViewAccountPage_Helper(driver);
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
			String vSpace1Height= propertyReader.readApplicationFile("vSpace1Hieght_B2BViewAccountPage");
			String TextSpace1Height= propertyReader.readApplicationFile("TextSpace1Height_B2BViewAccountPage");
			String Textspace3Height= propertyReader.readApplicationFile("Textspace3Height_B2BViewAccountPage");
			String Width= propertyReader.readApplicationFile("Width_B2BViewAccountPage");
			String Gutter16Width= propertyReader.readApplicationFile("Gutter16Width_B2BViewAccountPage");
			String TextSpace17Width= propertyReader.readApplicationFile("TextSpace17Width_B2BViewAccountPage");
			String Gutter8Width= propertyReader.readApplicationFile("Gutter8Width_B2BViewAccountPage");
			String Gutter9Width= propertyReader.readApplicationFile("Gutter9Width_B2BViewAccountPage");
			String Gutter17Width= propertyReader.readApplicationFile("Gutter17Width_B2BViewAccountPage");
			
			
			b2b_ViewAccountPage_Helper.verifyViewAccountPage(vSpace1Height,TextSpace1Height, Textspace3Height, Gutter16Width, Gutter8Width, Gutter17Width,Gutter9Width);
			
			ExecutionLog.Log("Login into application successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("B2B_SearchSuggestion");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("B2B_SearchSuggestion");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}