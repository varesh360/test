/*==============================================================================================================================
 File Name    : MG_Warranty_Helper.java
 ClassName    : MG_Warranty_Helper
 Summary      : Contains helping methods for MG_Warranty_Helper Page.
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

public class MG_Warranty_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public MG_Warranty_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("MG_Warranty.xml");
	}
	
		//Click on Menu icon 
		public void clickOnSupport()
		{
			String locator = locatorReader.getLocator("MGWarranty.ClickonSupport");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
		}
		
		//Click on KlarkTeknik Brand 
		public void clickOnBrand()
		{
			String locator = locatorReader.getLocator("MGWarranty.ClickBrand");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
		}
		
		//Click on product
		public void clickonWarrantyPage()
		{
			String locator = locatorReader.getLocator("MGWarranty.MenuIcon");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
		}
		
		//Click on MoreLink
		public void clickonMoreLink()
		{
			String locator = locatorReader.getLocator("MGWarranty.ClickonMoreLink");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
		}
		
		//Click on 3YearWarrantyLink
		public void clickon3YearWarrantyLink()
		{
			String locator = locatorReader.getLocator("MGWarranty.Clickon3YearWarranty");
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
		//Reach upto MG Warranty page
		public void ReachUptoWarrantyPage()
		{
			//Click on the Menu icon
			this.clickOnSupport();
			//Click on a brand
			this.clickOnBrand();
			//Click on a product
			this.clickonWarrantyPage();
			/*
			//Click on MoreLink
			this.clickonMoreLink();
			//Click on 3YearWarrantyLink
			this.clickon3YearWarrantyLink();
			*/
			//Check page not found
			this.checkPageNotFound();
		}
		
		//Verify MG Warranty page
		public void verifyMGWarrantyPage(String Vspace1height, String Textspace1height, String Textspace5height, String Textspace2height, String  fixedimageboxwidth, String fixedimageboxheight, String Textspace3height, String GutterA65width, String BlockListBwidth, String Gutter49width,String Gutter62width, String IndentionAWidth )
		{
			//Reach upto MG Warranty page
			ReachUptoWarrantyPage();
			int count = 0;
		
			//Verify VSpace1 has the height of 70px.
			try
			{
				String locator = locatorReader.getLocator("VerifyPixels.Vspace1height");
				String padding_top=this.getCSS(locator, "padding-top");
				String locator1 = locatorReader.getLocator("VerifyPixels.TextSpace1height");
				String line_height=this.getCSS(locator1, "line-height");
				String font_size=this.getCSS(locator1, "font-size");
				
				// Substring: To remove pixel(px text) from value
				String padding_top_wopx = padding_top.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String line_height_wopx = line_height.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
				
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+ getsubpixel-Integer.parseInt("2");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				
				
				Assert.assertEquals(Totalpixelvaluewithpixel, Vspace1height);
			}
			
			catch(Exception ex)
			{
				System.out.println("VSpace1 Expected height:70px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("VSpace1 Expected height:70px");
				count = count +1;
			}
			
			//Verify Text Space1 has the height of 35px.
			try
			{
				String locator = locatorReader.getLocator("VerifyPixels.TextSpace1height");
				String margin_bottom=this.getCSS(locator, "margin-bottom");
				String line_height=this.getCSS(locator, "line-height");
				String font_size=this.getCSS(locator, "font-size");
				String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace1Height");
				String line_height_1=this.getCSS(locator1, "line-height");
				String font_size_1=this.getCSS(locator1, "font-size");
				
				// Substring: To remove pixel(px text) from value
				String margin_bottom_wopx = margin_bottom.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String line_height_wopx = line_height.substring(0, 2);
				String line_height_1_wopx = line_height_1.substring(0, 2);
				String font_size_1_wopx = font_size_1.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx)-Integer.parseInt("2");
				int getsubpixel_1=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);
				
				int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel+getsubpixel_1;
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				Assert.assertEquals(Totalpixelvaluewithpixel, Textspace1height, "Text Space1 height is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			
			//Verify Text Space5 has the height of 13px.
			try
			{
				String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace1Height");
				String line_height_1=this.getCSS(locator1, "line-height");
				String font_size_1=this.getCSS(locator1, "font-size");
			
				
				// Substring: To remove pixel(px text) from value
				String line_height_1_wopx = line_height_1.substring(0, 2);
				String font_size_1_wopx = font_size_1.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);
			
				int Totaladdedpixel = getsubpixel+getsubpixel+Integer.parseInt("1");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
		
				Assert.assertEquals(Totalpixelvaluewithpixel, Textspace5height, "TextSpace5height height is not as per mock");	
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space5 Expected height:13px ");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Text Space5 Expected height:13px ");
				count = count +1;
			}
			//Verify Text Space1 has the height of 35px.
			try
			{
				String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1MainHeight");
				String line_height_1=this.getCSS(locator, "line-height");
				String font_size_1=this.getCSS(locator, "font-size");
				String margin_bottom=this.getCSS(locator, "margin-bottom");
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightAboveSecondText");
				String margin_top=this.getCSS(locator1, "margin-top");
				
				
				// Substring: To remove pixel(px text) from value
				String line_height_1_wopx = line_height_1.substring(0, 2);
				String font_size_1_wopx = font_size_1.substring(0, 2);
				String margin_bottom_wopx = margin_bottom.substring(0, 2);
				String margin_top_wopx = margin_top.substring(0, 1);
				
				int getsubpixel=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);
				int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+Integer.parseInt(margin_bottom_wopx)+getsubpixel+Integer.parseInt("2");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				Assert.assertEquals(Totalpixelvaluewithpixel, Textspace1height, "Text Space1 height is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			
					
			//Verify Text Space2 has the height of 23px.
			try
			{
				String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightAboveSecondText");
				String margin_bottom=this.getCSS(locator, "margin-bottom");
			
				String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace2Height");
				String margin_top=this.getCSS(locator1, "margin-top");
				
				
				// Substring: To remove pixel(px text) from value
				String margin_bottom_wopx = margin_bottom.substring(0, 2);
				String margin_top_wopx = margin_top.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(margin_bottom_wopx) +Integer.parseInt(margin_top_wopx);
				
				int Totaladdedpixel = getsubpixel+Integer.parseInt("1");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				//System.out.println("Actual Text Space2height:" + textSpace2height);
				Assert.assertEquals(Totalpixelvaluewithpixel, Textspace2height, "Text Space2 height is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space2 Expected height:23px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Text Space2 Expected height:23px");
				count = count +1;
			}
			//Verify Text Space3 has the height of 17px.
			try
			{
				String locator = locatorReader.getLocator("VerifyPixels.vTextSpace2TextHeight");
				String font_size=this.getCSS(locator, "font-size");
				String line_height=this.getCSS(locator, "line-height");
			
				
				// Substring: To remove pixel(px text) from value
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(line_height_wopx) -Integer.parseInt(font_size_wopx)-Integer.parseInt("3");
			
				int Totaladdedpixel = getsubpixel+getsubpixel-Integer.parseInt("1");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				Assert.assertEquals(Totalpixelvaluewithpixel, Textspace3height, "Text Space3 height is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space3 Expected height:17px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Text Space3 Expected height:17px");
				count = count +1;
			}
			
			//Again Verify text space2 height has the height of 23px.
			try
			{
				String locator = locatorReader.getLocator("VerifyPixels.vTextSpace2TextHeight");
				String padding_bottom=this.getCSS(locator, "padding-bottom");
				String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace2Text1Height");
				String line_height=this.getCSS(locator1, "line-height");
				String font_size=this.getCSS(locator1, "font-size");
			
				
				// Substring: To remove pixel(px text) from value
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String padding_bottom_wopx = padding_bottom.substring(0, 1);
				
				int getsubpixel=Integer.parseInt(line_height_wopx) -Integer.parseInt(font_size_wopx);
			
				int Totaladdedpixel = getsubpixel+Integer.parseInt(padding_bottom_wopx)+Integer.parseInt("5");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
			
				Assert.assertEquals(Totalpixelvaluewithpixel, Textspace2height, "Text Space2 height is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space2 Expected height:23px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Text Space2 Expected height:23px");
				count = count +1;
			}
			
			//Again Verify Text Space3 has the height of 17px.
			try
			{
				String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace2Text1Height");
				String line_height=this.getCSS(locator1, "line-height");
				String font_size=this.getCSS(locator1, "font-size");
				
				// Substring: To remove pixel(px text) from value
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(line_height_wopx) -Integer.parseInt(font_size_wopx);
				
				int Totaladdedpixel = getsubpixel+getsubpixel-Integer.parseInt("3");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				Assert.assertEquals(Totalpixelvaluewithpixel, Textspace3height, "Text Space3 height is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space3 Expected height:23px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Text Space3 Expected height:23px");
				count = count +1;
			}
			
			//Again Verify Text Space1 has the height of 35px.
			try
			{
				String locator = locatorReader.getLocator("VerifyPixels.vTextSpace2Text1Height");
				String margin_bottom=this.getCSS(locator, "margin-bottom");
				String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace2Text2Height");
				String line_height=this.getCSS(locator1, "line-height");
				String font_size=this.getCSS(locator1, "font-size");
				
				// Substring: To remove pixel(px text) from value
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String margin_bottom_wopx = margin_bottom.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(line_height_wopx) -Integer.parseInt(font_size_wopx);
			
				int Totaladdedpixel = getsubpixel+Integer.parseInt(margin_bottom_wopx)+Integer.parseInt("5");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				Assert.assertEquals(Totalpixelvaluewithpixel, Textspace1height, "Text Space1 height is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			
			//Again Verify Text Space1 has the height of 35px.
			try
			{
			
				String locator = locatorReader.getLocator("VerifyPixels.vTextSpace2Text2Height");
				String line_height=this.getCSS(locator, "line-height");
				String font_size=this.getCSS(locator, "font-size");
				String padding_bottom=this.getCSS(locator, "padding-bottom");
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace2TextBHeight");
				String line_height_1=this.getCSS(locator1, "line-height");
				String font_size_1=this.getCSS(locator1, "font-size");
				String margin_top_1=this.getCSS(locator1, "margin-top");
				
				// Substring: To remove pixel(px text) from value
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String padding_bottom_wopx = padding_bottom.substring(0, 1);
				String line_height_1_wopx = line_height_1.substring(0, 2);
				String font_size_1_wopx = font_size_1.substring(0, 2);
				String margin_top_1_wopx = margin_top_1.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(line_height_wopx) -Integer.parseInt(font_size_wopx)-Integer.parseInt("4");
				int getsubpixel_1=Integer.parseInt(line_height_1_wopx) -Integer.parseInt(font_size_1_wopx)-Integer.parseInt("1");
			
				int Totaladdedpixel = getsubpixel+getsubpixel_1+Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(margin_top_1_wopx);
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				Assert.assertEquals(Totalpixelvaluewithpixel, Textspace1height, "Text Space1 height is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			
			//Again Verify Text Space1 has the height of 35px.
			try
			{
			
				String locator = locatorReader.getLocator("VerifyPixels.vTextSpace2Text3Height");
				String line_height=this.getCSS(locator, "line-height");
				String font_size=this.getCSS(locator, "font-size");
			
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace2Text4Height");
				String line_height_1=this.getCSS(locator1, "line-height");
				String font_size_1=this.getCSS(locator1, "font-size");
				String margin_top_1=this.getCSS(locator1, "margin-top");
				
				// Substring: To remove pixel(px text) from value
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				String line_height_1_wopx = line_height_1.substring(0, 2);
				String font_size_1_wopx = font_size_1.substring(0, 2);
				String margin_top_1_wopx = margin_top_1.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(line_height_wopx) -Integer.parseInt(font_size_wopx)+Integer.parseInt("4");
				int getsubpixel_1=Integer.parseInt(line_height_1_wopx) -Integer.parseInt(font_size_1_wopx)+Integer.parseInt("1");
			
				int Totaladdedpixel = getsubpixel+getsubpixel_1+Integer.parseInt(margin_top_1_wopx);
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				Assert.assertEquals(Totalpixelvaluewithpixel, Textspace1height, "Text Space1 height is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			
			//Verify Fixed image box has the width of 236px and height of 243px.
			try
			{
				String locator = locatorReader.getLocator("VerifyPixels.Fixedimageboxheight");
				String height=this.getCSS(locator, "height");
			
				String width=this.getCSS(locator, "width");
		
		
				
				Assert.assertEquals(height, fixedimageboxheight );
				Assert.assertEquals(width, fixedimageboxwidth);
			}
			
			catch(Exception ex)
			{
				System.out.println("FixedBoximageheight Expected height:243px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("FixedBoximagewidth Expected width:236px");
				count = count +1;
			}
			
			//Verify Gutter62 has the width of 25px.
			try
			{
				String locator = locatorReader.getLocator("VerifyPixels.vGutter62Width");
				String padding_left=this.getCSS(locator, "padding-left");
		
				
				
				// Substring: To remove pixel(px text) from value
				String padding_left_wopx = padding_left.substring(0, 2);
				
				int Totaladdedpixel=Integer.parseInt(padding_left_wopx)+Integer.parseInt("4");
				
				
				String Totalpixelvaluewithpixel = Totaladdedpixel +"px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				Assert.assertEquals(GutterA65width, Totalpixelvaluewithpixel);
			
			}
			
			catch(Exception ex)
			{
				System.out.println("Gutter62 width Expected height:25px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Gutter62 width Expected height:25px");
				count = count +1;
			}
			
			//Verify GutterA has the width of 27px.
			try
			{
				String locator = locatorReader.getLocator("VerifyPixels.vGutterAWidth");
				String padding_left=this.getCSS(locator, "padding-left");
				
				
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vGutter62Width");
				String padding_left_1=this.getCSS(locator1, "padding-left");

				
				// Substring: To remove pixel(px text) from value
				String padding_left_wopx = padding_left.substring(0, 1);
				String padding_left_1_wopx = padding_left_1.substring(0, 2);
				int Totaladdedpixel=Integer.parseInt(padding_left_wopx)+Integer.parseInt(padding_left_1_wopx)+Integer.parseInt("6");
	
				
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				Assert.assertEquals(Gutter62width, Totalpixelvaluewithpixel);
			}
			
			catch(Exception ex)
			{
				System.out.println("GutterA_width Expected width:27px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("GutterA_width Expected width:27px");
				count = count +1;
			}
			
		//Verify 
			
			/*
			//Verify Fixed image box has the width of 236px and height of 243px.
			try
			{
				String Fixedimageboxheight = this.getCSS("VerifyPixels.Fixedimageboxheight", "height");
				String Fixedimageboxwidth = this.getCSS("VerifyPixels.Fixedimageboxheight", "width");
				System.out.println("Actual Fixed image box:" + Fixedimageboxheight);
				Assert.assertEquals(Fixedimageboxheight, fixedimageboxheight, "Fixedimageboxheight is as per mock");
				Assert.assertEquals(Fixedimageboxwidth, fixedimageboxwidth, "Fixedimageboxwidth is as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("FixedBoximageheight Expected height:243px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("FixedBoximagewidth Expected width:236px");
				count = count +1;
			}
			
			
			//Again Verify Text Space3 has the height of 17px.
			try
			{
				String textSpace3Height = this.getCSS("VerifyPixels.TextSpace3Height", "line-height");
				System.out.println("Actual Text Space3height:" + textSpace3Height);
				Assert.assertEquals(textSpace3Height, Textspace3height, "Text Space3 height is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space3 Expected height:23px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Text Space3 Expected height:23px");
				count = count +1;
			}
			//Again Verify Text Space1 has the height of 35px.
			try
			{
				String vspace1height = this.getCSS("VerifyPixels.VSpace1height", "margin-top");
				System.out.println("Actual Text vSpace1Height:" + vspace1height);
				Assert.assertEquals(vspace1height, Textspace1height, "Text Space1 height is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			//Again Verify Text Space1 has the height of 35px.
			try
			{
				String vspace1Height = this.getCSS("VerifyPixels.VSpace1Height", "margin-top");
				System.out.println("Actual Text vSpace1Height:" + vspace1Height);
				Assert.assertEquals(vspace1Height, Textspace1height, "Text Space1 height is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Text Space1 Expected height:35px");
				count = count +1;
			}
			//Verify GutterA has the width of 27px.
			try
			{
				String bnGutterAwidth = this.getCSS("VerifyPixels.GutterAwidth", "width");
				System.out.println("Actual bnGutterAwidth:" + bnGutterAwidth);
				Assert.assertEquals(bnGutterAwidth, GutterA65width, "bnGutter2width height/width is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("GutterA_width Expected width:27px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("GutterA_width Expected width:27px");
				count = count +1;
			}
			//Verify BlockListB has the width of 150px.
			try
			{
				String blockListB = this.getCSS("VerifyPixels.BlockListB", "width");
				System.out.println("Actual BlockListB:" + blockListB);
				Assert.assertEquals(blockListB, BlockListBwidth, "BlockListB width is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("BlockListB_width Expected width:150px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("BlockListB_width Expected width:150px");
				count = count +1;
			}
			//Verify Gutter49 has the width of 37px.
			try
			{
				String gutter49width = this.getCSS("VerifyPixels.Gutter49width", "width");
				System.out.println("Actual gutter49width:" + gutter49width);
				Assert.assertEquals(gutter49width, Gutter49width, "gutter49width width is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Gutter49_width Expected width:27px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Gutter49_width Expected width:27px");
				count = count +1;
			}
			//Verify IndentionA has the width of 90px.
			try
			{
				String bnIndentionAwidth = this.getCSS("VerifyPixels.IndentionAwidth", "padding-left");
				System.out.println("Actual IndentionAwidth:" + bnIndentionAwidth);
				Assert.assertEquals(bnIndentionAwidth, IndentionAWidth, "IndentionAwidth is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("IndentionA_width Expected width:90px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("IndentionA_width Expected width:90px");
				count = count +1;
			}
			//Verify Gutter62 has the width of 25px.
			try
			{
				String gutter62width = this.getCSS("VerifyPixels.Gutter62width", "right");
				System.out.println("Actual gutter62width:" + gutter62width);
				Assert.assertEquals(gutter62width, Gutter62width, "gutter62width width is not as per mock");
			}
			
			catch(Exception ex)
			{
				System.out.println("Gutter62_width Expected width:25px");
				count = count +1;
			}
			catch(Error ex)
			{
				System.out.println("Gutter62_width Expected width:25px");
				count = count +1;
			}
			*/
			//Verify the final result
			System.out.println("count value is :::" + count);
			Assert.assertTrue(count==0);					
		}				
}

	