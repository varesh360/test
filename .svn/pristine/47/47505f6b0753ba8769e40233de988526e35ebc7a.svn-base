/*==============================================================================================================================
File Name    : MG_Training_Helper.java
ClassName    : MG_Training_Helper
Summary      : Contains helping methods for MG_Training_Helper Page.
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

public class Midas_Training_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public Midas_Training_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("Midas_Training.xml");

	}
	//Click on Menu icon 
		public void clickMenuIcon()
		{
			String locator = locatorReader.getLocator("MidasTrainingPage.MenuIcon");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
		}
		
		//Click on Brand Bugera
		public void clickonMidas()
		{
			String locator = locatorReader.getLocator("MidasTrainingPage.ClickonMidas");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
		}
		
		// click on Training link on search result page
		public void ClickonTrainingLink() {
			String locator = locatorReader.getLocator("MidasTrainingPage.clickonTraining");
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
		public void ReachUptoTrainingPage()
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
		
	//Verify Midas Training page	
	public void verifyMidasTrainingPage(String vSpace1Height,String vSpace4Height, String fixedBoxImageWidth,String FixedBoxImageHeight, String TextSpace10Height,String Gutter28Width, String Gutter8width, String Gutter82Width, String Gutter83Width, String TextSpace13Height, String TextSpace5Height)
	{
		
//Reach upto Midas training page
	ReachUptoTrainingPage();
	
	int count = 0;
 // Verify vSpace1Height has the height of 70px below Training and certification text.
	try {
			String locator = locatorReader.getLocator("MidasTrainingPage.vspace1height");
			String margin_top = this.getCSS(locator, "margin-top");
			String locator1 = locatorReader.getLocator("MidasTrainingPage.vspave1height2para");
			String line_height = this.getCSS(locator1, "line-height");
			String locator2 = locatorReader.getLocator("MidasTrainingPage.vspave1height2para");
			String margin_bottom = this.getCSS(locator2, "margin-bottom");
			// Substring: To remove pixel(px text) from value
			String marginBottom_wopx = margin_top.substring(0, 2);
			String paddingBottom_wopx = line_height.substring(0, 2);
			String lineHeight_wopx = margin_bottom.substring(0, 2);
			// Convert String into Int
			int getaddedpixel = Integer.parseInt(paddingBottom_wopx)+ Integer.parseInt(lineHeight_wopx);
			int lineHeight_wopx_int = Integer.parseInt(marginBottom_wopx);
			int getremaindiff = getaddedpixel - lineHeight_wopx_int;
			int finalvalue = lineHeight_wopx_int + getremaindiff;
			String finalValuewithpx = finalvalue + "px";
			System.out.println("Actual Hight: " + vSpace1Height);
			Assert.assertEquals(vSpace1Height, finalValuewithpx);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace1Height Exception>>Expected Margin bottom:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace1Height Error>>Expected Width:70px");
			count = count + 1;
		}
		// Verify vSpace4Height has the height of 40px below Training and certification text.
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.vspace4Height");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
			int getaddpixel=  Integer.parseInt(margin_bottom_wopx)+getsubpixel;
			String getfinalvalue=getaddpixel+"px";
			System.out.println("Actual Hight: " +getfinalvalue);
			Assert.assertEquals(vSpace4Height, getfinalvalue);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

		// Verify fixedImageWidth has the width of 980px .
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.fixedBoxImageWidth");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Width: " + width);
			Assert.assertEquals(fixedBoxImageWidth, width);
		}

		catch (Exception ex) {
			System.out.println("Midas Training fixedImageWidth Exception>>Expected Image width:980px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page fixedImageWidth Error>>Expected Width:980px");
			count = count + 1;
		}

		// Verify fixedImageHeight has the width of 266px .
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.fixedBoxImageWidth");
			String width = this.getCSS(locator, "height");
			System.out.println("Actual Width:" + width);
			Assert.assertEquals(FixedBoxImageHeight, width);
		}

		catch (Exception ex) {
			System.out.println("Midas Training fixedImageHeight Exception>>Expected Margin bottom:266px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page fixedImageHeight Error>>Expected Width:266px");
			count = count + 1;
		}

		// Verify vSpace4Height has the height of 40px below image .
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.fixedBoxImageWidth");
			String width = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Width: " + width);
			Assert.assertEquals(vSpace4Height, width);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

		// Verify vSpace4Height has the height of 40px with in table column .
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.vSpace4Heightfirstcol");
			String padding_top = this.getCSS(locator, "padding-top");
			String padding_top_wopx = padding_top.substring(0, 2);
			
			
			String locator1 = locatorReader.getLocator("MidasTrainingPage.vSpace4Heightfirstcoltextheading");
			String font_size = this.getCSS(locator1, "font-size");
			String line_height = this.getCSS(locator1, "line-height");
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			
			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel+Integer.parseInt("2");
			String getfinalvalue=getaddpixel+"px";
			System.out.println("Actual Width: " + getfinalvalue);
			Assert.assertEquals(vSpace4Height, getfinalvalue);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

		// Verify vSpace10Height has the height of 25px with in table
		// column1(The MIDAS Certified Training) .
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.vSpace4Heightfirstcoltextheading");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("3");
			
			String locator1 = locatorReader.getLocator("MidasTrainingPage.textSpace1Height1Col");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			
			int getsubpixel1 = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1)+Integer.parseInt("2");
			
			int getaddpixel=Integer.parseInt(margin_bottom_wopx)+getsubpixel1+getsubpixel;
			String getfinalvalue=getaddpixel+"px";
			System.out.println("Actual Width: " + getfinalvalue);
			Assert.assertEquals(TextSpace10Height,getfinalvalue);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace10Height Exception>>Expected Margin bottom:25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training vSpace10Height Error>>Expected Width:25px");
			count = count + 1;
		}
		// Verify vSpace10Height has the height of 25px with in table
				// column1(The MIDAS Certified Training) .
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.textSpace1Height1Col");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("3");
			
			
			String locator1 = locatorReader.getLocator("MidasTrainingPage.textSpace1Height1Col2para");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			
			int getsubpixel1 = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1)+Integer.parseInt("3");
			int getaddpixel=Integer.parseInt(margin_bottom_wopx)+getsubpixel1+getsubpixel;
			String getfinalvalue=getaddpixel+"px";
			System.out.println("Actual Width: " + getfinalvalue);
			Assert.assertEquals(TextSpace10Height,getfinalvalue);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace10Height11 Exception>>Expected Margin bottom:25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training vSpace10Height11 Error>>Expected Width:25px");
			count = count + 1;
		}
			
		// Verify vSpace10Height has the height of 25px with in table
		// column1(Come and Experience) .
/*		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.vspace4HeightComeExp");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("3");
			
			
			System.out.println("Actual Width: " + margin_bottom);
			Assert.assertEquals(TextSpace10Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace10Height Exception>>Expected Result:25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training vSpace10Height Error>>Expected Rseult:25px");
			count = count + 1;
		}
		*/
		// Verify Gutter08Width has the width of 40px with in table column1 .
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.vspace4Heightintablecolumn");
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Width: " + padding_left);
			Assert.assertEquals(Gutter8width, padding_left);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected padding Left:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Padding:40px");
			count = count + 1;
		}

		// Verify Gutter08Width has the width of 40px with in table column1 .
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.vspace4Heightintablecolumn");
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Width: " + padding_right);
			Assert.assertEquals(Gutter8width, padding_right);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}
		

		// Verify TextSpace10Height has the width of 25px Above CDMSE Text
		try {
			String first_locator = locatorReader.getLocator("MidasTrainingPage.textspace10HeightColm3");
			String marginBottom = this.getCSS(first_locator, "margin-bottom");
			String second_locator = locatorReader.getLocator("MidasTrainingPage.textspace10HeightColmwithoutp");
			String paddingBottom = this.getCSS(second_locator, "padding-bottom");
			String third_locator = locatorReader.getLocator("MidasTrainingPage.textspace10HeightCDMSE");
			String lineHeight = this.getCSS(third_locator, "line-height");
			// Substring: To remove pixel(px text) from value
			String marginBottom_wopx = marginBottom.substring(0, 2);
			String paddingBottom_wopx = paddingBottom.substring(0, 1);
			String lineHeight_wopx = lineHeight.substring(0, 2);
			// Convert String into Int
			int getaddedpixel = Integer.parseInt(marginBottom_wopx)	+ Integer.parseInt(paddingBottom_wopx);
			int lineHeight_wopx_int = Integer.parseInt(lineHeight_wopx);
			int getremaindiff = lineHeight_wopx_int - getaddedpixel;
			int finalvalue = getaddedpixel + getremaindiff;
			String Totalpixelvaluewithpixel = finalvalue + "px";
			System.out.println("Actual Width: " + Totalpixelvaluewithpixel);
			Assert.assertEquals(TextSpace10Height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:10px");
			count = count + 1;
		}

		// Verify TextSpace10Height has the width of 25px Above DayTwo Text
		try {
			String first_locator = locatorReader.getLocator("MidasTrainingPage.textspace10HeightCDMSE");
			String marginBottom = this.getCSS(first_locator, "margin-bottom");
			String second_locator = locatorReader.getLocator("MidasTrainingPage.textspace10HeightDayTwo");
			String lineHeight = this.getCSS(second_locator, "line-height");
			// Substring: To remove pixel(px text) from value
			String marginBottom_wopx = marginBottom.substring(0, 2);
			String lineHeight_wopx = lineHeight.substring(0, 2);
			// Convert String into Int
			int getdiffpixel = Integer.parseInt(lineHeight_wopx)- Integer.parseInt(marginBottom_wopx);
			int getaddpixel = getdiffpixel+ Integer.parseInt(marginBottom_wopx);
			String FinalGetAddpixel = getaddpixel + "px";

			System.out.println("Actual Width: " + FinalGetAddpixel);
			Assert.assertEquals(TextSpace10Height, FinalGetAddpixel);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

		// 2. Verify TextSpace10Height has the width of 25px below DayTwo Text
		try {
			String first_locator = locatorReader.getLocator("MidasTrainingPage.textspace10HeightDayTwo");
			String marginBottom = this.getCSS(first_locator, "margin-bottom");
			String lineHeight = this.getCSS(first_locator, "line-height");
			String fontsize = this.getCSS(first_locator, "font-size");
			String lineHeight_wopx = lineHeight.substring(0, 2);
			String fontsize_wopx = fontsize.substring(0, 2);
			int getdiffpixel = Integer.parseInt(lineHeight_wopx)- Integer.parseInt(fontsize_wopx)+Integer.parseInt("3");
			
			String second_locator = locatorReader.getLocator("MidasTrainingPage.textspace10heightbelowDaytwo");
			String lineHeight1 = this.getCSS(second_locator, "line-height");
			String fontsize1 = this.getCSS(second_locator, "font-size");
			//System.out.println("-----line-height----"+lineHeight);
			// Substring: To remove pixel(px text) from value
			String marginBottom_wopx = marginBottom.substring(0, 2);
			String lineHeight_wopx1 = lineHeight1.substring(0, 2);
			String fontsize_wopx1 = fontsize1.substring(0, 2);
			int getdiffpixel1 = Integer.parseInt(lineHeight_wopx1)- Integer.parseInt(fontsize_wopx1)+Integer.parseInt("2");
			// Convert String into Int
			
			int getaddpixel = getdiffpixel+ Integer.parseInt(marginBottom_wopx)+getdiffpixel1;
			String FinalGetAddpixel = getaddpixel + "px";
			System.out.println("Actual Width: " + FinalGetAddpixel);
			Assert.assertEquals(TextSpace10Height, FinalGetAddpixel);
		}

		catch (Exception ex) {
			System.out.println("Midas Training TextSpace10Height Exception>>Expected Margin bottom:25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training TextSpace10Height Error>>Expected Width:25px");
			count = count + 1;
		}
		// 2. Verify Gutter28Width has the width of 17px
		try {
			String first_locator = locatorReader.getLocator("MidasTrainingPage.gutter28widthlocator");
			String marginRight = this.getCSS(first_locator, "margin-right");
			System.out.println("Actual Result:" + marginRight);
			Assert.assertEquals(Gutter28Width, marginRight);
		}

		catch (Exception ex) {
			System.out.println("Midas Training Gutter28Width Exception>>Expected Margin bottom:17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page Gutter28Widtht Error>>Expected Width:17px");
			count = count + 1;
		}

		// 1. Verify vSpace1Height has the height of 70px below Training and// certification text.
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.vspace1heightlocator");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Result:" + padding_bottom);
			Assert.assertEquals(vSpace1Height, padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

		// 1. Verify gutter82widthlocator has the height of 12px below Training and	// certification text.
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.gutter82widthlocator");
			String padding_left = this.getCSS(locator, "padding-left");
			String padding_left_wopx = padding_left.substring(0, 2);
			int getaddpixel=Integer.parseInt(padding_left_wopx)-Integer.parseInt("5");
			String getfinalvalue=getaddpixel+"px";
			System.out.println("Actual Result:" + getfinalvalue);
			Assert.assertEquals(Gutter82Width, getfinalvalue);
		}

		catch (Exception ex) {
			System.out.println("Midas Training gutter82widthlocator Exception>>Expected Margin bottom:12px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training gutter82widthlocator Error>>Expected Width:12px");
			count = count + 1;
		}

		//Verify gutter8width has the width of 40px(column1:Left Padding).
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.gutter8widthlocator");
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result:" + padding_left);
			Assert.assertEquals(Gutter8width, padding_left);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

		// Verify gutter8width has the width of 40px(column1:Right Padding).
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.gutter8widthlocator");
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result:" + padding_right);
			Assert.assertEquals(Gutter8width, padding_right);
		} catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

		// Verify gutter8width has the width of 40px(column2:Left Padding).
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.gutter8widthlocatorcol2");
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result:" + padding_left);
			Assert.assertEquals(Gutter8width, padding_left);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

		// Verify gutter8width has the width of 40px(column2:Right Padding).
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.gutter8widthlocatorcol2");
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result:" + padding_right);
			Assert.assertEquals(Gutter8width, padding_right);
		} catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

		// Verify gutter8width has the width of 40px(column3:Left Padding).
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.gutter8widthlocatorcol3");
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result:" + padding_left);
			Assert.assertEquals(Gutter8width, padding_left);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

		// Verify gutter8width has the width of 40px(column3:Right Padding).
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.gutter8widthlocatorcol3");
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result:" + padding_right);
			Assert.assertEquals(Gutter8width, padding_right);
		} catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

				
		// Verify VSpace4loactor has the height of 40px 
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.vspace4Heightbelowcolumn");
			String margin_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual result  " + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

		// Verify vspace1height has the height of 40px 
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.vspace1height");
			String margin_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual result  " + margin_bottom);
			Assert.assertEquals(vSpace1Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("Midas Training vspace1height Exception>>Expected Margin bottom:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training vspace1height Error>>Expected Width:70px");
			count = count + 1;
		}		
		// Verify gutter83width has the width of 26px		
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.gutter82widthlocator");
			String padding_left = this.getCSS(locator, "padding-left");
			String padding_left_wopx = padding_left.substring(0, 2);
			int getsubpixel=Integer.parseInt(padding_left_wopx)-Integer.parseInt("5");
			
			String locator1 = locatorReader.getLocator("MidasTrainingPage.gutter83width1");
			String margin_left = this.getCSS(locator1, "margin-left");
			String margin_left_wopx1 = margin_left.substring(0, 2);
			
			
			int getsubpixel1=Integer.parseInt(margin_left_wopx1)-Integer.parseInt("2");
			int getaddpixel=getsubpixel+getsubpixel1;
			String getfinalvalue=getaddpixel+"px";
			System.out.println("Actual Result:" + getfinalvalue);
			Assert.assertEquals(Gutter83Width, getfinalvalue);
		}

		catch (Exception ex) {
			System.out.println("Midas Training Gutter83Width Exception>>Expected Result:26px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training Gutter83Width Error>>Expected Result:26px");
			count = count + 1;
		}	
		// Verify TextSpace13Height has the width of 7px		
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.textSpace13Height");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			int getsubpixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx)+Integer.parseInt("5");
			
			
			
			String getfinalvalue=getsubpixel+"px";
			System.out.println("Actual Result:" + getfinalvalue);
			Assert.assertEquals(TextSpace13Height, getfinalvalue);
		}

		catch (Exception ex) {
			System.out.println("Midas Training TextSpace13Height Exception>>Expected Result:7px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training TextSpace13Height Error>>Expected Result:7px");
			count = count + 1;
		}
		// Verify TextSpace5Height has the width of 7px
		try {
			String locator = locatorReader.getLocator("MidasTrainingPage.textSpace5Heightli1");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			int getsubpixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			
			String locator1 = locatorReader.getLocator("MidasTrainingPage.textSpace5Heightli1");
			String font_size1 = this.getCSS(locator1, "font-size");
			String line_height1 = this.getCSS(locator1, "line-height");
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			int getsubpixel1=Integer.parseInt(line_height_wopx1)-Integer.parseInt(font_size_wopx1);
			
			int getaddpixel=getsubpixel+getsubpixel1-Integer.parseInt("3");
			
			
			String getfinalvalue=getaddpixel+"px";
			System.out.println("Actual Result:" + getfinalvalue);
			Assert.assertEquals(TextSpace5Height, getfinalvalue);
		}

		catch (Exception ex) {
			System.out.println("Midas Training TextSpace5Height Exception>>Expected Result:13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Midas Training TextSpace5Height Error>>Expected Result:13px");
			count = count + 1;
		}			

		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	}
}
