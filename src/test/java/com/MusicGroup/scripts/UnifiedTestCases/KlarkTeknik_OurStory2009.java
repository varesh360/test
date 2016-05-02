package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.KlarkTeknik_OurStory2009_Helper;

public class KlarkTeknik_OurStory2009 extends DriverTestCase 
{
	@Test
	public void verifyMidas_OurStory2009Page() throws Exception {
		try {
			// Initialize object
			KlarkTeknik_OURStory2009_Helper = new KlarkTeknik_OurStory2009_Helper(driver);
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
			String CallOutBodyCopyWidth = propertyReader.readApplicationFile("CallOutBodyCopyWidth_MidasOurStory1980");
			String Gutter2Width = propertyReader.readApplicationFile("Gutter2width_MidasOurStory1980");
			
			//verify Midas our story page
			KlarkTeknik_OURStory2009_Helper.verifyMidasOurStory2009Page(vSpace1Height,TextSpace8Height,TextSpace6Height,vSpace4Height,Gutter16Width,FullWidthBoxImage33,FullWidthBoxImage6,BodayCopyLeadingHeight,FullWidthBoxImage,vSpace2Height,TextSpace1Height,ImageWidth2,CallOutBodyCopyWidth,Gutter2Width);
			ExecutionLog.Log("Midas Training page verified successfully.");
		}
		catch (Error e) 
		{
			captureScreenshot("Midas_OurStoryPage2008");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 		catch (Exception ex)
		{
			captureScreenshot("Midas_OurStoryPage2008");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}

}
