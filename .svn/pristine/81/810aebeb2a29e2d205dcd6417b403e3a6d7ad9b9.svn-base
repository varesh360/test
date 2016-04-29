package test.java.com.MusicGroup.pagehelper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;


public class MidasTraining_Schedule_Helper extends DriverHelper {
	private LocatorReader locatorReader;	
	public MidasTraining_Schedule_Helper(WebDriver driver){
		super(driver);
		locatorReader = new LocatorReader("MidasTraining_Schedule.xml");
	}
	public void clickOnMenu(){

		String locator = locatorReader.getLocator("MGTrainingSchedule.ClickToggleMenu");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	public void ClickOnBrand(){
		String locator = locatorReader.getLocator("MGTrainingSchedule.ClickMidasBrand");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	public void ClickOnTraining(){
		String locator = locatorReader.getLocator("MGTrainingSchedule.ClickOnTraining");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	public void ClickOnSchedule(){
		String locator = locatorReader.getLocator("MGTrainingSchedule.ClickOnSchedule");
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
	//Reach upto ReachUptpoSchedulePage(Training)
		public void ReachUptoSchedulePage(){
		// Click on Join Us Page
			this.clickOnMenu();
		//Click on What We Do Page
			this.ClickOnBrand();
			//Click on Training Page
			this.ClickOnTraining();
		//Click on Schedule Page
			this.ClickOnSchedule();
		//Check Page Not found
			this.checkPageNotFound();
		}
		
		//Verify Midas Training Schedule page
		public void VerifySchedule_TrainingPage(String VSpace1height, String vSpace4height, String vSpace9height, String vspace15Height,String vTextSpace8, String TextSpace13Height, String Gutter28Width){
			ReachUptoSchedulePage();
			
			int count = 0;
			
			// Verify vSpace1Height has the height of 70px.
			
			try {
				
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeaderHeight");
				String margin_top = this.getCSS(locator, "margin-top");
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeadingHeight");
				String line_height = this.getCSS(locator1, "line-height");
				String font_size = this.getCSS(locator1, "font-size");
							
				// Substring: To remove pixel(px text) from value
				String margin_top_wopx = margin_top.substring(0, 2);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
		
				int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
			
				int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel;
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(VSpace1height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("Midas Training Schedule vSpace1Height Exception>>Expected:70px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas Training Schedule vSpace1Height Error>>Expected Width:70px");
				count = count + 1;
			}
			
			//Verify vSpace4 has the height of 40px
			
try {
				
				String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeadingHeight");
				String line_height = this.getCSS(locator1, "line-height");
				String font_size = this.getCSS(locator1, "font-size");
				String margin_bottom=this.getCSS(locator1, "margin-bottom");
							
				// Substring: To remove pixel(px text) from value
				String margin_bottom_wopx = margin_bottom.substring(0, 2);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
		
				int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);

				int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel;
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("Midas Training Schedule vSpace4height Exception>>Expected:40px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Midas Training Schedule vSpace4height Error>>Expected:40px");
				count = count + 1;
			}

//Verify vSpace4 Below First Image has the height of 40px
try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4HeightBelowFirstImage");

	String margin_bottom=this.getCSS(locator1, "margin-bottom");
	String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightBelowSecondText");
	String line_height = this.getCSS(locator, "line-height");
	String font_size = this.getCSS(locator, "font-size");
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);

	int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx)-Integer.parseInt("2");

	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule vSpace4height Error>>Expected:40px");
	count = count + 1;
}

//Verify vSpace 9 has the height of 17px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightBelowSecondText");
	String margin_bottom=this.getCSS(locator, "margin-bottom");

	
	System.out.println("Actual result" + margin_bottom);
Assert.assertEquals(vSpace9height, margin_bottom);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule vSpace9height Exception>>Expected:17px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule vSpace9height Error>>Expected:17px");
	count = count + 1;
}

//Verify vSpace4(3) has the height of 40px

try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4BelowAboveThirdText");

	String margin_bottom=this.getCSS(locator1, "padding-top");

	String line_height = this.getCSS(locator1, "line-height");

	String font_size = this.getCSS(locator1, "font-size");

	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	
	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule vSpace4height Error>>Expected:40px");
	count = count + 1;
}

try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4BelowAboveThirdText2");

	String margin_bottom=this.getCSS(locator1, "padding-top");

	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	
	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel;
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule vSpace4height Error>>Expected:40px");
	count = count + 1;
}

//Verify TextSpace10 has the height of 25px
try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace10CText");

	String margin_bottom=this.getCSS(locator1, "padding-bottom");

	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace10CText1");
	String margin_top=this.getCSS(locator, "padding-top");

	String line_height_1 = this.getCSS(locator, "line-height");
	String font_size_1 = this.getCSS(locator, "font-size");
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	
	String margin_top_wopx = margin_top.substring(0, 1);
	String line_height_1_wopx = line_height_1.substring(0, 2);
	String font_size_1_wopx = font_size_1.substring(0, 2);

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int getsubpixel_1=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);
	
	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel+getsubpixel_1+Integer.parseInt(margin_top_wopx)+Integer.parseInt("3");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
Assert.assertEquals(vspace15Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("Midas Training Schedule vspace15Height Exception>>Expected:25px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule vspace15Height Error>>Expected:25px");
	count = count + 1;
}

try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace10CText");

	String margin_bottom=this.getCSS(locator1, "padding-bottom");

	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace10CText2");
	String margin_top=this.getCSS(locator, "padding-top");

	String line_height_1 = this.getCSS(locator, "line-height");
	String font_size_1 = this.getCSS(locator, "font-size");
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	
	String margin_top_wopx = margin_top.substring(0, 1);
	String line_height_1_wopx = line_height_1.substring(0, 2);
	String font_size_1_wopx = font_size_1.substring(0, 2);

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int getsubpixel_1=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);

	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel+getsubpixel_1+Integer.parseInt(margin_top_wopx)+Integer.parseInt("3");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
Assert.assertEquals(vspace15Height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule vspace15Height Exception>>Expected:25px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule vspace15Height Error>>Expected:25px");
	count = count + 1;
}



//Verify TextSpace8 has the height of 20px
try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace10CText1");

	String margin_bottom=this.getCSS(locator1, "padding-bottom");

	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace8CTextDate");
	String margin_top=this.getCSS(locator, "padding-top");

	String line_height_1 = this.getCSS(locator, "line-height");
	String font_size_1 = this.getCSS(locator, "font-size");
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	
	String margin_top_wopx = margin_top.substring(0, 1);
	String line_height_1_wopx = line_height_1.substring(0, 2);
	String font_size_1_wopx = font_size_1.substring(0, 2);

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int getsubpixel_1=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);

	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel+getsubpixel_1+Integer.parseInt(margin_top_wopx)-Integer.parseInt("2");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
Assert.assertEquals(vTextSpace8, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule vTextSpace8 Exception>>Expected:20px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule vTextSpace8 Error>>Expected:20px");
	count = count + 1;
}

try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace10CText2");

	String margin_bottom=this.getCSS(locator1, "padding-bottom");

	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace8CTextStatus");
	String margin_top=this.getCSS(locator, "padding-top");

	String line_height_1 = this.getCSS(locator, "line-height");
	String font_size_1 = this.getCSS(locator, "font-size");
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	
	String margin_top_wopx = margin_top.substring(0, 1);
	String line_height_1_wopx = line_height_1.substring(0, 2);
	String font_size_1_wopx = font_size_1.substring(0, 2);

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int getsubpixel_1=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);
	
	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel+getsubpixel_1+Integer.parseInt(margin_top_wopx)-Integer.parseInt("2");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
Assert.assertEquals(vTextSpace8, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule vTextSpace8 Exception>>Expected:20px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule vTextSpace8 Error>>Expected:20px");
	count = count + 1;
}

//Verify TextSpace10 above address has the height of 25px
try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace10CTextDate");

	String margin_bottom=this.getCSS(locator1, "padding-bottom");

	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	String locator = locatorReader.getLocator("VerifyPixels.vTextSpace10CTextAddressT");
	String margin_top=this.getCSS(locator, "padding-top");
	String locator2 = locatorReader.getLocator("VerifyPixels.vTextSpace10CTextAddressP");
	String margin_top_1=this.getCSS(locator2, "margin-top");
	String line_height_1 = this.getCSS(locator2, "line-height");
	String font_size_1 = this.getCSS(locator2, "font-size");
	

	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 1);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	
	String margin_top_wopx = margin_top.substring(0, 1);
	String margin_top_1_wopx = margin_top_1.substring(0, 1);
	String line_height_1_wopx = line_height_1.substring(0, 2);
	String font_size_1_wopx = font_size_1.substring(0, 2);

	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
	int getsubpixel_1=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);

	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel+getsubpixel_1+Integer.parseInt(margin_top_wopx)+Integer.parseInt(margin_top_1_wopx)-Integer.parseInt("2");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
Assert.assertEquals(vspace15Height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule TextSpace10 Exception>>Expected Margin Top:25px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule TextSpace10 Error>>Expected Width:25px");
	count = count + 1;
}		

//Verify TextSpace13 has the height of 13px
try{
	String locator2 = locatorReader.getLocator("VerifyPixels.vTextSpace10CTextAddressP");

	String line_height_1 = this.getCSS(locator2, "line-height");
	String font_size_1 = this.getCSS(locator2, "font-size");
	
	String line_height_1_wopx = line_height_1.substring(0, 2);
	String font_size_1_wopx = font_size_1.substring(0, 2);
	
	int getsubpixel_1=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);

	int Totaladdedpixel = getsubpixel_1+getsubpixel_1+Integer.parseInt("1");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
Assert.assertEquals(TextSpace13Height, Totalpixelvaluewithpixel);
}
catch (Exception ex) {
	System.out.println("Midas Training Schedule TextSpace13 Exception>>Expected Margin Top:13px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule TextSpace13 Error>>Expected Width:13px");
	count = count + 1;
}

//Verify vSpace4 in footer has the height of 40px

try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4BelowAboveThirdText2");

	String padding_bottom=this.getCSS(locator1, "padding-bottom");

	String line_height = this.getCSS(locator1, "line-height");
	String font_size = this.getCSS(locator1, "font-size");
	String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightSecondText");
	String margin_bottom=this.getCSS(locator, "margin-bottom");


	// Substring: To remove pixel(px text) from value
	String padding_bottom_wopx = padding_bottom.substring(0, 2);
	String line_height_wopx = line_height.substring(0, 2);
	String font_size_wopx = font_size.substring(0, 2);
	
	String margin_bottom_wopx = margin_bottom.substring(0, 2);


	int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);

	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel+Integer.parseInt(padding_bottom_wopx);
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule vSpace4 Exception>>Expected Margin Top:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule vSpace4 Error>>Expected Width:40px");
	count = count + 1;
}		

//Verify vSpace1 in Footer has the height of 70px

try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeaderHeight");

	String padding_bottom=this.getCSS(locator1, "padding-bottom");

	String locator = locatorReader.getLocator("VerifyPixels.vSpace4BelowAboveThirdText");
	String margin_bottom=this.getCSS(locator, "margin-bottom");


	// Substring: To remove pixel(px text) from value
	String padding_bottom_wopx = padding_bottom.substring(0, 2);
	
	String margin_bottom_wopx = margin_bottom.substring(0, 2);

	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(padding_bottom_wopx);
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
Assert.assertEquals(VSpace1height , Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule vSpace1Height Exception>>Expected Margin Top:70px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule vSpace1Height Error>>Expected Width:70px");
	count = count + 1;
}		

//Verify Gutter8 in Left has the width of 40px
try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4BelowAboveThirdText");

	String padding_left=this.getCSS(locator1, "padding-left");

	System.out.println("Actual result" + padding_left);
Assert.assertEquals(vSpace4height, padding_left);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule Gutter8 Exception>>Expected Margin Top:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule Gutter8 Error>>Expected Width:40px");
	count = count + 1;
}	

//Verify Gutter8 in right has the width of 40px
try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4BelowAboveThirdText");

	String padding_right=this.getCSS(locator1, "padding-right");

	System.out.println("Actual result" + padding_right);
Assert.assertEquals(vSpace4height, padding_right);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule vSpace4height Error>>Expected:40px");
	count = count + 1;
}


//Verify Gutter28 in Left has the width of 17px
try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4BelowAboveThirdText");

	String margin_right=this.getCSS(locator1, "margin-right");

	System.out.println("Actual result" + margin_right);
Assert.assertEquals(Gutter28Width, margin_right);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule Gutter28 Exception>>Expected Margin Top:17px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule Gutter28 Error>>Expected Width:17px");
	count = count + 1;
}	

//Verify Gutter28 in Right has the width of 17px
try {
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4BelowAboveThirdText2");

	String margin_right=this.getCSS(locator1, "margin-right");

	System.out.println("Actual result" + margin_right);
Assert.assertEquals(Gutter28Width, margin_right);
}

catch (Exception ex) {
	System.out.println("Midas Training Schedule Gutter28 Exception>>Expected Margin Top:17px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Midas Training Schedule Gutter28 Error>>Expected Width:17px");
	count = count + 1;
}	

			System.out.println("count value is :::" + count);
			Assert.assertTrue(count==0);	
		}
		
}
