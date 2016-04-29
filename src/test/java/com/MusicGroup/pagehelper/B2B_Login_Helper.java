/*==============================================================================================================================
 File Name    : B2B_Login_Helper.java
 ClassName    : B2B_Login_Helper
 Summary      : Contains helping methods for Login Page on B2B store.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_Login_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public B2B_Login_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("B2B_Login.xml");
	}
		
	//Enter userName 
	public void enterUserName(String userName)
	{
		String locator = locatorReader.getLocator("Login.EnterUserName");
		this.WaitForElementEnabled(locator, 5);
		sendKeys(locator, userName);
	}
	
	//Enter password 
	public void enterPassword(String password)
	{
		String locator = locatorReader.getLocator("Login.EnterPassword");
		this.WaitForElementEnabled(locator, 5);
		sendKeys(locator, password);
	}
	
	//Click on Sign in
	public void clickonSubmit()
	{
		String locator = locatorReader.getLocator("Login.ClickSubmit");
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
	//Login into B2B store
	public void b2BuserLogin(String userName, String password)
	{	

	//Check page not found
	this.checkPageNotFound();
	//Enter user name	
     this.enterUserName(userName);
     
     //Enter password
     this.enterPassword(password);
     
     //Click on Sign In
     this.clickonSubmit();
     
     //Verify home page.
	 this.WaitForElementPresent(locatorReader.getLocator("Login.VerifyStoreLink"), 5);
	 Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Login.VerifyStoreLink")));
     
	}
	public void b2BuserLoginInActive(String userName, String password)
	{	

	//Check page not found
	this.checkPageNotFound();
	//Enter user name	
     this.enterUserName(userName);
     
     //Enter password
     this.enterPassword(password);
     
     //Click on Sign In
     this.clickonSubmit();
     
     //Verify home page.
	 this.WaitForElementPresent(locatorReader.getLocator("Login.VerifyStoreLink"), 5);
//	 Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("Login.VerifyStoreLink")));
     
	}

}
