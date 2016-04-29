/*==============================================================================================================================
 File Name    : MG_Partner_Page.java
 ClassName    : MG_Partner_Page
 Summary      : Contains automation scripts to Verify MG Partner page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.MG_Partner_Page_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class MG_Partner_Page extends DriverTestCase {
	@Test
	public void verifyMG_Partner_Page() throws Exception {
		try {
			// Initialize object
			mG_Partner_Page_Helper = new MG_Partner_Page_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String vSpace1Height = propertyReader.readApplicationFile("vSpace1Height_onMGPartnerPage");
			String vSpace4Height = propertyReader.readApplicationFile("vSpace4Height_onMGPartnerPage");
			String vSpace14Height = propertyReader.readApplicationFile("vSpace14Height_onMGPartnerPage");
			String Textspace4Height =propertyReader.readApplicationFile("Textspace4Height_onMGPartnerPage");
			String Textspace13Height =propertyReader.readApplicationFile("Textspace13Height_onMGPartnerPage");
			String vSpace16Height =propertyReader.readApplicationFile("vSpace16Height_onMGPartnerPage");
			String gap17width = propertyReader.readApplicationFile("Gap17Width_onMGPartnerPage");
			
			// Verify MG Partner page.
			mG_Partner_Page_Helper.verifyMGPartnerPage(vSpace14Height,gap17width, vSpace1Height, vSpace4Height,Textspace4Height,Textspace13Height, vSpace16Height);
			ExecutionLog.Log("MG_Partner page verified successfully.");
		}
		catch (Error e) 
		{
			captureScreenshot("MG_Partner_Page");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 
		catch (Exception ex)
		{
			captureScreenshot("MG_Partner_Page");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}
}
