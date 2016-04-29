/*==============================================================================================================================
 File Name    : SHMEP_320.java
 ClassName    : SHMEP_320
 Summary      : Contains automation scripts to verify user is able to click on 'Download menu'.
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

public class SHMEP_320 extends DriverTestCase
{
	@Test
	public void DownloadMenu() throws Exception
	{
		try{
			//Initialize object
			unified_Home_Helper = new Unified_Home_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Verify user redirected to download page.
			unified_Home_Helper.verifyDownloadMenu();
			ExecutionLog.Log("User redirected to download page successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMEP_320");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMEP_320");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
