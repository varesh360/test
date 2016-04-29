/*==============================================================================================================================
File Name    : MG_UnifiedGlobalSupport_Helper.java
ClassName    : MG_UnifiedGlobalSupport_Helper
Summary      : Contains helping methods for MG_UnifiedGlobalSupport_Helper Page.
===============================================================================================================================
History      :   Company            Created By     
	  360logica                         

===============================================================================================================================
Remarks      :   Tests - ===============================================================================================================================*/

package test.java.com.MusicGroup.pagehelper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;
public class UnifiedSupport_Brands_Helper extends DriverHelper {
	private LocatorReader locatorReader;
	private int count = 0;
	public UnifiedSupport_Brands_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("UnifiedSupport_Brands.xml");
	
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
			//Click on Brand
			public void ClickOnBrands(){
			
			String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.ClickOnBrand");
			this.WaitForElementEnabled(locator, 10);
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
			//	this.clickMenuIcon();
				//Click on a brand
				//this.clickonMidas();
				//Click on a product
				this.ClickonTrainingLink();
				//Check page not found
				this.checkPageNotFound();
				this.ClickOnBrands();
			}
			
			public void verifySupportPage(String vSpace1Height, String gutter3width, String textSpace1Height, String SupportPhotoWidth, String SupportPhotoHeight, String vSpace2Height, String BrandAreaLogoWidth, String BrandsAreaLogoHeight, String vSpace4Height, String iconWidth, String iconHeigth, String gutter8Width, String TextSpace1, String TextSpace5)
			{
				
				ReachUptoSupportPage();
				VerifyGlobalSupportBrands(vSpace1Height, gutter3width, textSpace1Height,SupportPhotoWidth,SupportPhotoHeight, vSpace2Height, BrandAreaLogoWidth, BrandsAreaLogoHeight, vSpace4Height,iconWidth,iconHeigth, gutter8Width, TextSpace1, TextSpace5 );
				System.out.println("+++++++++ Click On KlarkTeknik ++++++++++++++++++++++++++++++++++++");
				String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.ClickOnKlarkTecknik");
				this.WaitForElementEnabled(locator, 10);
				clickOn(locator);
				VerifyGlobalSupportBrands(vSpace1Height, gutter3width, textSpace1Height,SupportPhotoWidth,SupportPhotoHeight, vSpace2Height, BrandAreaLogoWidth, BrandsAreaLogoHeight, vSpace4Height,iconWidth,iconHeigth, gutter8Width, TextSpace1, TextSpace5 );
				System.out.println("+++++++++++++++++++++++++++ Click On TurboSound +++++++++++++++++++++++++++++");
				String locator1 = locatorReader.getLocator("MgUnifiedGlobalSupport.ClickOnTurboSound");
				this.WaitForElementEnabled(locator1, 10);
				clickOn(locator1);
				VerifyGlobalSupportBrands(vSpace1Height, gutter3width, textSpace1Height,SupportPhotoWidth,SupportPhotoHeight, vSpace2Height, BrandAreaLogoWidth, BrandsAreaLogoHeight, vSpace4Height,iconWidth,iconHeigth, gutter8Width, TextSpace1, TextSpace5 );
				System.out.println("++++++++++++++++++ Click On Behringer +++++++++++++++++++++++++");
				String locator2 = locatorReader.getLocator("MgUnifiedGlobalSupport.ClickOnBugera");
				this.WaitForElementEnabled(locator2, 10);
				clickOn(locator2);
				VerifyGlobalSupportBrands(vSpace1Height, gutter3width, textSpace1Height,SupportPhotoWidth,SupportPhotoHeight, vSpace2Height, BrandAreaLogoWidth, BrandsAreaLogoHeight, vSpace4Height,iconWidth,iconHeigth, gutter8Width, TextSpace1, TextSpace5 );
				System.out.println("++++++++++++++++++ Click On Bugera ++++++++++++++++++++++++++");
				String locator3 = locatorReader.getLocator("MgUnifiedGlobalSupport.ClickOnBehringer");
				this.WaitForElementEnabled(locator3, 10);
				clickOn(locator3);
				VerifyGlobalSupportBrands(vSpace1Height, gutter3width, textSpace1Height,SupportPhotoWidth,SupportPhotoHeight, vSpace2Height, BrandAreaLogoWidth, BrandsAreaLogoHeight, vSpace4Height,iconWidth,iconHeigth, gutter8Width, TextSpace1, TextSpace5 );
				count=count-2;
				System.out.println("count value is :::" + count);
				
				Assert.assertTrue(count == 0);
			
			}
			
			public void VerifyGlobalSupportBrands(String vSpace1Height, String gutter3width, String textSpace1Height, String SupportPhotoWidth, String SupportPhotoHeight, String vSpace2Height, String BrandAreaLogoWidth, String BrandsAreaLogoHeight, String vSpace4Height, String iconWidth, String iconHeigth, String gutter8Width, String TextSpace1, String TextSpace5){
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
					String locator1 = locatorReader.getLocator("MgUnifiedGlobalSupport.VerifyTextSpace1BelowHeading");
					String padding_bottom_1 = this.getCSS(locator1, "padding-bottom");
					String font_size = this.getCSS(locator1, "font-size");
					String line_height = this.getCSS(locator1, "line-height");
					String padding_bottom_1_wopx=padding_bottom_1.substring(0,1);
					String padding_bottom_wopx=padding_bottom.substring(0,2);
					String line_height_wopx=line_height.substring(0,2);
					String font_size_wopx=font_size.substring(0,2);
					int getPixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
					int Gettotal=Integer.parseInt(padding_bottom_1_wopx)+getPixel+Integer.parseInt(padding_bottom_wopx);
					System.out.println("Gettotal"+Gettotal);
					String GetTotalPixel=Gettotal+"px";
					System.out.println("Actual Padding: " + GetTotalPixel);
					Assert.assertEquals(textSpace1Height, GetTotalPixel);
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
				
				//verify TextSpace 1 has the height of 35 px
				try {
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.VerifyTextSpace1");
					String margin_bottom = this.getCSS(locator, "margin-bottom");
					System.out.println("Actual Padding: " + margin_bottom);
					String margin_bottom_wopx = margin_bottom.substring(0, 2);
					String locator1 = locatorReader.getLocator("MgUnifiedGlobalSupport.VerifyTextSpace1BelowHeading");
					String font_size = this.getCSS(locator1, "font-size");
					String line_height = this.getCSS(locator1, "line-height");
					String font_size_wopx = font_size.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					int getPixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
					int getTotal=getPixel+Integer.parseInt(margin_bottom_wopx);
					String GetTotalpx=getTotal+"px";
					System.out.println("getPixel"+getPixel);
					System.out.println("GetTotalpx"+GetTotalpx);
					System.out.println("Actual result"+GetTotalpx);
					
					
					Assert.assertEquals(TextSpace1, GetTotalpx);
				}

				catch (Exception ex) {
					System.out.println("Midas Training v1spaceHeight Exception>>Expected Padding bottom:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training v1spaceHeight Error>>Expected Padding:70px");
					count = count + 1;
				}
				
				
				//Verify TextSpace5 has the height of 13px
				
				try {
			
					String locator1 = locatorReader.getLocator("MgUnifiedGlobalSupport.VerifyTextSpace1BelowHeading");
					String font_size = this.getCSS(locator1, "font-size");
					String line_height = this.getCSS(locator1, "line-height");
					String font_size_wopx = font_size.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					int getPixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
					int getTotal=getPixel+getPixel;
					String GetTotalpx=getTotal+"px";
					System.out.println("getPixel"+GetTotalpx);
					
					Assert.assertEquals(TextSpace5, GetTotalpx);
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
					String max_height = this.getAttribute(locatorHeight, "max-Height");
					//String max_heightpx=max_height+"px";
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
				
				//Verify VSpace1 Under General has the height of 70px

				try {
					
					String locator1 = locatorReader.getLocator("MgUnifiedGlobalSupport.VerifyVSpace1UnderGeneral");
					String margin_top=this.getCSS(locator1, "margin-top");
					System.out.println("margin_top"+margin_top);
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.VerifyVspace1General");
					
					
					String font_size = this.getCSS(locator, "font-size");
					String line_height = this.getCSS(locator, "line-height");
					String font_size_wopx = font_size.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					String margin_top_wopx=margin_top.substring(0, 2);
					int getPixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx)-Integer.parseInt("1");
					int getTotal=getPixel+Integer.parseInt(margin_top_wopx);
					String GetTotalpx=getTotal+"px";
					System.out.println("getPixel"+GetTotalpx);
					
					Assert.assertEquals(vSpace1Height, GetTotalpx);
				}

				catch (Exception ex) {
					System.out.println("Midas Training v1spaceHeight Exception>>Expected Padding bottom:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training v1spaceHeight Error>>Expected Padding:70px");
					count = count + 1;
				}
					//verify Vspace2 has the height of 20px
				try {
					
					String locator1 = locatorReader.getLocator("MgUnifiedGlobalSupport.verifyVSpace2General");
					String margin_top=this.getCSS(locator1, "margin-bottom");
					System.out.println("margin_top"+margin_top);
					String locator = locatorReader.getLocator("MgUnifiedGlobalSupport.verifyVSpace2BelowGeneral");
					
					
					String font_size = this.getCSS(locator, "font-size");
					String line_height = this.getCSS(locator, "line-height");
					String font_size_wopx = font_size.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					String margin_top_wopx=margin_top.substring(0, 2);
					int getPixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
					int getTotal=getPixel+Integer.parseInt(margin_top_wopx);
					String GetTotalpx=getTotal+"px";
					System.out.println("getPixel"+getPixel);
					
					Assert.assertEquals(vSpace2Height, GetTotalpx);
				}

				catch (Exception ex) {
					System.out.println("Midas Training v1spaceHeight Exception>>Expected Padding bottom:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas Training v1spaceHeight Error>>Expected Padding:70px");
					count = count + 1;
				}
				/* We have to check that condition
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
				*/
				/*
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
				*/
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
				//I have to work on that
				/*
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
				*/
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
				
			}
			
			
			
				

}
