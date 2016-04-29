/*==============================================================================================================================
 File Name    : MG_Warranty_Page.java
 ClassName    : MG_Warranty_Page
 Summary      : Contains automation scripts to Verify MG Warranty Page page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.MG_Warranty_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class MG_Warranty_Page extends DriverTestCase
{
	@Test
	public void verifyMG_Warranty_Page() throws Exception
	{
		try{
			//Initialize object
			mG_Warranty_Helper = new MG_Warranty_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());
			
			//Declare variables
			String Vspace1height = propertyReader.readApplicationFile("Vspace1height");
			String Textspace1height = propertyReader.readApplicationFile("Textspace1height");
			String Textspace5height = propertyReader.readApplicationFile("Textspace5height");
			String Textspace2height = propertyReader.readApplicationFile("Textspace2height");
			String Textspace3height = propertyReader.readApplicationFile("Textspace3height");
			String Gutter62width = propertyReader.readApplicationFile("gutter62width_B2BProductDetailPage");
			String Gutter49width = propertyReader.readApplicationFile("Gutter49width");
			String fixedimageboxwidth = propertyReader.readApplicationFile("fixedimageboxwidth");
			String fixedimageboxheight = propertyReader.readApplicationFile("fixedimageboxheight");
			String BlockListBwidth = propertyReader.readApplicationFile("BlockListBwidth");
			String GutterA65width = propertyReader.readApplicationFile("TextSpace7Height_CareerPage");
			String IndentionAwidth = propertyReader.readApplicationFile("IndentionAwidth");
	
			//Verify MG Warranty page.
			mG_Warranty_Helper.verifyMGWarrantyPage(Vspace1height, Textspace1height, Textspace5height, Textspace2height,  fixedimageboxwidth, fixedimageboxheight, Textspace3height, Gutter62width, Gutter49width, BlockListBwidth, GutterA65width, IndentionAwidth);
			ExecutionLog.Log("MG_Warranty page verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("MG_Warranty_Page");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("MG_Warranty_Page");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
}
