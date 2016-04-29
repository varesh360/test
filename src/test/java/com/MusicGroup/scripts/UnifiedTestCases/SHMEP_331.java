/*==============================================================================================================================
 File Name    : SHMEP_331.java
 ClassName    : SHMEP_331
 Summary      : Contains automation scripts to verify user is able to click products on the new brand's landing page.
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

public class SHMEP_331 extends DriverTestCase
{
	@Test
	public void clickOnCommunity() throws Exception
	{
		try{
			//Initialize object
			unified_Home_Helper = new Unified_Home_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String billboardheight = propertyReader.readApplicationFile("BillBoardheight");
			String billboardwidth = propertyReader.readApplicationFile("BillBoardwidth");
			
			//Verify billboard components on brand's landing page.
			unified_Home_Helper.verifybillboardComponent(billboardheight,billboardwidth);
			ExecutionLog.Log("Billboard components verified on brand's landing page successfully");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMEP_331");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMEP_331");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
