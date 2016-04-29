/*==============================================================================================================================
 File Name    : B2B_ShoppingCart.java
 ClassName    : B2B_ShoppingCart
 Summary      : Contains automation scripts to login into  B2B_ShoppingCart store.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/
package test.java.com.MusicGroup.scripts.B2BTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_ShoppingCart_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;
import test.java.com.MusicGroup.util.DriverTestCase.LoginWindow;

public class B2B_ShoppingCart  extends DriverTestCase
{
	@Test
	public void ShoppingCartB2B() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			b2b_ShoppingCart_Helper = new B2B_ShoppingCart_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			String password = propertyReader.readApplicationFile("B2BPassword");
			
			//Navigate to B2B Store url
			

			B2B_ChangePassword s = new B2B_ChangePassword();
			new Thread(s.new LoginWindow()).start();
			driver.navigate().to(B2BStore_URL);
			ExecutionLog.Log("Navigated to B2B store successfully.");
			
				
			//Verify Login page after successful login
					
			b2B_Login_Helper.b2BuserLogin(B2BUser, password);
			ExecutionLog.Log("Login into application successfully.");
			
			Thread.sleep(10000);
			
			//Verify ShoppingCart page after successful login
					
			String VSpace1Height= propertyReader.readApplicationFile("vSpace1height_B2BShoppingCart");
			String VSpace4Height= propertyReader.readApplicationFile("vSpace4Height_B2BShoppingCart");
			String vSpace12Height= propertyReader.readApplicationFile("vSpace12Height_B2BShoppingCart");
			String TextSpace4Height= propertyReader.readApplicationFile("TextSpace4Height_B2BShoppingCart");
			String Gap36Width= propertyReader.readApplicationFile("Gap36Width_B2BShoppingCart");
			String CellDemension40Width= propertyReader.readApplicationFile("CellDemension40Width_B2BShoppingCart");
			String CellDemension40Height= propertyReader.readApplicationFile("CellDemension40Height_B2BShoppingCart");
			String Gutter28Width= propertyReader.readApplicationFile("Gutter28Width");
			String CellDemension37Width= propertyReader.readApplicationFile("CellDemension37Width_B2BShoppingCart");
			String CellDemension37Height= propertyReader.readApplicationFile("CellDemension37Height_B2BShoppingCart");
			String ImageArea38Width= propertyReader.readApplicationFile("ImageArea38Width_B2BShoppingCart");
			String ImageArea38Heigt= propertyReader.readApplicationFile("ImageArea38Height_B2BShoppingCart");
			String gap9Width= propertyReader.readApplicationFile("gap9Width_B2BShoppingCart");
			String gap17Width= propertyReader.readApplicationFile("gap17Width_B2BShoppingCart");
			String textSpace1Height= propertyReader.readApplicationFile("textSpace1Height_B2BShoppingCart");
			String Gutter17Width= propertyReader.readApplicationFile("Gutter17Width_B2BShoppingCart");
			String vSpace14Height= propertyReader.readApplicationFile("vSpace14Height_B2BShoppingCart");
			String CellDemension42Height= propertyReader.readApplicationFile("CellDemension42Height_B2BShoppingCart");
			String CellDemension42Width= propertyReader.readApplicationFile("CellDemension42Width_B2BShoppingCart");
		    String textSpace3Height= propertyReader.readApplicationFile("textSpace3Height_B2BShoppingCart");

			b2b_ShoppingCart_Helper.verifyAskAQuestionPage(VSpace1Height, VSpace4Height, vSpace12Height,TextSpace4Height,Gap36Width,CellDemension40Width,CellDemension40Height, Gutter28Width, CellDemension37Width, CellDemension37Height,ImageArea38Width, ImageArea38Heigt, gap9Width,gap17Width,textSpace1Height, Gutter17Width, vSpace14Height, CellDemension42Height,CellDemension42Width,textSpace3Height);
			
			ExecutionLog.Log("Login into application successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("B2B_ShoppingCart");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("B2B_ShoppingCart");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}