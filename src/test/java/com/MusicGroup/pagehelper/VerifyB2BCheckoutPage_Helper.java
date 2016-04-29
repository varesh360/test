package test.java.com.MusicGroup.pagehelper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class VerifyB2BCheckoutPage_Helper extends DriverHelper {
	private LocatorReader locatorReader;	
	int count=0;
	//String ExpectedResult="true"; 
	public VerifyB2BCheckoutPage_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("VerifyB2BCheckoutPage.xml");
	}
	public void VerifyB2BLoginPage(String B2BUser,String password,String ExpectedResult){
		//Verify Logo On Login Page
		try{
			String Locator=locatorReader.getLocator("LoginPage.VerifyLogoOnLogin");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
		}
		catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		
		//Verify MusicID SignIn Text on Login Page		
		try{
			String Locator=locatorReader.getLocator("LoginPage.VerifySignInHeading");
			this.WaitForElementVisible(Locator, 10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
		}
		catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		try{
			String Locator=locatorReader.getLocator("LoginPage.VerifyMusicGroupID");
			this.WaitForElementVisible(Locator, 10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			String UserID="allprod@music-group.com";
			this.sendKeys(Locator, UserID);
						
		}
		catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		try{
			String Locator=locatorReader.getLocator("LoginPage.VerifyMusicGroupPassword");
			this.WaitForElementVisible(Locator, 10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			String Password="Welcome123";
			this.sendKeys(Locator, Password);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		try{
			String Locator=locatorReader.getLocator("LoginPage.VerifyLogInButton");
			this.WaitForElementVisible(Locator, 10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			this.clickOn(Locator);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		
		
	}
	
	//Verify Store Page
	public void VerifyStorePage(String ExpectedResult){
		//Verify User
		try{
		
			String Locator=locatorReader.getLocator("StoreHomePage.VerifyLoggedUser");
			this.WaitForElementVisible(Locator, 10);
			
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		
		//Verify Logo
		try{
			String Locator=locatorReader.getLocator("StoreHomePage.VerifyLogoLogin");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
		}
		catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		//Click On Midas Brand
		/*
		try{
			String Locator=locatorReader.getLocator("LoginPage.ClickOnMidasBrand");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			clickOn(Locator);
		}
		catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		*/
		//Click on Mixer under category
		try{
			String Locator=locatorReader.getLocator("StoreHomePage.ClickOnMixer");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			clickOn(Locator);
			Thread.sleep(10000);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		//Click on DSPRouter under Mixer category
		try{
			String Locator=locatorReader.getLocator("StoreHomePage.ClickOnDSPRouter");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			clickOn(Locator);
			Thread.sleep(10000);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		//Enter the quantity in product quantity
			try{
	
			String Locator=locatorReader.getLocator("StoreHomePage.TextEnterQuantity");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			sendKeys(Locator, "1");
			Thread.sleep(10000);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		
		//Click on "Add to Cart" button
		try{
			String Locator=locatorReader.getLocator("StoreHomePage.ClickonAdtoCart");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
		
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			clickOn(Locator);
			Thread.sleep(10000);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
	
	
//Click on Cart option in menu
		try{
			String Locator=locatorReader.getLocator("StoreHomePage.ClickonCartOption");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			clickOn(Locator);
			Thread.sleep(10000);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		
		//Click on View Cart
		try{
			String Locator=locatorReader.getLocator("StoreHomePage.ClickonViewCart");
			this.WaitForElementVisible(Locator,20);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			clickOn(Locator);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		
		/*try{
			String Locator=locatorReader.getLocator("StoreHomePage.ClickonViewCart");
			this.WaitForElementVisible(Locator,20);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			clickOn(Locator);
		}
		catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		*/
	}
	public void verifyShoppingCartPage(String ExpectedResult,String ReferenceID,String OrderType,String DeliveryMode,String DeliveryAdress){
		//Verify Logo On Login Page
		try{
			System.out.println("Enter Shopping Cart");
			String Locator=locatorReader.getLocator("ShoppingCart.VerifyLogo");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
		}
		catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		
		//Verify Heading "Shopping Cart" on Page
		try{
			String Locator=locatorReader.getLocator("ShoppingCart.VerifyHeadingPage");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
	}
	//Enter Refernce ID
	try{
			String Locator=locatorReader.getLocator("ShoppingCart.EnterReferenceID");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			
			sendKeys(Locator, ReferenceID);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
	}
	//Click On OrderType
	try{
			String Locator=locatorReader.getLocator("ShoppingCart.ClickOrderType");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			clickOn(Locator);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
	}
	//Click on the delivey mode
		try{
			String Locator=locatorReader.getLocator("ShoppingCart.ClickOnDeliveryMode");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			clickOn(Locator);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
	}
	/*
	//verify Chip from CN
	try{
			String Locator=locatorReader.getLocator("ShoppingCart.ShipFromCN");
			this.WaitForElementVisible(Locator,50);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
	}
	*/
	//Select Delivery Address
	try{
			String Locator=locatorReader.getLocator("ShoppingCart.SelectDeliveryAddress");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			String Address="203 Eggert Road, NY, Buffalo, 14215";
			selectDropDown(Locator, Address);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
	}
	//Click on Checkout button
	try{
		
			String Locator=locatorReader.getLocator("ShoppingCart.ClickOnCheckOutButton");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			clickOn(Locator);
			System.out.println("Clicked on CheckoutPage");
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
	}
}
//Verify Checkout Page
public void VerifyCheckOutPage(String ExpectedResult,String ReferenceID,String OrderType,String DeliveryMode,String DeliveryAdress){
	//Verify Logo On Login Page
		try{
			System.out.println("EnterCheckoutPage");
			String Locator=locatorReader.getLocator("ShoppingCart.VerifyLogo");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
		}
		catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		
	//Verify shopping Cart Heading
		try{
			String Locator=locatorReader.getLocator("CheckOutPage.VerifyHeadingOnPage");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
	}
	
	//Verify Reference Number
			try{
				//String sData="1234567";
			String Locator=locatorReader.getLocator("CheckOutPage.verifyReferenceNo");
			this.WaitForElementVisible(Locator,10);
			
		
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
			}
			//verify Reference Number
			try{
				String Locator=locatorReader.getLocator("CheckOutPage.VerifyReferenceNumber");
				this.WaitForElementVisible(Locator,10);
				String Text=this.getText(Locator);
				System.out.println("Text"+Text);
				Boolean Result=this.isElementPresent(Locator);
				System.out.println("Result is"+Result);
				String ActualResult=Text.toString();
				System.out.println("Reference ID ActualResult"+ActualResult);
				System.out.println("ReferenceID"+ReferenceID);
				Assert.assertEquals(ReferenceID, ActualResult);
			}catch(Exception e){
				System.out.println("Product logo not found");
				count = count +1;
				}
			//Verify Order type
			try{
				//String orderType="Preorder Now";
			String Locator=locatorReader.getLocator("CheckOutPage.verifyOrderType");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
			}
			//Verify Order type 
			try{
				//String orderType="Preorder Now";
			String Locator=locatorReader.getLocator("CheckOutPage.VerifyOrderTypeData");
			this.WaitForElementVisible(Locator,10);
			String Text=this.getText(Locator);
			
			System.out.println("Result is"+Text);
			String ActualResult=Text.toString();
			Assert.assertEquals(OrderType, ActualResult);
			}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
			}
			//Verify Delivery Mode
				try{
				//String Deliverymode="Sea";
			String Locator=locatorReader.getLocator("CheckOutPage.VerifyDeliveryMode");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
			}
				//Verify Delivery Mode
				try{
					//String Deliverymode="Sea";
				String Locator=locatorReader.getLocator("CheckOutPage.VerifyDeliveryModeData");
				this.WaitForElementVisible(Locator,10);
				String Text=this.getText(Locator);
				
				System.out.println("Result is"+Text);
				String ActualResult=Text.toString();
				
				Assert.assertEquals(DeliveryMode, ActualResult);
				}catch(Exception e){
				System.out.println("Product logo not found");
				count = count +1;
				}
			//Verify Address
			try{
			
			String Locator=locatorReader.getLocator("CheckOutPage.verifyAddress");
			this.WaitForElementVisible(Locator,10);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
			}
			//Verify Order Address 
			try{
				String Adress="203 Eggert Road, NY, Buffalo, 14215";
			String Locator=locatorReader.getLocator("CheckOutPage.verifyAddressData");
			this.WaitForElementVisible(Locator,10);
			String Text=this.getText(Locator);
			System.out.println("Result is"+Text);
			String ActualResult=Text.toString();
			Assert.assertEquals(DeliveryAdress, ActualResult);
			}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
			}
	
			//verify Chip from CN
			/*
	try{
			String Locator=locatorReader.getLocator("ShoppingCart.ShipFromCN");
			this.WaitForElementVisible(Locator,50);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
	}
	*/
	//Verify Place Order Button
	try{
		
			String Locator=locatorReader.getLocator("CheckOutPage.VerifyPlaceOrderButton");
			this.WaitForElementVisible(Locator,50);
			Boolean Result=this.isElementPresent(Locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
			clickOn(Locator);
		}catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
	}
}
//Verify Order Success Page
public void VerifyOrderSuccessPage(String ExpectedResult){
	try{
		System.out.println("Verify Order Success Page");
		String Locator=locatorReader.getLocator("OderSuccessFullpage.VerifyOrderSuccessFul");
		this.WaitForElementVisible(Locator,50);
		Boolean Result=this.isElementPresent(Locator);
		System.out.println("Result is"+Result);
		String ActualResult=Result.toString();
		Assert.assertEquals(ExpectedResult, ActualResult);
	}catch(Exception e){
		System.out.println("Product logo not found");
		count = count +1;
}
}

public void VerifyCheckout(String B2BUser,String password,String ExpectedResult,String ReferenceID,String OrderType,String DeliveryMode,String DeliveryAdress){
	this.VerifyB2BLoginPage(B2BUser, password, ExpectedResult);
	this.VerifyStorePage(ExpectedResult);
	this.verifyShoppingCartPage(ExpectedResult, ReferenceID, OrderType, DeliveryMode, DeliveryAdress);
	this.VerifyCheckOutPage( ExpectedResult, ReferenceID, OrderType, DeliveryMode, DeliveryAdress);
	this.VerifyOrderSuccessPage(ExpectedResult);
	System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);
}


}
