/*==============================================================================================================================
 File Name    : Brands_Product_Downloads_Helper.java
 ClassName    : Brands_Product_Downloads_Helper
 Summary      : Contains helping methods for Brands_Product_Downloads_Helper Page.
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

public class Brands_Product_Downloads_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public Brands_Product_Downloads_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("Brands_Product_Downloads.xml");
	}
	
		//Click on Menu icon 
		public void clickMenuIcon()
		{
			String locator = locatorReader.getLocator("BrandsProductDownloads.MenuIcon");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
		}
		//Click on a brand
		public void Clickonbrandsdisplayedonmenu()
		{
			String locator = locatorReader.getLocator("BrandsProductDownloads.ClickonBehringer");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
			this.WaitForElementEnabled(locator, 50);
		}
		//Enter the product "X32" name in search field
		public void EnterProductinSearchField()
		{
			String locator = locatorReader.getLocator("BrandsProductDownloads.searchproduct");
			this.WaitForElementEnabled(locator, 50);
			String val="x32";
			clickOn(locator);
			sendKeys(locator,val);
			presEnterKey(locator);
			
		}
		//click on "X32" product
		public void Clickonselectedproduct()
		{
			String locator = locatorReader.getLocator("BrandsProductDownloads.ProductTitle");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
			
		}
		//click on download link displayed on product page
		public void Clickdownloadbuttononproductpage()
		{
			String locator = locatorReader.getLocator("BrandsProductDownloads.ClickDownloadbuttononproductpage");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
			
		}
		
		public void ReachUptoFeaturePage()
		{
			//Click on the Menu icon
			this.clickMenuIcon();
			//Click on a brand
			this.Clickonbrandsdisplayedonmenu();
			//enter the product "X32" name in search field
			this.EnterProductinSearchField();
			//Then we click on "X32" product
			this.Clickonselectedproduct();
			//Then we click on download link displayed on product page
			this.Clickdownloadbuttononproductpage();
		}
		public void verifyFeaturePage(String vSpace1Height , String vSpace4Height, String vSpace3Height, String vSpace2Height, String Textspace10height, String Fixedimagebox30height, String Fixedimagebox30width, String Gutter16width, String Icon20width, String Icon20height)
		{
			
		ReachUptoFeaturePage();
		int count = 0;
		// Verify vSpace1Height has the height of 70px.
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.vSpace1Heightlocator");
			String imgwidth = this.getCSS(locator, "margin-top");
			System.out.println("Actual Width:" + imgwidth);
			Assert.assertEquals(vSpace1Height, imgwidth);
		}

		catch (Exception ex) {
			System.out.println("Product Download page x32 Exception>>Expected Margin Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product Download Page x32 Error>>Expected Width:70px");
			count = count + 1;
		}

		// Verify vSpace4Height has the height of 40px.(Issue)
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.vSpace4Heightlocator");
			String imgwidth = this.getCSS(locator, "margin-top");
			System.out.println("Actual Width:" + imgwidth);
			Assert.assertEquals(vSpace4Height, imgwidth);
		}

		catch (Exception ex) {
			System.out.println("Product Download page x32 Exception>>Expected Margin Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product Download page x32 Error>>Expected Width:40px");
			count = count + 1;
		}

		// Verify vSpace3Height has the height of 50px.(Issue)
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.vSpace3HightLocator");
			String imgwidth = this.getCSS(locator, "padding-top");
			String imgwidth_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Width:" + imgwidth);
			Assert.assertEquals(vSpace3Height, imgwidth);
		}

		catch (Exception ex) {
			System.out.println("Product Download page x32 Exception>>Expected Padding Top:50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product Product download Page x32 Error>>Padding Top:50px");
			count = count + 1;
		}

		// Verify vSpace2Height has the height of 20px.
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.vSpace2HightLocator");
		//	String locator_second = locatorReader.getLocator("BrandsProductDownloads.vSpace2HightLocatorAboveLargetextinImagebox");
			String imgwidth = this.getCSS(locator, "padding-top");
			
			System.out.println("Actual Width:" + imgwidth);
			
			Assert.assertEquals(vSpace2Height, imgwidth);
			
		} catch (Exception ex) {
			System.out.println("Product download Page x32 Exception>>Expected Margin Top:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product download Page x32 Error>>Margin top:20px");
			count = count + 1;
		}

		// Verify vSpace2Height has the height of 20px above Large [461.2 KB] Test and below image divider.
		try {

			String locator_second = locatorReader.getLocator("BrandsProductDownloads.vSpace2HightLocatorAboveLargetextinImagebox");
			String imgwidth = this.getCSS(locator_second, "margin-top");
			String font_size=this.getCSS(locator_second, "font-size");
			String line_height=this.getCSS(locator_second, "line-height");
			String font_size_Wopx=font_size.substring(0, 2);
			String line_height_Wopx=line_height.substring(0, 2);
			String imgwidth_bottom = this.getCSS(locator_second, "margin-top");
			String imgwidth_bottom_wopx=imgwidth_bottom.substring(0, 2);
			int getpixel=Integer.parseInt(font_size_Wopx)-Integer.parseInt(line_height_Wopx);
			int Total_pixel=getpixel+Integer.parseInt(imgwidth_bottom_wopx);
			String GetTotal=Total_pixel+"px";
			System.out.println("Actual Width:" + GetTotal);
			System.out.println("Actual Width:" + imgwidth);
			Assert.assertEquals(vSpace2Height, imgwidth_bottom);
		}

		catch (Exception ex) {
			System.out.println("Product download Page x32 Expected >>Expected Margin Top:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product download Page x32 error>>Margin top:20px");
			count = count + 1;
		}
		/*
		// Verify Textspace10height has the height of 25px
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.Textspace10heightlocator");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Width:" + margin_top);
			Assert.assertEquals(Textspace10height, margin_top);

		} catch (Exception ex) {
			System.out.println("Product download Page x32 Exception>>Expected Margin Top:25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product download Page x32 Error>>Padding top:25px");
			count = count + 1;
		}
*/
		// Verify Fixed box image has the height of 171px.
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.Fixedimagebox30heightlocator");
			String imgwidth = this.getCSS(locator, "max-height");
			System.out.println("Actual Width:" + imgwidth);
			Assert.assertEquals(Fixedimagebox30height, imgwidth);
			}

		catch (Exception ex) {
			System.out.println("Product download Page x32 Exception>>Expected Hight Top:171px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product download Page x32 Error>>Max Hight:171px");
			count = count + 1;
		}
		// Verify Fixed box image has the width of 257px.
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.Fixedimagebox30widthlocator");
			String imgwidth = this.getCSS(locator, "max-width");
			System.out.println("Actual Width:" + imgwidth);
			Assert.assertEquals(Fixedimagebox30width, imgwidth);
			}

		catch (Exception ex) {
			System.out.println("Product download Page x32 Exception>>Expected Max width:257px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product download Page x32 Error>> Max width:257px");
			count = count + 1;
		}

		// Verify Gutter16width has the width of 34px(Padding left).
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.Gutter16widthlocator");
			String imgwidth = this.getCSS(locator, "padding-left");
			System.out.println("Actual Width:" + imgwidth);
			Assert.assertEquals(Gutter16width, imgwidth);
		}

		catch (Exception ex) {
			System.out.println("Product download Page x32 Exception>>Expected Padding Left:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product download Page x32 Error>>Expected Padding Left:34px");
			count = count + 1;
		}

		// Verify Gutter16width has the width of 34px(Padding right).
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.Gutter16widthlocator");
			String imgwidth = this.getCSS(locator, "padding-right");
			System.out.println("Actual Width:" + imgwidth);
			Assert.assertEquals(Gutter16width, imgwidth);
		}

		catch (Exception ex) {
			System.out.println("Product download Page x32 Exception>>Expected Padding Right:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product download Page x32 Error>>Expected Padding Right:34px");
			count = count + 1;
		}
		// Verify vSpace2Height has the height of 20px after 'See All Images Text'.
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.vspace2HightLocatorAboveSeeAllImagesText");
			String imgwidth = this.getCSS(locator, "margin-top");
			System.out.println("padding bottom locator" + imgwidth);
			Assert.assertEquals(vSpace2Height, imgwidth);
			
		} catch (Exception ex) {
			System.out.println("Product download Page x32 Exception>>Expected Margin Top:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product download Page x32 Error>>Margin top:20px");
			count = count + 1;
		}
		// Verify vSpace4Height has the height of 40px above and below document text.
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.vSpace4Heightlocator_AboveDocumentationText");
			String imgwidth = this.getCSS(locator, "margin-top");
			String imgwidth_bottom = this.getCSS(locator, "margin-top");
			System.out.println("Actual Width:" + imgwidth);
			System.out.println("Actual Width Bottom:" + imgwidth_bottom);
			Assert.assertEquals(vSpace4Height, imgwidth);
			Assert.assertEquals(vSpace4Height, imgwidth_bottom);
		}

		catch (Exception ex) {
			System.out.println("Product download Page x32 Exception>>Expected Margin Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product download Page x32 Error>>Expected Width:40px");
			count = count + 1;
		}
		// Verify vSpace3Height has the height of 50px under documentation section.
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.vSpace3HightLocatorunderdocumentaionsection");
			String imgwidth = this.getCSS(locator, "padding-top");
			String imgwidth_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Width:" + imgwidth);
			System.out.println("Actual Width Padding bottom:" + imgwidth_bottom);
			Assert.assertEquals(vSpace3Height, imgwidth);
			Assert.assertEquals(vSpace3Height, imgwidth_bottom);
		}

		catch (Exception ex) {
			System.out.println("Product download Page x32 Exception>>Expected Padding Top Padding Bottom:50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product download Page x32 Error>>Expected Padding:50px");
			count = count + 1;
		}

		// Verify icon 20 width having width 100px.
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.icon20widthlocator");
			String imgwidth = this.getCSS(locator, "width");
			System.out.println("Actual Width:" + imgwidth);
			Assert.assertEquals(Icon20width, imgwidth);
		}

		catch (Exception ex) {
			System.out.println("Product download Page x32 Expected >>Expected Width:100px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product download Page x32 Error>>Expected Width:100px");
			count = count + 1;
		}
		// Verify icon 20 width having height 104px.
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.icon20widthlocator");
			String imgwidth = this.getCSS(locator, "height");
			System.out.println("Actual Width:" + imgwidth);
			Assert.assertEquals(Icon20height, imgwidth);
		}

		catch (Exception ex) {
			System.out.println("Product download Page x32 Expection>>Expected Height Top:104px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Product download Page x32 Error>>Expected Height:104px");
			count = count + 1;
		}
		// Verify vSpace2Height has the height of 20px after 'See All Documentation text Text'.
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.vspace2HightLocatorAboveSeeAlldocumentation");
			String imgwidth = this.getCSS(locator, "margin-top");
			Assert.assertEquals(vSpace2Height, imgwidth);
			System.out.println("padding bottom locator" + imgwidth);
		} 
		catch (Exception ex) {
			System.out.println("Product download Page x32 Expectation>Expected Margin Top:20px");
			count = count + 1;
		} 
		catch (Error ex) {
			System.out.println("Product download Page x32 Error>>Margin top:20px");
			count = count + 1;
		}

		// Verify vSpace1Height has the height of 70px under 'See All documentation text'.
		try {

			String locator = locatorReader.getLocator("BrandsProductDownloads.vSpace1HeightlocatorUnderSeeAllDocumentationText");
			String imgwidth = this.getCSS(locator, "margin-top");
			System.out.println("Actual Width:" + imgwidth);
			Assert.assertEquals(vSpace1Height, imgwidth);
		}

		catch (Exception ex) {
			System.out
					.println("Product download Page x32 Expectation>>Expected Margin Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out
					.println("Product download Page x32 Error>>Margin Top:70px");
			count = count + 1;
		}

		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	}
		
		
		
			
}

	