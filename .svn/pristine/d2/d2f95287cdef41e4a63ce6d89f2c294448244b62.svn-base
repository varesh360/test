/*==============================================================================================================================
 File Name    : SHMEP_282.java
 ClassName    : SHMEP_282
 Summary      : Contains automation scripts to verify maximum of five categories are displayed on B2B search results page.
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

public class SHMEP_282 extends DriverTestCase
{
	@Test
	public void verifyCategoryLimitSearch() throws Exception
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
			
			int commonsearch=5;
			//Verify Search result section
			b2B_Home_Helper.verifyCategoryLimitSearch("X",commonsearch);
			ExecutionLog.Log("Search result section verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMEP_282");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMEP_282");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
