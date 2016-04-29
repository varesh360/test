package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class NoResultPage_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public NoResultPage_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("NoResult.xml");
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
		String locator = locatorReader.getLocator("NoResultPage.entertextinserachfield");
		this.WaitForElementEnabled(locator, 50);
		String val ="xxcnbxcbsdf";
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
	//Reach upto NoResultPage
	public void ReachUptoNoResultPage()
	{
		this.SearchProduct();
		//Check page not found
		this.checkPageNotFound();	
	}
	
	//Verify no result page
	
	public void verifynoresultpage(String TextSpace5Height, String Gutter50Width,String TextSpace1Height, String vSpace2Height)
	{
		//Reach upto Discovery page(Behringer)
		ReachUptoNoResultPage();
		int count = 0;
		
		
		//Verify Gutter50Width has the width of 50 pixel.
		
		try
		{
			
			String locator = locatorReader.getLocator("VerifyPixels.gutter50width1col");
			String padding_right = this.getCSS(locator, "padding-right");
		
			System.out.println("Actual Result:" + padding_right);
			Assert.assertEquals(padding_right, Gutter50Width);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("Gutter50Width Exception>>Expected height:30px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Gutter50Width Exception>>Expected height:30px");
			count = count +1;
		}
	
		//Verify Gutter50Width has the width of 50 pixel.
		
		try
		{
			
			String locator = locatorReader.getLocator("VerifyPixels.gutter50width2col");
			String padding_right = this.getCSS(locator, "padding-right");
		
			System.out.println("Actual Result:" + padding_right);
			Assert.assertEquals(padding_right, Gutter50Width);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("Gutter50Width Exception>>Expected height:30px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Gutter50Width Exception>>Expected height:30px");
			count = count +1;
		}
		
		//Verify textspace5height has the height of 13px
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.textspace5Height");
			String padding_top = this.getCSS(locator, "margin-top");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String padding_top_wopx = padding_top.substring(0, 1);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(font_size_wopx)-Integer.parseInt(line_height_wopx);

			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1;
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, TextSpace5Height);
		}
		
		catch(Exception ex)
		{
			System.out.println("TextSpace5Height Exception>>Expected height:13px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("TextSpace5Height Error>>Expected height:13px");
			count = count +1;
		}
		//Verify textspace1height has the height of 35px
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.textspace5Height");
			String padding_top = this.getCSS(locator, "margin-top");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String padding_top_wopx = padding_top.substring(0, 1);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(font_size_wopx)-Integer.parseInt(line_height_wopx);

			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1+Integer.parseInt("1");
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, TextSpace5Height);
		}
		
		catch(Exception ex)
		{
			System.out.println("TextSpace1Height Exception>>Expected height:35px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("TextSpace1Height Error>>Expected height:35px");
			count = count +1;
		}

		//Verify vSpace2Height has the width of 20 pixel(Between ist and 2nd col).
		
		try
		{
			
			String locator = locatorReader.getLocator("VerifyPixels.vSpace2Height");
			String padding_right = this.getCSS(locator, "margin-top");
		
			System.out.println("Actual Result:" + padding_right);
			Assert.assertEquals(padding_right, vSpace2Height);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("vSpace2Height Exception>>Expected height:20px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("vSpace2Height Exception>>Expected height:20px");
			count = count +1;
		}
/*	//Verify V Space1 has the height of 70px
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
		*/
//Verify the final result
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);	
	}
}
