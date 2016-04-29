/*==============================================================================================================================
 File Name    : SHMEP_322.java
 ClassName    : SHMEP_322
 Summary      : Contains automation scripts to verify user is redirected to community page after clicking on community menu.
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

public class SHMEP_322 extends DriverTestCase
{
	@Test
	public void verifyBrandLogo() throws Exception
	{
		try{
			//Initialize object
			unified_Home_Helper = new Unified_Home_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Verify user is redirected to community page after clicking on community menu.
			unified_Home_Helper.verifyCommunityPage();
			ExecutionLog.Log("User is redirected to community page successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMEP_322");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMEP_322");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
