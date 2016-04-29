package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_InActiveAccount_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_InActiveAccount_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_ForgotMusicId.xml");
	
	}
	
	//Click on InActiveAccount
	public void clickInActiveAccount()
	
	{
	
		String locator = locatorReader.getLocator("InActiveAccount.ClickInActiveAccount");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
			
	}
	
		
	//Check Page not found
	public void checkPageNotFound()
	{
		String actualTitle1 = driver.getTitle();
		System.out.println("Get Title"+ actualTitle1);
		String expectedTitle1 = "Not Found | MUSIC Group";
		Assert.assertFalse(actualTitle1==expectedTitle1);
	
	}

	//Reach upto B2BInActiveAccount
	public void ReachUptoB2BInActive()
	{
		
		//Check page not found
		this.checkPageNotFound();
		//Click on Cartlink on B2BPage
		//this.clickInActiveAccount();
		//Check page not found
		this.checkPageNotFound();
		
		
	}
	//Reach upto B2BInActiveAccount
		public void ReachUptoChangePassword()
		{
			
			//Check page not found
			this.checkPageNotFound();
			//Click on Cartlink on B2BPage
			//this.clickInActiveAccount();
			//Check page not found
			this.checkPageNotFound();
			
			
		}
	public void verifyInActiveAccountPage(String vSpace1Height,String TextSpace1Height,String TextSpace3Height,String Gutter16Width,String Width,String Gutter2Width,String Paragraph1SpaceHeight,String TextSpace15Height)
	{
		
		ReachUptoB2BInActive();
		int count = 0;
		
		// Verify vSpace1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("InActiveAccount.vSpace1Header");
			String padding_top = this.getCSS(locator, "padding-top");
			
						
			System.out.println("Actual Result" +padding_top);
			Assert.assertEquals(vSpace1Height,padding_top);
			
		}

		catch (Exception ex) {
			System.out.println("B2B InActiveAccount Exception>>Expected :70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B InActiveAccount Error>>Expected :70px");
			count = count + 1;
		}
		
		
		// Verify vSpace1Height has the height 35px .
		try {
			
			
			String locator = locatorReader.getLocator("InActiveAccount.vSpaceHeightAboveMusicID");
			String padding_top = this.getCSS(locator, "padding-top");
			
			String locator1 = locatorReader.getLocator("InActiveAccount.vSpace4HeightAboveMusicIDText");
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
			System.out.println("B2B InActiveAccount Exception>>Expected :35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B InActiveAccount Error>>Expected :35px");
			count = count + 1;
		}
		// Verify TextSpace1Height has the height 35px .
		try {
			
			
			String locator = locatorReader.getLocator("InActiveAccount.vSpace1TextHeight");
			String padding_top = this.getCSS(locator, "margin-top");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			
			
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx=line_height.substring(0, 2);
			String padding_top_wopx=padding_top.substring(0, 2);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			int getaddedextravalue=getsubpixel+1;
			int getaddpixel1=Integer.parseInt(padding_top_wopx) + getaddedextravalue-Integer.parseInt("4");
		    String getfinalValue=getaddpixel1+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace1Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B InActiveAccount TextSpace1Height Exception>>Expected :35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B InActiveAccount TextSpace1Height Error>>Expected :35px");
			count = count + 1;
		}
	
		// Verify TextSpace3Height has the height 17px .
		try {
			
			
			String locator = locatorReader.getLocator("InActiveAccount.vSpace1TextHeight");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			
			
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx=line_height.substring(0, 2);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			int getaddedextravalue=getsubpixel+1;
			int getaddpixel1= getaddedextravalue+Integer.parseInt("2");
		    String getfinalValue=getaddpixel1+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace3Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B InActiveAccount TextSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B InActiveAccount TextSpace3Height Error>>Expected :17px");
			count = count + 1;
		}

		// Verify Gutter16Width has the height 34px .
		try {
			
			String locator = locatorReader.getLocator("InActiveAccount.vSpaceHeightAboveMusicID");
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
			
			
			String locator = locatorReader.getLocator("InActiveAccount.vSpaceHeightAboveMusicID");
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
		// Verify Width has the height 34px .
		try {
			
			
			String locator = locatorReader.getLocator("InActiveAccount.vSpaceHeightAboveMusicID");
			String width = this.getCSS(locator, "width");
			
		    System.out.println("Actual Result" +width);
			Assert.assertEquals(Width,width);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter16Width Exception>>Expected :34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter16Width Error>>Expected :34px");
			count = count + 1;
		}
		// Verify vSpave1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("InActiveAccount.vSpaceHeight2Col");
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
		// Verify vSpave1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("InActiveAccount.vSpaceHeight2Col");
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
		// Verify Gutter2Width has the height 40px .
		try {
			
			
			String locator = locatorReader.getLocator("InActiveAccount.vSpaceHeight2Col");
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
			
			
			String locator = locatorReader.getLocator("InActiveAccount.vSpaceHeight2Col");
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
			// Verify ParagraphSpace1Height has the height 35px .
		try {
			
			
			String locator = locatorReader.getLocator("InActiveAccount.ParagraphSpave1Height2Col");
			String padding_top = this.getCSS(locator, "margin-top");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			
			
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx=line_height.substring(0, 2);
			String padding_top_wopx=padding_top.substring(0, 2);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			int getaddedextravalue=getsubpixel+1;
			int getaddpixel1=Integer.parseInt(padding_top_wopx) + getaddedextravalue;
		    String getfinalValue=getaddpixel1+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(Paragraph1SpaceHeight,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B InActiveAccount TextSpace1Height Exception>>Expected :35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B InActiveAccount TextSpace1Height Error>>Expected :35px");
			count = count + 1;
		}
		// Verify TextSpace15Height has the height 16px .
		try {
			
			
			String locator = locatorReader.getLocator("InActiveAccount.ParagraphSpave1Height2Col");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			
			
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx=line_height.substring(0, 2);
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			int getaddedextravalue=getsubpixel+1;
			int getaddpixel1= getaddedextravalue+Integer.parseInt("5");
		    String getfinalValue=getaddpixel1+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace15Height,getfinalValue);
			
		}
		catch (Exception ex) {
			System.out.println("B2B InActiveAccount TextSpace15Height Exception>>Expected :16px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B InActiveAccount TextSpace1Height Error>>Expected :16px");
			count = count + 1;
		}
		
		// Verify vSpace1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("InActiveAccount.vSpace1HeightFooter");
			String margin_top = this.getCSS(locator, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("InActiveAccount.vSpace1Header");
			String padding_bottom = this.getCSS(locator1, "padding-bottom");
			String padding_bottom_wopx = padding_bottom.substring(0, 2);
			
			int getaddpixel1=Integer.parseInt(padding_bottom_wopx) + Integer.parseInt(margin_top_wopx);
		    String getfinalValue=getaddpixel1+"px";
		    
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace1Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B InActiveAccount Exception>>Expected :70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B InActiveAccount Error>>Expected :70px");
			count = count + 1;
		}

		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
