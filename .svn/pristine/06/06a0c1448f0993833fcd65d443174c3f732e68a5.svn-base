package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.Unified_OrderSparePartsHelper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;

public class Unified_OrderSpareParts extends DriverTestCase
{
	@Test
	public void UnifiedOrderSpareParts() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			unified_OrderSparePartsHelper = new Unified_OrderSparePartsHelper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
           //Verify Order Spare parts
			
			String vSpace1Height= propertyReader.readApplicationFile("vSpace1Height_OrderSparePart");
			String TextSpace1Height= propertyReader.readApplicationFile("TextSpace1Height_OrderSparePart");
			String vSpace4Height= propertyReader.readApplicationFile("vSpace4Height_OrderSparePart");
			String vSpace14Height= propertyReader.readApplicationFile("vSpace14Height_OrderSparePart");
			String vSpace2Height= propertyReader.readApplicationFile("vSpace2Height_OrderSparePart");
			String vSpace23Height= propertyReader.readApplicationFile("vSpace23Height_OrderSparePart");
			String Gutter21Width= propertyReader.readApplicationFile("Gutter21Width_OrderSparePart");
			String vSpace3Height= propertyReader.readApplicationFile("vSpace3Height_OrderSparePart");
			
			unified_OrderSparePartsHelper.orderspareparts(vSpace1Height,TextSpace1Height,vSpace4Height,vSpace14Height,vSpace2Height,vSpace23Height,Gutter21Width,vSpace3Height);
			
			ExecutionLog.Log("Unified Order Spare parts.");
		}  
		catch(Error e) 
		{
			captureScreenshot("Unified_OrderSpareParts");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("Unified_OrderSpareParts");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}