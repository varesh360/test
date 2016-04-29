/*==============================================================================================================================
 File Name    : SHMEP_238.java
 ClassName    : SHMEP_238
 Summary      : Contains automation scripts to verify search functionality on home page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;
import test.java.com.MusicGroup.pagehelper.Unified_Home_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class SHMEP_238 extends DriverTestCase
{
	@Test
	public void verifySearch() throws Exception
	{
		try{
			//Initialize object
			unified_Home_Helper = new Unified_Home_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String productName = propertyReader.readApplicationFile("ProductName");
			
			//Verify search functionality on MusicGroup home page.
			unified_Home_Helper.searchandVerifyProduct(productName);
			ExecutionLog.Log("Search functionality verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMEP_238");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMEP_238");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
