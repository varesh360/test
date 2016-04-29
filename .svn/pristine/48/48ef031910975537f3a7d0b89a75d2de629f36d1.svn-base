package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Creation_HomePage_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Creation_HomePage  extends DriverTestCase
{
	@Test
	public void CreationHomePage() throws Exception {
		try {
			creation_HomePage_Helper = new Creation_HomePage_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String HomeBillboardWidth = propertyReader.readApplicationFile("HomeBillboard_Width_EEPage");	
			String HomeBillboardHeight = propertyReader.readApplicationFile("HomeBillboard_height_EEPage");
			String LineDivider = propertyReader.readApplicationFile("LineDivider_EEPage");
			String SpotLightImageWidth = propertyReader.readApplicationFile("SpotLightImageWidth_CreationPage");
			String SpotLightImageHeight= propertyReader.readApplicationFile("SpotLightImageHeight_EEPage");
			
			creation_HomePage_Helper.verifycreationHomepage(HomeBillboardWidth,HomeBillboardHeight,LineDivider,SpotLightImageWidth,SpotLightImageHeight);
		}
		catch (Error e) 
		{
			captureScreenshot("Creation Page");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 
		catch (Exception ex)
		{
			captureScreenshot("Creation Page");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}
}