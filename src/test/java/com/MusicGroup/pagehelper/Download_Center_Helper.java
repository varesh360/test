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

public class Download_Center_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public Download_Center_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("Download_Center.xml");
	}

	//Click on Menu icon 
	public void clickMenuIcon()
	{
		String locator = locatorReader.getLocator("DownloadCenter.MenuIcon");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	//Click on Brand Bugera
	public void clickonBrandBugera(String PageName)
	{
		System.out.println("Brand Bugera page is called");
		String brand_midas="Midas";
		String brand_Buger="Bugera";
		
		//if(PageName.equals(brand_midas))
		//{
			String locator = locatorReader.getLocator("DownloadCenter.ClickBrandMidas");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
		//}
		/*
			else
		{
		String locator = locatorReader.getLocator("DownloadCenter.ClickBrandBugera");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		}
		*/
		
		System.out.println("Brand Bugera page is called");
	}
	
	//Click on product
	public void clickonDownloads()
	{
				String locator = locatorReader.getLocator("DownloadCenter.DownloadsLink");
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
	//Reach upto Downloads page(Bugera)
	public void ReachUptoDownloadsPage(String PageName)
	{
		System.out.println("Verify ReachUptoDownloadsPage is called");
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on a brand
		this.clickonBrandBugera(PageName);
		//Click on a Downloads
		this.clickonDownloads();
		//Check page not found
		this.checkPageNotFound();	
	}
	
	//Verify Download Center page
	public void verifyDownloadCenterPage(String vSpace1height,String vSpace4height, String textField11width, String textField11height,  String textField10width, String textField10height, String vSpace2height, String iconwidth, String iconheight, String FixedBowwidth, String FixedBowheight, String gutter9width, String textSpaceheight, String vSpace3Height, String subheadLeading, String textField9height, String PageName)
	{
		System.out.println("Verify Download Page is called");
		String brand_midas="Midas";
		String brand_Buger="Bugera";
			
		
		
		//Reach upto Downloads page(Bugera)
		ReachUptoDownloadsPage(PageName);
		int count = 0;
		//Verify Downloads link is available
		this.WaitForElementPresent(locatorReader.getLocator("DownloadCenter.DownloadsLink"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("DownloadCenter.DownloadsLink")));
		waitForElementLoad(20);
		//Verify V Space 1 has the height of 70px
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.dcvSpace1height");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result:" + margin_top);
			Assert.assertEquals(margin_top, vSpace1height);
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
			String locator = locatorReader.getLocator("VerifyPixels.dcvSpace4height");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			int getsubpixel1=Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("2");
			String getfinalvalue=getsubpixel1+"px";
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

		//Verify Text Field 11 has the width of 195px 
		try
		{
			String locator = locatorReader.getLocator("VerifyPixels.dctextField11height");
			String width = this.getCSS(locator, "width");
			String width_wopx = width.substring(0, 3);
			String getfinalvalue=width_wopx+"px";
			System.out.println("Actual Result:" + getfinalvalue);
			System.out.println("textField11width:" + textField11width);
			Assert.assertEquals(textField11width, getfinalvalue);
			
		}
		
		catch(Exception ex)
		{
			System.out.println("Field 11 Exception>>Expected Width:195px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Field 11>>Expected Width:195px ");
			count = count +1;
		}
		//Verify Text Field 11 has the height of 212px 
		try
		{
			String locator = locatorReader.getLocator("VerifyPixels.dctextField11height");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result:" + height);
			System.out.println("textField11height:" + textField11height);
			Assert.assertEquals(height, textField11height);
			
		}
		
		catch(Exception ex)
		{
			System.out.println("Field 11>>Expected Width:195px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Field 11>>Expected Width:195px ");
			count = count +1;
		}
		//Verify Text Field 10 has the width of 177px 
		try
		{
			String locator = locatorReader.getLocator("VerifyPixels.dctextField10width");
			String width = this.getCSS(locator, "width");
			
			System.out.println("Actual Result:" + width);
			Assert.assertEquals(width, textField10width);
			
		}
		
		catch(Exception ex)
		{
			System.out.println("Field 10>>Expected Width:177px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Field 10>>Expected Width:177px ");
			count = count +1;
		}
		//Verify Text Field 10 has the height of 129px 
		try
		{
			String locator = locatorReader.getLocator("VerifyPixels.dctextField10width");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result:" + height);
			Assert.assertEquals(height, textField10height);
			
		}
		
		catch(Exception ex)
		{
			System.out.println("Field 10>>Expected Width:129px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Field 10>>Expected Width:129px ");
			count = count +1;
		}
			
		//Verify V Space 2 has the height 20px
		try
		{
			String locator = locatorReader.getLocator("VerifyPixels.dcvSpace2height");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Result:" + padding_top);
			Assert.assertEquals(padding_top, vSpace2height);
		}
		
		catch(Exception ex)
		{
			System.out.println("V Space 2>>Expected height:20px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Space 2>>Expected height:20px");
			count = count +1;
		}
		//Verify V Space 2 has the height 20px
		try
		{
			String locator = locatorReader.getLocator("VerifyPixels.dcvSpace2height");
			String padding_top = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Result:" + padding_top);
			Assert.assertEquals(padding_top, vSpace2height);
		}
		
		catch(Exception ex)
		{
			System.out.println("V Space 2>>Expected height:20px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Space 2>>Expected height:20px");
			count = count +1;
		}
		//Verify V Space 1 has the height of 70px
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.dcvSpace1height");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result:" + margin_top);
			Assert.assertEquals(margin_top, vSpace1height);
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
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4Heightbelowresult");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			int getsubpixel1=Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("2");
			String getfinalvalue=getsubpixel1+"px";
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
		//Verify VSpace3Height has the height of 50px
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.dcvSpace3Height");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Result:" + padding_top);
			Assert.assertEquals(padding_top, vSpace3Height);
		}
		
		catch(Exception ex)
		{
			System.out.println("vSpace3Height>>Expected height:50px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("vSpace3Height>>Expected height:50px");
			count = count +1;
		}
		//Verify vSpace2height has the height of 20px
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.vSpace2HeightbelowImage");
			String padding_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result:" + padding_top);
			Assert.assertEquals(padding_top, vSpace2height);
		}
		
		catch(Exception ex)
		{
			System.out.println("vSpace3Height>>Expected height:20px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("vSpace2height>>Expected height:20px");
			count = count +1;
		}
		//Verify vSpace2height has the height of 20px
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovetext");
			String padding_top = this.getCSS(locator, "margin-top");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String padding_top_wopx = padding_top.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1+Integer.parseInt("2");
			String getFinalValue=getaddpixel+"px";
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, vSpace2height);
		}
		
		catch(Exception ex)
		{
			System.out.println("vSpace3Height>>Expected height:20px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("vSpace2height>>Expected height:20px");
			count = count +1;
		}
		//Verify VSpace 4 has the height of 40px
		try
		{
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveLoadMore");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result:" + margin_top);
			Assert.assertEquals(margin_top, vSpace4height);
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
		//Verify V Space 1 has the height of 70px
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveLoadMore");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Result:" + margin_bottom);
			Assert.assertEquals(margin_bottom, vSpace1height);
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
		
		//Verify Text SpaceHeight has the height of 10px
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.textspace10Height");
			String padding_top = this.getCSS(locator, "padding-top");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			String padding_top_wopx = padding_top.substring(0, 1);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			
			
			String locator1 = locatorReader.getLocator("VerifyPixels.textspace10Height");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			
			String font_size_wopx1 = font_size1.substring(0, 2);
			String line_height_wopx1 = line_height1.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(line_height_wopx1)-Integer.parseInt(font_size_wopx1);
			
			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1+getsubpixel;
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, textSpaceheight);
	
		//	Assert.assertEquals(margin_bottom, vSpace1height);
		}
		
		catch(Exception ex)
		{
			System.out.println("V Text Space 10 Height>>Expected height:10px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Text Space 10 Height>>Expected height:10px");
			count = count +1;
		}
		
		//Verify icon width has the width of 100px 
		
		////---------------Midas---------------------------------------
		/*
		if(PageName.equals(brand_midas))
		{
			
		
		try
		{
			
		
			String locator = locatorReader.getLocator("VerifyPixels.midasiconwidth");
			
					String width = this.getCSS(locator, "width");
			
			System.out.println("Actual Result:" + width);
			Assert.assertEquals(width, iconwidth);
			}
		
		
		catch(Exception ex)
		{
			System.out.println("Icon width >>Expected Width:100px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Icon width>>Expected Width:100px ");
			count = count +1;
		}
		//Verify Text Field 10 has the height of 129px 
		try
		{
			String locator = locatorReader.getLocator("VerifyPixels.midasiconwidth");
			
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result:" + height);
			Assert.assertEquals(height, iconheight);
			
		}
		
		catch(Exception ex)
		{
			System.out.println("Iocn Height Exeption>>Expected Width:104px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Iocn Height Error>>Expected Width:104px ");
			count = count +1;
		}

		}
		
		////---------------Bugera---------------------------------------
		if(PageName.equals(brand_Buger))
		{
			
		
		try
		{
			
		
			String locator = locatorReader.getLocator("VerifyPixels.iconwidth");
			
			
			String width = this.getCSS(locator, "width");
			
			System.out.println("Actual Result:" + width);
			Assert.assertEquals(width, iconwidth);
			}
		
		
		catch(Exception ex)
		{
			System.out.println("Icon width >>Expected Width:100px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Icon width>>Expected Width:100px ");
			count = count +1;
		}
		//Verify Text Field 10 has the height of 129px 
		try
		{
			String locator = locatorReader.getLocator("VerifyPixels.iconwidth");
			
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result:" + height);
			Assert.assertEquals(height, iconheight);
			
		}
		
		catch(Exception ex)
		{
			System.out.println("Iocn Height Exeption>>Expected Width:104px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Iocn Height Error>>Expected Width:104px ");
			count = count +1;
		}

		}
		
	//Verify subheadLeading has the height of 13px
		
		try
		{
		
			
			String locator = locatorReader.getLocator("VerifyPixels.subheadleading");
			String padding_top = this.getCSS(locator, "margin-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			String padding_top_wopx = padding_top.substring(0, 1);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			
			
			String locator1 = locatorReader.getLocator("VerifyPixels.subheadleading1");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			
			String font_size_wopx1 = font_size1.substring(0, 2);
			String line_height_wopx1 = line_height1.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(line_height_wopx1)-Integer.parseInt(font_size_wopx1);
			
			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel1+getsubpixel;
			String getFinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, subheadLeading);
	
		//	Assert.assertEquals(margin_bottom, vSpace1height);
		}
		
		catch(Exception ex)
		{
			System.out.println("V subheadLeading Height>>Expected height:13px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V subheadLeading Height>>Expected height:13px");
			count = count +1;
		}

		//Verify subheadLeading has the height of 13px
		try
		{
		
			String locator = locatorReader.getLocator("VerifyPixels.TextSpace9Height");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx)+Integer.parseInt("6");
			
			String getFinalValue=getsubpixel+"px";
			
			System.out.println("Actual Result:" + getFinalValue);
			Assert.assertEquals(getFinalValue, textField9height);
	
		//	Assert.assertEquals(margin_bottom, vSpace1height);
		}
		
		catch(Exception ex)
		{
			System.out.println("V textField9height Height>>Expected height:8px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V textField9height Height>>Expected height:8px");
			count = count +1;
		}
			//Verify the final result
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);	
	}
	*/
	
	//Verify Discovery page
		/*
	public void verifyDiscoveryPage(String vSpace1height,String vSpace4height, String textField11width, String textField11height,  String textField10width, String textField10height, String vSpace2height, String iconwidth, String iconheight, String FixedBowwidth, String FixedBowheight, String gutter9width, String textSpaceheight, String vSpace3Height, String subheadLeading, String PageName)
	{
		//Reach upto Downloads page(Bugera)
		ReachUptoDownloadsPage(PageName);
		int count = 0;
		//Verify Downloads link is available
		this.WaitForElementPresent(locatorReader.getLocator("DownloadCenter.DownloadsLink"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("DownloadCenter.DownloadsLink")));
		waitForElementLoad(20);
		//Verify V Space 1 has the height of 70px
		try
		{
			String dcvSpace1height = this.getCSS("DiscoveryPage.dcvSpace1height", "margin-top");
			System.out.println("Actual dcVSpace1height:" + dcvSpace1height);
			Assert.assertEquals(dcvSpace1height, vSpace1height, "V Space 1 height is not as per mock");
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
		//Verify V Space 4 has the height of 40px
		try
		{
			String dcvSpace4height = this.getCSS("DiscoveryPage.dcvSpace4height", "margin-bottom");
			System.out.println("Actual dcvSpace4height:" + dcvSpace4height);
			Assert.assertEquals(dcvSpace4height, vSpace4height, "V Space 4 height is not as per mock");
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
		//Verify Text Field 11 has the width of 195px and height 212px
	/*	try
		{
			String dctextField11width = this.getCSS("DiscoveryPage.dctextField11width", "width");
			String dctextField11height = this.getCSS("DiscoveryPage.dctextField11height", "height");
			System.out.println("Actual dctextField11width:" + dctextField11width);
			System.out.println("Actual dctextField11height:" + dctextField11height);
			Assert.assertEquals(dctextField11width, textField11width, "Field11 height/width is not as per mock");
			Assert.assertEquals(dctextField11height, textField11height, "Field11 height/width is not as per mock");
			
		}
		
		catch(Exception ex)
		{
			System.out.println("Field 11>>Expected Width:195px height 212px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Field 11>>Expected Width:195px height 212px");
			count = count +1;
		}
		//Verify Text Field 10 has the width 177px and height 129px
		try
		{
			String dctextField10width = this.getCSS("DiscoveryPage.dctextField10width", "width");
			String dctextField10height = this.getCSS("DiscoveryPage.dctextField10height", "height");
			System.out.println("Actual dctextField10width:" + dctextField10width);
			System.out.println("Actual dctextField10height:" + dctextField10height);
			Assert.assertEquals(dctextField10width, textField10width, "Field10 height/width is not as per mock");
			Assert.assertEquals(dctextField10height, textField10height, "Field10 height/width is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("Field 10>>Expected Width:177px height 129px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Field 10>>Expected Width:177px height 129px");
			count = count +1;
		}
		
		//Verify V Space 2 has the height 20px
		try
		{
			String dcvSpace2height = this.getCSS("DiscoveryPage.dcvSpace2height", "padding-bottom");
			System.out.println("Actual dcvSpace2height:" + dcvSpace2height);
			Assert.assertEquals(dcvSpace2height, vSpace2height, "V Space 2 height is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("V Space 2>>Expected height:20px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Space 2>>Expected height:20px");
			count = count +1;
		}
		
		//Verify V Space 1 has the height of 70px
		try
		{
			String dcvSpace1height = this.getCSS("DiscoveryPage.dcvSpace1height", "margin-top");
			System.out.println("Actual dcvSpace1height:" + dcvSpace1height);
			Assert.assertEquals(dcvSpace1height, vSpace1height, "V Space 1 height is not as per mock");
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
		//Verify icon has the Width of 100px and height of 104px.
		try
		{
			String dciconwidth = this.getCSS("DiscoveryPage.dciconwidth", "width");
			String dciconheight = this.getCSS("DiscoveryPage.dciconheight", "height");
			System.out.println("Actual dciconwidth:" + dciconwidth);
			System.out.println("Actual dciconheight:" + dciconheight);
			Assert.assertEquals(dciconwidth, iconwidth, "Icon height/width is not as per mock");
			Assert.assertEquals(dciconheight, iconheight, "Icon height/width is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("Icon Width>>Expected Width:100px height: 104px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Icon Width>>Expected Width:100px height: 104px");
			count = count +1;
		}
		//Verify Fixed Bow Image has the width 154px and height 104px.
		try
		{
			String dcFixedBowwidth = this.getCSS("DiscoveryPage.dcFixedBowwidth", "height");
			String dcFixedBowheight = this.getCSS("DiscoveryPage.dcFixedBowheight", "height");
			System.out.println("Actual dcFixedBowwidth:" + dcFixedBowwidth);
			System.out.println("Actual dcFixedBowheight:" + dcFixedBowheight);
			Assert.assertEquals(dcFixedBowwidth, FixedBowwidth, "Fixed Bow height/width is not as per mock");
			Assert.assertEquals(dcFixedBowheight, FixedBowheight, "Fixed Bow height/width is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("Fixed Bow Image>>Expected Width:154px :104px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Fixed Bow Image>>Expected Width:154px :104px");
			count = count +1;
		}
		//Verify Gutter 9 has the width of 20px
		try
		{
			String dcgutter9width = this.getCSS("DiscoveryPage.dcgutter9width", "margin-left");
			System.out.println("Actual dcgutter9width:" + dcgutter9width);
			Assert.assertEquals(dcgutter9width, gutter9width, "Gutter 9 width is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("Gutter 9>>Expected Width:20px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Gutter 9>>Expected Width:20px");
			count = count +1;
		}

		//Verify Text Space has the height of 10px
		try
		{
			String dctextSpaceheight = this.getCSS("DiscoveryPage.dctextSpaceheight", "padding-top");
			System.out.println("Actual dctextSpaceheight:" + dctextSpaceheight);
			Assert.assertEquals(dctextSpaceheight, textSpaceheight, "Text Space height is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("Text Space>>Expected height:10px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Text Space>>Expected height:10px");
			count = count +1;
		}
		//Verify V_Space3 has the height of 50px
		try
		{
			String dcvSpace3Height = this.getCSS("DiscoveryPage.dcvSpace3Height", "padding-top");
			System.out.println("Actual dcvSpace3Height:" + dcvSpace3Height);
			Assert.assertEquals(dcvSpace3Height, vSpace3Height, "V Space 3 height is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("V_Space3>>Expected height:50px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V_Space3>>Expected height:50px");
			count = count +1;
		}
		//Verify Subhead leading has the height of 13px
		try
		{
			String dcsubheadLeading = this.getCSS("DiscoveryPage.dcsubheadLeading", "margin-bottom");
			System.out.println("Actual dcsubheadLeading:" + dcsubheadLeading);
			Assert.assertEquals(dcsubheadLeading, subheadLeading, "Subhead Leading height is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("Subhead leading>>Expected height:13px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Subhead leading>>Expected height:13px");
			count = count +1;
		}
		*/
		//Verify the final result
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);	
	}
	
}

