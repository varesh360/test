/*==============================================================================================================================
File Name    : MG_UnifiedGlobalSupport_Helper.java
ClassName    : MG_UnifiedGlobalSupport_Helper
Summary      : Contains helping methods for MG_UnifiedGlobalSupport_Helper Page.
===============================================================================================================================
History      :   Company            Created By     
	  360logica                         

===============================================================================================================================
Remarks      :   Tests - 
===============================================================================================================================*/
package test.java.com.MusicGroup.pagehelper;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class MG_UnifiedGlobalSupport_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public MG_UnifiedGlobalSupport_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("MG_Unified_Global_Support.xml");
	
	}
	//Click on Menu icon 
			public void clickMenuIcon()
			{
				String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.MenuIcon");
				this.WaitForElementEnabled(locator, 50);
				clickOn(locator);
			}
			
			//Click on Brand Midas
			public void clickonMidas()
			{
				String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.ClickonMidas");
				this.WaitForElementEnabled(locator, 50);
				clickOn(locator);
			}
			
			// click on Training link on search result page
			public void ClickonTrainingLink() {
				String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.ClickonSupport");
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
			public void ReachUptoSupportPage()
			{
				//Click on the Menu icon
				this.clickMenuIcon();
				//Click on a brand
				this.clickonMidas();
				//Click on a product
				this.ClickonTrainingLink();
				//Check page not found
				this.checkPageNotFound();
			}
			
			public void verifySupportPage(String vSpace1Height, String gutter3width, String textSpace1Height, String SupportPhotoWidth, String SupportPhotoHeight, String vSpace2Height, String BrandAreaLogoWidth, String BrandsAreaLogoHeight, String vSpace4Height, String iconWidth, String iconHeigth, String gutter8Width)
			{
				
				ReachUptoSupportPage();
				int count = 0;
				// Verify vSpace1Height has the height of 70px on 'Welcome to support' text.
				try {
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vSpace1Height");
					String padding_top = this.getCSS(locator, "padding-top");
					System.out.println("Actual Padding: " + padding_top);
					Assert.assertEquals(vSpace1Height, padding_top);
				}

				catch (Exception ex) {
					System.out.println("Midas Support vSpace1Height Exception>>Expected Pading Top:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Support vSpace1Height Error>>Expected Padding:70px");
					count = count + 1;
				}
				// Verify Gutter3width has the padding of 20px 'Welcome to support' text Left side .
				try {
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vSpace1Height");
					String padding_left = this.getCSS(locator, "padding-left");
					System.out.println("Actual Padding: " + padding_left);
					Assert.assertEquals(gutter3width, padding_left);
				}

				catch (Exception ex) {
					System.out.println("Midas Training Gutter8Width Exception>>Expected Padding left:20px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training Gutter8Width Error>>Expected Padding:20px");
					count = count + 1;
				}
				// Verify Gutter3width has the padding of 20px 'Welcome to support' text Right side.
				try {
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vSpace1Height");
					String padding_left = this.getCSS(locator, "padding-left");
					System.out.println("Actual Padding: " + padding_left);
					Assert.assertEquals(gutter3width, padding_left);
				}

				catch (Exception ex) {
					System.out.println("Midas Training Gutter8Width Exception>>Expected Padding left:20px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training Gutter8Width Error>>Expected Padding:20px");
					count = count + 1;
				}	
				// Verify Height has the padding of 50px 'Welcome to support' text bottom side.
				try {
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vSpace1Height");
					String padding_bottom = this.getCSS(locator, "padding-bottom");
					System.out.println("Actual Padding: " + padding_bottom);
					Assert.assertEquals(textSpace1Height, padding_bottom);
				}

				catch (Exception ex) {
					System.out.println("Midas Training Gutter8Width Exception>>Expected Padding bottom:50px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training Gutter8Width Error>>Expected Padding:50px");
					count = count + 1;
				}
				// Verify v1spaceHeight has the margin bottom of 70px 'Welcome to support' text bottom side.
				try {
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vspace1hightbelowimagebox");
					String margin_bottom = this.getCSS(locator, "margin-bottom");
					System.out.println("Actual Padding: " + margin_bottom);
					Assert.assertEquals(vSpace1Height, margin_bottom);
				}

				catch (Exception ex) {
					System.out.println("Midas Training v1spaceHeight Exception>>Expected Padding bottom:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training v1spaceHeight Error>>Expected Padding:70px");
					count = count + 1;
				}
				
				// Verify SupportPhotoWidth has the width of 371px 
				try {
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.imglocator");
					String max_width = this.getCSS(locator, "max-width");
					System.out.println("Actual Padding: " + max_width);
					Assert.assertEquals(SupportPhotoWidth, max_width);
				}

				catch (Exception ex) {
					System.out.println("Midas Training SupportPhotoWidth Exception>>Expected Hight:371px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training SupportPhotoWidth Error>>Expected :371px");
					count = count + 1;
				}
				
				// Verify SupportPhotoHeight has the Height of 280px 
				try {
				
					String locatorHeight = locatorReader.getLocator("MgUnifiedGlobalSupport.imglocatorheight");
					String max_height = this.getCSS(locatorHeight, "height");
				    System.out.println("Actual Padding: " + max_height);
					Assert.assertEquals(SupportPhotoHeight, max_height);
				}

				catch (Exception ex) {
					System.out.println("Midas Training SupportPhotoHeight Exception>>Expected Padding bottom:280px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training SupportPhotoHeight Error>>Expected Padding:280px");
					count = count + 1;
				}
				
				// Verify vSpace2Height has the Height of 20px 
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vSpace2HeightAboveMidasImage");
					String margin_top = this.getCSS(locator, "margin-top");
				    System.out.println("Actual Padding: " + margin_top);
					Assert.assertEquals(vSpace2Height, margin_top);
				}

				catch (Exception ex) {
					System.out.println("Midas Training vSpace2Height Exception>>Expected Margin-top:20px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training vSpace2Height Error>>Expected Margin:20px");
					count = count + 1;
				}
				// Verify vSpace2Height has the Height of 20px bottom
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vSpace2HeightAboveMidasImage");
					String margin_top = this.getCSS(locator, "margin-top");
					System.out.println("Actual Padding: " + margin_top);
				    Assert.assertEquals(vSpace2Height, margin_top);
				}

				catch (Exception ex) {
					System.out.println("Midas Training vSpace2Height Exception>>Expected Margin-top:20px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training vSpace2Height Error>>Expected Margin:20px");
					count = count + 1;
				}
				// Verify BrandAreaLogoWidth has the Height of 325px 
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.BrandAreaLogo");
					String width = this.getCSS(locator, "width");
					System.out.println("Actual Width: " + width);
					String width_wopx = width.substring(0, 3);
					String width_withPX=width_wopx+"px";
					System.out.println("Actual Width: " + width_withPX);
				    Assert.assertEquals(BrandAreaLogoWidth, width_withPX);
				}

				catch (Exception ex) {
					System.out.println("Midas Training BrandAreaLogoWidth Exception>>Expected Width:325px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training BrandAreaLogoWidth Error>>Expected Width:325px");
					count = count + 1;
				}
				
				// Verify BrandAreaLogoHeight has the Height of 170px 
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.BrandAreaLogo");
					String height = this.getCSS(locator, "height");
				    System.out.println("Actual Height: " + height);
				    Assert.assertEquals(BrandsAreaLogoHeight, height);
				}

				catch (Exception ex) {
					System.out.println("Midas Training BrandsAreaLogoHeight Exception>>Expected Height:170px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training BrandsAreaLogoHeight Error>>Expected Height:170px");
					count = count + 1;
				}
				// Verify VSpace1height has the Height of 70px 
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vSpace1HeightAllocator");
					String margin_top = this.getCSS(locator, "margin-top");
				    System.out.println("Actual Height:" + margin_top);
				    Assert.assertEquals(vSpace1Height, margin_top);
				}

				catch (Exception ex) {
					System.out.println("Midas Training VSpace1height Exception>>Expected Height:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training VSpace1height Error>>Expected Height:70px");
					count = count + 1;
				}
				// Verify VSpace2height has the Height of 20px below general text
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vspacelocatorbelowgeneraltext");
					String margin_bottom = this.getCSS(locator, "margin-bottom");
				    System.out.println("Actual Height:" + margin_bottom);
				    Assert.assertEquals(vSpace2Height, margin_bottom);
				}

				catch (Exception ex) {
					System.out.println("Midas Training VSpace2height Exception>>Expected Height:20px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training VSpace2height Error>>Expected Height:20px");
					count = count + 1;
				}
				// Verify VSpace4height has the Height of 40px Above where to buy text
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vspace4heightlocatorAboverwheretobuy");
					String padding_top = this.getCSS(locator, "padding-top");
				    System.out.println("Actual Height:" + padding_top);
				    Assert.assertEquals(vSpace4Height, padding_top);
				}

				catch (Exception ex) {
					System.out.println("Midas Training VSpace4height Exception>>Expected Height:40px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training VSpace4height Error>>Expected Height:40px");
					count = count + 1;
				}
				// Verify VSpace7height has the Height of 40px below where to buy text
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vSpace7Heightbelowwheretobuy");
					String margin_bottom = this.getCSS(locator, "margin-bottom");
				    System.out.println("Actual Height:" + margin_bottom);
				    Assert.assertEquals(vSpace4Height, margin_bottom);
				}

				catch (Exception ex) {
					System.out.println("Midas Training VSpace7height Exception>>Expected Height:23px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training VSpace7height Error>>Expected Height:23px");
					count = count + 1;
				}
				// Verify iconwidth has the Height of 100px
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.iconwidthlocator");
					String icon_width = this.getCSS(locator, "max-height");
				    System.out.println("Actual Icon Width:" + icon_width);
				    Assert.assertEquals(iconWidth, icon_width);
				}

				catch (Exception ex) {
					System.out.println("Midas Training IconWidth Exception>>Expected Height:104px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training IconWidth Error>>Expected Height:104px");
					count = count + 1;
				}
				// Verify iconhight has the Height of 100px
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.textspace1heightbelowfindyours");
					String min_height = this.getCSS(locator, "min-height");
				    System.out.println("Actual Result:" + min_height);
				    Assert.assertEquals(textSpace1Height, min_height);
				}

				catch (Exception ex) {
					System.out.println("Midas Training iconHeight Exception>>Expected Height:100px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training  Error>>Expected Height:100px");
					count = count + 1;
				}
				// Verify gutter8width has the Height of 40px
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.gutter8widthinfirstcol");
					String padding_left = this.getCSS(locator, "padding-right");
				    System.out.println("Actual Result:" + padding_left);
				    Assert.assertEquals(gutter8Width, padding_left);
				}

				catch (Exception ex) {
					System.out.println("Midas Training padding_left Exception>>Expected Height:40px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training padding_left Error>>Expected Height:40px");
					count = count + 1;
				}
				
				// Verify vSpace1Height has the Height of 70px above care text
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vspace4heightabovecare");
					String margin_bottom = this.getCSS(locator, "margin-bottom");
				    System.out.println("Actual Result:" +margin_bottom);
				    Assert.assertEquals(vSpace1Height, margin_bottom);
				}

				catch (Exception ex) {
					System.out.println("Midas Training vSpace1Height Exception>>Expected Bottom:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training vSpace1Height Error>>Expected Bottom:70px");
					count = count + 1;
				}
				// Verify vSpace1Height has the Height of 70px
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vspace1heightaboverBringerlogofooter");
					String margin_bottom = this.getCSS(locator, "margin-bottom");
				    System.out.println("Actual Result:" +margin_bottom);
				    Assert.assertEquals(vSpace1Height, margin_bottom);
				}

				catch (Exception ex) {
					System.out.println("Midas Training vSpace1Height Exception>>Expected Bottom:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training vSpace1Height Error>>Expected Bottom:70px");
					count = count + 1;
				}
				// Verify vSpace2Height has the Height of 20px above bringer logo in footer
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vspace2heightaboverBringerlogoincolumn");
					String margin_top = this.getCSS(locator, "margin-top");
					System.out.println("Actual Result:" +margin_top);
				    Assert.assertEquals(vSpace2Height, margin_top);
				}

				catch (Exception ex) {
					System.out.println("Midas Training vSpace2Height Exception>>Expected Bottom:20px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training vSpace2Height Error>>Expected Bottom:20px");
					count = count + 1;
				}
				
				// Verify vSpace2Height has the Height of 20px below bringer logo in footer
				try {
				
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vspace2heightaboverBringerlogoincolumn");
					String margin_bottom = this.getCSS(locator, "margin-bottom");
					System.out.println("Actual Result:" +margin_bottom);
				    Assert.assertEquals(vSpace2Height, margin_bottom);
				}

				catch (Exception ex) {
					System.out.println("Midas Training vSpace2Height Exception>>Expected Bottom:20px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training vSpace2Height Error>>Expected Bottom:20px");
					count = count + 1;
				}
				// Verify vSpace1Height has the Height of 70px below bringer logo in footer
				try {
				
					
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.vspac1heightabovefooter1");
					String margin_bottom= this.getCSS(locator, "margin-bottom");
					System.out.println("Actual Result:" +margin_bottom);
					Assert.assertEquals(vSpace1Height, margin_bottom);
				}

				catch (Exception ex) {
					System.out.println("Midas Training vSpace1Height Exception>>Expected Bottom:70");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training vSpace1Height Error>>Expected Bottom:70px");
					count = count + 1;
				}
				System.out.println("count value is :::" + count);
				Assert.assertTrue(count == 0);
			
			}
			
			
			
				
	}

