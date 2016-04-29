package test.java.com.MusicGroup.pagehelper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;


public class JoinUS_HowWeLive_Helper extends DriverHelper {
	private LocatorReader locatorReader;	
	public JoinUS_HowWeLive_Helper(WebDriver driver)
	{
		super(driver);
		locatorReader = new LocatorReader("JoinUS_HowWeLive.xml");
	
	}
	public void ClickOnJoinUS()
	{
		
		String locator = locatorReader.getLocator("OurStory.ClickonJoinUs");
		this.WaitForElementEnabled(locator, 50);
				clickOn(locator);
	}
	
	public void ClickOnHowWeLive()
	{
		
		String locator = locatorReader.getLocator("OurStory.ClickOnHowWeLive");
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
	

	
	//Reach upto ReachUptpWhatWeDoPage(Join US)
		public void ReachUptoHowWeLivePage(){
		// Click on Join Us Page
			this.ClickOnJoinUS();
		//Click on What We Do Page
			this.ClickOnHowWeLive();
		//Check Page Not found
			this.checkPageNotFound();
		}
		//Verify Buy Now page
				public void VerifyHowWeLive(String Vspace1Height, String vSpace4height, String vTextSpace5Height,String vTextSpace7Height, String TextSpaceBHeight, String vSpace8Height, String Gutter16_Width, String ImageHeight72,String ImageWidth72,String ImageWidthA,String ImageHeightA, String ImageHeight71)
					{
					ReachUptoHowWeLivePage();	
					int count = 0;
					
				//Verify VSpace 1 has the height of 70px
					try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vSpaceAboveHeightHead");				
						String margin_top = this.getCSS(locator, "padding-top");
						
						String line_height = this.getCSS(locator, "line-height");
						String font_size = this.getCSS(locator, "font-size");
									
						// Substring: To remove pixel(px text) from value
						String margin_top_wopx = margin_top.substring(0, 2);
						String line_height_wopx = line_height.substring(0, 2);
						String font_size_wopx = font_size.substring(0, 2);
				
						int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("2");
						
						int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel;
						String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
						System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
					}

					catch (Exception ex) {
						System.out.println("How We Live vSpace1Height Exception>>Expected:70px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("How We Live vSpace1Height Error>>Expected:70px");
						count = count + 1;
					}
					
					//Verify VSpace4 has the height of 40px
					try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vSPaceBelowHeightHead");				
						String margin_bottom = this.getCSS(locator, "margin-bottom");
						
						String line_height = this.getCSS(locator, "line-height");
						String font_size = this.getCSS(locator, "font-size");
									
						// Substring: To remove pixel(px text) from value
						String margin_bottom_wopx = margin_bottom.substring(0, 2);
						String line_height_wopx = line_height.substring(0, 2);
						String font_size_wopx = font_size.substring(0, 2);
				
						int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx)+Integer.parseInt("3");
						
						int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel;
						String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
						System.out.println("Actual result" + Totalpixelvaluewithpixel);
					Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
					}

					catch (Exception ex) {
						System.out.println("How We Live vSpace4height Exception>>Expected:40px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("How We Live vSpace4height Error>>Expected:40px");
						count = count + 1;
					}
					
					//Verify vSpace4Height Below Image has the height of 40px.

					try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vSPace4BelowImage");
						String margin_bottom = this.getCSS(locator, "margin-bottom");
						String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4BelowText");
						String line_height = this.getCSS(locator1, "line-height");
						String font_size = this.getCSS(locator1, "font-size");
									
						// Substring: To remove pixel(px text) from value
						String margin_bottom_wopx = margin_bottom.substring(0, 2);
						String line_height_wopx = line_height.substring(0, 2);
						String font_size_wopx = font_size.substring(0, 2);
				
						int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("1");
						int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel;
						String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
						System.out.println("Actual result" + Totalpixelvaluewithpixel);
						
					Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
					}

					catch (Exception ex) {
						System.out.println("How We Live vSpace4height Exception>>Expected:40px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("How We Live vSpace4height Error>>Expected:40px");
						count = count + 1;
					}
					//Verify TextSpace5 has the height of 13px.
					try {
								String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4BelowText");
								String line_height_1 = this.getCSS(locator1, "line-height");
								String font_size_1 = this.getCSS(locator1, "font-size");
											
								// Substring: To remove pixel(px text) from value
							
								
								String line_height1_wopx = line_height_1.substring(0, 2);
								String font_size1_wopx = font_size_1.substring(0, 2);
						
								
								int getsubpixel=Integer.parseInt(line_height1_wopx)- Integer.parseInt(font_size1_wopx);
								int Totaladdedpixel = getsubpixel+ getsubpixel+Integer.parseInt("1");
								String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
								System.out.println("Actual result" + Totalpixelvaluewithpixel);
								System.out.println("Expected result" + vTextSpace5Height);
							Assert.assertEquals(vTextSpace5Height, Totalpixelvaluewithpixel);
							}

							catch (Exception ex) {
								System.out.println("How We Live vTextSpace5Height Exception>>Expected:13px");
								count = count + 1;
							} catch (Error ex) {
								System.out.println("How We Live vTextSpace5Height Error>>Expected:13px");
								count = count + 1;
							}
						
					//Verify TextSpace7 has the height of 27px.
					try {
									
									String locator = locatorReader.getLocator("VerifyPixels.vSpace4AboveText");
									
									String line_height = this.getCSS(locator, "line-height");
									String font_size = this.getCSS(locator, "font-size");
									String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4BelowText");
									String line_height_1 = this.getCSS(locator1, "line-height");
									String font_size_1 = this.getCSS(locator1, "font-size");
									String margin_bottom = this.getCSS(locator1, "margin-bottom");
									String padding_bottom = this.getCSS(locator1, "padding-bottom");
									
												
									// Substring: To remove pixel(px text) from value
									String margin_top_wopx = margin_bottom.substring(0, 2);
									String padding_bottom_wopx = padding_bottom.substring(0, 1);
									String line_height_wopx = line_height.substring(0, 2);
									String font_size_wopx = font_size.substring(0, 2);
									String line_height1_wopx = line_height_1.substring(0, 2);
									String font_size1_wopx = font_size_1.substring(0, 2);
							
									int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
									int getsubpixel_1=Integer.parseInt(line_height1_wopx)- Integer.parseInt(font_size1_wopx);
									int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+Integer.parseInt(padding_bottom_wopx)+ getsubpixel+getsubpixel_1+Integer.parseInt("1");
									String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
									System.out.println("Actual result" + Totalpixelvaluewithpixel);
									
								Assert.assertEquals(vTextSpace7Height, Totalpixelvaluewithpixel);
								}

								catch (Exception ex) {
									System.out.println("How We Live vTextSpace7Height Exception>>Expected:27px");
									count = count + 1;
								} catch (Error ex) {
									System.out.println("How We Live vTextSpace7Height Error>>Expected:27px");
									count = count + 1;
								}
					
					
					//Verify VSpace1 Below First Text has the height of 70 px
					try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vSpace4AboveText");
						
						String line_height = this.getCSS(locator, "line-height");
						String font_size = this.getCSS(locator, "font-size");
						String margin_bottom = this.getCSS(locator, "margin-bottom");
						String padding_bottom = this.getCSS(locator, "padding-bottom");
						String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1AboveSecondHead");
						
						String margin_top = this.getCSS(locator1, "margin-top");
						
						
									
						// Substring: To remove pixel(px text) from value
						String margin_top_wopx = margin_top.substring(0, 2);
						String padding_bottom_wopx = padding_bottom.substring(0, 1);
						String line_height_wopx = line_height.substring(0, 2);
						String font_size_wopx = font_size.substring(0, 2);
						String margin_bottom_wopx = margin_bottom.substring(0, 2);
						
				
						int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
						
						int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+Integer.parseInt(padding_bottom_wopx)+ getsubpixel+Integer.parseInt(margin_bottom_wopx);
						String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
						System.out.println("Actual result" + Totalpixelvaluewithpixel);
						
					Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
					}

					catch (Exception ex) {
						System.out.println("How We Live vSpace1Height Exception>>Expected:70px");
						count = count + 1;
					} catch (Error ex) {
						System.out.println("How We Live vSpace1Height Error>>Expected:70px");
						count = count + 1;
					}
					
					//Verify VSpace1 Above Second Text has the height of 70 px
						try {
						
						String locator = locatorReader.getLocator("VerifyPixels.vSpace1SecondTextHeight");
						
						String line_height = this.getCSS(locator, "line-height");
						String font_size = this.getCSS(locator, "font-size");
						String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1AboveSecondHead");
						
						String padding_bottom = this.getCSS(locator1, "padding-bottom");
						
						
									
						// Substring: To remove pixel(px text) from value
						String padding_bottom_wopx = padding_bottom.substring(0, 2);
						
						String line_height_wopx = line_height.substring(0, 2);
						String font_size_wopx = font_size.substring(0, 2);
				
						
				
						int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
						
						int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ getsubpixel+Integer.parseInt("7");
						String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
						System.out.println("Actual result" + Totalpixelvaluewithpixel);
						
					Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
					}

						catch (Exception ex) {
							System.out.println("How We Live vSpace1Height Exception>>Expected:70px");
							count = count + 1;
						} catch (Error ex) {
							System.out.println("How We Live vSpace1Height Error>>Expected:70px");
							count = count + 1;
						}
						//Verify VSpace4 Above Second Image has the Height of 40px
						try {
							
							String locator = locatorReader.getLocator("VerifyPixels.vSpace1SecondTextHeight");
							
							String line_height = this.getCSS(locator, "line-height");
							String font_size = this.getCSS(locator, "font-size");
						
							
							String margin_bottom = this.getCSS(locator, "margin-bottom");
							
							
										
							// Substring: To remove pixel(px text) from value
							String margin_bottom_wopx = margin_bottom.substring(0, 2);
							
							String line_height_wopx = line_height.substring(0, 2);
							String font_size_wopx = font_size.substring(0, 2);
					
							
					
							int getsubpixel=Integer.parseInt(font_size_wopx)- Integer.parseInt(line_height_wopx);
							
							int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel+Integer.parseInt("3");
							String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
							System.out.println("Actual result" + Totalpixelvaluewithpixel);
							
						Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
						}

						catch (Exception ex) {
							System.out.println("How We Live vSpace4height Exception>>Expected:40px");
							count = count + 1;
						} catch (Error ex) {
							System.out.println("How We Live vSpace4height Error>>Expected:40px");
							count = count + 1;
						}
						
						
						//Verify VSpaceB Below Image has the height of 7px
							try {
							
							String locator = locatorReader.getLocator("VerifyPixels.vSPaceBImage2Height");
							
							String margin_bottom = this.getCSS(locator, "margin-bottom");
							System.out.println("Actual result" + margin_bottom);
							
							Assert.assertEquals(TextSpaceBHeight, margin_bottom);
						}

						catch (Exception ex) {
							System.out.println("How We Live TextSpaceBHeight Exception>>Expected:7px");
							count = count + 1;
						} catch (Error ex) {
							System.out.println("How We Live TextSpaceBHeight Error>>Expected:7px");
							count = count + 1;
						}
							//Verify vSpace1 Above Third Image has the height of 70px
							try {
								
								String locator = locatorReader.getLocator("VerifyPixels.vSpace1Image3Height");
								
								String margin_top = this.getCSS(locator, "margin-top");
								
								String locator1 = locatorReader.getLocator("VerifyPixels.vSPaceBImage5Height");
								
								String margin_bottom = this.getCSS(locator1, "margin-bottom");
								
								// Substring: To remove pixel(px text) from value
								String margin_bottom_wopx = margin_bottom.substring(0, 1);
								String margin_top_wopx = margin_top.substring(0, 2);
								int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(margin_top_wopx);
								String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
								System.out.println("Actual result" + Totalpixelvaluewithpixel);
								
							Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
							}

							catch (Exception ex) {
								System.out.println("How We Live vSpace1Height Exception>>Expected:70px");
								count = count + 1;
							} catch (Error ex) {
								System.out.println("How We Live vSpace1Height Error>>Expected:70px");
								count = count + 1;
							}
							
							//Verify vSpace1 Above(1) Third Image has the height of 70px
							try {
								
								String locator = locatorReader.getLocator("VerifyPixels.vSpace1MusicGroupTV");
								
								String margin_top = this.getCSS(locator, "margin-top");
								
								String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1Image3Height");
								
								String padding_bottom = this.getCSS(locator1, "padding-bottom");
								
								// Substring: To remove pixel(px text) from value
								String padding_bottom_wopx = padding_bottom.substring(0, 2);
								
								String margin_top_wopx = margin_top.substring(0, 2);
								
								
								int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(margin_top_wopx)-Integer.parseInt("3");
								String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
								System.out.println("Actual result" + Totalpixelvaluewithpixel);
								
							Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
							}

							catch (Exception ex) {
								System.out.println("How We Live vSpace1Height Exception>>Expected:70px");
								count = count + 1;
							} catch (Error ex) {
								System.out.println("How We Live vSpace1Height Error>>Expected:70px");
								count = count + 1;
							}
							
try {
								
								String locator = locatorReader.getLocator("VerifyPixels.vSpace1StreetLife");
								
								String margin_top = this.getCSS(locator, "margin-top");
								
								String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1Image3Height");
								
								String padding_bottom = this.getCSS(locator1, "padding-bottom");
								
								// Substring: To remove pixel(px text) from value
								String padding_bottom_wopx = padding_bottom.substring(0, 2);
								String margin_top_wopx = margin_top.substring(0, 2);
								
								
								int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(margin_top_wopx)-Integer.parseInt("3");
								String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
								System.out.println("Actual result" + Totalpixelvaluewithpixel);
								
							Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
							}
catch (Exception ex) {
	System.out.println("How We Live vSpace1Height Exception>>Expected:70px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live vSpace1Height Error>>Expected:70px");
	count = count + 1;
}

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vSpace1Seatle");
	
	String margin_top = this.getCSS(locator, "margin-top");
	
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1Image3Height");
	
	String padding_bottom = this.getCSS(locator1, "padding-bottom");
	
	// Substring: To remove pixel(px text) from value
	String padding_bottom_wopx = padding_bottom.substring(0, 2);
	String margin_top_wopx = margin_top.substring(0, 2);
	
	int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(margin_top_wopx)-Integer.parseInt("3");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("How We Live vSpace1Height Exception>>Expected Margin Top:70px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live vSpace1Height Error>>Expected Width:70px");
	count = count + 1;
}
				

//Verify vSpace7 Below Image has the height of 23px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vSpace1MusicGroupTV");
	
	String margin_bottom = this.getCSS(locator, "margin-bottom");

	
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	
	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("4");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}


catch (Exception ex) {
	System.out.println("How We Live vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live vSpace8Height Error>>Expected:23px");
	count = count + 1;
}
			

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vSpace1StreetLife");
	
	String margin_bottom = this.getCSS(locator, "margin-bottom");
	
	
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 2);

	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("4");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("How We Live vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live vSpace8Height Error>>Expected:23px");
	count = count + 1;
}
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vSpace1Seatle");
	
	String margin_bottom = this.getCSS(locator, "margin-bottom");
	
	
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	
	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)-Integer.parseInt("4");
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("How We Live vSpace8Height Exception>>Expected:23px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live vSpace8Height Error>>Expected:23px");
	count = count + 1;
}


//Verify Footer vSpace1 has the height of 70px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vSpace1MusicGroupTVFull");
	
	String margin_bottom = this.getCSS(locator, "margin-bottom");
	
	
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	
	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx);
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("How We Live vSpace1Height Exception>>Expected Margin Top:70px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live vSpace1Height Error>>Expected Width:70px");
	count = count + 1;
}			

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vSpace1StreetLifeFull");
	
	String margin_bottom = this.getCSS(locator, "margin-bottom");
	
	
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 2);
	
	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx);
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("How We Live vSpace1Height Exception>>Expected Margin Top:70px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live vSpace1Height Error>>Expected Width:70px");
	count = count + 1;
}			

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vSpace1SeatleFull");
	
	String margin_bottom = this.getCSS(locator, "margin-bottom");
	
	
	// Substring: To remove pixel(px text) from value
	String margin_bottom_wopx = margin_bottom.substring(0, 2);

	int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx);
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("How We Live vSpace1Height Exception>>Expected Margin Top:70px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live vSpace1Height Error>>Expected Width:70px");
	count = count + 1;
}	

//Verify Gutter16 has the width of 34px
try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vSpace1StreetLifeFull");
	
	String margin_Left = this.getCSS(locator, "margin-left");
	
	
	// Substring: To remove pixel(px text) from value
	String margin_Left_wopx = margin_Left.substring(0, 2);
	
	int Totaladdedpixel = Integer.parseInt(margin_Left_wopx);
	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(Gutter16_Width, Totalpixelvaluewithpixel);
}

catch (Exception ex) {
	System.out.println("How We Live Gutter16_Width Exception>>Expected:34px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live Gutter16_Width Error>>Expected:34px");
	count = count + 1;
}			

try {
	
	String locator = locatorReader.getLocator("VerifyPixels.vSpace1SeatleFull");
	
String margin_Left = this.getCSS(locator, "margin-left");
	
	
	// Substring: To remove pixel(px text) from value
	String margin_Left_wopx = margin_Left.substring(0, 2);
	
	int Totaladdedpixel = Integer.parseInt(margin_Left_wopx);

	String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
	System.out.println("Actual result" + Totalpixelvaluewithpixel);
	
Assert.assertEquals(Gutter16_Width, Totalpixelvaluewithpixel);
}



catch (Exception ex) {
	System.out.println("How We Live Gutter16_Width Exception>>Expected:34px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live Gutter16_Width Error>>Expected:34px");
	count = count + 1;
}	
//Verify Image72(1) has the height of 172px and Width of 702px
try{
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1MusicGroupTVImage");
	String max_height=this.getCSS(locator1, "max-height");
	String max_width=this.getCSS(locator1, "max-width");
	System.out.println("Actual Height" + max_height);
	System.out.println("Actual Width" + max_width);
	Assert.assertEquals(ImageHeight72,max_height);
	Assert.assertEquals(ImageWidth72,max_width);
}
catch (Exception ex) {
	System.out.println("How We Live  height of 172px and Width of 702px Exception>>Expected  height:172px and Width:702px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live  height of 172px and Width of 702px Error>>Expected height:172px and Width:702px");
	count = count + 1;
}

//Verify Image72(2) has the height of 172px and Width of 702px
try{
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1StreetLifeImage");
	String max_height=this.getCSS(locator1, "max-height");
	String max_width=this.getCSS(locator1, "max-width");
	System.out.println("Actual Height" + max_height);
	System.out.println("Actual Width" + max_width);
	Assert.assertEquals(ImageHeight72,max_height);
	Assert.assertEquals(ImageWidth72,max_width);
}
catch (Exception ex) {
	System.out.println("How We Live  height of 172px and Width of 702px Exception>>Expected  height:172px and Width:702px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live  height of 172px and Width of 702px Error>>Expected height:172px and Width:702px");
	count = count + 1;
}

//Verify Image72(3) has the height of 172px and Width of 702px
try{
	String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1SeatleImage");
	String max_height=this.getCSS(locator1, "max-height");
	String max_width=this.getCSS(locator1, "max-width");
	System.out.println("Actual Height" + max_height);
	System.out.println("Actual Width" + max_width);
	Assert.assertEquals(ImageHeight72,max_height);
	Assert.assertEquals(ImageWidth72,max_width);
}
catch (Exception ex) {
	System.out.println("How We Live  height of 172px and Width of 702px Exception>>Expected  height:172px and Width:702px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live  height of 172px and Width of 702px Error>>Expected height:172px and Width:702px");
	count = count + 1;
}
//Verify FixedImageA has the height of 192px and Width of 980px 
try{
	String locator1 = locatorReader.getLocator("VerifyPixels.vSPaceBImage2HeightWidth");
	String max_height=this.getCSS(locator1, "height");
	String max_width=this.getCSS(locator1, "width");
	System.out.println("Actual Height" + max_height);
	System.out.println("Actual Width" + max_width);
	Assert.assertEquals(ImageHeightA,max_height);
	Assert.assertEquals(ImageWidthA,max_width);
	
	
}
catch (Exception ex) {
	System.out.println("How We Live  height of 192px and Width of 980px Exception>>Expected  height:192px and Width:980px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live  height of 192px and Width of 980px Error>>Expected height:192px and Width:980px");
	count = count + 1;
}

//Verify Image72 has the height of 368px and width of 980px
try{
	String locator1 = locatorReader.getLocator("VerifyPixels.vSPace4BelowImageHeight");
	String max_height=this.getCSS(locator1, "height");
	String max_width=this.getCSS(locator1, "width");
	System.out.println("Actual Height" + max_height);
	System.out.println("Actual Width" + max_width);
	//Assert.assertEquals(ImageHeight71,max_height);
	Assert.assertEquals(ImageWidthA,max_width);
	
	
}
catch (Exception ex) {
	System.out.println("How We Live  height of 368px and Width of 980px Exception>>Expected  height:386px and Width:980px");
	count = count + 1;
} catch (Error ex) {
	System.out.println("How We Live  height of 368px and Width of 980px Error>>Expected height:368px and Width:980px");
	count = count + 1;
}

					System.out.println("count value is :::" + count);
					Assert.assertTrue(count==0);	
						}
}