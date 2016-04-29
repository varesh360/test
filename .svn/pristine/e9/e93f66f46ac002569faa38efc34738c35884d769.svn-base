package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_StoreAccountPopup_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_StoreAccountPopup_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_StoreAccountPopup.xml");
	
	}
	
	//Click on Welcome icon on
	public void clickWelcomeIcon()
	
	{
	
		String locator = locatorReader.getLocator("StoreAccount.ClickWelcome");
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
		this.clickWelcomeIcon();
		//Check page not found
		this.checkPageNotFound();
		
		
	}
	public void verifyStoreAccountPage(String textSpace3Height,String textSpace5Height,String gutter45width,String vSpace9Height)
	{
		
		ReachUptoB2BStoreAccount();
		int count = 0;
		
		// Verify textSpace3Height has the height 17px .
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height1");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Result" +padding_top);
			Assert.assertEquals(textSpace3Height,padding_top);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :17px");
			count = count + 1;
		}
		// Verify textSpace3Height has the height 17px .
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height1");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(textSpace3Height,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :17px");
			count = count + 1;
		}		
		// Verify gutter45Width has the height 18px .
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height1");
			String padding_bottom = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(gutter45width,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :18px");
			count = count + 1;
		}		
		// Verify gutter45Width has the height 18px .
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height1");
			String padding_bottom = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(gutter45width,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :18px");
			count = count + 1;
		}		
	//-------------------------------------------------------------------------------------------------------------------------
		// Verify textSpace3Height has the height 17px (2 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height2");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Result" +padding_top);
			Assert.assertEquals(textSpace3Height,padding_top);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :17px");
			count = count + 1;
		}
		// Verify textSpace3Height has the height 17px (2 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height2");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(textSpace3Height,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :17px");
			count = count + 1;
		}		
		// Verify gutter45Width has the height 18px (2 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height2");
			String padding_bottom = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(gutter45width,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :18px");
			count = count + 1;
		}		
		// Verify gutter45Width has the height 18px (2 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height2");
			String padding_bottom = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(gutter45width,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :18px");
			count = count + 1;
		}		
//------------------------------------------------------------------------------------------------------------------
		// Verify textSpace3Height has the height 17px (3 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height3");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Result" +padding_top);
			Assert.assertEquals(textSpace3Height,padding_top);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :17px");
			count = count + 1;
		}
		// Verify textSpace3Height has the height 17px (3 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height3");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(textSpace3Height,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :17px");
			count = count + 1;
		}		
		// Verify gutter45Width has the height 18px (3 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height3");
			String padding_bottom = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(gutter45width,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :18px");
			count = count + 1;
		}		
		// Verify gutter45Width has the height 18px (3 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height3");
			String padding_bottom = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(gutter45width,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :18px");
			count = count + 1;
		}	
		
		//------------------------------------------------------------------------------------------------------------------
		
		// Verify textSpace3Height has the height 17px (5 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height5");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Result" +padding_top);
			Assert.assertEquals(textSpace3Height,padding_top);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :17px");
			count = count + 1;
		}
		// Verify textSpace3Height has the height 17px (3 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height5");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(textSpace3Height,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :17px");
			count = count + 1;
		}		
		// Verify gutter45Width has the height 18px (3 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height5");
			String padding_bottom = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(gutter45width,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :18px");
			count = count + 1;
		}		
		// Verify gutter45Width has the height 18px (3 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.textspace3Height5");
			String padding_bottom = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(gutter45width,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :18px");
			count = count + 1;
		}	
//-----------------------------------------------------------------------------------------------
		// Verify text5SpaceHeight has the height 13px (1 List).
		try {
			
			
			String locator = locatorReader.getLocator("StoreAccount.text5spaceHeight");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
            String line_height_wopx = line_height.substring(0, 2);
            String font_size_wopx = font_size.substring(0, 2);
			
			
			int getsubpixel =Integer.parseInt(line_height_wopx) - Integer.parseInt(font_size_wopx);
			
			String locator1 = locatorReader.getLocator("StoreAccount.text5spaceHeight1");
			String line_height1 = this.getCSS(locator1, "line-height");
			String font_size1 = this.getCSS(locator1, "font-size");
			
            String line_height_wopx1 = line_height1.substring(0, 2);
            String font_size_wopx1 = font_size1.substring(0, 2);
			
			
			int getsubpixel1 =Integer.parseInt(line_height_wopx1) - Integer.parseInt(font_size_wopx1);
			
			int getaddedvalue=getsubpixel+getsubpixel1;
			String getfinalValue=getaddedvalue+"px";
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(gutter45width,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B text5SpaceHeight Exception>>Expected :12px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B text5SpaceHeight Error>>Expected :12px");
			count = count + 1;
		}
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
