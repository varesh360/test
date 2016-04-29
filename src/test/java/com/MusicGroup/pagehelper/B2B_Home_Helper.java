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

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_Home_Helper extends DriverHelper
{
	private LocatorReader locatorReader;	

	public B2B_Home_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("B2B_Home.xml");
	}
		
	//Enter Search key 
	public void enterSearchText(String searchkey)
	{
		String locator = locatorReader.getLocator("SearchField");
		this.WaitForElementEnabled(locator, 5);
		sendKeys(locator, searchkey);
	}
	
	//Check Page not found
	public void checkPageNotFound()
	{
		String actualTitle1 = driver.getTitle();
		System.out.println("Get Titile"+ actualTitle1);
		String expectedTitle1 = "Not Found | MUSIC Group";
		Assert.assertFalse(actualTitle1==expectedTitle1);
	
	}
	
	//Verify search result section
	public void verifySearchResultSection(String searchtext, int commonserach)
	{	  	
		
		//Check page not found
		this.checkPageNotFound();
		this.enterSearchText(searchtext);
		 int count = 0;
		 //
	 try {
			
			String locator = locatorReader.getLocator("CommonSearches.CommonSearch");
			this.WaitForElementPresent(locator, 15);
			Assert.assertTrue(this.isElementPresent(locator));
				
		}

		catch (Exception ex) {
			System.out.println("Exception >>B2B Common Search Section is not displayed");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Error >>B2B Common Search Section is not displayed");
			count = count + 1;
		}
	 try {
			
			String locator = locatorReader.getLocator("CommonSearches.ProductSearches");
			this.WaitForElementPresent(locator, 15);
			Assert.assertTrue(this.isElementPresent(locator));
			
		}

		catch (Exception ex) {
			System.out.println("Exception >>B2B Product Search Section is not displayed");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Error >>B2B Common Product Search is not displayed");
			count = count + 1;
		}
	 try {
			
			String locator = locatorReader.getLocator("CommonSearches.categories");
			this.WaitForElementPresent(locator, 15);
			Assert.assertTrue(this.isElementPresent(locator));
			
			
		}

		catch (Exception ex) {
			System.out.println("Exception >>B2B categories Section is not displayed");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Error >>B2B categories Search is not displayed");
			count = count + 1;
		}
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	

	}
	
	//Verify maximum five common search results are displayed on B2B search results page.
	public void SearchResultLimit(String searchtext, int commonserach)
	{	  
		
		//Check page not found
		this.checkPageNotFound();
		//Enter search text
		this.enterSearchText(searchtext);
		
		int count = 0;
		 try {
				
				String locator = locatorReader.getLocator("CommonSearches.CommonSearch");
				this.WaitForElementPresent(locator, 15);
				Assert.assertTrue(this.isElementPresent(locator));
				int ButtonNamelist = driver.findElements(By.xpath("//li[@class='suggestions common-search-item ui-menu-item']")).size();
				System.out.print("Actual Result     "+ButtonNamelist);
				Assert.assertEquals(ButtonNamelist,commonserach);
			}

			catch (Exception ex) {
				System.out.println("Exception >>B2B Common Search Section is not displayed");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Error >>B2B Common Search Section is not displayed");
				count = count + 1;
			}
		 try {
				
				String locator = locatorReader.getLocator("CommonSearches.ProductSearches");
				this.WaitForElementPresent(locator, 15);
				Assert.assertTrue(this.isElementPresent(locator));
			
				
			}

			catch (Exception ex) {
				System.out.println("Exception >>B2B Product Search Section is not displayed");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Error >>B2B Common Product Search is not displayed");
				count = count + 1;
			}
		 try {
				
				String locator = locatorReader.getLocator("CommonSearches.categories");
				this.WaitForElementPresent(locator, 15);
				Assert.assertTrue(this.isElementPresent(locator));
			
				
			}

			catch (Exception ex) {
				System.out.println("Exception >>B2B categories Section is not displayed");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Error >>B2B categories Search is not displayed");
				count = count + 1;
			}
			System.out.println("count value is :::" + count);
			Assert.assertTrue(count == 0);
	
					}
	
	//Verify search result section
	public void verifyProductLimit(String searchtext, int commonserach)
	{	  
     
		//Check page not found
				this.checkPageNotFound();
				//Enter search text
				this.enterSearchText(searchtext);
				
				int count = 0;
				 try {
						
						String locator = locatorReader.getLocator("CommonSearches.ProductSearches");
						this.WaitForElementPresent(locator, 15);
						Assert.assertTrue(this.isElementPresent(locator));
						int ButtonNamelist = driver.findElements(By.xpath("//li[@class='product recommended-result-item ui-menu-item']")).size();
						System.out.print("Actual Result   "+ButtonNamelist);
						Assert.assertEquals(ButtonNamelist,commonserach);
					//	Assert.assertEquals(size,commonserach);
						
					}

					catch (Exception ex) {
						System.out.println("Exception >>Verify maximum 10 Products are displayed on B2B search results page.");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Error >>Verify maximum 10 Products are displayed on B2B search results page.");
						count = count + 1;
					}
					System.out.println("count value is :::" + count);
					Assert.assertTrue(count == 0);
	}
	
	//Verify search result section
	public void verifyCategoryLimitSearch(String searchtext, int commonserach)
	{	  
     
		//Check page not found
		this.checkPageNotFound();
		//Enter search text
		this.enterSearchText(searchtext);
		
		int count = 0;
		 try {
				
				String locator = locatorReader.getLocator("CommonSearches.categories");
				this.WaitForElementPresent(locator, 15);
				Assert.assertTrue(this.isElementPresent(locator));
				String size = locatorReader.getLocator("CommonSearches.ProductSearches");
				int ButtonNamelist = driver.findElements(By.xpath("//li[@class='categories common-search-item ui-menu-item']")).size();
				System.out.print("Actual Result   "+ButtonNamelist);
				Assert.assertEquals(ButtonNamelist,commonserach);
			//	Assert.assertEquals(size,commonserach);
				
			}

			catch (Exception ex) {
				System.out.println("Exception >>Verify maximum of five categories are displayed on B2B search suggested.");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Error >>Verify maximum of five categories are displayed on B2B search suggested.");
				count = count + 1;
			}
			System.out.println("count value is :::" + count);
			Assert.assertTrue(count == 0);
		
	}
	
	//Verify search result section
	public void FilterSearchResult(String searchtext)
	{	  
     
		//Check page not found
		this.checkPageNotFound();
		//Enter search text
		this.enterSearchText(searchtext);
		//Hit Enter from keyboard
		this.presEnterKey(locatorReader.getLocator("SearchField"));
		
		//Verify product search 
		//Verify All
		 this.WaitForElementPresent(locatorReader.getLocator("productSection.AllProduct"), 5);
		 Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("productSection.AllProduct")), "product search not found");
		//Verify New Products
		 Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("productSection.NewProducts")), "New Products not found");
		//Verify Best Sellers
		 Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("productSection.BestSellers")), "Best Sellers not found");
		//Verify Hot Deals
		 Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("productSection.HotDeals")), " Hot Deals not found");
		//Verify Top Reviews
		 Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("productSection.TopReviews")), "top review not found");
	}
	
	//Verify search result section
	public void verifySortingonsearch(String searchtext)
	{	  
     
		//Check page not found
		this.checkPageNotFound();
		//Enter search text
		this.enterSearchText(searchtext);
		//Hit Enter from keyboard
		this.presEnterKey(locatorReader.getLocator("SearchField"));
		
		//Verify product search 
		//Verify All
		 this.WaitForElementPresent(locatorReader.getLocator("productSection.AllProduct"), 5);
		 Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("productSection.AllProduct")), "product search not found");
		//Verify New Products
		 Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("productSection.NewProducts")), "New Products not found");
		//Verify Best Sellers
		 Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("productSection.BestSellers")), "Best Sellers not found");
		//Verify Hot Deals
		 Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("productSection.HotDeals")), " Hot Deals not found");
		//Verify Top Reviews
		 Assert.assertTrue(this.isElementPresent(locatorReader.getLocator("productSection.TopReviews")), "top review not found");
	}
}
