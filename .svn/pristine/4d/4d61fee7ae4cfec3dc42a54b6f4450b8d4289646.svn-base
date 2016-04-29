package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Midas_OurStory_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Midas_OurStory extends DriverTestCase 
{
	@Test
	public void verifyMidas_OurStoryPage() throws Exception {
		try {
			// Initialize object
			MIDAS_OurStory_Helper = new Midas_OurStory_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String vSpace1Height = propertyReader.readApplicationFile("vSpace1Height_OurStoryPage");
			String textSpace6Height = propertyReader.readApplicationFile("textSpace6Height_OurStoryPage");
			String textSpace5Height = propertyReader.readApplicationFile("textSpace5Height_OurStoryPage");
			String vSpace4Height = propertyReader.readApplicationFile("vSpace4Height_OurStoryPage");
			String ParagraphSpace2Height = propertyReader.readApplicationFile("ParagraphSpace2Height_OurStoryPage");
			String FixedImageWidth = propertyReader.readApplicationFile("FixedImageWidth_OurStoryPage");
			String FixedImageWidthMainImage = propertyReader.readApplicationFile("FixedImageWidthMainImage_OurStoryPage");
			
			//verify Midas our story page
			MIDAS_OurStory_Helper.verifyMidasOurStoryPage(vSpace1Height,textSpace6Height,textSpace5Height,vSpace4Height,ParagraphSpace2Height,FixedImageWidth,FixedImageWidthMainImage);
			ExecutionLog.Log("Midas Training page verified successfully.");
		}
		catch (Error e) 
		{
			captureScreenshot("Midas_OurStoryPage");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 
		catch (Exception ex)
		{
			captureScreenshot("Midas_OurStoryPage");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}

}
