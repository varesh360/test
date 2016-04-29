/*==============================================================================================================================
 File Name    : SHMEP_286.java
 ClassName    : SHMEP_286
 Summary      : Contains automation scripts to verify user is able to apply sort options on search results page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.B2BTestCases;
import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Home_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;

public class SHMEP_286 extends DriverTestCase
{
	@Test
	public void ApplySortingSearch() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2B_Home_Helper = new B2B_Home_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			String B2BUserAllProd = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			
			//Navigate to B2B Store url
			driver.navigate().to(B2BStore_URL);
			ExecutionLog.Log("Navigated to B2B store successfully.");
			
			//Login into Application 
			b2B_Login_Helper.b2BuserLogin(B2BUserAllProd, password);
			
			//Verify Search result section
			b2B_Home_Helper.verifySortingonsearch("test");
			ExecutionLog.Log("Search result section verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMEP_286");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMEP_286");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
