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

public class Discovery_Page_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public Discovery_Page_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("Discovery_Page.xml");
	}

	//Click on Menu icon 
	public void clickMenuIcon()
	{
		String locator = locatorReader.getLocator("DiscoverPage.MenuIcon");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	//Click on Brand Bugera
	public void clickonBrandBugera()
	{
		String locator = locatorReader.getLocator("DiscoverPage.ClickBrandBehringer");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	//Click on First product
	public void SearchProduct()
	{
		//String locator = locatorReader.getLocator("DiscoverPage.ClickonProduct");
		String locator = locatorReader.getLocator("DiscoverPage.entertextinserachfield");
		this.WaitForElementEnabled(locator, 50);
		String val = "Digital Mixer X32";
		clickOn(locator);
		sendKeys(locator, val);
		presEnterKey(locator);
		

	}
	
	public void clickproduct()
	{
			
		String locator = locatorReader.getLocator("DiscoverPage.ClickBehringerx32Product");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
			
		
	}
	//Click on Discovery
	public void clickonDiscovery()
	{
		String locator = locatorReader.getLocator("DiscoverPage.clickdiscoverlink");
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
	//Reach upto Discover page(Behringer)
	public void ReachUptoDiscoveryPage()
	{
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on a brand
		this.clickonBrandBugera();
		//Enter product name in serach field
		this.SearchProduct();
		// Click Product 
		this.clickproduct();
		
		//Click on Discovery
		this.clickonDiscovery();
		//Check page not found
		this.checkPageNotFound();	
	}
	
	//Verify Discovery page
	public void verifyDiscoveryPage(String vSpace1height,String vSpace4height, String textField11width, String textField11height,  String textField10width, String textField10height, String vSpace2height, String iconwidth, String iconheight, String FixedBowwidth, String FixedBowheight, String Gutter16Width, String textSpaceheight, String vSpace3Height, String subheadLeading, String TextSpace5Height)
	{
		//Reach upto Discovery page(Behringer)
		ReachUptoDiscoveryPage();
		int count = 0;
		//Verify Discovery link is available
		this.WaitForElementPresent(locatorReader.getLocator("DiscoverPage.DiscoverLink"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("DiscoverPage.DiscoverLink")));
		waitForElementLoad(20);
		//Verify V Space1 has the height of 70px
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.dcvSpace1height");
			String padding_top = this.getCSS(locator, "margin-top");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String padding_top_wopx = padding_top.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(font_size_wopx)-Integer.parseInt(line_height_wopx);

			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1-Integer.parseInt("4");
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, vSpace1height);
		}
		
		catch(Exception ex)
		{
			System.out.println("V Space 1>>Expected height:70px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Space 1>>Expected height:70px");
			count = count +1;
		}
		//Verify VSpace 4 has the height of 40px
		try
		{
			
			String locator = locatorReader.getLocator("VerifyPixels.dcvSpace1height");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			int getsubpixel1=Integer.parseInt(font_size_wopx)-Integer.parseInt(line_height_wopx);
			
			String locator1 = locatorReader.getLocator("VerifyPixels.dcvSpace4height");
			String padding_top = this.getCSS(locator1, "margin-top");
			String padding_top_wopx = padding_top.substring(0, 2);
			int getfinalvalue1=getsubpixel1+Integer.parseInt(padding_top_wopx)-Integer.parseInt("7");
			String getfinalvalue=getfinalvalue1+"px";
			System.out.println("Actual Result:" + getfinalvalue);
			Assert.assertEquals(getfinalvalue, vSpace4height);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("V Space 4>>Expected height:40px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Space 4>>Expected height:40px");
			count = count +1;
		}
		
		//Verify fixed box image has the width of 980px and height 553px.
		
		try
		{
			
			String locator = locatorReader.getLocator("VerifyPixels.dcvSpace4height");
			String width = this.getCSS(locator, "width");
		
			System.out.println("Actual Result:" + width);
			Assert.assertEquals(width, FixedBowwidth);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("FixedBowwidth Exception >>Expected width:980px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("FixedBowwidth Error>>Expected height:980px");
			count = count +1;
		}
			
		//Verify fixed box image has the width of 980px and height 553px.
		
		try
		{
			
			String locator = locatorReader.getLocator("VerifyPixels.dcvSpace4height");
			String height = this.getCSS(locator, "height");
		
			System.out.println("Actual Result:" + height);
			Assert.assertEquals(height, FixedBowheight);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("FixedBowheight Exception>>Expected height:553px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("FixedBowheight Exception>>Expected height:553px");
			count = count +1;
		}
		
		//Verify VSpace 4 has the height of 40px ( Above Product Overview)
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.vspace4HeightaboveProductoverview");
			String padding_top = this.getCSS(locator, "margin-top");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String padding_top_wopx = padding_top.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(font_size_wopx)-Integer.parseInt(line_height_wopx);

			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1-Integer.parseInt("4");
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, vSpace4height);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("V Space 4>>Expected height:40px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Space 4>>Expected height:40px");
			count = count +1;
		}
		
		//Verify VSpace 4 has the height of 40px ( Above Product Overview)
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.vspace4HeightaboveProductoverview");
			String padding_top = this.getCSS(locator, "margin-bottom");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String padding_top_wopx = padding_top.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(font_size_wopx)-Integer.parseInt(line_height_wopx);

			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1-Integer.parseInt("4");
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, vSpace4height);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("V Space 4>>Expected height:40px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Space 4>>Expected height:40px");
			count = count +1;
		}
		
		//Verify vSpace3Height has the height of 50px.
		
		try
		{
			
			String locator = locatorReader.getLocator("VerifyPixels.vSpace3Height1col");
			String padding_top = this.getCSS(locator, "padding-top");
		
			System.out.println("Actual Result:" + padding_top);
			Assert.assertEquals(padding_top,vSpace3Height);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("vSpace3Height Exception>>Expected height:50px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("vSpace3Heigt Error>>Expected height:50px");
			count = count +1;
		}
	
	//Verify Gutter16Width has the height of 34px.
		
		try
		{
			
			String locator = locatorReader.getLocator("VerifyPixels.vSpace3Height1col");
			String padding_right = this.getCSS(locator, "padding-right");
		
			System.out.println("Actual Result:" + padding_right);
			Assert.assertEquals(padding_right,Gutter16Width);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("Gutter16Width Exception>>Expected height:34px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Gutter16Width Error>>Expected height:34px");
			count = count +1;
		}

		//Verify Gutter16Width has the height of 34px.
		
		try
		{
			
			String locator = locatorReader.getLocator("VerifyPixels.vSpace3Height1col");
			String padding_right = this.getCSS(locator, "padding-left");
		
			System.out.println("Actual Result:" + padding_right);
			Assert.assertEquals(padding_right,Gutter16Width);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("Gutter16Width Exception>>Expected height:34px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Gutter16Width Error>>Expected height:34px");
			count = count +1;
		}
		
		//Verify VSpace 2 has the height of 20px (With in First Image column)
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.vspace2Heightbelowcolimage");
			String padding_top = this.getCSS(locator, "margin-top");
			String padding_top_wopx = padding_top.substring(0, 2);
			int getaddpixel=Integer.parseInt(padding_top_wopx)+Integer.parseInt("4");
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, vSpace2height);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("vSpace2height Exception >>Expected height:20px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("vSpace2height Error >>Expected height:20px");
			count = count +1;
		}
		//Verify VSpace 2 has the height of 20px (With in First Image column above text)
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.vspace2Heightbelowcolimage");
			String padding_top = this.getCSS(locator, "padding-top");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String padding_top_wopx = padding_top.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1-Integer.parseInt("2");
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, vSpace2height);
			
		}
		
		catch(Exception ex)
		{
			System.out.println("vSpace2height Exception >>Expected height:20px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("vSpace2height Error >>Expected height:20px");
			count = count +1;
		}
				
		//Verify TextSpace5Height has the height of 13px (With in First Image column above text)
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.vspace2Heightbelowcolimage");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);

			int getaddpixel=getsubpixel1+Integer.parseInt("2");
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, TextSpace5Height);
			
		}
		catch(Exception ex)
		{
			System.out.println("TextSpace5Height Exception >>Expected height:13px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("TextSpace5Height Error >>Expected height:13px");
			count = count +1;
		}


		//Verify vSpace3Height has the height of 50px.
		try
		{
			
			String locator = locatorReader.getLocator("VerifyPixels.vSpace3Height1col");
			String padding_top = this.getCSS(locator, "padding-bottom");
			String padding_top_wopx = padding_top.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vspace2Heightbelowcolimage");
			String font_size = this.getCSS(locator1, "font-size");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1+Integer.parseInt("6");
			String getFinalValue=getaddpixel+"px";
				
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue,vSpace3Height);
		
		}
		catch(Exception ex)
		{
			System.out.println("vSpace3Height Exception>>Expected height:50px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("vSpace3Heigt Error>>Expected height:50px");
			count = count +1;
		}
		//Verify VSpace 2 has the height of 20px (With in First Image column above text)
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.vspace2Heightbelowcolimage");
			String padding_top = this.getCSS(locator, "padding-top");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String padding_top_wopx = padding_top.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1-Integer.parseInt("2");
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, vSpace2height);
			
		}
		
		catch(Exception ex)
		{
			System.out.println("vSpace2height Exception >>Expected height:20px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("vSpace2height Error >>Expected height:20px");
			count = count +1;
		}
		
		//Verify vSpace4height has the height of 40px (Above see all videos)
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4Heightbelowseellvideos");
			String padding_top = this.getCSS(locator, "margin-top");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String padding_top_wopx = padding_top.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(font_size_wopx)-Integer.parseInt(line_height_wopx);
			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1-Integer.parseInt("4");
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, vSpace4height);
			
		}
		
		catch(Exception ex)
		{
			System.out.println("vSpace4height Exception >>Expected height:40px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("vSpace4height Error >>Expected height:40px");
			count = count +1;
		}
				
		//Verify vSpace4height has the height of 40px (Above see all videos)
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4Heightbelowseellvideos");
			String padding_top = this.getCSS(locator, "margin-bottom");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String padding_top_wopx = padding_top.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(font_size_wopx)-Integer.parseInt(line_height_wopx);
			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1-Integer.parseInt("4");
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, vSpace4height);
			
		}
		
		catch(Exception ex)
		{
			System.out.println("vSpace4height Exception >>Expected height:40px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("vSpace4height Error >>Expected height:40px");
			count = count +1;
		}
		//Verify vSpace1height has the height of 40px (Above see all videos)
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Heightfooter");
			String padding_top = this.getCSS(locator, "margin-top");
			
			System.out.println("Actual Result:" + padding_top);
			Assert.assertEquals(padding_top, vSpace1height);
			
		}
		
		catch(Exception ex)
		{
			System.out.println("vSpace1height Exception >>Expected height:70px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("vSpace1height Error >>Expected height:70px");
			count = count +1;
		}
//Verify the final result
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);	
	}
}
