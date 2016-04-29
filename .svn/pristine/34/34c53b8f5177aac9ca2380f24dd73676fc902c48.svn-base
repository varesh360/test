package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;



import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.pagehelper.JoinUS_HowWeLive_Helper;


public class JoinUS_HowWeLive extends DriverTestCase 
{
	@Test
	public void VerifyHowWeLive() throws Exception {
		try {
			// Initialize object
						JOINUS_HowWeLive_Helper = new JoinUS_HowWeLive_Helper(driver);
						ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
						String Vspace1Height = propertyReader.readApplicationFile("VSpace1height");
						String vSpace4height = propertyReader.readApplicationFile("vSpace4height");
						String vTextSpace5Height = propertyReader.readApplicationFile("TextSpace5Height_onMidasTrainingPage");
						String vTextSpace7Height = propertyReader.readApplicationFile("GutterA65width");
						String TextSpaceBHeight = propertyReader.readApplicationFile("TextSpace13Height_onMidasTrainingPage");
						String vSpace8Height = propertyReader.readApplicationFile("gutter34width_B2BUploadCartPage");
						String Gutter16_Width = propertyReader.readApplicationFile("Gutter4Width_B2BRegistrationPage");
						String ImageHeight72 = propertyReader.readApplicationFile("HowWeLive_ImageHeight");
						String ImageWidth72  = propertyReader.readApplicationFile("HowWeLive_ImageWidth");
						String ImageHeightA = propertyReader.readApplicationFile("HowWeLive_ImageHeightA");
						String ImageWidthA  = propertyReader.readApplicationFile("HowWeLive_ImageWidthA");
						String ImageHeight71  = propertyReader.readApplicationFile("WhatWeDo_Image1");
						
						JOINUS_HowWeLive_Helper.VerifyHowWeLive(Vspace1Height,vSpace4height,vTextSpace5Height,vTextSpace7Height,TextSpaceBHeight,vSpace8Height,Gutter16_Width,ImageHeight72,ImageWidth72,ImageWidthA,ImageHeightA, ImageHeight71);

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

