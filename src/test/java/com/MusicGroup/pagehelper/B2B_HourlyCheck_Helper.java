package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.sun.tools.javac.util.List;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_HourlyCheck_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_HourlyCheck_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_HourlyCheck.xml");
	
	}
	
		//Click Behringer x32 product on serach result page
	public void ClickOrderonHomePage()
	
	{
		
		String locator = locatorReader.getLocator("B2BHourlyCheck.CountProducts");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
			
	}
	//Check Page not found
	public void checkPageNotFound()
	{
		String actualTitle1 = driver.getTitle();
		System.out.println("Get Titile"+ actualTitle1);
		String expectedTitle1 = "MUSIC Group | Store Homepage";
		Assert.assertEquals(actualTitle1,expectedTitle1);
	
	}
	
	//Reach upto B2BSearchField
	public void ReachUptoCreationHomePage()
	{
		
		//Click Behringer x32 product on serach result page
	//	this.ClickOrderonHomePage();
		//Check page not found
	this.checkPageNotFound();
		
	}
	public void VerifyB2BHourlyCheckHelper()
	{
		
		ReachUptoCreationHomePage();
		int count = 0;
		// Verify vSpace1Height has the width of 70px .
				
		try {
		int Expectedsize=12;
		int Actualsize=	driver.findElements(By.xpath("//div[@class='productGrid product-grid']/ul/li")).size();
		Assert.assertEquals(Expectedsize,Actualsize);
		}
		catch (Exception ex) {
			System.out.println("B2B Home Page Exception: Product are not displaying");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Home Page Error: Product are not displaying");
			count = count + 1;
		}
	    System.out.println("count value is :::" + count);
			Assert.assertTrue(count == 0);
		
		}
		
		
		
			
	}	
