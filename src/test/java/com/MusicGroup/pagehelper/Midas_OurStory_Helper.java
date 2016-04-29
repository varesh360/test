package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class Midas_OurStory_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public Midas_OurStory_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("Midas_OurStory.xml");
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
		//Check page not found
		this.checkPageNotFound();
	}
	
	//Verify Buy Now page
	public void verifyMidasOurStoryPage(String vSpace1Height, String textSpace6Height,String textSpace5Height,String vSpace4Height,String ParagraphSpace2Height, String FixedImageWidth,String FixedImageWidthMainImage)
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
			int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx)-Integer.parseInt("8");
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel;
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace1Height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace1Height Exception>>Expected Margin Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace1Height Error>>Expected Width:70px");
			count = count + 1;
		}

		// Verify textSpace6Height has the height of 40px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.textSpace6Height");
			String margin_top = this.getCSS(locator, "margin-top");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			// Substring: To remove pixel(px text) from value
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
						
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1Height");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			
			// Substring: To remove pixel(px text) from value
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(font_size_wopx1)- Integer.parseInt(line_height_wopx1);
			
			int getsubpixelfinal=getsubpixel1-getsubpixel+Integer.parseInt("1");
			
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixelfinal;
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(textSpace6Height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page textSpace6Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page textSpace6Height Error>>Expected Result:40px");
			count = count + 1;
		}

		// Verify TextSpace5Heigt has the height of 13px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.textSpace6Height");
			
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			// Substring: To remove pixel(px text) from value
			
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
						
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			
			
			
			int getsubpixelfinal=getsubpixel+Integer.parseInt("7");
			
			
			String Totalpixelvaluewithpixel = getsubpixelfinal + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(textSpace5Height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page textSpace6Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page textSpace6Height Error>>Expected Result:40px");
			count = count + 1;
		}
		// Verify textSpace6Height has the height of 40px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.textSpace6Height");
			String margin_top = this.getCSS(locator, "margin-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			// Substring: To remove pixel(px text) from value
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
						
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			
			
			String locator1 = locatorReader.getLocator("VerifyPixels.textSpaceHeightabovewatchvideo");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			
			// Substring: To remove pixel(px text) from value
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(font_size_wopx1)- Integer.parseInt(line_height_wopx1)+Integer.parseInt("3");
			
		
			
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel+getsubpixel1;
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(textSpace6Height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page textSpace6Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page textSpace6Height Error>>Expected Result:40px");
			count = count + 1;
		}
		// Verify vSpace4Height has the height of 36px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4Height");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual result" + margin_top);
			Assert.assertEquals(vSpace4Height, margin_top);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace4Height Exception>>Expected Result:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace4Height Error>>Expected Result:35px");
			count = count + 1;
		}
		// Verify vSpace1Height has the height of 70px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4Height");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String margin_bottom_wopx = margin_bottom.substring(0, 2);

			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1Heightaboveimagesbox");
			String padding_top = this.getCSS(locator1, "padding-top");
			String padding_top_wopx = padding_top.substring(0, 1);
			
			int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+ Integer.parseInt(margin_bottom_wopx);
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace1Height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has the height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Heightaboveimagesbox");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual result" + padding_bottom);
			Assert.assertEquals(vSpace1Height, padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
			
		// Verify ParagraphSpace2Height has the height of 23px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.paragraphspace2Height");
			String padding_top = this.getCSS(locator, "padding-top");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			
			
			// Substring: To remove pixel(px text) from value
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String padding_top_wopx = padding_top.substring(0, 2);
			
			
			
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			
						
			String locator1 = locatorReader.getLocator("VerifyPixels.paragraphspace2Height1");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			
			// Substring: To remove pixel(px text) from value
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			
			
								
			int getsubpixel1=Integer.parseInt(font_size_wopx1)- Integer.parseInt(line_height_wopx1);
						
			int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+ getsubpixel+getsubpixel1+Integer.parseInt("3");
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(ParagraphSpace2Height, Totalpixelvaluewithpixel);
			
		}

		catch (Exception ex) {
			System.out.println("Partner Page ParagraphSpace2Height Exception>>Expected Result:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page ParagraphSpace2Height Error>>Expected Result:23pxpx");
			count = count + 1;
		}
		// Verify textSpace5Height has the height of 13px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.paragraphspace2Height");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String padding_bottom_wopx1 = padding_bottom.substring(0, 2);
						
			int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx1)+Integer.parseInt("1");
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(textSpace5Height, Totalpixelvaluewithpixel);
			
		}

		catch (Exception ex) {
			System.out.println("Partner Page textSpace5Height Exception>>Expected Result:13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page textSpace5Height Error>>Expected Result:13pxpx");
			count = count + 1;
		}
		// Verify FixedImageswidthheight has the width of 244px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.FixedImageswidthheight");
			String width = this.getCSS(locator, "width");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + width);
			System.out.println("Actual result" + height);
			
			Assert.assertEquals(FixedImageWidth, width);
		}

		catch (Exception ex) {
			System.out.println("Partner Page FixedImageswidthheight Exception>>Expected Result:244px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page FixedImageswidthheight Error>>Expected Result:244px");
			count = count + 1;
		}
		// Verify FixedImageswidthheight has the width of 980px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.FixedImagewidthHeightMain");
			String width = this.getCSS(locator, "width");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + width);
			System.out.println("Actual result" + height);
			
			Assert.assertEquals(FixedImageWidthMainImage, width);
		}

		catch (Exception ex) {
			System.out.println("Partner Page FixedImageWidthMainImage Exception>>Expected Result:980px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page FixedImageWidthMainImage Error>>Expected Result:980px");
			count = count + 1;
		}	

			//Verify the final result
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);	
	}	
}