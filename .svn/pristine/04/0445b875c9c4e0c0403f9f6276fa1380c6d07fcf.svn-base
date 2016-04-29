/*==============================================================================================================================
 File Name    : Product_Feature_Helper.java
 ClassName    : Product_Feature_Helper
 Summary      : Contains helping methods for Product Feature Page.
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

public class Product_Feature_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public Product_Feature_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("Product_Feature.xml");
	}

	//Click on Menu icon 
	public void clickMenuIcon()
	{
		String locator = locatorReader.getLocator("ProductFeaturePage.MenuIcon");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	//Click on Brand Bugera
	public void clickonBrandBugera()
	{
		String locator = locatorReader.getLocator("ProductFeaturePage.ClickBrandBugera");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	//Click on product
	public void clickonProduct()
	{
		String locator = locatorReader.getLocator("ProductFeaturePage.ClickonProduct");
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
	//Reach upto Product Feature page(Bugera)
	public void ReachUptoFeaturePage()
	{
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on a brand
		this.clickonBrandBugera();
		//Click on a product
		this.clickonProduct();
		//Check page not found
		this.checkPageNotFound();
	}
	
	//Verify Product Feature page
	public void verifyFeaturePage(String height , String width, String thumbheight, String thumbwidth, String ThumbGap, String ProductImagewidth, String VSpace1height, String ParaSpace1_height, String SubhLead_height, String BodycopyLed_height, String Paraspace2_height, String HSeparator_width, String HSeparator_height, String CallBodyCopHeight, String CallBodyCopwidth, String CallBox_imgheight, String CallBox_imgwidth, String HeadlineLead_height)
	{
		//Reach upto Product Feature page(Bugera)
		ReachUptoFeaturePage();
		int count = 0;
		try{
		//Verify product logo is available
		this.WaitForElementPresent(locatorReader.getLocator("ProductFeaturePage.ProductLogo"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("ProductFeaturePage.ProductLogo")));
		}
		catch(Exception ex)
		{
			System.out.println("Product logo not found");
			count = count +1;
		}
		try
		{
		//Verify support link is available
		this.WaitForElementPresent(locatorReader.getLocator("ProductFeaturePage.SupportLink"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("ProductFeaturePage.SupportLink")));
		}
		catch(Exception ex)
		{
			System.out.println("Support link not found");
			count = count +1;
		}
		//Verify product search field is available
		this.WaitForElementPresent(locatorReader.getLocator("ProductFeaturePage.SearchField"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("ProductFeaturePage.SearchField")));
		//Verify Feature link is available
		this.WaitForElementPresent(locatorReader.getLocator("ProductFeaturePage.FeaturesLink"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("ProductFeaturePage.FeaturesLink")));
		//Verify Reviews link is available
		this.WaitForElementPresent(locatorReader.getLocator("ProductFeaturePage.ReviewsLink"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("ProductFeaturePage.ReviewsLink")));
		//Verify Discover link is available
		this.WaitForElementPresent(locatorReader.getLocator("ProductFeaturePage.DiscoverLink"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("ProductFeaturePage.DiscoverLink")));
		//Verify Downloads link is available
		this.WaitForElementPresent(locatorReader.getLocator("ProductFeaturePage.DownloadsLink"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("ProductFeaturePage.DownloadsLink")));
		//Verify Buy Now link is available
		this.WaitForElementPresent(locatorReader.getLocator("ProductFeaturePage.BuyNow"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("ProductFeaturePage.BuyNow")));
		waitForElementLoad(20);
		//Verify Feature Billboard is visible and have Width:980px
		try
		{
			String imgwidth = this.getCSS("VerifyPixels.imgwidth", "width");
			System.out.println("Actual Width:" + imgwidth);
			Assert.assertEquals(imgwidth, width);
		}
		
		catch(Exception ex)
		{
			System.out.println("Feature Billboard>>Expected Width:980px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Feature Billboard>>Expected Width:980px");
			count = count +1;
		}
		//Verify Feature Billboard is visible and have Height:646px
		try
		{
			String imgheight = this.getCSS("VerifyPixels.imgheight", "height");	
			System.out.println("Actual Height:" + imgheight );
			Assert.assertEquals(imgheight, height);
		}
		
		catch(Exception ex)
		{
			System.out.println("Feature Billboard>>Expected Height:646px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Feature Billboard>>Expected Height:646px");
			count = count +1;
		}
		//Verify gallery thumb size is of Width 115px.
		try
		{
			String gallimgwidth = this.getCSS("VerifyPixels.gallimgwidth", "width");
			System.out.println("Actual Width: "+ gallimgwidth);
			Assert.assertEquals(gallimgwidth, thumbwidth);
		}
		catch(Exception ex)
		{
			System.out.println("gallery thumb size>>Expected Width:115px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("gallery thumb size>>Expected Width:115px");
			count = count +1;
		}
		//Verify gallery thumb size is of Height 87px on product feature page.
		try
		{
			String gallimgheight = this.getCSS("VerifyPixels.gallimgheight", "height");
			System.out.println("Actual Height: " + gallimgheight);
			Assert.assertEquals(gallimgheight, thumbheight);
		}
		catch(Exception ex)
		{
			System.out.println("gallery thumb size>>Expected Height:87px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("gallery thumb size>>Expected Height:87px");
			count = count +1;
		}
		//Verify the thumb gap is 14px in Gallary images on product feature page.
		try
		{
			String padding_right = this.getCSS("VerifyPixels.padding_right", "padding-right");
			String padding_left = this.getCSS("VerifyPixels.padding_left", "padding-left");
			System.out.println("Actual " +padding_right );
			Assert.assertEquals(padding_right, ThumbGap);
			Assert.assertEquals(padding_left, ThumbGap);
		}
		catch(Exception ex)
		{
			System.out.println("thumb gap>>Expected:14px" );
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("thumb gap>>Expected:14px");
			count = count +1;
		}
		//Verify that Gallary thumb space have the height of 19px on product feature page.	
		try
		{
			String Gallarythumbspace = this.getCSS("VerifyPixels.Gallarythumbspace", "margin-bottom");
			System.out.println("Actual Height:" +Gallarythumbspace);
			Assert.assertEquals(Gallarythumbspace, "19px");
		}
		catch(Exception ex)
		{
			System.out.println("thumb space height Expected:19px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("thumb space height Expected:19px");
			count = count +1;
		}
		//Verify the V Space 1 has the height of 70px on product feature page.
		try
		{
			String V_Space1height = this.getCSS("VerifyPixels.V_Space1height", "padding-bottom");
			System.out.println("Actual height: "+V_Space1height);
			Assert.assertEquals(V_Space1height, VSpace1height);
		}
		catch(Exception ex)
		{
			System.out.println("V Space 1 Expected height:70px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Space 1 Expected height:70px");
			count = count +1;
		}
		//Verify the Product Main image has the Width of 450 px on product feature page.
		try
		{
			String ProductImage_width = this.getCSS("VerifyPixels.ProductImage_width", "width");
			System.out.println("Actual Width:"+ProductImage_width);
			Assert.assertEquals(ProductImage_width, ProductImagewidth);
		}
		catch(Exception ex)
		{
			System.out.println("Product Main image Expected Width:450px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Product Main image Expected Width:450px");
			count = count +1;
		}
		//Verify the Paragraph Space 1 has the height of 35 px on product feature page.
		try
		{
			String ParagraphSpace1_height = this.getCSS("VerifyPixels.ParagraphSpace1_height", "line-height");
			System.out.println("Actual height:"+ParagraphSpace1_height);
			Assert.assertEquals(ParagraphSpace1_height, ParaSpace1_height);
		}
		catch(Exception ex)
		{
			System.out.println("Paragraph Space 1 Expected height:35px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Paragraph Space 1 Expected height:35px");
			count = count +1;
		}
		//Verify the Subhead Leading has the height of 13 px on product feature page. 
		try
		{
			String SubheadLeading_height = this.getCSS("VerifyPixels.SubheadLeading_height", "line-height");
			System.out.println("Actual height: "+SubheadLeading_height );
			Assert.assertEquals(SubheadLeading_height, SubhLead_height);
		}
		catch(Exception ex)
		{
			System.out.println("Subhead Leading Expected height:13px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Subhead Leading Expected height:13px");
			count = count +1;
		}
		//Verify the Body copy Leading has the height of 17 px on product feature page.
		try
		{
			String BodycopyLeading_height = this.getCSS("VerifyPixels.BodycopyLeading_height", "margin-bottom");
			System.out.println("Actual Height:" +BodycopyLeading_height );
			Assert.assertEquals(BodycopyLeading_height, BodycopyLed_height);
		}
		catch(Exception ex)
		{
			System.out.println("Body copy Leading Expected height:17px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Body copy Leading Expected height:17px");
			count = count +1;
		}
		//Verify the Paragraph space 2 has the height of 23 px on product feature page.
		try
		{
			String Paragraphspace2_height = this.getCSS("VerifyPixels.Paragraphspace2_height", "line-height");
			System.out.println("Actual Height" + Paragraphspace2_height);
			Assert.assertEquals(Paragraphspace2_height, Paraspace2_height);
		}
		catch(Exception ex)
		{
			System.out.println("Paragraph space 2 Expected height:23px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Paragraph space 2 Expected height:23px");
			count = count +1;
		}
		//Verify H-Separator has the width of 980 px on product feature page.
		try
		{
			String H_Separator_width = this.getCSS("VerifyPixels.H_Separator_width", "width");
			System.out.println("Actual Widht :" +H_Separator_width );
			Assert.assertEquals(H_Separator_width, HSeparator_width);
		}
		catch(Exception ex)
		{
			System.out.println("H-Separator Expected width:980px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("H-Separator Expected width:980px ");
			count = count +1;
		}
		//Verify H-Separator has the height of 1 px on product feature page.
		try
		{
			String H_Separator_height = this.getCSS("VerifyPixels.H_Separator_height", "border-top-width");
			System.out.println(" Actual height:" +H_Separator_height );
			Assert.assertEquals(H_Separator_height, HSeparator_height);
		}
		catch(Exception ex)
		{
			System.out.println("H-Separator Expected height:1px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("H-Separator Expected height:1px");
			count = count +1;
		}
		//Verify the Callout Body Copy has the width of 450 px on product feature page.
		try
		{
			String CalloutBodyCopyWidth = this.getCSS("VerifyPixels.CalloutBodyCopyWidth", "width");
			System.out.println("Actual Width:" +CalloutBodyCopyWidth);
			Assert.assertEquals(CalloutBodyCopyWidth, CallBodyCopwidth);
		}
		catch(Exception ex)
		{
			System.out.println("Callout Body Copy Expected width:450px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Callout Body Copy Expected width:450px");
			count = count +1;
		}
		//Verify the Callout Body Copy has the height is less than 450 px on product feature page.
		try
		{
			String CalloutBodyCopyHeight = this.getCSS("VerifyPixels.CalloutBodyCopyHeight", "height");
			System.out.println("Actual Height:" +CalloutBodyCopyHeight );
			Assert.assertEquals(CalloutBodyCopyHeight, CallBodyCopHeight);
		}
		catch(Exception ex)
		{
			System.out.println("Callout Body Copy Expected height:450px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Callout Body Copy Expected height:450px");
			count = count +1;
		}
		//Verify the Gutter has the width of 80 px on product feature page.
		try
		{
			String Gutter_Widthleft = this.getCSS("VerifyPixels.Gutter_Widthleft", "padding-left");
			String Gutter_Widthright = this.getCSS("VerifyPixels.Gutter_Widthright", "padding-right");
			System.out.println("Actual Width: "+Gutter_Widthleft );
			Assert.assertEquals(Gutter_Widthleft, "40px");
			Assert.assertEquals(Gutter_Widthright, "40px");
		}
		catch(Exception ex)
		{
			System.out.println("Gutter Expected width:80px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Gutter Expected width:80px");
			count = count +1;
		}
		//Verify the Callout Box image has the width 450 px on product feature page.
		try
		{
			String CalloutBoximgwidth = this.getCSS("VerifyPixels.CalloutBoximgwidth", "width");
			System.out.println("Actual Width:" +CalloutBoximgwidth );
			Assert.assertEquals(CalloutBoximgwidth, CallBox_imgwidth);
		}
		catch(Exception ex)
		{
			System.out.println("Callout Box image Expected width:450px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Callout Box image Expected width:450px");
			count = count +1;
		}
		//Verify the Callout Box image has the height 450 px on product feature page.
		try
		{
			String CalloutBox_imgheight = this.getCSS("VerifyPixels.CalloutBox_imgheight", "height");
			System.out.println("Actual Height:"+CalloutBox_imgheight );
			Assert.assertEquals(CalloutBox_imgheight,CallBox_imgheight);
		}
		catch(Exception ex)
		{
			System.out.println("Callout Box image Expected height:450px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Callout Box image Expected height:450px");
			count = count +1;
		}
		//Verify the Headline Leading has the Height 22 px on product feature page. 
		try
		{
			String HeadlineLeading_height = this.getCSS("VerifyPixels.HeadlineLeading_height", "margin-bottom");
			System.out.println("Actual Height :" +HeadlineLeading_height );
			Assert.assertEquals(HeadlineLeading_height, HeadlineLead_height);
		}
		catch(Exception ex)
		{
			System.out.println("Headline Leading Expected Height:22px" );
			count = count +1;
		}	
		catch(Error ex)
		{
			System.out.println("Headline Leading Expected Height:22px");
			count = count +1;
		}
		//Verify the classic push has the space of 35 px
		try
		{
			String classicpush_height = this.getCSS("VerifyPixels.classicpush_height", "margin-bottom");
			System.out.println("Actual Space:"+classicpush_height );
			Assert.assertEquals(classicpush_height, "35px");
		}
		catch(Exception ex)
		{
			System.out.println("classic push Expected space:35px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("classic push Expected space:35px");
			count = count +1;
		}	
		//Verify the paragraph of classic push has the height of 17 px
		try
		{
			String classicpushpara_height = this.getCSS("VerifyPixels.classicpushpara_height", "line-height");
			System.out.println("Actual height:"+classicpushpara_height );
			Assert.assertEquals(classicpushpara_height, "17px");
		}
		catch(Exception ex)
		{
			System.out.println("paragraph of classic push Expected height:17px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("paragraph of classic push Expected height:17px");
			count = count +1;
		}
		//Verify classic push image has the height of 450px.  
		try
		{
			String classicpushimg_height = this.getCSS("VerifyPixels.classicpushimg_height", "height");
			System.out.println("Actual height:"+classicpushimg_height );
			Assert.assertEquals(classicpushimg_height, "450px");
		}
		catch(Exception ex)
		{
			System.out.println("classic push image Expected height:450px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("classic push image Expected height:450px");
			count = count +1;
		}
		//Verify classic push image has the width of 450 px.  
		try
		{
			String classicpushimg_width = this.getCSS("VerifyPixels.classicpushimg_width", "width");
			System.out.println("Actual width:"+classicpushimg_width);
			Assert.assertEquals(classicpushimg_width, "450px");
		}
		catch(Exception ex)
		{
			System.out.println("classic push image Expected width:450px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("classic push image Expected width:450px");
			count = count +1;
		}
		//Verify Infinium Tube Life has the headline heading of 22px
		try
		{
			String InfiniumTube_height = this.getCSS("VerifyPixels.InfiniumTube_height", "line-height");
			System.out.println("Actual headline heading"+InfiniumTube_height );
			Assert.assertEquals(InfiniumTube_height, "22px");
		}
		catch(Exception ex)
		{
			System.out.println("Infinium Tube Life Expected headline heading:22px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Infinium Tube Life Expected headline heading:22px");
			count = count +1;
		}
		//Verify Infinium Tube Life image has the height of 450px.
		try
		{
			String InfiniumTubeimg_height = this.getCSS("VerifyPixels.InfiniumTubeimg_height", "height");
			System.out.println("Actual height:"+InfiniumTubeimg_height);
			Assert.assertEquals(InfiniumTubeimg_height, "450px");
		}
		catch(Exception ex)
		{
			System.out.println("Infinium Tube Life image Expected height:450px" );
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Infinium Tube Life image Expected height:450px");
			count = count +1;
		}	
		//Verify Infinium Tube Life image has the width of 450px.
		try
		{
			String InfiniumTubeimg_width = this.getCSS("VerifyPixels.InfiniumTubeimg_width", "width");
			System.out.println("Actual width:"+InfiniumTubeimg_width );
			Assert.assertEquals(InfiniumTubeimg_width, "450");
		}
		catch(Exception ex)
		{
			System.out.println("Infinium Tube Life image Expected width:450px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Infinium Tube Life image Expected width:450px");
			count = count +1;
		}
		//Verify the top margin of the link "less" is 35 px(It is not shown for now)
		//Verify the Morphing has the line spacing of 22px(It is not shown as per mock)
		
		//Verify the final result
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);
		
		
	}
	
	//Verify Product Feature page
	public void verifyWarrantyTermsConditions(String height , String width, String thumbheight, String thumbwidth, String ThumbGap, String ProductImagewidth, String VSpace1height, String ParaSpace1_height, String SubhLead_height, String BodycopyLed_height, String Paraspace2_height, String HSeparator_width, String HSeparator_height, String CallBodyCopHeight, String CallBodyCopwidth, String CallBox_imgheight, String CallBox_imgwidth, String HeadlineLead_height)
	{
		//Reach upto Product Feature page(Bugera)
		ReachUptoFeaturePage();
		int count = 0;
		waitForElementLoad(20);
		
		//Click on learn more link
		
		//Click on Terms and conditions
		
		
		
		
		//Verify VSpace1 height is 70px.
		try
		{
			String VwtSpace1height = this.getCSS("VerifyPixels.imgwidth", "height");
			System.out.println("Actual height:" + VwtSpace1height);
			Assert.assertEquals(VwtSpace1height, height);
		}
		
		catch(Exception ex)
		{
			System.out.println("VSpace1height>>Expected height:70px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("VSpace1height>>Expected height:70px");
			count = count +1;
		}
		//Fixed Box image has the height of 243px and width of 236px.
		try
		{
			String FixedBoximageheight = this.getCSS("VerifyPixels.imgheight", "height");	
			String FixedBoximagewidth = this.getCSS("VerifyPixels.imgheight", "width");	
			System.out.println("Actual Height:" + FixedBoximageheight );
			System.out.println("Actual Width:" + FixedBoximagewidth );
			Assert.assertEquals(FixedBoximageheight, height);
			Assert.assertEquals(FixedBoximagewidth, height);
		}
		
		catch(Exception ex)
		{
			System.out.println("FixedBoximageheight>>Expected height:243px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("FixedBoximagewidth>>Expected width:236px");
			count = count +1;
		}
		//Verify gutter49 has the width of 37px.
		try
		{
			String gutter49width = this.getCSS("VerifyPixels.gallimgwidth", "width");
			System.out.println("Actual Width: "+ gutter49width);
			Assert.assertEquals(gutter49width, thumbwidth);
		}
		catch(Exception ex)
		{
			System.out.println("gutter49width>>Expected Width:37px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("gutter49width>>Expected Width:37px");
			count = count +1;
		}
		//Verify blocklistB has the width of 150px.
		try
		{
			String blocklistBwidth = this.getCSS("VerifyPixels.gallimgheight", "height");
			System.out.println("Actual width: " + blocklistBwidth);
			Assert.assertEquals(blocklistBwidth, thumbheight);
		}
		catch(Exception ex)
		{
			System.out.println("blocklistB width>>Expected width:150px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("blocklistB width>>Expected width:150px");
			count = count +1;
		}
		//Verify textspace1 has the height of 35 px.
		try
		{
			String textspace1height = this.getCSS("VerifyPixels.padding_right", "height");
			System.out.println("Actual " +textspace1height );
			Assert.assertEquals(textspace1height, ThumbGap);
		}
		catch(Exception ex)
		{
			System.out.println("textspace1height>>Expected:35px" );
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("textspace1height>>Expected:35px");
			count = count +1;
		}
		//Verify TextSpace5 has the height of 13px.
		try
		{
			String TextSpace5height = this.getCSS("VerifyPixels.Gallarythumbspace", "height");
			System.out.println("Actual Height:" +TextSpace5height);
			Assert.assertEquals(TextSpace5height, height);
		}
		catch(Exception ex)
		{
			System.out.println("TextSpace5height height Expected:13px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("TextSpace5height height Expected:13px");
			count = count +1;
		}
		//Again verify that Text Space1 has the height of 35 px.
		try
		{
			String TextSpace1_01height = this.getCSS("VerifyPixels.V_Space1height", "height");
			System.out.println("Actual height: "+TextSpace1_01height);
			Assert.assertEquals(TextSpace1_01height, VSpace1height);
		}
		catch(Exception ex)
		{
			System.out.println("TextSpace1_01height:35px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("TextSpace1_01height:35px");
			count = count +1;
		}

		//Verify Text space 2 has the height of 23px.
		try
		{
			String TextSpace2height = this.getCSS("VerifyPixels.ProductImage_width", "height");
			System.out.println("Actual Width:"+TextSpace2height);
			Assert.assertEquals(TextSpace2height, ProductImagewidth);
		}
		catch(Exception ex)
		{
			System.out.println("TextSpace2height:23px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("TextSpace2height:23px");
			count = count +1;
		}

		//Verify Text Space 3 has the height of 17px.
		try
		{
			String TextSpace3height = this.getCSS("VerifyPixels.ParagraphSpace1_height", "height");
			System.out.println("Actual height:"+TextSpace3height);
			Assert.assertEquals(TextSpace3height, ParaSpace1_height);
		}
		catch(Exception ex)
		{
			System.out.println("TextSpace3height Expected height:17px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("TextSpace3height Expected height:17px");
			count = count +1;
		}

		//Verify Gutter62 has the width of 25px.
		try
		{
			String Gutter62_width = this.getCSS("VerifyPixels.SubheadLeading_height", "width");
			System.out.println("Actual width: "+Gutter62_width );
			Assert.assertEquals(Gutter62_width, SubhLead_height);
		}
		catch(Exception ex)
		{
			System.out.println("Gutter62_width Expected width:25px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Gutter62_width Expected width:25px");
			count = count +1;
		}

		//Verify Block list B has the width of 150px.
		try
		{
			String BodycopyLeading_height = this.getCSS("VerifyPixels.BodycopyLeading_height", "margin-bottom");
			System.out.println("Actual Height:" +BodycopyLeading_height );
			Assert.assertEquals(BodycopyLeading_height, BodycopyLed_height);
		}
		catch(Exception ex)
		{
			System.out.println("Body copy Leading Expected height:17px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Body copy Leading Expected height:17px");
			count = count +1;
		}

		//Again verify Block list B has the width of 150px.
		try
		{
			String Paragraphspace2_height = this.getCSS("VerifyPixels.Paragraphspace2_height", "line-height");
			System.out.println("Actual Height" + Paragraphspace2_height);
			Assert.assertEquals(Paragraphspace2_height, Paraspace2_height);
		}
		catch(Exception ex)
		{
			System.out.println("Paragraph space 2 Expected height:23px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Paragraph space 2 Expected height:23px");
			count = count +1;
		}

		//Again verify Block list B has the width of 150px.
		try
		{
			String H_Separator_width = this.getCSS("VerifyPixels.H_Separator_width", "width");
			System.out.println("Actual Widht :" +H_Separator_width );
			Assert.assertEquals(H_Separator_width, HSeparator_width);
		}
		catch(Exception ex)
		{
			System.out.println("H-Separator Expected width:980px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("H-Separator Expected width:980px ");
			count = count +1;
		}

		//Again verify Block list B has the width of 150px.
		try
		{
			String H_Separator_height = this.getCSS("VerifyPixels.H_Separator_height", "border-top-width");
			System.out.println(" Actual height:" +H_Separator_height );
			Assert.assertEquals(H_Separator_height, HSeparator_height);
		}
		catch(Exception ex)
		{
			System.out.println("H-Separator Expected height:1px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("H-Separator Expected height:1px");
			count = count +1;
		}

		//Again verify text space 1 has the height of 35 px.
		try
		{
			String CalloutBodyCopyWidth = this.getCSS("VerifyPixels.CalloutBodyCopyWidth", "width");
			System.out.println("Actual Width:" +CalloutBodyCopyWidth);
			Assert.assertEquals(CalloutBodyCopyWidth, CallBodyCopwidth);
		}
		catch(Exception ex)
		{
			System.out.println("Callout Body Copy Expected width:450px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Callout Body Copy Expected width:450px");
			count = count +1;
		}

		//Again verify text space 1 has the height of 35 px.
		try
		{
			String CalloutBodyCopyHeight = this.getCSS("VerifyPixels.CalloutBodyCopyHeight", "height");
			System.out.println("Actual Height:" +CalloutBodyCopyHeight );
			Assert.assertEquals(CalloutBodyCopyHeight, CallBodyCopHeight);
		}
		catch(Exception ex)
		{
			System.out.println("Callout Body Copy Expected height:450px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Callout Body Copy Expected height:450px");
			count = count +1;
		}

		//Verify Gutter A 65 has the width of 27px.
		try
		{
			String Gutter_Widthleft = this.getCSS("VerifyPixels.Gutter_Widthleft", "padding-left");
			String Gutter_Widthright = this.getCSS("VerifyPixels.Gutter_Widthright", "padding-right");
			System.out.println("Actual Width: "+Gutter_Widthleft );
			Assert.assertEquals(Gutter_Widthleft, "40px");
			Assert.assertEquals(Gutter_Widthright, "40px");
		}
		catch(Exception ex)
		{
			System.out.println("Gutter Expected width:80px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Gutter Expected width:80px");
			count = count +1;
		}

		//Verify Gutter A 65 has the width of 27px.
		try
		{
			String CalloutBoximgwidth = this.getCSS("VerifyPixels.CalloutBoximgwidth", "width");
			System.out.println("Actual Width:" +CalloutBoximgwidth );
			Assert.assertEquals(CalloutBoximgwidth, CallBox_imgwidth);
		}
		catch(Exception ex)
		{
			System.out.println("Callout Box image Expected width:450px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Callout Box image Expected width:450px");
			count = count +1;
		}

		//Again verify text space 1 has the height of 35px.
		try
		{
			String CalloutBox_imgheight = this.getCSS("VerifyPixels.CalloutBox_imgheight", "height");
			System.out.println("Actual Height:"+CalloutBox_imgheight );
			Assert.assertEquals(CalloutBox_imgheight,CallBox_imgheight);
		}
		catch(Exception ex)
		{
			System.out.println("Callout Box image Expected height:450px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Callout Box image Expected height:450px");
			count = count +1;
		}
		//Again verify that V Space1 has the height is 70px.
		try
		{
			String HeadlineLeading_height = this.getCSS("VerifyPixels.HeadlineLeading_height", "margin-bottom");
			System.out.println("Actual Height :" +HeadlineLeading_height );
			Assert.assertEquals(HeadlineLeading_height, HeadlineLead_height);
		}
		catch(Exception ex)
		{
			System.out.println("Headline Leading Expected Height:22px" );
			count = count +1;
		}	
		catch(Error ex)
		{
			System.out.println("Headline Leading Expected Height:22px");
			count = count +1;
		}
		
		//Verify the final result
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);
		
		
	}
}
