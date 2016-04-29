package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class MG_UnifiedBrandPage_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public MG_UnifiedBrandPage_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("MG_UnifiedBrandPage.xml");
	}

	//Click on Brand Menu 
	public void clickBrandMenu()
	{
		String locator = locatorReader.getLocator("UnifiedBrandPage.ClickBrandMenu");
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
	public void ReachUptoBrandPage()
	{
		//Click on the Menu icon
		this.clickBrandMenu();
		//Check page not found
		this.checkPageNotFound();
	}
	
	//Verify Buy Now page
	public void verifyMGUnifiedBrandPage(String vSpace1Height,String TextSpace1Height,String TextSpace3Height,String BrandLogosizewidth,String BrandLogosizeHeight,String CallOutBodyCopyHeight,String CallOutBodyCopyWidth,String GutterWidth,String CallOutFixedBoxImageWidth,String CallOutFixedBoxImageHeight, String vSpace4Height)
	{
		//Reach upto Buy Now page(Behringer)
		ReachUptoBrandPage();
		int count = 0;
		
		// Verify BrandLogosizewidth has width  of 325px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.MidasBrandLogo");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(BrandLogosizewidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Exception>>Expected Result:325px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Error>>Expected Result:325px");
			count = count + 1;
		}
		// Verify BrandLogosizeHeight has height of 78px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.MidasBrandLogo");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(BrandLogosizeHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Exception>>Expected Result:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Error>>Expected Result:78px");
			count = count + 1;
		}

		// Verify vSpace4Height has height of 40px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.MidasBrandLogo");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual result" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		// Verify BrandLogosizewidth has width  of 325px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.Klarkteknik");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(BrandLogosizewidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Exception>>Expected Result:325px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Error>>Expected Result:325px");
			count = count + 1;
		}
		// Verify BrandLogosizeHeight has height of 78px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Klarkteknik");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(BrandLogosizeHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Exception>>Expected Result:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Error>>Expected Result:78px");
			count = count + 1;
		}

		// Verify vSpace4Height has height of 40px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Klarkteknik");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual result" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
// Verify BrandLogosizewidth has width  of 325px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.LabGruppen");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(BrandLogosizewidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Exception>>Expected Result:325px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Error>>Expected Result:325px");
			count = count + 1;
		}
		// Verify BrandLogosizeHeight has height of 78px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.LabGruppen");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(BrandLogosizeHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Exception>>Expected Result:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Error>>Expected Result:78px");
			count = count + 1;
		}
		// Verify vSpace4Height has height of 40px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.LabGruppen");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual result" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}

		// Verify BrandLogosizewidth has width  of 325px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.Lake");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(BrandLogosizewidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Exception>>Expected Result:325px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Error>>Expected Result:325px");
			count = count + 1;
		}
		// Verify BrandLogosizeHeight has height of 78px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Lake");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(BrandLogosizeHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Exception>>Expected Result:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Error>>Expected Result:78px");
			count = count + 1;
		}
		// Verify vSpace4Height has height of 40px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Lake");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual result" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}

		// Verify BrandLogosizewidth has width  of 325px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.Tannoy");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(BrandLogosizewidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Exception>>Expected Result:325px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Error>>Expected Result:325px");
			count = count + 1;
		}
		// Verify BrandLogosizeHeight has height of 78px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Tannoy");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(BrandLogosizeHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Exception>>Expected Result:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Error>>Expected Result:78px");
			count = count + 1;
		}
		// Verify vSpace4Height has height of 40px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Tannoy");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual result" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}


		// Verify BrandLogosizewidth has width  of 325px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.Turbosound");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(BrandLogosizewidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Exception>>Expected Result:325px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Error>>Expected Result:325px");
			count = count + 1;
		}
		// Verify BrandLogosizeHeight has height of 78px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Turbosound");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(BrandLogosizeHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Exception>>Expected Result:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Error>>Expected Result:78px");
			count = count + 1;
		}
		// Verify vSpace4Height has height of 40px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Turbosound");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual result" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}



	// Verify BrandLogosizewidth has width  of 325px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.TCElctronics");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(BrandLogosizewidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Exception>>Expected Result:325px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Error>>Expected Result:325px");
			count = count + 1;
		}
		// Verify BrandLogosizeHeight has height of 78px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.TCElctronics");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(BrandLogosizeHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Exception>>Expected Result:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Error>>Expected Result:78px");
			count = count + 1;
		}
		// Verify vSpace4Height has height of 40px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Turbosound");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual result" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}

		// Verify BrandLogosizewidth has width  of 325px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.TCHelicon");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(BrandLogosizewidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Exception>>Expected Result:325px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Error>>Expected Result:325px");
			count = count + 1;
		}
		// Verify BrandLogosizeHeight has height of 78px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.TCHelicon");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(BrandLogosizeHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Exception>>Expected Result:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Error>>Expected Result:78px");
			count = count + 1;
		}
		// Verify vSpace4Height has height of 40px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.TCHelicon");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual result" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}

		// Verify BrandLogosizewidth has width  of 325px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.Behringer");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(BrandLogosizewidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Exception>>Expected Result:325px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Error>>Expected Result:325px");
			count = count + 1;
		}
		// Verify BrandLogosizeHeight has height of 78px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Behringer");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(BrandLogosizeHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Exception>>Expected Result:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Error>>Expected Result:78px");
			count = count + 1;
		}
		// Verify vSpace4Height has height of 40px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Behringer");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual result" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}

	// Verify BrandLogosizewidth has width  of 325px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.Buger");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(BrandLogosizewidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Exception>>Expected Result:325px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Error>>Expected Result:325px");
			count = count + 1;
		}
		// Verify BrandLogosizeHeight has height of 78px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Buger");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(BrandLogosizeHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Exception>>Expected Result:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Error>>Expected Result:78px");
			count = count + 1;
		}
		// Verify vSpace4Height has height of 40px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.Buger");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual result" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}


	// Verify BrandLogosizewidth has width  of 325px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.DDA");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(BrandLogosizewidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Exception>>Expected Result:325px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Error>>Expected Result:325px");
			count = count + 1;
		}
		// Verify BrandLogosizeHeight has height of 78px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.DDA");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(BrandLogosizeHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Exception>>Expected Result:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Error>>Expected Result:78px");
			count = count + 1;
		}
		// Verify vSpace4Height has height of 40px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.DDA");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual result" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}


		// Verify BrandLogosizewidth has width  of 325px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.EuroCom");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(BrandLogosizewidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Exception>>Expected Result:325px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizewidth Error>>Expected Result:325px");
			count = count + 1;
		}
		// Verify BrandLogosizeHeight has height of 78px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.EuroCom");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(BrandLogosizeHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Exception>>Expected Result:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page BrandLogosizeHeight Error>>Expected Result:78px");
			count = count + 1;
		}
		// Verify vSpace4Height has height of 40px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.EuroCom");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual result" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		// Verify vSpace1Height has the height of 70px.
		
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Heightbelowlogos");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			
			String locator1 = locatorReader.getLocator("VerifyPixels.EuroCom");
			String margin_bottom1 = this.getCSS(locator1, "margin-bottom");
			
			
			// Substring: To remove pixel(px text) from value
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			String margin_bottom_wopx1 = margin_bottom1.substring(0, 2);
			int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(margin_bottom_wopx1);
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace1Height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Exception>>Expected Margin Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Error>>Expected Width:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightMidasimage");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual result" + padding_top);
			Assert.assertEquals(vSpace1Height, padding_top);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightMidasimage");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual result" + padding_bottom);
			Assert.assertEquals(vSpace1Height, padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightMidastext");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual result" + padding_top);
			Assert.assertEquals(vSpace1Height, padding_top);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightMidastext");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual result" + padding_bottom);
			Assert.assertEquals(vSpace1Height, padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
//-------------------------------------
		
		// Verify vSpace1Height has height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightKlarkteckniktext");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual result" + padding_top);
			Assert.assertEquals(vSpace1Height, padding_top);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightKlarkteckniktext");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual result" + padding_bottom);
			Assert.assertEquals(vSpace1Height, padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightKlarktecknikimage");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual result" + padding_top);
			Assert.assertEquals(vSpace1Height, padding_top);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightKlarktecknikimage");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual result" + padding_bottom);
			Assert.assertEquals(vSpace1Height, padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify CallOutBodyCopyWidth has height of 450px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.CallOutbodycopywidthKlartechnikimage");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(CallOutBodyCopyWidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) CallOutBodyCopyWidth Exception>>Expected Result:450px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) CallOutBodyCopyWidth Error>>Expected Result:450px");
			count = count + 1;
		}
		// Verify CallOutBodyCopyHeight has height of 450px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.CallOutbodycopywidthKlartechniktext");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual result" + height);
			Assert.assertEquals(CallOutBodyCopyHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) CallOutBodyCopyHeight Exception>>Expected Result:450px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) CallOutBodyCopyHeight Error>>Expected Result:450px");
			count = count + 1;
		}
		// Verify CallOutBodyCopyWidth has height of 450px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.CallOutbodycopywidthKlartechniktext");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual result" + width);
			Assert.assertEquals(CallOutBodyCopyWidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) CallOutBodyCopyWidth Exception>>Expected Result:450px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) CallOutBodyCopyWidth Error>>Expected Result:450px");
			count = count + 1;
		}
		// Verify GutterWidth has the height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.CallOutbodycopywidthKlartechnikimage");
			String margin_bottom = this.getCSS(locator, "margin-left");
			
			String locator1 = locatorReader.getLocator("VerifyPixels.CallOutbodycopywidthKlartechniktext");
			String margin_bottom1 = this.getCSS(locator1, "margin-right");
			
			
			// Substring: To remove pixel(px text) from value
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			String margin_bottom_wopx1 = margin_bottom1.substring(0, 2);
			int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(margin_bottom_wopx1);
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(GutterWidth, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page GutterWidth Exception>>Expected Margin Top:80px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page GutterWidth Error>>Expected Width:80px");
			count = count + 1;
		}
		// Verify vSpace1Height has height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightDDAimage");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual result" + padding_top);
			Assert.assertEquals(vSpace1Height, padding_top);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightDDAimage");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual result" + padding_bottom);
			Assert.assertEquals(vSpace1Height, padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightDDAtext");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual result" + padding_top);
			Assert.assertEquals(vSpace1Height, padding_top);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has height of 70px.

		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightDDAtext");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual result" + padding_bottom);
			Assert.assertEquals(vSpace1Height, padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Unified Brand Page(Klarktecknikimage) vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}

//Verify the final result
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);	
	}	
}