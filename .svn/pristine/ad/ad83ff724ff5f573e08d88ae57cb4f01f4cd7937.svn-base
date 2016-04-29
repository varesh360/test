/*==============================================================================================================================
 File Name    : SHMEP_323.java
 ClassName    : SHMEP_323
 Summary      : Contains automation scripts to verify the Brand header is displayed on the new brand's landing page.
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

public class SHMEP_323 extends DriverTestCase
{
	@Test
	public void verifyFooterSection() throws Exception
	{
		try{
			//Initialize object
			unified_Home_Helper = new Unified_Home_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Verify footer on brand landing page.
			unified_Home_Helper.verifyBrandLandingHeader();
			ExecutionLog.Log("footer on brand landing page verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMEP_323");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMEP_323");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
