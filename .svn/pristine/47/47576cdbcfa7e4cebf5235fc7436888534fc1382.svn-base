package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class LifeStyle_HomePage_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public LifeStyle_HomePage_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("LifeStyle_And_HomePage.xml");
	
	}
	
	//Click on SearchSuggestionField and Enter the Search Product
	public void clicklifeStylehomepage()
	
	{
		
		String locator = locatorReader.getLocator("LifeStyle_HomePage.clickentertainmentimage");
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
	public void ReachUptoLifeStyleAndHomePage()
	{
		//Click on Cartlink on B2BPage
		this.clicklifeStylehomepage();
			//Click on Write your own button
		//Check page not found
	this.checkPageNotFound();
		
	}
	public void verifyLifeStylePage(String HomeBillboardWidth,String HomeBillboardHeight,String LineDividerOfimage,String SpotLightImageWidth,String SpotLightImageHeight, String SoptLightImageWidth1)
	{
		
		ReachUptoLifeStyleAndHomePage();
		int count = 0;
	//	String LineDividerOfimage12="2px";
		System.out.println("LineDivider on Helper page"+SoptLightImageWidth1);
		// Verify vSpace1Height has the width of 10px .
		try {
			String locator = locatorReader.getLocator("LifeStyle_HomePage.HomeBillboardlocator");
		

			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			 String GetWidth=Width+"px";
			 System.out.println("GetWidth"+GetWidth);
			 
			 String GetHeight=Height+"px";
			System.out.println("GetHeight"+GetHeight);
			
			//Image image = ImageIO.read(locatorReader.getLocator("LifeStyle_HomePage.HomeBillboardlocator"));

	       // System.out.println("Height: " + image.getHeight(null));
	        
		  
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
			System.out.println("B2B Product review vSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Product review vSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}
		
		try {
			String locator = locatorReader.getLocator("LifeStyle_HomePage.linedivider1");
			
			String padding_right = this.getCSS(locator, "border-right-width");
			
			System.out.println("Actual Result" +padding_right);
		    Assert.assertEquals(LineDividerOfimage,padding_right);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B LineDivider Exception>>Expected Pading Right: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B LineDivider Error>>Expected Padding:2px");
			count = count + 1;
		}

		try {
			String locator = locatorReader.getLocator("LifeStyle_HomePage.linedivider1");
			
			String padding_top = this.getCSS(locator, "border-top-width");
			
			System.out.println("Actual Result" +padding_top);
			System.out.println("LineDivider"+LineDividerOfimage);
		    Assert.assertEquals(LineDividerOfimage,padding_top);
			 
			
		}

		catch (Exception ex) {
			System.out.println("Unified LifeStyle and HomePage Exception>>Expected Pading Right: 2px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Unified LifeStyle and HomePage Exception>>Expected Padding:2px");
			count = count + 1;
		}
		
		//verify spotlight image width should be 722px ( Spotlight First image)
		try {
			String locator = locatorReader.getLocator("LifeStyle_HomePage.spotlightimage");
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
			String GetWidth=Width+"px";
			
			System.out.println("Actual Result" +GetWidth);
			System.out.println("SoptLightImageWidth1"+SoptLightImageWidth1);

		    Assert.assertEquals(SoptLightImageWidth1,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("Unified LifeStyle and HomePage Exception>>Expected Width: 722px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Unified LifeStyle and HomePage Exception>>Expected Width:722px");
			count = count + 1;
		}
		//verify spotlight image height should be 200px ( Spotlight First image)
		try {
			String locator = locatorReader.getLocator("LifeStyle_HomePage.spotlightimage");
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			
	
			System.out.println("Actual Height" +GetHeight);
	
		    Assert.assertEquals(SpotLightImageHeight,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("Unified LifeStyle and HomePage Exception>>Expected Height: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Unified LifeStyle and HomePage Exception>>Expected Height:200px");
			count = count + 1;
		}
		
		//verify spotlight image width should be 722px 2nd Image ( Spotlight First image)
			
		try {
			String locator = locatorReader.getLocator("LifeStyle_HomePage.spotlight2image");
			String Width=this.getAttribute(locator, "naturalWidth");
			System.out.println("Get Value"+Width);
		//	String width = this.getCSS(locator, "width");
			String GetWidth=Width+"px";
				
			System.out.println("Actual Result" +GetWidth);

		    Assert.assertEquals(SoptLightImageWidth1,GetWidth);
			 
			
		}

		catch (Exception ex) {
			System.out.println("Unified LifeStyle and HomePage Exception>>Expected Width: 722px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Unified LifeStyle and HomePage Exception>>Expected Width:722px");
			count = count + 1;
		}
		//verify spotlight image height should be 200px 2nd Image ( Spotlight First image)
		try {
			String locator = locatorReader.getLocator("LifeStyle_HomePage.spotlight2image");
			String Height=this.getAttribute(locator, "naturalHeight");
			System.out.println("Get Height"+Height);
			String GetHeight=Height+"px";
			System.out.println("Actual Height" +GetHeight);
	
		    Assert.assertEquals(SpotLightImageHeight,GetHeight);
			 
			
		}

		catch (Exception ex) {
			System.out.println("Unified LifeStyle and HomePage Exception>>Expected Height: 200px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Unified LifeStyle and HomePage Exception>>Expected Height:200px");
			count = count + 1;
		}
		//Verify Portable Audio Image
		
		
				try {
					String locator = locatorReader.getLocator("LifeStyle_HomePage.spotlight3Image");
					String Width=this.getAttribute(locator, "naturalWidth");
					System.out.println("Get Value"+Width);
				//	String width = this.getCSS(locator, "width");
					String GetWidth=Width+"px";
						
					System.out.println("Actual Result" +GetWidth);

				    Assert.assertEquals(SoptLightImageWidth1,GetWidth);
					 
					
				}

				catch (Exception ex) {
					System.out.println("Unified LifeStyle and HomePage Exception>>Expected Width: 722px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Unified LifeStyle and HomePage Exception>>Expected Width:722px");
					count = count + 1;
				}
				//verify spotlight image height should be 200px 2nd Image ( Spotlight First image)
				try {
					String locator = locatorReader.getLocator("LifeStyle_HomePage.spotlight3Image");
					String Height=this.getAttribute(locator, "naturalHeight");
					System.out.println("Get Height"+Height);
					String GetHeight=Height+"px";
					System.out.println("Actual Height" +GetHeight);
			
				    Assert.assertEquals(SpotLightImageHeight,GetHeight);
					 
					
				}

				catch (Exception ex) {
					System.out.println("Unified LifeStyle and HomePage Exception>>Expected Height: 200px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Unified LifeStyle and HomePage Exception>>Expected Height:200px");
					count = count + 1;
				}

				//Verify Computer Audio

				
				try {
					String locator = locatorReader.getLocator("LifeStyle_HomePage.spotlight4Image");
					String Width=this.getAttribute(locator, "naturalWidth");
					System.out.println("Get Value"+Width);
				//	String width = this.getCSS(locator, "width");
					String GetWidth=Width+"px";
						
					System.out.println("Actual Result" +GetWidth);

				    Assert.assertEquals(SoptLightImageWidth1,GetWidth);
					 
					
				}

				catch (Exception ex) {
					System.out.println("Unified LifeStyle and HomePage Exception>>Expected Width: 722px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Unified LifeStyle and HomePage Exception>>Expected Width:722px");
					count = count + 1;
				}
				//verify spotlight image height should be 200px 2nd Image ( Spotlight First image)
				try {
					String locator = locatorReader.getLocator("LifeStyle_HomePage.spotlight4Image");
					String Height=this.getAttribute(locator, "naturalHeight");
					System.out.println("Get Height"+Height);
					String GetHeight=Height+"px";
					System.out.println("Actual Height" +GetHeight);
			
				    Assert.assertEquals(SpotLightImageHeight,GetHeight);
					 
					
				}

				catch (Exception ex) {
					System.out.println("Unified LifeStyle and HomePage Exception>>Expected Height: 200px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Unified LifeStyle and HomePage Exception>>Expected Height:200px");
					count = count + 1;
				}
//Verify Home Install
				
				try {
					String locator = locatorReader.getLocator("LifeStyle_HomePage.spotlight5Image");
					String Width=this.getAttribute(locator, "naturalWidth");
					System.out.println("Get Value"+Width);
				//	String width = this.getCSS(locator, "width");
					String GetWidth=Width+"px";
						
					System.out.println("Actual Result" +GetWidth);

				    Assert.assertEquals(SoptLightImageWidth1,GetWidth);
					 
					
				}

				catch (Exception ex) {
					System.out.println("Unified LifeStyle and HomePage Exception>>Expected Width: 722px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Unified LifeStyle and HomePage Exception>>Expected Width:722px");
					count = count + 1;
				}
				//verify spotlight image height should be 200px 2nd Image ( Spotlight First image)
				try {
					String locator = locatorReader.getLocator("LifeStyle_HomePage.spotlight5Image");
					String Height=this.getAttribute(locator, "naturalHeight");
					System.out.println("Get Height"+Height);
					String GetHeight=Height+"px";
					System.out.println("Actual Height" +GetHeight);
			
				    Assert.assertEquals(SpotLightImageHeight,GetHeight);
					 
					
				}

				catch (Exception ex) {
					System.out.println("Unified LifeStyle and HomePage Exception>>Expected Height: 200px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Unified LifeStyle and HomePage Exception>>Expected Height:200px");
					count = count + 1;
				}
				
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
		
		


