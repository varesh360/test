/*==============================================================================================================================
 File Name    : Store_Locator.java
 ClassName    : Store_Locator
 Summary      : Contains automation scripts to Verify Store_Locator Page.
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

public class Store_Locator extends DriverTestCase
{
	@Test
	public void verifyStore_Locator_Page() throws Exception
	{
		try{
			//Initialize object
			buyNow_Helper = new BuyNow_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());
			
			//Declare variables
			String vSpace1height = propertyReader.readApplicationFile("vSpace1height");
			String vSpace4height = propertyReader.readApplicationFile("vSpace4height");
			String textField11width = propertyReader.readApplicationFile("textField11width");
			String textField11height = propertyReader.readApplicationFile("textField11height");
			String textField10width = propertyReader.readApplicationFile("textField10width");
			String textField10height = propertyReader.readApplicationFile("textField10height");
			String vSpace2height = propertyReader.readApplicationFile("vSpace2height");
			String iconwidth = propertyReader.readApplicationFile("iconwidth");
			String iconheight = propertyReader.readApplicationFile("iconheight");
			String FixedBowwidth = propertyReader.readApplicationFile("FixedBowwidth");
			String FixedBowheight = propertyReader.readApplicationFile("FixedBowheight");
			String gutter9width = propertyReader.readApplicationFile("gutter9width");
			String textSpaceheight = propertyReader.readApplicationFile("textSpaceheight");
			String vSpace3Height = propertyReader.readApplicationFile("vSpace3Height");
			String subheadLeading = propertyReader.readApplicationFile("subheadLeading");

			//Verify Store Locator page.
			buyNow_Helper.verifyStoreLocatorPage(vSpace1height, vSpace4height, textField11width, textField11height,  textField10width, textField10height, vSpace2height, iconwidth, iconheight, FixedBowwidth, FixedBowheight, gutter9width, textSpaceheight, vSpace3Height, subheadLeading);
			ExecutionLog.Log("Store Locator page verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("Store_Locator_Page");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("Store_Locator_Page");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
