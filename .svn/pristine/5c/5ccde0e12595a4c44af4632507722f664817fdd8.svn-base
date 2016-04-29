/*==============================================================================================================================
 File Name    : SHMEP_327.java
 ClassName    : SHMEP_327
 Summary      : Contains automation scripts to verify that user is redirected to category page when click on products menu.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Product_Overview_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class SHMEP_327 extends DriverTestCase
{
	@Test
	public void verifyProductPage() throws Exception
	{
		try{
			//Initialize object
			product_Overview_Helper = new Product_Overview_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Verify category page when click on products link.
			product_Overview_Helper.ReachUptoOverviewPage();
			ExecutionLog.Log("Verify user is redirected to category page successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMEP_327");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMEP_327");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
