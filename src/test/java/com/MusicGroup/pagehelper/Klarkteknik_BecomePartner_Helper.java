package test.java.com.MusicGroup.pagehelper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;
public class Klarkteknik_BecomePartner_Helper extends DriverHelper {
	private LocatorReader locatorReader;	

	public Klarkteknik_BecomePartner_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("Klarkteknik_BecomePartner.xml");
	
	}
	public void ClickOnSupport()
	{
		
		String locator = locatorReader.getLocator("OurStory.ClickonSupport");
		this.WaitForElementEnabled(locator, 50);
		
		clickOn(locator);
	}
	
	public void ClickOnBrand()
	{
		
		String locator = locatorReader.getLocator("OurStory.ClickBrand");
		this.WaitForElementEnabled(locator, 50);
		
		clickOn(locator);
		
		
	}
	
	public void ClickOnApply()
	{
		String locator = locatorReader.getLocator("OurStory.MenuIcon");
		this.WaitForElementEnabled(locator, 50);
		
		clickOn(locator);
	}
	public void checkPageNotFound()
	{
		String actualTitle1 = driver.getTitle();
		System.out.println("Get Titile"+ actualTitle1);
		String expectedTitle1 = "Not Found | MUSIC Group";
		Assert.assertFalse(actualTitle1==expectedTitle1);

		
	}
	 public void ReachUptoBecomePartner()
	    {
	    	//Click on Support Button
	    	this.ClickOnSupport();
	    	//Click on Brand
	    	this.ClickOnBrand();
	    	//Click on Apply Now Button
	    	this.ClickOnApply();
	    	//Check Page not Found
	    	this.checkPageNotFound();
	    }
	    // fill the first form
	 
	 public void switchToBecomeaPartnerPage() {
	  try {
	     switchToFrameById("iFrameResizer0");
	 } catch (Exception e) {
	 e.printStackTrace();
	 }
	 }
	 
	 public void entercustomername(String Cn)
		{
	
		String locator = locatorReader.getLocator("VerifyPixels.CustomerName");
		this.WaitForElementPresent(locator, 30);
		this.WaitForElementEnabled(locator, 30);
		//String val = "X3";
		sendKeys(locator, Cn);
	
	}
	    public void EnterStreetName(String Sn)
		{
	
		String locator = locatorReader.getLocator("VerifyPixels.StreetName");
		this.WaitForElementPresent(locator, 30);
		this.WaitForElementEnabled(locator, 30);
		
		sendKeys(locator, Sn);
		
	}
	 public void EnterZipCode(String zipCode)
		{
	
		String locator = locatorReader.getLocator("VerifyPixels.ZipCode");
		this.WaitForElementPresent(locator, 30);
		this.WaitForElementEnabled(locator, 30);
		
		sendKeys(locator, zipCode);
	
	}
	
	 public void SelectCountry(String country)
		{
	
		String locator = locatorReader.getLocator("VerifyPixels.ChooseCountry");
		this.WaitForElementPresent(locator, 30);
	
		this.WaitForTextPresent(locator, country, 50000);
		clickOn(locator);
		selectDropDown(locator, country);
		this.WaitForTextPresent(locator,country, 500);
		this.verifyTextPresent(country);
		this.presEnterKey(locator);

	}
	public void SelectState(String State) 
		{
	
		String locator = locatorReader.getLocator("VerifyPixels.ChooseState");
		this.WaitForElementPresent(locator, 5000000);
		clickOn(locator);
		this.WaitForElementPresent(locator, 5000000);
		this.WaitForTextPresent(locator, State, 50000000);
	
	
		selectDropDown(locator, State);
		this.WaitForTextPresent(locator, State, 50000000);
		this.verifyTextPresent(State);
		this.presEnterKey(locator);
	
	
		selectDropDown(locator, State);
	

	}
	public void SelectSolutions(String Solutions) 
		{
	
		String locator = locatorReader.getLocator("VerifyPixels.ChooseSolutions");
		this.WaitForElementPresent(locator, 30);
		this.WaitForElementEnabled(locator, 30);
		clickOn(locator);
		//selectDropDown(locator, Solutions);

	}
	
	public void SelectSolutionBrand() 
		{
	
		String locator = locatorReader.getLocator("VerifyPixels.ChooseSolutionBrand");
		this.WaitForElementPresent(locator, 30);
		this.WaitForElementEnabled(locator, 30);
		clickOn(locator);
		//selectDropDown(locator, Brand);

	}
		public void SelectSalesTerritory(String SalesTerritory) 
		{
	
		String locator = locatorReader.getLocator("VerifyPixels.SelectSalesTerritory");
		this.WaitForElementPresent(locator, 30);
		this.WaitForElementEnabled(locator, 30);
		clickOn(locator);
		selectDropDown(locator, SalesTerritory);
		this.WaitForTextPresent(locator, SalesTerritory, 50000000);
		this.verifyTextPresent(SalesTerritory);
		this.presEnterKey(locator);
	}
	
	public void SelectSalesCountry(String SalesCountry) 
		{
	
		String locator = locatorReader.getLocator("VerifyPixels.SelectSalesCountry");
		this.WaitForElementPresent(locator, 30);
		this.WaitForElementEnabled(locator, 30);
		clickOn(locator);
		selectDropDown(locator, SalesCountry);
		this.WaitForTextPresent(locator, SalesCountry, 50000000);
		this.verifyTextPresent(SalesCountry);
		this.presEnterKey(locator);
	}
	public void AddSalesCountry() 
		{
	
		String locator = locatorReader.getLocator("VerifyPixels.SelectCountry");
		this.WaitForElementPresent(locator, 30);
		this.WaitForElementEnabled(locator, 30);
		clickOn(locator);
	

	}
public void FirstNextClick() 
		{
	
		String locator = locatorReader.getLocator("VerifyPixels.FirstNextButton");
		this.WaitForElementPresent(locator, 30);
		this.WaitForElementEnabled(locator, 30);
		clickOn(locator);
	

	}

public void EnterPhoneNumber(String PhoneNumber)
{

String locator = locatorReader.getLocator("VerifyPixels.PhoneNumber1");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, PhoneNumber);

}
public void EnterWebSiteName(String Website)
{

String locator = locatorReader.getLocator("VerifyPixels.WebSite1");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, Website);

}
public void EnterVATRegistration(String VatNo)
{

String locator = locatorReader.getLocator("VerifyPixels.VatRegistrationNo1");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, VatNo);

}	

public void EnterYearIncorparation(String Year)
{

String locator = locatorReader.getLocator("VerifyPixels.YearofIncorporation");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, Year);

}	
public void AnnualRevenue(String Revenue)
{

String locator = locatorReader.getLocator("VerifyPixels.AnnualRevenue1");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, Revenue);

}	

public void EnterOtherBrand(String Brand)
{

String locator = locatorReader.getLocator("VerifyPixels.OtherBrandCarried");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, Brand);

}	

public void SelectSalutation(String Salutation) 
{

String locator = locatorReader.getLocator("VerifyPixels.SelectSalutation");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);
selectDropDown(locator, Salutation);

}

public void EnterContactFirstName(String FirstName)
{

String locator = locatorReader.getLocator("VerifyPixels.ContactFirstName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FirstName);

}	
public void EnterContactLastName(String LastName)
{

String locator = locatorReader.getLocator("VerifyPixels.ContactLastName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, LastName);

}	
public void EnterContactTitle(String Title)
{

String locator = locatorReader.getLocator("VerifyPixels.ContactTitle");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, Title);

}	

public void EnterContactPhoneNO(String PhoneNO)
{

String locator = locatorReader.getLocator("VerifyPixels.ContactPhoneNumber");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, PhoneNO);

}	
public void EnterContactEmailID(String EmailID)
{

String locator = locatorReader.getLocator("VerifyPixels.ContactEmailID");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, EmailID);

}	
public void EnterContactSkypeID(String SkypeID)
{

String locator = locatorReader.getLocator("VerifyPixels.ContactSkypeID");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, SkypeID);

}	


//========================================================

public void SelectLegalSalutation(String LSalutation) 
{

String locator = locatorReader.getLocator("VerifyPixels.SelectLegalSalutation");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);
selectDropDown(locator, LSalutation);

}

public void EnterLegalFirstName(String LFirstName)
{

String locator = locatorReader.getLocator("VerifyPixels.LegalFirstName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, LFirstName);

}	
public void EnterLegalLastName(String LLastName)
{

String locator = locatorReader.getLocator("VerifyPixels.LegalLastName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, LLastName);

}	
public void EnterLegalTitle(String LTitle)
{

String locator = locatorReader.getLocator("VerifyPixels.LegalTitle");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, LTitle);

}	

public void EnterLegalPhoneNO(String LPhoneNO)
{

String locator = locatorReader.getLocator("VerifyPixels.LegalPhoneNumber");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, LPhoneNO);

}	
public void EnterLegalEmailID(String LEmailID)
{

String locator = locatorReader.getLocator("VerifyPixels.LegalEmailID");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, LEmailID);

}	
public void EnterLegalSkypeID(String LSkypeID)
{

String locator = locatorReader.getLocator("VerifyPixels.LegalSkypeID");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, LSkypeID);

}	

//===========================Order
public void SelectOrderSalutation(String OSalutation) 
{

String locator = locatorReader.getLocator("VerifyPixels.SelectOrderingSalutation");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);
selectDropDown(locator, OSalutation);

}

public void EnterOrderFirstName(String OFirstName)
{

String locator = locatorReader.getLocator("VerifyPixels.OrderingFirstName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, OFirstName);

}	
public void EnterOrderLastName(String OLastName)
{

String locator = locatorReader.getLocator("VerifyPixels.OrderingLastName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, OLastName);

}	
public void EnterOrderTitle(String OTitle)
{

String locator = locatorReader.getLocator("VerifyPixels.OrderingTitle");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, OTitle);

}	

public void EnterOrderPhoneNO(String OPhoneNO)
{

String locator = locatorReader.getLocator("VerifyPixels.OrderingPhoneNumber");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, OPhoneNO);

}	
public void EnterOrderEmailID(String OEmailID)
{

String locator = locatorReader.getLocator("VerifyPixels.OrderingEmailID");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, OEmailID);

}	
public void EnterOrderSkypeID(String OSkypeID)
{

String locator = locatorReader.getLocator("VerifyPixels.OrderingSkypeID");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, OSkypeID);

}	

//============================================FulFillment
public void SelectFulFillmentSalutation(String FFSalutation) 
{

String locator = locatorReader.getLocator("VerifyPixels.SelectFulFillmentSalutation");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);
selectDropDown(locator, FFSalutation);

}

public void EnterFulFillmentFirstName(String FFFirstName)
{

String locator = locatorReader.getLocator("VerifyPixels.FulFillmentFirstName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FFFirstName);

}	
public void EnterFulFillmentLastName(String FFLastName)
{

String locator = locatorReader.getLocator("VerifyPixels.FulFillmentLastName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FFLastName);

}	
public void EnterFulFillmentTitle(String FFTitle)
{

String locator = locatorReader.getLocator("VerifyPixels.FulFillmentTitle");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FFTitle);

}	

public void EnterFulFillmentPhoneNO(String FFPhoneNO)
{

String locator = locatorReader.getLocator("VerifyPixels.FulFillmentPhoneNumber");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FFPhoneNO);

}	
public void EnterFulFillmentEmailID(String FFEmailID)
{

String locator = locatorReader.getLocator("VerifyPixels.FulFillmentEmailID");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FFEmailID);

}	
public void EnterFulFillmentSkypeID(String FFSkypeID)
{

String locator = locatorReader.getLocator("VerifyPixels.FulFillmentSkypeID");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FFSkypeID);

}	


//=======Marketing
public void SelectMarketingSalutation(String MSalutation) 
{

String locator = locatorReader.getLocator("VerifyPixels.SelectMarketingSalutation");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);
selectDropDown(locator, MSalutation);

}

public void EnterMarketingFirstName(String MFirstName)
{

String locator = locatorReader.getLocator("VerifyPixels.MarketingFirstName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, MFirstName);

}	
public void EnterMarketingLastName(String MLastName)
{

String locator = locatorReader.getLocator("VerifyPixels.MarketingLastName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, MLastName);

}	
public void EnterMarketingTitle(String MTitle)
{

String locator = locatorReader.getLocator("VerifyPixels.MarketingTitle");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, MTitle);

}	

public void EnterMarketingPhoneNO(String MPhoneNO)
{

String locator = locatorReader.getLocator("VerifyPixels.MarketingPhoneNumber");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, MPhoneNO);

}	
public void EnterMarketingEmailID(String MEmailID)
{

String locator = locatorReader.getLocator("VerifyPixels.MarketingEmailID");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, MEmailID);

}	
public void EnterMarketingSkypeID(String MSkypeID)
{

String locator = locatorReader.getLocator("VerifyPixels.MarketingSkypeID");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, MSkypeID);

}


//==========Finance
public void SelectFinanceSalutation(String FSalutation) 
{

String locator = locatorReader.getLocator("VerifyPixels.SelectFinanceSalutation");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);
selectDropDown(locator, FSalutation);

}

public void EnterFinanceFirstName(String FFirstName)
{

String locator = locatorReader.getLocator("VerifyPixels.FinanceFirstName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FFirstName);

}	
public void EnterFinanceLastName(String FLastName)
{

String locator = locatorReader.getLocator("VerifyPixels.FinanceLastName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FLastName);

}	
public void EnterFinanceTitle(String FTitle)
{

String locator = locatorReader.getLocator("VerifyPixels.FinanceTitle");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FTitle);

}	

public void EnterFinancePhoneNO(String FPhoneNO)
{

String locator = locatorReader.getLocator("VerifyPixels.FinancePhoneNumber");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FPhoneNO);

}	
public void EnterFinanceEmailID(String FEmailID)
{

String locator = locatorReader.getLocator("VerifyPixels.FinanceEmailID");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FEmailID);

}	
public void EnterFinanceSkypeID(String FSkypeID)
{

String locator = locatorReader.getLocator("VerifyPixels.FinanceSkypeID");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);

sendKeys(locator, FSkypeID);

}

//=======Enter Billing Information
public void entername(String BillingName)
{

String locator = locatorReader.getLocator("VerifyPixels.BillingAddressName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
//String val = "X3";
sendKeys(locator, BillingName);

}

public void enterStreet(String BillingStreet)
{

String locator = locatorReader.getLocator("VerifyPixels.BillingAddressStreet");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
//String val = "X3";
sendKeys(locator, BillingStreet);

}

public void enterCity(String BillingCity)
{

String locator = locatorReader.getLocator("VerifyPixels.BillingAddressCity");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
//String val = "X3";
sendKeys(locator, BillingCity);

}


public void enterZipCode(String BillingZipCode)
{

String locator = locatorReader.getLocator("VerifyPixels.BillingAddressZip");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
//String val = "X3";
sendKeys(locator, BillingZipCode);

}

public void SelectBillingCountry(String BillingCountry) 
{

String locator = locatorReader.getLocator("VerifyPixels.BillingAddressCountry");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);
selectDropDown(locator, BillingCountry);

}

public void SelectBillingState(String BillingState) 
{

String locator = locatorReader.getLocator("VerifyPixels.BillingAddressState");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);
selectDropDown(locator, BillingState);

}


//========Shipping Information
public void enterShippingname(String ShippingName)
{

String locator = locatorReader.getLocator("VerifyPixels.ShippingAddressName");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
//String val = "X3";
sendKeys(locator, ShippingName);

}

public void enterShippingStreet(String ShippingStreet)
{

String locator = locatorReader.getLocator("VerifyPixels.ShippingAddressStreet");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
//String val = "X3";
sendKeys(locator, ShippingStreet);

}

public void enterShippingCity(String ShippingCity)
{

String locator = locatorReader.getLocator("VerifyPixels.ShippingAddressCity");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
//String val = "X3";
sendKeys(locator, ShippingCity);

}


public void enterShippingZipCode(String ShippingZipCode)
{

String locator = locatorReader.getLocator("VerifyPixels.ShippingAddressZip");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
//String val = "X3";
sendKeys(locator, ShippingZipCode);

}

public void ShippingCountry(String ShippingCountry) 
{

String locator = locatorReader.getLocator("VerifyPixels.ShippingAddressCountry");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);
selectDropDown(locator, ShippingCountry);

}

public void ShippingState(String ShippingState) 
{

String locator = locatorReader.getLocator("VerifyPixels.ShippingAddressState");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);
selectDropDown(locator, ShippingState);

}

public void enterPortOfDelivery(String Port)
{

String locator = locatorReader.getLocator("VerifyPixels.PortOfDelivery");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
//String val = "X3";
sendKeys(locator, Port);

}
public void ClickOnBillingInformattion() {
	// TODO Auto-generated method stub
	String locator = locatorReader.getLocator("VerifyPixels.ClickOnMainAccountInfo");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);
//sendKeys(locator, );

}
public void ClickOnShippingInformattion() {
	// TODO Auto-generated method stub
	String locator = locatorReader.getLocator("VerifyPixels.ClickOnAddressInfo");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);
//sendKeys(locator, );

}
public void SubmitButtonClick() 
{

String locator = locatorReader.getLocator("VerifyPixels.SubmitButton");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);


}
public void SecondNextClick() 
{

String locator = locatorReader.getLocator("VerifyPixels.SecondNextButton");
this.WaitForElementPresent(locator, 30);
this.WaitForElementEnabled(locator, 30);
clickOn(locator);


}

public void Filltheform1(String Cn, String Sn, String City, String zipCode, String country, String State, String Solutions, String SalesTerritory, String SalesCountry, String PhoneNumber,String Website, String VatNo, String Year, String Revenue, String Brand)
	    {
	    	//Click on Support Button
	    	this.entercustomername(Cn);
	    	this.EnterStreetName(Sn);
	    	this.EnterCityName(City);
	    	this.EnterZipCode(zipCode);
	    	this.SelectCountry(country);
	    	this.SelectState(State);
	    	this.SelectSolutions(Solutions);
	    	this.SelectSolutionBrand();
	    	this.SelectSalesTerritory(SalesTerritory);
	    	this.SelectSalesCountry(SalesCountry);
	    	this.AddSalesCountry();
	   
	    	this.EnterPhoneNumber(PhoneNumber);
	    	this.EnterWebSiteName(Website);
	    	this.EnterVATRegistration(VatNo);
	    	this.EnterYearIncorparation(Year);
	    	this.AnnualRevenue(Revenue);
	    	this.EnterOtherBrand(Brand);
	     	this.FirstNextClick();
	    	   }

public void FillTheForm2(String Salutation, String FirstName, String LastName, String Title, String PhoneNO, String EmailID, String SkypeID,String LSalutation, String LFirstName,String LLastName,String LTitle,String LPhoneNO,String LEmailID,String LSkypeID,String OSalutation, String OFirstName,String OLastName,String OTitle,String OPhoneNO,String OEmailID,String OSkypeID,String FFSalutation, String FFFirstName,String FFLastName,String FFTitle,String FFPhoneNO,String FFEmailID,String FFSkypeID,String MSalutation, String MFirstName,String MLastName,String MTitle,String MPhoneNO,String MEmailID,String MSkypeID,String FSalutation, String FFirstName,String FLastName,String FTitle,String FPhoneNO,String FEmailID,String FSkypeID)
{
	//Enter Contact Information
	this.SelectSalutation(FSalutation);
	this.EnterContactFirstName(FirstName);
	this.EnterContactLastName(LastName);
	this.EnterContactTitle(Title);
	this.EnterContactPhoneNO(PhoneNO);
	this.EnterContactEmailID(EmailID);
	this.EnterContactSkypeID(SkypeID);
//Enter Legal Representative Information
	this.SelectLegalSalutation(LSalutation);
	this.EnterLegalFirstName(LFirstName);
	this.EnterLegalLastName(LLastName);
	this.EnterLegalTitle(LTitle);
	this.EnterLegalPhoneNO(LPhoneNO);
	this.EnterLegalEmailID(LEmailID);
	this.EnterLegalSkypeID(LSkypeID);
//Enter Ordering Information
	this.SelectOrderSalutation(OSalutation);
	this.EnterOrderFirstName(OFirstName);
	this.EnterOrderLastName(OLastName);
	this.EnterOrderTitle(OTitle);
	this.EnterOrderPhoneNO(OPhoneNO);
	this.EnterOrderEmailID(OEmailID);
	this.EnterOrderSkypeID(OSkypeID);
//Enter FulFillment Information
	this.SelectFulFillmentSalutation(FFSalutation);
	this.EnterFulFillmentFirstName(FFFirstName);
	this.EnterFulFillmentLastName(FFLastName);
	this.EnterFulFillmentTitle(FFTitle);
	this.EnterFulFillmentEmailID(FFEmailID);
	this.EnterFulFillmentSkypeID(FFSkypeID);
//Enter Marketing Information
	this.SelectMarketingSalutation(MSalutation);
	this.EnterMarketingFirstName(MFirstName);
	this.EnterMarketingLastName(MLastName);
	this.EnterMarketingTitle(MTitle);
	this.EnterMarketingPhoneNO(MPhoneNO);
	this.EnterMarketingEmailID(MEmailID);
	this.EnterMarketingSkypeID(MSkypeID);
//Enter Finance Information
	this.SelectFinanceSalutation(FSalutation);
	this.EnterFinanceFirstName(FFirstName);
	this.EnterFinanceLastName(FLastName);
	this.EnterFinanceTitle(FTitle);
	this.EnterFulFillmentPhoneNO(FPhoneNO);
	this.EnterFinanceEmailID(FEmailID);
	this.EnterFinanceSkypeID(FSkypeID);
	this.SecondNextClick();
}

public void FillTheForm3(String BillingName, String BillingStreet,String BillingCity,String BillingZipCode,String BillingCountry,String BillingState,String ShippingName, String ShippingStreet,String ShippingCity,String ShippingZipCode,String ShippingCountry,String ShippingState, String Port)
{
	/*
//Enter Billing Information
	this.entername(BillingName);
	this.enterStreet(BillingStreet);
	this.enterCity(BillingCity);
	this.enterZipCode(BillingZipCode);
	this.SelectBillingCountry(BillingCountry);
	this.SelectBillingState(BillingState);
//Enter Shipping Information
	this.enterShippingname(ShippingName);
	this.enterShippingStreet(ShippingStreet);
	this.enterShippingCity(ShippingCity);
	this.enterShippingZipCode(ShippingZipCode);
	this.ShippingCountry(ShippingCountry);
	this.ShippingState(ShippingState);
	*/
	this.ClickOnBillingInformattion();
	this.ClickOnShippingInformattion();
	this.enterPortOfDelivery(Port);
	this.SubmitButtonClick();
	
}
	 
	 private void EnterCityName(String city) {
			// TODO Auto-generated method stub
			String locator = locatorReader.getLocator("VerifyPixels.CityName");
		this.WaitForElementPresent(locator, 30);
		this.WaitForElementEnabled(locator, 30);
		
		sendKeys(locator, city);
	
		}
	//Verify Search Page
     public void VerifyBecomePartner(String CustomerName, String StreetName,String CityName, String ZipCode, String Country, String State, String Solutions, String SalesTerritory, String SalesCountry, String PhoneNumber, String Website, String VatNo, String Year, String Revenue, String Brand, String Salutation, String FirstName, String LastName, String Title, String PhoneNO, String EmailID, String SkypeID,String LSalutation, String LFirstName,String LLastName,String LTitle,String LPhoneNO,String LEmailID,String LSkypeID,String OSalutation, String OFirstName,String OLastName,String OTitle,String OPhoneNO,String OEmailID,String OSkypeID,String FFSalutation, String FFFirstName,String FFLastName,String FFTitle,String FFPhoneNO,String FFEmailID,String FFSkypeID,String MSalutation, String MFirstName,String MLastName,String MTitle,String MPhoneNO,String MEmailID,String MSkypeID,String FSalutation, String FFirstName,String FLastName,String FTitle,String FPhoneNO,String FEmailID,String FSkypeID,String BillingName, String BillingStreet,String BillingCity,String BillingZipCode,String BillingCountry,String BillingState,String ShippingName, String ShippingStreet,String ShippingCity,String ShippingZipCode,String ShippingCountry,String ShippingState, String Port) throws Exception{
   	  String Cn=CustomerName;
   	  String Sn=StreetName;
   	  String City=CityName;
   	  String zipCode=ZipCode;
   	  String country=Country;
   	//Reach upto Search page
    	 ReachUptoBecomePartner();
    	Thread.sleep(5000);
    	switchToBecomeaPartnerPage();
    	Filltheform1(Cn,Sn,City, zipCode, country,State,Solutions,SalesTerritory,SalesCountry,PhoneNumber,Website,VatNo,Year,Revenue,Brand);
    	FillTheForm2(Salutation,FirstName,LastName,Title,PhoneNO,EmailID,SkypeID,LSalutation, LFirstName, LLastName,LTitle,LPhoneNO,LEmailID,LSkypeID,OSalutation, OFirstName, OLastName, OTitle, OPhoneNO, OEmailID, OSkypeID,FFSalutation, FFFirstName, FFLastName, FFTitle, FFPhoneNO, FFEmailID, FFSkypeID,MSalutation, MFirstName, MLastName, MTitle, MPhoneNO, MEmailID, MSkypeID,FSalutation, FFirstName, FLastName, FTitle, FPhoneNO, FEmailID, FSkypeID);
    	FillTheForm3(BillingName, BillingStreet, BillingCity, BillingZipCode, BillingCountry, BillingState,ShippingName, ShippingStreet, ShippingCity, ShippingZipCode, ShippingCountry, ShippingState, Port);
    	
    	Thread.sleep(5000);
 	
		
}
     

}