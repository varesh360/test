package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;



import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;
import test.java.com.MusicGroup.pagehelper.BuyNow_StoreLocation_Helper;
@Test

public class BuyNow_StoreLocation extends DriverTestCase 
{
	public void BuyNow_StoreLocation() throws Exception {
		try {
			// Initialize object
			BUYNOW_StoreLocation_Helper = new BuyNow_StoreLocation_Helper(driver);
						ExecutionLog.LogAddClass(this.getClass().getName()+ " and Test method "+ Thread.currentThread().getStackTrace()[1].getMethodName());
						String Vspace1Height = propertyReader.readApplicationFile("VSpace1height");
						String textspace1height = propertyReader.readApplicationFile("textspace1height");
						String vspace15Height= propertyReader.readApplicationFile("vspace15Height");
						String textspace9height = propertyReader.readApplicationFile("textspace9height");
						String vSpace9height = propertyReader.readApplicationFile("BodycopyLed_height");
					
						String vTextSpace8= propertyReader.readApplicationFile("vSpace2Height_onProductDownloadpage");
						String TextSpace13Height = propertyReader.readApplicationFile("TextSpace13Height_onMidasTrainingPage");
						String Gutter28Width = propertyReader.readApplicationFile("Gutter28Width_onMidasTrainingPage");
						
						String ImageHeight = propertyReader.readApplicationFile("Height");
						String ImageWidth = propertyReader.readApplicationFile("Width");
						BUYNOW_StoreLocation_Helper.VerifyBrandStoreLocationPage(Vspace1Height,textspace1height,textspace9height,vSpace9height,vspace15Height,ImageHeight,ImageWidth,vTextSpace8,TextSpace13Height,Gutter28Width);
						ExecutionLog.Log("Buy Now Store Location is running Successfully");
					
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
