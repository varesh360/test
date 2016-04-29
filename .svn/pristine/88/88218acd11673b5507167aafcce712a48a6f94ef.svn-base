/*==============================================================================================================================
 File Name    : TC_002_Product_Overview_Page.java
 ClassName    : TC_002_Product_Overview_Page
 Summary      : Contains automation scripts to Verify Product Overview page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;
import test.java.com.MusicGroup.pagehelper.Product_Overview_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Product_Overview_Page extends DriverTestCase
{
	@Test
	public void VerifyProductOverviewPage() throws Exception
	{
		try{
			//Initialize object
			product_Overview_Helper = new Product_Overview_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());
			
			//Declare variables
			String billboard_height = propertyReader.readApplicationFile("BillBoardheight");
			String billboard_width = propertyReader.readApplicationFile("BillBoardwidth");
			String thumbheight = propertyReader.readApplicationFile("GallaryImg01_height");
			String thumbwidth = propertyReader.readApplicationFile("GallaryImg01_width");
			String ThumbGap = propertyReader.readApplicationFile("ThumbGap");
			String ProductImagewidth = propertyReader.readApplicationFile("ProductImagewidth");
			
			String VSpace1height = propertyReader.readApplicationFile("VSpace1height");
			String ParaSpace1_height = propertyReader.readApplicationFile("vSpace4height");
			String vTextSpace7=propertyReader.readApplicationFile("GutterA65width");
			String vGutter2Width=propertyReader.readApplicationFile("CellDemension42Width_B2BShoppingCart");
			String CallOutBodyWidth = propertyReader.readApplicationFile("Width_B2BRegistrationPage");
			String vTextSpace10 = propertyReader.readApplicationFile("TextSpace10Height_B2BSearchSuggestion");
			String vHeadLead8=propertyReader.readApplicationFile("vSpace2height");
			
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
			String vSpace6Height=propertyReader.readApplicationFile("vSpace6Height");

			//Verify Product Overview page
			product_Overview_Helper.verifyOverviewPage( VSpace1height, ParaSpace1_height, vTextSpace7, vGutter2Width,CallOutBodyWidth,vTextSpace10,vHeadLead8, BodycopyLed_height, Paraspace2_height, HSeparator_width, HSeparator_height, CallBodyCopHeight, CallBodyCopwidth, CallBox_imgheight, CallBox_imgwidth, HeadlineLead_height,vSpace6Height);
			ExecutionLog.Log("Product Overview page verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("TC_002_Product_Overview_Page");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("TC_002_Product_Overview_Page");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		
		
		
		}
	}
