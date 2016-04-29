package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.MG_UnifiedBrandPage_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class MG_UnifiedBrandPage extends DriverTestCase 
{
	@Test
	public void verifyMG_UnifiedBrandPage() throws Exception {
		try {
			// Initialize object
			mg_UnifiedBrandPage_Helper = new MG_UnifiedBrandPage_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String vSpace1Height = propertyReader.readApplicationFile("vSpace1Height_MGBrandPage");
			String TextSpace1Height = propertyReader.readApplicationFile("TextSpace1Height_MGBrandPage");
			String TextSpace3Height = propertyReader.readApplicationFile("TextSpace3Height_MGBrandPage");
			String BrandLogosizewidth = propertyReader.readApplicationFile("BrandLogosizewidth_MGBrandPage");
			String BrandLogosizeHeight = propertyReader.readApplicationFile("BrandLogosizeHeight_MGBrandPage");
			String CallOutBodyCopyHeight = propertyReader.readApplicationFile("CallOutBodyCopyHeight_MGBrandPage");
			String CallOutBodyCopyWidth = propertyReader.readApplicationFile("CallOutBodyCopyWidth_MGBrandPage");
			String GutterWidth = propertyReader.readApplicationFile("GutterWidth_MGBrandPage");
			String CallOutFixedBoxImageWidth = propertyReader.readApplicationFile("CallOutFixedBoxImageWidth_MGBrandPage");
			String CallOutFixedBoxImageHeight = propertyReader.readApplicationFile("CallOutFixedBoxImageHeight_MGBrandPage");
			String vSpace4Height = propertyReader.readApplicationFile("vSpace4Height_MGBrandPage");
			
			//verify Midas our story page
			mg_UnifiedBrandPage_Helper.verifyMGUnifiedBrandPage(vSpace1Height,TextSpace1Height,TextSpace3Height,BrandLogosizewidth,BrandLogosizeHeight,CallOutBodyCopyHeight,CallOutBodyCopyWidth,GutterWidth,CallOutFixedBoxImageWidth,CallOutFixedBoxImageHeight,vSpace4Height);
			ExecutionLog.Log("Unified Brand Page verified successfully.");
		}
		catch (Error e) 
		{
			captureScreenshot("MG_UnifiedBrandPage");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 		catch (Exception ex)
		{
			captureScreenshot("MG_UnifiedBrandPage");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}

}
