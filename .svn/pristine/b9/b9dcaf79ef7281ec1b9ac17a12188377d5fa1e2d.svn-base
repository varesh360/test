package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_ViewAccountPage_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_ViewAccountPage_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_ViewAccountPage.xml");
	
	}
	
	//Click on SearchSuggestionField and Enter the Search Product
	public void clickWelcomeIcon()
	
	{
	
		
		String locator = locatorReader.getLocator("B2B_ViewAccountPage.clickwelcomeicon");
		this.WaitForElementEnabled(locator, 50);
		
		clickOn(locator);
		
		
	}
	
  public void ClickViewAccount()
	
	{
	 		String locator = locatorReader.getLocator("B2B_ViewAccountPage.clickViewAccount");
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
	public void ReachUptoB2ViewAccountPage()
	{
		//Click on Cartlink on B2BPage
		this.clickWelcomeIcon();
		this.ClickViewAccount();
			//Click on Write your own button
		//Check page not found
			this.checkPageNotFound();
		
	}
	public void verifyViewAccountPage(String vSpace1Height,String TextSpace1Height, String Textspace3Height, String Gutter16Width, String Gutter8Width, String Gutter17Width,String Gutter9Width)
	{
		
		ReachUptoB2ViewAccountPage();
		int count = 0;
		// Verify vSpace1Height has the height of 70px .
		try {
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.vSpace1HeightHeaderLocator");
			String padding_top = this.getCSS(locator, "padding-top");
			
			System.out.println("Actual Result" +padding_top);
			Assert.assertEquals(vSpace1Height,padding_top);
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
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.vSpace1HeightAboveMyMusicID");
			String padding_left = this.getCSS(locator, "padding-top");
			
			
			String locator1 = locatorReader.getLocator("B2B_ViewAccountPage.vSpace1HeightAboveMyMusicIDtext");
			String margin_top = this.getCSS(locator1, "margin-top");
			String Line_Height = this.getCSS(locator1, "line-height");
			String Height = this.getCSS(locator1, "height");
			String font_size = this.getCSS(locator1, "font-size");
			
		
				
			
			String padding_left_wopx = padding_left.substring(0, 2);
			String Line_Height_wopx = Line_Height.substring(0, 2);
		
			
			int getaddpixel = Integer.parseInt(padding_left_wopx)+ Integer.parseInt(Line_Height_wopx)+Integer.parseInt("4");
				
			
			String getfinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace1Height,getfinalValue);
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
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.vSpace1HeightAboveCustomer");
			String padding_top = this.getCSS(locator, "padding-top");
			
			
			String locator1 = locatorReader.getLocator("B2B_ViewAccountPage.vSpace1HeightAboveCustomer1");
			String margin_top = this.getCSS(locator1, "margin-top");
			String margin_bottom = this.getCSS(locator1, "margin-bottom");
			String Line_height = this.getCSS(locator1, "line-height");
			
			
					
				
			
			String padding_left_wopx = padding_top.substring(0, 2);
			String margin_top_wopx = margin_top.substring(0, 2);
		
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			String Line_height_wopx = Line_height.substring(0, 2);
			
			int getsubspixel = Integer.parseInt(margin_bottom_wopx)-Integer.parseInt(Line_height_wopx);
			int getaddpixel = Integer.parseInt(padding_left_wopx)+ Integer.parseInt(margin_top_wopx)+getsubspixel;
						
			
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace1Height,getfinalValue);
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
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.textSpace1Height");
			String padding_top = this.getCSS(locator, "padding-top");
			String margin_top = this.getCSS(locator, "margin-top");
			String line_height = this.getCSS(locator, "line-height");
			String height = this.getCSS(locator, "height");
			
		
			String line_height_wopx = line_height.substring(0, 2);
					
			int getaddpixel = Integer.parseInt(line_height_wopx)+Integer.parseInt("7");
						
				
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace1Height,getfinalValue);
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
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.textSpace1Height");
			String padding_top = this.getCSS(locator, "padding-top");
			String margin_top = this.getCSS(locator, "margin-top");
			String line_height = this.getCSS(locator, "line-height");
			String height = this.getCSS(locator, "height");
			
		
			String line_height_wopx = line_height.substring(0, 2);
					
			int getaddpixel = Integer.parseInt(line_height_wopx)+Integer.parseInt("7");
						
				
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace1Height,getfinalValue);
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace1Height Error>>Expected Padding:35px");
			count = count + 1;
		}
		
		// Verify Textspace3Height has the height of 70px .
		try {
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.textSpace3Height");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			
			
		
			String line_height_wopx = margin_bottom.substring(0, 2);
					
			int getaddpixel = Integer.parseInt(line_height_wopx)+Integer.parseInt("7");
						
				
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(Textspace3Height,getfinalValue);
		}

		catch (Exception ex) {
			System.out.println("B2B Textspace3Height Exception>>Expected Pading Top:17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Textspace3Height Error>>Expected Padding:17px");
			count = count + 1;
		}
		
		// Verify gutter16Width has the height of 70px .
		try {
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.gutter36width");
			String padding_right = this.getCSS(locator, "padding-right");
		
			System.out.println("padding_right" +padding_right);
			Assert.assertEquals(Gutter16Width,padding_right);			
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B gutter16Width Exception>>Expected Pading Top:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B gutter16Width Error>>Expected Padding:34px");
			count = count + 1;
		}
		
		// Verify gutter16Width has the height of 70px .
		try {
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.gutter36width");
			String padding_left = this.getCSS(locator, "padding-left");
		
			System.out.println("padding_right" +padding_left);
			Assert.assertEquals(Gutter16Width,padding_left);			
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B gutter16Width Exception>>Expected Pading Top:34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B gutter16Width Error>>Expected Padding:34px");
			count = count + 1;
		}
	
		
		// Verify width  450px .
			
		try {
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.gutter36width");
			String width = this.getCSS(locator, "width");
		
			System.out.println("padding_right" +width);
			Assert.assertEquals(Gutter16Width,width);			
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B width Exception>>Expected width:450px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B width Error>>Expected width:450px");
			count = count + 1;
		}
		
		// Verify VSpace1Height has the height of 70px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.vSpace1Heightbelowclosebutton");
			String margin_bottom = this.getCSS(locator, "padding-bottom");
			
			
			String locator1 = locatorReader.getLocator("B2B_ViewAccountPage.vSpace1Heightbelowclosebutton1");
			String padding_bottom = this.getCSS(locator1, "padding-bottom");
			
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			String padding_bottom_wopx = padding_bottom.substring(0, 2);
			
			int getaddpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(padding_bottom_wopx);
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace1Height,getfinalValue);			
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		
	// Verify gutter8Width has width of 40px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.gutter8Width");
			String padding_left = this.getCSS(locator, "padding-left");
			
			System.out.println("Actual result" +padding_left);
			Assert.assertEquals(Gutter8Width,padding_left);	
			
	
		
		}

		catch (Exception ex) {
			System.out.println("B2B gutter8Width Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B gutter8Width Error>>Expected Result:40px");
			count = count + 1;
		}
		
		// Verify gutter8Width has width of 40px .

		try {
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.gutter8Width");
			String padding_right = this.getCSS(locator, "padding-right");
			
			System.out.println("Actual result" +padding_right);
			Assert.assertEquals(Gutter8Width,padding_right);	
			
	
		
		}

		catch (Exception ex) {
			System.out.println("B2B gutter8Width Exception>>Expected Result:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B gutter8Width Error>>Expected Result:40px");
			count = count + 1;
		}
		// Verify Gutter9Width has width of 10px .

		try {
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.gutter9Width");
			String margin_left = this.getCSS(locator, "margin-left");
			
			System.out.println("Actual result" +margin_left);
			Assert.assertEquals(Gutter9Width,margin_left);	
			
	
		
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter9Width Exception>>Expected Result:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter9Width Error>>Expected Result:20px");
			count = count + 1;
		}	
		
		
		// Verify Gap17Width has width of 10px .

		try {
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.gap17width");
			String margin_left = this.getCSS(locator, "margin-left");
			
			System.out.println("Actual result" +margin_left);
			Assert.assertEquals(Gutter17Width,margin_left);	
			
	
		
		}

		catch (Exception ex) {
			System.out.println("B2B Gap17Width Exception>>Expected Result:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gap17Width Error>>Expected Result:10px");
			count = count + 1;
		}
	// Verify VSpace1Height has the height of 70px(Shipt to ) .
		
		try {
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.vSpace1Heightsoldto");
			String margin_bottom = this.getCSS(locator, "padding-bottom");
			String padding_bottom1 = this.getCSS(locator, "margin-bottom");
			
						
			String locator1 = locatorReader.getLocator("B2B_ViewAccountPage.vSpace1Heightsoldtobottom");
			String padding_bottom = this.getCSS(locator1, "padding-bottom");
			
			
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			String padding_bottom_wopx = padding_bottom.substring(0, 2);
			
			int getaddpixel = Integer.parseInt(padding_bottom_wopx)-Integer.parseInt(margin_bottom_wopx)+Integer.parseInt("9");
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace1Height,padding_bottom);
						
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		
		
		// Verify VSpace1Height has the height of 70px footer .
		
		try {
			String locator = locatorReader.getLocator("B2B_ViewAccountPage.vspace1Heightfooter");
			String margin_bottom = this.getCSS(locator, "padding-bottom");
		
			
			
			String locator1 = locatorReader.getLocator("B2B_ViewAccountPage.vspace1Heightfooter1");
			String padding_top = this.getCSS(locator1, "padding-top");
			String margin_top = this.getCSS(locator1, "margin-top");
			
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			String margin_top_wopx = margin_top.substring(0, 2);
			
			int getaddpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(margin_top_wopx);
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace1Height,getfinalValue);
						
			
		
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace1Height Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
		
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
