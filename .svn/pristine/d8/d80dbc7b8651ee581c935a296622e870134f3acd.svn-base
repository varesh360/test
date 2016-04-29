package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;



public class SHMCP_2054_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public SHMCP_2054_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("SHMCP_2054.xml");
	
	}
	
	//Click on Toggle Menu
		public void ClickToggleMenu()
		
		{
			String locator = locatorReader.getLocator("SHMCP_locator.ClickToggleIcon");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
			
			
		}
		
		//Click Bugera Brand
		public void clickBrand()
		
		{
			String locator = locatorReader.getLocator("SHMCP_locator.ClickBugeralink");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
			
			
		}
		//Enter 'G20-INFINIUM' in serach field
		public void EnterProductSearchField()
		
		{
			String locator = locatorReader.getLocator("SHMCP_locator.EnterSerachingProduct");
			this.WaitForElementEnabled(locator, 50);
			String val = "G20-INFINIUM";
			clickOn(locator);
			sendKeys(locator, val);
			presEnterKey(locator);
			
			
		}		
		
		
		// Click Product on Search result Page
		public void ClickProductonSearchResultPage()
		{
			String locator = locatorReader.getLocator("SHMCP_locator.ClickProductonSerachPage");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
				
			
		}
		// Click feature link
		public void ClickFeatureLink()
		{
			String locator = locatorReader.getLocator("SHMCP_locator.ClickFeaturelink");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
				
			
		} 

		//Check page found our not
		public void checkPageNotFound()
		{
			String actualTitle1 = driver.getTitle();
			System.out.println("Get Titile"+ actualTitle1);
			String expectedTitle1 = "Not Found | MUSIC Group";
			Assert.assertFalse(actualTitle1==expectedTitle1);
		
		}
		
		//Click first thumbnail image
		public void clickfirstimage()
		{
			String locator = locatorReader.getLocator("SHMCP_locator.ThumbnailImage1");
			this.WaitForElementEnabled(locator, 50);
			clickOn(locator);
		
		}
		
		//Reach upto product Feature page
		public void ReachUptoProductFeaturePage()
		{
			//Click toggle menu
			this.ClickToggleMenu();
			//Click Bugera Brand
			this.clickBrand();
			//Enter 'G20-INFINIUM' in serach field
			this.EnterProductSearchField();
			// Click Product on Search result Page
			this.ClickProductonSearchResultPage();
			// Click Product on Search result Page
			this.ClickProductonSearchResultPage();
			//Click Feature link 
			this.ClickFeatureLink();
			//Change 404
		   this.checkPageNotFound();
			
		}
	public void verifySHMCP2054FeaturePage(String productName)
	{
		System.out.println("-----Page Not Found------------");
		ReachUptoProductFeaturePage();
		int count = 0;
		//Verify Thumbnail Image is clickable or not(First Image).
		try {
		
			String isDisabled = locatorReader.getLocator("SHMCP_locator.ThumbnailImage1");
			if (isDisabled==null || !isDisabled.equals("disabled")){
			   System.out.println("Thumbnail Image is clickable");
			}else{
			   System.out.println("Thumb image is not clickable");
			}
			
		}

		catch (Exception ex) {
			System.out.println("SHMCPC_2054 First Image Clickabale Exception>>Image Not clickable");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("SHMCPC_2054 First Image Clickabale Error>>Image Not clickable");
			count = count + 1;
		}
		
		//Verify Thumbnail Image is clickable or not(Second Image).
		try {
		
			String isDisabled = locatorReader.getLocator("SHMCP_locator.ThumbnailImage2");
			if (isDisabled==null || !isDisabled.equals("disabled")){
			   System.out.println("Thumbnail Image is clickable");
			}else{
			   System.out.println("Thumb image is not clickable");
			}
			
		}

		catch (Exception ex) {
			System.out.println("SHMCPC_2054 Second Image Clickabale Exception>>Image Not clickable");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("SHMCPC_2054 Second Image Clickabale Error>>Image Not clickable");
			count = count + 1;
		}
		//Verify Thumbnail Image is clickable or not(third Image).
		try {
		
			String isDisabled = locatorReader.getLocator("SHMCP_locator.ThumbnailImage3");
			if (isDisabled==null || !isDisabled.equals("disabled")){
			   System.out.println("Thumbnail Image is clickable");
			}else{
			   System.out.println("Thumb image is not clickable");
			}
			
		}

		catch (Exception ex) {
			System.out.println("SHMCPC_2054 Third Image Clickabale Exception>>Image Not clickable");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("SHMCPC_2054 Third Image Clickabale Error>>Image Not clickable");
			count = count + 1;
		}
		//Verify Thumbnail Image is clickable or not(fourth Image).
		try {
		
			String isDisabled = locatorReader.getLocator("SHMCP_locator.ThumbnailImage4");
			if (isDisabled==null || !isDisabled.equals("disabled")){
			   System.out.println("Thumbnail Image is clickable");
			}else{
			   System.out.println("Thumb image is not clickable");
			}
			
		}

		catch (Exception ex) {
			System.out.println("SHMCPC_2054 Forth Image Clickabale Exception>>Image Not clickable");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("SHMCPC_2054 Forth Image Clickabale Error>>Image Not clickable");
			count = count + 1;
		}
		//Count Thumbnailk Image(It must be four).
		try {
			
			int counts = driver.findElements(By.xpath("//div[@class='productImageGallery thumbnail-product']//ul[@class='thumbnail-product']//li")).size();
			System.out.println("Size is:"+counts);
			if(counts==4)
			{
			
				System.out.println("Actual Result> 4 thumb nail images are displaying ");
				
			}
			else
			{
				System.out.println("Actual Result> 4 thumb nail images are not displaying ");
				
			}
			
		}

		catch (Exception ex) {
			System.out.println("SHMCPC_2054 First Image Clickabale Exception>>Image Not clickable");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("SHMCPC_2054 First Image Clickabale Error>>Image Not clickable");
			count = count + 1;
		}
		//Verify Thumbnail Image is clickable or not and Previous icon is active or not. (First image)
				
		try {
			
			String isDisabled = locatorReader.getLocator("SHMCP_locator.ThumbnailImage1");
			if (isDisabled==null || !isDisabled.equals("disabled"))
			{
			   System.out.println("Thumbnail Image is clickable");
			   String locator = locatorReader.getLocator("SHMCP_locator.ThumbnailImage1");
			   this.WaitForElementEnabled(locator, 50);
				clickOn(locator);
				String isDisabledPreviousLeft=	locatorReader.getLocator("SHMCP_locator.PreviousLeft");
				if (isDisabledPreviousLeft==null || !isDisabledPreviousLeft.equals("disabled"))
				{
					System.out.println("Actual result>>  Previous left icon is active");
					clickOn(isDisabledPreviousLeft);
									}
				else
				{
					System.out.println("Actual result>>  Previous left icon is not active or displaying");
				}
				String isDisableCloseIcon=locatorReader.getLocator("SHMCP_locator.CloseIcon");
				if (isDisableCloseIcon==null || !isDisableCloseIcon.equals("disabled"))
				{
					System.out.println("Actual result>>  Close Icon is active");
					clickOn(isDisableCloseIcon);	
					System.out.println("Actual result>>  closed the popup window");
				}
				}
			else
			{
			   System.out.println("Actual result>>  Thumb image is not clickable");
			}
			
		}

		catch (Exception ex) {
			System.out.println("SHMCPC_2054 First Image Clickabale Exception>>Image Not clickable");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("SHMCPC_2054 First Image Clickabale Error>>Image Not clickable");
			count = count + 1;
		}
		
		

		//Verify Thumbnail Image is clickable or not and Previous icon is active or not. (Second image)
		try {
			
			String isDisabled = locatorReader.getLocator("SHMCP_locator.ThumbnailImage2");
			if (isDisabled==null || !isDisabled.equals("disabled"))
			{
			   System.out.println("Thumbnail Image is clickable");
			   String locator = locatorReader.getLocator("SHMCP_locator.ThumbnailImage2");
			   this.WaitForElementEnabled(locator, 50);
				clickOn(locator);
				String isDisabledPreviousLeft=	locatorReader.getLocator("SHMCP_locator.PreviousLeft");
				if (isDisabledPreviousLeft==null || !isDisabledPreviousLeft.equals("disabled"))
				{
					System.out.println("Actual result>>  Previous left icon is active");
					clickOn(isDisabledPreviousLeft);
									}
				else
				{
					System.out.println("Actual result>>  Previous left icon is not active or displaying");
				}
				String isDisableCloseIcon=locatorReader.getLocator("SHMCP_locator.CloseIcon");
				if (isDisableCloseIcon==null || !isDisableCloseIcon.equals("disabled"))
				{
					System.out.println("Actual result>>  Close Icon is active");
					clickOn(isDisableCloseIcon);	
					System.out.println("Actual result>>  closed the popup window");
				}
				}
			else
			{
			   System.out.println("Actual result>>  Thumb image is not clickable");
			}
			
		}

		catch (Exception ex) {
			System.out.println("SHMCPC_2054 Second Image Clickabale Exception>>Image Not clickable");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("SHMCPC_2054 Second Image Clickabale Error>>Image Not clickable");
			count = count + 1;
		}

		//Verify Thumbnail Image is clickable or not and Previous icon is active or not. (Third image)
		try {
			
			String isDisabled = locatorReader.getLocator("SHMCP_locator.ThumbnailImage3");
			if (isDisabled==null || !isDisabled.equals("disabled"))
			{
			   System.out.println("Thumbnail Image is clickable");
			   String locator = locatorReader.getLocator("SHMCP_locator.ThumbnailImage3");
			   this.WaitForElementEnabled(locator, 50);
				clickOn(locator);
				String isDisabledPreviousLeft=	locatorReader.getLocator("SHMCP_locator.PreviousLeft");
				if (isDisabledPreviousLeft==null || !isDisabledPreviousLeft.equals("disabled"))
				{
					System.out.println("Actual result>>  Previous left icon is active");
					clickOn(isDisabledPreviousLeft);
									}
				else
				{
					System.out.println("Actual result>>  Previous left icon is not active or displaying");
				}
				String isDisableCloseIcon=locatorReader.getLocator("SHMCP_locator.CloseIcon");
				if (isDisableCloseIcon==null || !isDisableCloseIcon.equals("disabled"))
				{
					System.out.println("Actual result>>  Close Icon is active");
					clickOn(isDisableCloseIcon);	
					System.out.println("Actual result>>  closed the popup window");
				}
				}
			else
			{
			   System.out.println("Actual result>>  Thumb image is not clickable");
			}
			
		}

		catch (Exception ex) {
			System.out.println("SHMCPC_2054 Third image Clickabale Exception>>Image Not clickable");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("SHMCPC_2054 Third image Clickabale Error>>Image Not clickable");
			count = count + 1;
		}
		//Verify Thumbnail Image is clickable or not and Previous icon is active or not. (Second image)
		try {
			
			String isDisabled = locatorReader.getLocator("SHMCP_locator.ThumbnailImage4");
			if (isDisabled==null || !isDisabled.equals("disabled"))
			{
			   System.out.println("Thumbnail Image is clickable");
			   String locator = locatorReader.getLocator("SHMCP_locator.ThumbnailImage4");
			   this.WaitForElementEnabled(locator, 50);
				clickOn(locator);
				String isDisabledPreviousLeft=	locatorReader.getLocator("SHMCP_locator.PreviousLeft");
				if (isDisabledPreviousLeft==null || !isDisabledPreviousLeft.equals("disabled"))
				{
					System.out.println("Actual result>>  Previous left icon is active");
					clickOn(isDisabledPreviousLeft);
									}
				else
				{
					System.out.println("Actual result>>  Previous left icon is not active or displaying");
				}
				String isDisableCloseIcon=locatorReader.getLocator("SHMCP_locator.CloseIcon");
				if (isDisableCloseIcon==null || !isDisableCloseIcon.equals("disabled"))
				{
					System.out.println("Actual result>>  Close Icon is active");
					clickOn(isDisableCloseIcon);	
					System.out.println("Actual result>>  closed the popup window");
				}
				}
			else
			{
			   System.out.println("Actual result>>  Thumb image is not clickable");
			}
			
		}

		catch (Exception ex) {
			System.out.println("SHMCPC_2054 Four Image Clickabale Exception>>Image Not clickable");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("SHMCPC_2054 Four Image Clickabale Error>>Image Not clickable");
			count = count + 1;
		}
										
		//Verify 'View the Gallery' on search result page
																
		try {
			
			String isDisabled = locatorReader.getLocator("SHMCP_locator.viewthegallery");
			if (isDisabled==null || !isDisabled.equals("disabled"))
			{
			   System.out.println("Verify 'View Gallery' is clickable");
			   String locator = locatorReader.getLocator("SHMCP_locator.viewthegallery");
			   this.WaitForElementEnabled(locator, 50);
				clickOn(locator);
				String isDisabledPreviousLeft=	locatorReader.getLocator("SHMCP_locator.PreviousLeft");
				if (isDisabledPreviousLeft==null || !isDisabledPreviousLeft.equals("disabled"))
				{
					System.out.println("Actual result>>  Previous left icon is active");
					clickOn(isDisabledPreviousLeft);
									}
				else
				{
					System.out.println("Actual result>>  Previous left icon is not active or displaying");
				}
				String isDisableCloseIcon=locatorReader.getLocator("SHMCP_locator.CloseIcon");
				if (isDisableCloseIcon==null || !isDisableCloseIcon.equals("disabled"))
				{
					System.out.println("Actual result>>  Close Icon is active");
					clickOn(isDisableCloseIcon);	
					System.out.println("Actual result>>  closed the popup window");
				}
				}
			else
			{
			   System.out.println("Actual result>>  Thumb image is not clickable");
			}
			
		}

		catch (Exception ex) {
			System.out.println("SHMCPC_2054 'View more link' Clickabale Exception>>Image Not clickable");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("SHMCPC_2054 'View more link' Clickabale Error>>Image Not clickable");
			count = count + 1;
		}
		
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
			
			}

	
			
			
			
				
		}
