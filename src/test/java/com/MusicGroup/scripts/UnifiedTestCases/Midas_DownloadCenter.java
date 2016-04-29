package test.java.com.MusicGroup.scripts.UnifiedTestCases;

import org.testng.annotations.Test;

import test.java.com.MusicGroup.pagehelper.Download_Center_Helper;
import test.java.com.MusicGroup.util.DriverTestCase;
import test.java.com.MusicGroup.util.ExecutionLog;

public class Midas_DownloadCenter extends DriverTestCase
{
	@Test
	public void verifyDownload_CenterPage() throws Exception
	{
		try{
			//Initialize object
			download_Center_Helper = new Download_Center_Helper(driver);
			ExecutionLog.LogAddClass(this.getClass().getName() + " and Test method " +Thread.currentThread().getStackTrace()[1].getMethodName());
			
			//Declare variables
			String vSpace1height = propertyReader.readApplicationFile("vSpace1height");
			String vSpace4height = propertyReader.readApplicationFile("vSpace4height");
			String textField11width = propertyReader.readApplicationFile("textField11width_downloadcenter");
			String textField11height = propertyReader.readApplicationFile("textField11height_downloadcenter");
			String textField10width = propertyReader.readApplicationFile("textField10width_downloadcenter");
			String textField10height = propertyReader.readApplicationFile("textField10height_downloadcenter");
			String vSpace2height = propertyReader.readApplicationFile("vSpace2height");
			String iconwidth = propertyReader.readApplicationFile("iconwidth");
			String iconheight = propertyReader.readApplicationFile("iconheight");
			String FixedBowwidth = propertyReader.readApplicationFile("FixedBowwidth");
			String FixedBowheight = propertyReader.readApplicationFile("FixedBowheight");
			String gutter9width = propertyReader.readApplicationFile("gutter9width");
			String textSpaceheight = propertyReader.readApplicationFile("textSpaceheight");
			String vSpace3Height = propertyReader.readApplicationFile("vSpace3Height");
			String subheadLeading = propertyReader.readApplicationFile("subheadLeading");
			String textField9height = propertyReader.readApplicationFile("textField9height_downloadcenter");
            String PageName="Midas";
			//Verify Download Center page.
			download_Center_Helper.verifyDownloadCenterPage(vSpace1height, vSpace4height, textField11width, textField11height,  textField10width, textField10height, vSpace2height, iconwidth, iconheight, FixedBowwidth, FixedBowheight, gutter9width, textSpaceheight, vSpace3Height, subheadLeading,textField9height,PageName);
			ExecutionLog.Log("Download Center page verified successfully.");
		}  
		catch(Error e) 
		{
			captureScreenshot("Midas_Download_Center_Page");	
			ExecutionLog.LogErrorMessage(e);
			throw e;
		}
		catch(Exception ex) 
		{
			captureScreenshot("Midas_Download_Center_Page");	
			ExecutionLog.LogExceptionMessage(ex);	
			throw ex;
		}
		}
	}
