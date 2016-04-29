package test.java.com.MusicGroup.pagehelper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;
public class Solutions_HomePage_Helper extends DriverHelper {
	private LocatorReader locatorReader;	
	int count=0;
	public String ExpectedResult="true";
	//String ExpectedResult="true"; 
	public Solutions_HomePage_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("Solution_HomePage.xml");
		String sData=locatorReader.toString();
		System.out.println("Lpocator is"+sData);
	}
	public void VerifySolutionHomePage(){
		
		//Verify Logo on Home Page
		try{
			
			String locator=locatorReader.getLocator("VerifyHomePageMenu.VerifyLogoOnLogin");
			System.out.println("Locator is"+locator);
			this.WaitForElementVisible(locator,10);
			Boolean Result=this.isElementPresent(locator);
			System.out.println("Result is"+Result);
			String ActualResult=Result.toString();
			Assert.assertEquals(ExpectedResult, ActualResult);
		}
		catch(Exception e){
			System.out.println("Product logo not found");
			count = count +1;
		}
		//verify Solutions in Header Menu on Home Page
		try{
			String Locator=locatorReader.getLocator("VerifyHomePageMenu.VerifyHeaderMenu1");
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
		//verify Brands in Header Menu on Home Page
		try{
			String Locator=locatorReader.getLocator("VerifyHomePageMenu.VerifyHeaderMenu2");
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
		//verify Community in Header Menu on Home Page
				try{
					String Locator=locatorReader.getLocator("VerifyHomePageMenu.VerifyHeaderMenu3");
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
				//verify JoinUS in Header Menu on Home Page
				try{
					String Locator=locatorReader.getLocator("VerifyHomePageMenu.VerifyHeaderMenu4");
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
				//Click on Solutions on Home Page
				try{
					String Locator=locatorReader.getLocator("VerifyHomePageMenu.VerifyHeaderMenu1");
					this.WaitForElementVisible(Locator,10);
					Boolean Result=this.isElementPresent(Locator);
					System.out.println("Result is"+Result);
					String ActualResult=Result.toString();
					Assert.assertEquals(ExpectedResult, ActualResult);
					this.clickOn(Locator);
				}
				catch(Exception e){
					System.out.println("Product logo not found");
					count = count +1;
				}
			
				//Verify Enterprise and Entertainment in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyEnterPriseandEnterainment");
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
				
				//Verify Install in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyInstall");
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
				//Verify Corporate in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyCorporate");
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
				//Verify Large venue in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyLargerVenue");
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
				//Verify Government in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyGovernment");
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
				//Verify Education in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyEducation");
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
				//Verify Hospitality and Retail in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyHospitalityandRetail");
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
				//Verify Hotel and Casino in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyHotelandCasino");
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
				//Verify Transportation in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyTransportation");
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
				//Verify Cinema in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyCinema");
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
				//Verify Worship in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyWorship");
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
				//Verify Live in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyLive");
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
				//Verify Touring in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.verifyTouring");
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
				//Verify Portable in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyPortable");
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
				//Verify Creation in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyCreation");
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
				//Verify Musical Instrument in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyMusicalInstrument");
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
				//Verify Vocals in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyVocals");
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
				//Verify Guitar in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyGuitar");
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
				//Verify Bass in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyBass");
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
				//Verify Keyboard and Drums in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyKeyandDrums");
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
				//Verify Productions in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyProduction");
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
				//Verify Recording and Productions in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyRecord_Production");
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
				//Verify Electronic Dance Music in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyElectronicDanceMusic");
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
				//Verify Mobile in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyMobile");
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
				//Verify Audio for Video in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyAudioForVideo");
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
				//Verify LifeStyle and Home in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyLifeStyleandHome");
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
				//Verify Home Theatre in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyHomeTheatre");
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
				//Verify Hi-Fi in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyHi_Fi");
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
				//Verify Portable Audio in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyPortableAudio");
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
				//Verify Computer Audio in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyCompterAudio");
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
				//Verify Home Install in Solutions Menu on Home Page 
				try{
					String Locator=locatorReader.getLocator("VerifySolutionsMenu.VerifyHomeInstall");
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
				
				//Verify Image on Home Page
				try{
					String Locator=locatorReader.getLocator("VerifyImageOnHomePage.VerifyMainImage");
					this.WaitForElementVisible(Locator,10);
					Boolean Result=this.isElementPresent(Locator);
					System.out.println("Result is"+Result);
					String ActualResult=Result.toString();
					Assert.assertEquals(ExpectedResult, ActualResult);
					int Expected_Height=725;
					int Height=getHeight(Locator);
					System.out.println("Height is"+Height);
					int Expected_Width=33120;
					int Width=getWidth(Locator);
					System.out.println("Width is"+Width);
					Assert.assertEquals(Expected_Height, Height);
					Assert.assertEquals(Expected_Width, Width);
				}
				catch(Exception e){
					System.out.println("Product logo not found");
					count = count +1;
				}
				try{
					String Locator=locatorReader.getLocator("VerifyImageOnHomePage.VerifyEntertainmentImage");
					this.WaitForElementVisible(Locator,10);
					Boolean Result=this.isElementPresent(Locator);
					System.out.println("Result is"+Result);
					String ActualResult=Result.toString();
					Assert.assertEquals(ExpectedResult, ActualResult);
					int Expected_Height=197;
					int Height=getHeight(Locator);
					System.out.println("Height is"+Height);
					int Expected_Width=472;
					int Width=getWidth(Locator);
					System.out.println("Width is"+Width);
					Assert.assertEquals(Expected_Height, Height);
					Assert.assertEquals(Expected_Width, Width);
				}
				catch(Exception e){
					System.out.println("Product logo not found");
					count = count +1;
				}
				/*
				try{
					String Locator=locatorReader.getLocator("VerifyImageOnHomePage.VerifyCreationImage");
					this.WaitForElementVisible(Locator,10);
					Boolean Result=this.isElementPresent(Locator);
					System.out.println("Result is"+Result);
					String ActualResult=Result.toString();
					Assert.assertEquals(ExpectedResult, ActualResult);
					int Expected_Height=197;
					int Height=getHeight(Locator);
					System.out.println("Height is"+Height);
					int Expected_Width=472;
					int Width=getWidth(Locator);
					System.out.println("Width is"+Width);
					Assert.assertEquals(Expected_Height, Height);
					Assert.assertEquals(Expected_Width, Width);
				}
				catch(Exception e){
					System.out.println("Product logo not found");
					count = count +1;
				}
				try{
					String Locator=locatorReader.getLocator("VerifyImageOnHomePage.VerifyLifeStyle_HomeImage");
					this.WaitForElementVisible(Locator,10);
					Boolean Result=this.isElementPresent(Locator);
					System.out.println("Result is"+Result);
					String ActualResult=Result.toString();
					Assert.assertEquals(ExpectedResult, ActualResult);
					int Expected_Height=197;
					int Height=getHeight(Locator);
					System.out.println("Height is"+Height);
					int Expected_Width=472;
					int Width=getWidth(Locator);
					System.out.println("Width is"+Width);
					Assert.assertEquals(Expected_Height, Height);
					Assert.assertEquals(Expected_Width, Width);
				}
				catch(Exception e){
					System.out.println("Product logo not found");
					count = count +1;
				}
				
				
				try{
					System.out.println("test1");
					String Locator=locatorReader.getLocator("VerifyImageOnHomePage.VerifyEntertainmentImage");
					this.WaitForElementVisible(Locator,20);
					Boolean Result=this.isElementPresent(Locator);
					System.out.println("Test2");
					System.out.println("Result is"+Result);
					String ActualResult=Result.toString();
					Assert.assertEquals(ExpectedResult, ActualResult);
					System.out.println("Test3");
					this.clickOn(Locator);
					System.out.println("Welcome Enterprise and Entertainment Page");
				}
				catch(Exception e){
					System.out.println("Product logo not found");
					count = count +1;
				}
				*/
				//Click on Enterprise and Entertainment Solutions
				
				
				//Verify Enterprise and Entertainment Solution Page
				
				//Verify Enterprise and Entertainment Solutions
				
	}
}