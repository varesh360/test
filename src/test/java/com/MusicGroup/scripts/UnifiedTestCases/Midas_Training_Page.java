/*==============================================================================================================================
 File Name    : MG_Traning_Page.java
 ClassName    : MG_Traning_Page
 Summary      : Contains automation scripts to Verify MG Traning page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;





import test.java.com.MusicGroup.pagehelper.Midas_Training_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Midas_Training_Page extends DriverTestCase 
{
	@Test
	public void verifyMidas_TrainingPage() throws Exception {
		try {
			// Initialize object
			midas_Traning_helper = new Midas_Training_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String vSpace1Height = propertyReader.readApplicationFile("vSpace1Height_onMidasTrainingPage");	
			String Gap68Width = propertyReader.readApplicationFile("Gap68Width_onMidasTrainingPage");
			String vSpace4Height = propertyReader.readApplicationFile("vSpace4Height_onMidasTrainingPage");
			String fixedBoxImageWidth = propertyReader.readApplicationFile("fixedBoxImageWidth_onMidasTrainingPage");
			String FixedBoxImageHeight = propertyReader.readApplicationFile("FixedBoxImageHeight_onMidasTrainingPage");
			String TextSpace11Height = propertyReader.readApplicationFile("TextSpace11Height_onMidasTrainingPage");
			String TextSpace10Height = propertyReader.readApplicationFile("TextSpace10Height_onMidasTrainingPage");
			String Gutter8width = propertyReader.readApplicationFile("Gutter8width_onMidasTrainingPage");
			String TextSpace13Height = propertyReader.readApplicationFile("TextSpace13Height_onMidasTrainingPage");
			String TextSpace5Height = propertyReader.readApplicationFile("TextSpace5Height_onMidasTrainingPage");
			String Gutter82Width = propertyReader.readApplicationFile("Gutter82Width_onMidasTrainingPage");
			String Gutter28Width = propertyReader.readApplicationFile("Gutter28Width_onMidasTrainingPage");
			String Gutter83Width = propertyReader.readApplicationFile("Gutter83Width_onMidasTrainingPage");
			// Verify Midas Training page.
			midas_Traning_helper.verifyMidasTrainingPage(vSpace1Height,vSpace4Height, fixedBoxImageWidth,FixedBoxImageHeight,TextSpace10Height,Gutter28Width,Gutter8width,Gutter82Width,Gutter83Width,TextSpace13Height,TextSpace5Height);
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
