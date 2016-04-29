package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.SHMCP_2054_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class SHMCP_2054 extends DriverTestCase
{
	@Test
	public void verifySHCMP() throws Exception
	{
		try{
			//Initialize object
			shmcp_2054_helper = new SHMCP_2054_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String productName = propertyReader.readApplicationFile("ProductName");
			
			//Verify search functionality on MusicGroup home page.
			shmcp_2054_helper.verifySHMCP2054FeaturePage(productName);
			ExecutionLog.Log("SHMCP Functionality verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("SHMCP_2054");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("SHMCP_2054");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
