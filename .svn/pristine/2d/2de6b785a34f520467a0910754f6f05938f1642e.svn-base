package test.java.com.MusicGroup.pagehelper;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class Ask_Question_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public Ask_Question_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("Ask_A_Question_Page.xml");
	
	}
	
	public void ClickSupportLink()
	{
		String locator = locatorReader.getLocator("AskAQuestion.ClickSupportlinkonhomepage");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	//Click on Brand Midas
	public void clickonMidas()
	{
		String locator = locatorReader.getLocator("AskAQuestion.ClickMidasImage");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	// click on contact care
	public void ClickonContactCare() {
		
		String locator = locatorReader.getLocator("AskAQuestion.ClickContactCare");
		this.WaitForElementEnabled(locator, 50);
		
	//	clickOn(locator);
		 String text = driver.findElement(ByLocator(locator)).getAttribute("href");
		driver.navigate().to(text);
		}
	
	public void ClickonContactuse() 
	{
		
		String locator = locatorReader.getLocator("AskAQuestion.clickcontactuslocator");
		this.WaitForElementEnabled(locator, 50);
		
	//	clickOn(locator);
		 String text = driver.findElement(ByLocator(locator)).getAttribute("href");
		driver.navigate().to(text);
		
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
	public void ReachUptoAskAQuestiontPage()
	{
		//Click on the Menu icon
		this.ClickSupportLink();
		//Click on a brand
		this.clickonMidas();
		//Click on a product
		this.ClickonContactCare();
		//Click on contact us link on second page
		this.ClickonContactuse();
		//Check page not found
		this.checkPageNotFound();	
	}

	public void verifyAskAQuestionPage(String vSpace1Height, String vSpace4Height, String Vspace8Height, String Vspace23Height, String BodyCopyLeading, String TextSpace1Height)
	{
		
		ReachUptoAskAQuestiontPage();
		int count = 0;
		// Verify vSpace1Height has the height of 70px on H3 ASK A Question.
		try {
			String locator = locatorReader.getLocator("AskAQuestion.vSpace1Height");
			String padding_top1 = this.getCSS(locator, "padding-top");
			String padding_top1_wopx = padding_top1.substring(0, 2);
			String padding_top = this.getCSS(locator, "padding-top");
			String locator1 = locatorReader.getLocator("AskAQuestion.h3AskAQuestionLocator");
			String Font_size = this.getCSS(locator1, "font-size");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Font_size_wopx = Font_size.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height_wopx)- Integer.parseInt(Font_size_wopx);
			String marginBottom_withPX=getsubpixel+"px";
			int finalvalue=getsubpixel+Integer.parseInt(padding_top1_wopx);
			String finalvaluepixel=finalvalue+"px";
			System.out.println("Actual Result: " + finalvaluepixel);
			Assert.assertEquals(vSpace1Height, finalvaluepixel);
		}

		catch (Exception ex) {
			System.out.println("ASK A Question  vSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("ASK A Question vSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}
		
		// Verify BodyCopyLeading has the height of 40px iSt(Margin Bottom)
			try {

					String locator1 = locatorReader.getLocator("AskAQuestion.h3AskAQuestionLocator");
					String margin_bottom = this.getCSS(locator1, "height");
					String locator2 = locatorReader.getLocator("AskAQuestion.p3textspace1loctor");
					String height = this.getCSS(locator2, "height");
					String line_height = this.getCSS(locator2, "line-height");
					String font_size = this.getCSS(locator2, "font-size");
					String padding_bottom = this.getCSS(locator2, "padding-bottom");
					String height_wopx= height.substring(0, 2);
					String lineheight_wopx= line_height.substring(0, 2);
					String fontsize_wopx= font_size.substring(0, 2);
					String paddingbottom_wopx= padding_bottom.substring(0, 1);
					int addresult = Integer.parseInt(height_wopx)+ Integer.parseInt(paddingbottom_wopx);
					int subresult = Integer.parseInt(lineheight_wopx)+ Integer.parseInt(fontsize_wopx);
					int finalvalue=addresult-subresult;
					String getFinalvalue_wipx=finalvalue+"px";
					System.out.println("Actual Result:" + getFinalvalue_wipx);
					
					Assert.assertEquals(BodyCopyLeading, getFinalvalue_wipx);
				}

				catch (Exception ex) {
					System.out.println("ASK A Question  BodyCopyLeading Exception>>Expected Margin:17px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("ASK A Question BodyCopyLeading Error>>Expected Margin:17px");
					count = count + 1;
				}
				
				// Verify TextSpace1Height has the height of 40px iSt(Margin Bottom)
				try {

					String locator1 = locatorReader.getLocator("AskAQuestion.p3textspace1loctor");
					String height_fst = this.getCSS(locator1, "height");
					String line_height_fst = this.getCSS(locator1, "line-height");
					String font_size_fst = this.getCSS(locator1, "font-size");
					String padding_bottom_fst = this.getCSS(locator1, "padding-bottom");
					String height_wopx = height_fst.substring(0, 2);
					String lineheightfst_wopx = line_height_fst.substring(0, 2);
					String fontsizefst_wopx = font_size_fst.substring(0, 2);
					String paddingBottom_wopx = padding_bottom_fst.substring(0, 1);

					int addresult = Integer.parseInt(lineheightfst_wopx)+ Integer.parseInt(fontsizefst_wopx);
					int add_firstresult = Integer.parseInt(height_wopx)+ Integer.parseInt(paddingBottom_wopx);
					int add_finalfirstresult = add_firstresult - addresult;

					String locator2 = locatorReader.getLocator("AskAQuestion.vspace1Heightifyoucantext");
					String marginTop = this.getCSS(locator2, "margin-top");
					String marginTop_wopx = marginTop.substring(0, 2);
					int addresult_wi_secondLoc = Integer.parseInt(marginTop_wopx)+ add_finalfirstresult;

					String getFinalvalue_wipx = addresult_wi_secondLoc + "px";

					System.out.println("Actual Result:" + getFinalvalue_wipx);

					Assert.assertEquals(TextSpace1Height, getFinalvalue_wipx);
				}

				catch (Exception ex) {
					System.out.println("ASK A Question  TextSpace1Height Exception>>Expected Margin:35px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("ASK A Question TextSpace1Height Error>>Expected Margin:35px");
					count = count + 1;
				}

		// Verify textSpace1Height has the height of 70px on H3 ASK A Question.
		try {
			
			String locator1 = locatorReader.getLocator("AskAQuestion.vSpace1HeightBelowParagraph");
			String margin_top = this.getCSS(locator1, "margin-top");
			String locator2 = locatorReader.getLocator("AskAQuestion.vspace1Heightifyoucantext");
			String padding_bottom = this.getCSS(locator2, "padding-bottom");
      		String MarginTop_wopx = margin_top.substring(0, 2);
		    String PaddingBottom_wopx = padding_bottom.substring(0,1);
		    int getaddedpixel = Integer.parseInt(MarginTop_wopx)+ Integer.parseInt(PaddingBottom_wopx);
			String AddedValue_withPX=getaddedpixel+"px";
			System.out.println("Actual Result: " + AddedValue_withPX);
			Assert.assertEquals(vSpace1Height, AddedValue_withPX);
		}

		catch (Exception ex) {
			System.out.println("ASK A Question  vSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("ASK A Question vSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}
		
		// Verify textSpace4Height has the height of 40px iSt
		try {

			String locator1 = locatorReader.getLocator("AskAQuestion.vspace1heightfirstImage");
			String margin_top = this.getCSS(locator1, "margin-top");
			System.out.println("Actual Result: " + margin_top);
			Assert.assertEquals(vSpace4Height, margin_top);
					}

		catch (Exception ex) {
			System.out.println("ASK A Question  vSpace4Height Exception>>Expected Margin:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("ASK A Question vSpace4Height Error>>Expected Margin:40px");
			count = count + 1;
		}
		
		// Verify textSpace4Height has the height of 40px iSt(Margin Bottom)
		try {

			String locator1 = locatorReader.getLocator("AskAQuestion.vspace1heightfirstImage");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
			System.out.println("Actual Result:" + margin_bottom);
			Assert.assertEquals(vSpace4Height, margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("ASK A Question  vSpace4Height Exception>>Expected Margin:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("ASK A Question vSpace4Height Error>>Expected Margin:40px");
			count = count + 1;
		}
		// Verify Vspace8Height has the height of 23px 0th Image
		try {

			String locator1 = locatorReader.getLocator("AskAQuestion.vspace8height");
			String height = this.getCSS(locator1, "height");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			String Height_wopx = height.substring(0, 2);
			String fontsize_wopx= font_size.substring(0, 2);
			String lineheight_wopx= line_height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Height_wopx)- Integer.parseInt(fontsize_wopx);
			int getsecondsubpixel = Integer.parseInt(lineheight_wopx)- getsubpixel;
			
			String locator2 = locatorReader.getLocator("AskAQuestion.vspace8height1stimage");
			String Image_margin_bottom = this.getCSS(locator2, "margin-bottom");
			String ImageMargin_Bottom_wopx= Image_margin_bottom.substring(0, 2);
			int getaddpixel = Integer.parseInt(ImageMargin_Bottom_wopx)+ getsecondsubpixel;
			String getfinalvalue_wipx=getaddpixel+"px";
			System.out.println("Actual Result: " + getfinalvalue_wipx);
			Assert.assertEquals(Vspace8Height, getfinalvalue_wipx);
			
		}

		catch (Exception ex) {
			System.out.println("ASK A Question  Vspace8Height Exception>>Expected Margin:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("ASK A Question Vspace8Height Error>>Expected Margin:23px");
			count = count + 1;
		}
		
		// Verify Vspace8Height has the height of 23px 1st Image
		try {

			String locator1 = locatorReader.getLocator("AskAQuestion.vspace8height2col");
			String height = this.getCSS(locator1, "height");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			String Height_wopx = height.substring(0, 2);
			String fontsize_wopx= font_size.substring(0, 2);
			String lineheight_wopx= line_height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Height_wopx)- Integer.parseInt(fontsize_wopx);
			int getsecondsubpixel = Integer.parseInt(lineheight_wopx)- getsubpixel;
			
			String locator2 = locatorReader.getLocator("AskAQuestion.vspace8height2ndimage");
			String Image_margin_bottom = this.getCSS(locator2, "margin-bottom");
			String ImageMargin_Bottom_wopx= Image_margin_bottom.substring(0, 2);
			int getaddpixel = Integer.parseInt(ImageMargin_Bottom_wopx)+ getsecondsubpixel;
			String getfinalvalue_wipx=getaddpixel+"px";
			System.out.println("Height: " + getfinalvalue_wipx);
			Assert.assertEquals(Vspace8Height, getfinalvalue_wipx);
			
		}

		catch (Exception ex) {
			System.out.println("ASK A Question  Vspace8Height Exception>>Expected Margin:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("ASK A Question Vspace8Height Error>>Expected Margin:23px");
			count = count + 1;
		}
		// Verify Vspace8Height has the height of 23px 2nd Image
		try {

			String locator1 = locatorReader.getLocator("AskAQuestion.vspace8height3col");
			String height = this.getCSS(locator1, "height");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			String Height_wopx = height.substring(0, 2);
			String fontsize_wopx= font_size.substring(0, 2);
			String lineheight_wopx= line_height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Height_wopx)- Integer.parseInt(fontsize_wopx);
			int getsecondsubpixel = Integer.parseInt(lineheight_wopx)- getsubpixel;
			
			String locator2 = locatorReader.getLocator("AskAQuestion.vspace8height3rdimage");
			String Image_margin_bottom = this.getCSS(locator2, "margin-bottom");
			String ImageMargin_Bottom_wopx= Image_margin_bottom.substring(0, 2);
			int getaddpixel = Integer.parseInt(ImageMargin_Bottom_wopx)+ getsecondsubpixel;
			String getfinalvalue_wipx=getaddpixel+"px";
			System.out.println("Height: " + getfinalvalue_wipx);
			Assert.assertEquals(Vspace8Height, getfinalvalue_wipx);
			
		}

		catch (Exception ex) {
			System.out.println("ASK A Question  Vspace8Height Exception>>Expected Margin:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("ASK A Question Vspace8Height Error>>Expected Margin:23px");
			count = count + 1;
		}
		
		// Verify Vspace8Height has the height of 23px 3rd Image
		try {

			String locator1 = locatorReader.getLocator("AskAQuestion.vspace8height4col");
			String height = this.getCSS(locator1, "height");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			String Height_wopx = height.substring(0, 2);
			String fontsize_wopx= font_size.substring(0, 2);
			String lineheight_wopx= line_height.substring(0, 2);
			int getsubpixel = Integer.parseInt(Height_wopx)- Integer.parseInt(fontsize_wopx);
			int getsecondsubpixel = Integer.parseInt(lineheight_wopx)- getsubpixel;
			
			String locator2 = locatorReader.getLocator("AskAQuestion.vspace8height4thimage");
			String Image_margin_bottom = this.getCSS(locator2, "margin-bottom");
			String ImageMargin_Bottom_wopx= Image_margin_bottom.substring(0, 2);
			int getaddpixel = Integer.parseInt(ImageMargin_Bottom_wopx)+ getsecondsubpixel;
			String getfinalvalue_wipx=getaddpixel+"px";
			System.out.println("Actual Result " + getfinalvalue_wipx);
			Assert.assertEquals(Vspace8Height, getfinalvalue_wipx);
			
		}

		catch (Exception ex) {
			System.out.println("ASK A Question  Vspace8Height Exception>>Expected Margin:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("ASK A Question Vspace8Height Error>>Expected Margin:23px");
			count = count + 1;
		}
		// Verify vSpace23Height has the height of 15px 
		try {

			String locator1 = locatorReader.getLocator("AskAQuestion.vspace23Heightcoyright");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
			String line_height = this.getCSS(locator1, "line-height");
			String marginBottom_wopx = margin_bottom.substring(0, 2);
			String lineheight_wopx= line_height.substring(0, 2);
			int getsubpixel = Integer.parseInt(lineheight_wopx)- Integer.parseInt(marginBottom_wopx);
			String locator2 = locatorReader.getLocator("AskAQuestion.vSpace23Heightfooter");
			String padding_top = this.getCSS(locator2, "padding-top");
			String paddingtop_wopx= padding_top.substring(0, 1);
			int paddingtop_wopxint=Integer.parseInt(paddingtop_wopx);
		    int getaddpixel = paddingtop_wopxint+getsubpixel;
		    System.out.println("Actual Result" + getaddpixel);
			String getaddpixel_px=getaddpixel+"px";
			System.out.println("Actual Result" + getaddpixel_px);
			Assert.assertEquals(Vspace23Height, getaddpixel_px);
			
		}
		

		catch (Exception ex) {
			System.out.println("ASK A Question  vSpace23Height Exception>>Expected Result:15px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("ASK A Question vSpace23Height Error>>Expected Resut:15px");
			count = count + 1;
		}
				System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
