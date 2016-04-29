package test.java.com.MusicGroup.pagehelper;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_PlaceOrder_SingleProduct_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public B2B_PlaceOrder_SingleProduct_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("B2B_PlaceOrder_SingleProduct_Helper.xml");
	}
		
	//Click product on product display page 
	public void selectproducttobuy()
	{
		
		String locator = locatorReader.getLocator("PlaceOrder.ClickProduct");
		this.WaitForElementEnabled(locator, 5);
		clickOn(locator);
		System.out.println("Verify that user is able to Select Product successfuly");
	}
	
	//Enter Quantity in input field
	public void enterquantity(String enterquantity)
	{
		
		String locator = locatorReader.getLocator("PlaceOrder.enterqtyininput");
		this.WaitForElementEnabled(locator, 5);
		sendKeys(locator, enterquantity);
		//this.clickonaddtocartbutton();
		System.out.println("Verify that user is able to entered quantity successfuly");
	}
	
	//Click on add to cart button
	public void clickonaddtocartbutton()
	{
		String locator = locatorReader.getLocator("PlaceOrder.addtocartbutton");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		System.out.println("Verify that user is able to click 'Add to Cart' button successfully");
	}
	
	//Click cart link 
	public void ClickCartLink()
	{
		
		String locator = locatorReader.getLocator("PlaceOrder.clickcartlink");
		this.WaitForElementEnabled(locator, 5);
		clickOn(locator);
		System.out.println("Verify that user is able to click 'Cart link' successfully");
	}
	
	public void CampareAmaount()
	{
		
		String locator = locatorReader.getLocator("PlaceOrder.PiecePerMasterCartoon");
		
		this.WaitForElementEnabled(locator, 5);
		String getText=getText(locator);
		int getamount=Integer.parseInt(getText);
		System.out.println("---Get Amount---"+getamount);
	}
	//Check Page not found
	public void checkPageNotFound()
	{
		String actualTitle1 = driver.getTitle();
		System.out.println("Get Titile"+ actualTitle1);
		String expectedTitle1 = "Not Found | MUSIC Group";
		Assert.assertFalse(actualTitle1==expectedTitle1);
	
	}	
	//Click view cart button
	public void ClickViewCartbutton()
	{
		
		String locator = locatorReader.getLocator("PlaceOrder.buttonviewcart");
		this.WaitForElementEnabled(locator, 5);
		clickOn(locator);
		System.out.println("Verify that user is able to click 'View cart' button successfully");
	}
	
	//Click cart link 
	public void ClickCheckOut()
	{
		
		String locator = locatorReader.getLocator("PlaceOrder.checkoutbutton");
		this.WaitForElementEnabled(locator, 5);
		clickOn(locator);
		System.out.println("Verify that user is able to click 'CheckOut Button' Succesfully");
	}
	//Enter reference number
	public void EnterRefNumber(String refNumber)
	{
		Random rand = new Random(); 
		int value1 = rand.nextInt(50000000); 
		String value = Integer.toString(value1);
		String locator = locatorReader.getLocator("PlaceOrder.RefNumber");
		this.WaitForElementEnabled(locator, 5);
		sendKeys(locator, value);
		System.out.println("Verify that user is able to enter 'Ref number' Succesfully");
		//this.clickonaddtocartbutton();
	}
	//Click update button
	public void ClickUpdateButton()
	{
		
		String locator = locatorReader.getLocator("PlaceOrder.Updatebutton");
		this.WaitForElementEnabled(locator, 5);
		clickOn(locator);
		System.out.println("Verify that user is able to click'Update button' successfully");
	}
	//Click update button
	public void ClickPlaceOrderButton()
	{
		
		String locator = locatorReader.getLocator("PlaceOrder.PlaceOrderButton");
		this.WaitForElementEnabled(locator, 5);
		clickOn(locator);
		System.out.println("Verify that user is able to click 'Place Order' button successfully");
	}
	//Click confirmation popup button in Stock
		public void OrderConfirmationPopupinstock()
		{
			
			String locator = locatorReader.getLocator("PlaceOrder.OrderSuccesullySubmitted");
			this.WaitForElementEnabled(locator, 5);
			clickOn(locator);
		
		}
	//Click confirmation popup button
	public void OrderConfirmationPopup()
	{
		
		//String locator = locatorReader.getLocator("PlaceOrder.OrderSuccesullySubmitted");
		//this.WaitForElementEnabled(locator, 5);
		//clickOn(locator);
		String expected ="Insufficient Stock";
	String locator1 = locatorReader.getLocator("PlaceOrder.insufficientmessage");
		this.WaitForElementEnabled(locator1, 5);
        String gettextoutput=  getText(locator1);
       // System.out.print("Get Confirm Box out put"+gettextoutput);
     // java string compare example
        if (expected.compareTo(gettextoutput) == 0)
        {
        // this line WILL print
         System.out.println("Verify that Insufficient stock text is displayed");
         }
		System.out.println("Verify Order confirmation popup displayed");
	}
	//Click upWelcome icon
	public void ClickWelcomeIcon()
     {
			
			String locator = locatorReader.getLocator("PlaceOrder.WelcomeIcon");
			this.WaitForElementEnabled(locator, 5);
			clickOn(locator);
			System.out.println("Verify that user is able to click 'Welcome' icon successfully");
	}	
	//Click Sign Out button
	public void ClickSignOut()
    {
			
			String locator = locatorReader.getLocator("PlaceOrder.WelcomeIcon");
			this.WaitForElementEnabled(locator, 5);
			clickOn(locator);
			System.out.println("Verify that user is able to click 'Sign Out' button successfully");
	}
	// Select Out of Stock Product
	public void selectOutofstock()
	{
		
		String locator = locatorReader.getLocator("insufficientorder.ClickProduct");
		this.WaitForElementEnabled(locator, 5);
		clickOn(locator);
		System.out.println("Verify that user is able to Select Product successfuly");
	}
	
	// Select Out of Stock Product
	

	public void ClickOrderNow()
	{
		
		String locator = locatorReader.getLocator("insufficientorder.ordernow");
		this.WaitForElementEnabled(locator, 5);
		clickOn(locator);
		System.out.println("Verify that user is able to Select Order Now successfuly");
	}	
	// Select Out of Stock Product
	
	public void insufficientcloseicon()
	{
		
		String locator = locatorReader.getLocator("insufficientorder.closeicon");
		this.WaitForElementEnabled(locator, 5);
		clickOn(locator);
		System.out.println("Verify that user is able to click close icon successfuly");
	}		

	// Select Out of Stock Product
	
	public void clickbackorderbutton()
	{
		
		String locator = locatorReader.getLocator("insufficientorder.backorder");
		this.WaitForElementEnabled(locator, 5);
		clickOn(locator);
		System.out.println("Verify that user is able to click close icon successfuly");
	}				
	
	//Confirm Order Type
	public void ConfirmOrderType()
	{
		
		String locator = locatorReader
				.getLocator("insufficientorder.closeicon");
		this.WaitForElementEnabled(locator, 5);
		String expected = "Back Order";

		this.WaitForElementEnabled(locator, 5);
		String gettextoutput = getText(locator);
		// System.out.print("Get Confirm Box out put"+gettextoutput);
		// java string compare example
		if (expected.compareTo(gettextoutput) == 0) {
			// this line WILL print
			System.out.println("Verify that Insufficient stock text is displayed");
		} else {
			System.out.println("Verify that Insufficient stock text is not displayed");
		}
		verifyTextPresent(locator);
		clickOn(locator);
		System.out.println("Verify that user is able to click close icon successfuly");
	}		
	//Place Order on B2B Page
	public void verifyPlaceOrderPage(String quantity, String RefNumber)
	{	 
		
		System.out.println("----------Main Function called----------");	
	//Click Product on search Result Page
	this.selectproducttobuy();
	
	//Enter Quantity on Serach Result Page
	this.enterquantity(quantity);
	
	//Click add to cart button
	
	this.clickonaddtocartbutton();
	
	//Click cart link 
	this.ClickCartLink();
	
	////Click Compare Amount
	this.CampareAmaount();
	
	// Click View Cart button
	this.ClickViewCartbutton();
	
	
	//Enter refrence Number
	this.EnterRefNumber(RefNumber);
	
	//Click Check out button
	this.ClickCheckOut();
	
	// Click Update button
	//this.ClickUpdateButton();
	
	//Click Place Order
	this.ClickPlaceOrderButton();
	
	//Confirm Order Place popup OrderConfirmationPopupinstock
	this.OrderConfirmationPopupinstock();
	
	//Click Welcome icon
	this.ClickWelcomeIcon();
	
	//Click Sign Out button
	this.ClickSignOut();
     //Verify home page.
	// this.WaitForElementPresent(locatorReader.getLocator("Login.VerifyStoreLink"), 5);
	// Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Login.VerifyStoreLink")));
     
	}
	
	public void verifyinsufficientorderpage(String quantity, String RefNumber,String vSpace15Height,String Gutter68Width,String vSpace5Height,String textSpace5Height,String gutter45width)
	{
		this.selectOutofstock();
		
		//Enter Quantity on Serach Result Page
		this.enterquantity(quantity);
		
		//Click add to cart button
		
		this.clickonaddtocartbutton();
		
		//Click cart link 
		this.ClickCartLink();
		
		////Click Compare Amount
		this.CampareAmaount();
		
		// Click View Cart button
		this.ClickViewCartbutton();
		
		
		//Enter refrence Number
		this.EnterRefNumber(RefNumber);
		//then Order Now 
		this.ClickOrderNow();
		
		//Click Check out button
		this.ClickCheckOut();
		
		// Click Update button
		//this.ClickUpdateButton();
		
		//Click Place Order
	//	this.ClickPlaceOrderButton();
		
		//Confirm Order Place popup
		this.OrderConfirmationPopup();
		// verify insufficient UI page
		this.verifinsufficientpage(vSpace15Height,Gutter68Width,vSpace5Height,textSpace5Height,gutter45width);
		// Then click on close icon display on confirmation Popup
		this.insufficientcloseicon();
		//Click Welcome icon
		this.ClickWelcomeIcon();
		
		//Click Sign Out button
		this.ClickSignOut();
	    
	}
	public void verifybackorderpage(String quantity, String RefNumber, String VSpace15HeightBO, String vSpace5HeightBO, String Gutter68widthBO, String TextSpace14HeightBO, String Gutter45WidthBO, String TextSpace2HeightBO)
	{
		this.selectOutofstock();
		
		//Enter Quantity on Serach Result Page
		this.enterquantity(quantity);
		
		//Click add to cart button
		
		this.clickonaddtocartbutton();
		
		//Click cart link 
		this.ClickCartLink();
		
		////Click Compare Amount
		this.CampareAmaount();
		
		// Click View Cart button
		this.ClickViewCartbutton();
		
		
		//Enter refrence Number
		this.EnterRefNumber(RefNumber);
		//then Order Now 
		this.ClickOrderNow();
		
		//Click Check out button
		this.ClickCheckOut();
		
		//Click COnfirmation popup
		this.OrderConfirmationPopup();
		// Then click on close icon displat on confirmation Popup
		
		//click back order now button
		this.clickbackorderbutton();
		//this.insufficientcloseicon();
		
		this.verifybackorderpageUI(VSpace15HeightBO,vSpace5HeightBO,Gutter68widthBO,TextSpace14HeightBO,Gutter45WidthBO,TextSpace2HeightBO);
		//confirm order type
		this.ConfirmOrderType();
		//Click Welcome icon
		this.ClickWelcomeIcon();
		
		//Click Sign Out button
		this.ClickSignOut();
	    
	}
	
	public void verifybackorderpageUI(String VSpace15HeightBO, String vSpace5HeightBO, String Gutter68widthBO, String TextSpace14HeightBO,String Gutter45WidthBO,String TextSpace2HeightBO)
	{
		//ReachUptoCreationHomePage();
		int count = 0;
		// Verify vSpace15Height has the width of 25px .
				
		try {
			String locator = locatorReader.getLocator("BackOrder.vSpace15Height");
			String margin_top = this.getCSS(locator, "top");
			System.out.println("Actual Result" +margin_top);
			Assert.assertEquals(margin_top,VSpace15HeightBO);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order  vSpace15Height Exception>>Expected Margin: 25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order  vSpace15Height Error>>Expected Margin:25px");
			count = count + 1;
		}
		// Verify vSpace5Height has the width of 110px .
		try {
			String locator = locatorReader.getLocator("BackOrder.Vspace5Height");
			String padding_top = this.getCSS(locator, "padding-top");
			 String padding_top_wopx = padding_top.substring(0, 3);
			// System.out.println("-------Padding top-----"+padding_top_wopx);
			int getsubpixel = Integer.parseInt(padding_top_wopx) - Integer.parseInt("3");
            String getfinalvalue=getsubpixel+"px";
			System.out.println("Actual Result" +getfinalvalue);
			Assert.assertEquals(getfinalvalue,vSpace5HeightBO);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order vSpace5Height Exception>>Expected Margin: 25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order vSpace5HeightError>>Expected Margin:25px");
			count = count + 1;
		}
		// Verify Gutter68Width has the width of 20px .
		try {
			String locator = locatorReader.getLocator("BackOrder.Vspace5Height");
			String padding_left = this.getCSS(locator, "padding-left");
			;
			System.out.println("Actual Result" +padding_left);
			Assert.assertEquals(Gutter68widthBO,padding_left);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order Gutter68widthBO Exception>>Expected Margin: 25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order Gutter68widthBO>>Expected Margin:25px");
			count = count + 1;
		}
		// Verify Gutter68Width has the width of 20px .
		try {
			String locator = locatorReader.getLocator("BackOrder.Vspace5Height");
			String padding_left = this.getCSS(locator, "padding-right");
			
			System.out.println("Actual Result" +padding_left);
			Assert.assertEquals(Gutter68widthBO,padding_left);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order Gutter68widthBO Exception>>Expected Margin: 25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order Gutter68widthBO>>Expected Margin:25px");
			count = count + 1;
		}
		// Verify textSpace14Height has the Height of 50px .
		try {
			String locator = locatorReader.getLocator("BackOrder.textSpace14Heightabove");
			String margin_top = this.getCSS(locator, "margin-top");
			 String margin_top_wopx = margin_top.substring(0, 2);
			int getsubpixel = Integer.parseInt(margin_top_wopx) - Integer.parseInt("2");
            String getfinalvalue=getsubpixel+"px";
			System.out.println("Actual Result" +getfinalvalue);
			System.out.println("Actual Result" +TextSpace14HeightBO);
			Assert.assertEquals(getfinalvalue,TextSpace14HeightBO);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order textSpace14Height Exception>>Expected Margin: 50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order textSpace14Height>>Expected Margin:50px");
			count = count + 1;
		}
		
		// Verify textSpace14Height has the Height of 50px .
		try {
			String locator = locatorReader.getLocator("BackOrder.textSpace14Heightabove");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			 String margin_bottom_wopx = margin_bottom.substring(0, 2);
			 
			 String locator1 = locatorReader.getLocator("BackOrder.textSpace14Heightabove");
			 String font_size = this.getCSS(locator1, "font-size");
			 String font_size_wopx = font_size.substring(0, 2);
			
			 String line_height = this.getCSS(locator1, "line-height");
			 String line_height_wopx = line_height.substring(0, 2);
				 
				 
			int getsubpixel = Integer.parseInt(line_height_wopx) - Integer.parseInt(font_size_wopx);
            int getaddvalue=Integer.parseInt(margin_bottom_wopx) +getsubpixel-Integer.parseInt("3");
			String getfinalvalue=getaddvalue+"px";
			System.out.println("Actual Result" +getfinalvalue);
			System.out.println("Actual Result" +TextSpace14HeightBO);
			Assert.assertEquals(getfinalvalue,TextSpace14HeightBO);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order textSpace14Height Exception>>Expected Margin: 50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order textSpace14Height>>Expected Margin:50px");
			count = count + 1;
		}
		// Verify textSpace14Height has the Height of 50px .
		try {
			String locator = locatorReader.getLocator("BackOrder.textSpace14Heightbelowradio");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			 String margin_bottom_wopx = margin_bottom.substring(0, 2);
			 
			 String locator1 = locatorReader.getLocator("BackOrder.textSpace14Heightbelowradio1");
			 String margin_bottom1 = this.getCSS(locator1, "margin-bottom");
			 String margin_bottom_wopx1 = margin_bottom1.substring(0, 2);
			

				 
				 
			
            int getaddvalue=Integer.parseInt(margin_bottom_wopx1) + Integer.parseInt(margin_bottom_wopx);
			String getfinalvalue=getaddvalue+"px";
			System.out.println("Actual Result" +getfinalvalue);
			System.out.println("Actual Result" +TextSpace14HeightBO);
			Assert.assertEquals(getfinalvalue,TextSpace14HeightBO);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order textSpace14Height Exception>>Expected Margin: 50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order textSpace14Height>>Expected Margin:50px");
			count = count + 1;
		}		
			
		
		
		// Verify Gutter45WidthBO has the Height of 18px .
		try {
			String locator = locatorReader.getLocator("BackOrder.gutter45width");
			String margin_left = this.getCSS(locator, "margin-left");
			 String margin_left_wopx = margin_left.substring(0, 2);
			
					 
			
            int getaddvalue=Integer.parseInt(margin_left_wopx) + Integer.parseInt("3");
			String getfinalvalue=getaddvalue+"px";
			System.out.println("Actual Result" +getfinalvalue);
			System.out.println("Actual Result" +Gutter45WidthBO);
			Assert.assertEquals(getfinalvalue,Gutter45WidthBO);
			 
			
		}
		catch (Exception ex) {
			System.out.println("B2B Back Order Gutter45WidthBO Exception>>Expected Result: 18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order Gutter45WidthBO>>Expected Resukt:18px");
			count = count + 1;
		}
		
		// Verify textSpace2Height has the Height of 23px .
		try {
			String locator = locatorReader.getLocator("BackOrder.textSpace14Heughtbelow");
			String margin_left = this.getCSS(locator, "margin-bottom");
			 String margin_left_wopx = margin_left.substring(0, 2);
			
					 
			
            int getaddvalue=Integer.parseInt(margin_left_wopx) + Integer.parseInt("3");
			String getfinalvalue=getaddvalue+"px";
			System.out.println("Actual Result" +getfinalvalue);
			System.out.println("Actual Result" +Gutter45WidthBO);
			Assert.assertEquals(getfinalvalue,TextSpace2HeightBO);
			 
			
		}
		catch (Exception ex) {
			System.out.println("B2B Back Order textSpace2Height Exception>>Expected : 23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order textSpace2Height>>Expected Resukt:23px");
			count = count + 1;
		}
		
	System.out.println("count value is :::" + count);
	Assert.assertTrue(count == 0);
						
	}
	public void verifinsufficientpage(String vSpace15Height,String Gutter68Width,String vSpace5Height,String textSpace5Height,String gutter45width)
	{
		
		//ReachUptoCreationHomePage();
		int count = 0;
		// Verify vSpace15Height has the width of 25px .
				
		try {
			String locator = locatorReader.getLocator("insufficientorder.vSpace15Height");
			String margin_top = this.getCSS(locator, "top");
			System.out.println("Actual Result" +margin_top);
			Assert.assertEquals(margin_top,vSpace15Height);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B insufficient page vSpace15Height Exception>>Expected Margin: 25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B insufficient page vSpace15Height Error>>Expected Margin:25px");
			count = count + 1;
		}
		// Verify vSpace5Height has the width of 110px .
				
		try {
			String locator = locatorReader.getLocator("BackOrder.Vspace5Height");
			String padding_top = this.getCSS(locator, "padding-top");
			 String padding_top_wopx = padding_top.substring(0, 3);
			// System.out.println("-------Padding top-----"+padding_top_wopx);
			int getsubpixel = Integer.parseInt(padding_top_wopx) - Integer.parseInt("3");
            String getfinalvalue=getsubpixel+"px";
			System.out.println("Actual Result" +getfinalvalue);
			Assert.assertEquals(getfinalvalue,vSpace5Height);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order vSpace5Height Exception>>Expected Margin: 110px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order vSpace5HeightError>>Expected Margin:110px");
			count = count + 1;
		}

		// Verify Gutter68Width has the width of 20px .
		try {
			String locator = locatorReader.getLocator("BackOrder.Vspace5Height");
			String padding_left = this.getCSS(locator, "padding-left");
			;
			System.out.println("Actual Result" +padding_left);
			Assert.assertEquals(Gutter68Width,padding_left);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order Gutter68widthBO Exception>>Expected Margin: 25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order Gutter68widthBO>>Expected Margin:25px");
			count = count + 1;
		}
		// Verify Gutter68Width has the width of 20px .
		try {
			String locator = locatorReader.getLocator("BackOrder.Vspace5Height");
			String padding_left = this.getCSS(locator, "padding-right");
			
			System.out.println("Actual Result" +padding_left);
			Assert.assertEquals(Gutter68Width,padding_left);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order Gutter68widthBO Exception>>Expected Margin: 25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order Gutter68widthBO>>Expected Margin:25px");
			count = count + 1;
		}		// Verify textSpace14Height has the Height of 50px .
		try {
			String locator = locatorReader.getLocator("BackOrder.textSpace14Heightabove");
			String margin_top = this.getCSS(locator, "margin-top");
			 String margin_top_wopx = margin_top.substring(0, 2);
			int getsubpixel = Integer.parseInt(margin_top_wopx) - Integer.parseInt("2");
            String getfinalvalue=getsubpixel+"px";
			System.out.println("Actual Result" +getfinalvalue);
			System.out.println("Actual Result" +textSpace5Height);
			Assert.assertEquals(getfinalvalue,textSpace5Height);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order textSpace14Height Exception>>Expected Margin: 50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order textSpace14Height>>Expected Margin:50px");
			count = count + 1;
		}
		
		// Verify textSpace14Height has the Height of 50px .
		try {
			String locator = locatorReader.getLocator("BackOrder.textSpace14Heightabove");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			 String margin_bottom_wopx = margin_bottom.substring(0, 2);
					 
			 String locator1 = locatorReader.getLocator("BackOrder.textSpace14Heightabove");
			 String font_size = this.getCSS(locator1, "font-size");
			 String font_size_wopx = font_size.substring(0, 2);
			 
			 String line_height = this.getCSS(locator1, "line-height");
			 String line_height_wopx = line_height.substring(0, 2);
			  
				 
			int getsubpixel = Integer.parseInt(line_height_wopx) - Integer.parseInt(font_size_wopx);
            int getaddvalue=Integer.parseInt(margin_bottom_wopx) +getsubpixel+Integer.parseInt("2");
			String getfinalvalue=getaddvalue+"px";
			System.out.println("Actual Result" +getfinalvalue);
			System.out.println("Actual Result" +textSpace5Height);
			Assert.assertEquals(getfinalvalue,textSpace5Height);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order textSpace14Height Exception>>Expected Margin: 50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order textSpace14Height>>Expected Margin:50px");
			count = count + 1;
		}

		// Verify vSpace5Height has the width of 110px .
		
		try {
			String locator = locatorReader.getLocator("BackOrder.vSpace5heightinsufficientfooter");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			// System.out.println("-------Padding top-----"+padding_top_wopx);
			
			String locator1 = locatorReader.getLocator("BackOrder.Vspace5Height");
			String padding_bottom = this.getCSS(locator1, "padding-bottom");
			String padding_bottom_wopx1 = padding_bottom.substring(0, 2);		
			int getsubpixel = Integer.parseInt(padding_bottom_wopx1)+Integer.parseInt(margin_bottom_wopx) + Integer.parseInt("1");
            String getfinalvalue=getsubpixel+"px";
			System.out.println("Actual Result" +getfinalvalue);
			Assert.assertEquals(getfinalvalue,vSpace5Height);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order vSpace5Height Exception>>Expected Margin: 110px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order vSpace5HeightError>>Expected Margin:110px");
			count = count + 1;
		}					
		// Verify gutter45width has the width of 110px .
		try {
			String locator = locatorReader.getLocator("insufficientorder.gutter45width");
			String margin_right = this.getCSS(locator, "margin-right");
			String margin_right_wopx = margin_right.substring(0, 2);
		
			int getsubpixel = Integer.parseInt(margin_right_wopx)+ Integer.parseInt("3");
            String getfinalvalue=getsubpixel+"px";
			System.out.println("Actual Result" +getfinalvalue);
			Assert.assertEquals(getfinalvalue,gutter45width);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order gutter45width Exception>>Expected Result: 18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order gutter45width Error>>Expected Result:18px");
			count = count + 1;
		}	
								
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	public void verifyuploadcart(String quantity, String RefNumber, String VSpace15HeightUpCart, String vSpace5HeightUpCart, String Gutter68width, String TextSpace14Height, String vSpace9Height, String Gutter34Width)
	{	 
		
		System.out.println("----------Main Function called----------");	
	//Click Product on search Result Page
	this.selectproducttobuy();
	
	//Enter Quantity on Serach Result Page
	this.enterquantity(quantity);
	
	//Click add to cart button
	
	this.clickonaddtocartbutton();
	
	//Click cart link 
	this.ClickCartLink();
	
	////Click Compare Amount
	this.CampareAmaount();
	
	// Click View Cart button
	this.ClickViewCartbutton();
	
	
	//Enter refrence Number
	this.EnterRefNumber(RefNumber);
	
	//Click Check out button
//	this.ClickCheckOut();
	
	// Click Update button
	//this.ClickUpdateButton();
	
	//Click Place Order
//	this.ClickPlaceOrderButton();
	
	// Click upload cart icon
	this.ClickUploadCart();
	
	//verify uploadcartpopup
	
	this.verifyuploadcartpopup(VSpace15HeightUpCart,vSpace5HeightUpCart,Gutter68width,TextSpace14Height,vSpace9Height,Gutter34Width);
	
	//Click Welcome icon
	this.ClickWelcomeIcon();
	
	//Click Sign Out button
	this.ClickSignOut();
     //Verify home page.
	// this.WaitForElementPresent(locatorReader.getLocator("Login.VerifyStoreLink"), 5);
	// Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Login.VerifyStoreLink")));
     
	}
	//Click update button
	public void ClickUploadCart()
	{
		
		String locator = locatorReader.getLocator("uploadcart.clickuploadcart");
		this.WaitForElementEnabled(locator, 5);
		clickOn(locator);
		System.out.println("Verify that user is able to click'Update button' successfully");
	}	
	
	//verify pixel at upload cart page
			
	public void verifyuploadcartpopup(String VSpace15HeightUpCart, String vSpace5HeightUpCart, String Gutter68width, String TextSpace14Height, String vSpace9Height, String Gutter34Width)
	{
		
		//ReachUptoCreationHomePage();
		int count = 0;
		// Verify vSpace15Height has the width of 25px .
				
		try {
			String locator = locatorReader.getLocator("uploadcart.vSpace15Height");
			String margin_top = this.getCSS(locator, "top");
			System.out.println("Actual Result" +margin_top);
	       	Assert.assertEquals(margin_top,VSpace15HeightUpCart);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B insufficient page vSpace15Height Exception>>Expected Margin: 25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B insufficient page vSpace15Height Error>>Expected Margin:25px");
			count = count + 1;
		}
		// Verify vSpace5Height has the width of 110px .
		try {
			String locator = locatorReader.getLocator("uploadcart.vSpace5Height");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Result" +padding_top);
			Assert.assertEquals(padding_top,vSpace5HeightUpCart);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order vSpace5Height Exception>>Expected Margin: 110px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order vSpace5HeightError>>Expected Margin:110px");
			count = count + 1;
		}
		// Verify vSpace5Height has the width of 110px .
		try {
			String locator = locatorReader.getLocator("uploadcart.vSpace5Height");
			String padding_top = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Result" +padding_top);
			Assert.assertEquals(padding_top,vSpace5HeightUpCart);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order vSpace5Height Exception>>Expected Margin: 110px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order vSpace5Height Error>>Expected Margin:110px");
			count = count + 1;
		}
		// Verify Gutter68width has the width of 25px .
	/*	try {
			String locator = locatorReader.getLocator("uploadcart.vSpace15Height");
			
			String left = this.getCSS(locator, "left");
			System.out.println("Actual Result" +left);
			Assert.assertEquals(left,Gutter68width);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B insufficient page Gutter68width Exception>>Expected Margin: 25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B insufficient page Gutter68width Error>>Expected Margin:25px");
			count = count + 1;
		}
		*/	
		// Verify textSpace14Height has the height of 50px .

		try {
			String locator = locatorReader.getLocator("uploadcart.textSpace14Height");
			String padding_top = this.getCSS(locator, "margin-bottom");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			System.out.println("Actual Result" +padding_top);
			String padding_top_wopx = padding_top.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
	//		Assert.assertEquals(padding_top,vSpace5HeightUpCart);
			int getsubpixel = Integer.parseInt(font_size_wopx)-Integer.parseInt(line_height_wopx) ;
            int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel;
			String getfinalvalue=getaddpixel+"px";
            System.out.println("Actual Value "+getfinalvalue);
			Assert.assertEquals(getfinalvalue,TextSpace14Height);
		}

		catch (Exception ex) {
			System.out.println("B2B Back Order TextSpace14Height Exception>>Expected Result: 50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Back Order TextSpace14Height Error>>Expected Result:50px");
			count = count + 1;
		}
		
		// Verify vSpace9Height has the height of 17px .

				try {
					String locator = locatorReader.getLocator("uploadcart.vSpace9Heightuploadfile");
					String padding_top = this.getCSS(locator, "margin-bottom");
					String font_size = this.getCSS(locator, "font-size");
					String line_height = this.getCSS(locator, "line-height");
					System.out.println("Actual Result" +padding_top);
					String padding_top_wopx = padding_top.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
			//		Assert.assertEquals(padding_top,vSpace5HeightUpCart);
					int getsubpixel = Integer.parseInt(line_height_wopx)-Integer.parseInt(font_size_wopx) ;
		            int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel+Integer.parseInt("1");
		            String getfinalvalue=getaddpixel+"px";
		            System.out.println("Actual Value "+getfinalvalue);
					Assert.assertEquals(getfinalvalue,vSpace9Height);
				}

				catch (Exception ex) {
					System.out.println("B2B Back Order TvSpace9Height Exception>>Expected Result: 17px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("B2B Back Order vSpace9Height Error>>Expected Result:17px");
					count = count + 1;
				}
				
				// Verify Gutter34Width has the width of 23px .

				try {
					String locator = locatorReader.getLocator("uploadcart.gutter34width");
					String padding_left = this.getCSS(locator, "padding-left");
										System.out.println("Actual Result" +padding_left);
					String padding_left_wopx = padding_left.substring(0, 2);
					
		            int getaddpixel=Integer.parseInt(padding_left_wopx)+Integer.parseInt("1");
		            String getfinalvalue=getaddpixel+"px";
		            System.out.println("Actual Value "+getaddpixel);
					Assert.assertEquals(getfinalvalue,Gutter34Width);
				}

				catch (Exception ex) {
					System.out.println("B2B Back Order Gutter34Width Exception>>Expected Result: 23px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("B2B Back Order Gutter34Width Error>>Expected Result:23px");
					count = count + 1;
				}
				
				// Verify vSpace9Height has the height of 50px .

				try {
					String locator = locatorReader.getLocator("uploadcart.vSpace9Heightbelowchoose");
					String margin_bottom = this.getCSS(locator, "margin-bottom");
					String margin_bottom_wopx = margin_bottom.substring(0, 2);
					
					
					String locator1 = locatorReader.getLocator("uploadcart.vSpace9Heightbelowupload");
					String margin_top = this.getCSS(locator1, "margin-top");
					String margin_top_wopx1 = margin_top.substring(0, 1);
					
					
		            int getaddpixel=Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(margin_top_wopx1);
					String getfinalvalue=getaddpixel+"px";
		            System.out.println("Actual Value "+getfinalvalue);
					Assert.assertEquals(getfinalvalue,vSpace9Height);
				}

				catch (Exception ex) {
					System.out.println("B2B Back Order vSpace9Height Exception>>Expected Result: 17px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("B2B Back Order vSpace9Height Error>>Expected Result:17px");
					count = count + 1;
				}

		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}		
	
	
}