/*==============================================================================================================================
 File Name    : Buy_Now.java
 ClassName    : Buy_Now
 Summary      : Contains automation scripts to Verify Buy_Now Page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;
import test.java.com.MusicGroup.pagehelper.BuyNow_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Buy_Now extends DriverTestCase
{
	@Test
	public void verifyBuy_Now_Page() throws Exception
	{
		try{
			//Initialize object
			buyNow_Helper = new BuyNow_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());
			
			//Declare variables
			String vSpace1height = propertyReader.readApplicationFile("vSpace1height");
			String textspace1height = propertyReader.readApplicationFile("textspace1height");
			String textspace5height = propertyReader.readApplicationFile("textspace5height");
			String gutter2width = propertyReader.readApplicationFile("gutter2width");
			String fixedimageboxwidth = propertyReader.readApplicationFile("fixedimageboxwidth");
			String fixedimageboxheight = propertyReader.readApplicationFile("fixedimageboxheight_buynow");
			String vspace15Height = propertyReader.readApplicationFile("vspace15Height");
			String textspace9height = propertyReader.readApplicationFile("textspace9height");
			String indentionBWidth = propertyReader.readApplicationFile("indentionBWidth");
			String textFieldwidth = propertyReader.readApplicationFile("textFieldwidth_buynow");
			

			//Verify Buy Now page.
			buyNow_Helper.verifyBuyNowPage(vSpace1height, textspace1height, textspace5height, gutter2width,  fixedimageboxwidth, fixedimageboxheight, vspace15Height, textspace9height, indentionBWidth, textFieldwidth);
			ExecutionLog.Log("Buy Now page verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("Buy_Now_Page");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("Buy_Now_Page");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
