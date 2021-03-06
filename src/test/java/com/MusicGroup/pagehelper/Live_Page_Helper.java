package test.java.com.MusicGroup.pagehelper;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class Live_Page_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public Live_Page_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("Live_Page.xml");
	
	}
	
	//Click on entertainment page
		public void clickEntertainmentpage()
		
		{
			String locator = locatorReader.getLocator("Live_HomePage.clickEntertainmanetimage");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
			
			
		}
		
		//click Live page
		public void clickLivepage()
		
		{
			String locator = locatorReader.getLocator("Live_HomePage.clickinstallimage");
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
		public void ReachUptoLiveHomePage()
		{
			//Click on entertainment page
			this.clickEntertainmentpage();
			//click install page
			this.clickLivepage();
			//Check page not found
		   this.checkPageNotFound();
			
		}
	public void verifyLivePage(String HomeBillboardWidth,String HomeBillboardHeight,String LineDivider,String SpotLightImageWidth,String SpotLightImageHeight)
	{
		
		ReachUptoLiveHomePage();
		int count = 0;
		// Verify HomeBillboard has the width of 1446px .
		try {
			String locator = locatorReader.getLocator("Live_HomePage.HomeBillboardlocator");
			
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
			String locator = locatorReader.getLocator("Live_HomePage.HomeBillboardlocator");
			
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
		// Verify Line Divider has the height of 2px .
		try {
			String locator = locatorReader.getLocator("Live_HomePage.linedivide");
				
			String padding_right = this.getCSS(locator, "padding-right");
									
			System.out.println("Actual result: "+padding_right);
			Assert.assertEquals(LineDivider,padding_right);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  Line Divider Exception>>Expected Width: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Line Divider Error>>Expected Width:2px");
			count = count + 1;
		}
		// Verify Line Divider has the height of 2px .
		try {
			String locator = locatorReader.getLocator("Live_HomePage.linedivide");
				
			String padding_top = this.getCSS(locator, "padding-top");
								
			System.out.println("Actual result: "+padding_top);
			Assert.assertEquals(LineDivider,padding_top);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  Line Divider Exception>>Expected Width: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Line Divider Error>>Expected Width:2px");
			count = count + 1;
		}	
		// Verify SpotLightImage has the height of 200px .(First Image)
						
		try {
			String locator = locatorReader.getLocator("Live_HomePage.spotlightimage");
				
		//	String Height = this.getCSS(locator, "height");
			
			
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
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Height: 200px");
			count = count + 1;
		}
		// Verify SpotLightImage has the width of 722px .(First Image)
		try {
			String locator = locatorReader.getLocator("Live_HomePage.spotlightimage");
				
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";
			
			System.out.println("Actual result: "+GetWidth);
						
			Assert.assertEquals(SpotLightImageWidth,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageWidth Exception>>Expected Width: 722px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:722px");
			count = count + 1;
		}	
				// Verify Line Divider has the height of 2px (Second Image) .
		try {
			String locator = locatorReader.getLocator("Live_HomePage.linedivide1");
				
			String padding_top = this.getCSS(locator, "padding-top");
								
			System.out.println("Actual result: "+padding_top);
			Assert.assertEquals(LineDivider,padding_top);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  Line Divider Exception>>Expected Width: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Line Divider Error>>Expected Width:2px");
			count = count + 1;
		}	
		// Verify SpotLightImage has the height of 200px .(Second Image)
						
		try {
			String locator = locatorReader.getLocator("Live_HomePage.spotlight2image");
				
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
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Height: 200px");
			count = count + 1;
		}
		// Verify SpotLightImage has the width of 722px .(Second Image)
		try {
			String locator = locatorReader.getLocator("Live_HomePage.spotlight2image");
				
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";
			System.out.println("Actual result: "+GetWidth);
						
			Assert.assertEquals(SpotLightImageWidth,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageWidth Exception>>Expected Width: 722px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:722px");
			count = count + 1;
		}	
			
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
		
		



