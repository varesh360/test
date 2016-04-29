package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.LifeStyle_HomePage_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class LifeStyle_HomePage  extends DriverTestCase
{
	@Test
	public void LifeStyleHomePage() throws Exception {
		try {
			lifestyle_HomePage = new LifeStyle_HomePage_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String HomeBillboardWidth = propertyReader.readApplicationFile("HomeBillboard_Width_EEPage");	
			String HomeBillboardHeight = propertyReader.readApplicationFile("HomeBillboard_height_EEPage");
			String LineDividerOfimage = propertyReader.readApplicationFile("LineDivider_EEPage");
			System.out.println("LineDivider_EEPage on Main Java"+LineDividerOfimage);
			String SpotLightImageWidth = propertyReader.readApplicationFile("SpotLightImageWidth_EEPage");
			String SpotLightImageHeight= propertyReader.readApplicationFile("SpotLightImageHeight_EEPage");
			String SoptLightImageWidth1=propertyReader.readApplicationFile("SpotLightImageWidth_LifeStyle1");
			
			lifestyle_HomePage.verifyLifeStylePage(HomeBillboardWidth,HomeBillboardHeight,LineDividerOfimage,SpotLightImageWidth,SpotLightImageHeight,SoptLightImageWidth1);
		}
		catch (Error e) 
		{
			captureScreenshot("LifeStyle and Home Page");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 
		catch (Exception ex)
		{
			captureScreenshot("LifeStyle and Home Page");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}
}