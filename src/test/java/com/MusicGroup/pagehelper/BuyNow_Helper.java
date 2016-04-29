/*==============================================================================================================================
 File Name    : BuyNow_Helper.java
 ClassName    : BuyNow_Helper
 Summary      : Contains helping methods for BuyNow_Helper Page.
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

public class BuyNow_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public BuyNow_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("Buy_Now.xml");
	}

	//Click on Menu icon 
	public void clickMenuIcon()
	{
		String locator = locatorReader.getLocator("BuyNow.MenuIcon");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	//Click on Brand Behringer
	public void clickonBrandBehringer()
	{
		String locator = locatorReader.getLocator("BuyNow.ClickBrandBehringer");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	//Click on First product
	public void clickonFirstproduct()
	{
		String locator = locatorReader.getLocator("BuyNow.ClickonProduct");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	//Click on Buy Now
	public void clickonBuyNow()
	{
		String locator = locatorReader.getLocator("BuyNow.Buy_Now");
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
	//Reach upto Buy Now(Behringer)
	public void ReachUptoBuyNowPage()
	{
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on a brand
		this.clickonBrandBehringer();
		//Click on Buy Now
		this.clickonBuyNow();
		//Check page not found
		this.checkPageNotFound();
	}
	
	//Verify Buy Now page
	public void verifyBuyNowPage(String vSpace1height, String textspace1height, String textspace5height, String gutter2width, String  fixedimageboxwidth, String fixedimageboxheight, String vspace15Height, String textspace9height, String indentionBWidth, String textFieldwidth)
	{
		//Reach upto Buy Now page(Behringer)
		ReachUptoBuyNowPage();
		int count = 0;
		
		// Verify vSpace1Height has the height of 70px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Heightabovestorelocation");
			this.WaitForElementPresent(locator, 30);
			String margin_top = this.getCSS(locator, "margin-top");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			// Substring: To remove pixel(px text) from value
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("2");
			
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel;
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace1height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace1Height Exception>>Expected Margin Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace1Height Error>>Expected Width:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has the height of 70px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Heightabovestorelocation");
			String padding_bottom = this.getCSS(locator, "padding-bottom");

			System.out.println("Actual result" + padding_bottom);
			Assert.assertEquals(vSpace1height, padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace1Height Exception>>Expected Margin Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace1Height Error>>Expected Width:70px");
			count = count + 1;
		}
		// Verify TextSpace1Height has the height of 35px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.TextSpace1Height");
			String margin_top = this.getCSS(locator, "margin-top");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			// Substring: To remove pixel(px text) from value
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("1");
			
			String locator1 = locatorReader.getLocator("VerifyPixels.TextSpace1Height1");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			
			// Substring: To remove pixel(px text) from value
			
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1)+Integer.parseInt("8");

			
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel+getsubpixel1;
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(textspace1height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page textspace1height Exception>>Expected Result:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page textspace1height Error>>Expected Result:35px");
			count = count + 1;
		}
		// Verify gutter2width has the width of 80px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.gap2width");
			String margin_left = this.getCSS(locator, "margin-left");

			System.out.println("Actual result" + margin_left);
			Assert.assertEquals(gutter2width, margin_left);
		}

		catch (Exception ex) {
			System.out.println("Partner Page gutter2width Exception>>Expected Result:80px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page gutter2width Error>>Expected Result:80px");
			count = count + 1;
		}
		// Verify fixedimageboxheight has the width of 80px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.fixedimageheight");
			String height = this.getCSS(locator, "height");

			System.out.println("Actual result" +height);
			Assert.assertEquals(fixedimageboxheight, height);
		}

		catch (Exception ex) {
			System.out.println("Partner Page fixedimageboxheight Exception>>Expected Result:250px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page fixedimageboxheight Error>>Expected Result:250px");
			count = count + 1;
		}
		// Verify fixedivspace15Height has the height of 25px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace15Height");
			String margin_top = this.getCSS(locator, "margin-top");

			System.out.println("Actual result" +margin_top);
			Assert.assertEquals(vspace15Height, margin_top);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vspace15Height Exception>>Expected Result:25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vspace15Height Error>>Expected Result:25px");
			count = count + 1;
		}
		// Verify fixedivspace15Height has the height of 25px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace15Height");
			String padding_bottom = this.getCSS(locator, "padding-bottom");

			System.out.println("Actual result" +padding_bottom);
			Assert.assertEquals(vspace15Height, padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vspace15Height Exception>>Expected Result:25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vspace15Height Error>>Expected Result:25px");
			count = count + 1;
		}
		//verify vSpace1Height has the height of 70px
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Heightabovelocationtable");
			String margin_top = this.getCSS(locator, "margin-top");
			
			// Substring: To remove pixel(px text) from value
			String margin_top_wopx = margin_top.substring(0, 2);
						
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1Heightabovelocationtable1");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			
			// Substring: To remove pixel(px text) from value
			
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);

			
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel1;
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace1height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace1height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace1height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify textFieldwidth has the width of 250px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.textfieldwidth");
			String width = this.getCSS(locator, "width");
           	System.out.println("Actual result" +width);
			Assert.assertEquals(textFieldwidth, width);
		}

		catch (Exception ex) {
			System.out.println("Partner Page textFieldwidth Exception>>Expected Result:250px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page textFieldwidth Error>>Expected Result:250px");
			count = count + 1;
		}
		// Verify indentionBWidth has the width of 250px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.textfieldwidth");
			String margin_left = this.getCSS(locator, "margin-left");
           	System.out.println("Actual result" +margin_left);
			Assert.assertEquals(indentionBWidth, margin_left);
		}

		catch (Exception ex) {
			System.out.println("Partner Page indentionBWidth Exception>>Expected Result:76px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page indentionBWidth Error>>Expected Result:76px");
			count = count + 1;
		}
		// Verify textFieldwidth has the width of 250px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.textfieldwidth2");
			String width = this.getCSS(locator, "width");
           	System.out.println("Actual result" +width);
			Assert.assertEquals(textFieldwidth, width);
		}

		catch (Exception ex) {
			System.out.println("Partner Page textFieldwidth Exception>>Expected Result:250px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page textFieldwidth Error>>Expected Result:250px");
			count = count + 1;
		}
		// Verify indentionBWidth has the width of 250px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.textfieldwidth2");
			String margin_left = this.getCSS(locator, "margin-left");
           	System.out.println("Actual result" +margin_left);
			Assert.assertEquals(indentionBWidth, margin_left);
		}

		catch (Exception ex) {
			System.out.println("Partner Page indentionBWidth Exception>>Expected Result:76px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page indentionBWidth Error>>Expected Result:76px");
			count = count + 1;
		}
		// Verify textFieldwidth has the width of 250px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.textfieldwidth3");
			String width = this.getCSS(locator, "width");
           	System.out.println("Actual result" +width);
			Assert.assertEquals(textFieldwidth, width);
		}

		catch (Exception ex) {
			System.out.println("Partner Page textFieldwidth Exception>>Expected Result:250px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page textFieldwidth Error>>Expected Result:250px");
			count = count + 1;
		}
		// Verify indentionBWidth has the width of 250px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.textfieldwidth3");
			String margin_left = this.getCSS(locator, "margin-left");
           	System.out.println("Actual result" +margin_left);
			Assert.assertEquals(indentionBWidth, margin_left);
		}

		catch (Exception ex) {
			System.out.println("Partner Page indentionBWidth Exception>>Expected Result:76px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page indentionBWidth Error>>Expected Result:76px");
			count = count + 1;
		}
		// Verify textspace9height has the height of 8px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.TextSpace9Height");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("1");

			
			String locator1 = locatorReader.getLocator("VerifyPixels.TextSpace9Height1");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			
			// Substring: To remove pixel(px text) from value
			
			String line_height_wopx1 = line_height1.substring(0, 2);
			String font_size_wopx1 = font_size1.substring(0, 2);
			
			int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1)+Integer.parseInt("1");

			
			int Totaladdedpixel = getsubpixel+ getsubpixel1;
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(textspace9height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page textspace9height Exception>>Expected Result:8px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page textspace9height Error>>Expected Result:8px");
			count = count + 1;
		}

		// Verify vSpace1Height has the height of 70px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1Heightfooter");
			String margin_top = this.getCSS(locator, "margin-top");

			System.out.println("Actual result" + margin_top);
			Assert.assertEquals(vSpace1height, margin_top);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		// Verify textspace5height has the height of 13px.
		try {
			String locator = locatorReader.getLocator("VerifyPixels.TextSpace1Height");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			// Substring: To remove pixel(px text) from value
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("2");
			
			int Totaladdedpixel = Integer.parseInt("9")+ getsubpixel;
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(textspace5height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page textspace5height Exception>>Expected Result:13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page textspace5height Error>>Expected  result:13px");
			count = count + 1;
		}	
		
				//Verify Buy Now link is available
		//Verify the final result
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);	
	}	
	
	//Verify Store Locator page
	public void verifyStoreLocatorPage(String vSpace1height,String vSpace4height, String textField11width, String textField11height,  String textField10width, String textField10height, String vSpace2height, String iconwidth, String iconheight, String FixedBowwidth, String FixedBowheight, String gutter9width, String textSpaceheight, String vSpace3Height, String subheadLeading)
	{
		//Reach upto Buy Now page(Behringer)
		ReachUptoBuyNowPage();
		int count = 0;
		//Verify Buy Now link is available
		this.WaitForElementPresent(locatorReader.getLocator("BuyNow.Buy_Now"), 5);
		Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("BuyNow.Buy_Now")));
		waitForElementLoad(20);
		//Verify VSpace1 has the height of 70px.
		try
		{
			String bnvSpace1height = this.getCSS("VerifyPixels.bnvSpace1height", "margin-top");
			System.out.println("Actual VSpace1height:" + bnvSpace1height);
			Assert.assertEquals(bnvSpace1height, vSpace1height, "V Space 1 height is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("V Space 1>>Expected height:70px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Space 1>>Expected height:70px");
			count = count +1;
		}
		//Verify Text Space1 has the height of 35px.
		try
		{
			String bnvTextSpace1height = this.getCSS("VerifyPixels.bnvTextSpace1height", "margin-bottom");
			System.out.println("Actual Text Space1height:" + bnvTextSpace1height);
			Assert.assertEquals(bnvTextSpace1height, vSpace4height, "Text Space1 height is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("Text Space1>>Expected height:35px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Text Space1>>Expected height:35px");
			count = count +1;
		}
		//Verify Text Space5 has the height of 13px.
		try
		{
			String bntextSpace5height = this.getCSS("VerifyPixels.bntextSpace5height", "height");
			System.out.println("Actual dctextField11width:" + bntextSpace5height);
			Assert.assertEquals(bntextSpace5height, textField11width, "bntextSpace5height height is not as per mock");	
		}
		
		catch(Exception ex)
		{
			System.out.println("Text Space5>>Expected height:13px ");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Text Space5>>Expected height:13px ");
			count = count +1;
		}
		//Verify Gutter2 has the width of 80px.
		try
		{
			String bnGutter2width = this.getCSS("VerifyPixels.bnGutter2width", "width");
			System.out.println("Actual dctextField10width:" + bnGutter2width);
			Assert.assertEquals(bnGutter2width, textField10width, "bnGutter2width height/width is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("Field 10>>Expected height:40px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Field 10>>Expected height:40px");
			count = count +1;
		}
		//Verify Fixed image box has the width of 450px and height of 250px.
		try
		{
			String bnFixedimageboxheight = this.getCSS("VerifyPixels.bnFixedimageboxheight", "padding-bottom");
			System.out.println("Actual dcvSpace2height:" + bnFixedimageboxheight);
			Assert.assertEquals(bnFixedimageboxheight, vSpace2height, "bnFixedimageboxheight is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("V Space 2>>Expected height:40px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Space 2>>Expected height:40px");
			count = count +1;
		}
		//Verify VSpace1 has the height of 70px.
		try
		{
			String bnVSpace1height = this.getCSS("VerifyPixels.bnVSpace1height", "margin-top");
			System.out.println("Actual dcvSpace1height:" + bnVSpace1height);
			Assert.assertEquals(bnVSpace1height, vSpace1height, "V Space 1 height is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("V Space 1>>Expected height:50px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Space 1>>Expected height:50px");
			count = count +1;
		}
		//Verify VSpace15 has the height of 25px.
		try
		{
			String bnVSpace15height = this.getCSS("VerifyPixels.bnVSpace15height", "height");
			System.out.println("Actual dciconheight:" + bnVSpace15height);
			Assert.assertEquals(bnVSpace15height, iconheight, "Icon height/width is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("Icon Width>>Expected Width:34px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Icon Width>>Expected Width:34px");
			count = count +1;
		}
		//Again Verify VSpace1 has the height of 70px.
		try
		{
			String bnVSpace1height = this.getCSS("VerifyPixels.bnVSpace1height", "height");
			System.out.println("Actual dcFixedBowheight:" + bnVSpace1height);
			Assert.assertEquals(bnVSpace1height, FixedBowheight, "Fixed Bow height/width is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("Fixed Bow Image>>Expected height:20px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Fixed Bow Image>>Expected height:20px");
			count = count +1;
		}
		//Again verify VSpace15 has the height of 25px.
		try
		{
			String bnVSpace15height = this.getCSS("VerifyPixels.bnVSpace15height", "margin-left");
			System.out.println("Actual dcgutter9width:" + bnVSpace15height);
			Assert.assertEquals(bnVSpace15height, gutter9width, "bnVSpace15height is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("V Space4>>Expected height:20px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V Space4>>Expected height:20px");
			count = count +1;
		}
		//Verify IndentionB has the width of 76px.
		try
		{
			String bnIndentionBwidth = this.getCSS("VerifyPixels.bnIndentionBwidth", "padding-top");
			System.out.println("Actual dctextSpaceheight:" + bnIndentionBwidth);
			Assert.assertEquals(bnIndentionBwidth, textSpaceheight, "bnIndentionBwidth is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("Text Space>>Expected height:13px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Text Space>>Expected height:13px");
			count = count +1;
		}
		//Verify text Space9 has the height of 8px.
		try
		{
			String bnSpace9Height = this.getCSS("VerifyPixels.bnSpace9Height", "padding-top");
			System.out.println("Actual dcvSpace3Height:" + bnSpace9Height);
			Assert.assertEquals(bnSpace9Height, vSpace3Height, "bnSpace9Height is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("V_Space3>>Expected width:257px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("V_Space3>>Expected height:13px");
			count = count +1;
		}
		//Verify Text Field has the width of 251px and height as variable.
		try
		{
			String bnTextFieldwidth = this.getCSS("VerifyPixels.bnTextFieldwidth", "margin-bottom");
			System.out.println("Actual dcsubheadLeading:" + bnTextFieldwidth);
			Assert.assertEquals(bnTextFieldwidth, subheadLeading, "bnTextFieldwidth is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("bnTextFieldwidth>>Expected width:251px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("bnTextFieldwidth>>Expected width:251px");
			count = count +1;
		}
		//Again Verify VSpace 1 has the height of 70px.
		try
		{
			String bnVSpace1 = this.getCSS("VerifyPixels.bnVSpace1", "margin-bottom");
			System.out.println("Actual dcsubheadLeading:" + bnVSpace1);
			Assert.assertEquals(bnVSpace1, subheadLeading, "bnVSpace1 height is not as per mock");
		}
		
		catch(Exception ex)
		{
			System.out.println("Subhead leading>>Expected height:13px");
			count = count +1;
		}
		catch(Error ex)
		{
			System.out.println("Subhead leading>>Expected height:13px");
			count = count +1;
		}

		//Verify the final result
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);	
	}	
}
