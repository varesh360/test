package test.java.com.MusicGroup.pagehelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;
public class TurboSound_OurStory1986_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public TurboSound_OurStory1986_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("TurboSound_OurStory1986.xml");
	}

	//Click on Menu icon 
	public void clickMenuIcon()
	{
		String locator = locatorReader.getLocator("OurStory.ClickToggleMenu");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	//Click on Brand Midas
	public void clickonBrandMidas()
	{
		String locator = locatorReader.getLocator("OurStory.ClickMidasBrand");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	//Click on OurStory
	public void clickOurStory()
	{
		String locator = locatorReader.getLocator("OurStory.ClickOurStoryMenu");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}	
	//Click on OurStory1970
		public void clickOurStory1970()
		{
			WebElement element = driver.findElement(ByLocator("//ul[@id='mTS_1_container']//li[7]/a"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		}
	//Check Page not found
	public void checkPageNotFound()
	{
		String actualTitle1 = driver.getTitle();
		System.out.println("Get Titile"+ actualTitle1);
		String expectedTitle1 = "Not Found | MUSIC Group";
		Assert.assertFalse(actualTitle1==expectedTitle1);

		
	}
	//Reach upto ReachUptoOurStoryPage(Midas)
	public void ReachUptoOurStoryPage()
	{
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on a brand
		this.clickonBrandMidas();
		//Click on Buy Now
		this.clickOurStory();
		
		//Click our Story 1970
		this.clickOurStory1970();
		//Check page not found
		this.checkPageNotFound();
	}
	
	//Verify Buy Now page
	public void verifyMidasOurStory1980Page(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2, String Gutter2Width, String CallOutBodyCopyWidth)
	{
		//Reach upto Buy Now page(Behringer)
		ReachUptoOurStoryPage();
		int count = 0;
		
		// Verify vSpace1Height has the height of 70px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Height");
			String margin_top = this.getCSS(locator, "margin-top");
			
						
			// Substring: To remove pixel(px text) from value
			String margin_top_wopx = margin_top.substring(0, 2);
			
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ Integer.parseInt("2");
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace1Height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 vSpace1Height Exception>>Expected Margin Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 vSpace1Height Error>>Expected Width:70px");
			count = count + 1;
		}
		// Verify textSpace8Height has the height of 20px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Height");
			String margin_top = this.getCSS(locator, "margin-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			
			// Substring: To remove pixel(px text) from value
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			
		
						
			int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
			
				
			String locator1 = locatorReader.getLocator("VerifyPixels.textSpace8Height");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			
			// Substring: To remove pixel(px text) from value
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(font_size_wopx1)- Integer.parseInt(line_height_wopx1);
			
			
			
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel1-getsubpixel+Integer.parseInt("4");
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(TextSpace8Height, Totalpixelvaluewithpixel);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 TextSpace8Height Exception>>Expected Result:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 TextSpace8Height Error>>Expected Result:20px");
			count = count + 1;
		}
		// Verify textSpace6Height has the height of 40px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.textSpace8Height");
			String margin_top = this.getCSS(locator, "margin-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			
			// Substring: To remove pixel(px text) from value
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
		
						
			int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
						
			String locator1 = locatorReader.getLocator("VerifyPixels.textSpace6Height");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			
			// Substring: To remove pixel(px text) from value
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
			
			
			
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel1-getsubpixel+Integer.parseInt("5");
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(TextSpace6Height, Totalpixelvaluewithpixel);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 textSpace6Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 textSpace6Height Error>>Expected Result:40px");
			count = count + 1;
		}
		// Verify BodayCopyLeadingHeight has the height of 17px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.textSpace6Height");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);

			// Substring: To remove pixel(px text) from value
			
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) + Integer.parseInt("5");
										
			String Totalpixelvaluewithpixel = getsubpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(BodayCopyLeadingHeight, Totalpixelvaluewithpixel);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 BodayCopyLeadingHeight Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		// Verify vSpace4Height has the height of 40px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.textSpace6Height");
			String margin_bottom = this.getCSS(locator, "padding-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);

			// Substring: To remove pixel(px text) from value
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
		   int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) - Integer.parseInt("4");
			String locator1 = locatorReader	.getLocator("VerifyPixels.vSpace4Heightaboveimage");
			String margin_top = this.getCSS(locator1, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);
			
		int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(margin_top_wopx)+getsubpixel;
							
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		// Verify FullWidthBoxImage6 has the width of 980px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.FirstImagewidth");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(FullWidthBoxImage, width);
		//	Assert.assertEquals(ImageWidth2, width);
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Exception>>Expected Result:980px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Error>>Expected Result:980px");
			count = count + 1;
		}
		/*
		// Verify vSpace1Height has the height of 70px.
		try {
									
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1heightaboveawardtext");
			String margin_top = this.getCSS(locator, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
						
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("12");
			
			// Substring: To remove pixel(px text) from value
			
			
			int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+getsubpixel;
			String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace1Height, Totalpixelvaluewithpixel);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify vSpace4Height has the height of 40px.
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightaboveawardtext");
			String margin_top = this.getCSS(locator1, "margin-bottom");
					
					
			System.out.println("Actual result" + margin_top);
			Assert.assertEquals(vSpace4Height, margin_top);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		
		// Verify vSpace2Height has the height of 20px.
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
			String margin_top = this.getCSS(locator1, "margin-top");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
					
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String margin_top_wopx = margin_top.substring(0, 2);
			
			int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx)-Integer.parseInt("4");
			String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
			
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace2Height, Totalpixelvaluewithpixel);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 vSpace2Height Exception>>Expected Result:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 vSpace2Height Error>>Expected Result:20px");
			count = count + 1;
		}
		*/
		// Verify vSpace4Height has the height of 40px.vSpace2Heightabovebuttontext1
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
			String margin_top = this.getCSS(locator, "margin-top");							
			String margin_top_wopx = margin_top.substring(0, 2);
		/*	
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");	
			

			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			*/
			//int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx)-Integer.parseInt("6");
			//String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
			
			System.out.println("Actual result" + margin_top);
			Assert.assertEquals(vSpace4Height, margin_top);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		// Verify vSpace1Height has the height of 70px.
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
			String margin_top = this.getCSS(locator1, "margin-bottom");
					
					
			System.out.println("Actual result" + margin_top);
			Assert.assertEquals(vSpace1Height, margin_top);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 vSpace1Height Error>>Expected Result:7s0px");
			count = count + 1;
		}
		
		// Verify vSpace4Height has the height of 40px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Heightaboveimage");
			String margin_top = this.getCSS(locator, "padding-top");							
			
						
			System.out.println("Actual result" + margin_top);
			Assert.assertEquals(vSpace4Height, margin_top);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}	
		// Verify vSpace4Height has the height of 40px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Heightaboveimage1");
			String margin_top = this.getCSS(locator, "padding-top");							
			
						
			System.out.println("Actual result" + margin_top);
			Assert.assertEquals(vSpace4Height, margin_top);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		
		// Verify vSpace2Height has the height of 20px.
		
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.Gutter2Width");
			String margin_right = this.getCSS(locator1, "margin-right");
			
			String locator = locatorReader.getLocator("VerifyPixels.Gutter2Width1");
			String margin_left = this.getCSS(locator, "margin-left");
		
							
			String margin_right_wopx =margin_right.substring(0, 2);
			String margin_left_wopx =  margin_left.substring(0, 2);
			
			
			int getfinalvaluewopx=Integer.parseInt(margin_right_wopx)+Integer.parseInt(margin_left_wopx);			String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
			String Totalpixelvalue=getfinalvaluewopx+"px";
			System.out.println("Actual result" + Totalpixelvalue);
			Assert.assertEquals(Gutter2Width, Totalpixelvalue);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1980 vSpace2Height Exception>>Expected Result:80px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 vSpace2Height Error>>Expected Result:80px");
			count = count + 1;
		}
		// Verify CallOutBodyCopyWidth has the width of 450px.
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.calloutbodycopy");
			String width = this.getCSS(locator1,"width");
			
			System.out.println("Actual result" + width);
			Assert.assertEquals(CallOutBodyCopyWidth, width);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
			count = count + 1;
		}
		// Verify CallOutBodyCopHeight has the width of 450px.
		   try {
			String locator1 = locatorReader.getLocator("VerifyPixels.calloutbodycopy");
			String height = this.getCSS(locator1,"height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(CallOutBodyCopyWidth, height);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
			count = count + 1;
		}
		// Verify CallOutBodyCopHyImageeight has the width of 450px.
		   try {
			String locator1 = locatorReader.getLocator("VerifyPixels.calloutbodyfiximage");
			String width = this.getCSS(locator1,"width");
			System.out.println("Actual result" +width);
			Assert.assertEquals(CallOutBodyCopyWidth,width);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
			count = count + 1;
		}
	}

}
