/*==============================================================================================================================
 File Name    : TC_004_MG_Home.java
 ClassName    : TC_004_MG_Home
 Summary      : Contains automation scripts to verify MusicGroup home page.
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

public class MG_Home extends DriverTestCase
{
	@Test
	public void verifyMGHome() throws Exception
	{
		try{
			//Initialize object
			unified_Home_Helper = new Unified_Home_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Verify MusicGroup home page
			unified_Home_Helper.verifyMusicGroupHomepage();
			ExecutionLog.Log("Music Group home page verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("TC_004_MG_Home");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("TC_004_MG_Home");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
