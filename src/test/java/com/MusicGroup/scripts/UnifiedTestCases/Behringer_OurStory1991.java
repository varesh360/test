package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

import org.testng.annotations.Test;


import test.java.com.MusicGroup.pagehelper.Behringer_OurStory1991_Helper;
public class Behringer_OurStory1991 extends DriverTestCase 
{
	@Test
	public void verifyMidas_OurStory1971Page() throws Exception {
		try {
			// Initialize object
			Behringer_OURStory1991_Helper = new Behringer_OurStory1991_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String vSpace1Height = propertyReader.readApplicationFile("vSpace1Height_OurStoryPage");
			String TextSpace8Height = propertyReader.readApplicationFile("TextSpace8Height_MidasOurStory1970");
			String TextSpace6Height = propertyReader.readApplicationFile("TextSpace6Height_MidasOurStory1970");
			String vSpace4Height = propertyReader.readApplicationFile("vSpace4Height_MidasOurStory1970");
			String Gutter16Width = propertyReader.readApplicationFile("Gutter16Width_MidasOurStory1970");
			String FullWidthBoxImage33 = propertyReader.readApplicationFile("FullWidthBoxImage33_MidasOurStory1970");
			String FullWidthBoxImage6 = propertyReader.readApplicationFile("FullWidthBoxImage6_MidasOurStory1970");
			String BodayCopyLeadingHeight = propertyReader.readApplicationFile("BodayCopyLeadingHeight_MidasOurStory1970");
			String FullWidthBoxImage = propertyReader.readApplicationFile("FullWidthBoxImage_MidasOurStory1971");
			String vSpace2Height = propertyReader.readApplicationFile("vSpace2Height_MidasOurStory1971");
			String TextSpace1Height = propertyReader.readApplicationFile("TextSpace1Height_MidasOurStory1971");
			String ImageWidth2 = propertyReader.readApplicationFile("ImageWidth2_MidasOurStory1971");
			String Gutter2Width = propertyReader.readApplicationFile("Gutter2width_MidasOurStory1980");
			String CallOutBodyCopyWidth = propertyReader.readApplicationFile("CallOutBodyCopyWidth_MidasOurStory1980");
			
			//verify Midas our story page
			Behringer_OURStory1991_Helper.verifyMidasOurStory1971Page(vSpace1Height,TextSpace8Height,TextSpace6Height,vSpace4Height,Gutter16Width,FullWidthBoxImage33,FullWidthBoxImage6,BodayCopyLeadingHeight,FullWidthBoxImage,vSpace2Height,TextSpace1Height,ImageWidth2, Gutter2Width,CallOutBodyCopyWidth);
			ExecutionLog.Log("Midas Training page verified successfully.");
		}
		catch (Error e) 
		{
			captureScreenshot("Midas_OurStoryPage1971");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 		catch (Exception ex)
		{
			captureScreenshot("Midas_OurStoryPage1971");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}



}
