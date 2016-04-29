package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;



import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.pagehelper.JoinUS_WhatWeDo_Helper;


public class JoinUS_WhatWeDo extends DriverTestCase 
{
	@Test
	public void VerifyWhatWeDo() throws Exception {
		try {
			// Initialize object
			JOINUS_WhatWeDo_Helper = new JoinUS_WhatWeDo_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String Vspace1Height = propertyReader.readApplicationFile("VSpace1height");
			String MaxWidth = propertyReader.readApplicationFile("BillBoardwidth");
			String MaxHeight = propertyReader.readApplicationFile("WhatWeDo_Image1");
			String vSpace4height = propertyReader.readApplicationFile("vSpace4height");
			String vTextSpace7Height = propertyReader.readApplicationFile("GutterA65width");
			String vTextSpace5Height = propertyReader.readApplicationFile("TextSpace5Height_onMidasTrainingPage");
			String TextSpace1Height = propertyReader.readApplicationFile("TextSpace1Height_onMidasSupportPage");
			String TextSpace9Width = propertyReader.readApplicationFile("TextSpace9Width_B2BProductReview");
			String vSpace8Height = propertyReader.readApplicationFile("gutter34width_B2BUploadCartPage");
			String TextSpace13Height = propertyReader.readApplicationFile("TextSpace13Height_onMidasTrainingPage");
			String Gutter74Width = propertyReader.readApplicationFile("WhatWeDo_Gutter74Width");
			String ImageHeight23 = propertyReader.readApplicationFile("WhatWeDo_ImageHeight");
			String ImageWidth23  = propertyReader.readApplicationFile("WhatWeDo_ImageWidth");
			
			
			
			
			
			
			JOINUS_WhatWeDo_Helper.VerifyWhatWeDo(Vspace1Height,MaxWidth,MaxHeight,vSpace4height,vTextSpace7Height,vTextSpace5Height, TextSpace1Height,TextSpace9Width,vSpace8Height,TextSpace13Height,Gutter74Width,ImageHeight23,ImageWidth23);

			ExecutionLog.Log("Midas Training page verified successfully.");
		
		}
		catch (Error e) 
		{
			captureScreenshot("Midas_OurStoryPage2008");
			ExecutionLog.LogErrorMessage(e);
			throw e;
		} 		catch (Exception ex)
		{
			captureScreenshot("Midas_OurStoryPage2008");
			ExecutionLog.LogExceptionMessage(ex);
			throw ex;
		}
	}
}
