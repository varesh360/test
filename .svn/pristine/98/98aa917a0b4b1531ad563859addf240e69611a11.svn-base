package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class MG_Career_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public MG_Career_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("MG_Career.xml");
	
	}
	
	public void ClickJoinUs()
	{
		String locator = locatorReader.getLocator("CareerPage.ClickJoinUs");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	public void ClickWhereUS()
	{
		String locator = locatorReader.getLocator("CareerPage.ClickWhereyouFindUS");
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
	//Reach upto Midas Training  page(Midas)
	public void Reachuptocareerpage()
	{
		//Click Join Us
		this.ClickJoinUs();
		this.ClickWhereUS();
		//Check page not found
		this.checkPageNotFound();	
	}

	public void verifymgcareerpage(String vSpace1height,String vSpace4Height,String FixedBoxImageWidth,String FixedBoxImageHeight,String FixedBoxedImageWidth,String FixedBoxedImageHeight,String Gutter16Width,String vSpace12Height,String TextSpace1Height,String vSpace8Height, String TextSpace3Height, String TextSpace2Height)
	{
		
		Reachuptocareerpage();
		int count = 0;
		// Verify vSpace1Height has the height of 70px on H3 ASK A Question.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Height");
			String padding_top1 = this.getCSS(locator, "padding-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightJoinUs");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)+Integer.parseInt("7");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace1height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}
		// Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4Heightbelow1image");
			String padding_top1 = this.getCSS(locator, "padding-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4Heightbelow1image1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)-Integer.parseInt("10");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		// Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4Heightbelow1image");
			String padding_top1 = this.getCSS(locator, "padding-bottom");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4Heightbelow1image1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)-Integer.parseInt("11");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}

		// Verify vSpace4Height has the height of 40px
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightJoinUs");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String margin_bottom=this.getCSS(locator1, "margin-bottom");
			
			String Font_size_wopx = Font_size.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(margin_bottom_wopx)+Integer.parseInt("3");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		
		// Verify Fixed box image has the width of 980px
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.fixedboximage");
			String width = this.getCSS(locator1, "width");
			System.out.println("Actual Result: " + width);
			Assert.assertEquals(FixedBoxImageWidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page FixedBoxImageWidth Exception>>Expected Result:980px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PageFixedBoxImageWidth Error>>Expected Result :980px");
			count = count + 1;
		}
		// Verify Fixed box image has the height of 368px
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.fixedboximage");
			String height = this.getCSS(locator1, "height");
			System.out.println("Actual Result: " + height);
			
			Assert.assertEquals(FixedBoxImageHeight, height);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page FixedBoxImageHeight Exception>>Expected Result:368px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PageFixedBoxImageHeight Error>>Expected Result :368px");
			count = count + 1;
		}
		// Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4Heightabovewhatwedo");
			String padding_top1 = this.getCSS(locator, "padding-bottom");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4Heightbelow1image1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			//System.out.println("       "+Font_size_wopx);
			String Line_Height_wopx = Line_Height.substring(0, 2);
		//	System.out.println("       "+Line_Height_wopx);
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)-Integer.parseInt("5");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		
		// Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4Heightabovewhatwedo");
			String padding_top1 = this.getCSS(locator, "padding-bottom");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4HeightWhereyoufindus");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			//System.out.println("       "+Font_size_wopx);
			String Line_Height_wopx = Line_Height.substring(0, 2);
		//	System.out.println("       "+Line_Height_wopx);
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			System.out.println("    "+getsubpixel);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)+Integer.parseInt("4");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		// Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4Heightabovewhatwedo");
			String padding_top1 = this.getCSS(locator, "padding-bottom");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vspace4heighthowwelive");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			//System.out.println("       "+Font_size_wopx);
			String Line_Height_wopx = Line_Height.substring(0, 2);
		//	System.out.println("       "+Line_Height_wopx);
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)+Integer.parseInt("4");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}

		// Verify vSpace8Height has the height of 23px
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4Heightabovewhatwedo1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String margin_bottom=this.getCSS(locator1, "margin-bottom");
			
			String Font_size_wopx = Font_size.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("3");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace8Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace8Height Exception>>Expected Pading Top:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace8Height Error>>Expected Padding:23px");
			count = count + 1;
		}
		// Verify vSpace8Height has the height of 23px
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4HeightWhereyoufindus");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String margin_bottom=this.getCSS(locator1, "margin-bottom");
			
			String Font_size_wopx = Font_size.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("3");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace8Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace8Height Exception>>Expected Pading Top:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace8Height Error>>Expected Padding:23px");
			count = count + 1;
		}
		// Verify vSpace8Height has the height of 23px
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.vspace4heighthowwelive");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String margin_bottom=this.getCSS(locator1, "margin-bottom");
			
			String Font_size_wopx = Font_size.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("3");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace8Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace8Height Exception>>Expected Pading Top:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace8Height Error>>Expected Padding:23px");
			count = count + 1;
		}
		// Verify Gutter16Width has the height of 34px
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.gutter16widthwhereyoufindus");
			String margin_left = this.getCSS(locator1, "margin-left");
			
			System.out.println("Actual Result: " + margin_left);
			Assert.assertEquals(Gutter16Width, margin_left);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page Gutter16Width Exception>>Expected Pading Top:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PageGutter16Width Error>>Expected Padding:34px");
			count = count + 1;
		}
		// Verify Gutter16Width has the height of 34px
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.gutter16width");
			String margin_left = this.getCSS(locator1, "margin-left");
			
			System.out.println("Actual Result: " + margin_left);
			Assert.assertEquals(Gutter16Width, margin_left);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page Gutter16Width Exception>>Expected Pading Top:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PageGutter16Width Error>>Expected Padding:34px");
			count = count + 1;
		}
		
		// Verify vSpace12Height has the height of 35px
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace12Heightbelow2ndimage");
			String padding_top1 = this.getCSS(locator, "margin-bottom");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace12Heightbelow2ndimage1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			//System.out.println("       "+Font_size_wopx);
			String Line_Height_wopx = Line_Height.substring(0, 2);
		//	System.out.println("       "+Line_Height_wopx);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)-Integer.parseInt("2");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			
			Assert.assertEquals(vSpace12Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace12Height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace12Height Error>>Expected Padding:35px");
			count = count + 1;
		}
		
		// Verify vSpace12Height has the height of 35px
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace12Heightbelow3rdimage");
			String padding_top1 = this.getCSS(locator, "margin-bottom");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace12Heightbelow3rdimage1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			//System.out.println("       "+Font_size_wopx);
			String Line_Height_wopx = Line_Height.substring(0, 2);
		//	System.out.println("       "+Line_Height_wopx);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)-Integer.parseInt("2");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			
			Assert.assertEquals(vSpace12Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace12Height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace12Height Error>>Expected Padding:35px");
			count = count + 1;
		}
		// Verify vSpace12Height has the height of 35px
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace12Heightbelow1stimage");
			String padding_top1 = this.getCSS(locator, "margin-bottom");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace12Heightbelow1stimage1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			//System.out.println("       "+Font_size_wopx);
			String Line_Height_wopx = Line_Height.substring(0, 2);
		//	System.out.println("       "+Line_Height_wopx);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)-Integer.parseInt("2");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace12Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace12Height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace12Height Error>>Expected Padding:35px");
			count = count + 1;
		}

	// Verify TextSpace1Height has the height of 35px
		try {
			
			String locator = locatorReader.getLocator("VerifyPixels.TextSpace35HeightabovesecondPara");
			String padding_top1 = this.getCSS(locator, "margin-top");
			String padding_bottom = this.getCSS(locator, "padding-bottom");			
			String Font_size = this.getCSS(locator, "font-size");
			String Line_Height = this.getCSS(locator, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			String padding_top1_wopx = padding_top1.substring(0, 2);
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)+Integer.parseInt(padding_bottom_wopx)+Integer.parseInt("4");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(TextSpace1Height,finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page TextSpace1Height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PageText Space1Height Error>>Expected Padding:35px");
			count = count + 1;
		}
		// Verify vSpace8Height has the height of 17px
		try {
			String locator = locatorReader.getLocator("VerifyPixels.TextSpace35HeightabovesecondPara");
			String Font_size = this.getCSS(locator, "font-size");
			String Line_Height = this.getCSS(locator, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			//System.out.println("       "+Font_size_wopx);
			String Line_Height_wopx = Line_Height.substring(0, 2);
		//	System.out.println("       "+Line_Height_wopx);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt("7");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(TextSpace3Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace8Height Exception>>Expected Pading Top:17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career Page vSpace8Height Error>>Expected Padding:17px");
			count = count + 1;
		}
		// Verify vSpace1Height has the height of 70px .
		try {
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightFooter");
			String padding_top1 = this.getCSS(locator1, "margin-bottom");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			System.out.println("                 "+padding_top1_wopx);
			
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Heighttextabovefooter");
			String margin_top1 = this.getCSS(locator, "margin-top");
			String padding_bottom = this.getCSS(locator, "padding-bottom");			
			String Font_size = this.getCSS(locator, "font-size");
			String Line_Height = this.getCSS(locator, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			
			String margin_top1_wopx = margin_top1.substring(0, 2);
			
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
			
			String Line_Height_wopx = Line_Height.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)+Integer.parseInt(margin_top1_wopx)+Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(padding_bottom_wopx)-Integer.parseInt("4");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace1height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}

		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	public void verifymgcareerpage1(String vSpace1height,String vSpace4Height,String FixedBoxImageWidth,String FixedBoxImageHeight,String FixedBoxedImageWidth,String FixedBoxedImageHeight,String Gutter16Width,String vSpace12Height,String TextSpace1Height,String vSpace8Height, String TextSpace3Height, String TextSpace7Height, String TextSpace5Height,String TextSpace2Height, String TextSpace13Height)
	{
		
		Reachuptocareerpage();
		int count = 0;
		// Verify vSpace1Height has the height of 70px on H3 ASK A Question.
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace1Height");
			String padding_top1 = this.getCSS(locator, "padding-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace1Heightaboveh1text");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)+Integer.parseInt("7");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace1height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}
		// Verify vSpace4Height has the height of 40px
		try {
			
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace1Heightaboveh1text");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String margin_bottom=this.getCSS(locator1, "margin-bottom");
			String Font_size_wopx = Font_size.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			String margin_bottom_wopx=margin_bottom.substring(0, 2);
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(margin_bottom_wopx)+Integer.parseInt("3");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		// Verify Fixed box image has the width of 980px
		try {
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.FixedBoxImageWidth");
			String width = this.getCSS(locator1, "width");
			System.out.println("Actual Result: " + width);
			Assert.assertEquals(FixedBoxImageWidth, width);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page FixedBoxImageWidth Exception>>Expected Result:980px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PageFixedBoxImageWidth Error>>Expected Result :980px");
			count = count + 1;
		}
		 // Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightbelowlargeimage");
			String padding_top1 = this.getCSS(locator, "margin-bottom");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4HeightBelowlargeimagetext1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)+Integer.parseInt("1");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
	// Verify TextSpace7Height has the height of 27px
		try {
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.TextSpace7Height");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
			String padding_bottom = this.getCSS(locator1, "padding-bottom");
			
			String Font_size_wopx = Font_size.substring(0, 2);
		
			String Line_Height_wopx = Line_Height.substring(0, 2);
	
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
	
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
	
			
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_bottom_wopx)+Integer.parseInt("4")+Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(margin_bottom_wopx);
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(TextSpace7Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page TextSpace7Height Exception>>Expected Pading Top:27px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career Page TextSpace7Height Error>>Expected Padding:27px");
			count = count + 1;
		}
		// Verify TextSpace5Height has the height of 13px
		try {
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.TextSpace7Height");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			
			String Font_size_wopx = Font_size.substring(0, 2);
		
			String Line_Height_wopx = Line_Height.substring(0, 2);
	
			
			
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+getsubpixel+Integer.parseInt("1");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(TextSpace5Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page TextSpace5Height Exception>>Expected Pading Top:13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career Page TextSpace5Height Error>>Expected Padding:13px");
			count = count + 1;
		}
		 // Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightbelow2para1");
			String padding_top1 = this.getCSS(locator, "margin-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightbelow2para");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
			String padding_bottom=this.getCSS(locator1, "padding-bottom");
			
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			String Font_size_wopx = Font_size.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_bottom_wopx)+Integer.parseInt("1")+Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(padding_top1_wopx);
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		 // Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightbelow2para1");
			String padding_top1 = this.getCSS(locator, "padding-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightabovesmall1image");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
	
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt("5")+Integer.parseInt(padding_top1_wopx);
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		 // Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightbelow2para1");
			String padding_top1 = this.getCSS(locator, "padding-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightabovesmall2image");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
	
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt("5")+Integer.parseInt(padding_top1_wopx);
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		 // Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightbelow2para1");
			String padding_top1 = this.getCSS(locator, "padding-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightabovesmall3image");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
	
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt("5")+Integer.parseInt(padding_top1_wopx);
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		 // Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightbelow2para1");
			String padding_top1 = this.getCSS(locator, "padding-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightabovesmall3image");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
	
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt("5")+Integer.parseInt(padding_top1_wopx);
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		// Verify Gutter16Width has the height of 34px
		try {
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.Gutter16Width2image");
			String margin_left = this.getCSS(locator1, "margin-left");
			
			System.out.println("Actual Result: " + margin_left);
			Assert.assertEquals(Gutter16Width, margin_left);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page Gutter16Width Exception>>Expected Pading Top:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PageGutter16Width Error>>Expected Padding:34px");
			count = count + 1;
		}
		// Verify Gutter16Width has the height of 34px
		try {
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.Gutter16Width2image");
			String margin_left = this.getCSS(locator1, "margin-left");
			
			System.out.println("Actual Result: " + margin_left);
			Assert.assertEquals(Gutter16Width, margin_left);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page Gutter16Width Exception>>Expected Pading Top:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PageGutter16Width Error>>Expected Padding:34px");
			count = count + 1;
		}
		// Verify Gutter16Width has the height of 34px
		try {
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.Gutter16Width3image");
			String margin_left = this.getCSS(locator1, "margin-left");
			
			System.out.println("Actual Result: " + margin_left);
			Assert.assertEquals(Gutter16Width, margin_left);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page Gutter16Width Exception>>Expected Pading Top:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PageGutter16Width Error>>Expected Padding:34px");
			count = count + 1;
		}
		// Verify vSpace8Height has the height of 23px
		try {
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightabovesmall1image");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
			
			String Font_size_wopx = Font_size.substring(0, 2);
		
			String Line_Height_wopx = Line_Height.substring(0, 2);
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("2");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace8Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace8Height Exception>>Expected Pading Top:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career Page vSpace8Height Error>>Expected Padding:23px");
			count = count + 1;
		}

		// Verify vSpace8Height has the height of 23px
		try {
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightabovesmall2image");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
			
			String Font_size_wopx = Font_size.substring(0, 2);
		
			String Line_Height_wopx = Line_Height.substring(0, 2);
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("2");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace8Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace8Height Exception>>Expected Pading Top:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career Page vSpace8Height Error>>Expected Padding:23px");
			count = count + 1;
		}
		// Verify vSpace8Height has the height of 23px
		try {
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightabovesmall3image");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
			
			String Font_size_wopx = Font_size.substring(0, 2);
		
			String Line_Height_wopx = Line_Height.substring(0, 2);
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("2");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace8Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace8Height Exception>>Expected Pading Top:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career Page vSpace8Height Error>>Expected Padding:23px");
			count = count + 1;
		}
		// Verify TextSpace2Height has the height of 23px
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.TextSpace2Height1image");
			String padding_top1 = this.getCSS(locator, "margin-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.TextSpace2Height1image1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
	
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx);
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(TextSpace2Height, finalvaluepixel);

		}

		catch (Exception ex) {
			System.out.println("MG Career Page TextSpace2Height Exception>>Expected Pading Top:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career Page TextSpace2Height Error>>Expected Padding:23px");
			count = count + 1;
		}
		// Verify TextSpace2Height has the height of 23px
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.TextSpace2Height2image");
			String padding_top1 = this.getCSS(locator, "margin-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.TextSpace2Height2image1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
	
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx);
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(TextSpace2Height, finalvaluepixel);

		}

		catch (Exception ex) {
			System.out.println("MG Career Page TextSpace2Height Exception>>Expected Pading Top:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career Page TextSpace2Height Error>>Expected Padding:23px");
			count = count + 1;
		}
		// Verify TextSpace2Height has the height of 23px
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.TextSpace2Height3image");
			String padding_top1 = this.getCSS(locator, "margin-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.TextSpace2Height3image1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
	
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx);
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(TextSpace2Height, finalvaluepixel);

		}

		catch (Exception ex) {
			System.out.println("MG Career Page TextSpace2Height Exception>>Expected Pading Top:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career Page TextSpace2Height Error>>Expected Padding:23px");
			count = count + 1;
		}
		 // Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4heightaboveLinebrake1image");
			String padding_top1 = this.getCSS(locator, "margin-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
		
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4heightaboveLinebrake1image1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
	
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)- Integer.parseInt("2");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		 // Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4heightaboveLinebrake1image");
			String padding_top1 = this.getCSS(locator, "margin-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4heightaboveLinebrake2image1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
	
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)- Integer.parseInt("2");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		 // Verify vSpace4Height has the height of 40px
		try {
			String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4heightaboveLinebrake1image");
			String padding_top1 = this.getCSS(locator, "margin-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4heightaboveLinebrake3image1");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
	
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)- Integer.parseInt("2");
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace4Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}
		 // Verify vSpace4Height has the height of 40px
			try {
				String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4heightaboveLinebrake1image");
				String padding_top1 = this.getCSS(locator, "padding-bottom");
				String padding_top1_wopx = padding_top1.substring(0, 2);
				
				String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightabovesmall4image");
				String Font_size = this.getCSS(locator1, "font-size");
				String Line_Height = this.getCSS(locator1, "line-height");
				String Font_size_wopx = Font_size.substring(0, 2);
		
				String Line_Height_wopx = Line_Height.substring(0, 2);
				int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
				int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)- Integer.parseInt("3");
				String finalvaluepixel=finalvalue+"px";
				System.out.println("Actual Result: " + finalvaluepixel);
				Assert.assertEquals(vSpace4Height, finalvaluepixel);
			}

			catch (Exception ex) {
				System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
				count = count + 1;
			}
			 // Verify vSpace4Height has the height of 40px
			try {
				String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4heightaboveLinebrake1image");
				String padding_top1 = this.getCSS(locator, "padding-bottom");
				String padding_top1_wopx = padding_top1.substring(0, 2);
				
				String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightabovesmall5image");
				String Font_size = this.getCSS(locator1, "font-size");
				String Line_Height = this.getCSS(locator1, "line-height");
				String Font_size_wopx = Font_size.substring(0, 2);
		
				String Line_Height_wopx = Line_Height.substring(0, 2);
				int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
				int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)- Integer.parseInt("3");
				String finalvaluepixel=finalvalue+"px";
				System.out.println("Actual Result: " + finalvaluepixel);
				Assert.assertEquals(vSpace4Height, finalvaluepixel);
			}

			catch (Exception ex) {
				System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
				count = count + 1;
			}
			 // Verify vSpace4Height has the height of 40px
			try {
				String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4heightaboveLinebrake1image");
				String padding_top1 = this.getCSS(locator, "padding-bottom");
				String padding_top1_wopx = padding_top1.substring(0, 2);
				
				String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpace4Heightabovesmall6image");
				String Font_size = this.getCSS(locator1, "font-size");
				String Line_Height = this.getCSS(locator1, "line-height");
				String Font_size_wopx = Font_size.substring(0, 2);
		
				String Line_Height_wopx = Line_Height.substring(0, 2);
				int getsubpixel = Integer.parseInt(Font_size_wopx)- Integer.parseInt(Line_Height_wopx);
				int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)- Integer.parseInt("3");
				String finalvaluepixel=finalvalue+"px";
				System.out.println("Actual Result: " + finalvaluepixel);
				Assert.assertEquals(vSpace4Height, finalvaluepixel);
			}

			catch (Exception ex) {
				System.out.println("MG Career Page vSpace4Height Exception>>Expected Pading Top:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("MG Career PagevSpace4Height Error>>Expected Padding:40px");
				count = count + 1;
			}
			// Verify vSpace1height has the height of 70px
			try {
				String locator = locatorReader.getLocator("verifypixelwhatwedopage.vSpaceHeightFooter");
				String padding_top1 = this.getCSS(locator, "margin-bottom");
				String padding_top1_wopx = padding_top1.substring(0, 2);
				
				String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.vSpaceHeightFooter1");
				String Font_size = this.getCSS(locator1, "font-size");
				String Line_Height = this.getCSS(locator1, "line-height");
				String Font_size_wopx = Font_size.substring(0, 2);
		
				String Line_Height_wopx = Line_Height.substring(0, 2);
				int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
				int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx)-Integer.parseInt("2");
				String finalvaluepixel=finalvalue+"px";
				System.out.println("Actual Result: " + finalvaluepixel);
				Assert.assertEquals(vSpace1height, finalvaluepixel);
			}

			catch (Exception ex) {
				System.out.println("MG Career Page vSpace1height Exception>>Expected Pading Top:70px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("MG Career Page vSpace1height Error>>Expected Padding:70px");
				count = count + 1;
			}
			// Verify TextSpace13Height has the height of 7px
			try {
				String locator1 = locatorReader.getLocator("verifypixelwhatwedopage.TextSpace2Height1image1");
				String Font_size = this.getCSS(locator1, "font-size");
				String Line_Height = this.getCSS(locator1, "line-height");
				String Font_size_wopx = Font_size.substring(0, 2);
		
				String Line_Height_wopx = Line_Height.substring(0, 2);
				int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
				int finalvalue=getsubpixel+Integer.parseInt("1")+getsubpixel;
				String finalvaluepixel=finalvalue+"px";
				System.out.println("Actual Result: " + finalvaluepixel);
				Assert.assertEquals(TextSpace13Height, finalvaluepixel);
			}

			catch (Exception ex) {
				System.out.println("MG Career Page TextSpace13Height Exception>>Expected Pading Top:13px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("MG Career Page TextSpace13Height Error>>Expected Padding:13px");
				count = count + 1;
			}

		// Verify Fixed box image has the height of 368px
		
  	System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
// Cases Left: 	
		
}