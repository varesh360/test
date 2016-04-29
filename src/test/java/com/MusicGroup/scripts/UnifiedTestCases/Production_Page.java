package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Production_Page_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Production_Page extends DriverTestCase
{
	@Test
	public void InstallHomePage() throws Exception {
		try {
			production_Page_Helper = new Production_Page_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String HomeBillboardWidth = propertyReader.readApplicationFile("HomeBillboard_Width_EEPage");	
			String HomeBillboardHeight = propertyReader.readApplicationFile("HomeBillboard_height_EEPage");
			String LineDivider = propertyReader.readApplicationFile("LineDivider_EEPage");
			String SpotLightImageWidth = propertyReader.readApplicationFile("SpotLightImageWidth_Production");
			String SpotLightImageHeight= propertyReader.readApplicationFile("SpotLightImageHeight_EEPage");
			
			production_Page_Helper.verifyProductionHomepage(HomeBillboardWidth,HomeBillboardHeight,LineDivider,SpotLightImageWidth,SpotLightImageHeight);
		}
		catch (Error e) 
		{
			captureScreenshot("Install Page");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 
		catch (Exception ex)
		{
			captureScreenshot("Install Page");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}
}