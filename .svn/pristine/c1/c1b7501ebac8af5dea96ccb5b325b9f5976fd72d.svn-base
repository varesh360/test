package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Home_BrandPage_Helper;
import test.java.com.MusicGroup.pagehelper.MG_UnifiedGlobalSupport_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Home_Brand_Page extends DriverTestCase 
{
	@Test
	public void verifyBrand_HomePage() throws Exception {
		try {
			home_BrandPage_Helper = new Home_BrandPage_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String vSpace1Height = propertyReader.readApplicationFile("vSpace1Height_onHomeBrandPage");	
			String Gutter3Width = propertyReader.readApplicationFile("Gutter3Width_onHomePage");
			String TypicalBrandlogowidth = propertyReader.readApplicationFile("TypicalBrandLogoSizeWidth_onHomePage");
			String TypicalBrandLogoHeight = propertyReader.readApplicationFile("TypicalBrandLogoHeight_onHomePage");		
			String vSpace4Height = propertyReader.readApplicationFile("vSpace4Height_onHomePage");		
			String textspace1height=propertyReader.readApplicationFile("TextSpace1Height_onHomeBrandPage");
			home_BrandPage_Helper.verifyHomeBrandPage(vSpace1Height, Gutter3Width, TypicalBrandlogowidth, TypicalBrandLogoHeight, vSpace4Height, textspace1height);
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
