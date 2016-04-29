/*==============================================================================================================================
 File Name    : Brands_Product_Downloads_Page.java
 ClassName    : Brands_Product_Downloads_Page
 Summary      : Contains automation scripts to Verify Brands Product Downloads page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Brands_Product_Downloads_Helper;
import test.java.com.MusicGroup.pagehelper.MG_Warranty_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Brands_Product_Downloads_Page extends DriverTestCase
{
	@Test
	public void verifyBrands_Product_Downloads_Page() throws Exception
	{
		try{
			//Initialize object
			brands_Product_Downloads_Helper = new Brands_Product_Downloads_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());
			
			//Declare variables
			String vSpace1Height = propertyReader.readApplicationFile("vSpace1Height_onProductDownloadpage");
			String vSpace4Height = propertyReader.readApplicationFile("vSpace4Height_onProductDownloadpage");
			String vSpace3Height = propertyReader.readApplicationFile("vSpace3Height_onProductDownloadpage");
			String vSpace2Height = propertyReader.readApplicationFile("vSpace2Height_onProductDownloadpage");
			String Gutter16width = propertyReader.readApplicationFile("Gutter16width_onProductDownloadpage");
			String Fixedimagebox30width = propertyReader.readApplicationFile("Fixedimagebox30Width_onProductDownloadpage");
			String Fixedimagebox30height = propertyReader.readApplicationFile("Fixedimagebox30height_onProductDownloadpage");
			String Textspace10height = propertyReader.readApplicationFile("Textspace10height_ondownloadpage");
			String Icon20width = propertyReader.readApplicationFile("Icon20width_ondownloadpage");
			String Icon20height = propertyReader.readApplicationFile("Icon20height_ondownloadpage");
	
			brands_Product_Downloads_Helper.verifyFeaturePage(vSpace1Height,vSpace4Height,vSpace3Height,vSpace2Height,Textspace10height, Fixedimagebox30height, Fixedimagebox30width, Gutter16width, Icon20width, Icon20height);
			ExecutionLog.Log("Product Feature page verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("Brands_Product_Downloads_Page");	
			ExecutionLog.LogErrorMessage(e);
			throw e;

		}
		catch(Exception ex) 
		{
			captureScreenshot("Brands_Product_Downloads_Page");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
}
