package test.java.com.MusicGroup.scripts.B2BTestCases;
import org.testng.annotations.Test;

import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;

import test.java.com.MusicGroup.pagehelper.VerifyB2B_DownloadProductList_Helper;
public class VerifyB2B_DownloadProductList extends DriverTestCase
{
	@Test
	public void CheckoutPage() throws Exception
	{
		try{
			DownloadList_Helper =new VerifyB2B_DownloadProductList_Helper(driver);
ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			String ExpectedResult=propertyReader.readApplicationFile("Image_Status");
			//int id= getRandomInteger(0, 999999);
			String ReferenceID= getRandomInteger();
			//String ReferenceID=propertyReader.readApplicationFile("ReferenceId_checkout");
			String OrderType=propertyReader.readApplicationFile("OrderType");
			String DeliveryMode=propertyReader.readApplicationFile("DeliveryMode");
			String DeliveryAdress=propertyReader.readApplicationFile("DeliveryAddress");
			driver.navigate().to(B2BStore_URL);
			ExecutionLog.Log("Navigated to B2B store successfully.");
			DownloadList_Helper.VerifyCheckout(B2BUser,password,ExpectedResult, ReferenceID, OrderType,DeliveryMode,DeliveryAdress);
		}  
		catch(Error e) 
		{
			captureScreenshot("B2B_ProductDetailPage");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("B2B_ProductDetailPage");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
}
