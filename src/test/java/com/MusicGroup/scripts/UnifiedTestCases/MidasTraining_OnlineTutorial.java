package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;



import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;




import test.java.com.MusicGroup.pagehelper.MidasTraining_OnlineTutorial_Helper;

public class MidasTraining_OnlineTutorial extends DriverTestCase 
{
	@Test
	public void MidasTraining_OnlineTutorial() throws Exception {
		try {
			// Initialize object
			MIDASTraining_OnlineTutorial_Helper = new MidasTraining_OnlineTutorial_Helper(driver);
						ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
						String Vspace1Height = propertyReader.readApplicationFile("VSpace1height");
						String vSpace4height = propertyReader.readApplicationFile("vSpace4height");
						String BillBoardwidth = propertyReader.readApplicationFile("BillBoardwidth");
						
						String vTextSpace10 = propertyReader.readApplicationFile("textSpaceheight");
						String vTextSpace8= propertyReader.readApplicationFile("Textspace2height");
						
						String TextSpace13Height = propertyReader.readApplicationFile("TextSpace13Height_onMidasTrainingPage");
						
						String VideoHeight = propertyReader.readApplicationFile("Col1Width_B2BSiteMap");
						String VideoWidth = propertyReader.readApplicationFile("VideoWidth");
						String Gutter28Width = propertyReader.readApplicationFile("vSpace2height");
						String Gap68Width=propertyReader.readApplicationFile("Gap68Width_onMidasTrainingPage");
						MIDASTraining_OnlineTutorial_Helper.VerifySchedule_OnlineTutorialPage(Vspace1Height,BillBoardwidth, vSpace4height,vTextSpace10,vTextSpace8,TextSpace13Height,VideoHeight, VideoWidth,Gutter28Width,Gap68Width);
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
