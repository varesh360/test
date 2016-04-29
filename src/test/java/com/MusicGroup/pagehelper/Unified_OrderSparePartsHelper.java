package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class Unified_OrderSparePartsHelper extends DriverHelper {
	private LocatorReader locatorReader;

	public Unified_OrderSparePartsHelper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("Unified_OrderSpareParts.xml");
	
	}
	//Click on Menu icon 
			public void ClickSupportLink()
			{
				String locator = locatorReader.getLocator("UnifiedOrderSparePart.ClickSupportMenu");
				this.WaitForElementEnabled(locator, 50);
				clickOn(locator);
			}
			
			//Click on Brand Midas
			public void clickonMidas()
			{
				String locator = locatorReader.getLocator("UnifiedOrderSparePart.ClickMidasLogo");
				this.WaitForElementEnabled(locator, 50);
				clickOn(locator);
			}
			
			// click on Training link on search result page
			public void ClickonOrderSpareLink() {
				String locator = locatorReader.getLocator("UnifiedOrderSparePart.ClickOrderSpare");
				this.WaitForElementEnabled(locator, 50);
				clickOn(locator);
				this.WaitForElementEnabled(locator, 50);
				System.out.println(" Click Order Spare Link");

			}
			
			// click on Training link on search result page
			public void ClickNoONPopup() {
				
				//acceptAlertdismiss();
			  String locator = locatorReader.getLocator("UnifiedOrderSparePart.ClickNoButtton");
				this.WaitForElementEnabled(locator, 50);
				clickOn(locator);
				this.WaitForElementEnabled(locator, 50);
				
				
			/*
				
				Alert alert = driver.switchTo().alert();
		        alert.dismiss();
				System.out.println(" Click No on Popup");
				
				*/

			}

			//Check Page not found
			public void checkPageNotFound()
			{
				String actualTitle1 = driver.getTitle();
				System.out.println("Get Titile"+ actualTitle1);
				String expectedTitle1 = "Not Found | MUSIC Group";
				Assert.assertFalse(actualTitle1==expectedTitle1);

				
			}
			//Reach upto Order Sport Page
			public void ReachUptoOrderSportPage()
			{
				//Click on the Menu icon
				this.ClickSupportLink();
				//Click on a brand
				this.clickonMidas();
				//Click on a product
				this.ClickonOrderSpareLink();
				
				//Click No on Popup
				this.ClickNoONPopup();
				//Check page not found
				this.checkPageNotFound();
			}
			public void ReachUpAuthorizedPartnerPagePopup()
			{
				//Click on the Menu icon
				this.ClickSupportLink();
				//Click on a brand
				this.clickonMidas();
				//Click on a product
				this.ClickonOrderSpareLink();
				
							//Check page not found
				this.checkPageNotFound();
			}	
			public void orderspareparts(String vSpace1Height,String TextSpace1Height, String vSpace4Height, String vSpace14Height, String vSpace2Height,String vSpace23Height,String Gutter21Width, String vSpace3Height)
			{
				
				ReachUptoOrderSportPage();
				int count = 0;
				
				// Verify vSpace1Height has the height of 70px.
				
				try {
					String locator = locatorReader.getLocator("VerifyPixels.vSpace1Height");
					String margin_top = this.getCSS(locator, "margin-top");
					String line_height = this.getCSS(locator, "line-height");
					String font_size = this.getCSS(locator, "font-size");
								
					// Substring: To remove pixel(px text) from value
					String margin_top_wopx = margin_top.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
					int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel+Integer.parseInt("8");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(vSpace1Height, Totalpixelvaluewithpixel);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace1Height Exception>>Expected Margin Top:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace1Height Error>>Expected Width:70px");
					count = count + 1;
				}
				// Verify TextSpace1Height has the height of 35px.
				try {
					String locator = locatorReader.getLocator("VerifyPixels.vSpace1Height");
					String margin_top = this.getCSS(locator, "margin-bottom");
					String line_height = this.getCSS(locator, "line-height");
					String font_size = this.getCSS(locator, "font-size");
								
					// Substring: To remove pixel(px text) from value
					String margin_top_wopx = margin_top.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
					int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
					
					String locator1 = locatorReader.getLocator("VerifyPixels.textSpace1Height");
					String line_height1 = this.getCSS(locator1, "line-height");
					String font_size1 = this.getCSS(locator1, "font-size");
								
					// Substring: To remove pixel(px text) from value
					String line_height_wopx1 = line_height1.substring(0, 2);
					String font_size_wopx1 = font_size1.substring(0, 2);
					int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
					
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel+getsubpixel1+Integer.parseInt("3");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(TextSpace1Height, Totalpixelvaluewithpixel);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup TextSpace1Height Exception>>Expected Margin Top:35px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup TextSpace1Height Error>>Expected Width:35px");
					count = count + 1;
				}
				
           // Verify vSpace1Height has the height of 70px.(Below Paragraph)
				
				try {
					String locator = locatorReader.getLocator("VerifyPixels.textSpace1Height");
					String margin_top = this.getCSS(locator, "margin-bottom");
					String line_height = this.getCSS(locator, "line-height");
					String font_size = this.getCSS(locator, "font-size");
					String padding_bottom = this.getCSS(locator, "padding-bottom");

								
					// Substring: To remove pixel(px text) from value
					String margin_top_wopx = margin_top.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
					String padding_bottom_wopx = padding_bottom.substring(0, 1);
					
					int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+Integer.parseInt(padding_bottom_wopx)+ getsubpixel-Integer.parseInt("3");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(vSpace1Height, Totalpixelvaluewithpixel);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace1Height Exception>>Expected Margin Top:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace1Height Error>>Expected Width:70px");
					count = count + 1;
				}
				
				try {
					
					
				}
				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace4Height Exception>>Expected Margin Top:40px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace4Height Error>>Expected Width:40px");
					count = count + 1;
				}
				// Verify vSpace4Height has the height of 40px.
				try {
					String locator = locatorReader.getLocator("VerifyPixels.vSpace4Height");
					String margin_top = this.getCSS(locator, "padding-top");
					
					// Substring: To remove pixel(px text) from value
					String margin_top_wopx = margin_top.substring(0, 2);
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4Height1");
					String line_height1 = this.getCSS(locator1, "line-height");
					String font_size1 = this.getCSS(locator1, "font-size");
								
					// Substring: To remove pixel(px text) from value
					String line_height_wopx1 = line_height1.substring(0, 2);
					String font_size_wopx1 = font_size1.substring(0, 2);
					int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
					
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+getsubpixel1-Integer.parseInt("2");
					String Totalpixelvaluewithpixel = Totaladdedpixel+"px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					System.out.println("Actual result" + vSpace4Height);
					Assert.assertEquals(Totalpixelvaluewithpixel, vSpace4Height);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace4Height Exception>>Expected Margin Top:40px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace4Height Error>>Expected Width:40px");
					count = count + 1;
				}
				
			/*	// Verify vSpace4Height has the height of 40px.
				try {
					String locator = locatorReader.getLocator("VerifyPixels.vSpace4Height");
					String margin_top = this.getCSS(locator, "margin-top");
					
					// Substring: To remove pixel(px text) from value
					String margin_top_wopx = margin_top.substring(0, 2);
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace2HeightBelowLanguage1");
					String line_height1 = this.getCSS(locator1, "line-height");
					String font_size1 = this.getCSS(locator1, "font-size");
								
					// Substring: To remove pixel(px text) from value
					String line_height_wopx1 = line_height1.substring(0, 2);
					String font_size_wopx1 = font_size1.substring(0, 2);
					int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
					
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+getsubpixel1-Integer.parseInt("2");
					String Totalpixelvaluewithpixel = Totaladdedpixel+"px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					System.out.println("Actual result                   " + vSpace4Height);
					Assert.assertEquals(Totalpixelvaluewithpixel, vSpace4Height);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace4Height Exception>>Expected Margin Top:40px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace4Height Error>>Expected Width:40px");
					count = count + 1;
				}
*/
				// Verify vSpace14Height has the height of 14px.
				try {
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace14HeightLastName");
					String line_height1 = this.getCSS(locator1, "line-height");
					String font_size1 = this.getCSS(locator1, "font-size");
								
					// Substring: To remove pixel(px text) from value
					String line_height_wopx1 = line_height1.substring(0, 2);
					String font_size_wopx1 = font_size1.substring(0, 2);
					int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
					
					int Totaladdedpixel = getsubpixel1-Integer.parseInt("1");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(Totalpixelvaluewithpixel, vSpace14Height);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace14Height Exception>>ExpectedResult:10px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace14Height Error>>Expected Result:10px");
					count = count + 1;
				}
				// Verify vSpace2Height has the height of 20px.
				try {
					String locator = locatorReader.getLocator("VerifyPixels.vSpace2HeightEmail");
					String margin_top = this.getCSS(locator, "padding-bottom");
					
					// Substring: To remove pixel(px text) from value
					String margin_top_wopx = margin_top.substring(0, 1);
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace2HeightEmail");
					String line_height1 = this.getCSS(locator1, "line-height");
					String font_size1 = this.getCSS(locator1, "font-size");
								
					// Substring: To remove pixel(px text) from value
					String line_height_wopx1 = line_height1.substring(0, 2);
					String font_size_wopx1 = font_size1.substring(0, 2);
					int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
					
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+getsubpixel1+Integer.parseInt("6");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(Totalpixelvaluewithpixel, vSpace2Height);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace2Height Exception>>Expected Result:20px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace2Height Error>>Expected Width:20px");
					count = count + 1;
				}

				// Verify vSpace2Height has the height of 20px.
				try {
					String locator = locatorReader.getLocator("VerifyPixels.vSpace2HeightBelowLanguage");
					String margin_top = this.getCSS(locator, "margin-top");
					
					// Substring: To remove pixel(px text) from value
					String margin_top_wopx = margin_top.substring(0, 2);
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace2HeightBelowLanguage1");
					String padding_bottom = this.getCSS(locator1, "padding-bottom");
					
					// Substring: To remove pixel(px text) from value
					String padding_bottom_wopx1 = padding_bottom.substring(0, 1);
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+Integer.parseInt(padding_bottom_wopx1)+Integer.parseInt("1");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(Totalpixelvaluewithpixel, vSpace2Height);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace2Height Exception>>Expected Result:20px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace2Height Error>>Expected Width:20px");
					count = count + 1;
				}
				// Verify vSpace14Height has the height of 14px.
				try {
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace14HeightState");
					String line_height1 = this.getCSS(locator1, "line-height");
					String font_size1 = this.getCSS(locator1, "font-size");
								
					// Substring: To remove pixel(px text) from value
					String line_height_wopx1 = line_height1.substring(0, 2);
					String font_size_wopx1 = font_size1.substring(0, 2);
					int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
					
					int Totaladdedpixel = getsubpixel1-Integer.parseInt("1");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(Totalpixelvaluewithpixel, vSpace14Height);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace14Height Exception>>ExpectedResult:10px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace14Height Error>>Expected Result:10px");
					count = count + 1;
				}
				// Verify vSpace14Height has the height of 10px.
				try {
					String locator = locatorReader.getLocator("VerifyPixels.vSpace4Height");
					String margin_top = this.getCSS(locator, "padding-bottom");
													
					// Substring: To remove pixel(px text) from value
					String margin_top_wopx = margin_top.substring(0, 2);
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace14HeightState");
					String padding_bottom = this.getCSS(locator1, "padding-bottom");
					
					// Substring: To remove pixel(px text) from value
					String padding_bottom_wopx1 = padding_bottom.substring(0, 1);
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+Integer.parseInt(padding_bottom_wopx1)+Integer.parseInt("1");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(Totalpixelvaluewithpixel, vSpace1Height);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace14Height Exception>>Expected Result:10px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace14Height Error>>Expected Width:10px");
					count = count + 1;
				}
				// Verify Gutter21Width has the height of 70px.
				try {
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4Height");
					String padding_right = this.getCSS(locator1, "padding-right");
					
					System.out.println("Actual result" + padding_right);
					Assert.assertEquals(padding_right, Gutter21Width);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup Gutter21Width Exception>>ExpectedResult:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup Gutter21Width Error>>Expected Result:70px");
					count = count + 1;
				}
				// Verify Gutter21Width has the height of 70px.
				try {
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4Height");
					String padding_right = this.getCSS(locator1, "padding-left");
					
					System.out.println("Actual result" + padding_right);
					Assert.assertEquals(padding_right, Gutter21Width);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup Gutter21Width Exception>>ExpectedResult:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup Gutter21Width Error>>Expected Result:70px");
					count = count + 1;
				}
				// Verify Gutter21Width has the height of 70px.
				try {
					
					String locator1 = locatorReader.getLocator("VerifyPixels.Gutter21Width");
					String padding_right = this.getCSS(locator1, "padding-left");
					String padding_right_wopx = padding_right.substring(0, 2);
					int Totaladdedpixel = Integer.parseInt(padding_right_wopx)+Integer.parseInt("1");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";		
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(Totalpixelvaluewithpixel, Gutter21Width);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup Gutter21Width Exception>>ExpectedResult:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup Gutter21Width Error>>Expected Result:70px");
					count = count + 1;
				}

				System.out.println("count value is :::" + count);
				Assert.assertTrue(count == 0);
			
			}
			
			public void VerifyAuthorizedPartnerPagePopup(String vSpace15Height,String Gutter68Width,String vSpace5Height,String TextSpace5Height,String Gap17width)
			{
				
				ReachUpAuthorizedPartnerPagePopup();
				int count = 0;
				
				// Verify vSpace15Height has the height of 25px.
				
				try {
					String locator = locatorReader.getLocator("VerifyPixelsAuthorizedPopup.vSpace15Height");
					String top = this.getCSS(locator, "top");
					System.out.println("Actual result" + top);
					Assert.assertEquals(top, vSpace15Height);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace15Height Exception>>Expected Margin Top:25px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace15Height Error>>Expected Top:25px");
					count = count + 1;
				}

	// Verify vSpace15Height has the left of 25px.
				
				try {
					String locator = locatorReader.getLocator("VerifyPixelsAuthorizedPopup.vSpace15Height");
					String top = this.getCSS(locator, "top");
					System.out.println("Actual result" + top);
					Assert.assertEquals(top, vSpace15Height);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace15Height Exception>>Expected Margin Top:25px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace15Height Error>>Expected Top:25px");
					count = count + 1;
				}

// Verify vSpace5Height has the height of 110px.
				
				try {
					String locator = locatorReader.getLocator("VerifyPixelsAuthorizedPopup.vSpace5Height");
					String top = this.getCSS(locator, "margin-top");
					System.out.println("Actual result" + top);
					Assert.assertEquals(top, vSpace5Height);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace5Height Exception>>Expected Margin Top:110px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace5Height Error>>Expected Top:110px");
					count = count + 1;
				}
 // Verify TextSpace5Height has the height of 50px.
				
				try {
					String locator = locatorReader.getLocator("VerifyPixelsAuthorizedPopup.TextSpace5Height");
					String top = this.getCSS(locator, "margin-top");
					System.out.println("Actual result" + top);
					Assert.assertEquals(top, TextSpace5Height);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace15Height Exception>>Expected Margin Top:50px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace15Height Error>>Expected Top:50px");
					count = count + 1;
				}
	// Verify vSpace5Height has the height of 110px.
				try {
					
					String locator1 = locatorReader.getLocator("VerifyPixelsAuthorizedPopup.TextSpace5Height");
					String padding_bottom = this.getCSS(locator1, "padding-bottom");
					String margin_bottom = this.getCSS(locator1, "margin-bottom");
					String padding_bottom_wopx = padding_bottom.substring(0, 1);
					String margin_bottom_wopx = margin_bottom.substring(0, 3);
										int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(margin_bottom_wopx)+Integer.parseInt("1");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";		
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(Totalpixelvaluewithpixel, vSpace5Height);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup vSpace5Height Exception>>ExpectedResult:110px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup vSpace5Height Error>>Expected Result:1000px");
					count = count + 1;
				}
				// Verify gutter17width has the width of 10px.
				try {
					
					String locator1 = locatorReader.getLocator("VerifyPixelsAuthorizedPopup.gap17width");
					String margin_left = this.getCSS(locator1, "margin-left");
					String margin_left_wopx = margin_left.substring(0, 1);
					int Totaladdedpixel = Integer.parseInt(margin_left_wopx)+Integer.parseInt("6");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";		
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(Totalpixelvaluewithpixel, Gap17width);
				}

				catch (Exception ex) {
					System.out.println(" Authorized Partner Popup gutter17width Exception>>ExpectedResult:10px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println(" Authorized Partner Popup gutter17width Error>>Expected Result:10px");
					count = count + 1;
				}

				System.out.println("count value is :::" + count);
				Assert.assertTrue(count == 0);
			
			}
			
				
	}

