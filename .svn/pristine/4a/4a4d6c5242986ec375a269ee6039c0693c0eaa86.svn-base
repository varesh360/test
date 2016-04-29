/*==============================================================================================================================
 File Name    : SHMEP_328.java
 ClassName    : SHMEP_328
 Summary      : Contains automation scripts to verify footer component is displayed on the new brand's landing page.
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

public class SHMEP_328 extends DriverTestCase
{
	@Test
	public void verifyFooterSection() throws Exception
	{
		try{
			//Initialize object
			unified_Home_Helper = new Unified_Home_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String Copyright_text = propertyReader.readApplicationFile("Copyright_text");
			
			//Verify footer on brand landing page.
			unified_Home_Helper.verifyBrandLandingFooter(Copyright_text);
			ExecutionLog.Log("footer on brand landing page verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMEP_328");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMEP_328");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
