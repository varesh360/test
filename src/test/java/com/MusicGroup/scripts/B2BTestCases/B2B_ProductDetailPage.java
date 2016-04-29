package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_ProductDetailPage_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;
import test.java.com.MusicGroup.util.DriverTestCase.LoginWindow;

public class B2B_ProductDetailPage extends DriverTestCase
{
	@Test
	public void ProductReviewCartB2B() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_ProductDetailPage_Helper = new B2B_ProductDetailPage_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			
			//B2B_ChangePassword s = new B2B_ChangePassword();
			//new Thread(s.new LoginWindow()).start();
			//Navigate to B2B Store url
			driver.navigate().to(B2BStore_URL);
			ExecutionLog.Log("Navigated to B2B store successfully.");
			
				
			//Verify Login page after successful login
					
			b2B_Login_Helper.b2BuserLogin(B2BUser, password);
			ExecutionLog.Log("Login into application successfully.");
			
			Thread.sleep(10000);
			
			//Verify ProductReview page after successful login
			String vSpace1Heighth= propertyReader.readApplicationFile("vSpace1Heighth_B2BProductDetailPage");		
			String gap44width= propertyReader.readApplicationFile("gap44width_B2BProductDetailPage");
			String vSpace2heighth= propertyReader.readApplicationFile("vSpace2heighth_B2BProductDetailPage");
			String gutter87widthh= propertyReader.readApplicationFile("gutter87widthh_B2BProductDetailPage");
			String fixedboxImagewidthhA= propertyReader.readApplicationFile("fixedboxImagewidthhA_B2BProductDetailPage");
			String fixedboxImageheighthA= propertyReader.readApplicationFile("fixedboxImageheighthA_B2BProductDetailPage");
			String gutter27widthh= propertyReader.readApplicationFile("Gutter27Width");
			String Gutter45Width= propertyReader.readApplicationFile("Gutter45Width_B2BProductDetailPage");
			String vspace13heighth= propertyReader.readApplicationFile("vspace13heighth_B2BProductDetailPage");
			String vspace9heighth= propertyReader.readApplicationFile("vspace9heighth_B2BProductDetailPage");
			String textspace5height= propertyReader.readApplicationFile("textspace5height_B2BProductDetailPage");
			String textspace1height= propertyReader.readApplicationFile("textSpace1Height_B2BProductDetailPage");
			String vSpace2Height= propertyReader.readApplicationFile("vSpace2Height_B2BProductDetailPage");
			String gap17width= propertyReader.readApplicationFile("gap17width_B2BProductDetailPage");
			String gutter27Width= propertyReader.readApplicationFile("gutter27Width_B2BProductDetailPage");
			String vSpace23Height= propertyReader.readApplicationFile("vSpace23Height_B2BProductDetailPage");
			String FixedBoxImageFWidth= propertyReader.readApplicationFile("FixedBoxImageFWidth_B2BProductDetailPage");
			String FixedBoxImageFHeight= propertyReader.readApplicationFile("FixedBoxImageFHeight_B2BProductDetailPage");
			String gap17Width= propertyReader.readApplicationFile("gap17Width_B2BProductDetailPage");


			
			
			
			b2b_ProductDetailPage_Helper.verifyproductdetailpage(vSpace1Heighth, gap44width,vSpace2heighth,gutter87widthh, fixedboxImagewidthhA, fixedboxImageheighthA,gutter27widthh,Gutter45Width,vspace13heighth, vspace9heighth,textspace5height,textspace1height,vSpace2Height,gap17width,gutter27Width,vSpace23Height,FixedBoxImageFWidth,FixedBoxImageFHeight,gap17Width);
			
			ExecutionLog.Log("Login into application successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("B2B_ProductDetailPage");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("B2B_ProductDetailPage");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}