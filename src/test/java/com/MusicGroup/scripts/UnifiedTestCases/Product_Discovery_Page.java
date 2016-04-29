/*==============================================================================================================================
 File Name    : Product_Discovery_Page.java
 ClassName    : Product_Discovery_Page
 Summary      : Contains automation scripts to Verify Product Discovery Page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/

package test.java.com.MusicGroup.scripts.UnifiedTestCases;
import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Discovery_Page_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Product_Discovery_Page extends DriverTestCase
{
	@Test
	public void verifyProduct_Discovery_Page() throws Exception
	{
		try{
			//Initialize object
			discovery_Page_Helper = new Discovery_Page_Helper(driver);
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
			String FixedBowwidth = propertyReader.readApplicationFile("fixedBoxImageWidth_onProductDiscoveryPage");
			String FixedBowheight = propertyReader.readApplicationFile("fixedBoxImageheight_onProductDiscoveryPage");
			String Gutter16Width = propertyReader.readApplicationFile("Gutter16Width_onProductDiscoveryPage");
			String textSpaceheight = propertyReader.readApplicationFile("textSpaceheight");
			String vSpace3Height = propertyReader.readApplicationFile("vSpace3Height");
			String subheadLeading = propertyReader.readApplicationFile("subheadLeading");
			String TextSpace5Height = propertyReader.readApplicationFile("TextSpace5Height_onProductDiscoveryPage");


			//Verify Discovery page.
			discovery_Page_Helper.verifyDiscoveryPage(vSpace1height, vSpace4height, textField11width, textField11height,  textField10width, textField10height, vSpace2height, iconwidth, iconheight, FixedBowwidth, FixedBowheight, Gutter16Width, textSpaceheight, vSpace3Height, subheadLeading,TextSpace5Height);
			ExecutionLog.Log("Discovery page verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("Product_Discovery_Page");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("Product_Discovery_Page");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
