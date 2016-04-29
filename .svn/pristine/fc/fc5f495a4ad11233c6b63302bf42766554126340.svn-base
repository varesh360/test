/*==============================================================================================================================
 File Name    : SHMEP_325.java
 ClassName    : SHMEP_325
 Summary      : Contains automation scripts to verify user is able to click on community link.
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

public class SHMEP_325 extends DriverTestCase
{
	@Test
	public void clickOnCommunity() throws Exception
	{
		try{
			//Initialize object
			unified_Home_Helper = new Unified_Home_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Verify user is able to click on community link.
			unified_Home_Helper.clickCommunityLink();
			ExecutionLog.Log("Community link is clickage.");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMEP_325");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMEP_325");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
