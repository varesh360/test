					package test.java.com.MusicGroup.pagehelper;
					import org.openqa.selenium.WebDriver;
					import org.testng.Assert;
					
					import test.java.com.MusicGroup.locators.LocatorReader;
					import test.java.com.MusicGroup.util.DriverHelper;
					
					public class BuyNow_StoreLocation_Helper extends DriverHelper {
						
						private LocatorReader locatorReader;	
						public BuyNow_StoreLocation_Helper(WebDriver driver){
							super(driver);
							locatorReader = new LocatorReader("BuyNow_StoreLocation.xml");
					}
					
					public void ClickOnSupport()
					{
						
						String locator = locatorReader.getLocator("OurStory.ClickonSupport");
						this.WaitForElementEnabled(locator, 50);
					
						clickOn(locator);
					}
					
					public void ClickOnBrand()
					{
						
						String locator = locatorReader.getLocator("OurStory.ClickBrand");
						this.WaitForElementEnabled(locator, 50);
						
						clickOn(locator);
						
						
					}
					
					public void ClickOnApply()
					{
						String locator = locatorReader.getLocator("OurStory.MenuIcon");
						this.WaitForElementEnabled(locator, 50);
						
						clickOn(locator);
					}
					public void ClickOnStoreLocation()
					{
						String locator = locatorReader.getLocator("OurStory.ClickOnStoreLocation");
						this.WaitForElementEnabled(locator, 50);
						
						clickOn(locator);
					}
					
					public void ClickOnDrivingDirection()
					{
						String locator = locatorReader.getLocator("OurStory.ClickOnDriveDirectionMap");
						this.WaitForElementEnabled(locator, 50);
						
						clickOn(locator);
					}
					
					public void checkPageNotFound()
					{
						String actualTitle1 = driver.getTitle();
						System.out.println("Get Titile"+ actualTitle1);
					String expectedTitle1 = "Not Found | MUSIC Group";
						Assert.assertFalse(actualTitle1==expectedTitle1);
					
						
					}
					
					//Reach Upto Store Location Page
					 public void ReachUptoStoreLocationPage()
					    {
					    	//Click on Support Button
					this.ClickOnSupport();
					//Click on Brand
					this.ClickOnBrand();
					//Click on Apply Now Button
					this.ClickOnApply();
					//Click on StoreLocationPage
					this.ClickOnStoreLocation();
					//Click on DrivingDirectionandMap
					this.ClickOnDrivingDirection();
					//Check Page not Found
						this.checkPageNotFound();
					}
					//Verify Midas Training Schedule page
					public void VerifyBrandStoreLocationPage(String VSpace1height,String textspace1height, String textspace9height, String vSpace9height, String vspace15Height,String ImageHeight,String ImageWidth,String vTextSpace8, String TextSpace13Height, String Gutter28Width){
						ReachUptoStoreLocationPage();
						
						int count = 0;
						//Verify vSpace1 in header has the height of 70px
					try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeaderHeight");
					String margin_top = this.getCSS(locator, "margin-top");
					
					System.out.println("Actual result" + margin_top);
					Assert.assertEquals(VSpace1height, margin_top);
					}
					
					catch (Exception ex) {
						System.out.println("Store Location vSpace1Height Exception>>Expected:70px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Store Location vSpace1Height Error>>Expected:70px");
						count = count + 1;
					}
					//Verify TextSpace1 Below Store Text has the height of 35px
					
					try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightBelowStore");
					String margin_top = this.getCSS(locator, "margin-top");
					String font_size = this.getCSS(locator, "font-size");
					String line_height = this.getCSS(locator, "line-height");
					
					// Substring: To remove pixel(px text) from value
					String margin_top_wopx = margin_top.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
					int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("1");
					
					int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel;
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					
						Assert.assertEquals(textspace1height, Totalpixelvaluewithpixel);
					}
					
					catch (Exception ex) {
						System.out.println("Store Location vSpace1Height Exception>>Expected Margin Top:70px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Store Location vSpace1Height Error>>Expected Width:70px");
						count = count + 1;
					}
					
					//Verify TextSpace10 Below StoreName has the height of 25px
					try {
						
					String locator = locatorReader.getLocator("VerifyPixels.vTextSpace1HeightBelowStore");
					String margin_bottom = this.getCSS(locator, "margin-bottom");
					String locator1 = locatorReader.getLocator("VerifyPixels.VtextSpace10HeightBelowName");
					
					String font_size = this.getCSS(locator1, "font-size");
					String line_height = this.getCSS(locator1, "line-height");
					
					// Substring: To remove pixel(px text) from value
					String margin_bottom_wopx = margin_bottom.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
					int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("1");
					
					int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel;
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					
						Assert.assertEquals(vspace15Height, Totalpixelvaluewithpixel);
					}
					
					catch (Exception ex) {
						System.out.println("Store Location vspace15Height Exception>>Expected:25px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Store Location vspace15Height Error>>Expected:25px");
						count = count + 1;
					}
					
					//Verify TextSpace9 in Address has the height of 8px
					try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vTextSpace9HeightStreetAddress");
					String font_size = this.getCSS(locator, "font-size");
					String line_height = this.getCSS(locator, "line-height");
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace9HeightCountryAddress");
					
					String font_size_1 = this.getCSS(locator1, "font-size");
					String line_height_1 = this.getCSS(locator1, "line-height");
					
					// Substring: To remove pixel(px text) from value
					
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
					
					String font_size_1_wopx = font_size_1.substring(0, 2);
					String line_height_1_wopx = line_height_1.substring(0, 2);
					
					int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("1");
					int getsubpixel_1=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);
					
					int Totaladdedpixel = getsubpixel_1+ getsubpixel+Integer.parseInt("1");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					
						Assert.assertEquals(textspace9height, Totalpixelvaluewithpixel);
					}
					
					catch (Exception ex) {
						System.out.println("Store Location textspace9height Exception>>Expected:8px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Store Location textspace9height Error>>Expected:8px");
						count = count + 1;
					}
					
					//Verify TextSpace10 Above back button has the height of 25px
					try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vTextSpace10HeightAboveBack");
					String font_size = this.getCSS(locator, "font-size");
					String line_height = this.getCSS(locator, "line-height");
					String locator2 = locatorReader.getLocator("VerifyPixels.vTextSpace10HeightAboveBack1");
					String line_height_2 = this.getCSS(locator2, "line-height");
					String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace10HeightBack");
					
					String font_size_1 = this.getCSS(locator1, "font-size");
					String line_height_1 = this.getCSS(locator1, "line-height");
					
					// Substring: To remove pixel(px text) from value
					
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);
					
					String font_size_1_wopx = font_size_1.substring(0, 2);
					String line_height_1_wopx = line_height_1.substring(0, 2);
					
					
					
					
					String line_height_2_wopx = line_height_2.substring(0, 2);
					
					int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt(line_height_2_wopx);
					int getsubpixel_1=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);
					
					int Totaladdedpixel = getsubpixel_1+ getsubpixel+Integer.parseInt("2");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
					
						Assert.assertEquals(vspace15Height, Totalpixelvaluewithpixel);
						
					}
					
					catch (Exception ex) {
						System.out.println("Store Location vspace15Height Exception>>Expected:25px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Store Location vspace15Height Error>>Expected:25px");
						count = count + 1;
					}
					
					//Verify Fixed Box Image60 has the height of 295px and width of 530px
					try {
					
					String locator = locatorReader.getLocator("VerifyPixels.vImageBoxImageHeightWidth");
					String height = this.getCSS(locator, "height");
					String width = this.getCSS(locator, "width");
					
					System.out.println("Actual Height" + ImageHeight);
					System.out.println("Actual Width" + ImageWidth);
						Assert.assertEquals(ImageHeight, height);
						Assert.assertEquals(ImageWidth, width);
					}
					
					catch (Exception ex) {
						System.out.println("Store Location height of 295px and width of 530px Exception>>Expected height:295px and width:530px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Store Location height of 295px and width of 530px Error>>Expected height:295px and width:530px");
						count = count + 1;
					}
						//Verify vSpace1 in Footer has the height of 70px
					try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeaderHeight");
					String padding_bottom = this.getCSS(locator, "padding-bottom");
					
					System.out.println("Actual result" + padding_bottom);
					Assert.assertEquals(VSpace1height, padding_bottom);
					}
					
					catch (Exception ex) {
						System.out.println("Store Location vSpace1Height Exception>>Expected:70px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Store Location vSpace1Height Error>>Expected:70px");
						count = count + 1;
					}
					
					//Verify vSpace15 Above another store has the height of 25px
					try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vSPace15HeightAboveLocation");
					String margin_top = this.getCSS(locator, "margin-top");
					
					System.out.println("Actual result" + margin_top);
					Assert.assertEquals(vspace15Height, margin_top);
					}
					
					catch (Exception ex) {
						System.out.println("Store Location vspace15Height Exception>>Expected:25px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Store Location vspace15Height Error>>Expected:25px");
						count = count + 1;
					}
					//Verify vSpace15 Below another store has the height of 25px
					try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vSPace15HeightAboveLocation");
					String padding_bottom = this.getCSS(locator, "padding-bottom");
					
					System.out.println("Actual result" + padding_bottom);
					Assert.assertEquals(vspace15Height, padding_bottom);
					}
					
					catch (Exception ex) {
						System.out.println("Store Location vspace15Height Exception>>Expected:25px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Store Location vspace15Height Error>>Expected:25px");
						count = count + 1;
					}
					//Verify vSPace1 in Footer has the height of 70px
					try {
									
									String locator = locatorReader.getLocator("VerifyPixels.Vspace1FooterHeight");
					String padding_bottom = this.getCSS(locator, "margin-bottom");
					
					System.out.println("Actual result" + padding_bottom);
								Assert.assertEquals(VSpace1height, padding_bottom);
								}
					
					catch (Exception ex) {
						System.out.println("Store Location vSpace1Height Exception>>Expected:70px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Store Location vSpace1Height Error>>Expected:70px");
						count = count + 1;
					}
							
							System.out.println("count value is :::" + count);
									Assert.assertTrue(count==0);	
					}
					}
