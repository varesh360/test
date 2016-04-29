package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class PageNotFound_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public PageNotFound_Helper(WebDriver driver) {
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
	
	//Reach upto B2BSearchField
	public void ReachUptoB2BSearchField()
	{
		//Click on Cartlink on B2BPage
		this.clickSiteMapLink();
			//Click on Write your own button
		//this.clickonreviewbutton();
		
	}
	public void verifyB2BSiteMapPage(String vSpace1Height,String vSpace4Height, String vSpace2Height, String BodyCopyleading, String TextSpace9Height, String ParagraphSpace1Height, String Col1Width, String IndentWidth)
	{
		
		ReachUptoB2BSearchField();
		int count = 0;
		// Verify vSpace1Height has the width of 10px .
		try {
			String locator = locatorReader.getLocator("B2B_siteMapPage.vSpace1Heightlocator");
			String margin_top = this.getCSS(locator, "margin-top");
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
		
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}

