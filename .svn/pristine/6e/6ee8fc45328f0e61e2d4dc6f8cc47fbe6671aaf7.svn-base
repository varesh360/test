/*==============================================================================================================================
 File Name    : SHMEP_319.java
 ClassName    : SHMEP_319
 Summary      : Contains automation scripts to verify user is redirected to new brand page after clicking on image in toggle menu.
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

public class SHMEP_319 extends DriverTestCase
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
			
			//Verify user redirected to new brand page.
			unified_Home_Helper.verifyBrandPage(Copyright_text);
			ExecutionLog.Log("User redirected to new brand page successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMEP_319");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMEP_319");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
