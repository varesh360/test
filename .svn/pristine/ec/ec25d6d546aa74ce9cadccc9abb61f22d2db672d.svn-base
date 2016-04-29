package test.java.com.MusicGroup.pagehelper;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_ProductDetailPage_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_ProductDetailPage_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_ProductDetailPage.xml");
	
	}
	
	//Enter Behringer X32 Product name in serach field
	public void EnterProductName()
	
	{
	  String locator = locatorReader.getLocator("B2B_ProductDetailPage.EnterProductinSearchField");
		System.out.println("Locator"+locator);
		this.WaitForElementEnabled(locator, 50);
		String val = "BEHRINGER X32 COMPACT-UL";
		clickOn(locator);
		sendKeys(locator, val);
		presEnterKey(locator);
		
	}
	
	//Click Behringer x32 product on serach result page
	public void ClickBehringerx32Product()
	
	{
		
		String locator = locatorReader.getLocator("B2B_ProductDetailPage.ClickBehringerx32Product");
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
	
	//Reach upto B2BSearchField
	public void ReachUptoCreationHomePage()
	{
		//Click on Cartlink on B2BPage
		this.EnterProductName();
		//Click Behringer x32 product on serach result page
		this.ClickBehringerx32Product();
		//Check page not found
	this.checkPageNotFound();
		
	}
	public void verifyproductdetailpage(String vSpace1Heighth, String gap44width, String vSpace2heighth, String gutter87widthh, String fixedboxImagewidthhA, String fixedboxImageheighthA, String gutter27widthh, String Gutter45Width, String vspace13heighth,String vspace9heighth, String textspace5height, String textspace1height, String vSpace2Height, String gap17width,String gutter27Width, String vSpace23Height, String FixedBoxImageFWidth, String FixedBoxImageFHeight, String gap17Width)
	{
		
		ReachUptoCreationHomePage();
		int count = 0;
		// Verify vSpace1Height has the width of 70px .
				
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace1Heightabovebreadcrumb");
			String margin_top = this.getCSS(locator, "margin-top");
			
			System.out.println("Actual Result" +margin_top);
		    Assert.assertEquals(vSpace1Heighth,margin_top);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace1Height Exception>>Expected Margin: 70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace1Height Error>>Expected Margin:70px");
			count = count + 1;
		}

	
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace1Heightabovebreadcrumb");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			
			
			String locator1 = locatorReader.getLocator("B2B_ProductDetailPage.vspace1heightaboveproductimage");
			String padding_top = this.getCSS(locator1, "padding-top");
			
			
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			String padding_top_wopx = padding_top.substring(0, 2);
			
			
			
			int getaddpixel = Integer.parseInt(margin_bottom_wopx) + Integer.parseInt(padding_top_wopx)+Integer.parseInt("1");
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
		
			Assert.assertEquals(vSpace1Heighth,getfinalValue);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page gap44width Exception>>Expected Padding: 6px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page gap44width Error>>Expected Padding:6px");
			count = count + 1;
		}	
		
		//V2Space 2Hieght above product name
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace1Heightabovebreadcrumb");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
					
			String locator1 = locatorReader.getLocator("B2B_ProductDetailPage.vSpace2heightlocatorproductname");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			
			
			
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getsubbpixel = Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
			
			
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			
			
			
			int getaddpixel = Integer.parseInt(margin_bottom_wopx) + getsubbpixel;
			
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
		
			Assert.assertEquals(vSpace2heighth,getfinalValue);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace2heighth  Exception>>Expected Padding: 20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace2heighth Error>>Expected Padding:20px");
			count = count + 1;
		}
		
		// Verify gutter87widthh has the width of 50px(Image Right) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gap87Widthheight");
			String padding_right = this.getCSS(locator, "padding-right");
			
			System.out.println("Actual Result" +padding_right);
		    Assert.assertEquals(gutter87widthh,padding_right);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page gutter87width Exception>>Expected Gutter87Width: 50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page gutter87width Error>>Expected Gutter87Width:50px");
			count = count + 1;
		}	
			
		// Verify gutter87widthh has the width of 50px(Image Left) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gap87Widthheight");
			String padding_left = this.getCSS(locator, "padding-left");

			System.out.println("Actual Result" +padding_left);
		    Assert.assertEquals(gutter87widthh,padding_left);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page gutter87width Exception>>Expected Margin: 50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page gutter87width Error>>Expected Margin:50px");
			count = count + 1;
		}	
		
		// Verify gutter87widthh has the width of 50px(Padding bottom) (Issue).
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gap87Widthheight");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
		
			System.out.println("Actual Result" +padding_bottom);
		    Assert.assertEquals(gutter87widthh,padding_bottom);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page gutter87width Exception>>Expected Margin: 50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page gutter87width Error>>Expected Margin:50px");
			count = count + 1;
		}	
	
		// Verify Fixed Box Image has the height of 262px .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.fixedImageboxA");
			String height = this.getCSS(locator, "max-height");
			
			System.out.println("Actual Result" +height);
					
		    Assert.assertEquals(fixedboxImageheighthA,height);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page Fixed Box Image Exception>>Expected Height: 262px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page Fixed Box Image Error>>Expected Height:262px");
			count = count + 1;
		}
		// Verify Fixed Box Image has the width of 376px .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.fixedImageboxA");
			String width = this.getCSS(locator, "max-width");
			
			System.out.println("Actual Result" +width);
					
		    Assert.assertEquals(fixedboxImagewidthhA,width);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page fixedboxImagewidthhA Exception>>Expected Margin: 376px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page fixedboxImagewidthhA Error>>Expected Margin:376px");
			count = count + 1;
		}
		
		// Verify Gutter 27 Width of 15px .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gutter27widthgallerImage");
			String margin_right = this.getCSS(locator, "margin-right");
			
					
             String margin_right_wopx = margin_right.substring(0, 2);
			
			int getsubbpixel = Integer.parseInt(margin_right_wopx)+Integer.parseInt("3");
			
			String getfinalValue=getsubbpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
		
			
		    Assert.assertEquals(gutter27widthh,getfinalValue);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page gutter27widthh Exception>>Expected Gutter Space: 15px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page gutter27widthh Error>>Expected Gutter Space:15px");
			count = count + 1;
		}			
		// Verify vSpace1Height has the width of 70px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace1HeightBelowGalleryProduct");
			String padding_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("padding_bottom"+padding_bottom);
			System.out.println("Actual Result" +padding_bottom);
		    Assert.assertEquals(vSpace1Heighth,padding_bottom);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace1Height Exception>>Expected Margin: 70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace1Height Error>>Expected Margin:70px");
			count = count + 1;
		}

		
		// Verify vSpace1Height has the width of 70px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpave1HeightBelowImage");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("margin_bottom"+margin_bottom);
			String locator1 = locatorReader.getLocator("B2B_ProductDetailPage.vSpace1HeightAboveTextname");
			String margin_top= this.getCSS(locator1, "margin-top");
			System.out.println("margin_top"+margin_top);
			
			 String margin_bottom_wopx = margin_bottom.substring(0, 2);
			 String margin_top_wopx = margin_top.substring(0, 2);
				
			int getsubbpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(margin_top_wopx)-Integer.parseInt("1");
			String getfinalresult=getsubbpixel+"px";
			System.out.println("Actual Result" +getfinalresult);
		    Assert.assertEquals(vSpace1Heighth,getfinalresult);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace1Height Exception>>Expected Margin: 70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace1Height Error>>Expected Margin:70px");
			count = count + 1;
		}

		
		// Verify textSpace has the height of 22px .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.textSpace4Height");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String height = this.getCSS(locator, "height");
			System.out.println("------margin_bottom--------"+margin_bottom);
			System.out.println("------line_height--------"+line_height);
			System.out.println("------height--------"+height);
			
		/*	String locator1 = locatorReader.getLocator("B2B_ProductDetailPage.vSpace1HeightAboveTextname");
			String margin_top= this.getCSS(locator1, "margin-top");

			
			 String margin_bottom_wopx = margin_bottom.substring(0, 2);
			 String margin_top_wopx = margin_top.substring(0, 2);
				
			int getsubbpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(margin_top_wopx);
			String getfinalresult=getsubbpixel+"px";
			System.out.println("Actual Result" +getfinalresult);
		    Assert.assertEquals(vSpace1Heighth,getfinalresult);
			*/ 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace1Height Exception>>Expected Margin: 70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace1Height Error>>Expected Margin:70px");
			count = count + 1;
		}
		
		// Verify Gutter45Width has the width of 18px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.VSpaceGutter45Description");
			String margin_right = this.getCSS(locator, "padding-right");
			
			
			
			 String margin_right_wopx = margin_right.substring(0, 2);
							
			int getsubbpixel = Integer.parseInt(margin_right_wopx);
			String getfinalresult=getsubbpixel+"px";
			System.out.println("getfinalresult"+getfinalresult);
			System.out.println("Actual Result" +getfinalresult);
		    Assert.assertEquals(Gutter45Width,getfinalresult);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page Gutter45Width Exception>>Expected Margin: 18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page Gutter45Width Error>>Expected Margin:18px");
			count = count + 1;
		}
		// Verify Gutter45Width has the width of 18px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gutter45widthfirsttable");
			String padding_right = this.getCSS(locator, "padding-right");
			
			
			
			 String margin_right_wopx = padding_right.substring(0, 2);
							
			int getsubbpixel = Integer.parseInt(margin_right_wopx)+Integer.parseInt("3");
			String getfinalresult=getsubbpixel+"px";
			System.out.println("Actual Result" +getfinalresult);
		    Assert.assertEquals(Gutter45Width,padding_right);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page Gutter45Width Exception>>Expected Margin: 18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page Gutter45Width Error>>Expected Margin:18px");
			count = count + 1;
		}		
		
		// Verify Gutter45Width has the width of 18px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gutter45widthfirsttable");
			String padding_right = this.getCSS(locator, "padding-right");
			
			System.out.println("Actual Result" +padding_right);
		    Assert.assertEquals(Gutter45Width,padding_right);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page Gutter45Width Exception>>Expected Margin: 18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page Gutter45Width Error>>Expected Margin:18px");
			count = count + 1;
		}	
		
	// Verify Gutter45Width has the width of 18px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gutter45widthfirsttable");
			String padding_left = this.getCSS(locator, "padding-left");
			
			System.out.println("Actual Result" +padding_left);
		    Assert.assertEquals(Gutter45Width,padding_left);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page Gutter45Width Exception>>Expected Margin: 18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page Gutter45Width Error>>Expected Margin:18px");
			count = count + 1;
		}	
		// Verify vSpace13Height has the width of 22px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace13HeightAboveAvailabitytextin2col");
			String margin_top = this.getCSS(locator, "margin-top");
			
			String locator1 = locatorReader.getLocator("B2B_ProductDetailPage.vSpace13HeightAboveWeight");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			
			 String margin_right_wopx = margin_top.substring(0, 2);
			 String line_height_wopx = line_height.substring(0, 2);
			 String font_size_wopx = font_size.substring(0, 2);
				System.out.println("margin_right_wopx" +margin_right_wopx);
				System.out.println("line_height_wopx" +line_height_wopx);
				System.out.println("line_height_wopx" +line_height_wopx);
			

				int getsubbpixel = Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
				int getaddvalue=Integer.parseInt(margin_right_wopx)+getsubbpixel+Integer.parseInt("1");
				String getfinalvalue=getaddvalue+"px";

			    
			System.out.println("getfinalvalue"+getfinalvalue);
			System.out.println("Actual Result" +getfinalvalue);
		    Assert.assertEquals(vspace13heighth,getfinalvalue);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace13Height Exception>>Expected Margin: 22px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace13Height Error>>Expected Margin:22px");
			count = count + 1;
		}			

		// Verify vSpace13Height has the width of 22px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace13HeightAboveAvailabitytextin2col");
			String margin_top = this.getCSS(locator, "margin-bottom");

			String locator1 = locatorReader.getLocator("B2B_ProductDetailPage.vSpace13HeightAboveAvailablitytext");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");

			String margin_right_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);

			int getsubbpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			int getaddvalue = Integer.parseInt(margin_right_wopx)+ getsubbpixel;
			String getfinalvalue = getaddvalue + "px";

			System.out.println("Actual Result" + getfinalvalue);
			Assert.assertEquals(vspace13heighth, getfinalvalue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace13Height Exception>>Expected Margin: 22px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace13Height Error>>Expected Margin:22px");
			count = count + 1;
		}						

		// Verify textSpace5Height has the width of 13px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.textSpace5HeightAbovePrice");
			String margin_top = this.getCSS(locator, "margin-top");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");


			String locator1 = locatorReader.getLocator("B2B_ProductDetailPage.vSpace13HeightAboveAvailablitytext");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");

			String margin_right_wopx = margin_top.substring(0, 1);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			String line_height1_wopx = line_height1.substring(0, 2);
			String font_size1_wopx = font_size1.substring(0, 2);
			
			
			
			int getsubbpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			int getsubbpixel1 = Integer.parseInt(line_height1_wopx)- Integer.parseInt(font_size1_wopx);
			System.out.println("getSubPixel"+getsubbpixel);
			System.out.println("getsubbpixel1"+getsubbpixel1);
			int getaddvalue=getsubbpixel + getsubbpixel1 + Integer.parseInt(margin_right_wopx)-Integer.parseInt("1");
			
			String getFinalValue=getaddvalue+"px";
			System.out.println("Actual Result" + getFinalValue);
			Assert.assertEquals(textspace5height, getFinalValue);

			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page textSpace5Height Exception>>Expected Result: 13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page textSpace5Height Error>>Expected Result:13px");
			count = count + 1;
		}								

		// Verify textSpace5Height has the width of 13px .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.textSpace5HeightAbovePrice");
			String margin_top = this.getCSS(locator, "margin-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");



			String margin_right_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			
			System.out.println("margin_right_wopx"+margin_right_wopx);
			System.out.println("line_height_wopx"+line_height_wopx);
			System.out.println("font_size_wopx"+font_size_wopx);
			int getsubbpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			
			
			int getaddvalue=getsubbpixel +  Integer.parseInt(margin_right_wopx);
			String getFinalValue=getaddvalue+"px";
			
			System.out.println("Actual Result" + getFinalValue);
			Assert.assertEquals(textspace5height, getFinalValue);

			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page textSpace5Height Exception>>Expected Result: 13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page textSpace5Height Error>>Expected Result:13px");
			count = count + 1;
		}								

		// Verify textSpace5Height has the width of 13px .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.textSpace5Heightbelowinputbox");
			String margin_top = this.getCSS(locator, "margin-bottom");
						
			System.out.println("Actual Result" + margin_top);
			Assert.assertEquals(textspace5height, margin_top);

			}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page textSpace5Height Exception>>Expected Result: 13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page textSpace5Height Error>>Expected Result:13px");
			count = count + 1;
		}										
		
		// Verify vSpace7Height has the width of 17px .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace9Height");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
						
			System.out.println("Actual Result" + padding_bottom);
			Assert.assertEquals(vspace9heighth, padding_bottom);

			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vspace9heighth Exception>>Expected Result: 17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vspace9heighth Error>>Expected Result:17px");
			count = count + 1;
		}
		// Verify vSpace2Height has the width of 20px(Above support logo, Tech Support, more) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.VerifyVspace20TechSupport");
			String margin_top = this.getCSS(locator, "padding-top");
			System.out.println("Margin_Top"+margin_top);
						
			System.out.println("Actual Result" + margin_top);
			Assert.assertEquals(vSpace2heighth, margin_top);

			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Exception>>Expected Result: 20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Error>>Expected Result:20px");
			count = count + 1;
		}
		
		// Verify vSpace2Height has the width of 20px(Above support logo, Tech Support, more) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.verifyVspace2LogoUnderTech");
			String margin_top = this.getCSS(locator, "padding-bottom");
						System.out.println("margin_top"+margin_top);
						String margin_right_wopx = margin_top.substring(0, 2);
						
						
						
						int getaddvalue=Integer.parseInt(margin_right_wopx)+Integer.parseInt("3");
						String getFinalValue=getaddvalue+"px";
			System.out.println("Actual Result" + getFinalValue);
			Assert.assertEquals(vSpace2heighth, getFinalValue);

			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Exception>>Expected Result: 20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Error>>Expected Result:20px");
			count = count + 1;
		}		
		// Verify textSpace1Height has the width of 35px .
										
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.textSpace1Heightbelowproductname");
			String margin_top = this.getCSS(locator, "margin-bottom");
			



			String margin_right_wopx = margin_top.substring(0, 2);
		
			
			
			int getaddvalue=Integer.parseInt(margin_right_wopx)+Integer.parseInt("2");
			String getFinalValue=getaddvalue+"px";
			
			System.out.println("Actual Result" + getFinalValue);
			Assert.assertEquals(textspace1height, getFinalValue);

			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page textSpace1Height Exception>>Expected Result: 35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page textSpace1Height Error>>Expected Result:35px");
			count = count + 1;
		}
		
		// Verify textSpace14Height has the width of 50px .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.VerifyTextSpace15AboveBullets");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("margin_top"+margin_top);
			String margin_right_wopx = margin_top.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("B2B_ProductDetailPage.VerifyTextSpace15BulletsList");
			String font_size = this.getCSS(locator1, "font-size");
			String Line_height = this.getCSS(locator1, "line-height");
			System.out.println("font_size"+font_size);
			System.out.println("Line_height"+Line_height);
			String font_size_wopx = font_size.substring(0, 2);
			String Line_height_wopx = Line_height.substring(0, 2);
			int getsub1value=Integer.parseInt(Line_height_wopx)- Integer.parseInt(font_size_wopx);
			System.out.println("getsub1value"+getsub1value);
									
			
			int getaddvalue=Integer.parseInt(margin_right_wopx)+getsub1value+Integer.parseInt("1");
			System.out.println("getaddvalue"+getaddvalue);
			String getFinalValue=getaddvalue+"px";
			Assert.assertEquals(gutter87widthh, getFinalValue);
			
						
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page textSpace14Height Exception>>Expected Result: 50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page textSpace14Height Error>>Expected Result:50px");
			count = count + 1;
		}								
		// Verify textSpace1Height has the width of 35px .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.textSpace1Height");
			String margin_bottom = this.getCSS(locator, "padding-bottom");
			String line_height = this.getCSS(locator, "line-height");
			



			String  margin_bottom_wopx =  margin_bottom.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
		
			
			
			int getsubvalue=Integer.parseInt(line_height_wopx)-Integer.parseInt(margin_bottom_wopx);
			int getaddvalue=getsubvalue+Integer.parseInt(line_height_wopx)+Integer.parseInt("1");
			String getFinalValue=getaddvalue+"px";
			
			System.out.println("Actual Result" + getFinalValue);
			Assert.assertEquals(textspace1height, getFinalValue);

			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page textSpace1Height Exception>>Expected Result: 35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page textSpace1Height Error>>Expected Result:35px");
			count = count + 1;
		}
				
		// Verify vSpace1Height has the width of 70 (Image Gallery).
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace1HeightAboveImageGallery");
			String margin_top = this.getCSS(locator, "margin-top");
			
			System.out.println("Actual Result" +margin_top);
		    Assert.assertEquals(vSpace1Heighth,margin_top);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace1Height Exception>>Expected Margin: 70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace1Height Error>>Expected Margin:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has the width of 70px(Image Gallery) .
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace1HeightAboveImageGallery");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			
			System.out.println("Actual Result" +margin_bottom);
		    Assert.assertEquals(vSpace1Heighth,margin_bottom);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace1Height Exception>>Expected Margin: 70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace1Height Error>>Expected Margin:70px");
			count = count + 1;
		}
		// Verify vSpace2Height has the width of 20px(Releated Product) .
		
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace2HeightinReleatedProduct");
			String padding_top = this.getCSS(locator, "padding-top");
			
			System.out.println("Actual Result" +padding_top);
		    Assert.assertEquals(vSpace2Height,padding_top);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Exception>>Expected: 20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Error>>Expected:20px");
			count = count + 1;
		}	
		// Verify vSpace2Height has the width of 20px(Releated Product) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace2HeightinReleatedProduct");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			
			System.out.println("Actual Result" +padding_bottom);
		    Assert.assertEquals(vSpace2Height,padding_bottom);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Exception>>Expected: 20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Error>>Expected:20px");
			count = count + 1;
		}
		// Verify gap17width has the width of 20px(Releated Product) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace2HeightinReleatedProduct");
			String padding_right = this.getCSS(locator, "padding-right");
			
			System.out.println("Actual Result" +padding_right);
		    Assert.assertEquals(gap17width,padding_right);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Exception>>Expected: 20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Error>>Expected:20px");
			count = count + 1;
		}
		// Verify gap17width has the width of 20px(Releated Product) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace2HeightinReleatedProduct");
			String padding_left = this.getCSS(locator, "padding-left");
			
			System.out.println("Actual Result" +padding_left);
		    Assert.assertEquals(gap17width,padding_left);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page gap17width Exception>>Expected: 10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page gap17width Error>>Expected:10px");
			count = count + 1;
		}
		// Verify gap17width has the width of 20px(Releated Product) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gap17Width");
			String padding_right = this.getCSS(locator, "padding-right");
			
			System.out.println("Actual Result" +padding_right);
		    Assert.assertEquals(gap17width,padding_right);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page gap17width Exception>>Expected: 10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page gap17width Error>>Expected:10px");
			count = count + 1;
		}
		// Verify vSpace2Height has the width of 20px(Releated Product) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpaceHeightinreview");
			String padding_top = this.getCSS(locator, "padding-top");
			String padding_top_wopx = padding_top.substring(0, 2);
			
			int getaddvalue=Integer.parseInt(padding_top_wopx)+Integer.parseInt("4");
			String getFinalValue=getaddvalue+"px";
			
			System.out.println("Actual Result" + getFinalValue);
			  Assert.assertEquals(vSpace2Height,padding_top);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Exception>>Expected: 20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Error>>Expected:20px");
			count = count + 1;
		}	
		// Verify vSpace2Height has the width of 20px(Releated Product) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpaceHeightinreview");
			String padding_top = this.getCSS(locator, "padding-bottom");
						
			System.out.println("Actual Result" + padding_top);
			  Assert.assertEquals(vSpace2Height,padding_top);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Exception>>Expected: 20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace2Height Error>>Expected:20px");
			count = count + 1;
		}
		// Verify textspace5height has the width of 13px(Releated Product) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.VerifyTextSpace5InDescription");
			String margin_top = this.getCSS(locator, "line-height");
			String font_Size=this.getCSS(locator, "font-size");
			System.out.println("margin_top"+margin_top);
			String margin_top_wopx = margin_top.substring(0, 2);
			String font_Size_wopx = font_Size.substring(0, 2);
			int getPixel=Integer.parseInt(margin_top_wopx)-Integer.parseInt(font_Size_wopx);
			int getaddvalue=getPixel+getPixel+Integer.parseInt("1");
			String getFinalValue=getaddvalue+"px";
			System.out.println("getFinalValue"+getFinalValue);
			System.out.println("Actual Result" + getFinalValue);
			  Assert.assertEquals(textspace5height,getFinalValue);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page textSpace13height Exception>>Expected: 13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page textSpace13height Error>>Expected:13px");
			count = count + 1;
		}	
		// Verify Gutter27Width as the width of 15px(Image Gallery) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gutter27widthinimagegallery");
			String margin_right = this.getCSS(locator, "margin-right");
			
			System.out.println("Actual Result" + margin_right);
			  Assert.assertEquals(gutter27Width,margin_right);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page gutter27Width Exception>>Expected: 15px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page gutter27Width Error>>Expected:15px");
			count = count + 1;
		}	
		// Verify Gutter27Width as the width of 15px(Image Gallery) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gutter27widthinimagegallery");
			String margin_left = this.getCSS(locator, "margin-left");
			
			System.out.println("Actual Result" + margin_left);
			  Assert.assertEquals(gutter27Width,margin_left);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page gutter27Width Exception>>Expected: 15px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page gutter27Width Error>>Expected:15px");
			count = count + 1;
		}
		// Verify vSpace23Height as the width of 15px(Image Gallery) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gutter27widthinimagegallery");
			String margin_left = this.getCSS(locator, "margin-top");
			
			System.out.println("Actual Result" + margin_left);
			  Assert.assertEquals(vSpace23Height,margin_left);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace23Height Exception>>Expected: 15px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace23Height Error>>Expected:15px");
			count = count + 1;
		}
		// Verify vSpace23Height as the width of 15px(Image Gallery) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gutter27widthinimagegallery");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			
			System.out.println("Actual Result" + margin_bottom);
			  Assert.assertEquals(vSpace23Height,margin_bottom);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace23Height Exception>>Expected: 15px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace23Height Error>>Expected:15px");
			count = count + 1;
		}
		// Verify Fixed Image F as the width of 104px(Image Gallery) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gutter27widthinimagegallery");
			String max_width = this.getCSS(locator, "max-width");
			
			System.out.println("Actual Result" + max_width);
			Assert.assertEquals(FixedBoxImageFWidth,max_width);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page FixedBoxImageFWidth Exception>>Expected: 104px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page FixedBoxImageFWidth Error>>Expected:104px");
			count = count + 1;
		}	
		// Verify gap17width as the width of 10px(Image Gallery) .
	
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.gap17widthImageGallery");
			String max_right = this.getCSS(locator, "margin-right");
			System.out.println("max_right" + max_right);
			System.out.println("Actual Result" + max_right);
			Assert.assertEquals(gap17Width,max_right);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page gap17width Exception>>Expected: 10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page gap17width Error>>Expected:10px");
			count = count + 1;
		}
		
		// Verify gap17width as the width of 10px(Image Gallery) .
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.VerifyGap17UnderImageGallery");
			String margin_bottom = this.getCSS(locator, "margin-right");
			
			System.out.println("Actual Result" + margin_bottom);
			Assert.assertEquals(gap17Width,margin_bottom);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page gap17width Exception>>Expected: 10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page gap17width Error>>Expected:10px");
			count = count + 1;
		}		
		// Verify vSpace1Heighth has the width of 70px .
			
		try {
			String locator = locatorReader.getLocator("B2B_ProductDetailPage.vSpace1Heightfooter");
			String margin_top = this.getCSS(locator, "margin-top");
			String locator1 = locatorReader.getLocator("B2B_ProductDetailPage.vSpace2heightImageGallery");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
			String locator2 = locatorReader.getLocator("B2B_ProductDetailPage.vSpace1Heightfooter1");
			String margin_top1 = this.getCSS(locator2, "margin-top");

			String  margin_bottom_wopx =  margin_bottom.substring(0, 2);
			String margin_top_wopx = margin_top.substring(0, 2);
			String margin_top_wopx1 = margin_top1.substring(0, 1);
		
			System.out.println("margin_bottom_wopx" + margin_bottom_wopx);
			System.out.println("margin_top_wopx" + margin_top_wopx);
			System.out.println("margin_top_wopx1" + margin_top_wopx1);
			
			int getaddvalue=Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(margin_top_wopx)+Integer.parseInt(margin_top_wopx1)-Integer.parseInt("1");
			String getFinalValue=getaddvalue+"px";
			System.out.println("getaddvalue" + getaddvalue);
			System.out.println("Actual Result" + getFinalValue);
			Assert.assertEquals(vSpace1Heighth, getFinalValue);

			
		}

		catch (Exception ex) {
			System.out.println("B2B Product Detial Page vSpace1Heighth Exception>>Expected Result: 70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product Detial Page vSpace1Heighth Error>>Expected Result:70px");
			count = count + 1;
		}
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
		
		


