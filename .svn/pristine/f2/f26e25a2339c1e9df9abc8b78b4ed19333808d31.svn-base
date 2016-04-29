package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.NoResultPage_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class NoResultPage extends DriverTestCase
{
	@Test
	public void verify_NoResult_Page() throws Exception
	{
		try{
			//Initialize object
			noresultpage_Helper = new NoResultPage_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());
			
			//Declare variables
			String TextSpace5Height = propertyReader.readApplicationFile("TextSpace5Height_NoResultPage");
			String Gutter50Width = propertyReader.readApplicationFile("Gutter50Width_NoresultPage");
			String TextSpace1Height = propertyReader.readApplicationFile("TextSpace1Height_NoResultPage");
			String vSpace2Height = propertyReader.readApplicationFile("vSpace2Height_NoResultPage");
			

			//Verify Discovery page.
			noresultpage_Helper.verifynoresultpage(TextSpace5Height, Gutter50Width, TextSpace1Height,vSpace2Height);
			ExecutionLog.Log("No Result page verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("No Result Page");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("No Result Page");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}

