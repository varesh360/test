package test.java.com.MusicGroup.pagehelper;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_CheckOutPage_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_CheckOutPage_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_CheckOutPage.xml");
	
	}
	
	//Enter Quantity in Cart
	public void AddQuantityinCart(String quantity)
	
	{
	
		String locator = locatorReader.getLocator("B2B_CheckOutPage.EnterQuantity");
		this.WaitForElementEnabled(locator, 50);
		sendKeys(locator, quantity);
		System.out.println("Verify User enter the quantity in input box");
			
	}
	//Click Add to Cart button
	public void ClickAddtoCartbutton()
	
	{
	
		String locator = locatorReader.getLocator("B2B_CheckOutPage.ClickAddtoCartbutton");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		System.out.println("Verify User is able to click Add to cart Button");
			
	}	

	//Click Cart Icon
	public void ClickCartIcon()
	
	{
	
		String locator = locatorReader.getLocator("B2B_CheckOutPage.ClickCartLink");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		System.out.println("Verify User is able to click Cart ICon Button");
			
	}
	
	//Click View Cart Button
	
	public void ClickViewCartbutton()
	
	{
	
		String locator = locatorReader.getLocator("B2B_CheckOutPage.ClickViewCartLink");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		System.out.println("Verify User is able to click View Cart Button");
			
	}
	//Enter refrence number
	public void EnterRefNumber(String refNumber)
	{
		Random rand = new Random(); 
		int value1 = rand.nextInt(50000000); 
		String value = Integer.toString(value1);
		String locator = locatorReader.getLocator("B2B_CheckOutPage.RefNumber");
		this.WaitForElementEnabled(locator, 5);
		sendKeys(locator, value);
		System.out.println("Enter refrence Number");
		//this.clickonaddtocartbutton();
	}
	//Check Page not found
	public void checkPageNotFound()
	{
		String actualTitle1 = driver.getTitle();
		System.out.println("Get Titile"+ actualTitle1);
		String expectedTitle1 = "Not Found | MUSIC Group";
		Assert.assertFalse(actualTitle1==expectedTitle1);
	
	}
	//Click Order Now

	public void ClickOrderNow()
	{
		
		String locator = locatorReader.getLocator("B2B_CheckOutPage.ordernow");
		this.WaitForElementEnabled(locator, 5);
		clickOn(locator);
		System.out.println("Verify that user is able to Select Order Now successfuly");
	}
	
	//Click cart link 
		public void ClickCheckOut()
		{
			
			String locator = locatorReader.getLocator("B2B_CheckOutPage.checkoutbutton");
			this.WaitForElementEnabled(locator, 5);
			clickOn(locator);
			System.out.println("Verify that user is able to click 'CheckOut Button' Succesfully");
		}

	//Reach upto B2BStoreAccount
	public void ReachUptoB2BStoreAccount(String quantity, String RefNumber)
	{
		
		//Check page not found
		this.checkPageNotFound();
		//Click on Cartlink on B2BPage
		this.AddQuantityinCart(quantity);
		
	//Click Add to Cart button ;
		this.ClickAddtoCartbutton();
		
		//Click Cart Icon 
		this.ClickCartIcon();
		
		//Click View Cart Button
		this.ClickViewCartbutton();
		//Enter Ref umber
		this.EnterRefNumber(RefNumber);
		//then Order Now 
	//	this.ClickOrderNow();
		//Click Check out button
		this.ClickCheckOut();
		//Check page not found
		this.checkPageNotFound();
		
		
	}
	public void verifyCheckOutpage(String quantity, String RefNumber, String vSpace1Heighth, String vSpace4Height, String vSpace12Height, String textSpace1Height, String gap9width, String vSpace10Height)
	{
		
		ReachUptoB2BStoreAccount(quantity, RefNumber);
		int count = 0;
		
		// Verify vSpace1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("B2B_CheckOutPage.vSpace1HeightHeader");
			String margin_top = this.getCSS(locator, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);
			int getaddpixel=Integer.parseInt(margin_top_wopx)-Integer.parseInt("1");
			 String getfinalvalue=getaddpixel+"px";
						
			System.out.println("Actual Result" +getfinalvalue);
			System.out.println("Expected Result"+vSpace1Heighth);
			Assert.assertEquals(vSpace1Heighth,getfinalvalue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace1Height Exception>>Expected :70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace1Height Error>>Expected :70px");
			count = count + 1;
		}
		// Verify vSpace4Height has the height 40px .
				
		try {
			
			
			String locator = locatorReader.getLocator("B2B_CheckOutPage.vSpace4Height1");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			

			String locator1 = locatorReader.getLocator("B2B_CheckOutPage.vSpace4Height2");
			String margin_top = this.getCSS(locator1, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);
			
			 int getaddpixel=Integer.parseInt(margin_top_wopx)+Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("2");
			 String getfinalvalue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalvalue);
			Assert.assertEquals(vSpace4Height,getfinalvalue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace4Height Exception>>Expected :40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace4Height Error>>Expected :40px");
			count = count + 1;
		}			

		// Verify vSpace12Height has the height 35px .
		
		try {
			
			
			String locator = locatorReader.getLocator("B2B_CheckOutPage.vSpace12Height");
			String padding_top = this.getCSS(locator, "padding-top");
			String padding_top_wopx = padding_top.substring(0, 2);
			System.out.println("padding_top_wopx"+padding_top_wopx);
			

			String locator1 = locatorReader.getLocator("B2B_CheckOutPage.vspace12Height1");
			String margin_top = this.getCSS(locator1, "margin-top");
			String margin_top_wopx = margin_top.substring(0, 2);
			System.out.println("margin_top_wopx"+margin_top_wopx);
			
			/*
			String locator2 = locatorReader.getLocator("B2B_CheckOutPage.vspace12Height2");
			String margin_top2 = this.getCSS(locator2, "padding-top");
			String margin_top_wopx2 = margin_top2.substring(0, 1);
			System.out.println("margin_top_wopx2"+margin_top_wopx2);
			*/
			
			 int getaddpixel=Integer.parseInt(padding_top_wopx)+Integer.parseInt(margin_top_wopx)+Integer.parseInt("1");
			 String getfinalvalue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalvalue);
			Assert.assertEquals(vSpace12Height,getfinalvalue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace12Height Exception>>Expected :35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace12Height Error>>Expected :35px");
			count = count + 1;
		}						
		// Verify textSpace1Height has the height 35px[Place Order] .
		try {
			
			
			String locator = locatorReader.getLocator("B2B_CheckOutPage.textSpace1HeightabovePlaceHolder");
			String padding_top = this.getCSS(locator, "padding-top");
			
			String margin_top_wopx = padding_top.substring(0, 2);
			 int getaddpixel=Integer.parseInt(margin_top_wopx)+Integer.parseInt("16");
			 String getfinalvalue=getaddpixel+"px";
			 System.out.println("Actual Result" +getfinalvalue);
			 Assert.assertEquals(textSpace1Height,getfinalvalue);
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace1Height Exception>>Expected :35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace1Height Error>>Expected :35px");
			count = count + 1;
		}
		// Verify textSpace1Height has the height 35px[Place Order] .
		try {
			
			
			String locator = locatorReader.getLocator("B2B_CheckOutPage.textSpace1HeightabovePlaceHolder");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String padding_bottom_wopx = padding_bottom.substring(0, 2);
			 int getaddpixel=Integer.parseInt(padding_bottom_wopx)-Integer.parseInt("1");
			 String getfinalvalue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalvalue);
			Assert.assertEquals(textSpace1Height,getfinalvalue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace1Height Exception>>Expected :35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace1Height Error>>Expected :35px");
			count = count + 1;
		}
		/*
		
		// Verify textSpace1Height has the height of 35px .
		try {
			
			
			String locator = locatorReader.getLocator("B2B_CheckOutPage.textSpace1HeightabovePlaceHolder");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			
						
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(textSpace1Height,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace1Height Exception>>Expected :35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace1Height Error>>Expected :35px");
			count = count + 1;
		}
		*/		
		
		// Verify Gap9Width has the Width 20px[Place Order] .
		try {
			
			
			String locator = locatorReader.getLocator("B2B_CheckOutPage.gap9Width");
			String margin_left = this.getCSS(locator, "margin-left");
			
						
			System.out.println("Actual Result" +margin_left);
			Assert.assertEquals(gap9width,margin_left);
			
		}

		catch (Exception ex) {
			System.out.println("B2B gap9width Exception>>Expected :20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B gap9width Error>>Expected :20px");
			count = count + 1;
		}
		
		// Verify textSpace1Height has the height 70px .
		try {
			
			
			String locator = locatorReader.getLocator("B2B_CheckOutPage.vSpace1HeightFooter");
			String padding_top = this.getCSS(locator, "margin-top");
			String padding_top_wopx = padding_top.substring(0, 2);
			

			String locator1 = locatorReader.getLocator("B2B_CheckOutPage.vSpace1HeightFooter1");
			String margin_top = this.getCSS(locator1, "margin-bottom");
			String margin_top_wopx = margin_top.substring(0, 2);
			
				
			
			 int getaddpixel=Integer.parseInt(padding_top_wopx)+Integer.parseInt(margin_top_wopx)-Integer.parseInt("1");
			 String getfinalvalue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalvalue);
			System.out.println("Actual Result" +vSpace1Heighth);
			Assert.assertEquals(vSpace1Heighth,getfinalvalue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace1Heighth Exception>>Expected :70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace1Heighth Error>>Expected :70px");
			count = count + 1;
		}						
		// Verify vSpace10Height has the height 13px .
								
	/*	try {
			
			
			String locator = locatorReader.getLocator("B2B_CheckOutPage.vSpace10HeightbelowImage");
			System.out.println("Locator" +locator);
			String padding_top = this.getCSS(locator, "margin-top");
			String padding_top_wopx = padding_top.substring(0, 1);
			

			String locator1 = locatorReader.getLocator("B2B_CheckOutPage.vSpace10Heightbelowimagetext");
			System.out.println("Locator1" +locator1);
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			int getsubpixel=Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx);
				
			
			int getaddpixel=Integer.parseInt(padding_top_wopx)-getsubpixel-Integer.parseInt("2");
			String getfinalvalue=getaddpixel+"px";
			System.out.println("Actual Result" +getfinalvalue);
			Assert.assertEquals(vSpace10Height,getfinalvalue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace10Height Exception>>Expected :13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace10Height Error>>Expected :13px");
			count = count + 1;
		}
		*/		
		// Verify vSpace10Height has the height 13px .
		try {
			
			
			String locator = locatorReader.getLocator("B2B_CheckOutPage.vSpace10Heightaboveimage");
			System.out.println("Locator" +locator);
			String margin_top = this.getCSS(locator, "margin-top");
			
						
			System.out.println("Actual Result" +margin_top);
			System.out.println("vSpace10Height" +vSpace10Height);
			Assert.assertEquals(vSpace10Height,margin_top);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace10Height Exception>>Expected :13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace10Height Error>>Expected :13px");
			count = count + 1;
		}		
			
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}
