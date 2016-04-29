/*==============================================================================================================================
File Name    : B2B_SiteMapPage_Helper.java
ClassName    : B2B_SiteMapPage_Helper
Summary      : Contains helping methods for B2B_SiteMapPage_Helper Page.
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

public class B2B_SiteMapPage_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_SiteMapPage_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_SiteMapPage.xml");
	
	}
	
	//Click on SearchSuggestionField and Enter the Search Product
	public void clickSiteMapLink()
	
	{
	
		String locator = locatorReader.getLocator("B2B_siteMapPage.ClickSitMapLink");
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
	
	//Reach upto B2BSearchField
	public void ReachUptoB2BSearchField()
	{
		//Click on Cartlink on B2BPage
		this.clickSiteMapLink();
			//Click on Write your own button
		//Check page not found
	this.checkPageNotFound();
		
	}
	public void verifyB2BSiteMapPage(String vSpace1Height,String vSpace4Height, String vSpace2Height, String BodyCopyleading, String TextSpace9Height, String ParagraphSpace1Height, String Col1Width, String IndentWidth)
	{
		
		ReachUptoB2BSearchField();
		int count = 0;
		// Verify vSpace1Height has the height of 70px .
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.vSpace1Heightlocator");
			System.out.println("----locator----"+locator);
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("----Margin top----"+margin_top);
			String line_height = this.getCSS(locator, "line-height");
				
			
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			System.out.println("margin_top_wopx" +margin_top_wopx);
			System.out.println("line_height_wopx" +line_height_wopx);
			int getsubpixel = Integer.parseInt(margin_top_wopx)- Integer.parseInt(line_height_wopx);
			int getaddpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel;
			
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace1Height,getfinalValue);
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}
		
		
		
		
		// Verify vSpace40Height has the width of 40px .
	
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.vSpace4Heightlocator");
			String padding_top = this.getCSS(locator, "padding-top");
			
			
			
			String locator1 = locatorReader.getLocator("B2B_siteMapPage.vSpace1Heightlocator");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
					
			
			
			String margin_top_wopx = padding_top.substring(0, 2);
			String line_height_wopx = margin_bottom.substring(0, 2);
			
			System.out.println("margin_top_wopx" +margin_top_wopx);
			System.out.println("line_height_wopx" +line_height_wopx);
			int getaddpixel = Integer.parseInt(margin_top_wopx)+ Integer.parseInt(line_height_wopx)+Integer.parseInt("3");
			
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace4Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}				
		
		// Verify vSpace20Height has the width of 40px //discusss.
		
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.vSpace4Heightlocator");
			String padding_top = this.getCSS(locator, "padding-top");
			
			
			
			String locator1 = locatorReader.getLocator("B2B_siteMapPage.vSpace1Heightlocator");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
					
			
			
			String margin_top_wopx = padding_top.substring(0, 2);
			String line_height_wopx = margin_bottom.substring(0, 2);
			
			System.out.println("margin_top_wopx" +margin_top_wopx);
			System.out.println("line_height_wopx" +line_height_wopx);
			int getaddpixel = Integer.parseInt(margin_top_wopx)+ Integer.parseInt(line_height_wopx)+Integer.parseInt("3");
			
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace4Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace20Height Exception>>Expected Result:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace20Height Error>>Expected Result:20px");
			count = count + 1;
		}		
		
		// Verify vSpace40Height has the width of 10px .
		
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.bodycopyleading");
			String line_height = this.getCSS(locator, "line-height");
			System.out.println("Actual Result" +line_height);
			Assert.assertEquals(BodyCopyleading,line_height);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}				
		
		// Verify vSpace40Height has the width of 40px (Below Midas table.
		
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.vspace4HeightfooterMidas");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("--------Padding Bottom---------"+padding_bottom);
			
			
			String locator1 = locatorReader.getLocator("B2B_siteMapPage.vspace4HeightfooterMidas1");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
			String line_hieght = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			System.out.println("--------margin_bottom---------"+margin_bottom);
			System.out.println("--------line_hieght---------"+line_hieght);
			System.out.println("-------font_size---------"+font_size);
					
			String padding_bottom_wopx = padding_bottom.substring(0, 2);
			String margin_bottom_wopx = margin_bottom.substring(0, 1);
			String line_hieght_wopx = line_hieght.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getaddpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt(margin_bottom_wopx);
			int getsubbpixel = Integer.parseInt(line_hieght_wopx)- Integer.parseInt(font_size_wopx);
			
			int getfinalvalue=getaddpixel+getsubbpixel;
			String getfinalValueWithPixel=getfinalvalue+"px";
			System.out.println("-------font_size---------"+font_size);
			Assert.assertEquals(vSpace4Height,getfinalValueWithPixel);
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		
		// Verify vSpace40Height has the width of 40px (Above Klarktecknik) table.
		
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.vSpace4Heightklart");
			String padding_top = this.getCSS(locator, "padding-top");
		
			System.out.println(" Actual result"+padding_top);
			Assert.assertEquals(vSpace4Height,padding_top);
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}	
		
		// Verify BodyCopyleading has the width of 20px .
		
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.bodycopyleadingklart");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
				
			
			String padding_bottom_wopx = padding_bottom.substring(0, 2);
			
			int getaddpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("6");
			
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace4Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B PBodyCopyleading Exception>>Expected Result:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B BodyCopyleading Error>>Expected Result:20px");
			count = count + 1;
		}
	
	// Verify vSpace40Height has the width of 40px (Above Klarktecknik) table.
		
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.vSpace4Heightturbosound");
			String padding_top = this.getCSS(locator, "padding-top");
			
			System.out.println(" Actual result"+padding_top);
			Assert.assertEquals(vSpace4Height,padding_top);
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		
		// Verify vSpace40Height has the width of 40px (Below Midas table.
		
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.vSpace4Heightturbosound");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("--------Padding Bottom---------"+padding_bottom);
			
			
			String locator1 = locatorReader.getLocator("B2B_siteMapPage.vSpace4Heightturbosound1");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
			String line_hieght = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			System.out.println("--------margin_bottom---------"+margin_bottom);
			System.out.println("--------line_hieght---------"+line_hieght);
			System.out.println("-------font_size---------"+font_size);
					
			String padding_bottom_wopx = padding_bottom.substring(0, 2);
			String margin_bottom_wopx = margin_bottom.substring(0, 1);
			String line_hieght_wopx = line_hieght.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getaddpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt(margin_bottom_wopx);
			int getsubbpixel = Integer.parseInt(line_hieght_wopx)- Integer.parseInt(font_size_wopx);
			
			int getfinalvalue=getaddpixel+getsubbpixel;
			String getfinalValueWithPixel=getfinalvalue+"px";
			System.out.println("Actual Result"+font_size);
			Assert.assertEquals(vSpace4Height,getfinalValueWithPixel);
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		
	// Verify vSpace40Height has the width of 40px (Above Klarktecknik) table.
		
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.gutter2width");
			String padding_right = this.getCSS(locator, "padding-right");
            String width = this.getCSS(locator, "width");
			
			System.out.println("----Width-----"+width);
			System.out.println(" Actual result"+padding_right);
			Assert.assertEquals(vSpace4Height,padding_right);
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B padding_right Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B padding_right vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		
		// Verify vSpace40Height has the width of 40px (Above Klarktecknik) table.
		
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.gutter2width");
			String width = this.getCSS(locator, "width");
			
			System.out.println("Actual Result"+width);
			
			Assert.assertEquals(Col1Width,width);
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		
		// Verify vSpace40Height has the width of 40px (Above Klarktecknik) table.
		
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.gutter2width2col");
			String padding_right = this.getCSS(locator, "padding-right");
           		
		
			System.out.println(" Actual result"+padding_right);
			Assert.assertEquals(vSpace4Height,padding_right);
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B padding_right Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B padding_right vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		
		// Verify vSpace40Height has the width of 40px (Above Klarktecknik) table.
		
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.gutter2width2col");
			String width = this.getCSS(locator, "width");
			
			System.out.println("Actual Result"+width);
			
			Assert.assertEquals(Col1Width,width);
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}			

		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
