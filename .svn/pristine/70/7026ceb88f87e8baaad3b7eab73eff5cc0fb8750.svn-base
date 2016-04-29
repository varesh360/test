package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.MusicInstrument_Page_Helper ;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class MusicInstrument_Page extends DriverTestCase
{
	@Test
	public void InstallHomePage() throws Exception {
		try {
			musicInstrument_Page_Helper = new MusicInstrument_Page_Helper (driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String HomeBillboardWidth = propertyReader.readApplicationFile("HomeBillboardImageWidth_MusicalInstrumentPage");	
			String HomeBillboardHeight = propertyReader.readApplicationFile("HomeBillboardImageHeight_MusicalInstrumentPage");
			String LineDivider = propertyReader.readApplicationFile("LineDivider_MusicalInstrumentPage");
			String SpotLightImageWidth = propertyReader.readApplicationFile("SpotLightImageWidth_MusicalInstrumentPage");
			String SpotLightImageHeight= propertyReader.readApplicationFile("SpotLightImageHeight_MusicalInstrumentPage");
			
			musicInstrument_Page_Helper.verifyMusicInstrumentHomepage(HomeBillboardWidth,HomeBillboardHeight,LineDivider,SpotLightImageWidth,SpotLightImageHeight);
		}
		catch (Error e) 
		{
			captureScreenshot("Music Instrument Page");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 
		catch (Exception ex)
		{
			captureScreenshot("Music Instrument Page");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}
}