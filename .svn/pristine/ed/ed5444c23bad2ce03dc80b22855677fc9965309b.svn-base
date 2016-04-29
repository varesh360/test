package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.pagehelper.VerifyB2B_UploadProductList_Helper;

public class VerifyB2B_UploadProductList extends DriverTestCase
{
	@Test
	public void VerifyProductUploadList() throws Exception
	{
		try{
			UploadList_Helper =new VerifyB2B_UploadProductList_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			String ExpectedResult=propertyReader.readApplicationFile("Image_Status");
			driver.navigate().to(B2BStore_URL);
			ExecutionLog.Log("Navigated to B2B store successfully.");
			UploadList_Helper.VerifyCheckout(B2BUser,password,ExpectedResult);
		}  
		catch(Error e) 
		{
			captureScreenshot("VerifyB2B_UploadProductList");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("VerifyB2B_UploadProductList");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}
