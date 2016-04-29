/*==============================================================================================================================
 File Name    : MG_UnifiedGlobalSupport.java
 ClassName    : MG_UnifiedGlobalSupport
 Summary      : Contains automation scripts to Verify MG_UnifiedGlobalSupport page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/


package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.MG_UnifiedGlobalSupport_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class MG_UnifiedGlobalSupport extends DriverTestCase 
{
	@Test
	public void verifyMidas_SupportPage() throws Exception {
		try {
			mG_UnifiedGlobalSupport_Helper = new MG_UnifiedGlobalSupport_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String vSpace1Height = propertyReader.readApplicationFile("vSpace1Height_onMidasSupportPage");	
			String gutter3width = propertyReader.readApplicationFile("Gutter3Width_onMidasSupportPage");
			String textSpace1Height=propertyReader.readApplicationFile("TextSpace1Height_onMidasSupportPage");
			String SupportPhotoWidth=propertyReader.readApplicationFile("SupportPhotoWidth_onMidasSupportPage");
			String SupportPhotoHeight=propertyReader.readApplicationFile("SupportPhotoHeight_onMidasSupportPage");
			String vSpace2Height=propertyReader.readApplicationFile("vSpace2Height_onMidasSupportPage");
			String BrandAreaLogoWidth=propertyReader.readApplicationFile("BrandAreaLogoWidth_onMidasSupportPage");
			String BrandsAreaLogoHeight=propertyReader.readApplicationFile("BrandsAreaLogoHeight_onMidasSupportPage");
			String vSpace4Height=propertyReader.readApplicationFile("vSpace4Height_onMidasSupportPage");
			String iconWidth=propertyReader.readApplicationFile("iconWidth_onMidasSupportPage");
			String iconHeigth=propertyReader.readApplicationFile("iconHeigth_onMidasSupportPage");
			String gutter8Width=propertyReader.readApplicationFile("gutter8Width_onMidassupportPage");
			
			
			mG_UnifiedGlobalSupport_Helper.verifySupportPage( vSpace1Height, gutter3width, textSpace1Height,SupportPhotoWidth,SupportPhotoHeight, vSpace2Height, BrandAreaLogoWidth, BrandsAreaLogoHeight, vSpace4Height,iconWidth,iconHeigth, gutter8Width);
			ExecutionLog.Log("Midas Training page verified successfully.");
		}
		catch (Error e) 
		{
			captureScreenshot("Midas_Training_Page");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 
		catch (Exception ex)
		{
			captureScreenshot("Midas_Training_Page");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}
}
