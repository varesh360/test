package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import test.java.com.MusicGroup.pagehelper.PerformanceInstalled_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

import org.testng.annotations.Test;

public class PerformanceInstalled extends DriverTestCase
{
	@Test
	public void InstallHomePage() throws Exception {
		try {
			PerformanceInstall_Helper = new PerformanceInstalled_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String HomeBillboardWidth = propertyReader.readApplicationFile("HomeBillboard_Width_EEPage");	
			String HomeBillboardHeight = propertyReader.readApplicationFile("HomeBillboard_height_EEPage");
			String LineDivider = propertyReader.readApplicationFile("LineDivider_EEPage");
			String SpotLightImageWidth = propertyReader.readApplicationFile("SpotLightImageWidth_CreationPage");
			String SpotLightImageHeight= propertyReader.readApplicationFile("SpotLightImageHeight_EEPage");
			String SpotLightImageWidth_1=propertyReader.readApplicationFile("SpotLightImaeWidth_Peformance");
			PerformanceInstall_Helper.verifyProductionHomepage(HomeBillboardWidth,HomeBillboardHeight,LineDivider,SpotLightImageWidth,SpotLightImageHeight, SpotLightImageWidth_1);
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
