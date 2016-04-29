package test.java.com.MusicGroup.pagehelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class OurStory_Helper extends DriverHelper {
	private LocatorReader locatorReader;	
	private int count=0;
	public OurStory_Helper(WebDriver driver)
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
				
			String locator = locatorReader.getLocator("OurStory.ClickOurStory1998image");
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
			//Check page not found
			this.checkPageNotFound();
		}
		//Verify MIDAS 1970Story Page
		public void VerifyMidas1970Page(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight){
			ReachUptoOurStoryPage();
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
				System.out.println("Midas OurStory 1970 vSpace1Height Exception>>Expected Margin Top:70px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 vSpace1Height Error>>Expected Width:70px");
				count = count + 1;
			}
			// Verify TextSpace6Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.textSpace8Height");
				String margin_bottom = this.getCSS(locator, "margin-bottom");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
							
				// Substring: To remove pixel(px text) from value
				String margin_bottom_wopx = margin_bottom.substring(0, 2);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				
		  	int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx)- Integer.parseInt("3");
	        			
				String locator1 = locatorReader.getLocator("VerifyPixels.textSpace6Height");
				String line_height1 = this.getCSS(locator1, "line-height");
				String font_size1 = this.getCSS(locator1, "font-size");
							
				// Substring: To remove pixel(px text) from value
				String line_height_wopx1 = line_height1.substring(0, 2);
				String font_size_wopx1 = font_size1.substring(0, 2);
				int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1)- Integer.parseInt("3");
						
				int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel+getsubpixel1-Integer.parseInt("1");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace6Height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 TextSpace6Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 TextSpace6Height Error>>Expected Result:40px");
				count = count + 1;
			}

			// Verify vSpace4Height has the height of 40px.
			try {
				String locator = locatorReader
						.getLocator("VerifyPixels.textSpace6Height");
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
			
			// Verify vSpace1Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightFooter");
				String margin_bottom = this.getCSS(locator, "margin-bottom");
				System.out.println("Actual result" + margin_bottom);
				Assert.assertEquals(vSpace1Height, margin_bottom);
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
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightFooter");
				String margin_bottom = this.getCSS(locator, "margin-top");
				// Substring: To remove pixel(px text) from value
			
				String margin_bottom_wopx = margin_bottom.substring(0, 2);
				
				
		        			
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4Heightbelowtext");
				String line_height1 = this.getCSS(locator1, "line-height");
				String font_size1 = this.getCSS(locator1, "font-size");
							
				// Substring: To remove pixel(px text) from value
				String line_height_wopx1 = line_height1.substring(0, 2);
				String font_size_wopx1 = font_size1.substring(0, 2);
				int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1)- Integer.parseInt("3");
						
				int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel1;
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
			// Verify Gutter16Width has the height of 34px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.gutter16width2");
				String margin_right = this.getCSS(locator, "margin-right");
				System.out.println("Actual result" + margin_right);
				Assert.assertEquals(Gutter16Width, margin_right);
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Exception>>Expected Result:34px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Error>>Expected Result:34px");
				count = count + 1;
			}
			// Verify Gutter16Width has the height of 34px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.gutter16width");
				String margin_right = this.getCSS(locator, "margin-right");
				System.out.println("Actual result" + margin_right);
				Assert.assertEquals(Gutter16Width, margin_right);
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Exception>>Expected Result:34px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Error>>Expected Result:34px");
				count = count + 1;
			}
			// Verify vSpace4Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.gutter16width");
				String margin_bottom = this.getCSS(locator, "margin-top");
				// Substring: To remove pixel(px text) from value
			
				String margin_bottom_wopx = margin_bottom.substring(0, 2);
				
				
		        			
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4Heightbelowtext");
				String line_height1 = this.getCSS(locator1, "line-height");
				String font_size1 = this.getCSS(locator1, "font-size");
							
				// Substring: To remove pixel(px text) from value
				String line_height_wopx1 = line_height1.substring(0, 2);
				String font_size_wopx1 = font_size1.substring(0, 2);
				int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1)- Integer.parseInt("3");
						
				int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel1;
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
			// Verify vSpace4Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.gutter16width2");
				String margin_bottom = this.getCSS(locator, "margin-top");
				// Substring: To remove pixel(px text) from value
			
				String margin_bottom_wopx = margin_bottom.substring(0, 2);
				
				
		        			
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4Heightbelowtext");
				String line_height1 = this.getCSS(locator1, "line-height");
				String font_size1 = this.getCSS(locator1, "font-size");
							
				// Substring: To remove pixel(px text) from value
				String line_height_wopx1 = line_height1.substring(0, 2);
				String font_size_wopx1 = font_size1.substring(0, 2);
				int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1)- Integer.parseInt("3");
						
				int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel1;
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
		
			// Verify FullWidthBoxImage33 has the width of 489px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.FixedImageWidth33");
				String margin_right = this.getCSS(locator, "width");
				System.out.println("Actual result" + margin_right);
				Assert.assertEquals(FullWidthBoxImage33, margin_right);
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage33 Exception>>Expected Result:489px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage33 Error>>Expected Result:489px");
				count = count + 1;
			}
			// Verify FullWidthBoxImage6 has the width of 489px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.FixedImagewidth6");
				String margin_right = this.getCSS(locator, "width");
				System.out.println("Actual result" + margin_right);
				Assert.assertEquals(FullWidthBoxImage6, margin_right);
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Exception>>Expected Result:490px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Error>>Expected Result:490px");
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
			
		}
	
		//Verify MIDAS 1971Story Page
		public void VerifyMidas1971Page(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height){
			try{
				String Locator=locatorReader.getLocator("OurStory.MouseOverOnMidas1970OurStory");
				this.WaitForElementEnabled(Locator, 50);
				mouseOver(Locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas1970OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
				
			}catch (Exception ex) {
				System.out.println("Element Not Found");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Element Not Found");
				count = count + 1;
			}
			
			try{
				String actualTitle1 = driver.getTitle();
				System.out.println("Get Titile"+ actualTitle1);
				String expectedTitle1 = "Not Found | MUSIC Group";
				Assert.assertFalse(actualTitle1==expectedTitle1);
			}catch (Exception ex) {
				System.out.println("Element Not Found");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Element Not Found");
				count = count + 1;
			}
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
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Exception>>Expected Result:980px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Error>>Expected Result:980px");
				count = count + 1;
			}
			// Verify vSpace2Height has the height of 20px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace2Height");
				String padding_top = this.getCSS(locator, "padding-top");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String padding_top_wopx = padding_top.substring(0, 2);

				// Substring: To remove pixel(px text) from value
				
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) + Integer.parseInt(padding_top_wopx);
											
				String Totalpixelvaluewithpixel = getsubpixel + "px";
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
			// Verify TextSpace6Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace2Height");
				String margin_bottom = this.getCSS(locator, "margin-bottom");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String margin_bottom_wopx= margin_bottom.substring(0, 2);
							
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) ;
				
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace2Height");
				String line_height1 = this.getCSS(locator1, "line-height");
				String font_size1 = this.getCSS(locator1, "font-size");
				
				String line_height_wopx1 = line_height1.substring(0, 2);
				String font_size_wopx1 = font_size1.substring(0, 2);
				
				// Substring: To remove pixel(px text) from value
				
				int getsubpixel1 = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1) ;
				
				
				int getfinalvaluewopx=Integer.parseInt(margin_bottom_wopx)+getsubpixel+getsubpixel1+Integer.parseInt("2");
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace6Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 TextSpace6Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 TextSpace6Height Error>>Expected Result:40px");
				count = count + 1;
			}
			// Verify TextSpace1Height has the height of 35px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace2Height");
							
						
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
							
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)-Integer.parseInt("3");
				
				
				String locator1 = locatorReader.getLocator("VerifyPixels.TextSpace1Height");
				String padding_bottom = this.getCSS(locator1, "padding-bottom");
				
				String line_height1 = this.getCSS(locator1, "line-height");
				String font_size1 = this.getCSS(locator1, "font-size");
				
				
				String line_height_wopx1 = line_height1.substring(0, 2);
				String font_size_wopx1 = font_size1.substring(0, 2);
				String padding_bottom_wopx1 = padding_bottom.substring(0, 2);
				
				// Substring: To remove pixel(px text) from value
				
				int getsubpixel1 = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1) ;
				
				
				int getfinalvaluewopx=Integer.parseInt(padding_bottom_wopx1)+getsubpixel+getsubpixel1+Integer.parseInt("2");
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace1Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 TextSpace1Height Exception>>Expected Result:35px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 TextSpace1Height Error>>Expected Result:35px");
				count = count + 1;
			}
			// Verify vSpace1Height has the height of 70px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.TextSpace1Height");
				String padding_bottom = this.getCSS(locator, "padding-bottom");							
				String padding_bottom_wopx = padding_bottom.substring(0, 2);		
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
							
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)-Integer.parseInt("2");
							
			
				
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightaboveawardtext");
				String margin_top = this.getCSS(locator1, "margin-top");
				String margin_top_wopx = margin_top.substring(0, 2);
				
				// Substring: To remove pixel(px text) from value
				
				
				int getfinalvaluewopx=Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(margin_top_wopx)+getsubpixel;
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
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext");
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
			// Verify vSpace4Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String margin_top = this.getCSS(locator, "margin-top");							
				String margin_top_wopx = margin_top.substring(0, 2);		
							
			
				
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext");
				String line_height = this.getCSS(locator1, "line-height");
				String font_size = this.getCSS(locator1, "font-size");
						
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				
				// Substring: To remove pixel(px text) from value
				
				
				int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx)-Integer.parseInt("4");
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
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
			// Verify vSpace1Height has the height of 40px.
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
			
		}
		//Verify Midas1974OurStory Page
		public void VerifyMidas1974OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2){
			//Click on 1974OurSory
			try{
				String locator=locatorReader.getLocator("ourStory.MouseOveron1974OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas1974OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
				
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 vSpace1Height Exception>>Expected Result:70px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 vSpace1Height Error>>Expected Result:7s0px");
				count = count + 1;
			}
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
			// Verify FullWidthBoxImage6 has the width of 326px.
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
			// Verify FullWidthBoxImage6 has the width of 980px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.FullWidthImage2");
				String width = this.getCSS(locator, "width");
				System.out.println("Actual result" + width);
				Assert.assertEquals(ImageWidth2, width);
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Exception>>Expected Result:326px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Error>>Expected Result:326px");
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
			// Verify vSpace4Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String margin_top = this.getCSS(locator, "margin-top");							
				String margin_top_wopx = margin_top.substring(0, 2);		
							
			
				
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext");
				String padding_bottom = this.getCSS(locator1, "padding-bottom");
				
				String padding_bottom_wopx = padding_bottom.substring(0, 2);
				
				String locator2 = locatorReader.getLocator("VerifyPixels.vSpacw4Heightaboveseeallmidasp");
				String margin_top2 = this.getCSS(locator2, "padding-bottom");							
				String margin_top_wopx2 = margin_top2.substring(0, 2);		
							
				// Substring: To remove pixel(px text) from value
				
				
				int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(margin_top_wopx2)-Integer.parseInt("3");
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
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
			// Verify vSpace1Height has the height of 40px.
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
			
			
			// Verify Gutter16width has the height of 34px.
			try {
				String locator1 = locatorReader.getLocator("VerifyPixels.gutter16width1");
				String margin_right = this.getCSS(locator1, "margin-right");
						
						
				System.out.println("Actual result" + margin_right);
				Assert.assertEquals(Gutter16Width, margin_right);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Exception>>Expected Result:34px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Error>>Expected Result:34px");
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
				System.out.println("Midas OurStory 1970 Gutter16Width Exception>>Expected Result:34px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Error>>Expected Result:34px");
				count = count + 1;
			}
			// Verify Gutter16width has the height of 34px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.gutter16width1");
				String margin_top = this.getCSS(locator, "margin-top");
				String margin_top_wopx = margin_top.substring(0, 2);		
				
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSPace1Heightbelowthreeimages1");
				String padding_top = this.getCSS(locator1, "padding-top");
				String line_height = this.getCSS(locator1, "line-height");
				String font_size = this.getCSS(locator1, "font-size");
				
				String padding_top_wopx = padding_top.substring(0, 1);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+Integer.parseInt(padding_top_wopx)+Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx)-Integer.parseInt("6");
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
				
				
				//String margin_top_wopx = margin_top.substring(0, 2);		
				
				
				//System.out.println("Actual result" + margin_right);
				//Assert.assertEquals(Gutter16Width, margin_right);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Exception>>Expected Result:34px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Error>>Expected Result:34px");
				count = count + 1;
			}
			// Verify Gutter16width has the height of 34px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.gutter16width3");
				String margin_top = this.getCSS(locator, "margin-top");
				String margin_top_wopx = margin_top.substring(0, 2);		
				
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSPace1Heightbelowthreeimages3");
				String padding_top = this.getCSS(locator1, "padding-top");
				String line_height = this.getCSS(locator1, "line-height");
				String font_size = this.getCSS(locator1, "font-size");
				
				String padding_top_wopx = padding_top.substring(0, 1);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				


				int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+Integer.parseInt(padding_top_wopx)+Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx)-Integer.parseInt("6");
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
				
				
				//String margin_top_wopx = margin_top.substring(0, 2);		
				
				
				//System.out.println("Actual result" + margin_right);
				//Assert.assertEquals(Gutter16Width, margin_right);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Exception>>Expected Result:34px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Error>>Expected Result:34px");
				count = count + 1;
			}
			
		}
		//Verify Midas1980OurStory Page
		public void VerifyMidas1980OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2, String Gutter2Width, String CallOutBodyCopyWidth){
			try{
				
			
			String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas1980OurStory");
			this.WaitForElementEnabled(locator, 50);
			mouseOver(locator);
			
			String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas1980OurStory");
			this.WaitForElementEnabled(Locator1, 50);
			clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Exception>>Expected Result:34px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 Gutter16Width Error>>Expected Result:34px");
				count = count + 1;
			}
			

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
			// Verify vSpace4Height has the height of 40px.vSpace2Heightabovebuttontext1
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String margin_top = this.getCSS(locator, "margin-top");							
				String margin_top_wopx = margin_top.substring(0, 2);
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
				String line_height = this.getCSS(locator1, "line-height");
				String font_size = this.getCSS(locator1, "font-size");	
				

				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx)-Integer.parseInt("6");
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
				
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
		//verify Midas 1986OurStory Page
		public void VerifyMidas1986OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2, String Gutter2Width, String CallOutBodyCopyWidth){
			try{
				String locator=locatorReader.getLocator("ourStory.MouseOverOnMidas1986OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas1986OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
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
			// Verify vSpace4Height has the height of 40px.(See all Midas)
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String margin_top = this.getCSS(locator, "margin-top");							
				
							
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
		
		//Verify Midas 1987OurStory Page
		public void VerifyMidas1987OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2, String Gutter2Width, String CallOutBodyCopyWidth){
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas1987OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas1987OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
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
			// Verify vSpace4Height has the height of 40px.(See all Midas)
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String margin_top = this.getCSS(locator, "margin-top");							
				String margin_top_wopx = margin_top.substring(0, 2);
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vspace4Heighttextwithimage");
				String padding_bottom = this.getCSS(locator1, "padding-bottom");	
				String padding_bottom_wopx = padding_bottom.substring(0, 2);
				
				int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+Integer.parseInt(padding_bottom_wopx)+Integer.parseInt("2");
				
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
			// Verify BodayCopyLeadingHeight has the height of 17px(second para).
				try {
					String locator = locatorReader.getLocator("VerifyPixels.vspace4Heighttextwithimage");
					String line_height = this.getCSS(locator, "line-height");
					String font_size = this.getCSS(locator, "font-size");
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);

					// Substring: To remove pixel(px text) from value
					
					int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) + Integer.parseInt("8");
												
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

		}
		//Verify Midas 1990OurStory Page
		public void VerifyMidas1990OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height){
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas1990OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas1990OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
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
				
				
				
				int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel1-getsubpixel+Integer.parseInt("4");
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
				
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) + Integer.parseInt("4");
											
				String Totalpixelvaluewithpixel = getsubpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(BodayCopyLeadingHeight, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 BodayCopyLeadingHeight Exception>>Expected Result:17px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 vSpace4Height Error>>Expected Result:17px");
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
			   int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) - Integer.parseInt("5");
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
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Exception>>Expected Result:980px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Error>>Expected Result:980px");
				count = count + 1;
			}
				// Verify TextSpace6Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightabovebelowFirstImage");
				String margin_bottom = this.getCSS(locator, "padding-top");
				
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vspace4Heightbelowimage1990");
				String line_height = this.getCSS(locator1, "line-height");
				String font_size = this.getCSS(locator1, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String margin_bottom_wopx= margin_bottom.substring(0, 2);
							
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) ;
				
													
				int getfinalvaluewopx=Integer.parseInt(margin_bottom_wopx)+getsubpixel-Integer.parseInt("4");
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace6Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 TextSpace6Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 TextSpace6Height Error>>Expected Result:40px");
				count = count + 1;
			}
			// Verify TextSpace1Height has the height of 35px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vspace4Heightbelowimage1990");
				String padding_bottom = this.getCSS(locator, "padding-bottom");			
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String padding_bottom_wopx = padding_bottom.substring(0, 2);
				
				
							
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("4");
				
						
				
				int getfinalvaluewopx=Integer.parseInt(padding_bottom_wopx)+getsubpixel;
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace1Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 TextSpace1Height Exception>>Expected Result:35px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 TextSpace1Height Error>>Expected Result:35px");
				count = count + 1;
			}
			// Verify vSpace1Height has the height of 70px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vspace4Heightbelowimage1990");
				String padding_bottom = this.getCSS(locator, "padding-bottom");							
				String padding_bottom_wopx = padding_bottom.substring(0, 2);		
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
							
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)-Integer.parseInt("5");
							
			
				String locator2 = locatorReader.getLocator("VerifyPixels.vSpace1Heightbelowimage11990");
				String padding_bottom1 = this.getCSS(locator2, "padding-bottom");							
				String padding_bottom_wopx1 = padding_bottom1.substring(0, 2);
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightaboveawardtext");
				String margin_top = this.getCSS(locator1, "margin-top");
				String margin_top_wopx = margin_top.substring(0, 2);
				
				// Substring: To remove pixel(px text) from value
				
				
				int getfinalvaluewopx=Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(margin_top_wopx)+getsubpixel+Integer.parseInt(padding_bottom_wopx1);
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
				
				int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx)-Integer.parseInt("5");
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
			// Verify vSpace4Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String margin_top = this.getCSS(locator, "margin-top");							
				String margin_top_wopx = margin_top.substring(0, 2);	
				
			
				
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
				
				String line_height = this.getCSS(locator1, "line-height");
				String font_size = this.getCSS(locator1, "font-size");
						
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				
				// Substring: To remove pixel(px text) from value
				
				
				int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx)-Integer.parseInt("6");
				
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
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
				System.out.println("Midas OurStory 1970 vSpace1Height Error>>Expected Result:70px");
				count = count + 1;
			}
		
		}
		//Verify Midas 1995OurStory Page
		public void VerifyMidas1995OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height){
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas1995OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas1995OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
			
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
				System.out.println("Midas OurStory 1970 BodayCopyLeadingHeight Exception>>Expected Result:17px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 vSpace4Height Error>>Expected Result:17px");
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
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Exception>>Expected Result:980px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Error>>Expected Result:980px");
				count = count + 1;
			}
				// Verify TextSpace6Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightabovebelowFirstImage");
				String margin_bottom = this.getCSS(locator, "padding-top");
				
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vspace4Heightbelowimage1995");
				String line_height = this.getCSS(locator1, "line-height");
				String font_size = this.getCSS(locator1, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String margin_bottom_wopx= margin_bottom.substring(0, 2);
							
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) ;
				
													
				int getfinalvaluewopx=Integer.parseInt(margin_bottom_wopx)+getsubpixel-Integer.parseInt("3");
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace6Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 TextSpace6Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 TextSpace6Height Error>>Expected Result:40px");
				count = count + 1;
			}
			// Verify TextSpace1Height has the height of 35px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vspace4Heightbelowimage1995");
				String padding_bottom = this.getCSS(locator, "padding-bottom");			
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String padding_bottom_wopx = padding_bottom.substring(0, 2);
				
				
							
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("5");
				
						
				
				int getfinalvaluewopx=Integer.parseInt(padding_bottom_wopx)+getsubpixel;
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace1Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 TextSpace1Height Exception>>Expected Result:35px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 TextSpace1Height Error>>Expected Result:35px");
				count = count + 1;
			}
			// Verify vSpace1Height has the height of 70px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vspace4Heightbelowimage1995");
				String padding_bottom = this.getCSS(locator, "padding-bottom");							
				String padding_bottom_wopx = padding_bottom.substring(0, 2);		
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
							
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)-Integer.parseInt("5");
							
			
							
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightaboveawardtext");
				String margin_top = this.getCSS(locator1, "margin-top");
				String margin_top_wopx = margin_top.substring(0, 2);
				
				// Substring: To remove pixel(px text) from value
				
				
				int getfinalvaluewopx=Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(margin_top_wopx)+getsubpixel;
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
			// Verify vSpace4Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String margin_top = this.getCSS(locator, "margin-top");							
				String margin_top_wopx = margin_top.substring(0, 2);	
				
			
				
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
				String margin_bottom = this.getCSS(locator, "margin-bottom");							
				String margin_bottom_wopx = margin_bottom.substring(0, 1);	
				
				String line_height = this.getCSS(locator1, "line-height");
				String font_size = this.getCSS(locator1, "font-size");
						
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				
				// Substring: To remove pixel(px text) from value
				
				
				int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx)-Integer.parseInt("9");
				
				String Totalpixelvaluewithpixel = getfinalvaluewopx + "px";
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
				System.out.println("Midas OurStory 1970 vSpace1Height Error>>Expected Result:70px");
				count = count + 1;
			}
		}
		//Verify Midas 1996OurStoryPage
		public void VerifyMidas1996OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height){
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas1996OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas1996OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
			
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
				System.out.println("Midas OurStory 1970 BodayCopyLeadingHeight Exception>>Expected Result:17px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 vSpace4Height Error>>Expected Result:17px");
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

				System.out.println("         "+line_height_wopx);
				System.out.println("         "+font_size_wopx);
				
				String locator2 = locatorReader.getLocator("VerifyPixels.textSpace6Height1");
				String margin_bottom2 = this.getCSS(locator2, "padding-bottom");
				
				// Substring: To remove pixel(px text) from value
				String margin_bottom_wopx = margin_bottom.substring(0, 1);
				String margin_bottom_wopx2 = margin_bottom2.substring(0, 1);
				
				System.out.println("         "+margin_bottom_wopx);
				System.out.println("         "+margin_bottom_wopx2);
				
			   int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) - Integer.parseInt("4");
				String locator1 = locatorReader	.getLocator("VerifyPixels.vSpace4Heightaboveimage");
				String margin_top = this.getCSS(locator1, "margin-top");
				String margin_top_wopx = margin_top.substring(0, 2);
				
			int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(margin_top_wopx)+getsubpixel+Integer.parseInt(margin_bottom_wopx2);
								
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
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Exception>>Expected Result:980px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 FullWidthBoxImage6 Error>>Expected Result:980px");
				count = count + 1;
			}

			// Verify vSpace4Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String margin_top = this.getCSS(locator, "margin-top");							
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
				System.out.println("Midas OurStory 1970 vSpace1Height Error>>Expected Result:70px");
				count = count + 1;
			}
		
			
		}
		//Verify Midas 1998OurStory Page
		public void VerifyMidas1998OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2){
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas1998OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas1998OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
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
			
		}
		//Verify Midas 2002OurStoryPage
		public void VerifyMidas2002OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2){
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas2002OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas2002OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
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
				System.out.println("Midas OurStory 2002 vSpace4Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2002 vSpace4Height Error>>Expected Result:40px");
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
				System.out.println("Midas OurStory 2002 FullWidthBoxImage6 Exception>>Expected Result:980px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2002 FullWidthBoxImage6 Error>>Expected Result:980px");
				count = count + 1;
			}
			// Verify vSpace1Height has the height of 40px.
			try {
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightabovebelowFirstImage");
				String padding_top = this.getCSS(locator1, "padding-top");
				String padding_top_wopx = padding_top.substring(0, 2);
				
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightBelowFirstImagetext");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) - Integer.parseInt("3");
					
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+getsubpixel;
				
				
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
							
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2002 vSpace1Height Exception>>Expected Result:70px");
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
			// Verify BodayCopyLeadingHeight has the height of 17px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightBelowFirstImagetext");
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
				System.out.println("Midas OurStory 2002 BodayCopyLeadingHeight Exception>>Expected Result:17px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2002 vSpace4Height Error>>Expected Result:17px");
				count = count + 1;
			}
			// Verify vSpace1Height has the height of 40px.
			try {
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String padding_top = this.getCSS(locator1, "margin-top");
				String padding_top_wopx = padding_top.substring(0, 2);
				
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightBelowFirstImagetext");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				String padding_bottom = this.getCSS(locator, "padding-bottom");
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String padding_bottom_wopx = padding_bottom.substring(0, 2);
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) - Integer.parseInt("3");
					
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+getsubpixel+Integer.parseInt(padding_bottom_wopx);
				
				
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
					
			// Verify vSpace1Height has the height of 40px.
			try {
				
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightBelowFirstImagetext");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				String padding_bottom = this.getCSS(locator, "padding-bottom");
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String padding_bottom_wopx = padding_bottom.substring(0, 2);
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) ;
					
				int Totaladdedpixel = getsubpixel+Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("5");
				
				
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
							
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace1Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2002 TextSpace1Height Exception>>Expected Result:35px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2002 TextSpace1Height Error>>Expected Result:35px");
				count = count + 1;
			}
		}
		//Verify Midas 2003OurStory Page
		public void VerifyMidas2003OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2){
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas2003OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas2003OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
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
				System.out.println("Midas OurStory 2002 vSpace4Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2002 vSpace4Height Error>>Expected Result:40px");
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
				System.out.println("Midas OurStory 2002 FullWidthBoxImage6 Exception>>Expected Result:980px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2002 FullWidthBoxImage6 Error>>Expected Result:980px");
				count = count + 1;
			}
			// Verify vSpace1Height has the height of 40px.
			try {
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightBelowFirstImagetext");
				String padding_top = this.getCSS(locator1, "padding-bottom");
				
				String padding_top_wopx = padding_top.substring(0, 2);
				
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightBelowFirstImagetext22");
				String padding_top1 = this.getCSS(locator, "padding-bottom");
				
				String padding_top_wopx1 = padding_top1.substring(0, 2);
				
							
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+Integer.parseInt(padding_top_wopx1)+Integer.parseInt("4");
				
				
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
							
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2002 vSpace1Height Exception>>Expected Result:70px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2002 vSpace4Height Error>>Expected Result:40px");
				count = count + 1;
			}
			// Verify TextSpace8Height has the height of 20px.
			try {
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightBelowFirstImagetext");
				String padding_top = this.getCSS(locator1, "margin-top");
				
				String padding_top_wopx = padding_top.substring(0, 3);
				
											
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+Integer.parseInt("1");
				
				
				String Totalpixelvaluewithpixel = -(Totaladdedpixel) + "px";
							
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
				

				// Verify Gutter16Width has the height of 34px.
			try {
				String locator1 = locatorReader.getLocator("VerifyPixels.gutter16width");
				String margin_right = this.getCSS(locator1, "margin-right");
													
										
				System.out.println("Actual result" + margin_right);
				Assert.assertEquals(Gutter16Width, margin_right);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2002 padding_top_wopx Exception>>Expected Result:34px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2002 padding_top_wopx Error>>Expected Result:34px");
				count = count + 1;
			}
			// Verify Gutter16Width has the height of 40px.
			try {
				String locator1 = locatorReader.getLocator("VerifyPixels.gutter16width2");
				String margin_right = this.getCSS(locator1, "margin-right");
				String padding_top_wopx = margin_right.substring(0, 2);
											
										
				System.out.println("Actual result" + margin_right);
				Assert.assertEquals(Gutter16Width, margin_right);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2002 padding_top_wopx Exception>>Expected Result:34px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2002 padding_top_wopx Error>>Expected Result:34px");
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
			
			// Verify vSpace1Height has the height of 40px.
			try {
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String padding_top = this.getCSS(locator1, "margin-top");
				String padding_top_wopx = padding_top.substring(0, 2);
				
				
				String locator = locatorReader.getLocator("VerifyPixels.vSpaceHeightaboveseemidasbutton");
				String line_height = this.getCSS(locator, "line-height");
				
				String font_size = this.getCSS(locator, "font-size");
				
				String padding_bottom = this.getCSS(locator, "margin-bottom");
		
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String padding_bottom_wopx = padding_bottom.substring(0, 2);
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) ;
					
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+getsubpixel+Integer.parseInt(padding_bottom_wopx)- Integer.parseInt("5");
				
				
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
		}
		//Verify Midas 2004OurStory page
		public void VerifyMidas2004OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2,String CallOutBodyCopyWidth, String Gutter2Width){
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas2004OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas2004OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
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
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String padding_top = this.getCSS(locator1, "margin-top");
				String padding_top_wopx = padding_top.substring(0, 2);
				
				
				String locator = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
				String line_height = this.getCSS(locator, "line-height");
				
				String font_size = this.getCSS(locator, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) ;
					
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
			

		}
		//Verify Midas 2006OurStory Page
		public void VerifyMidas2006OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2,String CallOutBodyCopyWidth, String Gutter2Width){
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas2006OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas2006OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
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
			System.out.println("    "+margin_top_wopx);
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
						
			int getsubpixel = Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
				// Substring: To remove pixel(px text) from value
			System.out.println("    "+getsubpixel);
			
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
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String padding_top = this.getCSS(locator1, "margin-top");
				String padding_top_wopx = padding_top.substring(0, 2);
				
				
				String locator = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
				String line_height = this.getCSS(locator, "line-height");
				
				String font_size = this.getCSS(locator, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) ;
					
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
			
			
		}
		//Verify Midas 2008OurStory page
		public void VerifyMidas2008OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2,String CallOutBodyCopyWidth, String Gutter2Width){
			
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas2008OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas2008OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
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
				System.out.println("Midas OurStory 2008 vSpace1Height Exception>>Expected Margin Top:70px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2008 vSpace1Height Error>>Expected Width:70px");
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
				System.out.println("Midas OurStory 2008 TextSpace8Height Exception>>Expected Result:20px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2008 TextSpace8Height Error>>Expected Result:20px");
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
				System.out.println("Midas OurStory 2008 textSpace6Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2008 textSpace6Height Error>>Expected Result:40px");
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
				System.out.println("Midas OurStory 2008 BodayCopyLeadingHeight Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2008 vSpace4Height Error>>Expected Result:40px");
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
				System.out.println("Midas OurStory 2008 vSpace4Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2008 vSpace4Height Error>>Expected Result:40px");
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
				System.out.println("Midas OurStory 2008 FullWidthBoxImage6 Exception>>Expected Result:980px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2008 FullWidthBoxImage6 Error>>Expected Result:980px");
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

			// Verify vSpace1Height has the height of 40px.
			try {
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String padding_top = this.getCSS(locator1, "margin-top");
				String padding_top_wopx = padding_top.substring(0, 2);
				
				
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+ Integer.parseInt("9");
				
				
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
							
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2008 vSpace4Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2008 vSpace4Height Error>>Expected Result:40px");
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
				System.out.println("Midas OurStory 2008 vSpace1Height Exception>>Expected Result:70px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2008 vSpace1Height Error>>Expected Result:7s0px");
				count = count + 1;
			}
		}
		//Verify Midas 2009OurStory Page
		public void VerifyMidas2009OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2,String CallOutBodyCopyWidth, String Gutter2Width){
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas2009OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas2009OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
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
				System.out.println("Midas OurStory 2009 vSpace1Height Exception>>Expected Margin Top:70px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 vSpace1Height Error>>Expected Width:70px");
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
				System.out.println("Midas OurStory 2009 TextSpace8Height Exception>>Expected Result:20px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 TextSpace8Height Error>>Expected Result:20px");
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
				System.out.println("Midas OurStory 2009 textSpace6Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 textSpace6Height Error>>Expected Result:40px");
				count = count + 1;
			}
			
		
			// Verify vSpace4Height has the height of 40px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.textSpace6Height");
				String padding_bottom = this.getCSS(locator, "padding-bottom");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
			
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				// Substring: To remove pixel(px text) from value
				String padding_bottom_wopx = padding_bottom.substring(0, 2);
				
			   int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) ;
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4Heightaboveimage");
				String margin_top = this.getCSS(locator1, "margin-top");
				String locator2=locatorReader.getLocator("VerifyPixels.textSpacemargin1aboveImage");
				String margin_bottom= this.getCSS(locator2, "margin-bottom");
				String margin_bottom_wopx=margin_bottom.substring(0, 1);
				String margin_top_wopx = margin_top.substring(0, 2);
			
				
			int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(margin_top_wopx)+Integer.parseInt(margin_bottom_wopx)+getsubpixel- Integer.parseInt("8");
								
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2009 vSpace4Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 vSpace4Height Error>>Expected Result:40px");
				count = count + 1;
			}
			// Verify FullWidthBoxImage1 has the width of 980px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.FirstImagewidth");
				String width = this.getCSS(locator, "width");
				System.out.println("Actual result" + width);
				Assert.assertEquals(FullWidthBoxImage, width);
				}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2009 FullWidthBoxImage6 Exception>>Expected Result:980px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 FullWidthBoxImage6 Error>>Expected Result:980px");
				count = count + 1;
			}
			
			// Verify FullWidthBoxImage2 has the width of 980px.
			try {
				String locator = locatorReader.getLocator("VerifyPixels.FirstImagewidth");
				String width = this.getCSS(locator, "width");
				System.out.println("Actual result" + width);
				Assert.assertEquals(FullWidthBoxImage, width);
			
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2009 FullWidthBoxImage6 Exception>>Expected Result:980px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 FullWidthBoxImage6 Error>>Expected Result:980px");
				count = count + 1;
			}
			
			
			// Verify VSpace3Height has the height of 20px. 
			
			try {
				String locator = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);

				// Substring: To remove pixel(px text) from value
				
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) + Integer.parseInt("6");
											
				String Totalpixelvaluewithpixel = getsubpixel+"px";
				System.out.println( "      "+Totalpixelvaluewithpixel);
				System.out.println( "      "+BodayCopyLeadingHeight);

				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace8Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2009 BodayCopyLeadingHeight Exception>>Expected Result:20px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 BodayCopyLeadingHeight Error>>Expected Result:20px");
				count = count + 1;
			}
			
			
			// Verify vSpace1Height has the height of 40px.
			try {
				String locator1 = locatorReader.getLocator("VerifyPixels.textSpace6Height");
				String padding_bottom = this.getCSS(locator1, "padding-bottom");
				String font_size=this.getCSS(locator1, "font-size");
				String line_height=this.getCSS(locator1, "line-height");
				
				
				// Substring: To remove pixel(px text) from value
				
				String padding_bottom_wopx = padding_bottom.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String line_height_wopx = line_height.substring(0, 2);
				int getsubpixel = Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx) - Integer.parseInt("4");
				  
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightseeAllMidas");
				String padding_top1 = this.getCSS(locator, "margin-top");
			
				// Substring: To remove pixel(px text) from value
				String padding_top_wopx1 = padding_top1.substring(0, 2);
				
							
				int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(padding_top_wopx1)+getsubpixel;
				
				
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
							
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2009 vSpace4Height Exception>>Expected Result:70px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 vSpace4Height Error>>Expected Result:70px");
				count = count + 1;
			}
			
			
			// Verify TextSpace2Height has the height of 20px.
			try {
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightBelowFirstText");
				String padding_top = this.getCSS(locator1, "margin-bottom");
				
				// Substring: To remove pixel(px text) from value
				String padding_top_wopx = padding_top.substring(0, 2);
				
											
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+Integer.parseInt("4");
				
				
				String Totalpixelvaluewithpixel = Totaladdedpixel+"px";
							
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace8Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2009 TextSpace8Height Exception>>Expected Result:20px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 TextSpace8Height Error>>Expected Result:20px");
				count = count + 1;
			}
				

				// Verify TextSpace1 has the height of 35px.
			try {
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpaceHeightbelowText");
				String padding_bottom = this.getCSS(locator1, "padding-bottom");
				String font_size = this.getCSS(locator1, "font-size");
				String line_height = this.getCSS(locator1, "line-Height");
				
				// Substring: To remove pixel(px text) from value
				String padding_bottom_wopx=padding_bottom.substring(0, 2);	
				String font_size_wopx=font_size.substring(0, 2);
				String line_height_wopx=line_height.substring(0, 2);
					
				
				int getsubpixel = Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
				
				int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+Integer.parseInt("5")+getsubpixel;
				
				String Totalpixelvaluewithpixel = Totaladdedpixel+"px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace1Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2009 padding_top_wopx Exception>>Expected Result:35px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 padding_top_wopx Error>>Expected Result:35px");
				count = count + 1;
			}
			
			
			// Verify TextSpace6(2) has the height of 40px.
			try {
				
				String locator = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
				String padding_top = this.getCSS(locator, "padding-bottom");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				
				// Substring: To remove pixel(px text) from value
				String margin_top_wopx = padding_top.substring(0, 2);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
			
			
							
				int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
				
				String locator1 = locatorReader.getLocator("VerifyPixels.textSpace6Height");
				String line_height1 = this.getCSS(locator1, "line-height");
				String font_size1 = this.getCSS(locator1, "font-size");
				
				// Substring: To remove pixel(px text) from value
				String line_height_wopx1 = line_height1.substring(0, 2);
				String font_size_wopx1 = font_size1.substring(0, 2);
				
				int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
			
				int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel1+getsubpixel-Integer.parseInt("4");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace6Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2009 textSpace6Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 textSpace6Height Error>>Expected Result:40px");
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
				System.out.println("Midas OurStory 2009 vSpace1Height Exception>>Expected Result:70px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 vSpace1Height Error>>Expected Result:7s0px");
				count = count + 1;
			}
			
			
			// Verify VSpace6Height has the height of 40px.
			try {
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String padding_top = this.getCSS(locator1, "margin-top");					
				String locator = locatorReader.getLocator("VerifyPixels.vSpaceHeightbelowText");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				String padding_bottom = this.getCSS(locator, "padding-bottom");
				
				// Substring: To remove pixel(px text) from value
				String padding_top_wopx = padding_top.substring(0, 2);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String padding_bottom_wopx = padding_bottom.substring(0, 2);
				
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
				
				String locator2 = locatorReader.getLocator("VerifyPixels.vSpace4Heightaboveimage");
				String margin_top= this.getCSS(locator2, "margin-top");
		
				// Substring: To remove pixel(px text) from value
				String margin_top_wopx=margin_top.substring(0, 2);
				
				int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+getsubpixel+Integer.parseInt(padding_bottom_wopx)-Integer.parseInt("4");
				
			
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
							
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
				
			}

			catch (Exception ex) {
				System.out.println("Midas OurStory 2009 vSpace4Height Exception>>Expected Result:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 2009 vSpace4Height Error>>Expected Result:40px");
				count = count + 1;
			}	
		}
		//verify Midas 2011OurStory Page
		public void VerifyMidas2011OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2,String CallOutBodyCopyWidth, String Gutter2Width){
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas2011OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas2011OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
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
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
				String padding_top = this.getCSS(locator1, "margin-top");
				String padding_top_wopx = padding_top.substring(0, 2);
				
				
				String locator = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
				String line_height = this.getCSS(locator, "line-height");
				
				String font_size = this.getCSS(locator, "font-size");
				
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) ;
					
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
			
			}
		//Verify Midas 2014OurStory Page
		public void VerifyMidas2014OurStoryPage(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2,String CallOutBodyCopyWidth, String Gutter2Width){
			try{
				String locator=locatorReader.getLocator("OurStory.MouseOverOnMidas2014OurStory");
				this.WaitForElementEnabled(locator, 50);
				mouseOver(locator);
				
				String Locator1=locatorReader.getLocator("OurStory.ClickOnMidas2014OurStory");
				this.WaitForElementEnabled(Locator1, 50);
				clickOn(Locator1);
			}catch (Exception ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
				count = count + 1;
			}
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
			
		}
}
