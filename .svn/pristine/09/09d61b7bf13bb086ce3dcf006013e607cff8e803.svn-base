package test.java.com.MusicGroup.pagehelper;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class VerifyB2B_OrderHistoryUpdate_Helper extends DriverHelper {
	private LocatorReader locatorReader;	
	int count=0;
	//String ExpectedResult="true"; 
	public VerifyB2B_OrderHistoryUpdate_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("VerifyB2B_OrderHistoryUpdate.xml");
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
	public void verifyShoppingCartPage(String ExpectedResult,String ReferenceID,String OrderType,String DeliveryMode,String DeliveryAdress)throws InterruptedException{
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
	
	/*
	//Click on Upload button
	try{
		String Locator=locatorReader.getLocator("ShoppingCart.ClickOnUpload");
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
	//Verify UploadCart
	try{
		
		String Locator=locatorReader.getLocator("LoginPage.VerifyUploadCart");
		this.WaitForElementVisible(Locator, 10);
		
		Boolean Result=this.isElementPresent(Locator);
		System.out.println("Result is"+Result);
		String ActualResult=Result.toString();
		Assert.assertEquals(ExpectedResult, ActualResult);
		
	}catch(Exception e){
		System.out.println("Product logo not found");
		count = count +1;
	}

*/
	//click on Choose file
	/*
	try{
		
		String Locator=locatorReader.getLocator("LoginPage.ClickOnChooseFile");
		this.WaitForElementVisible(Locator, 10);
		
		Boolean Result=this.isElementPresent(Locator);
		System.out.println("Result is"+Result);
		String ActualResult=Result.toString();
		Assert.assertEquals(ExpectedResult, ActualResult);
		clickOn(Locator);
	}catch(Exception e){
		System.out.println("Product logo not found");
		count = count +1;
	}
	*/
/*
	//Click On Upload List
	try {

		String Locator = locatorReader
				.getLocator("LoginPage.VerifyUploadCart");
		WaitForElementVisible(Locator, 10);

		Boolean Result = this.isElementPresent(Locator);
		System.out.println("Result is" + Result);
		String ActualResult = Result.toString();
		Assert.assertEquals(ExpectedResult, ActualResult);

	} catch (Exception e) {
		System.out.println("Product logo not found");

	}

	// click on Choose file
	String Root_Path = System.getProperty("user.dir");
	String Path = Root_Path + "\\product-list.csv";
	System.out.println("Path" + Path);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("document.getElementById('cartFile').style.display = 'block';");
	driver.findElement(ByLocator("cartFile")).sendKeys(Path);
	js.executeScript("document.getElementById('cartFile').style.display = 'none';");
	Assert.assertTrue(isElementPresent("//span[contains(.,'product-list.csv')]"));
	System.out.println(getText("//span[contains(.,'product-list.csv')]"));
	System.out.println("File is selected");
	Thread.sleep(2000);

	// Click on Upload Button
	System.out.println("Clicking on upload btn");
	WebElement element = driver.findElement(ByLocator("//button[@value='Upload']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();",element);
	Thread.sleep(3000);

	// Click on Create Button
	System.out.println("Click on Create button");
	String Locator1 = locatorReader.getLocator("LoginPage.ClickOnCreateButton");
	WaitForElementVisible(Locator1, 10);
	if (!driver.findElement(ByLocator(Locator1)).isDisplayed()) {
		Assert.fail("Create button is not present");
	}
	clickOn(Locator1);
	Thread.sleep(1000);
	

	//Click on Upload Button
	try{
		
		String Locator=locatorReader.getLocator("LoginPage.ClickOnUploadButton");
		this.WaitForElementVisible(Locator, 10);
		
		Boolean Result=this.isElementPresent(Locator);
		System.out.println("Result is"+Result);
		String ActualResult=Result.toString();
		Assert.assertEquals(ExpectedResult, ActualResult);
		clickOn(Locator);
	}catch(Exception e){
		System.out.println("Product logo not found");
		count = count +1;
	}

	//Click on Create Button
	try{
		
		String Locator=locatorReader.getLocator("LoginPage.ClickOnCreateButton");
		this.WaitForElementVisible(Locator, 10);
		
		Boolean Result=this.isElementPresent(Locator);
		System.out.println("Result is"+Result);
		String ActualResult=Result.toString();
		Assert.assertEquals(ExpectedResult, ActualResult);
		clickOn(Locator);
	}catch(Exception e){
		System.out.println("Product logo not found");
		count = count +1;
	}
	
	
	//Click On Replace Button
	try{
		
		String Locator=locatorReader.getLocator("LoginPage.ClickOnReplaceButton");
		
		
		if (isElementPresent(Locator)) {
			clickOn(Locator);
			Thread.sleep(3000);
			System.out.println("Test Data");
		}
	} catch (Exception e) {
		System.out.println("Failed to click on Replace button");
	}
	
*/

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
	//Click on PlaceOrder
	try{
		
		String Locator=locatorReader.getLocator("CheckOutPage.VerifyPlaceOrderButton");
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
//Verify Order Successful Window
public void VerifyOrderSuccessPage(String ExpectedResult, String ReferenceID){
	String Order;
	try{
		System.out.println("Verify Order Success Page");
		String Locator=locatorReader.getLocator("OderSuccessFullpage.VerifyOrderSuccessFul");
		WaitForElementVisible(Locator,20);
		Assert.assertTrue(driver.findElement(ByLocator(Locator)).isDisplayed(), "Order is not succesfull");
		Boolean Result=this.isElementPresent(Locator);
		System.out.println("Result is "+Result);
		String ActualResult=Result.toString();
		Assert.assertEquals(ExpectedResult, ActualResult);
	}catch(Exception e){
		System.out.println("Product logo not found");
		count = count +1;
}
	//try{
	//	System.out.println("Get the order number");
		//WaitForElementPresent("//a[@class='btn-close-success']", 20);
	//	Assert.assertTrue(driver.findElement(ByLocator("//a[@class='btn-close-success']")).isDisplayed(), "Close button not found");
		//String Locator=locatorReader.getLocator("OderSuccessFullpage.GetOrderNumber");
		//System.out.println(Locator);
		//WaitForElementPresent(Locator,30);
		//Assert.assertTrue(driver.findElement(ByLocator(Locator)).isDisplayed(), "Order Number text not found");
		//String OrderNumber=getText(Locator);
		//System.out.println("OrderNumber"+OrderNumber);
		//if(OrderNumber.equals(""))
			//{Assert.fail("Order Number not displayed");}
		//String[] parts=OrderNumber.split(" ");
		//Order=parts[1];
		//System.out.println("Order"+Order);
		//Boolean Result=this.isElementPresent(Locator);
		//System.out.println("Result is"+Result);
		//String ActualResult=Result.toString();
		//Assert.assertEquals(ExpectedResult, ActualResult);
	//}catch(Exception e){
		//System.out.println("Product logo not found");
		//count = count +1;
//}
	//Click on Close Sign
	try{
		System.out.println("Verify Order Success Page");
		String Locator=locatorReader.getLocator("OderSuccessFullpage.ClickOnCloseSign");
		this.WaitForElementVisible(Locator,50);
		clickOn(Locator);
	}catch(Exception e){
		System.out.println("Product logo not found");
		count = count +1;
}
	
	//Click on Order Link
	try{
		System.out.println("Verify Order Success Page");
		String Locator=locatorReader.getLocator("OderSuccessFullpage.ClickOnOrderLink");
		this.WaitForElementVisible(Locator,50);
		clickOn(Locator);
	}catch(Exception e){
		System.out.println("Product logo not found");
		count = count +1;
}
//Verify Reference Number in OrderHistory Section


	try{
		System.out.println("Verify Order Success Page");
WebElement element=driver.findElement(By.xpath("//tr[1]/td[@class='Number-Text']/p[contains(text(), 'Ref. Number: "+ReferenceID+"')]"));
System.out.println("System Result"+element);
if(driver.findElement(By.xpath("//tr[1]/td[@class='Number-Text']/p[contains(text(), 'Ref. Number: "+ReferenceID+"')]"))!=null){
	System.out.println("Order History is Successfully updated");
}
else
{
	System.out.println("Order History is not Successfully Updated");
}
		//String Locator=locatorReader.getLocator("OderSuccessFullpage.ClickOnOrderLink");
		//this.WaitForElementVisible(Locator,50);
		//clickOn(Locator);

	}catch(Exception e){
		System.out.println("Product logo not found");
		count = count +1;
}
}
public void VerifyCheckout(String B2BUser,String password,String ExpectedResult,String ReferenceID,String OrderType,String DeliveryMode,String DeliveryAdress)throws InterruptedException{
	this.VerifyB2BLoginPage(B2BUser, password, ExpectedResult);
	this.VerifyStorePage(ExpectedResult);
	this.verifyShoppingCartPage(ExpectedResult, ReferenceID, OrderType, DeliveryMode, DeliveryAdress);
	this.VerifyOrderSuccessPage(ExpectedResult, ReferenceID);
	System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);
}

}
