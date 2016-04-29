package test.java.com.MusicGroup.pagehelper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class JoinUS_WhatWeDo_Helper extends DriverHelper {
	private LocatorReader locatorReader;	
	public JoinUS_WhatWeDo_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("JoinUS_WhatWeDo.xml");
	
	}
	public void ClickOnJoinUS()
	{
		
		String locator = locatorReader.getLocator("OurStory.ClickonJoinUs");
		this.WaitForElementEnabled(locator, 50);
	
		clickOn(locator);
	}
	
	public void ClickOnWhatWeDo()
	{
		
		String locator = locatorReader.getLocator("OurStory.ClickOnWhatWeDo");
		this.WaitForElementEnabled(locator, 50);
		
		clickOn(locator);
	}
	public void checkPageNotFound()
	{
		String actualTitle1 = driver.getTitle();
		System.out.println("Get Titile"+ actualTitle1);
		String expectedTitle1 = "Not Found | MUSIC Group";
		Assert.assertFalse(actualTitle1==expectedTitle1);

		
	}
	
	public void ClickOnMoreLink(){
		String locator = locatorReader.getLocator("VerifyPixels.ClickOnMoreLink");
		this.WaitForElementEnabled(locator, 50);
		
		clickOn(locator);
	}
	//Reach upto ReachUptpWhatWeDoPage(Join US)
	public void ReachUptoWhatWeDoPage(){
	// Click on Join Us Page
		this.ClickOnJoinUS();
	//Click on What We Do Page
		this.ClickOnWhatWeDo();
	//Check Page Not found
		this.checkPageNotFound();
	}
	
		 
	//Verify Buy Now page
		public void VerifyWhatWeDo(String Vspace1Height,String MaxWidth, String MaxHeight, String vSpace4height, String vTextSpace7Height, String vTextSpace5Height, String TextSpace1Height, String TextSpace9Width, String vSpace8Height, String TextSpace13Height, String Gutter74Width,String ImageHeight23, String ImageWidth23)
				{
			ReachUptoWhatWeDoPage();
		
			
			int count = 0;
			
			// Verify vSpace1Height has the height of 70px.
			
			try {
				
				
				String locator = locatorReader.getLocator("VerifyPixels.vSpaceAboveHeightHead");
				//this.mouseOver(locator);
				this.WaitForElementPresent(locator, 50000);
				String margin_top = this.getCSS(locator, "padding-top");
				
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
			Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("What We Do vSpace1Height Exception>>Expected:70px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("What We Do vSpace1Height Error>>Expected:70px");
				count = count + 1;
			}
			
			// Verify image has the height of 70px.
			
			try {
				String locator = locatorReader.getLocator("VerifyPixels.VerifyImage");
				String width = this.getCSS(locator, "width");
				System.out.println("Actual result" + width);
				//String Height=this.getCSS(locator, "height");
				Assert.assertEquals(MaxWidth, width);
				/*System.out.println("Actual result" + Height);
			Assert.assertEquals(MaxHeight, Height);
			*/
			
			}

			catch (Exception ex) {
				System.out.println("What We Do MaxWidth Exception>>Expected:70px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("What We Do MaxWidth Error>>Expected Width:70px");
				count = count + 1;
			}
			
			//Verify VSpace4 has the height of 40px
			try {
				
				String locator = locatorReader.getLocator("VerifyPixels.vSPaceBelowHeightHead");				
				String margin_bottom = this.getCSS(locator, "margin-bottom");
				
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
							
				// Substring: To remove pixel(px text) from value
				String margin_bottom_wopx = margin_bottom.substring(0, 2);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
		
				int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx)+Integer.parseInt("3");
				
				int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel;
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("What We Do vSpace4height Exception>>Expected:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("What We Do vSpace4height Error>>Expected:40px");
				count = count + 1;
			}
			
			//Verify vSpace4Height Below Image has the height of 40px.

			try {
				
				String locator = locatorReader.getLocator("VerifyPixels.vSPace4BelowImage");
				String margin_bottom = this.getCSS(locator, "margin-bottom");
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4AboveText");
				String line_height = this.getCSS(locator1, "line-height");
				String font_size = this.getCSS(locator1, "font-size");
							
				// Substring: To remove pixel(px text) from value
				String margin_bottom_wopx = margin_bottom.substring(0, 2);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
		
				int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("1");
				int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel;
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
			Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("What We Do vSpace4height Exception>>Expected:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("What We Do vSpace4height Error>>Expected:40px");
				count = count + 1;
			}
			
			
			//Verify TextSpace7 has the height of 27px.
try {
				
				String locator = locatorReader.getLocator("VerifyPixels.vSpace4AboveText");
				String margin_bottom = this.getCSS(locator, "margin-bottom");
				String padding_bottom = this.getCSS(locator, "padding-bottom");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4BelowText");
				String line_height_1 = this.getCSS(locator1, "line-height");
				String font_size_1 = this.getCSS(locator1, "font-size");
							
				// Substring: To remove pixel(px text) from value
				String margin_top_wopx = margin_bottom.substring(0, 2);
				String padding_bottom_wopx = padding_bottom.substring(0, 1);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				String line_height1_wopx = line_height_1.substring(0, 2);
				String font_size1_wopx = font_size_1.substring(0, 2);
		
				int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
				int getsubpixel_1=Integer.parseInt(line_height1_wopx)- Integer.parseInt(font_size1_wopx);
				int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+Integer.parseInt(padding_bottom_wopx)+ getsubpixel+getsubpixel_1+Integer.parseInt("1");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
			Assert.assertEquals(vTextSpace7Height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("What We Do vTextSpace7Height Exception>>Expecte:27px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("What We Do vTextSpace7Height Error>>Expected:27px");
				count = count + 1;
			}
			
//Verify TextSpace5 has the height of 13px.
try {
			
						String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4BelowText");
			String line_height_1 = this.getCSS(locator1, "line-height");
			String font_size_1 = this.getCSS(locator1, "font-size");
						
			// Substring: To remove pixel(px text) from value
		
			
			String line_height1_wopx = line_height_1.substring(0, 2);
			String font_size1_wopx = font_size_1.substring(0, 2);
	
			
			int getsubpixel=Integer.parseInt(line_height1_wopx)- Integer.parseInt(font_size1_wopx);
			int Totaladdedpixel = getsubpixel+ getsubpixel+Integer.parseInt("1");
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			
		Assert.assertEquals(vTextSpace5Height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("What We Do vTextSpace5Height Exception>>Expected:13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("What We Do vTextSpace5Height Error>>Expected:13px");
			count = count + 1;
		}

//Verify vSpace4Height Below FirstText has the height of 40px.

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vSpace4BelowFirstText");
	String margin_bottom = this.getCSS(locator, "margin-bottom");
	String Padding_Bottom=this.getCSS(locator, "padding-bottom");

	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace4AboveSecondText");
	String margin_top = this.getCSS(locator1, "margin-top");
	
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	String Padding_Bottom_wopx = Padding_Bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	String margin_top_wopx = margin_top.substring(0, 2);

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(Padding_Bottom_wopx)+Integer.parseInt("1");
	
	int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}


//Verify vSpace4Height Above Second Text(Touch) has the height of 40px.

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4AboveSecondText");
	String Padding_Bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpaceAboveListItem");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	
	
	
	// Substring: To remove pixel(px text) from value
	
	String Padding_Bottom_wopx = Padding_Bottom.substring(0, 2);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);

	int Totaladdedpixel = Integer.parseInt(Padding_Bottom_wopx)+ getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}


//Verify vSpace4Height Above Second Text(Feel) has the height of 40px.

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4AboveSecondText");
	String Padding_Bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpaceAboveFeelItem");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	
	
	
	// Substring: To remove pixel(px text) from value
	
	String Padding_Bottom_wopx = Padding_Bottom.substring(0, 2);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	
	int Totaladdedpixel = Integer.parseInt(Padding_Bottom_wopx)+ getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}

	
//Verify vSpace4Height Above Second Text(Care) has the height of 40px.

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4AboveSecondText");
	String Padding_Bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpaceAboveCareItem");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	
	
	
	// Substring: To remove pixel(px text) from value
	
	String Padding_Bottom_wopx = Padding_Bottom.substring(0, 2);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);

	int Totaladdedpixel = Integer.parseInt(Padding_Bottom_wopx)+ getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}


//Verify vSpace4Height Above Second Text(Heart) has the height of 40px.

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4AboveSecondText");
	String Padding_Bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpaceAboveHeartItem");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	
	
	
	// Substring: To remove pixel(px text) from value
	
	String Padding_Bottom_wopx = Padding_Bottom.substring(0, 2);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	
	int Totaladdedpixel = Integer.parseInt(Padding_Bottom_wopx)+ getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}


//Verify TextSpace 1 Below Touch has the height of 35px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightBelowTouch");
	String Padding_Bottom=this.getCSS(locator, "margin-bottom");

	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightAboveTouchText");
	String line_height_1 = this.getCSS(locator1, "line-height");
	String font_size_1 = this.getCSS(locator1, "font-size");
	
	
	
	// Substring: To remove pixel(px text) from value
	
	String Padding_Bottom_wopx = Padding_Bottom.substring(0, 2);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	String line_height_wopx_1 = line_height_1.substring(0, 2);
	String font_size_wopx_1 = font_size_1.substring(0, 2);

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int getsubpixel_1=Integer.parseInt(line_height_wopx_1)- Integer.parseInt(font_size_wopx_1);

	int Totaladdedpixel = Integer.parseInt(Padding_Bottom_wopx)+ getsubpixel+getsubpixel_1+Integer.parseInt("4");

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(TextSpace1Height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("What We Do TextSpace1Height Exception>>Expected:35px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do TextSpace1Height Error>>Expected:35px");
	count = count + 1;
}

//Verify TextSpace 1 Below Feel has the height of 35px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightBelowFeel");
	String Padding_Bottom=this.getCSS(locator, "margin-bottom");
	
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightAboveFeelText");
	String line_height_1 = this.getCSS(locator1, "line-height");
	String font_size_1 = this.getCSS(locator1, "font-size");
	
	
	
	// Substring: To remove pixel(px text) from value
	
	String Padding_Bottom_wopx = Padding_Bottom.substring(0, 2);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	String line_height_wopx_1 = line_height_1.substring(0, 2);
	String font_size_wopx_1 = font_size_1.substring(0, 2);

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int getsubpixel_1=Integer.parseInt(line_height_wopx_1)- Integer.parseInt(font_size_wopx_1);
	
	int Totaladdedpixel = Integer.parseInt(Padding_Bottom_wopx)+ getsubpixel+getsubpixel_1+Integer.parseInt("4");

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(TextSpace1Height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("What We Do TextSpace1Height Exception>>Expected:35px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do TextSpace1Height Error>>Expected:35px");
	count = count + 1;
}


//Verify TextSpace 1 Below Care has the height of 35px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightBelowCare");
	String Padding_Bottom=this.getCSS(locator, "margin-bottom");
	
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightAboveCareText");
	String line_height_1 = this.getCSS(locator1, "line-height");
	String font_size_1 = this.getCSS(locator1, "font-size");
	
	
	
	// Substring: To remove pixel(px text) from value
	
	String Padding_Bottom_wopx = Padding_Bottom.substring(0, 2);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	String line_height_wopx_1 = line_height_1.substring(0, 2);
	String font_size_wopx_1 = font_size_1.substring(0, 2);

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int getsubpixel_1=Integer.parseInt(line_height_wopx_1)- Integer.parseInt(font_size_wopx_1);

	int Totaladdedpixel = Integer.parseInt(Padding_Bottom_wopx)+ getsubpixel+getsubpixel_1+Integer.parseInt("4");

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(TextSpace1Height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("What We Do TextSpace1Height Exception>>Expected:35px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do TextSpace1Height Error>>Expected:35px");
	count = count + 1;
}


//Verify TextSpace 1 Below Heart has the height of 35px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightBelowHeart");
	String Padding_Bottom=this.getCSS(locator, "margin-bottom");

	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightAboveCareHeart");
	String line_height_1 = this.getCSS(locator1, "line-height");
	String font_size_1 = this.getCSS(locator1, "font-size");
	
	
	
	// Substring: To remove pixel(px text) from value
	
	String Padding_Bottom_wopx = Padding_Bottom.substring(0, 2);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	String line_height_wopx_1 = line_height_1.substring(0, 2);
	String font_size_wopx_1 = font_size_1.substring(0, 2);

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int getsubpixel_1=Integer.parseInt(line_height_wopx_1)- Integer.parseInt(font_size_wopx_1);

	int Totaladdedpixel = Integer.parseInt(Padding_Bottom_wopx)+ getsubpixel+getsubpixel_1+Integer.parseInt("4");

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(TextSpace1Height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("What We Do TextSpace1Height Exception>>Expected:35px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do TextSpace1Height Error>>Expected:35px");
	count = count + 1;
}
//Verify TextSpace9 has the Height of 8px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightAboveTouchText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+getsubpixel+Integer.parseInt("2");
	
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(TextSpace9Width, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do TextSpace9Width Exception>>Expected:8px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do TextSpace9Width Error>>Expected:8px");
	count = count + 1;
}

//verify TextSpace 8 above Touch Image has the height of 23px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightAboveTouchText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightImageTouch");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	//System.out.println("padding_bottom_wopx"+padding_bottom_wopx);

	
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	
	int Totaladdedpixel = getsubpixel+Integer.parseInt("3")+Integer.parseInt(margin_top_wopx);

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}
//verify TextSpace 8 above Feel Image has the height of 23px

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightAboveFeelText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightImageTouch");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("3")+Integer.parseInt(margin_top_wopx);

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}


//verify TextSpace 8 above Care Image has the height of 23px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightAboveCareText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightImageCare");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("3")+Integer.parseInt(margin_top_wopx);

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}

//verify TextSpace 8 above Heart Image has the height of 23px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightAboveCareHeart");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightImageHeart");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("3")+Integer.parseInt(margin_top_wopx);

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}
//verify TextSpace 8 Below Touch Image has the height of 23px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightImageTouch");
	String margin_bottom = this.getCSS(locator, "margin-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace8HeightBelowImageTouch");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	

	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("2")+Integer.parseInt(margin_bottom_wopx);
	
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}


//verify TextSpace 8 Below Feel Image has the height of 23px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightImageFeel");
	String margin_bottom = this.getCSS(locator, "margin-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace8HeightBelowImageFeel");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	

	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("2")+Integer.parseInt(margin_bottom_wopx);

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}

//verify TextSpace 8 Below Care Image has the height of 23px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightImageCare");
	String margin_bottom = this.getCSS(locator, "margin-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace8HeightBelowImageCare");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	

	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("2")+Integer.parseInt(margin_bottom_wopx);
	
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}

//verify TextSpace 8 Below Heart Image has the height of 23px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightImageHeart");
	String margin_bottom = this.getCSS(locator, "margin-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace8HeightBelowImageHeart");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	

	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("2")+Integer.parseInt(margin_bottom_wopx);

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}

//Verify TextSpace13 has the Height of 7px
try{
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace8HeightBelowImageTouch");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("3")+getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(TextSpace13Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace1Height Exception>>Expected Margin Top:70px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace1Height Error>>Expected Width:70px");
	count = count + 1;
}


//Verify TextSpace2(MoreLink) has the height of 23px
try{
	this.ClickOnMoreLink();
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace2MoreLink");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);

	int Totaladdedpixel = Integer.parseInt("19")+ getsubpixel+getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}
//Verify TextSpace4(MoreLink) has the height of 40px
try{

	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4MoreLink");
	String margin_top = this.getCSS(locator, "margin-top");
	String locator1 = locatorReader.getLocator("VerifyPixels.ClickOnMoreLink");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");

	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	String margin_top_wopx = margin_top.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);

	int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel-Integer.parseInt("2");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}


//Verify TextSpace4(MoreLink) has the height of 40px
try{

	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4MoreLink");
	String padding_bottom = this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightInnovationText");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");

	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	String padding_bottom_wopx = padding_bottom.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);

	int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}



//Verify TextSpace4(MoreLink) has the height of 40px
try{

	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4MoreLink");
	String padding_bottom = this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightExcellenceText");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");


	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	String padding_bottom_wopx = padding_bottom.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);

	int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}


//Verify TextSpace4(MoreLink) has the height of 40px
try{

	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4MoreLink");
	String padding_bottom = this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightOperationText");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");

	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	String padding_bottom_wopx = padding_bottom.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	
	int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}

//Verify TextSpace4(MoreLink) has the height of 40px
try{

	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4MoreLink");
	String padding_bottom = this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightTreasureText");
	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");

	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	String padding_bottom_wopx = padding_bottom.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);

	int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}


//Verify TextSpace8 has the height of 23px

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace8HeightInnovationText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace8HeightInnovationImage");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("3")+Integer.parseInt(margin_top_wopx);

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace8HeightExcellenceText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace8HeightExcellenceImage");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("3")+Integer.parseInt(margin_top_wopx);

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}


try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace8HeightOperationText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace8HeightOperationImage");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("3")+Integer.parseInt(margin_top_wopx);
	
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}


try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace8HeightTreasureText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace8HeightTreasureImage");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("3")+Integer.parseInt(margin_top_wopx);
	
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}

//Verify TextSpace4 has the height of 40px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightInnovationText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace4BelowData");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("1")+Integer.parseInt(margin_top_wopx);

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}


try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightExcellenceText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace4BelowData");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("1")+Integer.parseInt(margin_top_wopx);
	
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightOperationText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace4BelowData");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("1")+Integer.parseInt(margin_top_wopx);
	
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}


try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightTreasureText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace4BelowData");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt("1")+Integer.parseInt(margin_top_wopx);

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}

//Verify TextSpace4 Above Legal Text has the height of 40px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightLegalText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace4BelowData");
	String padding_bottom=this.getCSS(locator1, "padding-bottom");
	String padding_bottom_wopx = padding_bottom.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt(padding_bottom_wopx);

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace4height Error>>Expected:40px");
	count = count + 1;
}


//Verify TextSpace 8 Legal Text has the height of 23px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace8HeightLegalText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace8HeightLegalImage");
	String margin_top=this.getCSS(locator1, "margin-top");
	String margin_top_wopx = margin_top.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt(margin_top_wopx)+Integer.parseInt("3");
	
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace8Height Error>>Expected:23px");
	count = count + 1;
}

//Verify footer Vspace1 has the height of 70px 
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.ClickOnLegalMoreLink");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	//String padding_bottom=this.getCSS(locator, "padding-bottom");
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightLegalText");
	String margin_bottom=this.getCSS(locator1, "margin-bottom");
	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	//String padding_bottom_wopx = padding_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int Totaladdedpixel = getsubpixel+Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("2");

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("What We Do vSpace1Height Exception>>Expected:70px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do vSpace1Height Error>>Expected:70px");
	count = count + 1;
}
//Verify Gutter 74 has the width of 28px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpaceAboveFeelItem");
	String margin_left = this.getCSS(locator, "margin-left");
	System.out.println("Actual result" + margin_left);
	
Assert.assertEquals(Gutter74Width,margin_left);
}
catch (Exception ex) {
	System.out.println("What We Do Gutter74Width Exception>>Expected Margin Top:28px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do Gutter74Width Error>>Expected:28px");
	count = count + 1;
}

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpaceAboveCareItem");
	String margin_left = this.getCSS(locator, "margin-left");
	System.out.println("Actual result" + margin_left);
	
Assert.assertEquals(Gutter74Width,margin_left);
}
catch (Exception ex) {
	System.out.println("What We Do Gutter74Width Exception>>Expected Margin Top:28px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do Gutter74Width Error>>Expected:28px");
	count = count + 1;
}

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpaceAboveHeartItem");
	String margin_left = this.getCSS(locator, "margin-left");
	System.out.println("Actual result" + margin_left);
	
Assert.assertEquals(Gutter74Width,margin_left);
}
catch (Exception ex) {
	System.out.println("What We Do Gutter74Width Exception>>Expected Margin Top:28px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do Gutter74Width Error>>Expected:28px");
	count = count + 1;
}

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightExcellenceText");
	String margin_left = this.getCSS(locator, "margin-left");
	System.out.println("Actual result" + margin_left);
	
Assert.assertEquals(Gutter74Width,margin_left);
}
catch (Exception ex) {
	System.out.println("What We Do Gutter74Width Exception>>Expected Margin Top:28px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do Gutter74Width Error>>Expected:28px");
	count = count + 1;
}
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightOperationText");
	String margin_left = this.getCSS(locator, "margin-left");
	System.out.println("Actual result" + margin_left);
	
Assert.assertEquals(Gutter74Width,margin_left);
}
catch (Exception ex) {
	System.out.println("What We Do Gutter74Width Exception>>Expected Margin Top:28px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do Gutter74Width Error>>Expected:28px");
	count = count + 1;
}

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace4HeightTreasureText");
	String margin_left = this.getCSS(locator, "margin-left");
	System.out.println("Actual result" + margin_left);
	
Assert.assertEquals(Gutter74Width,margin_left);
}
catch (Exception ex) {
	System.out.println("What We Do Gutter74Width Exception>>Expected Margin Top:28px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do Gutter74Width Error>>Expected:28px");
	count = count + 1;
}


//Verify Image73 has the Width of 224px  and Height of 150px
try{
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightImageTouch");
	String max_height=this.getCSS(locator1, "max-height");
	String max_width=this.getCSS(locator1, "max-width");
	System.out.println("Actual Height" + max_height);
	System.out.println("Actual Width" + max_width);
	Assert.assertEquals(ImageHeight23,max_height);
	Assert.assertEquals(ImageWidth23,max_width);
}
catch (Exception ex) {
	System.out.println("What We Do Width of 224px  and Height of 150px Exception>>Expected Width:224px and Height:150px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("What We Do Width of 224px  and Height of 150px Error>>Expected Width:224px and Height:150px");
	count = count + 1;
}
			System.out.println("count value is :::" + count);
			Assert.assertTrue(count==0);	
				}
}

