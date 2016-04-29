/*==============================================================================================================================
 File Name    : TC_001_Product_Feature_Page.java
 ClassName    : TC_001_Product_Feature_Page
 Summary      : Contains automation scripts to Verify Product Feature page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;
import test.java.com.MusicGroup.pagehelper.Product_Feature_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Product_Feature_Page extends DriverTestCase
{
	@Test
	public void verifyProductFeaturePage() throws Exception
	{
		try{
			//Initialize object
			product_Feature_Helper = new Product_Feature_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());
			
			//Declare variables
			String billboard_height = propertyReader.readApplicationFile("BillBoardheight");
			String billboard_width = propertyReader.readApplicationFile("BillBoardwidth");
			String thumbheight = propertyReader.readApplicationFile("GallaryImg01_height");
			String thumbwidth = propertyReader.readApplicationFile("GallaryImg01_width");
			String ThumbGap = propertyReader.readApplicationFile("ThumbGap");
			String ProductImagewidth = propertyReader.readApplicationFile("ProductImagewidth");
			String VSpace1height = propertyReader.readApplicationFile("VSpace1height");
			String ParaSpace1_height = propertyReader.readApplicationFile("ParaSpace1_height");
			String SubhLead_height = propertyReader.readApplicationFile("SubhLead_height");
			String BodycopyLed_height = propertyReader.readApplicationFile("BodycopyLed_height");
			String Paraspace2_height = propertyReader.readApplicationFile("Paraspace2_height");
			String HSeparator_width = propertyReader.readApplicationFile("HSeparator_width");
			String HSeparator_height = propertyReader.readApplicationFile("HSeparator_height");
			String CallBodyCopHeight = propertyReader.readApplicationFile("CallBodyCopHeight");
			String CallBodyCopwidth = propertyReader.readApplicationFile("CallBodyCopwidth");
			String CallBox_imgheight = propertyReader.readApplicationFile("CallBox_imgheight");
			String CallBox_imgwidth = propertyReader.readApplicationFile("CallBox_imgwidth");
			String HeadlineLead_height = propertyReader.readApplicationFile("HeadlineLead_height");

			//Verify Product Feature page.
			product_Feature_Helper.verifyFeaturePage(billboard_height , billboard_width, thumbheight, thumbwidth, ThumbGap, ProductImagewidth, VSpace1height, ParaSpace1_height, SubhLead_height, BodycopyLed_height, Paraspace2_height, HSeparator_width, HSeparator_height, CallBodyCopHeight, CallBodyCopwidth, CallBox_imgheight, CallBox_imgwidth, HeadlineLead_height);
			ExecutionLog.Log("Product Feature page verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("TC_001_Product_Feature_Page");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("TC_001_Product_Feature_Page");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
