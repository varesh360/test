package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_PlaceOrder_SingleProduct_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;
import test.java.com.MusicGroup.util.DriverTestCase.LoginWindow;

public class B2B_PlaceOrder_SingleProduct extends DriverTestCase
{
	@Test
	public void ProductReviewCartB2B() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_PlaceOrder_SingleProduct_Helper = new B2B_PlaceOrder_SingleProduct_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			
			//Navigate to B2B Store url
			
		//	B2B_ChangePassword s = new B2B_ChangePassword();
		//	new Thread(s.new LoginWindow()).start();
			driver.navigate().to(B2BStore_URL);
			ExecutionLog.Log("Navigated to B2B store successfully.");
			
				
			//Verify Login page after successful login
					
			b2B_Login_Helper.b2BuserLogin(B2BUser, password);
			ExecutionLog.Log("Login into application successfully.");
			
			Thread.sleep(10000);
					
			
			String quantity = propertyReader.readApplicationFile("quantity");
			String RefNumber = propertyReader.readApplicationFile("refnumber");
			String vSpace15Height = propertyReader.readApplicationFile("vSpace15Height_B2BInsufficientPage");
			String Gutter68Width = propertyReader.readApplicationFile("Gutter68Width_B2BInsufficientPage");
			String vSpace5Height = propertyReader.readApplicationFile("vSpace5Height_B2BInsufficientPage");
			String textSpace5Height = propertyReader.readApplicationFile("textSpace5Height_B2BInsufficientPage");
			String gutter45width = propertyReader.readApplicationFile("gutter45width_B2BInsufficientPage");
		
			// Back Order Page
			
			String VSpace15HeightBO = propertyReader.readApplicationFile("VSpace15Height_B2BBackOrderPage");
			String Gutter68widthBO = propertyReader.readApplicationFile("Gutter68width_B2BBackOrderPage");
			String vSpace5HeightBO = propertyReader.readApplicationFile("vSpace5Height_B2BBackOrderPage");
			String TextSpace14HeightBO = propertyReader.readApplicationFile("TextSpace14Height_B2BBackOrderPage");
			String TextSpace2HeightBO = propertyReader.readApplicationFile("TextSpace2Height_B2BBackOrderPage");
			String Gutter45WidthBO = propertyReader.readApplicationFile("Gutter45Width_B2BBackOrderPage");
			
		//Upload Cart
			String VSpace15HeightUpCart = propertyReader.readApplicationFile("VSpace15Height_B2BUploadCart");
			String vSpace5HeightUpCart = propertyReader.readApplicationFile("vSpace5Height_B2BUploadCart");
			String Gutter68width = propertyReader.readApplicationFile("Gutter68width_B2BUploadCart");
			String TextSpace14Height = propertyReader.readApplicationFile("TextSpace14Height_B2BUploadCart");
			String vSpace9Height = propertyReader.readApplicationFile("vSpace9Height_B2BUploadCart");
			String Gutter34Width = propertyReader.readApplicationFile("Gutter34Width_B2BUploadCart");
			
		//	b2b_PlaceOrder_SingleProduct_Helper.verifyPlaceOrderPage(quantity,RefNumber);
		  //b2b_PlaceOrder_SingleProduct_Helper.verifyinsufficientorderpage(quantity,RefNumber,vSpace15Height,Gutter68Width,vSpace5Height,textSpace5Height,gutter45width);
		//  b2b_PlaceOrder_SingleProduct_Helper.verifybackorderpage(quantity,RefNumber, VSpace15HeightBO,vSpace5HeightBO,Gutter68widthBO,TextSpace14HeightBO,Gutter45WidthBO,TextSpace2HeightBO);
         
			b2b_PlaceOrder_SingleProduct_Helper.verifyuploadcart(quantity,RefNumber,VSpace15HeightUpCart,vSpace5HeightUpCart,Gutter68width,TextSpace14Height,vSpace9Height,Gutter34Width);
			
			ExecutionLog.Log("Login into application successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("B2B_PlaceOrderPage");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("B2B_PlaceOrderPage");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}
