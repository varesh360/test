package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_ForgotMusicId_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_ForgotMusicId_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_ForgotMusicId.xml");
	
	}
	
	//Click on ForgotPassword
	public void clickForgotPassword()
	
	{
	
		String locator = locatorReader.getLocator("ForgotPassword.ClickForgotPassword");
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

	//Reach upto B2BStoreAccount
	public void ReachUptoB2BStoreAccount()
	{
		
		//Check page not found
		this.checkPageNotFound();
		//Click on Cartlink on B2BPage
		this.clickForgotPassword();
		//Check page not found
		this.checkPageNotFound();
		
		
	}
	public void verifyForgotMusicID(String vSpace1Height,String TextSpace1Height,String TextSpace3Height,String Gutter16Width,String Width,String Gutter2Width,String textSpace10Height,String gap17width)
	{
		
		ReachUptoB2BStoreAccount();
		int count = 0;
		
		// Verify vSpace1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("ForgotPassword.vSpace1Height");
			String padding_top = this.getCSS(locator, "padding-top");
			
						
			System.out.println("Actual Result" +padding_top);
			Assert.assertEquals(vSpace1Height,padding_top);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace1Height Exception>>Expected :70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace1Height Error>>Expected :70px");
			count = count + 1;
		}
		
		
		// Verify vSpace1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("ForgotPassword.vSpace1HeightaboveReset");
			String padding_top = this.getCSS(locator, "padding-top");
			
			String locator1 = locatorReader.getLocator("ForgotPassword.VSpace1HeightForgot");
			String font_size = this.getCSS(locator1, "font-size");
			String line_height = this.getCSS(locator1, "line-height");
			
			
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx=line_height.substring(0, 2);
			String padding_top_wopx=padding_top.substring(0, 2);
			int getsubpixel = Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
			int getaddedextravalue=getsubpixel+1;
			int getaddpixel1=Integer.parseInt(padding_top_wopx) + getaddedextravalue;
		    String getfinalValue=getaddpixel1+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace1Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace1Height Exception>>Expected :70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace1Height Error>>Expected :70px");
			count = count + 1;
		}
		
		// Verify vSpace1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("ForgotPassword.vSpace1Heightright");
			String padding_top = this.getCSS(locator, "padding-top");
			
						
			System.out.println("Actual Result" +padding_top);
			Assert.assertEquals(vSpace1Height,padding_top);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace1Height Exception>>Expected :70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace1Height Error>>Expected :70px");
			count = count + 1;
		}
		
		// Verify vSpace1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("ForgotPassword.vSpace1Heightright");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			
						
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(vSpace1Height,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace1Height Exception>>Expected :70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace1Height Error>>Expected :70px");
			count = count + 1;
		}	
		// Verify vSpace1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("ForgotPassword.vspaceHeightfooter");
			String margin_top = this.getCSS(locator, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("ForgotPassword.vSpace1Height");
			String padding_bottom = this.getCSS(locator1, "padding-bottom");
			String padding_bottom_wopx = padding_bottom.substring(0, 2);
			
			int getaddpixel1=Integer.parseInt(padding_bottom_wopx) + Integer.parseInt(margin_top_wopx);
		    String getfinalValue=getaddpixel1+"px";
		    
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace1Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace1Height Exception>>Expected :70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace1Height Error>>Expected :70px");
			count = count + 1;
		}

		// Verify Gutter16Width has the height 34px .
		try {
						
			String locator = locatorReader.getLocator("ForgotPassword.vSpace1HeightaboveReset");
			String padding_left = this.getCSS(locator, "padding-left");
					    
			System.out.println("Actual Result" +padding_left);
			Assert.assertEquals(Gutter16Width,padding_left);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter16Width Exception>>Expected :34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter16Width Error>>Expected :34px");
			count = count + 1;
		}
		// Verify Gutter16Width has the height 34px .
		try {
			
			
			String locator = locatorReader.getLocator("ForgotPassword.vSpace1HeightaboveReset");
			String padding_right = this.getCSS(locator, "padding-right");
			
		    System.out.println("Actual Result" +padding_right);
			Assert.assertEquals(Gutter16Width,padding_right);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter16Width Exception>>Expected :34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter16Width Error>>Expected :34px");
			count = count + 1;
		}
		// Verify Gutter2Width has the height 40px .
		try {
			
			String locator = locatorReader.getLocator("ForgotPassword.vSpace1Heightright");
			String padding_left = this.getCSS(locator, "padding-left");
					    
			System.out.println("Actual Result" +padding_left);
			Assert.assertEquals(Gutter2Width,padding_left);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter2Width Exception>>Expected :40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter2Width Error>>Expected :40px");
			count = count + 1;
		}
		// Verify Gutter2Width has the height 40px .
		try {
			
			
			String locator = locatorReader.getLocator("ForgotPassword.vSpace1Heightright");
			String padding_right = this.getCSS(locator, "padding-right");
			
		    System.out.println("Actual Result" +padding_right);
			Assert.assertEquals(Gutter2Width,padding_right);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter2Width Exception>>Expected :40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter2Widthh Error>>Expected :40px");
			count = count + 1;
		}		
		// Verify gap17width has the width 10px .
					
		try {
			
			
			String locator = locatorReader.getLocator("ForgotPassword.gap17width");
			String padding_right = this.getCSS(locator, "padding-left");
			
		    System.out.println("Actual Result" +padding_right);
			Assert.assertEquals(gap17width,padding_right);
			
		}

		catch (Exception ex) {
			System.out.println("B2B gap17width Exception>>Expected :10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B gap17width Error>>Expected :10px");
			count = count + 1;
		}
		
		// Verify vSpace1Height has the height 70px(Above Cancel Button) .
		
		try {
			
			
			String locator = locatorReader.getLocator("ForgotPassword.vSpace1Heightbelowinput");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("ForgotPassword.vSpace1Heightabovecancel");
			String margin_top = this.getCSS(locator1, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);
			
			int getaddpixel1=Integer.parseInt(margin_bottom_wopx) + Integer.parseInt(margin_top_wopx)-Integer.parseInt("15");
		    String getfinalValue=getaddpixel1+"px";
		    
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace1Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace1Height Exception>>Expected :70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace1Height Error>>Expected :70px");
			count = count + 1;
		}

				
		// Verify gap17width has the width of 10px(Above Cancel Button) .

		try {
			
			
			String locator = locatorReader.getLocator("ForgotPassword.gap17width1");
			String margin_right = this.getCSS(locator, "margin-right");
			String margin_right_wopx = margin_right.substring(0, 2);
			int getaddpixel1=Integer.parseInt(margin_right_wopx) - Integer.parseInt("5");
		    String getfinalValue=getaddpixel1+"px";
		    
			System.out.println("Actual Result" +getfinalValue);
		    
			Assert.assertEquals(gap17width,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B gap17width Exception>>Expected :10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B gap17width Error>>Expected :10px");
			count = count + 1;
		}
		
		// Verify textSpace3Height has the width of 17px .

		try {
			
			
			String locator = locatorReader.getLocator("ForgotPassword.textSpace3Height");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			int getaddpixel1=Integer.parseInt(line_height_wopx) - Integer.parseInt(font_size_wopx);
			int getfinalpixel=getaddpixel1+5;
		    String getfinalValue=getfinalpixel+"px";
		    
			System.out.println("Actual Result" +getfinalValue);
		   		
			Assert.assertEquals(TextSpace3Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B gap17width Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B gap17width Error>>Expected :17px");
			count = count + 1;
		}
		
		// Verify textSpace3Height has the width of 35px .

		try {
			
			
			String locator = locatorReader.getLocator("ForgotPassword.textSpace3Height");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String margin_top = this.getCSS(locator, "margin-top");
			
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String margin_top_wopx = margin_top.substring(0, 2);
			
			int getaddpixel1=Integer.parseInt(line_height_wopx) - Integer.parseInt(font_size_wopx);
			
			int getfinalpixel=Integer.parseInt(margin_top_wopx)+getaddpixel1- Integer.parseInt("1");
		    String getfinalValue=getfinalpixel+"px";
		    
			System.out.println("Actual Result" +getfinalValue);
		   		
			Assert.assertEquals(TextSpace1Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B gap17width Exception>>Expected :35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B gap17width Error>>Expected :35px");
			count = count + 1;
		}
		
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
