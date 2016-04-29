package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_SignInPage_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_SignInPage_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_Login.xml");
	
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
		//this.clickForgotPassword();
		//Check page not found
		//.checkPageNotFound();
		
		
	}
	public void verifyForgotMusicID(String vSpace1Height,String TextSpace1Height,String TextSpace3Height,String Gutter16Width,String Width,String Gutter2Width,String textSpace10Height,String gap17width)
	{
		
		ReachUptoB2BStoreAccount();
		int count = 0;
		
		// Verify vSpace1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("SignInPage.vSpace1HeightHeader");
			String margin_top = this.getCSS(locator, "margin-top");
			
						
			System.out.println("Actual Result" +margin_top);
			Assert.assertEquals(vSpace1Height,margin_top);
			
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
			
			
			String locator = locatorReader.getLocator("SignInPage.vSpace1HeightAboveMusicId");
			String padding_top = this.getCSS(locator, "padding-top");
			
			String locator1 = locatorReader.getLocator("SignInPage.vSpace1HeightMusicIdText");
			String margin_top = this.getCSS(locator1, "margin-top");
			String font_size = this.getCSS(locator1, "font-size");
			String line_height = this.getCSS(locator1, "line-height");
			
			
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx=line_height.substring(0, 2);
			String padding_top_wopx=padding_top.substring(0, 2);
			String margin_top_wopx=margin_top.substring(0, 2);
			int getsubpixel = Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
			int getaddedextravalue=getsubpixel+1;
			int getaddpixel1=Integer.parseInt(padding_top_wopx) + getaddedextravalue + Integer.parseInt(margin_top_wopx);
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
	
		// Verify Gutter16Width has the width of 34px .
		try {
			
			
			String locator = locatorReader.getLocator("SignInPage.gutter16width");
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
		// Verify Gutter16Width has the width of 34px .
		try {
			
			
			String locator = locatorReader.getLocator("SignInPage.gutter16width");
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
		
		// Verify vSpace1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("SignInPage.gutter16width");
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
		// Verify width is 450px .
		try {
			
			
			String locator = locatorReader.getLocator("SignInPage.gutter16width");
			String width = this.getCSS(locator, "width");
			
						
			System.out.println("Actual Result" +width);
			Assert.assertEquals(Width,width);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Width Exception>>Expected :450px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Width Error>>Expected :450px");
			count = count + 1;
		}
		// Verify vSpace1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("SignInPage.vSpace1Height2box");
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
			
			
			String locator = locatorReader.getLocator("SignInPage.vSpace1Height2box");
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
		// Verify Gutter2Width has the width of 40px .
		try {
			
			
			String locator = locatorReader.getLocator("SignInPage.vSpace1Height2box");
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
		
		// Verify Gutter2Width has the width of 40px .
		try {
			
			
			String locator = locatorReader.getLocator("SignInPage.vSpace1Height2box");
			String padding_right = this.getCSS(locator, "padding-right");
			
						
			System.out.println("Actual Result" +padding_right);
			Assert.assertEquals(Gutter2Width,padding_right);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter2Width Exception>>Expected :40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter2Width Error>>Expected :40px");
			count = count + 1;
		}
		
		// Verify textSpace10Height has the height 25px .
		try {
			
			
			String locator = locatorReader.getLocator("SignInPage.textSpace10Height");
			String margin_top = this.getCSS(locator, "margin-top");
			
			String locator1 = locatorReader.getLocator("SignInPage.textSpace10heighttext");
			String font_size = this.getCSS(locator1, "font-size");
			String line_height = this.getCSS(locator1, "line-height");
			
			
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx=line_height.substring(0, 2);
			String margin_top_wopx=margin_top.substring(0, 2);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			int getaddedextravalue=getsubpixel+2;
			int getaddpixel1=Integer.parseInt(margin_top_wopx) + getaddedextravalue;
		    String getfinalValue=getaddpixel1+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(textSpace10Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace10Height Exception>>Expected :25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace10Height Error>>Expected :25px");
			count = count + 1;
		}		
		// Verify textSpace10Height has the height 25px .
		try {
			
			
			String locator = locatorReader.getLocator("SignInPage.textSpace10Height");
			String margin_top = this.getCSS(locator, "margin-bottom");
			
			String locator1 = locatorReader.getLocator("SignInPage.textSpace10heighttext");
			String font_size = this.getCSS(locator1, "font-size");
			String line_height = this.getCSS(locator1, "line-height");
			
			
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx=line_height.substring(0, 2);
			String margin_top_wopx=margin_top.substring(0, 2);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			int getaddedextravalue=getsubpixel+2;
			int getaddpixel1=Integer.parseInt(margin_top_wopx) + getaddedextravalue;
		    String getfinalValue=getaddpixel1+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(textSpace10Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace10Height Exception>>Expected :25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace10Height Error>>Expected :25px");
			count = count + 1;
		}				

		// Verify TextSpace1Height has the height 35px .
	try {
			
			
			String locator = locatorReader.getLocator("SignInPage.vSpace35Hight");
			String margin_top = this.getCSS(locator, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);
			String font_size1 = this.getCSS(locator, "font-size");
			String line_height1 = this.getCSS(locator, "line-height");
			String font_size_wopx1 = font_size1.substring(0, 2);
			String line_height_wopx1 = line_height1.substring(0, 2);
			int getsubpixelmusictext = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
			
			
			String locator1 = locatorReader.getLocator("SignInPage.vSpace1HeightMusicIdText");
			String font_size = this.getCSS(locator1, "font-size");
			String line_height = this.getCSS(locator1, "line-height");
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixelmusicparagraph = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			
			
			int getsubpixel = getsubpixelmusictext-getsubpixelmusicparagraph;
			
			
			int getfinalvaluewopx=Integer.parseInt(margin_top_wopx)+getsubpixel-Integer.parseInt("6");
		    String getfinalValue=getfinalvaluewopx+"px";
		    
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace1Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace1Height Exception>>Expected :35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace1Height Error>>Expected :35px");
			count = count + 1;
		}
		
	// Verify TextSpace3Height has the height 17px .
	try {
		
		
		
		String locator1 = locatorReader.getLocator("SignInPage.vSpace35Hight");
		String font_size = this.getCSS(locator1, "font-size");
		String line_height = this.getCSS(locator1, "line-height");
		
		
		String font_size_wopx = font_size.substring(0, 2);
		String line_height_wopx=line_height.substring(0, 2);
		int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
		int getaddedextravalue=getsubpixel+5;
		
	    String getfinalValue=getaddedextravalue+"px";
		
		System.out.println("Actual Result" +getfinalValue);
		Assert.assertEquals(TextSpace3Height,getfinalValue);
		
	}

	catch (Exception ex) {
		System.out.println("B2B TextSpace3Height Exception>>Expected :17px");
		count = count + 1;
	} catch (Error ex) {
		System.out.println("B2B TextSpace3Height Error>>Expected :17px");
		count = count + 1;
	}	
	// Verify vSpace1Height has the height 70px .
	try {
		
		
		String locator = locatorReader.getLocator("SignInPage.vSpace1HeightHeader");
		String margin_bottom = this.getCSS(locator, "margin-bottom");
		
					
		System.out.println("Actual Result" +margin_bottom);
		Assert.assertEquals(vSpace1Height,margin_bottom);
		
	}

	catch (Exception ex) {
		System.out.println("B2B vSpace1Height Exception>>Expected :70px");
		count = count + 1;
	} catch (Error ex) {
		System.out.println("B2B vSpace1Height Error>>Expected :70px");
		count = count + 1;
	}
					
			System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}

