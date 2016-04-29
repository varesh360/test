package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.Unified_OrderSparePartsHelper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;

public class Unified_AuthorizedPartnerPagePopup extends DriverTestCase
{
	@Test
	public void VerifyUnifiedAuthorizedPartnerPagePopup() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			unified_OrderSparePartsHelper = new Unified_OrderSparePartsHelper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
           //Verify Order Spare parts
			
			String vSpace15Height= propertyReader.readApplicationFile("vSpace15Height_AuthorizedPartnerPopup");
			String Gutter68Width= propertyReader.readApplicationFile("Gutter68Width_AuthorizedPartnerPopup");
			String vSpace5Height= propertyReader.readApplicationFile("vSpace5Height_AuthorizedPartnerPopup");
			String TextSpace5Height= propertyReader.readApplicationFile("TextSpace5Height_AuthorizedPartnerPopup");
			String Gap17width= propertyReader.readApplicationFile("Gap17width_AuthorizedPartnerPopup");
			
			unified_OrderSparePartsHelper.VerifyAuthorizedPartnerPagePopup(vSpace15Height,Gutter68Width,vSpace5Height,TextSpace5Height,Gap17width);
			
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