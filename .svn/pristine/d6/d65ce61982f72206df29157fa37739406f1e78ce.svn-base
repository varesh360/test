package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class MusicInstrument_Page_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public MusicInstrument_Page_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("MusicInstrument_Page.xml");
	
	}
	
	//Click on Creation Page
	public void clickCreationPage()
	
	{
		String locator = locatorReader.getLocator("MusicalInstrument_HomePage.clickCreationimage");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		
		
	}
	
	//Click Musical Instrument Page
	public void clickMusicalInstrumentpage()
	
	{
		String locator = locatorReader.getLocator("MusicalInstrument_HomePage.clickMusicalIntrumentimage");
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
	public void ReachUptoMusicalInstrumentHomePage()
	{
		//Click on Creation page
		this.clickCreationPage();
		//click Musical Instrument page
		this.clickMusicalInstrumentpage();
		//Check page not found
	   this.checkPageNotFound();
		
	}
	public void verifyMusicInstrumentHomepage(String HomeBillboardWidth,String HomeBillboardHeight,String LineDivider,String SpotLightImageWidth,String SpotLightImageHeight)
	{
		
		ReachUptoMusicalInstrumentHomePage();
		int count = 0;
		// Verify HomeBillboard has the width of 1446px .
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.HomeBillboardlocator");
			
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			 String GetWidth=Width+"px";
			
			System.out.println("Actual Result:      " +GetWidth);
		    Assert.assertEquals(HomeBillboardWidth,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage Exception>>Expected Width: 1445px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Error>>Expected Width:1445px");
			count = count + 1;
		}
		// Verify HomeBillboard has the height of 725px .
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.HomeBillboardlocator");
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			 String GetHeight=Height+"px";
			System.out.println("Actual Result:      " +GetHeight);
			Assert.assertEquals(HomeBillboardHeight,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage Exception>>Expected Width: 725px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Error>>Expected Width:725px");
			count = count + 1;
		}
		// Verify Line Divider has the right width of 2px (First Image) .
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.linedivide1");
				
			String border_top_width = this.getCSS(locator, "border-top-width");
				
						
			System.out.println("Actual result: "+border_top_width);
			Assert.assertEquals(LineDivider,border_top_width);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  Line Divider Exception>>Expected Width: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Line Divider Error>>Expected Width:2px");
			count = count + 1;
		}
		// Verify Line Divider has the top height of 2px(First Image) .
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.linedivide1");
				
			String border_right_width = this.getCSS(locator, "border-right-width");
								
			System.out.println("Actual result: "+border_right_width);
			Assert.assertEquals(LineDivider,border_right_width);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  Line Divider Exception>>Expected Width: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Line Divider Error>>Expected Width:2px");
			count = count + 1;
		}
		
		// Verify Line Divider has the right width of 2px (Second Image) .
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.linedivide2");
				
			String border_top_width = this.getCSS(locator, "border-top-width");
				
						
			System.out.println("Actual result: "+border_top_width);
			Assert.assertEquals(LineDivider,border_top_width);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  Line Divider Exception>>Expected Width: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Line Divider Error>>Expected Width:2px");
			count = count + 1;
		}
		// Verify Line Divider has the top height of 2px(Second Image) .
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.linedivide2");
				
			String border_right_width = this.getCSS(locator, "border-right-width");
								
			System.out.println("Actual result: "+border_right_width);
			Assert.assertEquals(LineDivider,border_right_width);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  Line Divider Exception>>Expected Width: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Line Divider Error>>Expected Width:2px");
			count = count + 1;
		}
		// Verify Line Divider has the right width of 2px (Third Image) .
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.linedivide3");
				
			String border_top_width = this.getCSS(locator, "border-top-width");
				
						
			System.out.println("Actual result: "+border_top_width);
			Assert.assertEquals(LineDivider,border_top_width);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  Line Divider Exception>>Expected Width: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Line Divider Error>>Expected Width:2px");
			count = count + 1;
		}
		// Verify Line Divider has the top height of 2px(Third Image) .
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.linedivide3");
				
			String border_right_width = this.getCSS(locator, "border-right-width");
								
			System.out.println("Actual result: "+border_right_width);
			Assert.assertEquals(LineDivider,border_right_width);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  Line Divider Exception>>Expected Width: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Line Divider Error>>Expected Width:2px");
			count = count + 1;
		}	
		
		// Verify Line Divider has the right width of 2px (fourth Image) .
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.linedivide4");
				
			String border_top_width = this.getCSS(locator, "border-top-width");
				
						
			System.out.println("Actual result: "+border_top_width);
			Assert.assertEquals(LineDivider,border_top_width);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  Line Divider Exception>>Expected Width: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Line Divider Error>>Expected Width:2px");
			count = count + 1;
		}
		
		/*
		// Verify Line Divider has the top height of 2px(fourth Image) .
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.linedivide4");
				
			String border_right_width = this.getCSS(locator, "border-right-width");
								
			System.out.println("Actual result: "+border_right_width);
			Assert.assertEquals(LineDivider,border_right_width);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  Line Divider Exception>>Expected Width: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Line Divider Error>>Expected Width:2px");
			count = count + 1;
		}	
		*/
					
	// Verify SpotLightImage has the height of 200px(First Image)
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.spotlight1image");
				
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			System.out.println("Actual result: "+GetHeight);
						
			Assert.assertEquals(SpotLightImageHeight,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageHeight Exception>>Expected Height: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageHeight Error>>Expected Height:200px");
			count = count + 1;
		}
		// Verify SpotLightImage has the width of 200px(First Image)SpotLightImageWidth
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.spotlight1image");
				
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";
			
			System.out.println("Actual result: "+GetWidth);
						
			Assert.assertEquals(SpotLightImageWidth,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageWidth Exception>>Expected Height: 360px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Height:360px");
			count = count + 1;
		}			

		// Verify SpotLightImage has the height of 200px(Second Image)
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.spotlight2image");
				
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			System.out.println("Actual result: "+GetHeight);
						
			Assert.assertEquals(SpotLightImageHeight,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageHeight Exception>>Expected Height: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageHeight Error>>Expected Height:200px");
			count = count + 1;
		}
		// Verify SpotLightImage has the width of 360px(Second Image)
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.spotlight2image");
				
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";
			System.out.println("Actual result: "+GetWidth);
						
			Assert.assertEquals(SpotLightImageWidth,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageWidth Exception>>Expected Height: 360px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Height:360px");
			count = count + 1;
		}			
		// Verify SpotLightImage has the height of 200px(Third Image)
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.spotlight3image");
				
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			System.out.println("Actual result: "+GetHeight);
						
			Assert.assertEquals(SpotLightImageHeight,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageHeight Exception>>Expected Height: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageHeight Error>>Expected Height:200px");
			count = count + 1;
		}
		// Verify SpotLightImage has the width of 360px(Third Image)
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.spotlight3image");
				
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";
			System.out.println("Actual result: "+GetWidth);
						
			Assert.assertEquals(SpotLightImageWidth,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageWidth Exception>>Expected Height: 360px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Height:360px");
			count = count + 1;
		}			
		// Verify SpotLightImage has the height of 200px(fourth Image)
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.spotlight4image");
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			System.out.println("Actual result: "+GetHeight);
						
			Assert.assertEquals(SpotLightImageHeight,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageHeight Exception>>Expected Height: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageHeight Error>>Expected Height:200px");
			count = count + 1;
		}
		// Verify SpotLightImage has the width of 360px(fourth Image)
		try {
			String locator = locatorReader.getLocator("MusicalInstrument_HomePage.spotlight4image");
				
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";

			System.out.println("Actual result: "+GetWidth);
						
			Assert.assertEquals(SpotLightImageWidth,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageWidth Exception>>Expected Height: 360px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Height:360px");
			count = count + 1;
		}		


		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
