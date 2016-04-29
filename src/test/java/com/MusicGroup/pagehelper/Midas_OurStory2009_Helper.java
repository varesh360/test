package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class Midas_OurStory2009_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public Midas_OurStory2009_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("Midas_OurStory2009.xml");
	}

	//Click on Menu icon 
	public void clickMenuIcon()
	{
		String locator = locatorReader.getLocator("OurStory.ClickToggleMenu");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	//Click on Brand Midas
	public void clickonBrandMidas()
	{
		String locator = locatorReader.getLocator("OurStory.ClickMidasBrand");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	//Click on OurStory
	public void clickOurStory()
	{
		String locator = locatorReader.getLocator("OurStory.ClickOurStoryMenu");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}	
	//Click on OurStory1970
	public void clickOurStory1970()
	{
		try{
			/*
		String locator1 = locatorReader.getLocator("OurStory.ClickOurStory1981image");
		this.WaitForElementEnabled(locator1, 50);
		mouseOver(locator1);
		
		String locator = locatorReader.getLocator("OurStory.ClickOurStory1998image");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		*/
			WebElement element = driver.findElement(ByLocator("//ul[@id='mTS_1_container']//li[16]/a"));
			   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		}catch (Exception ex) {
			
			System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Exception>>Expected Result:450px");
			Assert.fail("locator not found");
		} catch (Error ex) {
			
			System.out.println("Midas OurStory 1970 CallOutBodyCopyWidth Error>>Expected Result:450px");
			Assert.fail("locator not found");
		}
	}
	//Check Page not found
	public void checkPageNotFound()
	{
		String actualTitle1 = driver.getTitle();
		System.out.println("Get Titile"+ actualTitle1);
		String expectedTitle1 = "Not Found | MUSIC Group";
		Assert.assertFalse(actualTitle1==expectedTitle1);

		
	}
	//Reach upto ReachUptoOurStoryPage(Midas)
	public void ReachUptoOurStoryPage()
	{
		//Click on the Menu icon
		this.clickMenuIcon();
		//Click on a brand
		this.clickonBrandMidas();
		//Click on Buy Now
		this.clickOurStory();
		
		//Click our Story 1970
		this.clickOurStory1970();
		//Check page not found
		this.checkPageNotFound();
	}
	
	//Verify Buy Now page
	public void verifyMidasOurStory2009Page(String vSpace1Height, String TextSpace8Height, String TextSpace6Height, String vSpace4Height, String Gutter16Width, String FullWidthBoxImage33, String FullWidthBoxImage6, String BodayCopyLeadingHeight,String FullWidthBoxImage, String vSpace2Height, String TextSpace1Height, String ImageWidth2,String CallOutBodyCopyWidth, String Gutter2Width)
	{
		//Reach upto Buy Now page(MIDAS)
				ReachUptoOurStoryPage();
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
					int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx)-Integer.parseInt("4");
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel-Integer.parseInt("4");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(vSpace1Height, Totalpixelvaluewithpixel);
				}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 vSpace1Height Exception>>Expected Margin Top:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 vSpace1Height Error>>Expected Width:70px");
					count = count + 1;
				}
				
				
				
				// Verify textSpace8Height has the height of 20px.
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
					
						
					String locator1 = locatorReader.getLocator("VerifyPixels.textSpace8Height");
					String line_height1 = this.getCSS(locator1, "line-height");
					String font_size1 = this.getCSS(locator1, "font-size");
					
					// Substring: To remove pixel(px text) from value
					String line_height_wopx1 = line_height1.substring(0, 2);
					String font_size_wopx1 = font_size1.substring(0, 2);
					
					int getsubpixel1=Integer.parseInt(font_size_wopx1)- Integer.parseInt(line_height_wopx1);
					
					
					
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel1-getsubpixel+Integer.parseInt("4");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(TextSpace8Height, Totalpixelvaluewithpixel);
					
				}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 TextSpace8Height Exception>>Expected Result:20px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 TextSpace8Height Error>>Expected Result:20px");
					count = count + 1;
				}
				
				
				// Verify textSpace6Height has the height of 40px.
				try {
					String locator = locatorReader.getLocator("VerifyPixels.textSpace8Height");
					String margin_top = this.getCSS(locator, "margin-bottom");
					String line_height = this.getCSS(locator, "line-height");
					String font_size = this.getCSS(locator, "font-size");
					
					
					// Substring: To remove pixel(px text) from value
					String margin_top_wopx = margin_top.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
					
				
								
					int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
								
					String locator1 = locatorReader.getLocator("VerifyPixels.textSpace6Height");
					String line_height1 = this.getCSS(locator1, "line-height");
					String font_size1 = this.getCSS(locator1, "font-size");
					
					// Substring: To remove pixel(px text) from value
					String line_height_wopx1 = line_height1.substring(0, 2);
					String font_size_wopx1 = font_size1.substring(0, 2);
					
					int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
					
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel1-getsubpixel+Integer.parseInt("5");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(TextSpace6Height, Totalpixelvaluewithpixel);
					
				}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 textSpace6Height Exception>>Expected Result:40px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 textSpace6Height Error>>Expected Result:40px");
					count = count + 1;
				}
				
			
				// Verify vSpace4Height has the height of 40px.
				try {
					String locator = locatorReader.getLocator("VerifyPixels.textSpace6Height");
					String padding_bottom = this.getCSS(locator, "padding-bottom");
					String line_height = this.getCSS(locator, "line-height");
					String font_size = this.getCSS(locator, "font-size");
				
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
					
					// Substring: To remove pixel(px text) from value
					String padding_bottom_wopx = padding_bottom.substring(0, 2);
					
				   int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) ;
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4Heightaboveimage");
					String margin_top = this.getCSS(locator1, "margin-top");
					String locator2=locatorReader.getLocator("VerifyPixels.textSpacemargin1aboveImage");
					String margin_bottom= this.getCSS(locator2, "margin-bottom");
					String margin_bottom_wopx=margin_bottom.substring(0, 1);
					String margin_top_wopx = margin_top.substring(0, 2);
				
					
				int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(margin_top_wopx)+Integer.parseInt(margin_bottom_wopx)+getsubpixel- Integer.parseInt("8");
									
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
					
				}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 vSpace4Height Exception>>Expected Result:40px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 vSpace4Height Error>>Expected Result:40px");
					count = count + 1;
				}
				// Verify FullWidthBoxImage1 has the width of 980px.
				try {
					String locator = locatorReader.getLocator("VerifyPixels.FirstImagewidth");
					String width = this.getCSS(locator, "width");
					System.out.println("Actual result" + width);
					Assert.assertEquals(FullWidthBoxImage, width);
					}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 FullWidthBoxImage6 Exception>>Expected Result:980px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 FullWidthBoxImage6 Error>>Expected Result:980px");
					count = count + 1;
				}
				
				// Verify FullWidthBoxImage2 has the width of 980px.
				try {
					String locator = locatorReader.getLocator("VerifyPixels.FirstImagewidth");
					String width = this.getCSS(locator, "width");
					System.out.println("Actual result" + width);
					Assert.assertEquals(FullWidthBoxImage, width);
				
				}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 FullWidthBoxImage6 Exception>>Expected Result:980px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 FullWidthBoxImage6 Error>>Expected Result:980px");
					count = count + 1;
				}
				
				
				// Verify VSpace3Height has the height of 20px. 
				
				try {
					String locator = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
					String line_height = this.getCSS(locator, "line-height");
					String font_size = this.getCSS(locator, "font-size");
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);

					// Substring: To remove pixel(px text) from value
					
					int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx) + Integer.parseInt("6");
												
					String Totalpixelvaluewithpixel = getsubpixel+"px";
					System.out.println( "      "+Totalpixelvaluewithpixel);
					System.out.println( "      "+BodayCopyLeadingHeight);

					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(TextSpace8Height, Totalpixelvaluewithpixel);
					
				}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 BodayCopyLeadingHeight Exception>>Expected Result:20px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 BodayCopyLeadingHeight Error>>Expected Result:20px");
					count = count + 1;
				}
				
				
				// Verify vSpace1Height has the height of 40px.
				try {
					String locator1 = locatorReader.getLocator("VerifyPixels.textSpace6Height");
					String padding_bottom = this.getCSS(locator1, "padding-bottom");
					String font_size=this.getCSS(locator1, "font-size");
					String line_height=this.getCSS(locator1, "line-height");
					
					
					// Substring: To remove pixel(px text) from value
					
					String padding_bottom_wopx = padding_bottom.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					int getsubpixel = Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx) - Integer.parseInt("4");
					  
					String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeightseeAllMidas");
					String padding_top1 = this.getCSS(locator, "margin-top");
				
					// Substring: To remove pixel(px text) from value
					String padding_top_wopx1 = padding_top1.substring(0, 2);
					
								
					int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(padding_top_wopx1)+getsubpixel;
					
					
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
								
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
					
				}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 vSpace4Height Exception>>Expected Result:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 vSpace4Height Error>>Expected Result:70px");
					count = count + 1;
				}
				
				
				// Verify TextSpace2Height has the height of 20px.
				try {
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightBelowFirstText");
					String padding_top = this.getCSS(locator1, "margin-bottom");
					
					// Substring: To remove pixel(px text) from value
					String padding_top_wopx = padding_top.substring(0, 2);
					
												
					int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+Integer.parseInt("4");
					
					
					String Totalpixelvaluewithpixel = Totaladdedpixel+"px";
								
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(TextSpace8Height, Totalpixelvaluewithpixel);
					
				}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 TextSpace8Height Exception>>Expected Result:20px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 TextSpace8Height Error>>Expected Result:20px");
					count = count + 1;
				}
					

					// Verify TextSpace1 has the height of 35px.
				try {
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpaceHeightbelowText");
					String padding_bottom = this.getCSS(locator1, "padding-bottom");
					String font_size = this.getCSS(locator1, "font-size");
					String line_height = this.getCSS(locator1, "line-Height");
					
					// Substring: To remove pixel(px text) from value
					String padding_bottom_wopx=padding_bottom.substring(0, 2);	
					String font_size_wopx=font_size.substring(0, 2);
					String line_height_wopx=line_height.substring(0, 2);
						
					
					int getsubpixel = Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
					
					int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+Integer.parseInt("5")+getsubpixel;
					
					String Totalpixelvaluewithpixel = Totaladdedpixel+"px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(TextSpace1Height, Totalpixelvaluewithpixel);
					
				}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 padding_top_wopx Exception>>Expected Result:35px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 padding_top_wopx Error>>Expected Result:35px");
					count = count + 1;
				}
				
				
				// Verify TextSpace6(2) has the height of 40px.
				try {
					
					String locator = locatorReader.getLocator("VerifyPixels.vSpace2Heightabovebuttontext1");
					String padding_top = this.getCSS(locator, "padding-bottom");
					String line_height = this.getCSS(locator, "line-height");
					String font_size = this.getCSS(locator, "font-size");
					
					
					// Substring: To remove pixel(px text) from value
					String margin_top_wopx = padding_top.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
				
				
								
					int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
					
					String locator1 = locatorReader.getLocator("VerifyPixels.textSpace6Height");
					String line_height1 = this.getCSS(locator1, "line-height");
					String font_size1 = this.getCSS(locator1, "font-size");
					
					// Substring: To remove pixel(px text) from value
					String line_height_wopx1 = line_height1.substring(0, 2);
					String font_size_wopx1 = font_size1.substring(0, 2);
					
					int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
				
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel1+getsubpixel-Integer.parseInt("4");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(TextSpace6Height, Totalpixelvaluewithpixel);
					
				}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 textSpace6Height Exception>>Expected Result:40px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 textSpace6Height Error>>Expected Result:40px");
					count = count + 1;
				}
			
				
				// Verify vSpace1Height has the height of 70px.
				try {
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
					String margin_top = this.getCSS(locator1, "margin-bottom");
							
					System.out.println("Actual result" + margin_top);
					Assert.assertEquals(vSpace1Height, margin_top);
					
				}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 vSpace1Height Exception>>Expected Result:70px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 vSpace1Height Error>>Expected Result:7s0px");
					count = count + 1;
				}
				
				
				// Verify VSpace6Height has the height of 40px.
				try {
					String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1heightfooter");
					String padding_top = this.getCSS(locator1, "margin-top");					
					String locator = locatorReader.getLocator("VerifyPixels.vSpaceHeightbelowText");
					String line_height = this.getCSS(locator, "line-height");
					String font_size = this.getCSS(locator, "font-size");
					String padding_bottom = this.getCSS(locator, "padding-bottom");
					
					// Substring: To remove pixel(px text) from value
					String padding_top_wopx = padding_top.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
					String padding_bottom_wopx = padding_bottom.substring(0, 2);
					
					int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
					
					String locator2 = locatorReader.getLocator("VerifyPixels.vSpace4Heightaboveimage");
					String margin_top= this.getCSS(locator2, "margin-top");
			
					// Substring: To remove pixel(px text) from value
					String margin_top_wopx=margin_top.substring(0, 2);
					
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+getsubpixel+Integer.parseInt(padding_bottom_wopx)-Integer.parseInt("4");
					
				
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
								
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
					
				}

				catch (Exception ex) {
					System.out.println("Midas OurStory 2009 vSpace4Height Exception>>Expected Result:40px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Midas OurStory 2009 vSpace4Height Error>>Expected Result:40px");
					count = count + 1;
				}					System.out.println("count value is :::" + count);
				Assert.assertTrue(count==0);	
			}	
		}
