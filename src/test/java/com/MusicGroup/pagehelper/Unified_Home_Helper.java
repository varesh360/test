/*==============================================================================================================================
 File Name    : Unified_Home_Helper.java
 ClassName    : Unified_Home_Helper
 Summary      : Contains helping methods for Unified Home Page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class Unified_Home_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	
	private Boolean ExpectedResult=true;
	public Unified_Home_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("Unified_Home.xml");
	}
		
	//Enter text in search field 
	public void enterTextinSearchField(String text)
	{
		String locator = locatorReader.getLocator("Search.EnterSearchtext");
		this.WaitForElementEnabled(locator, 5);
		sendKeys(locator, text);
	}
	
	//Click on Search icon 
	public void clickSearchIcon()
	{
		String locator = locatorReader.getLocator("Search.SearchIcon");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	//Press Enter key on search field 
	public void pressEnterKeySearchField()
	{
		String locator = locatorReader.getLocator("Search.EnterSearchtext");
		this.WaitForElementEnabled(locator, 50);
		presEnterKey(locator);
	}
	
	//Click on First Result
	public void clickonFirstResult()
	{
		String locator = locatorReader.getLocator("Search.FirstResult");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	//Click on Menu icon 
	public void clickMenuIcon()
	{
	
		String locator = locatorReader.getLocator("ProductPage.MenuIcon");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);

			
	}
	//Click on Brand MG
	public void clickonBrandMG()
	{
		String locator = locatorReader.getLocator("ProductPage.ClickonMusicGroup");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	//Click on Download
	public void clickonDownload()
	{
		String locator = locatorReader.getLocator("ProductPage.ClickonDownload");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	//Click on Brand Midas
	public void clickonBrandMidas()
	{
	
		String locator = locatorReader.getLocator("ProductPage.ClickonMidas");
		this.WaitForElementEnabled(locator, 50);
		
		clickOn(locator);
	
	}
	//Click on Brand Klark
	public void clickonBrandKlark()
	{
	
		
		String locator = locatorReader.getLocator("ProductPage.ClickonKlark");
		Boolean Result=isElementPresent("ProductPage.ClickonKlark");
	
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		
	}
	//Click on Brand Turbosound
	public void clickonBrandTurbosound()
	{
		String locator = locatorReader.getLocator("ProductPage.ClickonTurbosound");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	//Click on Behringer Brand 
	public void clickonBehringerBrand()
	{
		String locator = locatorReader.getLocator("ProductPage.ClickonBehringer");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	//Click on Brand Bugera
	public void clickonBrandBugera()
	{
		String locator = locatorReader.getLocator("ProductPage.ClickonBugera");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	//Click on community Link
	public void clickonCommunityLink()
	{
		String locator = locatorReader.getLocator("Community.ClickCommunityLink");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	//Check Page not found
	public void checkPageNotFound()
	{
		String actualTitle1 = driver.getTitle();
		System.out.println("Get Titile"+ actualTitle1);
		String expectedTitle1 = "Not Found | MUSIC Group";
		Assert.assertFalse(actualTitle1==expectedTitle1);

		
	}
	//Verify MusicGroup home page
	public void verifyMusicGroupHomepage()
	{
		
		//Verify music group logo on MG home page.
		String locator=locatorReader.getLocator("Home.MusicGroupLogo");
	
		this.WaitForElementPresent(locator, 50);
		Boolean Result=isElementPresent(locatorReader.getLocator("Home.MusicGroupLogo"));
		System.out.println("Result"+Result);
		//String Result1=Result.toString();
		Assert.assertEquals(Result, ExpectedResult);
		//Assert.assertEquals(Result, ExpectedResult);
		
	//	Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Home.MusicGroupLogo")));
		//Verify support link on MG home page.
		String locator1=locatorReader.getLocator("Home.VerifySupport");
		
		this.WaitForElementPresent(locator1, 10);
		Boolean Result1=isElementPresent(locatorReader.getLocator("Home.VerifySupport"));
		System.out.println("Result1"+Result1);
		Assert.assertEquals(Result1, ExpectedResult);
	//	Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Home.VerifySupport")));
		//Verify Banner on MG home page.
		String locator2=locatorReader.getLocator("Home.VerifyBanner");
		
		this.WaitForElementPresent(locator2, 10);
		Boolean Result2=isElementPresent(locatorReader.getLocator("Home.VerifyBanner"));
		System.out.println("Result1"+Result2);
		Assert.assertEquals(Result2, ExpectedResult);
		
		//Verify Community link on MG home page.
String locator3=locatorReader.getLocator("Home.VerifyCommunity");
		
		this.WaitForElementPresent(locator3, 10);
		Boolean Result3=isElementPresent(locatorReader.getLocator("Home.VerifyCommunity"));
		System.out.println("Result1"+Result3);
		Assert.assertEquals(Result3, ExpectedResult);
		
		//Verify Brand link on MG home page.
String locator4=locatorReader.getLocator("Home.VerifyBrand");
		
		this.WaitForElementPresent(locator4, 10);
		Boolean Result4=isElementPresent(locatorReader.getLocator("Home.VerifyBrand"));
		System.out.println("Result1"+Result4);
		Assert.assertEquals(Result4, ExpectedResult);
		
		
	/*
		//Verify Career link on MG home page.
		String locator5=locatorReader.getLocator("Home.VerifyCareer");
		
		this.WaitForElementPresent(locator5, 10);
		Boolean Result5=isElementPresent(locatorReader.getLocator("Home.VerifyCareer"));
		System.out.println("Result1"+Result5);
		Assert.assertEquals(Result5, ExpectedResult);
		*/
		//Verify Search field on MG home page.
String locator6=locatorReader.getLocator("Home.Verifysearchfield");
		
		this.WaitForElementPresent(locator6, 10);
		Boolean Result6=isElementPresent(locatorReader.getLocator("Home.Verifysearchfield"));
		System.out.println("Result1"+Result6);
		Assert.assertEquals(Result6, ExpectedResult);
		
		//Verify Terms of User link is available on MG home page.
String locator7=locatorReader.getLocator("Home.TermsofUse");
		
		this.WaitForElementPresent(locator7, 10);
		Boolean Result7=isElementPresent(locatorReader.getLocator("Home.TermsofUse"));
		System.out.println("Result1"+Result7);
		Assert.assertEquals(Result7, ExpectedResult);
		
		//Verify Privecy Policy link is available on MG home page.
String locator8=locatorReader.getLocator("Home.PrivacyPolicy");
		
		this.WaitForElementPresent(locator8, 10);
		Boolean Result8=isElementPresent(locatorReader.getLocator("Home.PrivacyPolicy"));
		System.out.println("Result1"+Result8);
		Assert.assertEquals(Result8, ExpectedResult);
		
		//Verify Site map link is available on MG home page.
String locator9=locatorReader.getLocator("Home.SiteMap");
		
		this.WaitForElementPresent(locator9, 10);
		Boolean Result9=isElementPresent(locatorReader.getLocator("Home.SiteMap"));
		System.out.println("Result1"+Result9);
		Assert.assertEquals(Result9, ExpectedResult);
		
		//Verify Careers link is available on MG home page.
String locator10=locatorReader.getLocator("Home.Careers");
		
		this.WaitForElementPresent(locator10, 10);
		Boolean Result10=isElementPresent(locatorReader.getLocator("Home.Careers"));
		System.out.println("Result1"+Result10);
		Assert.assertEquals(Result10, ExpectedResult);
		
		//Verify News link is available on MG home page.
String locator11=locatorReader.getLocator("Home.News");
		
		this.WaitForElementPresent(locator11, 10);
		Boolean Result11=isElementPresent(locatorReader.getLocator("Home.News"));
		System.out.println("Result1"+Result11);
		Assert.assertEquals(Result11, ExpectedResult);
		
		
		//Verify Contact us link is available on MG home page.
String locator12=locatorReader.getLocator("Home.ContactUs");
		
		this.WaitForElementPresent(locator12, 10);
		Boolean Result12=isElementPresent(locatorReader.getLocator("Home.ContactUs"));
		System.out.println("Result1"+Result12);
		Assert.assertEquals(Result12, ExpectedResult);
		
	}
	
	//Search for a product and verify the search result
	public void searchandVerifyProduct(String productName)
	{
		//Enter the product name in search field 
		this.enterTextinSearchField(productName);
		
		//Click on search or hit enter button
	//	this.clickSearchIcon();
		// Press Enter keys action
		this.pressEnterKeySearchField();
		
		//Click on First result
		clickonFirstResult();
		
		//Verify the product name
		String product = this.getText(locatorReader.getLocator("Search.ProductTitle"));
		Assert.assertEquals(product, productName);
		
		//Verify the product image exist
		//this.WaitForElementPresent(locatorReader.getLocator("Search.ProductImage"), 2);
//		/Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Search.ProductImage")),"product image not found");	
	}
	
	//Verify header of brand landing page.
	public void verifyBrandLandingHeader()
	{
		this.verifyMusicGroupHomepage();
		//Click on the Menu icon
		this.clickMenuIcon();
		System.out.println("Hello11222");
		
		this.clickonBrandMidas();
		//Click on Brand MG
		//this.clickonBrandMG();
		//Verify header
		//this.BrandHeader();
		//Click on the Menu icon
		//this.clickMenuIcon();
		//Click on Brand Midas
		
		//Verify header
		this.BrandHeader();
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Klark
		this.clickonBrandKlark();
		//Verify header
		this.BrandHeader();
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Turbosound
		this.clickonBrandTurbosound();
		//Verify header
		this.BrandHeader();
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Behringer Brand 
		this.clickonBehringerBrand();
		//Verify header
		this.BrandHeader();
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Bugera
		this.clickonBrandBugera();
		//Verify header
		this.BrandHeader();
	}
	
	//Verify brand logo on new brands landing page.
	public void verifyBrandLogo()
	{
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand MG
		this.clickonBrandMG();
		//Verify music group logo on MG home page.
		this.WaitForElementPresent(locatorReader.getLocator("Home.MusicGroupLogo"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Home.MusicGroupLogo")));
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Midas
		this.clickonBrandMidas();
		//Verify Midas logo on Midas page.
		this.WaitForElementPresent(locatorReader.getLocator("Home.MusicGroupLogo"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Home.MusicGroupLogo")));
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Klark
		this.clickonBrandKlark();
		//Verify Klark logo on Klark page.
		this.WaitForElementPresent(locatorReader.getLocator("Home.MusicGroupLogo"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Home.MusicGroupLogo")));
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Turbosound
		this.clickonBrandTurbosound();
		//Verify Turbosound logo on Turbosound page.
		this.WaitForElementPresent(locatorReader.getLocator("Home.MusicGroupLogo"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Home.MusicGroupLogo")));
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Behringer Brand 
		this.clickonBehringerBrand();
		//Verify Behringer logo on Behringer page.
		this.WaitForElementPresent(locatorReader.getLocator("Home.MusicGroupLogo"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Home.MusicGroupLogo")));
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Bugera
		this.clickonBrandBugera();
		//Verify Bugera logo on Bugera page.
		this.WaitForElementPresent(locatorReader.getLocator("Home.MusicGroupLogo"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Home.MusicGroupLogo")));
	}
	
	//Verify footer of brand landing page.
	public void verifyBrandLandingFooter(String Copyright_text) throws InterruptedException
	{
		this.verifyMusicGroupHomepage();
		//Click on the Menu icon
		//this.clickMenuIcon();
		//Click on Brand MG
		//this.clickonBrandMG();
		//Verify footer
		//this.BrandFooter(Copyright_text);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Midas
		this.clickonBrandMidas();
		//Verify footer
		this.BrandFooter(Copyright_text);
		Thread.sleep(5000);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Klark
		this.clickonBrandKlark();
		//Verify footer
		this.BrandFooter(Copyright_text);
		//Click on the Menu icon
		Thread.sleep(5000);
		this.clickMenuIcon();
		//Click on Brand Turbosound
		this.clickonBrandTurbosound();
		//Verify footer
		this.BrandFooter(Copyright_text);
		Thread.sleep(5000);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Behringer Brand 
		this.clickonBehringerBrand();
		//Verify footer
		this.BrandFooter(Copyright_text);
		Thread.sleep(5000);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Bugera
		this.clickonBrandBugera();
		//Verify footer
		this.BrandFooter(Copyright_text);
		this.verifyBrandPage(Copyright_text);
	}
	
	//Verify brand page.
	public void verifyBrandPage(String Copyright_text) throws InterruptedException
	{
		//Click on the Menu icon
		//this.clickMenuIcon();
		//Click on Brand MG
		//this.clickonBrandMG();
		//Verify header
		//this.BrandHeader();
		//Verify footer
		//this.BrandFooter(Copyright_text);
		//Click on the Menu icon
		Thread.sleep(5000);
		this.clickMenuIcon();
		//Click on Brand Midas
		this.clickonBrandMidas();
		//Verify header
		this.BrandHeader();
		//Verify footer
		this.BrandFooter(Copyright_text);
		Thread.sleep(5000);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Klark
		this.clickonBrandKlark();
		//Verify header
		this.BrandHeader();
		//Verify footer
		this.BrandFooter(Copyright_text);
		//Click on the Menu icon
		Thread.sleep(5000);
		this.clickMenuIcon();
		//Click on Brand Turbosound
		this.clickonBrandTurbosound();
		//Verify header
		this.BrandHeader();
		//Verify footer
		this.BrandFooter(Copyright_text);
		//Click on the Menu icon
		Thread.sleep(5000);
		this.clickMenuIcon();
		//Click on Behringer Brand 
		this.clickonBehringerBrand();
		//Verify header
		this.BrandHeader();
		//Verify footer
		this.BrandFooter(Copyright_text);
		Thread.sleep(5000);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Bugera
		this.clickonBrandBugera();
		//Verify header
		this.BrandHeader();
		//Verify footer
		this.BrandFooter(Copyright_text);
	}
	
	//Verify brand page.
	public void verifyDownloadMenu()
	{
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Bugera
		this.clickonBrandBugera();
		//Click on Download 
		this.clickonDownload();
		//Verify Download Menu
		this.WaitForElementPresent(locatorReader.getLocator("ProductPage.DownloadCenter"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("ProductPage.DownloadCenter")));
	}
	//Header of brand landing page.
	public void BrandHeader()
	{
		//Verify Terms of User link is available on MG home page.
String locator1=locatorReader.getLocator("Home.TermsofUse");
		
		this.WaitForElementPresent(locator1, 10);
		Boolean Result1=isElementPresent(locatorReader.getLocator("Home.TermsofUse"));
		System.out.println("Result1"+Result1);
		Assert.assertEquals(Result1, ExpectedResult);
		
		
		//Verify Privecy Policy link is available on MG home page.
		String locator2=locatorReader.getLocator("Home.PrivacyPolicy");
		this.WaitForElementPresent(locator2, 10);
		Boolean Result2=isElementPresent(locatorReader.getLocator("Home.PrivacyPolicy"));
		System.out.println("Result1"+Result2);
		Assert.assertEquals(Result2, ExpectedResult);
		
	
		//Verify Site map link is available on MG home page.
		String locator3=locatorReader.getLocator("Home.SiteMap");
		this.WaitForElementPresent(locator3, 10);
		Boolean Result3=isElementPresent(locatorReader.getLocator("Home.SiteMap"));
		System.out.println("Result1"+Result3);
		Assert.assertEquals(Result3, ExpectedResult);
		
		//Verify Careers link is available on MG home page.
		String locator4=locatorReader.getLocator("Home.Careers");
		this.WaitForElementPresent(locator4, 10);
		Boolean Result4=isElementPresent(locatorReader.getLocator("Home.Careers"));
		System.out.println("Result1"+Result4);
		Assert.assertEquals(Result4, ExpectedResult);
		
		//Verify News link is available on MG home page.
		String locator5=locatorReader.getLocator("Home.News");
		this.WaitForElementPresent(locator5, 10);
		Boolean Result5=isElementPresent(locatorReader.getLocator("Home.Careers"));
		System.out.println("Result1"+Result5);
		Assert.assertEquals(Result5, ExpectedResult);
		
		
		//Verify Contact us link is available on MG home page.
		String locator6=locatorReader.getLocator("Home.ContactUs");
		this.WaitForElementPresent(locator6, 10);
		Boolean Result6=isElementPresent(locatorReader.getLocator("Home.ContactUs"));
		System.out.println("Result1"+Result6);
		Assert.assertEquals(Result6, ExpectedResult);

	}
	
	//footer of brand landing page.
	public void BrandFooter(String Copyright_text)
	{
        //Store copyright text 
/*		this.WaitForElementPresent(locatorReader.getLocator("Home.Copyright"), 10);
		String storecopyrighttext = this.getText("Home.Copyright");
		Assert.assertEquals(storecopyrighttext, Copyright_text);*/
		//Verify Terms of User link is available on MG home page.
		String locator1=locatorReader.getLocator("Home.TermsofUse");
		this.WaitForElementPresent(locator1, 10);
		Boolean Result1=isElementPresent(locatorReader.getLocator("Home.TermsofUse"));
		System.out.println("Result1"+Result1);
		Assert.assertEquals(Result1, ExpectedResult);
		
	
		//Verify Privecy Policy link is available on MG home page.
		String locator2=locatorReader.getLocator("Home.PrivacyPolicy");
		this.WaitForElementPresent(locator2, 10);
		Boolean Result2=isElementPresent(locatorReader.getLocator("Home.PrivacyPolicy"));
		System.out.println("Result1"+Result2);
		Assert.assertEquals(Result2, ExpectedResult);
		
		//Verify Site map link is available on MG home page.
		String locator3=locatorReader.getLocator("Home.SiteMap");
		this.WaitForElementPresent(locator3, 10);
		Boolean Result3=isElementPresent(locatorReader.getLocator("Home.SiteMap"));
		System.out.println("Result1"+Result3);
		Assert.assertEquals(Result3, ExpectedResult);
		
		//Verify Careers link is available on MG home page.
		String locator4=locatorReader.getLocator("Home.Careers");
		this.WaitForElementPresent(locator4, 10);
		Boolean Result4=isElementPresent(locatorReader.getLocator("Home.Careers"));
		System.out.println("Result1"+Result4);
		Assert.assertEquals(Result4, ExpectedResult);
		
		//Verify News link is available on MG home page.
		String locator5=locatorReader.getLocator("Home.News");
		this.WaitForElementPresent(locator5, 10);
		Boolean Result5=isElementPresent(locatorReader.getLocator("Home.News"));
		System.out.println("Result1"+Result5);
		Assert.assertEquals(Result5, ExpectedResult);
		
		//Verify Contact us link is available on MG home page.
		String locator6=locatorReader.getLocator("Home.ContactUs");
		this.WaitForElementPresent(locator6, 10);
		Boolean Result6=isElementPresent(locatorReader.getLocator("Home.ContactUs"));
		System.out.println("Result1"+Result6);
		Assert.assertEquals(Result6, ExpectedResult);
		
	}
	
	//Verify spotlight components on new brand landing page.
	public void verifySpotlightComponent(String spotheight,String spotwidth)
	{
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand MG
		this.clickonBrandMG();
		//Verify spotLight
		this.spotLightComponents(spotheight,spotwidth);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Midas
		this.clickonBrandMidas();
		//Verify spotLight
		this.spotLightComponents(spotheight,spotwidth);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Klark
		this.clickonBrandKlark();
		//Verify spotLight
		this.spotLightComponents(spotheight,spotwidth);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Turbosound
		this.clickonBrandTurbosound();
		//Verify spotLight
		this.spotLightComponents(spotheight,spotwidth);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Behringer Brand 
		this.clickonBehringerBrand();
		//Verify spotLight
		this.spotLightComponents(spotheight,spotwidth);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Bugera
		this.clickonBrandBugera();
		//Verify spotLight
		this.spotLightComponents(spotheight,spotwidth);
	}
	
	//Verify spotlight components
	public void spotLightComponents(String spotheight,String spotwidth)
	{
		//Verify first spotlight
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Home.SpotLights.Spotlight1")));
		String spotlight1height = this.getCSS(locatorReader.getLocator("Home.SpotLights.Spotlight1"), "height");
		String spotlight1width = this.getCSS(locatorReader.getLocator("Home.SpotLights.Spotlight1"), "width");
		System.out.println("Height is " + spotlight1height);
		System.out.println("Height is " + spotlight1width);
		//Verify second spotlight
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Home.SpotLights.Spotlight2")));
		String spotlight2height = this.getCSS(locatorReader.getLocator("Home.SpotLights.Spotlight2"), "height");
		String spotlight2width = this.getCSS(locatorReader.getLocator("Home.SpotLights.Spotlight2"), "width");
		System.out.println("spotlight2height is " + spotlight2height);
		System.out.println("spotlight2width is " + spotlight2width);
		//Verify third spotlight
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Home.SpotLights.Spotlight3")));
		String spotlight3height = this.getCSS(locatorReader.getLocator("Home.SpotLights.Spotlight3"), "height");
		String spotlight3width = this.getCSS(locatorReader.getLocator("Home.SpotLights.Spotlight3"), "width");
		System.out.println("spotlight3height is " + spotlight3height);
		System.out.println("spotlight3width is " + spotlight3width);
		//Verify fourth spotlight
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Home.SpotLights.Spotlight4")));
		String spotlight4height = this.getCSS(locatorReader.getLocator("Home.SpotLights.Spotlight4"), "height");
		String spotlight4width = this.getCSS(locatorReader.getLocator("Home.SpotLights.Spotlight4"), "width");
		System.out.println("spotlight4height is " + spotlight4height);
		System.out.println("spotlight4width is " + spotlight4width);
	}
	//Verify billboard components
	public void billboardComponents(String billboardheight,String billboardwidth)
	{
		//Verify billboard height and width
		String billboardheight1 = this.getCSS(locatorReader.getLocator("Billboard.Billboardimage"), "height");
		String billboardwidth1 = this.getCSS(locatorReader.getLocator("Billboard.Billboardimage"), "width");
		System.out.println("billboardheight1" + billboardheight1);
		System.out.println("billboardwidth1" + billboardwidth1);
	}
	//Click on Community link.
	public void clickCommunityLink()
	{
		//Click on the Menu icon
		this.clickMenuIcon();
		
		//Click on a brand Behringer
		this.clickonBehringerBrand();
		
		//Click on Product link
		this.clickonCommunityLink();
	}
	//Verify Community page.
	public void verifyCommunityPage()
	{
		//Click on the Menu icon
		this.clickMenuIcon();
		
		//Click on a brand Behringer
		this.clickonBehringerBrand();
		
		String parentWindow = driver.getWindowHandle();
		
		//Click on Product link
		this.clickonCommunityLink();
		for(String winHandle : driver.getWindowHandles()) {
			  if (!parentWindow.equals(winHandle)) {
			    driver.switchTo().window(winHandle);
			    break;
			  }
			}
		//Verify buy now
		this.WaitForElementPresent(locatorReader.getLocator("Community.ClickBuyNow"), 30);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Community.ClickBuyNow")));
		//Verify Join US
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Community.ClickJoinUS")));
		//Verify Support link
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Community.ClickSupport")));
		//Verify Product link
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Community.ClickProduct")));	
	}
	
	//Verify billboard components on new brand landing page.
	public void verifybillboardComponent(String billboardheight,String billboardwidth)
	{
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand MG
		this.clickonBrandMG();
		//Verify billboard
		this.billboardComponents(billboardheight,billboardwidth);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Midas
		this.clickonBrandMidas();
		//Verify billboard
		this.billboardComponents(billboardheight,billboardwidth);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Klark
		this.clickonBrandKlark();
		//Verify billboard
		this.billboardComponents(billboardheight,billboardwidth);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Turbosound
		this.clickonBrandTurbosound();
		//Verify billboard
		this.billboardComponents(billboardheight,billboardwidth);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Behringer Brand 
		this.clickonBehringerBrand();
		//Verify billboard
		this.billboardComponents(billboardheight,billboardwidth);
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on Brand Bugera
		this.clickonBrandBugera();
		//Verify billboard
		this.billboardComponents(billboardheight,billboardwidth);
	}
}
