package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class Midas_OurStory1998_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public Midas_OurStory1998_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("Midas_OurStory1998.xml");
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
		try{
			
		/*
		String locator1 = locatorReader.getLocator("OurStory.ClickOurStory1981image");
		this.WaitForElementEnabled(locator1, 50);
		mouseOver(locator1);
		
		String locator = locatorReader.getLocator("OurStory.ClickOurStory1998image");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		*/
			WebElement element = driver.findElement(ByLocator("//ul[@id='mTS_1_container']//li[10]/a"));
			   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		
	}
		catch (Exception ex) {
	
			System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
			Assert.fail("locator not found");		
		} catch (Error ex) {
			
			System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
			Assert.fail("locator not found");
		}
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
	public void verifyMidasOurStory1998Page(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2)
	{
		//Reach upto Buy Now page(Behringer)
		ReachUptoOurStoryPage();
		int count = 0;
		
		// Verify vSpace1Height has the height of 70px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Height");
			String margin_top = this.getCSS(locator, "margin-top");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
						
			// Substring: To remove pixel(px text) from value
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx)-Integer.parseInt("4");
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel-Integer.parseInt("4");
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace1Height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1998 vSpace1Height Exception>>Expected Margin Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 vSpace1Height Error>>Expected Width:70px");
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
			System.out.println("Midas OurStory 1998 TextSpace8Height Exception>>Expected Result:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 TextSpace8Height Error>>Expected Result:20px");
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
			System.out.println("Midas OurStory 1998 textSpace6Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 textSpace6Height Error>>Expected Result:40px");
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
			System.out.println("Midas OurStory 1998 BodayCopyLeadingHeight Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 vSpace4Height Error>>Expected Result:40px");
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
			System.out.println("Midas OurStory 1998 vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		// Verify FullWidthBoxImage6 has the width of 326px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.FirstImagewidth");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(FullWidthBoxImage, width);
		//	Assert.assertEquals(ImageWidth2, width);
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1998 FullWidthBoxImage6 Exception>>Expected Result:980px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 FullWidthBoxImage6 Error>>Expected Result:980px");
			count = count + 1;
		}
		// Verify FullWidthBoxImage6 has the width of 980px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.FullWidthImage2");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(ImageWidth2, width);
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1998 FullWidthBoxImage6 Exception>>Expected Result:326px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 FullWidthBoxImage6 Error>>Expected Result:326px");
			count = count + 1;
		}

			// Verify vSpace1Height has the height of 40px.
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
			String margin_top = this.getCSS(locator1, "margin-bottom");
					
					
			System.out.println("Actual result" + margin_top);
			Assert.assertEquals(vSpace1Height, margin_top);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1998 vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 vSpace1Height Error>>Expected Result:7s0px");
			count = count + 1;
		}
		
		
		// Verify Gutter16width has the height of 34px.
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.gutter16width1");
			String margin_right = this.getCSS(locator1, "margin-right");
					
					
			System.out.println("Actual result" + margin_right);
			Assert.assertEquals(Gutter16Width, margin_right);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1998 Gutter16Width Exception>>Expected Result:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 Gutter16Width Error>>Expected Result:34px");
			count = count + 1;
		}
		// Verify Gutter16width has the height of 34px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.gutter16width3");
			String margin_right = this.getCSS(locator, "margin-right");
						
					
			System.out.println("Actual result" + margin_right);
			Assert.assertEquals(Gutter16Width, margin_right);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1998 Gutter16Width Exception>>Expected Result:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 Gutter16Width Error>>Expected Result:34px");
			count = count + 1;
		}
		
		// Verify Gutter16width has the height of 34px.
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.gutter16width22");
			String margin_right = this.getCSS(locator1, "margin-right");
					
					
			System.out.println("Actual result" + margin_right);
			Assert.assertEquals(Gutter16Width, margin_right);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1998 Gutter16Width Exception>>Expected Result:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 Gutter16Width Error>>Expected Result:34px");
			count = count + 1;
		}
		// Verify vspace4Height has the height of 40px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.gutter16width1");
			String margin_top = this.getCSS(locator, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);		
			
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSPace1Heightbelowthreeimages1");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getsubpixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+getsubpixel-Integer.parseInt("3");
			String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
			
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1998 Gutter16Width Exception>>Expected Result:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 Gutter16Width Error>>Expected Result:34px");
			count = count + 1;
		}
		// Verify vspace4Height has the height of 40px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.gutter16width22");
			String margin_top = this.getCSS(locator, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);		
			
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSPace1Heightbelowthreeimages22");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getsubpixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+getsubpixel-Integer.parseInt("3");
			String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
			
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1998 Gutter16Width Exception>>Expected Result:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 Gutter16Width Error>>Expected Result:34px");
			count = count + 1;
		}
		// Verify vspace4Height has the height of 40px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.gutter16width3");
			String margin_top = this.getCSS(locator, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);		
			
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSPace1Heightbelowthreeimages3");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getsubpixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+getsubpixel-Integer.parseInt("3");
			String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
			
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1998 Gutter16Width Exception>>Expected Result:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 Gutter16Width Error>>Expected Result:34px");
			count = count + 1;
		}
		
		// Verify vSpace1Height has the height of 70px.
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
			String margin_right = this.getCSS(locator1, "margin-bottom");
					
					
			System.out.println("Actual result" + margin_right);
			Assert.assertEquals(vSpace1Height, margin_right);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1998 Vspace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 Vspace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has the height of 70px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
			String margin_top = this.getCSS(locator, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);		
			
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSPace1Heightbelowthreeimages3");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getsubpixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+getsubpixel-Integer.parseInt("4");
			String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);		
			
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 1998 Vspace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 1998 Vspace1Height Error>>Expected Result:70px");
			count = count + 1;
		}	
	//Verify the final result
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);	
	}	
}