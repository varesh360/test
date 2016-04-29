package test.java.com.MusicGroup.pagehelper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class VerifyB2B_OrderHistoryDownload_Helper extends DriverHelper {
	private LocatorReader locatorReader;	
	int count=0;
	//String ExpectedResult="true"; 
	public VerifyB2B_OrderHistoryDownload_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("VerifyB2B_OrderHistoryDownload.xml");
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
			String Locator=locatorReader.getLocator("StoreHomePage.ClickOnOrder");
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
		//Click on Download Link 
		try{
			String Locator=locatorReader.getLocator("StoreHomePage.ClickOnDownloadMenu");
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
	}
public void VerifyCheckout(String B2BUser,String password,String ExpectedResult,String ReferenceID,String OrderType,String DeliveryMode,String DeliveryAdress){
	this.VerifyB2BLoginPage(B2BUser, password, ExpectedResult);
	this.VerifyStorePage(ExpectedResult);
	
	System.out.println("count value is :::" + count);
		Assert.assertTrue(count==0);
}

}
