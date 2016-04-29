package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Ask_Question_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Ask_Question_Page extends DriverTestCase 
{
	@Test
	public void verifyMidas_SupportPage() throws Exception {
		try {
			ask_Question_Helper = new Ask_Question_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String vSpace1Height = propertyReader.readApplicationFile("vSpace1Height_onAskAQuestionPage");	
			String vSpace4Height = propertyReader.readApplicationFile("Vspace4Height_onAskAQuestionPage");
			String Vspace8Height = propertyReader.readApplicationFile("Vspace8Height_onAskAQuestionPage");
			String Vspace23Height = propertyReader.readApplicationFile("Vspace23Height_onAskAQuestionPage");
			String BodyCopyLeading = propertyReader.readApplicationFile("BodyCopyLeading_onAskAQuestionPage");
			String TextSpace1Height=propertyReader.readApplicationFile("TextSpace1Height_onAskAQuestionPage");
			ask_Question_Helper.verifyAskAQuestionPage( vSpace1Height, vSpace4Height,Vspace8Height,Vspace23Height, BodyCopyLeading, TextSpace1Height);
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
