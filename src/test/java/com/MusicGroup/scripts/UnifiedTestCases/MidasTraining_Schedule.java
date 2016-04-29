package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;



import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;




import test.java.com.MusicGroup.pagehelper.MidasTraining_Schedule_Helper;

@Test
public class MidasTraining_Schedule extends DriverTestCase 
{
	public void MidasTraining3_Schedule() throws Exception {
		try {
			// Initialize object
			MIDASTraining3_Schedule_Helper = new MidasTraining_Schedule_Helper(driver);
						ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
						String Vspace1Height = propertyReader.readApplicationFile("VSpace1height");
						String vSpace4height = propertyReader.readApplicationFile("vSpace4height");
						String vSpace9height = propertyReader.readApplicationFile("BodycopyLed_height");
						String vspace15Height= propertyReader.readApplicationFile("vspace15Height");
						String vTextSpace8= propertyReader.readApplicationFile("vSpace2Height_onProductDownloadpage");
						String TextSpace13Height = propertyReader.readApplicationFile("TextSpace13Height_onMidasTrainingPage");
						String Gutter28Width = propertyReader.readApplicationFile("Gutter28Width_onMidasTrainingPage");
						MIDASTraining3_Schedule_Helper.VerifySchedule_TrainingPage(Vspace1Height,vSpace4height,vSpace9height,vspace15Height,vTextSpace8,TextSpace13Height,Gutter28Width);
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

