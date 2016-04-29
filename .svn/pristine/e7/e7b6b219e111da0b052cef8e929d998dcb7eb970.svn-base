/*==============================================================================================================================
File Name    : Enterprise_And_Entertainment.java
ClassName    : Enterprise_And_Entertainment
Summary      : Contains helping methods for Enterprise_And_Entertainment Page.
===============================================================================================================================
History      :   Company            Created By     
	  360logica                         

===============================================================================================================================
Remarks      :   Tests - 
===============================================================================================================================*/



package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Ask_Question_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.Enterprise_And_EntertainmentHelper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.util.PropertyReader;

public class Enterprise_And_Entertainment extends DriverTestCase
{
	@Test
	public void EnterpriseEntertainment() throws Exception {
		try {
			enterprise_And_entertainmentHelper = new Enterprise_And_EntertainmentHelper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String HomeBillboardWidth = propertyReader.readApplicationFile("HomeBillboard_Width_EEPage");	
			String HomeBillboardHeight = propertyReader.readApplicationFile("HomeBillboard_height_EEPage");
			String LineDivider = propertyReader.readApplicationFile("LineDivider_EEPage");
			String SpotLightImageWidth = propertyReader.readApplicationFile("SpotLightImageWidth_EEPage");
			String SpotLightImageHeight= propertyReader.readApplicationFile("SpotLightImageHeight_EEPage");
			String SpotHeightImage1=propertyReader.readApplicationFile("SpotLightImageWidth_CreationPage");
			
			enterprise_And_entertainmentHelper.verifyentertainmentpage(SpotHeightImage1,HomeBillboardWidth,HomeBillboardHeight,LineDivider,SpotLightImageWidth,SpotLightImageHeight);
		}
		catch (Error e) 
		{
			captureScreenshot("Enterprise_And_EntertainmentPage");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 
		catch (Exception ex)
		{
			captureScreenshot("Enterprise_And_Entertainment_Page");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}
}
