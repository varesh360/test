package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;



import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

import test.java.com.MusicGroup.pagehelper.WhatWeDo_ZhongshanCareers_Helper;
public class WhatWeDo_ZhongshanCareers extends DriverTestCase 
{
	@Test
	public void VerifyWhatWeDo_Zhongshan() throws Exception {
		try {
			// Initialize object
			WHATWeDo_Zhongshan = new WhatWeDo_ZhongshanCareers_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			String Vspace1Height = propertyReader.readApplicationFile("VSpace1height");
			String MaxWidth = propertyReader.readApplicationFile("Image_Width");
			String MaxHeight = propertyReader.readApplicationFile("Image_Height");
			String vSpace4height = propertyReader.readApplicationFile("vSpace4height");
			String vTextSpace7Height = propertyReader.readApplicationFile("GutterA65width");
			String vTextSpace5Height = propertyReader.readApplicationFile("TextSpace5Height_onMidasTrainingPage");
			String TextSpace1Height = propertyReader.readApplicationFile("TextSpace1Height_onMidasSupportPage");
			String TextSpace9Width = propertyReader.readApplicationFile("TextSpace9Width_B2BProductReview");
			String vSpace8Height = propertyReader.readApplicationFile("gutter34width_B2BUploadCartPage");
			String TextSpace13Height = propertyReader.readApplicationFile("TextSpace13Height_onMidasTrainingPage");
			String Gutter9Width = propertyReader.readApplicationFile("vSpace2height");
			String ImageHeight23 = propertyReader.readApplicationFile("WhatWeDo_ImageHeight");
			String ImageWidth23  = propertyReader.readApplicationFile("WhatWeDo_ImageWidth");
			String Gutter16Width= propertyReader.readApplicationFile("Gutter16width_onProductDownloadpage");
			
			String vTextSpace3Height=propertyReader.readApplicationFile("Textspace3height");
			
			
			
			
			WHATWeDo_Zhongshan.VerifyWhatWeDoZhongshan(Vspace1Height,MaxWidth,MaxHeight,vSpace4height,vTextSpace3Height,vTextSpace7Height,vTextSpace5Height, TextSpace1Height,TextSpace9Width,vSpace8Height,TextSpace13Height,Gutter9Width,ImageHeight23,ImageWidth23,Gutter16Width);

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
