package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class Unified_SearchSuggestionPopup_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public Unified_SearchSuggestionPopup_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("Unified_SearchSuggestionPopup.xml");
	
	}
	
	//Click on SearchSuggestionField and Enter the Search Product
	public void clickSearchbox()
	
	{
	
		String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.entertextinserachfield");
		this.WaitForElementEnabled(locator, 50);
		String val = "X";
		sendKeys(locator, val);
		
		
	}
	
	//Click on Registraion Link
	public void EnterSearchdata()
	
	{
	
		String locator = locatorReader.getLocator("B2B_RegistraionPage.clickregistraionlink");
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
		this.clickSearchbox();
			
		//Check page not found
		this.checkPageNotFound();
		
	}
	public void verifySearchSuggestion(String TextSpace4Height,String vSpace18Height,String TextSpace10Height, String Gutter17Width,String vSpace17Height,String SelectFieldWidth55Width, String SelectfieldWidth55Height, String TextSpace15Height)
	{
		
		ReachUptoB2BSearchField();
		int count = 0;
		// Verify Gutter17Width has the width of 10px (X32)[Padding_left] .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList1");
			this.WaitForElementPresent(locator, 15);
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result: " + padding_left);
			Assert.assertEquals(Gutter17Width,padding_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Exception>>Expected Pading Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Error>>Expected Padding:10px");
			count = count + 1;
		}
		// Verify Gutter17Width has the width of 10px (X32)[Padding_right] .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList1");
			this.WaitForElementPresent(locator, 15);
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result: " + padding_right);
			Assert.assertEquals(Gutter17Width,padding_right);
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Exception>>Expected Pading Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Error>>Expected Padding:10px");
			count = count + 1;
		}	

		// Verify Gutter17Width has the width of 10px (X32-Compact)[Padding_left] .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList3");
			this.WaitForElementPresent(locator, 15);
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result: " + padding_left);
			Assert.assertEquals(Gutter17Width,padding_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Exception>>Expected Pading Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Error>>Expected Padding:10px");
			count = count + 1;
		}
		// Verify Gutter17Width has the width of 10px (X32-Compact)[Padding_right] .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList3");
			this.WaitForElementPresent(locator, 15);
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result: " + padding_right);
			Assert.assertEquals(Gutter17Width,padding_right);
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Exception>>Expected Pading Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Error>>Expected Padding:10px");
			count = count + 1;
		}
		// Verify Gutter17Width has the width of 10px (X32R)[Padding_left] .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList5");
			this.WaitForElementPresent(locator, 15);
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result: " + padding_left);
			Assert.assertEquals(Gutter17Width,padding_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Exception>>Expected Pading Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Error>>Expected Padding:10px");
			count = count + 1;
		}
		// Verify Gutter17Width has the width of 10px (X32R)[Padding_right] .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList5");
			this.WaitForElementPresent(locator, 15);
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result: " + padding_right);
			Assert.assertEquals(Gutter17Width,padding_right);
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Exception>>Expected Pading Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Error>>Expected Padding:10px");
			count = count + 1;
		}
	//	-----------------------------------------------Recommended Result Iitem---------------------------------- 
		// Verify Gutter17Width has the width of 10px (First) .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthListRecommendedResult1");
			this.WaitForElementPresent(locator, 15);
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result: " + padding_left);
			Assert.assertEquals(Gutter17Width,padding_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Exception>>Expected Pading Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Error>>Expected Padding:10px");
			count = count + 1;
		}
		// Verify Gutter17Width has the width of 10px Third .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthListRecommendedResult1");
			this.WaitForElementPresent(locator, 15);
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result: " + padding_right);
			Assert.assertEquals(Gutter17Width,padding_right);
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Exception>>Expected Pading Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion Gutter17Width Error>>Expected Padding:10px");
			count = count + 1;
		}	
		
//		-----------------------------------------Common Searches---------------------------------- 
	
				// Verify SelectedField55Width has the width of 239px  .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.SelectedField55");
			this.WaitForElementPresent(locator, 15);
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result: " + width);
			Assert.assertEquals(SelectFieldWidth55Width,width);
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion SelectFieldWidth55Width Exception>>Expected Pading Top:238px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion SelectFieldWidth55Width Error>>Expected Padding:238px");
			count = count + 1;
		}
				// Verify vSpace18Height has the height of 8px  .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList1");
			this.WaitForElementPresent(locator, 15);
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
			String locator1 = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList2");
			this.WaitForElementPresent(locator1, 15);
			String padding_top = this.getCSS(locator1, "padding-top");
			String padding_top_wopx = padding_top.substring(0, 1);
			int getaddpixel = Integer.parseInt(padding_top_wopx)+ Integer.parseInt(padding_bottom_wopx)+Integer.parseInt("2");
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result: " + getfinalValue);
			Assert.assertEquals(vSpace18Height,getfinalValue);
		
			 
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion vSpace18Height Exception>>Expected Pading Top:8px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion vSpace18Height Error>>Expected Padding:8px");
			count = count + 1;
		}
		// Verify vSpace18Height has the height of 8px( 2Nd )  .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList2");
			this.WaitForElementPresent(locator, 15);
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
			String locator1 = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList3");
			this.WaitForElementPresent(locator1, 15);
			String padding_top = this.getCSS(locator1, "padding-top");
			String padding_top_wopx = padding_top.substring(0, 1);
			int getaddpixel = Integer.parseInt(padding_top_wopx)+ Integer.parseInt(padding_bottom_wopx)+Integer.parseInt("2");
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result: " + getfinalValue);
			Assert.assertEquals(vSpace18Height,getfinalValue);
		
			 
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion vSpace18Height Exception>>Expected Pading Top:8px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion vSpace18Height Error>>Expected Padding:8px");
			count = count + 1;
		}	
		// Verify vSpace18Height has the height of 8px( 4th )  .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList4");
			this.WaitForElementPresent(locator, 15);
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
			String locator1 = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList5");
			this.WaitForElementPresent(locator1, 15);
			String padding_top = this.getCSS(locator1, "padding-top");
			String padding_top_wopx = padding_top.substring(0, 1);
			int getaddpixel = Integer.parseInt(padding_top_wopx)+ Integer.parseInt(padding_bottom_wopx)+Integer.parseInt("2");
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result: " + getfinalValue);
			Assert.assertEquals(vSpace18Height,getfinalValue);
		
			 
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion vSpace18Height Exception>>Expected Pading Top:8px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion vSpace18Height Error>>Expected Padding:8px");
			count = count + 1;
		}
		// Verify TextSpace15Height has the height of 16px( 1th )  .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList1");
			this.WaitForElementPresent(locator, 15);
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			
			
			String locator1 = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList2");
			this.WaitForElementPresent(locator1, 15);
			String padding_top = this.getCSS(locator1, "padding-top");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			String padding_top_wopx1 = padding_top.substring(0, 1);
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			int getsubpixel1 = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
			
			int getaddpixel = getsubpixel1+getsubpixel+Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(padding_top_wopx1);
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result: " + getfinalValue);
			Assert.assertEquals(TextSpace15Height,getfinalValue);
		
			 
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion TextSpace15Height Exception>>Expected Pading Top:16px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion TextSpace15Height Error>>Expected Padding:16px");
			count = count + 1;
		}			
		// Verify TextSpace15Height has the height of 16px( 2th )  .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList2");
			this.WaitForElementPresent(locator, 15);
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			
			
			String locator1 = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList3");
			this.WaitForElementPresent(locator1, 15);
			String padding_top = this.getCSS(locator1, "padding-top");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			String padding_top_wopx1 = padding_top.substring(0, 1);
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			int getsubpixel1 = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
			
			int getaddpixel = getsubpixel1+getsubpixel+Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(padding_top_wopx1);
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result: " + getfinalValue);
			Assert.assertEquals(TextSpace15Height,getfinalValue);
		
			 
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion TextSpace15Height Exception>>Expected Pading Top:16px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion TextSpace15Height Error>>Expected Padding:16px");
			count = count + 1;
		}				
		// Verify TextSpace15Height has the height of 16px( 4th )  .
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList4");
			this.WaitForElementPresent(locator, 15);
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			
			
			String locator1 = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList5");
			this.WaitForElementPresent(locator1, 15);
			String padding_top = this.getCSS(locator1, "padding-top");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			String padding_top_wopx1 = padding_top.substring(0, 1);
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			int getsubpixel1 = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
			
			int getaddpixel = getsubpixel1+getsubpixel+Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(padding_top_wopx1);
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result:" + getfinalValue);
			Assert.assertEquals(TextSpace15Height,getfinalValue);
		
			 
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion TextSpace15Height Exception>>Expected Pading Top:16px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion TextSpace15Height Error>>Expected Padding:16px");
			count = count + 1;
		}				
		// Verify TextSpace10Height has the height of 25px
		try {
			String locator = locatorReader.getLocator("UnifiedSearchSuggestionPopup.TextSpace10Height");
			this.WaitForElementPresent(locator, 15);
			String margin_top = this.getCSS(locator, "margin-top");
			String padding_top_wopx = margin_top.substring(0, 2);
			
			System.out.println("    "+padding_top_wopx);
				
			
			String locator1 = locatorReader.getLocator("UnifiedSearchSuggestionPopup.Gutter17WidthList5");
			this.WaitForElementPresent(locator1, 15);
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			String padding_bottom = this.getCSS(locator1, "padding-bottom");
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			String padding_bottom_wopx1 = padding_bottom.substring(0, 1);
			int getsubpixel1 = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
			int getaddpixel = getsubpixel1+Integer.parseInt(padding_top_wopx)+Integer.parseInt(padding_bottom_wopx1)+Integer.parseInt("2");
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result: " + getfinalValue);
			Assert.assertEquals(TextSpace10Height,getfinalValue);
		
			 
		}

		catch (Exception ex) {
			System.out.println("B2B Serach Suggestion TextSpace10Height Exception>>Expected Pading Top:25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Serach Suggestion TextSpace10Height Error>>Expected Pading Top:25px");
			count = count + 1;
		}	
		
		
		
			System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}


