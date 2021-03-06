package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class Home_BrandPage_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public Home_BrandPage_Helper(WebDriver driver) 
	{
		super(driver);
		locatorReader = new LocatorReader("home_brand_page.xml");
	
	}
	//Click on Menu icon 
	public void clickonBrandTab()
	{
		String locator = locatorReader.getLocator("BrandHomePage.clickonBrandTab");
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
	public void ReachUptoBrandHomePage()
	{
		//Click on the Menu icon
		this.clickonBrandTab();
		//Check page not found
		this.checkPageNotFound();
		
	}
	
	public void verifyHomeBrandPage(String vSpace1Height, String Gutter3Width, String TypicalBrandlogowidth, String TypicalBrandLogoHeight, String vSpace4Height,String textspace1height)
	{
		
		ReachUptoBrandHomePage();
		int count = 0;
		// Verify vSpace1Height has the height of 70px on 'The Music Group' text.(Issue)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.vSpace1Height");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Padding: " + padding_top);
			Assert.assertEquals(vSpace1Height,padding_top);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Expectation>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage vSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}
		
		// Verify TextSpace1Height has the height of 35 px 'below first paragraph'
		
		try {
			String locator = locatorReader.getLocator("BrandHomePage.v1spaceheightbelow3paragraph");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String paddingBottom_wopx = padding_bottom.substring(0, 2);
			String LineHeight_wopx = line_height.substring(0, 2);
			int getsubpixel = Integer.parseInt(LineHeight_wopx)- Integer.parseInt(paddingBottom_wopx);
			int getaddpixel = getsubpixel+ Integer.parseInt(LineHeight_wopx);
			String marginBottom_withPX=getaddpixel+"px";
			System.out.println("Atual Result: " + marginBottom_withPX);
			//System.out.println("Atual Result: " + textspace1height);
			Assert.assertEquals(textspace1height, marginBottom_withPX);
		} catch (Exception ex) {
			System.out.println("Brand HomePage TextSpace1Height Expectation>>Expected Hight:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage TextSpace1Height Error>>Expected Height:35px");
			count = count + 1;
		}
		// Verify TextSpace1Height has the height of 35 px 'below second paragraph'
		
		try {
			String locator = locatorReader.getLocator("BrandHomePage.v1spaceheightbelow3paragraph2");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String paddingBottom_wopx = padding_bottom.substring(0, 2);
			String LineHeight_wopx = line_height.substring(0, 2);
			int getsubpixel = Integer.parseInt(LineHeight_wopx)- Integer.parseInt(paddingBottom_wopx);
			int getaddpixel = getsubpixel+ Integer.parseInt(LineHeight_wopx);
			String marginBottom_withPX=getaddpixel+"px";
			System.out.println("Atual Result: " + marginBottom_withPX);
			//System.out.println("Atual Result: " + textspace1height);
			Assert.assertEquals(textspace1height, marginBottom_withPX);
		} catch (Exception ex) {
			System.out.println("Brand HomePage TextSpace1Height Expectation>>Expected Hight:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage TextSpace1Height Error>>Expected Height:35px");
			count = count + 1;
		}
		//Gutter3Width has the height has the hight of 20px ( Left Side) 
		try {
			String locator = locatorReader.getLocator("BrandHomePage.gutter8width");
			String margin_left = this.getCSS(locator, "margin-left");
			System.out.println("Actual Padding: " + margin_left);
			Assert.assertEquals(Gutter3Width,margin_left);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Margin Left:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Widths Error>>Expected Margin:20px");
			count = count + 1;
		}
		
		//Gutter3Width has the height of 20px ( Right Side) 
		try {
			String locator = locatorReader.getLocator("BrandHomePage.gutter8width");
			String margin_right = this.getCSS(locator, "margin-right");
			System.out.println("Actual Padding: " + margin_right);
			Assert.assertEquals(Gutter3Width,margin_right);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Margin right:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Padding:20px");
			count = count + 1;
		}
		
		// VSpace1Height has the Height of 70px Above Midas Description)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.v1spaceHeightbelowparagraph");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			
			String locator1 = locatorReader.getLocator("BrandHomePage.v1spaceheightbelow3paragraph2");
			String padding_bottom = this.getCSS(locator1, "padding-bottom");
			String font_size=this.getCSS(locator1, "font-size");
			String line_height=this.getCSS(locator1, "line-height");
			String font_size_wopx=font_size.substring(0, 2);
			String line_height_wopx=line_height.substring(0, 2);
			String padding_bottom_wopx=padding_bottom.substring(0, 2);
			int getpixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			
			
			String marginBottom_wopx = margin_bottom.substring(0, 2);
			String paddingBottom_wopx = padding_bottom.substring(0, 2);
			int getaddpixel = Integer.parseInt(marginBottom_wopx)+ Integer.parseInt(paddingBottom_wopx)+getpixel-Integer.parseInt("3");
			String marginBottom_withPX=getaddpixel+"px";
			
			System.out.println("Actual Padding: " + marginBottom_withPX);
			Assert.assertEquals(vSpace1Height, marginBottom_withPX);
		} catch (Exception ex) {
			System.out.println("Brand HomePage VSpace1Height Expectation>>Expected Hight:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage VSpace4Height Error>>Expected Height:70px");
			count = count + 1;
		}
		//TypicalBrandLogo has the width of 327px Midas Icon
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpagewidthMidas");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Padding: " + width);
			Assert.assertEquals(TypicalBrandlogowidth, width);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Width:327px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Width:327px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 78px (Midas icon)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpagewidthMidas");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Padding: " + height);
			Assert.assertEquals(TypicalBrandLogoHeight, height);
		} catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Hight:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out	.println("Brand HomePage Gutter3Width Error>>Expected Height:78px");
			count = count + 1;
		}
		
		// v4SpaceHeight has the height of 40px (Midas Icon)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpagewidthMidas");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Padding: " +margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		} catch (Exception ex) {
			System.out.println("Brand HomePage v1Spaceheight Expectation>>Expected Hight:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage v1Spaceheight Error>>Expected Height:40px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 327px (KlarkTechnik)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpagewidthklarktechnik");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Padding: " + width);
			Assert.assertEquals(TypicalBrandlogowidth, width);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Width:327px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Width:327px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 78px (KlarkTechnik)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpagewidthklarktechnik");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Padding: " + height);
			Assert.assertEquals(TypicalBrandLogoHeight, height);
		} catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Hight:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Height:78px");
			count = count + 1;
		}
		// V1SpaceHeight has the height of 40px (KlarkTechnik)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpagewidthklarktechnik");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Padding: " + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		} catch (Exception ex) {
			System.out.println("Brand HomePage vspace4Height Expectation>>Expected Hight:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage vspace4Height Error>>Expected Height:40px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 327px (Lab Gruppen)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageLabGruppen");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Padding: " + width);
			Assert.assertEquals(TypicalBrandlogowidth, width);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Width:327px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Width:327px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 78px (Lab Gruppen)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageLabGruppen");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Padding: " + height);
			Assert.assertEquals(TypicalBrandLogoHeight, height);
		} catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Hight:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Height:78px");
			count = count + 1;
		}
		
		// VSpace4Height has the width of 40px (Lab Gruppen)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageLabGruppen");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Padding: " + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		} catch (Exception ex) {
			System.out.println("Brand HomePage VSpace4Height Expectation>>Expected Hight:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage VSpace4Height Error>>Expected Height:40px");
			count = count + 1;
		}
		// lakeTypicalBrandLogo has the width of 327px (Lake)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageLake");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Padding: " + width);
			Assert.assertEquals(TypicalBrandlogowidth, width);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Width:327px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Width:327px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 78px (Lake)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageLake");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Padding: " + height);
			Assert.assertEquals(TypicalBrandLogoHeight, height);
		} catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Hight:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Height:78px");
			count = count + 1;
		}
		
		// VSpace4Height has the width of 40px (Lake)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageLake");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Padding: " + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		} catch (Exception ex) {
			System.out.println("Brand HomePage VSpace4Height Expectation>>Expected Hight:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage VSpace4Height Error>>Expected Height:40px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 327px (Tannoy)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageTannoy");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Padding: " + width);
			Assert.assertEquals(TypicalBrandlogowidth, width);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Width:327px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Width:327px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 78px (Tannoy)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageTannoy");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Padding: " + height);
			Assert.assertEquals(TypicalBrandLogoHeight, height);
		} catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Hight:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Height:78px");
			count = count + 1;
		}
		
		// VSpace4Height has the width of 40px (Tannoy)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageTannoy");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Padding: " + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		} catch (Exception ex) {
			System.out.println("Brand HomePage VSpace4Height Expectation>>Expected Hight:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage VSpace4Height Error>>Expected Height:40px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 327px (TurboSound)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageTurbosound");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Padding: " + width);
			Assert.assertEquals(TypicalBrandlogowidth, width);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Width:327px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Width:327px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 78px (TurboSound)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageTurbosound");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Padding: " + height);
			Assert.assertEquals(TypicalBrandLogoHeight, height);
		} catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Hight:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Height:78px");
			count = count + 1;
		}
		
		// VSpace4Height has the width of 40px (TurboSound)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageTurbosound");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Padding: " + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		} catch (Exception ex) {
			System.out.println("Brand HomePage VSpace4Height Expectation>>Expected Hight:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage VSpace4Height Error>>Expected Height:40px");
			count = count + 1;
		}
		
		
		// TypicalBrandLogo has the width of 327px (TC-Electronic)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageTCElectronic");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Padding: " + width);
			Assert.assertEquals(TypicalBrandlogowidth, width);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Width:327px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Width:327px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 78px (TC-Electronic)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageTCElectronic");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Padding: " + height);
			Assert.assertEquals(TypicalBrandLogoHeight, height);
		} catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Hight:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Height:78px");
			count = count + 1;
		}
		
		// VSpace4Height has the width of 40px (TC-Electronic)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageTCElectronic");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Padding: " + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		} catch (Exception ex) {
			System.out.println("Brand HomePage VSpace4Height Expectation>>Expected Hight:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage VSpace4Height Error>>Expected Height:40px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 327px (TC-Helicon)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageTCHelicon");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Padding: " + width);
			Assert.assertEquals(TypicalBrandlogowidth, width);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Width:327px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Width:327px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 78px (TC-Helicon)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageTCHelicon");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Padding: " + height);
			Assert.assertEquals(TypicalBrandLogoHeight, height);
		} catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Hight:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Height:78px");
			count = count + 1;
		}
		
		// VSpace4Height has the width of 40px (TC-Helicon)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageTCHelicon");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Padding: " + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		} catch (Exception ex) {
			System.out.println("Brand HomePage VSpace4Height Expectation>>Expected Hight:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage VSpace4Height Error>>Expected Height:40px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 327px (Behringer)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageBehringer");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Padding: " + width);
			Assert.assertEquals(TypicalBrandlogowidth, width);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Width:327px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Width:327px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 78px (Behringer)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageBehringer");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Padding: " + height);
			Assert.assertEquals(TypicalBrandLogoHeight, height);
		} catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Hight:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Height:78px");
			count = count + 1;
		}
		
		// VSpace4Height has the width of 40px (Behringer)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageBehringer");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Padding: " + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		} catch (Exception ex) {
			System.out.println("Brand HomePage VSpace4Height Expectation>>Expected Hight:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage VSpace4Height Error>>Expected Height:40px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 327px (Bugera)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageBugera");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Padding: " + width);
			Assert.assertEquals(TypicalBrandlogowidth, width);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Width:327px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Width:327px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 78px (Bugera)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageBugera");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Padding: " + height);
			Assert.assertEquals(TypicalBrandLogoHeight, height);
		} catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Hight:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Height:78px");
			count = count + 1;
		}
		
		// VSpace4Height has the width of 40px (Bugera)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageBugera");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Padding: " + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		} catch (Exception ex) {
			System.out.println("Brand HomePage VSpace4Height Expectation>>Expected Hight:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage VSpace4Height Error>>Expected Height:40px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 327px (DDA)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageDda");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Padding: " + width);
			Assert.assertEquals(TypicalBrandlogowidth, width);
		}

		catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Width:327px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Width:327px");
			count = count + 1;
		}
		
		// TypicalBrandLogo has the width of 78px (DDA)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageDda");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Padding: " + height);
			Assert.assertEquals(TypicalBrandLogoHeight, height);
		} catch (Exception ex) {
			System.out.println("Brand HomePage Gutter3Width Expectation>>Expected Hight:78px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage Gutter3Width Error>>Expected Height:78px");
			count = count + 1;
		}
		
		// VSpace4Height has the width of 40px (DDA)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageDda");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Padding: " + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		} catch (Exception ex) {
			System.out.println("Brand HomePage VSpace4Height Expectation>>Expected Hight:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage VSpace4Height Error>>Expected Height:40px");
			count = count + 1;
		}
		
		// VSpace1Height has the Height of 70px below Bugera logo)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.typicalbrandpageBugera");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String locator1 = locatorReader.getLocator("BrandHomePage.v1spaceHeighrsection");
			String margin_bottom1 = this.getCSS(locator1, "margin-bottom");
			String margin_top = this.getCSS(locator1, "padding-top");
			String marginBottom_wopx = margin_bottom.substring(0, 2);
			String marginBottom_wopx1 = margin_bottom1.substring(0, 2);
			int getaddpixel = Integer.parseInt(marginBottom_wopx)+ Integer.parseInt(marginBottom_wopx1);
			String marginBottom_withPX=getaddpixel+"px";
			System.out.println("Actual Padding: " + marginBottom_withPX);
			Assert.assertEquals(vSpace1Height, marginBottom_withPX);
		} catch (Exception ex) {
			System.out.println("Brand HomePage VSpace1Height Expectation>>Expected Hight:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage VSpace4Height Error>>Expected Height:70px");
			count = count + 1;
		}
		
		// VSpace1Height has the Height of 70px Above Midas Description)
		try {
			String locator = locatorReader.getLocator("BrandHomePage.v1spaceHeightAboveMidas");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Padding: " + padding_top);
			Assert.assertEquals(vSpace1Height, padding_top);
		} catch (Exception ex) {
			System.out.println("Brand HomePage VSpace1Height Expectation>>Expected Hight:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Brand HomePage VSpace4Height Error>>Expected Height:70px");
			count = count + 1;
		}
		
		
				
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}

}
