/*==============================================================================================================================
 File Name    : B2B_RegistrationPage_Helper.java
 ClassName    : B2B_RegistrationPage_Helper
 Summary      : Contains automation scripts to login into B2B_RegistrationPage_Helper store.
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

public class B2B_RegistrationPage_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_RegistrationPage_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_RegistrationPage.xml");
	
	}
	
	//Click on Registraion Link
	public void click_Registrationlink()
	
	{
	
		String locator = locatorReader.getLocator("B2B_RegistraionPage.clickregistraionlink");
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
	public void ReachUptoProductReviewPage()
	{
		//Click on Cartlink on B2BPage
		this.click_Registrationlink();
		//Check page not found
		this.checkPageNotFound();
		
	}
	public void verifyRegistraionPage(String VSpace1Height,String BodyCopyLeadingHeight, String Width, String Gutter4Width, String Gutter2Width, String Gap1Width, String Gutter89Width, String ParagraphSpace1Height)
	{
		
		
		ReachUptoProductReviewPage();
		int count = 0;
		// Verify vSpace1Height has the height of 70px .
		
		try {
			
			String locator = locatorReader.getLocator("B2B_RegistraionPage.vSpace1Hightlocatorheader");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result: " + margin_top);
			Assert.assertEquals(VSpace1Height,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}
		
		try {
			
			String locator = locatorReader.getLocator("B2B_RegistraionPage.vSpace1Hightlocatorheader");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result: " + margin_top);
			Assert.assertEquals(VSpace1Height,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}
		// Verify vSpace1Height has the height of 70px .
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.vspace1createmusictext");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result: " + margin_top);
			Assert.assertEquals(VSpace1Height,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}
		// Verify textspace1height has the height of 35px .
			
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.textSpace1locatoraboveenteryou");
			String margin_top = this.getCSS(locator, "margin-top");
			String line_height = this.getCSS(locator, "line-height");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + margin_top);
			System.out.println("Actual Result: " + line_height);
			System.out.println("Actual Result: " + height);
			Assert.assertEquals(VSpace1Height,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B Product review textspace1height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review textspace1height Error>>Expected Padding:35px");
			count = count + 1;
		}
	
		// Verify textspace1height BodyCopyLeadingHeight  has the height of 17px .
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.textspace1heightform");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result: " + margin_top);
			Assert.assertEquals(BodyCopyLeadingHeight,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B Product review vSpace1Height BodyCopyLeadingHeight Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace1Height BodyCopyLeadingHeight Error>>Expected Padding:70px");
			count = count + 1;
		}
			
		// Verify BodyCopyLeading 17px ParagraphSpace1Height  has the height of 70px .
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.v1spaceheightabovesecurity");
			String margin_top = this.getCSS(locator, "margin-top");
			String line_height = this.getCSS(locator, "line-height");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: Margin " + margin_top);
			System.out.println("Actual Result:line height " + line_height);
			System.out.println("Actual Result: height " + height);
			System.out.println("---Actual Result:---- " + margin_top);
			
			//Assert.assertEquals(VSpace1Height,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B Product review BodyCopyLeading ParagraphSpace1Height Exception>>Expected Pading Top:17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review BodyCopyLeading ParagraphSpace1Height Error>>Expected Padding:17px");
			count = count + 1;
		}
		
		// Verify width 450px .
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.widthlocator");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result: Margin " + width);
			
			Assert.assertEquals(Width,width);
		}

		catch (Exception ex) {
			System.out.println("B2B register page width Exception>>Expected Pading Top:450px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B register page width Exception>>Expected Padding:450px");
			count = count + 1;
		}
		// Gutter4width 34px .
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.gutter4locator");
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result: Margin " + padding_left);
			
			Assert.assertEquals(Gutter4Width,padding_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter4width Exception>>Expected Pading Top:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter4width Exception>>Expected Padding:34px");
			count = count + 1;
		}
		
		// Gutter4width 34px .
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.gutter4locator");
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result: Margin " + padding_right);
			
			Assert.assertEquals(Gutter4Width,padding_right);
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter4width Exception>>Expected Pading Top:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter4width Exception>>Expected Padding:34px");
			count = count + 1;
		}
		
		// Gutter2width 40px .
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.gutter2locator");
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result: Margin " + padding_left);
			
			Assert.assertEquals(Gutter2Width,padding_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter2Width Exception>>Expected Pading Top:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter2Width Exception>>Expected Padding:34px");
			count = count + 1;
		}
		
		// Gutter2width 40px .
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.gutter2locator");
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result: Margin " + padding_right);
			
			Assert.assertEquals(Gutter2Width,padding_right);
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter2Width Exception>>Expected Pading Top:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter2Width Exception>>Expected Padding:34px");
			count = count + 1;
		}
		// Gutter1width 10px .
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.gap1Width");
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result: Margin " + padding_left);
			
			Assert.assertEquals(Gap1Width,padding_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter1width Exception>>Expected Pading Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter1width Exception>>Expected Padding:10px");
			count = count + 1;
		}
		
		// verify vSpace1LocatorDateofbirth has the height od 70px (Date of birth).
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.vSpace1LocatorDateofbirth");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result: Margin " + margin_top);
			
			Assert.assertEquals(VSpace1Height,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter1width Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter1width Exception>>Expected Padding:70px");
			count = count + 1;
		}
		// verify gutter89Width has the width of 5px (Day).
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.gutter89WidthDay");
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result: Margin " +padding_right);
			
			Assert.assertEquals(Gutter89Width,padding_right);
		}

		catch (Exception ex) {
			System.out.println("B2B gutter89Width Exception>>Expected Pading Top:5px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B gutter89Width Exception>>Expected Padding:5px");
			count = count + 1;
		}
		
		// verify gutter89Width has the width of 5px (Month).
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.gutter89WidthMonth");
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result: Margin " +padding_right);
			
			Assert.assertEquals(Gutter89Width,padding_right);
		}

		catch (Exception ex) {
			System.out.println("B2B gutter89Width Exception>>Expected Pading Top:5px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B gutter89Width Exception>>Expected Padding:5px");
			count = count + 1;
		}
		// verify VSpace1HeightRescueEmail has the height od 70px (Date of birth).
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.VSpace1HeightRescueEmail");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result: Margin " + margin_top);
			
			Assert.assertEquals(VSpace1Height,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B VSpace1HeightRescueEmail Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B VSpace1HeightRescueEmail Exception>>Expected Padding:70px");
			count = count + 1;
		}	
		// verify TextSpace1heightAboveRescueemail has the height of 35px (Rescue Email).
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.TextSpace1heightAboveRescueemail");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result: Margin " + margin_top);
			
			Assert.assertEquals(ParagraphSpace1Height,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Padding:35px");
			count = count + 1;
		}
		// verify vSpace1HeightEmailPreference has the height od 70px (Above Email Prefrences) .
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.vSpace1HeightEmailPreference");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result: Margin " + margin_top);
			
			Assert.assertEquals(VSpace1Height,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B VSpace1HeightRescueEmail Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B VSpace1HeightRescueEmail Exception>>Expected Padding:70px");
			count = count + 1;
		}	
		// verify textSpace1HeightAboveMidas has the height of 35px (Midas Brand).
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.textSpace1HeightAboveMidas");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result: Margin " + margin_top);
			
			Assert.assertEquals(ParagraphSpace1Height,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Padding:35px");
			count = count + 1;
		}	
		// verify textSpace1HeightAboveMidas has the height of 35px (Midas Brand).
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.textSpace1HeightMidas");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String Line_Height = this.getCSS(locator, "line-height");
			String Height = this.getCSS(locator, "Height");
			
			String locator1 = locatorReader.getLocator("B2B_RegistraionPage.textSpace1Height1MidasLabel");
			String height1 = this.getCSS(locator1, "height");
			
			
			String height_wopx = Line_Height.substring(0, 2);
			String height1_wopx = height1.substring(0, 2);
			int getsubpixel = Integer.parseInt(height1_wopx)+Integer.parseInt(height_wopx);
			String getfinalValue=getsubpixel+"px";
			System.out.println("Actual Result: " + getfinalValue);
			Assert.assertEquals(ParagraphSpace1Height,getfinalValue);
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Padding:35px");
			count = count + 1;
		}
		
		// verify textSpace1HeightAboveMidas has the height of 35px (Midas Brand). //incomplete
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.textspace1Heightabovebuttons");
			String margin_bottom = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result: " + margin_bottom);
			
			String locator1 = locatorReader.getLocator("B2B_RegistraionPage.textSpace1HeightIagreetext");
			String height1 = this.getCSS(locator1, "height");
			String line_height = this.getCSS(locator1, "line-height");
			System.out.println("Actual Result:height " + height1);
			System.out.println("Actual Result:line_height " + line_height);
			
			String locator2 = locatorReader.getLocator("B2B_RegistraionPage.textSpace1HeightIagreetext2");
			String height2 = this.getCSS(locator1, "height");
			System.out.println("Actual Result:line_height " + height2);
			/*String height_wopx = Line_Height.substring(0, 2);
			String height1_wopx = height1.substring(0, 2);
			int getsubpixel = Integer.parseInt(height1_wopx)+Integer.parseInt(height_wopx);
			String getfinalValue=getsubpixel+"px";
			System.out.println("Actual Result: " + getfinalValue);
			Assert.assertEquals(ParagraphSpace1Height,getfinalValue);*/
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Padding:35px");
			count = count + 1;
		}
		// verify vSpace1TextHeight has the height of 70px 
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.v1SpaceHeightRightCol");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Result: padding_bottom" + padding_bottom);
			Assert.assertEquals(VSpace1Height,padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("B2B VSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B VSpace1Height Exception>>Expected Padding:70px");
			count = count + 1;
		}
		
		// verify vSpace1TextHeight has the height of 70px 
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.v1SpaceHeightfooter");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Result: padding_bottom" + margin_bottom);
			Assert.assertEquals(VSpace1Height,margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("B2B VSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B VSpace1Height Exception>>Expected Padding:70px");
			count = count + 1;
		}	
		
		// verify vSpace1TextHeight has the height of 70px 
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.v1SpaceHeightfooter");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Result: padding_bottom" + margin_bottom);
			Assert.assertEquals(VSpace1Height,margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("B2B VSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B VSpace1Height Exception>>Expected Padding:70px");
			count = count + 1;
		}		
		
		
		// verify Gap1 has the height of 10px 
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.cancelbuttonlocator");
			String margin_right = this.getCSS(locator, "margin-right");
			System.out.println("Actual Result: padding_bottomasdasd" + margin_right);
			String locator1 = locatorReader.getLocator("B2B_RegistraionPage.createamusiccode");
			String padding_left = this.getCSS(locator1, "margin-left");
			String border_radius = this.getCSS(locator1, "padding-left");
			System.out.println("Actual Result: padding_bottom" + padding_left);
			System.out.println("Actual Result: padding_bottom" + border_radius);
			//Assert.assertEquals(VSpace1Height,margin_right);
		}

		catch (Exception ex) {
			System.out.println("B2B Gap1 Exception>>Expected Pading Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gap1 Exception>>Expected Padding:10px");
			count = count + 1;
		}	
		
		// verify TextSpace1Height has the height of 35px 
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.TextSpace1Heightabovecancelbutton");
			String margin_top = this.getCSS(locator, "margin-top");
			String min_height = this.getCSS(locator, "min-height");
			
			String locator1 = locatorReader.getLocator("B2B_RegistraionPage.textSpace1HeightIagree");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
			
			String margin_top_wopx = margin_top.substring(0, 2);
			String min_height_wopx = min_height.substring(0, 2);
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(margin_top_wopx)+Integer.parseInt(min_height_wopx)+Integer.parseInt(margin_bottom_wopx);
			String getfinalValue=getsubpixel+"px";
			System.out.println("Actual Result" + getfinalValue);
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Padding:35px");
			count = count + 1;
		}	
		
		// verify TextSpace1Height has the height of 35px 
		try {
			String locator = locatorReader.getLocator("B2B_RegistraionPage.textSpace1HeightIagree");
			String margin_top = this.getCSS(locator, "margin-top");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			
			
			
			String margin_top_wopx = margin_top.substring(0, 2);
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
						
			int getsubpixel = Integer.parseInt(margin_bottom_wopx)-Integer.parseInt(margin_top_wopx);
			int getfinalvalue=Integer.parseInt(margin_bottom_wopx)+getsubpixel;
			
			String getfinalValue1=getfinalvalue+"px";
			System.out.println("Actual Result" + getfinalValue1);
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Padding:35px");
			count = count + 1;
		}
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}


