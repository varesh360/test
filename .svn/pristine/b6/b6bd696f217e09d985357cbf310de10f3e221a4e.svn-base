package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Live_Page_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Live_Page extends DriverTestCase
{
	@Test
	public void LifeStyleHomePage() throws Exception {
		try {
			live_Page_helper = new Live_Page_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String HomeBillboardWidth = propertyReader.readApplicationFile("HomeBillboardImageWidth_LivePage");	
			String HomeBillboardHeight = propertyReader.readApplicationFile("HomeBillboardImageHeight_LivePage");
			String LineDivider = propertyReader.readApplicationFile("LineDivider_LivePage");
			String SpotLightImageWidth = propertyReader.readApplicationFile("SpotLightImageWidth_LivePage");
			String SpotLightImageHeight= propertyReader.readApplicationFile("SpotLightImageHeight_LivePage");
			
			live_Page_helper.verifyLivePage(HomeBillboardWidth,HomeBillboardHeight,LineDivider,SpotLightImageWidth,SpotLightImageHeight);
		}
		catch (Error e) 
		{
			captureScreenshot("Live Page");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 
		catch (Exception ex)
		{
			captureScreenshot("Live Page");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}
}