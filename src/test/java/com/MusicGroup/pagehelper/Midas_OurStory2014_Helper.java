package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class Midas_OurStory2014_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public Midas_OurStory2014_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("Midas_OurStory2014.xml");
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
		System.out.println(" Click Our Story");
	}	
	//Click on OurStory1970
	public void clickOurStory1970()
	{
		try{
			WebElement element = driver.findElement(ByLocator("//ul[@id='mTS_1_container']//li[19]/a"));
			   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	
		/*
			   String locator1 = locatorReader.getLocator("OurStory.ClickOurStory1981image");
		this.WaitForElementEnabled(locator1, 10);
		mouseOver(locator1);
		*/
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//li[@class='img-seperate-block col-md-2 mTSThumbContainer'][19]/a[@class='/brand/midas/ourstory/2014?active=Our story']")));
		/*
		
		String locator2 = locatorReader.getLocator("OurStory.ClickOurStory1981image1");
		this.WaitForElementEnabled(locator2, 50);
		mouseOver(locator2);
		*/
		
		/*
		
		String locator = locatorReader.getLocator("OurStory.ClickOurStory1981image1");
		this.WaitForElementEnabled(locator, 10);
		clickOn(locator);
		
		
		String locator5 = locatorReader.getLocator("OurStory.MouseOveron12");
		this.WaitForElementEnabled(locator5, 30);
		clickOn(locator5);
		
				String locator2 = locatorReader.getLocator("OurStory.Clickon2012");
		this.WaitForElementEnabled(locator2, 10);
		clickOn(locator2);
		
		
		String locator4 = locatorReader.getLocator("OurStory.MouseOveron14");
		this.WaitForElementEnabled(locator4, 30);
		mouseOver(locator4);
	
		
		String locator3 = locatorReader.getLocator("OurStory.Clickon2014");
		this.WaitForElementVisible(locator3, 10);
		clickOn(locator3);
		
		*/
		/*
		String locator7 = locatorReader.getLocator("OurStory.MouseOver2014text");
		this.WaitForElementEnabled(locator7, 50);
		mouseOver(locator7);
		
		
		*/
		}
catch (Exception ex) {
			
			System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
			Assert.fail("locator not found");
		} catch (Error ex) {
			
			System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
			Assert.fail("locator not found");
		}
	}
	
	public void click2014year()
	{
		String locator = locatorReader.getLocator("OurStory.Click2014text");
		System.out.println("       "+locator);
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
		
		//this.click2014year();
		//Check page not found
		this.checkPageNotFound();
	}
	
	//Verify Buy Now page
	public void verifyMidasOurStory2014Page(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2,String CallOutBodyCopyWidth, String Gutter2Width)
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
			System.out.println("Midas OurStory 2002 vSpace1Height Exception>>Expected Margin Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 2002 vSpace1Height Error>>Expected Width:70px");
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
			System.out.println("Midas OurStory 2002 TextSpace8Height Exception>>Expected Result:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 2002 TextSpace8Height Error>>Expected Result:20px");
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
			System.out.println("Midas OurStory 2002 textSpace6Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 2002 textSpace6Height Error>>Expected Result:40px");
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
			System.out.println("Midas OurStory 2002 BodayCopyLeadingHeight Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 2002 vSpace4Height Error>>Expected Result:40px");
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
		   int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			String locator1 = locatorReader	.getLocator("VerifyPixels.vSpace4Heightaboveimage");
			String margin_top = this.getCSS(locator1, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);
			
		int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(margin_top_wopx)+getsubpixel;
							
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 2002 vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 2002 vSpace4Height Error>>Expected Result:40px");
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
			System.out.println("Midas OurStory 2002 FullWidthBoxImage6 Exception>>Expected Result:980px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 2002 FullWidthBoxImage6 Error>>Expected Result:980px");
			count = count + 1;
		}
		
		// Verify textSpace6Height has the height of 40px.
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightabovebelowFirstImage");
			String margin_top = this.getCSS(locator1, "padding-top");
			
			
			
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightBelowFirstImagetext");
				
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			
			// Substring: To remove pixel(px text) from value
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			
			String font_size_wopx = font_size.substring(0, 2);
			
							
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);			
			
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+getsubpixel-Integer.parseInt("3");
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(TextSpace6Height, Totalpixelvaluewithpixel);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 2002 textSpace6Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 2002 textSpace6Height Error>>Expected Result:40px");
			count = count + 1;
		}

		// Verify TextSpace1Height has the height of 35px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightBelowFirstImagetext");
			String padding_bottom = this.getCSS(locator, "padding-bottom");	
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			
			// Substring: To remove pixel(px text) from value
			String padding_bottom_wopx = padding_bottom.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
		
						
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);	
			
			
			int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+getsubpixel+Integer.parseInt("5");
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(TextSpace1Height, Totalpixelvaluewithpixel);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 2002 textSpace6Height Exception>>Expected Result:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 2002 textSpace6Height Error>>Expected Result:35px");
			count = count + 1;
		}


		// Verify vSpace1Height has the height of 70px.
	try {
		String locator = locatorReader.getLocator("VerifyPixels.vSpace1heightaboveawardtext");
		String margin_top = this.getCSS(locator, "margin-top");						
		String margin_top_wopx = margin_top.substring(0, 2);
		
		String line_height = this.getCSS(locator, "line-height");
		String font_size = this.getCSS(locator, "font-size");
		
		String line_height_wopx = line_height.substring(0, 2);
		String font_size_wopx = font_size.substring(0, 2);
		
					
		int getsubpixel = Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
			// Substring: To remove pixel(px text) from value
	
		
		int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+getsubpixel-Integer.parseInt("8");
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

		// Verify vSpace1Height has the height of 40px.
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightseeAllMidas");
			String padding_top = this.getCSS(locator1, "margin-top");
			String padding_top_wopx = padding_top.substring(0, 2);
			System.out.println("PaddingTop"+padding_top);
			
			String locator = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
			String line_height = this.getCSS(locator, "line-height");
			
			String font_size = this.getCSS(locator, "font-size");
			
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) ;
				System.out.println("getPixel is"+getsubpixel);
			int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+getsubpixel- Integer.parseInt("4");
			
			
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
						
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
			
		}

		catch (Exception ex) {
			System.out.println("Midas OurStory 2002 vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 2002 vSpace4Height Error>>Expected Result:40px");
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
			System.out.println("Midas OurStory 2002 vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas OurStory 2002 vSpace1Height Error>>Expected Result:7s0px");
			count = count + 1;
		}
		
					System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);	
	}	
}
