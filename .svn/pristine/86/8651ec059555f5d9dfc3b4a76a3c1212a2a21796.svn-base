package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class Creation_HomePage_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public Creation_HomePage_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("Creating_Home.xml");
	
	}
	
	//Click on SearchSuggestionField and Enter the Search Product
	public void clickCreationpage()
	
	{
		
		String locator = locatorReader.getLocator("Creating_HomePage.clickCreationimage");
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
		//Click on Cartlink on B2BPage
		this.clickCreationpage();
			//Click on Write your own button
		//Check page not found
	this.checkPageNotFound();
		
	}
	public void verifycreationHomepage(String HomeBillboardWidth,String HomeBillboardHeight,String LineDivider,String SpotLightImageWidth,String SpotLightImageHeight)
	{
		
		ReachUptoCreationHomePage();
		int count = 0;
		// Verify vSpace1Height has the width of 10px .
		try {
			String locator = locatorReader.getLocator("Creating_HomePage.HomeBillboardlocator");
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			 String GetWidth=Width+"px";
			 System.out.println("GetWidth"+GetWidth);
			 
			 String GetHeight=Height+"px";
			System.out.println("GetHeight"+GetHeight);
			/*
			String width = this.getCSS(locator, "width");
			String height = this.getCSS(locator, "height");
			String min_width = this.getCSS(locator, "min-width");
			String min_height = this.getCSS(locator, "min-height");
			System.out.println("width " +width);
			System.out.println("height" +height);
			System.out.println("min_width " +min_width);
			System.out.println("min_height" +min_height);
			Dimension dimesions=driver.findElement(By.xpath(locatorReader.getLocator("Enterprise_Entertainment.HomeBillboardlocator"))).getSize();
			System.out.println("Width : "+dimesions);
			*/
			//Image image = ImageIO.read(locatorReader.getLocator("Enterprise_Entertainment.HomeBillboardlocator"));

	       // System.out.println("Height: " + image.getHeight(null));
	        
			//System.out.println("Width : "+dimesions.width);
		//	System.out.println("Height : "+dimesions.height);  
			/*String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			System.out.println("margin_top_wopx" +margin_top_wopx);
			System.out.println("line_height_wopx" +line_height_wopx);
			int getsubpixel = Integer.parseInt(margin_top_wopx)- Integer.parseInt(line_height_wopx);
			int getaddpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel;
			
			String getfinalValue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalValue);
			//Assert.assertEquals(vSpace1Height,getfinalValue);
			 * 
			 * 
			 * */
			
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Creation Home Page Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Creation Home Page Error>>Expected Padding:70px");
			count = count + 1;
		}
		
		try {
			String locator = locatorReader.getLocator("Creating_HomePage.linedivider");
			
			String padding_right = this.getCSS(locator, "padding-right");
			
			System.out.println("Actual Result" +padding_right);
		    Assert.assertEquals(LineDivider,padding_right);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Creation Home Page Exception>>Expected Pading Right: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Creation Home Page Error>>Expected Padding:2px");
			count = count + 1;
		}

		try {
			String locator = locatorReader.getLocator("Creating_HomePage.linedivider");
			
			String padding_top = this.getCSS(locator, "padding-top");
			
			System.out.println("Actual Result" +padding_top);
		    Assert.assertEquals(LineDivider,padding_top);
			 
			
		}

		catch (Exception ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Pading Right: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Padding:2px");
			count = count + 1;
		}
		
		//verify spotlight image width should be 722px ( Spotlight First image)
		try {
			String locator = locatorReader.getLocator("Creating_HomePage.spotlightimage");
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
		//	String width = this.getCSS(locator, "width");
			String GetWidth=Width+"px";
				
			System.out.println("Actual Result" +GetWidth);

		    Assert.assertEquals(SpotLightImageWidth,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Width: 722px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Width:722px");
			count = count + 1;
		}
		//verify spotlight image height should be 200px ( Spotlight First image)
		try {
			String locator = locatorReader.getLocator("Creating_HomePage.spotlightimage");
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			
			//String height = this.getCSS(locator, "height");
			System.out.println("Actual Height" +GetHeight);
		
		    Assert.assertEquals(SpotLightImageHeight,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Height: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Height:200px");
			count = count + 1;
		}
		
		//verify spotlight image width should be 722px 2nd Image ( Spotlight First image)
			
		try {
			String locator = locatorReader.getLocator("Creating_HomePage.spotlight2image");
		//	String width = this.getCSS(locator, "width");
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
		//	String width = this.getCSS(locator, "width");
			String GetWidth=Width+"px";
				
			System.out.println("Actual Result" +GetWidth);
			//System.out.println("Actual Result" +GetWidth);

		    Assert.assertEquals(SpotLightImageWidth,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Width: 722px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Width:722px");
			count = count + 1;
		}
		//verify spotlight image height should be 200px 2nd Image ( Spotlight First image)
		try {
			String locator = locatorReader.getLocator("Creating_HomePage.spotlight2image");
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			
			//String height = this.getCSS(locator, "height");
			System.out.println("Actual Height" +GetHeight);
			
		    Assert.assertEquals(SpotLightImageHeight,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Height: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Height:200px");
			count = count + 1;
		}
		
		//Verify Portable Sound
		
		try {
			String locator = locatorReader.getLocator("Creating_HomePage.SpotLightImage3");
		//	String width = this.getCSS(locator, "width");
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
		//	String width = this.getCSS(locator, "width");
			String GetWidth=Width+"px";
			String wopx=SpotLightImageWidth.substring(0, 3);
			int SpotLightHeight=Integer.parseInt(wopx)-Integer.parseInt("1");
			System.out.println("SpotLightHeight"+SpotLightHeight);
			String GetImageHeight=SpotLightHeight+"px";
			System.out.println("GetImageHeight"+GetImageHeight);
				
			System.out.println("Actual Result" +GetWidth);
			//System.out.println("Actual Result" +GetWidth);
System.out.println("SpotLightImageWidth"+GetImageHeight);
		    Assert.assertEquals(GetImageHeight,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Width: 722px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Width:722px");
			count = count + 1;
		}
		//verify spotlight image height should be 200px 2nd Image ( Spotlight First image)
		try {
			String locator = locatorReader.getLocator("Creating_HomePage.SpotLightImage3");
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			
			//String height = this.getCSS(locator, "height");
			System.out.println("Actual Height" +GetHeight);
		
	
		    Assert.assertEquals(SpotLightImageHeight,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Height: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Unified Creation Home Page Exception>>Expected Height:200px");
			count = count + 1;
		}

		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
		
		

