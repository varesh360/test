
package test.java.com.MusicGroup.util;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


/*
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
*/
import test.java.com.MusicGroup.pagehelper.*;
import test.java.com.MusicGroup.pagehelper.B2B_Home_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_Login_Helper;
import test.java.com.MusicGroup.pagehelper.Brands_Product_Downloads_Helper;
import test.java.com.MusicGroup.pagehelper.BuyNow_Helper;
import test.java.com.MusicGroup.pagehelper.Discovery_Page_Helper;
import test.java.com.MusicGroup.pagehelper.Download_Center_Helper;
import test.java.com.MusicGroup.pagehelper.MG_Warranty_Helper;
import test.java.com.MusicGroup.pagehelper.Product_Feature_Helper;
import test.java.com.MusicGroup.pagehelper.Product_Overview_Helper;
import test.java.com.MusicGroup.pagehelper.TurboSound_BecomePartner_Helper;
import test.java.com.MusicGroup.pagehelper.Unified_Home_Helper;
import test.java.com.MusicGroup.pagehelper.MG_Partner_Page_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_Training_Helper;
import test.java.com.MusicGroup.pagehelper.MG_UnifiedGlobalSupport_Helper;
import test.java.com.MusicGroup.pagehelper.Home_BrandPage_Helper;
import test.java.com.MusicGroup.pagehelper.Ask_Question_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_ShoppingCart_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_ProductReview_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_RegistrationPage_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_SearchSuggestion_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_SearchResult_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_ViewAccountPage_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_SiteMapPage_Helper;
import test.java.com.MusicGroup.pagehelper.PageNotFound_Helper;
import test.java.com.MusicGroup.pagehelper.Enterprise_And_EntertainmentHelper;
import test.java.com.MusicGroup.pagehelper.Creation_HomePage_Helper;
import test.java.com.MusicGroup.pagehelper.LifeStyle_HomePage_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_ProductDetailPage_Helper;
import test.java.com.MusicGroup.pagehelper.Install_Page_Helper;
import test.java.com.MusicGroup.pagehelper.Live_Page_Helper;
import test.java.com.MusicGroup.pagehelper.Production_Page_Helper;
import test.java.com.MusicGroup.pagehelper.MusicInstrument_Page_Helper ;
import test.java.com.MusicGroup.pagehelper.SHMCP_2054_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_PlaceOrder_SingleProduct_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_OrderDetailPage_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_StoreAccountPopup_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_ForgotPasswordPage_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_ForgotMusicId_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_QuickViewCartBox_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_CheckOutPage_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_SignInPage_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory1970_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory1971_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory1974_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory1980_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory1986_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory1987_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory1990_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory1995_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory1996_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory1998_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory2002_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory2003_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory2004_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory2006_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory2008_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory2011_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory2014_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_OurStory2009_Helper;
import test.java.com.MusicGroup.pagehelper.NoResultPage_Helper;
import test.java.com.MusicGroup.pagehelper.Unified_SearchSuggestionPopup_Helper;
import test.java.com.MusicGroup.pagehelper.Unified_OrderSparePartsHelper;
import test.java.com.MusicGroup.pagehelper.MG_UnifiedBrandPage_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_HourlyCheck_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_InActiveAccount_Helper;
import test.java.com.MusicGroup.pagehelper.B2B_ChangePassword_Helper;
import test.java.com.MusicGroup.pagehelper.MG_Career_Helper;
import test.java.com.MusicGroup.pagehelper.VerifyB2BCheckoutPage_Helper;
import test.java.com.MusicGroup.pagehelper.WhatWeDo_LasVegasCareers_Helper;
import test.java.com.MusicGroup.pagehelper.WhatWeDo_LosAngelesCareers_Helper;
import test.java.com.MusicGroup.pagehelper.WhatWeDo_ZhongshanCareers_Helper;
import test.java.com.MusicGroup.pagehelper.MidasTraining_OnlineTutorial_Helper;
import test.java.com.MusicGroup.pagehelper.BuyNow_StoreLocation_Helper;
import test.java.com.MusicGroup.pagehelper.JoinUS_HowWeLive_Helper;
import test.java.com.MusicGroup.pagehelper.JoinUS_WhatWeDo_Helper;
import test.java.com.MusicGroup.pagehelper.MidasTraining_Schedule_Helper;
import test.java.com.MusicGroup.pagehelper.Midas_BecomePartner_helper;
import test.java.com.MusicGroup.pagehelper.Klarkteknik_BecomePartner_Helper;
import test.java.com.MusicGroup.pagehelper.VerifyB2BAdd_DeleteItemCart_Helper;
import test.java.com.MusicGroup.pagehelper.VerifyB2B_CopyCart_Helper;
import test.java.com.MusicGroup.pagehelper.VerifyB2B_DownloadProductList_Helper;
import test.java.com.MusicGroup.pagehelper.VerifyB2B_UploadProductList_Helper;
import test.java.com.MusicGroup.pagehelper.VerifyB2B_OrderHistoryDownload_Helper;
import test.java.com.MusicGroup.pagehelper.VerifyB2B_OrderHistoryUpdate_Helper;
import test.java.com.MusicGroup.pagehelper.PerformanceInstalled_Helper;
import test.java.com.MusicGroup.pagehelper.UnifiedSupport_Brands_Helper;
public abstract class DriverTestCase {

	//Define object
	public WebDriver driver;
	public B2B_Login_Helper b2B_Login_Helper;
	public B2B_Home_Helper b2B_Home_Helper;
	public Product_Feature_Helper product_Feature_Helper;
	public Product_Overview_Helper product_Overview_Helper;
	public Unified_Home_Helper unified_Home_Helper;
	public Download_Center_Helper download_Center_Helper;
	public Discovery_Page_Helper discovery_Page_Helper;
	public BuyNow_Helper buyNow_Helper;
	public MG_Warranty_Helper mG_Warranty_Helper;
	public Brands_Product_Downloads_Helper brands_Product_Downloads_Helper;
	public MG_Partner_Page_Helper mG_Partner_Page_Helper;
	public Midas_Training_Helper midas_Traning_helper;
	public MG_UnifiedGlobalSupport_Helper mG_UnifiedGlobalSupport_Helper;
	public Home_BrandPage_Helper home_BrandPage_Helper;
	public Ask_Question_Helper ask_Question_Helper;
	public B2B_ShoppingCart_Helper b2b_ShoppingCart_Helper;
	public B2B_ProductReview_Helper b2b_ProductReview_Helper;
	public B2B_RegistrationPage_Helper b2b_RegistrationPage_Helper;
	public B2B_SearchSuggestion_Helper b2b_SearchSuggestion_Helper;
	public B2B_SearchResult_Helper b2b_SearchResult_Helper;
	public B2B_ViewAccountPage_Helper b2b_ViewAccountPage_Helper;
	public B2B_SiteMapPage_Helper b2b_SiteMapPage_Helper;
	public PageNotFound_Helper pageNotFound_Helper;
	public Enterprise_And_EntertainmentHelper enterprise_And_entertainmentHelper;
	public Creation_HomePage_Helper creation_HomePage_Helper;
	public LifeStyle_HomePage_Helper lifestyle_HomePage;
	public B2B_ProductDetailPage_Helper b2b_ProductDetailPage_Helper;
	public Install_Page_Helper install_Page_Helper;
    public Live_Page_Helper live_Page_helper;
    public Production_Page_Helper production_Page_Helper;
    public MusicInstrument_Page_Helper  musicInstrument_Page_Helper;
    public SHMCP_2054_Helper shmcp_2054_helper;
    public B2B_PlaceOrder_SingleProduct_Helper b2b_PlaceOrder_SingleProduct_Helper;
    public B2B_OrderDetailPage_Helper b2b_OrderDetailPage_Helper;
    public B2B_StoreAccountPopup_Helper b2b_StoreAccountPopup_Helper;
    public B2B_ForgotPasswordPage_Helper b2b_ForgotPasswordPage_Helper;
    public B2B_ForgotMusicId_Helper b2b_ForgotMusicId_Helper;
    public B2B_QuickViewCartBox_Helper b2b_QuickViewCartBox_Helper;
    public B2B_CheckOutPage_Helper b2b_CheckoutPage_helper;
    public B2B_SignInPage_Helper b2b_SignInPage_Helper;
    public Midas_OurStory_Helper MIDAS_OurStory_Helper;
    public Midas_OurStory1970_Helper MIDAS_OurStory1970_Helper;
    public Midas_OurStory1971_Helper MIDAS_OurStory1971_Helper;
    public Midas_OurStory1974_Helper MIDAS_OurStory1974_Helper;
    public Midas_OurStory1980_Helper MIDAS_OurStory1980_Helper;
    public Midas_OurStory1986_Helper MIDAS_OurStory1986_Helper;
    public Midas_OurStory1987_Helper MIDAS_OurStory1987_Helper;
    public Midas_OurStory1990_Helper MIDAS_OurStory1990_Helper;
    public Midas_OurStory1995_Helper MIDAS_OurStory1995_Helper;
    public Midas_OurStory1996_Helper MIDAS_OurStory1996_Helper;
    public Midas_OurStory1998_Helper MIDAS_OurStory1998_Helper;
    public Midas_OurStory2002_Helper MIDAS_OurStory2002_Helper;
    public Midas_OurStory2003_Helper MIDAS_OurStory2003_Helper;
    public Midas_OurStory2004_Helper MIDAS_OurStory2004_Helper;
    public Midas_OurStory2006_Helper MIDAS_OurStory2006_Helper;
    public Midas_OurStory2008_Helper MIDAS_OurStory2008_Helper;
    public Midas_OurStory2011_Helper MIDAS_OurStory2011_Helper;
    public Midas_OurStory2014_Helper MIDAS_OurStory2014_Helper;
    public Midas_OurStory2009_Helper MIDAS_OurStory2009_Helper;
    public NoResultPage_Helper noresultpage_Helper;
    public Unified_SearchSuggestionPopup_Helper unified_SearchSuggestionPopup_Helper;
    public Unified_OrderSparePartsHelper unified_OrderSparePartsHelper;
    public MG_UnifiedBrandPage_Helper mg_UnifiedBrandPage_Helper;
    public B2B_HourlyCheck_Helper b2b_HourlyCheck_Helper;
    public B2B_InActiveAccount_Helper b2b_InActiveAccount_Helper;
    public B2B_ChangePassword_Helper b2b_ChangePassword_Helper;
    public MG_Career_Helper mg_Career_Helper;
    public WhatWeDo_LosAngelesCareers_Helper WHATWeDo_LosAngeles;
    public WhatWeDo_LasVegasCareers_Helper WHATWeDo_LasVegas;
    public WhatWeDo_ZhongshanCareers_Helper WHATWeDo_Zhongshan;
    public MidasTraining_OnlineTutorial_Helper MIDASTraining_OnlineTutorial_Helper;
    public BuyNow_StoreLocation_Helper BUYNOW_StoreLocation_Helper;
    public JoinUS_WhatWeDo_Helper JOINUS_WhatWeDo_Helper;
    public JoinUS_HowWeLive_Helper JOINUS_HowWeLive_Helper;
    public MidasTraining_Schedule_Helper MIDASTraining3_Schedule_Helper;
    public Midas_BecomePartner_helper MIDAS_Become_Helper;
    public Klarkteknik_BecomePartner_Helper KLARK_Become_Helper;
    public TurboSound_BecomePartner_Helper TURBOSOUND_Become_Helper;
	public VerifyB2BAdd_DeleteItemCart_Helper Add_DeleteItem_Helper;
	public VerifyB2B_CopyCart_Helper CopyCart_Helper;
	public VerifyB2B_DownloadProductList_Helper DownloadList_Helper;
	public VerifyB2B_UploadProductList_Helper UploadList_Helper;
	public VerifyB2B_OrderHistoryDownload_Helper DownloadOrder_Helper;
	public VerifyB2B_OrderHistoryUpdate_Helper OrderHistoryUpdate_Helper;
	public PerformanceInstalled_Helper PerformanceInstall_Helper;
	public UnifiedSupport_Brands_Helper UnifiedGlobalSupport_Helper;

	public VerifyB2BCheckoutPage_Helper Checkout_Helper;
public KlarkTeknik_OurStory1973_Helper KlarkTeknik_OURStory1973_Helper;
	public KlarkTeknik_OurStory1975_Helper KlarkTeknik_OURStory1975_Helper;
	public KlarkTeknik_OurStory1978_Helper KlarkTeknik_OURStory1978_Helper;
	public KlarkTeknik_OurStory1980_Helper KlarkTeknik_OURStory1980_Helper;
	public KlarkTeknik_OurStory1982_Helper KlarkTeknik_OURStory1982_Helper;
	public KlarkTeknik_OurStory1984_Helper KlarkTeknik_OURStory1984_Helper;
	public KlarkTeknik_OurStory1986_Helper KlarkTeknik_OURStory1986_Helper;
	public KlarkTeknik_OurStory1987_Helper KlarkTeknik_OURStory1987_Helper;
	public KlarkTeknik_OurStory1990_Helper KlarkTeknik_OURStory1990_Helper;
	public klarkTeknik_OurStory1993_Helper KlarkTeknik_OURStory1993_Helper;
	public KlarkTeknik_OurStory1996_Helper KlarkTeknik_OURStory1996_Helper;
	public KlarkTeknik_OurStory2000_Helper KlarkTeknik_OURStory2000_Helper;
	public KlarkTeknik_OurStory2001_Helper KlarkTeknik_OURStory2001_Helper;
	public KlarkTeknik_OurStory2003_Helper KlarkTeknik_OURStory2003_Helper;
	public KlarkTeknik_OurStory2005_Helper KlarkTeknik_OURStory2005_Helper;
	public KlarkTeknik_OurStory2009_Helper KlarkTeknik_OURStory2009_Helper;
	public KlarkTeknik_OurStory2011_Helper KlarkTeknik_OURStory2011_Helper;
	public KlarkTeknik_OurStory2014_Helper KlarkTeknik_OURStory2014_Helper;
	public TurboSound_OurStory1970_Helper TS_OurStory1970_Helper; 
	public TurboSound_OurStory1973_Helper TS_OurStory1973_Helper;
	public TurboSound_OurStory1978_Helper TS_OurStory1978_Helper;
	public TurboSound_OurStory1980_Helper TS_OurStory1980_Helper;
	public TurboSound_OurStory1982_Helper TS_OurStory1982_Helper;
	public TurboSound_OurStory1986_Helper TS_OurStory1986_Helper;
	
	
	public Behringer_OurStory1961_Helper Behringer_OURStory1961_Helper;
	public Behringer_OurStory1977_Helper Behringer_OURStory1977_Helper;
	public Behringer_OurStory1988_Helper Behringer_OURStory1988_Helper;
	public Behringer_OurStory1990_Helper Behringer_OURStory1990_Helper;
	public Behringer_OurStory1991_Helper Behringer_OURStory1991_Helper;
	public Behringer_OurStory1992_Helper Behringer_OURStory1992_Helper;
	public Behringer_OurStory2014_Helper Behringer_OURStory2014_Helper;
	public Behinger_OurStory2013_Helper Behringer_OURStory2013_Helper;
	public Behringer_OurStory2012_Helper Behringer_OURStory2012_Helper;
	public Behringer_OurStory2011_Helper Behringer_OURStory2011_Helper;
	public Behringer_OurStory2010_Helper Behringer_OURStory2010_Helper;
	public Behringer_OurStory2009_Helper Behringer_OURStory2009_Helper;
	public Behringer_OurStory2007_Helper Behringer_OURStory2007_Helper;
	public Bugera_OurStory_Helper Bugera_OURSTORY_Helper;


	//Initialize objects
	public PropertyReader propertyReader = new PropertyReader();
	//Declare variables
	public String URL = propertyReader.readApplicationFile("URL");
	public String browser_Type1 = propertyReader.readApplicationFile("Browser_Type");
	public Browser_Type browser_Type = Browser_Type.valueOf(browser_Type1);
    
    enum Browser_Type 
    {
    	Firefox, IE, Chrome, Safari;
    }    
    
	@BeforeClass
	public void setUp()
	{
	//	String chromeDriverPath= System.getProperty("user.dir")+"/chromedriver";
        switch(browser_Type)
        {
        
            case Firefox:
                driver = new FirefoxDriver();
                break;
            case IE:
                driver = new InternetExplorerDriver(); ;
                break;
            case Chrome:
			String Root_Path = System.getProperty("user.dir");
			//System.out.println(chromeDriverPath);
            	//System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            	  ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
                break;
            case Safari:
                driver = new SafariDriver();
                break;
            default:
                driver = new FirefoxDriver();
                break;
            	
            		  
            		 
            		  //Set the required properties to instantiate Chrome driver. Place any latest Chromedriver.exe files under Drivers folder
        }
       
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //maximize window
		driver.manage().window().maximize();
		//Delete cookies
		driver.manage().deleteAllCookies();		
		driver.navigate().to(URL);
		
		System.out.println("Launched base URL");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(driver.toString().contains("null"))
			{

			System.out.print("All Browser windows are closed ");
			}
		else
			{
				String Value=driver.toString();
				
				System.out.println("Value"+Value);
				String Msg=driver.getCurrentUrl();
				System.out.println("Current URL is"+Msg);
			//open a new Browser
			} 
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser Closed");

	}
	
	public WebDriver getWebDriver()
	{
		return driver;
	}
	
	public void closeWindowByJS(WebDriver driver) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    String script = "window.close();";
	    js.executeScript(script);
	}
	
	//capturing screenshot 
	public void captureScreenshot(String fileName) {
		try {
			String screenshotName = this.getFileName(fileName);
			String dirName = this.getDirectoryName(fileName);
			FileOutputStream out = new FileOutputStream("screenshots//" + dirName +"//" + screenshotName + ".jpg");
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();
			String path = getPath();
			String  screen = "file://"+path+"/screenshots/" + dirName +"//" +screenshotName + ".jpg";
			Reporter.log("<a href= '"+screen+  "'target='_blank' >" + screenshotName + "</a>");
		} catch (Exception e) {

		}
	}
	
	//Creating file name
	public  String getFileName(String file){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();		 
		String fileName = file+dateFormat.format(cal.getTime());
		return fileName;
	}
	
	//Creating directory 
	public  String getDirectoryName(String dirName)
	{
		String path = getPath();
		String s=path+"//screenshots//" + dirName +"";
		File theDir = new File(s);
		// if the directory does not exist, create it
		if (!theDir.exists()) 
		{
		    boolean result = false;
		    try{
		        theDir.mkdir();
		        result = true;
		    } 
		    catch(SecurityException se){
		        //handle it
		    }        
		    if(result) {    
		        System.out.println("DIR created");  
		    }
		}
		return dirName;
	}
	
	//Get absolute path
	public String getPath()
	{
		String path ="";		
		File file = new File("");
		String absolutePathOfFirstFile = file.getAbsolutePath();
		path = absolutePathOfFirstFile.replaceAll("\\\\+", "/");		
		return path;
	}

	//Get absolute path
	public String getPathUpload()
	{
		String path ="";		
		File file = new File("");
		String absolutePathOfFirstFile = file.getAbsolutePath();
		path = absolutePathOfFirstFile.replaceAll("/", "//");		
		return path;
	}
	
	//inner class for Login thread    
    public class LoginWindow implements Runnable 
    {

	        @Override
	        public void run() {
	            try {
	                login();
	            } catch (Exception ex) {
	                System.out.println("Error in Login Thread: " + ex.getMessage());
	            }
	        }//run close

	        public void login() throws Exception 
	        {

	            //wait - increase this wait period if required
	            Thread.sleep(20000);

	            //create robot for keyboard operations
	            Robot rb = new Robot();

	            //Enter user name by ctrl-v
	            StringSelection username = new StringSelection("surya.kant");
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);            
	            rb.keyPress(KeyEvent.VK_CONTROL);
	            rb.keyPress(KeyEvent.VK_V);
	            System.out.println("username provided");
	            rb.keyRelease(KeyEvent.VK_V);
	            rb.keyRelease(KeyEvent.VK_CONTROL);

	            //tab to password entry field
	            rb.keyPress(KeyEvent.VK_TAB);
	            rb.keyRelease(KeyEvent.VK_TAB);
	            Thread.sleep(3000);

	            //Enter password by ctrl-v
	            StringSelection pwd = new StringSelection("360Logica8932");
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
	            rb.keyPress(KeyEvent.VK_CONTROL);
	            rb.keyPress(KeyEvent.VK_V);
	            
	            rb.keyRelease(KeyEvent.VK_V);
	            rb.keyRelease(KeyEvent.VK_CONTROL);

	            //press enter
	            rb.keyPress(KeyEvent.VK_ENTER);
	            rb.keyRelease(KeyEvent.VK_ENTER);

	            //wait
	            Thread.sleep(5000);
	        }//login close                        
	    }// class close
		
		//Get random integer
	public String getRandomInteger(){
//		 Random aRandom = new  Random();
//	    if ( aStart > aEnd ) {
//	      throw new IllegalArgumentException("Start cannot exceed End.");
//	    }
//	    //get the range, casting to long to avoid overflow problems
//	    long range = (long)aEnd - (long)aStart + 1;
//	    // compute a fraction of the range, 0 <= frac < range
//	    long fraction = (long)(range * aRandom.nextDouble());
//	    int randomNumber =  (int)(fraction + aStart);    
//	    return randomNumber;
	    
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyyhmmss");
	    String formattedDate = sdf.format(date);
	    System.out.println("Reference ID: " +formattedDate);
	    return formattedDate;
	}
	
  }
