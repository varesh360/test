package test.java.com.MusicGroup.pagehelper;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class Install_Page_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public Install_Page_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("Install_Page.xml");
	
	}
	
	//Click on entertainment page
	public void clickEntertainmentpage()
	
	{
		String locator = locatorReader.getLocator("Install_HomePage.clickEntertainmanetimage");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		
		
	}
	
	//click install page
	public void clickInstallpage()
	
	{
		String locator = locatorReader.getLocator("Install_HomePage.clickinstallimage");
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
		//Click on entertainment page
		this.clickEntertainmentpage();
		//click install page
		this.clickInstallpage();
		//Check page not found
	   this.checkPageNotFound();
		
	}
	public void verifyinstallHomepage(String HomeBillboardWidth,String HomeBillboardHeight,String LineDivider,String SpotLightImageWidthB,String SpotLightImageHeightB,String SpotLightImageWidthC,String SpotLightImageHeightC)
	{
		
		ReachUptoCreationHomePage();
		int count = 0;
		// Verify HomeBillboard has the width of 1446px .
		try {
			String locator = locatorReader.getLocator("Install_HomePage.HomeBillboardlocator");
			
			//String width = this.getCSS(locator, "width");
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
		//	System.out.println("Actual Result:      " +width);
			 String GetWidth=Width+"px";
		//	 System.out.println("GetWidth"+GetWidth);
			 System.out.println("Actual Result:      " +GetWidth);
			 
			 System.out.println("HomeBillboardWidth"+HomeBillboardWidth);
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
			String locator = locatorReader.getLocator("Install_HomePage.HomeBillboardlocator");
			
			//String Height = this.getCSS(locator, "height");
			/*
			String max_Height = this.getCSS(locator, "max-height");
			String min_Height = this.getCSS(locator, "min-height");
			
			System.out.println("Actual Result:      " +Height);
			System.out.println("Max Height:      " +max_Height);
			System.out.println("Min Height:      " +min_Height);
			*/

			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			 String GetHeight=Height+"px";
				System.out.println("GetHeight"+GetHeight);
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
			String locator = locatorReader.getLocator("Install_HomePage.linedivide");
				
			String border_right = this.getCSS(locator, "border-top-width");
									
			System.out.println("Actual result: "+border_right);
			Assert.assertEquals(LineDivider,border_right);
			 
			
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
			String locator = locatorReader.getLocator("Install_HomePage.linedivide");
				
			String border_right = this.getCSS(locator, "border-right-width");
								
			System.out.println("Actual result: "+border_right);
			Assert.assertEquals(LineDivider,border_right);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  Line Divider Exception>>Expected Width: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage Line Divider Error>>Expected Width:2px");
			count = count + 1;
		}	
		
		// Verify SpotLightImage has the height of 158px .(First Image)
						
		try {
			String locator = locatorReader.getLocator("Install_HomePage.spotlight2image");
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			
	
			System.out.println("Actual Height" +GetHeight);
			
		/*	
			String height_wopx = Height.substring(0, 3);
			String height_wipx=height_wopx+"px";
			*/
			System.out.println("Actual result: "+GetHeight);
						
			Assert.assertEquals(SpotLightImageHeightB,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageHeight Exception>>Expected Width: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:200px");
			count = count + 1;
		}
		// Verify SpotLightImage has the width of 200px .(First Image)
		try {
			String locator = locatorReader.getLocator("Install_HomePage.spotlight2image");
				
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";
			
			System.out.println("Actual Result" +GetWidth);
		//	System.out.println("Actual result: "+GetWidth);
						System.out.println("SpotLightImageWidthB"+SpotLightImageWidthB);
			Assert.assertEquals(SpotLightImageWidthB,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageWidth Exception>>Expected Width: 158px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:158px");
			count = count + 1;
		}	
		// Verify SpotLightImage has the height of 158px .(Second Image)
		
		try {
			String locator = locatorReader.getLocator("Install_HomePage.spotlight3image");
				
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			
	
			System.out.println("Actual Height" +GetHeight);
			
			System.out.println("--Actual result: --"+SpotLightImageHeightB);			
			Assert.assertEquals(SpotLightImageHeightB,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageHeight Exception>>Expected Width: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:200px");
			count = count + 1;
		}
		// Verify SpotLightImage has the width of 200px .(Second Image)
		try {
			String locator = locatorReader.getLocator("Install_HomePage.spotlight3image");
				
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";
			
			System.out.println("Actual Result" +GetWidth);
			System.out.println("--Actual result: --"+SpotLightImageHeightB);			
			Assert.assertEquals(SpotLightImageWidthB,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageWidth Exception>>Expected Width: 158px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:158px");
			count = count + 1;
		}	
						
		// Verify SpotLightImage has the height of 158px .(Third Image)
		try {
			String locator = locatorReader.getLocator("Install_HomePage.spotlight4image");
				
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			
	
			System.out.println("Actual Height" +GetHeight);
			//System.out.println("Actual result: "+height_wipx);
						
			Assert.assertEquals(SpotLightImageHeightB,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageHeight Exception>>Expected Width: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:200px");
			count = count + 1;
		}
		// Verify SpotLightImage has the width of 200px .(Third Image )
		try {
			String locator = locatorReader.getLocator("Install_HomePage.spotlight4image");
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";
			
			System.out.println("Actual Result" +GetWidth);
		//	System.out.println("Actual result: "+height_wipx);
						
			Assert.assertEquals(SpotLightImageWidthB,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageWidth Exception>>Expected Width: 158px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:158px");
			count = count + 1;
		}	
		// Verify SpotLightImage has the height of 158px .(Fourth Image)
		try {
			String locator = locatorReader.getLocator("Install_HomePage.spotlight5image");
				
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			
	
			System.out.println("Actual Height" +GetHeight);
			Assert.assertEquals(SpotLightImageHeightB,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageHeight Exception>>Expected Width: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:200px");
			count = count + 1;
		}
		// Verify SpotLightImage has the width of 200px .(Fourth Image)
		try {
			String locator = locatorReader.getLocator("Install_HomePage.spotlight5image");
				
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";
			
			System.out.println("Actual Result" +GetWidth);
			Assert.assertEquals(SpotLightImageWidthB,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageWidth Exception>>Expected Width: 158px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:158px");
			count = count + 1;
		}	
		// Verify SpotLightImage has the height of 158px .(Fifth Image)
							
		try {
			String locator = locatorReader.getLocator("Install_HomePage.spotlight6image");
				
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			
	
			System.out.println("Actual Height" +GetHeight);
						
			Assert.assertEquals(SpotLightImageHeightB,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageHeight Exception>>Expected Width: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:200px");
			count = count + 1;
		}
		// Verify SpotLightImage has the width of 200px .(Fifth Image)
		try {
			String locator = locatorReader.getLocator("Install_HomePage.spotlight6image");
				
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";
			
			System.out.println("Actual Result" +GetWidth);
			//System.out.println("Actual result: "+height_wipx);
						
			Assert.assertEquals(SpotLightImageWidthB,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageWidth Exception>>Expected Width: 158px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:158px");
			count = count + 1;
		}	
		// Verify SpotLightImage has the height of 158px .(Sixth Image)
		try {
			String locator = locatorReader.getLocator("Install_HomePage.spotlight7image");
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			
	
			System.out.println("Actual Height" +GetHeight);
						
			Assert.assertEquals(SpotLightImageHeightB,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageHeight Exception>>Expected Width: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:200px");
			count = count + 1;
		}
		// Verify SpotLightImage has the width of 200px .(Sixth Image)
		try {
			String locator = locatorReader.getLocator("Install_HomePage.spotlight7image");
				
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";
			
			System.out.println("Actual Result" +GetWidth);
						
			Assert.assertEquals(SpotLightImageWidthB,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Install HomePage  SpotLightImageWidth Exception>>Expected Width: 158px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Install HomePage SpotLightImageWidth Error>>Expected Width:158px");
			count = count + 1;
		}	
	
	

				
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
