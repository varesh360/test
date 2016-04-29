package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.Unified_SearchSuggestionPopup_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;

public class Unified_SearchSuggestionPopup extends DriverTestCase
{
	@Test
	public void UnifiedSearchSuggestionB2B() throws Exception
	{
		try{
			//Initialize object
			b2B_Login_Helper = new B2B_Login_Helper(driver);
			unified_SearchSuggestionPopup_Helper = new Unified_SearchSuggestionPopup_Helper(driver);
			propertyReader = new PropertyReader();
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());		
			
			//Declare variables
			//String B2BStore_URL = propertyReader.readApplicationFile("B2BStore_URL");
			//String B2BUser = propertyReader.readApplicationFile("B2BUserAllProd");
			//String password = propertyReader.readApplicationFile("B2BPassword");
			
			//Navigate to B2B Store url
			//driver.navigate().to(B2BStore_URL);
			ExecutionLog.Log("Navigated to B2B store successfully.");
			
            //Verify Login page after successful login
			
			//b2B_Login_Helper.b2BuserLogin(B2BUser, password);
			//ExecutionLog.Log("Login into application successfully.");
			
			//Thread.sleep(10000);
				
				
			//Verify ProductReview page after successful login
			String TextSpace4Height= propertyReader.readApplicationFile("TextSpace4Height_UnifiedSearchSuggestion");
			String vSpace18Height= propertyReader.readApplicationFile("vSpace18Height_UnifiedSearchSuggestion");
			String TextSpace10Height= propertyReader.readApplicationFile("TextSpace10Height_UnifiedSearchSuggestion");
			String Gutter17Width= propertyReader.readApplicationFile("Gutter17Width_UnifiedSearchSuggestion");
			String vSpace17Height= propertyReader.readApplicationFile("vSpace17Height_UnifiedSearchSuggestion");
			String SelectFieldWidth55Width= propertyReader.readApplicationFile("SelectFieldWidth55Width_UnifiedSearchSuggestion");
			String SelectfieldWidth55Height= propertyReader.readApplicationFile("SelectfieldWidth55Height_UnifiedSearchSuggestion");
			String TextSpace15Height= propertyReader.readApplicationFile("TextSpace15Height_UnifiedSearchSuggestion");
			
			unified_SearchSuggestionPopup_Helper.verifySearchSuggestion(TextSpace4Height, vSpace18Height, TextSpace10Height, Gutter17Width, vSpace17Height,SelectFieldWidth55Width, SelectfieldWidth55Height, TextSpace15Height);
			
			ExecutionLog.Log("Unified Search Page Successylly.");
		}  
		catch(Error e) 
		{
			captureScreenshot("Unified_SearchSuggestion");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("Unified_SearchSuggestion");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
	}
}