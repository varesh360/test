/*==============================================================================================================================
 File Name    : SHMEP_321.java
 ClassName    : SHMEP_321
 Summary      : Contains automation scripts to verify  user is able to see the logo of the new brand on new brand's landing page.
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

public class SHMEP_321 extends DriverTestCase
{
	@Test
	public void verifyBrandLogo() throws Exception
	{
		try{
			//Initialize object
			unified_Home_Helper = new Unified_Home_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Verify brand logo on new brand's landing page.
			unified_Home_Helper.verifyBrandLogo();
			ExecutionLog.Log("Brand logo is verified on new brands landing page successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMEP_321");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMEP_321");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
