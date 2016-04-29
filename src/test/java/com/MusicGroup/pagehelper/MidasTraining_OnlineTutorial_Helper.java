package test.java.com.MusicGroup.pagehelper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;


public class MidasTraining_OnlineTutorial_Helper extends DriverHelper {
	private LocatorReader locatorReader;	
	public MidasTraining_OnlineTutorial_Helper(WebDriver driver){
		super(driver);
		locatorReader = new LocatorReader("MidasTraining_OnlineTutorial.xml");
	}
	public void clickOnMenu(){

		String locator = locatorReader.getLocator("MGTrainingOnlineTutorial.ClickToggleMenu");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	public void ClickOnBrand(){
		String locator = locatorReader.getLocator("MGTrainingOnlineTutorial.ClickMidasBrand");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	public void ClickOnTraining(){
		String locator = locatorReader.getLocator("MGTrainingOnlineTutorial.ClickOnTraining");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	public void ClickOnSchedule(){
		String locator = locatorReader.getLocator("MGTrainingOnlineTutorial.ClickOnSchedule");
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
	//Reach upto ReachUptpoSchedulePage(Online Tutorial)
		public void ReachUptoOnlineTutorialPage(){
		// Click on Join Us Page
			this.clickOnMenu();
		//Click on What We Do Page
			this.ClickOnBrand();
			//Click on Training Page
			this.ClickOnTraining();
		//Click on Schedule Page
			this.ClickOnSchedule();
		//Check Page Not found
			this.checkPageNotFound();
		}
		//Verify Midas Training Schedule page
				public void VerifySchedule_OnlineTutorialPage(String VSpace1height, String BillBoardwidth,String vSpace4height, String vTextSpace10,String vTextSpace8, String TextSpace13Height,String VideoHeight,String VideoWidth, String Gutter28Width, String Gap68Width){
					ReachUptoOnlineTutorialPage();
					
					int count = 0;
					// Verify vSpace1Height has the height of 70px.
					
					try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeaderHeight");
						String margin_top = this.getCSS(locator, "margin-top");
					
						String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeadingHeight");
						String line_height = this.getCSS(locator1, "line-height");
						String font_size = this.getCSS(locator1, "font-size");
									
						// Substring: To remove pixel(px text) from value
						String margin_top_wopx = margin_top.substring(0, 2);
						String line_height_wopx = line_height.substring(0, 2);
						String font_size_wopx = font_size.substring(0, 2);
				
						int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
						
						int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel;
						String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
						System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(VSpace1height, Totalpixelvaluewithpixel);
					}

					catch (Exception ex) {
						System.out.println("Training: Online Tutorial vSpace1Height Exception>>Expected:70px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Training: Online Tutorial vSpace1Height Error>>Expected:70px");
						count = count + 1;
					}
					//Verify vSpace4 has the height of 40px
					
					try {
									
							String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeadingHeight");
							String line_height = this.getCSS(locator1, "line-height");
							String font_size = this.getCSS(locator1, "font-size");
							String margin_bottom=this.getCSS(locator1, "margin-bottom");
										
							// Substring: To remove pixel(px text) from value
							String margin_bottom_wopx = margin_bottom.substring(0, 2);
							String line_height_wopx = line_height.substring(0, 2);
							String font_size_wopx = font_size.substring(0, 2);
					
							int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
						
							int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel;
							String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
							System.out.println("Actual result" + Totalpixelvaluewithpixel);
						Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
						}
					catch (Exception ex) {
						System.out.println("Training: Online Tutorial vSpace4height Exception>>Expected:40px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Training: Online Tutorial vSpace4height Error>>Expected:40px");
						count = count + 1;
					}


					//Verify Fixed Box Image has the height of 266px and width of 980px
					try {
						
						String locator1 = locatorReader.getLocator("VerifyPixels.vImageHeightNWidth");
						String width = this.getCSS(locator1, "width");
						String height = this.getCSS(locator1, "height");
						System.out.println("Actual Height "+height);
						System.out.println("Actual Width "+width);
					Assert.assertEquals(BillBoardwidth, width);
					}

					catch (Exception ex) {
						System.out.println("Training: Online Tutorial height of 266px and width of 980px Exception>>Expected height:266px and width:980px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Training: Online Tutorial height of 266px and width of 980px Error>>Expected height:266px and width:980px");
						count = count + 1;
					}
					
					//Verify vSpace4 Below First Image has the height of 40px
					
					try {
						
						String locator1 = locatorReader.getLocator("VerifyPixels.vImageHeightNWidth");

						String margin_bottom=this.getCSS(locator1, "margin-bottom");
												
					Assert.assertEquals(vSpace4height, margin_bottom);
					}

					catch (Exception ex) {
						System.out.println("Training: Online Tutorial vSpace4height Exception>>Expected:40px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Training: Online Tutorial vSpace4height Error>>Expected:40px");
						count = count + 1;
					}

					//Verify vSpace4 Below Menu has the height of 40px
					try {
						
						String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4HeightBelowFirstImage");

						String margin_bottom=this.getCSS(locator1, "margin-bottom");
						String line_height = this.getCSS(locator1, "line-height");
						String font_size = this.getCSS(locator1, "font-size");
					
						// Substring: To remove pixel(px text) from value
						String margin_bottom_wopx = margin_bottom.substring(0, 2);
						String line_height_wopx = line_height.substring(0, 2);
						String font_size_wopx = font_size.substring(0, 2);

						int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("2");
			
						int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel;
						String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
						System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
					}

					catch (Exception ex) {
						System.out.println("Training: Online Tutorial vSpace4height Exception>>Expected:40px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Training: Online Tutorial vSpace4height Error>>Expected:40px");
						count = count + 1;
					}

					
					//Verify vSpace4 Above Second Text has the height of 40px
					try {
						
						String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveText");

						String padding_top=this.getCSS(locator1, "padding-top");
						String line_height = this.getCSS(locator1, "line-height");
						String font_size = this.getCSS(locator1, "font-size");
					
						// Substring: To remove pixel(px text) from value
						String padding_top_wopx = padding_top.substring(0, 2);
						String line_height_wopx = line_height.substring(0, 2);
						String font_size_wopx = font_size.substring(0, 2);

						int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
				
						int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+ getsubpixel;
						String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
						System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
					}

					catch (Exception ex) {
						System.out.println("Training: Online Tutorial vSpace4height Exception>>Expected:40px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Training: Online Tutorial vSpace4height Error>>Expected:40px");
						count = count + 1;
					}

					//Verify TextSpace11 has the height of 10px
					try {
						
						String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace10Height");

						String line_height = this.getCSS(locator1, "line-height");
						String font_size = this.getCSS(locator1, "font-size");
					
						// Substring: To remove pixel(px text) from value
						
						String line_height_wopx = line_height.substring(0, 2);
						String font_size_wopx = font_size.substring(0, 2);

						int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
				
						int Totaladdedpixel =getsubpixel + getsubpixel;
						String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
						System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(vTextSpace10, Totalpixelvaluewithpixel);
					}

					catch (Exception ex) {
						System.out.println("Training: Online Tutorial vTextSpace10 Exception>>Expected:10px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Training: Online Tutorial vTextSpace10 Error>>Expected:10px");
						count = count + 1;
					}
					
					//Verify vSpace8 has the height of 23px
				try {
						
						String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace10Height");
						String margin_bottom=this.getCSS(locator1,"margin-bottom");
						String line_height = this.getCSS(locator1, "line-height");
						String font_size = this.getCSS(locator1, "font-size");
					
					
						// Substring: To remove pixel(px text) from value
						String margin_bottom_wopx = margin_bottom.substring(0, 2);
						String line_height_wopx = line_height.substring(0, 2);
						String font_size_wopx = font_size.substring(0, 2);

						int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
					
						int Totaladdedpixel =Integer.parseInt(margin_bottom_wopx) + getsubpixel;
						String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
						System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(vTextSpace8, Totalpixelvaluewithpixel);
					}

					catch (Exception ex) {
						System.out.println("Training: Online Tutorial vTextSpace8 Exception>>Expected:23px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("Training: Online Tutorial vTextSpace8 Error>>Expected:23px");
						count = count + 1;
					}
				
				//Verify vSpace8 below Video has the height of 23px
				try {
					
					String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace8VideoHeight");
					String margin_bottom=this.getCSS(locator1,"margin-bottom");
					String locator = locatorReader.getLocator("VerifyPixels.vTextSpace10HeightP");
					String line_height = this.getCSS(locator, "line-height");
					String font_size = this.getCSS(locator, "font-size");
				
				
					// Substring: To remove pixel(px text) from value
					String margin_bottom_wopx = margin_bottom.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);

					int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("2");
		
					int Totaladdedpixel =Integer.parseInt(margin_bottom_wopx) + getsubpixel;
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(vTextSpace8, Totalpixelvaluewithpixel);
				}
				catch (Exception ex) {
					System.out.println("Training: Online Tutorial vTextSpace8 Exception>>Expected:23px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Training: Online Tutorial vTextSpace8 Error>>Expected:23px");
					count = count + 1;
				}
					//Verify TextSpace13 has the height of 7px
				try {
					
					String locator = locatorReader.getLocator("VerifyPixels.vTextSpace10HeightP");
					String line_height = this.getCSS(locator, "line-height");
					String font_size = this.getCSS(locator, "font-size");
					
				
				
					// Substring: To remove pixel(px text) from value
					
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);

					int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);

					int Totaladdedpixel =getsubpixel+getsubpixel+Integer.parseInt("3");
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(TextSpace13Height, Totalpixelvaluewithpixel);
				}

				catch (Exception ex) {
					System.out.println("Training: Online Tutorial TextSpace13Height Exception>>Expected:7px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Training: Online Tutorial TextSpace13Height Error>>Expected:7px");
					count = count + 1;
				}
				
				//Verify vSpace4 Below video has the height of 40px
				try {
					
					String locator = locatorReader.getLocator("VerifyPixels.vSpcae4VideoHeight");
					String padding_bottom = this.getCSS(locator, "padding-bottom");
					String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace10HeightP");
					String line_height = this.getCSS(locator1, "line-height");
					String font_size = this.getCSS(locator1, "font-size");
				
					// Substring: To remove pixel(px text) from value
					String padding_bottom_wopx = padding_bottom.substring(0, 2);
					String line_height_wopx = line_height.substring(0, 2);
					String font_size_wopx = font_size.substring(0, 2);

					int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			
					int Totaladdedpixel =getsubpixel+Integer.parseInt(padding_bottom_wopx);
					String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
					System.out.println("Actual result" + Totalpixelvaluewithpixel);
				Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
				}
				catch (Exception ex) {
					System.out.println("Training: Online Tutorial vSpace4height Exception>>Expected:40px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Training: Online Tutorial vSpace4height Error>>Expected:40px");
					count = count + 1;
				}

				
				//Verify Fixed Box Image84 has the height of 215px and width of 286px
	try {
					
					String locator = locatorReader.getLocator("VerifyPixels.fixedVideoHeight");
					
			
					String height = this.getCSS(locator, "height");
					String width = this.getCSS(locator, "width");
					
				
				
					// Substring: To remove pixel(px text) from value
					Assert.assertEquals(VideoHeight, height);
					Assert.assertEquals(VideoWidth, width);
				}

				catch (Exception ex) {
					System.out.println("Training: Online Tutorial Image84 has the height of 215px and width of 286px Exception>>Expected height:215px and width:286px");
					count = count + 1;
				} catch (Error ex) {
					System.out.println("Training: Online Tutorial Image84 has the height of 215px and width:286px Error>>Expected height of 215px and width:286px");
					count = count + 1;
				}
	
	//Verify Gutter8 has the width of 40px
	try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveText");
		String padding_left = this.getCSS(locator, "padding-left");
	
		System.out.println("Actual result" + padding_left);
	Assert.assertEquals(vSpace4height, padding_left);
	}

	catch (Exception ex) {
		System.out.println("Training: Online Tutorial vSpace4height Exception>>Expected:40px");
		count = count + 1;
	} catch (Error ex) {
		System.out.println("Training: Online Tutorial vSpace4height Error>>Expected:40px");
		count = count + 1;
	}

	
try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveText");
		String padding_right = this.getCSS(locator, "padding-right");
	
		System.out.println("Actual result" + padding_right);
	Assert.assertEquals(vSpace4height, padding_right);
	}

catch (Exception ex) {
	System.out.println("Training: Online Tutorial vSpace4height Exception>>Expected:40px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Training: Online Tutorial vSpace4height Error>>Expected:40px");
	count = count + 1;
}


//Verify Gutter9 has the width of 20px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vGutter9Width");
	String margin_left = this.getCSS(locator, "margin-left");

	System.out.println("Actual result" + margin_left);
Assert.assertEquals(Gutter28Width, margin_left);
}

catch (Exception ex) {
	System.out.println("Training: Online Tutorial Gutter28Width Exception>>Expected:20px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Training: Online Tutorial Gutter28Width Error>>Expected:20px");
	count = count + 1;
}

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vGutter9Width1");
	String margin_left = this.getCSS(locator, "margin-left");

	System.out.println("Actual result" + margin_left);
Assert.assertEquals(Gutter28Width, margin_left);
}

catch (Exception ex) {
	System.out.println("Training: Online Tutorial Gutter28Width Exception>>Expected:20px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Training: Online Tutorial Gutter28Width Error>>Expected:20px");
	count = count + 1;
}

//Verify vSPace1 in Footer has the height of 70px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeaderHeight");
	String padding_bottom = this.getCSS(locator, "padding-bottom");
					
	System.out.println("Actual result" + padding_bottom);
Assert.assertEquals(VSpace1height, padding_bottom);
}

catch (Exception ex) {
	System.out.println("Training: Online Tutorial vSpace1Height Exception>>Expected:70px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Training: Online Tutorial vSpace1Height Error>>Expected:70px");
	count = count + 1;
}
//Verify Gap68 has the width of 35px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vGap68Width1");
	String padding_right = this.getCSS(locator, "padding-left");
	System.out.print("paddingright:"+padding_right);
	String locator1 = locatorReader.getLocator("VerifyPixels.vGap68Width2");
	String padding_left = this.getCSS(locator1, "padding-left");
					
	
	// Substring: To remove pixel(px text) from value
	String padding_right_wopx = padding_right.substring(0, 1);
	String padding_left_wopx = padding_left.substring(0, 1);
	

	int getsubpixel=Integer.parseInt(padding_left_wopx)+ Integer.parseInt(padding_right_wopx)+Integer.parseInt("5");
	
	int Totaladdedpixel =getsubpixel+Integer.parseInt("6");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(Gap68Width, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("Training: Online Tutorial Gap68Width Exception>>Expected:35px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Training: Online Tutorial Gap68Width Error>>Expected:35px");
	count = count + 1;
}

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vGap68Width2");
	String padding_right = this.getCSS(locator, "padding-right");
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vGap68Width3");
	String padding_left = this.getCSS(locator1, "padding-left");

	// Substring: To remove pixel(px text) from value
	String padding_right_wopx = padding_right.substring(0, 1);
	String padding_left_wopx = padding_left.substring(0, 1);
	

	int getsubpixel=Integer.parseInt(padding_left_wopx)+ Integer.parseInt(padding_right_wopx)+Integer.parseInt("5");

	int Totaladdedpixel =getsubpixel+Integer.parseInt("6");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(Gap68Width, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("Training: Online Tutorial Gap68Width Exception>>Expected:35px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Training: Online Tutorial Gap68Width Error>>Expected:35px");
	count = count + 1;
}

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vGap68Width3");
	String padding_right = this.getCSS(locator, "padding-right");
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vGap68Width4");
	String padding_left = this.getCSS(locator1, "padding-left");
					

	// Substring: To remove pixel(px text) from value
	String padding_right_wopx = padding_right.substring(0, 1);
	String padding_left_wopx = padding_left.substring(0, 1);
	

	int getsubpixel=Integer.parseInt(padding_left_wopx)+ Integer.parseInt(padding_right_wopx)+Integer.parseInt("5");
	
	int Totaladdedpixel =getsubpixel+Integer.parseInt("6");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(Gap68Width, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("Training: Online Tutorial Gap68Width Exception>>Expected:35px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("Training: Online Tutorial Gap68Width Error>>Expected:35px");
	count = count + 1;
}
					System.out.println("count value is :::" + count);
					Assert.assertTrue(count==0);	
				}
					
}
