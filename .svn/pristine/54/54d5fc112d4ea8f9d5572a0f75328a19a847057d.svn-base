package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Midas_OurStory1970_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import org.testng.Assert;

public class Midas_OurStory1970 extends DriverTestCase 
{
	@Test
	public void verifyMidas_OurStory1970Page() throws Exception {
		try {
			// Initialize object
			MIDAS_OurStory1970_Helper = new Midas_OurStory1970_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String vSpace1Height = propertyReader.readApplicationFile("vSpace1Height_OurStoryPage");
			String TextSpace8Height = propertyReader.readApplicationFile("TextSpace8Height_MidasOurStory1970");
			String TextSpace6Height = propertyReader.readApplicationFile("TextSpace6Height_MidasOurStory1970");
			String vSpace4Height = propertyReader.readApplicationFile("vSpace4Height_MidasOurStory1970");
			String Gutter16Width = propertyReader.readApplicationFile("Gutter16Width_MidasOurStory1970");
			String FullWidthBoxImage33 = propertyReader.readApplicationFile("FullWidthBoxImage33_MidasOurStory1970");
			String FullWidthBoxImage6 = propertyReader.readApplicationFile("FullWidthBoxImage6_MidasOurStory1970");
			String BodayCopyLeadingHeight = propertyReader.readApplicationFile("BodayCopyLeadingHeight_MidasOurStory1970");
			
			//verify Midas our story page
			MIDAS_OurStory1970_Helper.verifyMidasOurStory1970Page(vSpace1Height,TextSpace8Height,TextSpace6Height,vSpace4Height,Gutter16Width,FullWidthBoxImage33,FullWidthBoxImage6,BodayCopyLeadingHeight);
			ExecutionLog.Log("Midas Training page verified successfully.");
		}
		catch (Error e) 
		{
			captureScreenshot("Midas_OurStoryPage");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 		catch (Exception ex)
		{
			captureScreenshot("Midas_OurStoryPage");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}

}
