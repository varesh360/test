package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Klarkteknik_BecomePartner_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Klarkteknik_BecomePartner extends DriverTestCase 
{
	@Test
	public void VerifyBecomePartner() throws Exception {
		try {
			// Initialize object
			KLARK_Become_Helper = new Klarkteknik_BecomePartner_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String CustomerName = propertyReader.readApplicationFile("Midas_CustomerName");
			String StreetName=propertyReader.readApplicationFile("Midas_StreetName");
			String CityName=propertyReader.readApplicationFile("Midas_CityName");
			String ZipCode=propertyReader.readApplicationFile("Midas_ZipCode");
			String Country=propertyReader.readApplicationFile("Midas_Country");
			String State=propertyReader.readApplicationFile("Midas_State");
			String Solutions=propertyReader.readApplicationFile("Midas_Solutions");
			String SalesTerritory=propertyReader.readApplicationFile("Midas_SalesTerritory");
			String SalesCountry=propertyReader.readApplicationFile("Midas_SalesCountry");
			String PhoneNumber=propertyReader.readApplicationFile("Midas_PhoneNumber1");
			String Website=propertyReader.readApplicationFile("Midas_WebsiteName1");
			String VatNo=propertyReader.readApplicationFile("Midas_VATRegristrationNo");
			String Year=propertyReader.readApplicationFile("Midas_YearIncorporation");
			String Revenue=propertyReader.readApplicationFile("Midas_AnnualRevenue");
			String Brand=propertyReader.readApplicationFile("Midas_OtherBrand");
			String Salutation=propertyReader.readApplicationFile("Midas_Salutation");
			String FirstName=propertyReader.readApplicationFile("Midas_FirstName");
			String LastName=propertyReader.readApplicationFile("Midas_LastName");
			String Title=propertyReader.readApplicationFile("Midas_ContactTitles");
			String PhoneNO=propertyReader.readApplicationFile("Midas_ContactNo");
			String EmailID=propertyReader.readApplicationFile("Midas_ContactEmailID");
			String SkypeID=propertyReader.readApplicationFile("Midas_ContactSkypeID");

			String LSalutation=propertyReader.readApplicationFile("Midas_LegalSalutation");
			String LFirstName=propertyReader.readApplicationFile("Midas_LegalFirstName");
			String LLastName=propertyReader.readApplicationFile("Midas_LegalLastName");
			String LTitle=propertyReader.readApplicationFile("Midas_LegalTitle");
			String LPhoneNO=propertyReader.readApplicationFile("Midas_LegalContactNo");
			String LEmailID=propertyReader.readApplicationFile("Midas_LegalEmailID");
			String LSkypeID=propertyReader.readApplicationFile("Midas_LegalSkypeID");
			
			String OSalutation=propertyReader.readApplicationFile("Midas_OrderSalutation");
			String OFirstName=propertyReader.readApplicationFile("Midas_OrderFirstName");
			String OLastName=propertyReader.readApplicationFile("Midas_OrderLastName");
			String OTitle=propertyReader.readApplicationFile("Midas_OrderTitle");
			String OPhoneNO=propertyReader.readApplicationFile("Midas_OrderContactNo");
			String OEmailID=propertyReader.readApplicationFile("Midas_OrderEmailID");
			String OSkypeID=propertyReader.readApplicationFile("Midas_OrderSkypeID");
			
			String FFSalutation=propertyReader.readApplicationFile("Midas_FulFillmentSalutation");
			String FFFirstName=propertyReader.readApplicationFile("Midas_FulFillmentFirstName");
			String FFLastName=propertyReader.readApplicationFile("Midas_FulFillmentLastName");
			String FFTitle=propertyReader.readApplicationFile("Midas_FulFillmentTitle");
			String FFPhoneNO=propertyReader.readApplicationFile("Midas_FulFillmentContactNo");
			String FFEmailID=propertyReader.readApplicationFile("Midas_FulFillmentEmailID");
			String FFSkypeID=propertyReader.readApplicationFile("Midas_FulFillmentSkypeID");
			
			String MSalutation=propertyReader.readApplicationFile("Midas_MarketingSalutation");
			String MFirstName=propertyReader.readApplicationFile("Midas_MarketingFirstName");
			String MLastName=propertyReader.readApplicationFile("Midas_MarketingLastName");
			String MTitle=propertyReader.readApplicationFile("Midas_MarketingTitle");
			String MPhoneNO=propertyReader.readApplicationFile("Midas_MarketingContactNo");
			String MEmailID=propertyReader.readApplicationFile("Midas_MarketingEmailID");
			String MSkypeID=propertyReader.readApplicationFile("Midas_MarketingSkypeID");
			
			String FSalutation=propertyReader.readApplicationFile("Midas_FinanceSalutation");
			String FFirstName=propertyReader.readApplicationFile("Midas_FinanceFirstName");
			String FLastName=propertyReader.readApplicationFile("Midas_FinanceLastName");
			String FTitle=propertyReader.readApplicationFile("Midas_FinanceTitle");
			String FPhoneNO=propertyReader.readApplicationFile("Midas_FinanceContactNo");
			String FEmailID=propertyReader.readApplicationFile("Midas_FinanceEmailID");
			String FSkypeID=propertyReader.readApplicationFile("Midas_FinanceSkypeID");
			
			String BillingName=propertyReader.readApplicationFile("Midas_BillingAddressName");
			String BillingStreet=propertyReader.readApplicationFile("Midas_BillingAddressStreet");
			String BillingCity=propertyReader.readApplicationFile("Midas_BillingAddressCity");
			String BillingZipCode=propertyReader.readApplicationFile("Midas_BillingAddressZipCode");
			String BillingCountry=propertyReader.readApplicationFile("Midas_BillingAddressCountry");
			String BillingState=propertyReader.readApplicationFile("Midas_BillingAddressState");
			
			String ShippingName=propertyReader.readApplicationFile("Midas_BillingAddressName");
			String ShippingStreet=propertyReader.readApplicationFile("Midas_BillingAddressStreet");
			String ShippingCity=propertyReader.readApplicationFile("Midas_BillingAddressCity");
			String ShippingZipCode=propertyReader.readApplicationFile("Midas_BillingAddressZipCode");
			String ShippingCountry=propertyReader.readApplicationFile("Midas_BillingAddressCountry");
			String ShippingState=propertyReader.readApplicationFile("Midas_BillingAddressState");
			String Port=propertyReader.readApplicationFile("Midas_PortOfDelivery");							
										
			KLARK_Become_Helper.VerifyBecomePartner(CustomerName, StreetName, CityName, ZipCode,Country,State,Solutions,SalesTerritory, SalesCountry,PhoneNumber,Website, VatNo,Year,Revenue,Brand,Salutation,FirstName,LastName,Title,PhoneNO,EmailID,SkypeID,LSalutation, LFirstName, LLastName, LTitle, LPhoneNO, LEmailID, LSkypeID,OSalutation, OFirstName, OLastName, OTitle, OPhoneNO, OEmailID, OSkypeID,FFSalutation, FFFirstName, FFLastName, FFTitle, FFPhoneNO, FFEmailID, FFSkypeID,MSalutation, MFirstName, MLastName, MTitle, MPhoneNO, MEmailID, MSkypeID,FSalutation, FFirstName, FLastName, FTitle, FPhoneNO, FEmailID, FSkypeID,BillingName, BillingStreet, BillingCity, BillingZipCode, BillingCountry, BillingState,ShippingName, ShippingStreet, ShippingCity, ShippingZipCode, ShippingCountry, ShippingState, Port);
			
			ExecutionLog.Log("KlarkTeknik Become a Partner verified successfully.");
	}
		catch (Error e) 
		{
			captureScreenshot("Midas_OurStoryPage2008");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 		catch (Exception ex)
		{
			captureScreenshot("Midas_OurStoryPage2008");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}
}
	

