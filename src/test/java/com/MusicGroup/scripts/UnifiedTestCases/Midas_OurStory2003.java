package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Midas_OurStory2003_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Midas_OurStory2003 extends DriverTestCase 
{
	@Test
	public void verifyMidas_OurStory2003Page() throws Exception {
		try {
			// Initialize object
			MIDAS_OurStory2003_Helper = new Midas_OurStory2003_Helper(driver);
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
			//String TextSpace1Height = propertyReader.readApplicationFile("TextSpace1Height_MidasOurStory1971");
			
			//verify Midas our story page
			MIDAS_OurStory2003_Helper.verifyMidasOurStory2003Page(vSpace1Height,TextSpace8Height,TextSpace6Height,vSpace4Height,Gutter16Width,FullWidthBoxImage33,FullWidthBoxImage6,BodayCopyLeadingHeight,FullWidthBoxImage,vSpace2Height,TextSpace1Height,ImageWidth2);
			ExecutionLog.Log("Midas Training page verified successfully.");
		}
		catch (Error e) 
		{
			captureScreenshot("Midas_OurStoryPage2003");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 		catch (Exception ex)
		{
			captureScreenshot("Midas_OurStoryPage2003");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}

}