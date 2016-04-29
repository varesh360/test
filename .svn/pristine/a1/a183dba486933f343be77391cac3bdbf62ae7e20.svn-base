		package test.java.com.MusicGroup.pagehelper;
		import org.openqa.selenium.WebDriver;
		import org.testng.Assert;
		
		import test.java.com.MusicGroup.locators.LocatorReader;
		import test.java.com.MusicGroup.util.DriverHelper;
		public class WhatWeDo_LasVegasCareers_Helper extends DriverHelper {
			private LocatorReader locatorReader;	
			public WhatWeDo_LasVegasCareers_Helper(WebDriver driver)
			{
				super(driver);
				locatorReader = new LocatorReader("WhatWeDo_LasVegasCareers.xml");
		
		}
		public void ClickOnJoinUS()
		{
			
			String locator = locatorReader.getLocator("JoinUS.ClickonJoinUs");
		this.WaitForElementEnabled(locator, 50);
		
			clickOn(locator);
		}
		
		public void ClickOnWhatWeDo()
		{
			
			String locator = locatorReader.getLocator("JoinUS.ClickOnWhatWeDo");
		this.WaitForElementEnabled(locator, 50);
		
			clickOn(locator);
		}
		public void ClickOnLasVegas()
		{
			String locator = locatorReader.getLocator("JoinUS.ClickOnZhongshan");
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
		public void ReachUptoWhatWeDoLasVegasPage(){
		// Click on Join Us Page
		this.ClickOnJoinUS();
		//Click on What We Do Page
		this.ClickOnWhatWeDo();
		//Click on Zhongshan page
		this.ClickOnLasVegas();
		//Check Page Not found
			this.checkPageNotFound();
		}
		//Verify Buy Now page
		public void VerifyWhatWeDo_LasVegasPage(String Vspace1Height,String MaxWidth, String MaxHeight, String vSpace4height,String vTextSpace3Height, String vTextSpace7Height, String vTextSpace5Height, String TextSpace1Height, String TextSpace9Width, String vSpace8Height, String TextSpace13Height, String Gutter9Width,String ImageHeight23, String ImageWidth23, String Gutter16Width)
				{
			ReachUptoWhatWeDoLasVegasPage();
			int count=0;
			// Verify vSpace1Height has the height of 70px.
		
		try {
			
			String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeaderHeight");
		String margin_top = this.getCSS(locator, "padding-top");
		String line_height = this.getCSS(locator, "line-height");
		String font_size = this.getCSS(locator, "font-size");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeaderText");
		String line_height_1= this.getCSS(locator1, "line-height");
		String font_size_1 = this.getCSS(locator1, "font-size");
		
		// Substring: To remove pixel(px text) from value
		String margin_top_wopx = margin_top.substring(0, 2);
		String line_height_wopx = line_height.substring(0, 2);
		String font_size_wopx = font_size.substring(0, 2);
		
		String line_height_1_wopx = line_height_1.substring(0, 2);
		String font_size_1_wopx = font_size_1.substring(0, 2);
		
		int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
		int getsubpixel_1=Integer.parseInt(font_size_1_wopx)- Integer.parseInt(line_height_1_wopx)+Integer.parseInt("1");
		int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel+getsubpixel_1;
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
			System.out.println("Las Vegas Career Vspace1Height Exception>>Expected:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career Vspace1Height Error>>Expected:70px");
			count = count + 1;
		}
		
		//Verify vSpace4 in header has the height of 40px
		try {
								
				String locator = locatorReader.getLocator("VerifyPixels.vSpace1HeaderText");
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
			System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career vSpace4height Error>>Expected:40px");
			count = count + 1;
		}
		
		//Verify vTextSpace3 has the height of 17px
		try {
			
			String locator = locatorReader.getLocator("VerifyPixels.vTextSpace3liStCountry");
		String margin_bottom = this.getCSS(locator, "margin-bottom");
		String line_height = this.getCSS(locator, "line-height");
		String font_size = this.getCSS(locator, "font-size");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpaceCountry");
		String line_height_1 = this.getCSS(locator1, "line-height");
		
		String font_size_1 = this.getCSS(locator1, "font-size");
	
		// Substring: To remove pixel(px text) from value
		String margin_bottom_wopx = margin_bottom.substring(0, 1);
		String line_height_wopx = line_height.substring(0, 2);
		String font_size_wopx = font_size.substring(0, 2);
		
		String line_height_1_wopx = line_height_1.substring(0, 2);
		String font_size_1_wopx = font_size_1.substring(0, 2);
		
		int getsubpixel=Integer.parseInt(font_size_1_wopx)- Integer.parseInt(line_height_1_wopx)-Integer.parseInt("1");
		int getsubpixel_1=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
		int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+ getsubpixel+getsubpixel_1;
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vTextSpace3Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
			System.out.println("Las Vegas Career vTextSpace3 Exception>>Expected:17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career vTextSpace3 Error>>Expected:17px");
			count = count + 1;
		}
		
		//Verify Fixed Box Image has the Height of 368px and width of 723px
		try {
							
				String locator = locatorReader.getLocator("VerifyPixels.vFixedBoxImage");
		String height = this.getCSS(locator, "height");
	
		String width = this.getCSS(locator, "width");
						
		System.out.println("Actual Height" + height);
		System.out.println("Actual width" + width);
	
		Assert.assertEquals(MaxWidth, width);
		Assert.assertEquals(MaxHeight, height);
		}
		
		catch (Exception ex) {
			System.out.println("Las Vegas Career Height of 368px and width of 723px>>Expected Height:368px and  width: 723px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career Height of 368px and width of 723px>>Expected Height:368px and  width: 723px");
			count = count + 1;
		}
		
		//Verify Below Image vSpace4 has the height of 40px
		try {
			
			String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightBelowImage");
		String margin_bottom = this.getCSS(locator, "margin-bottom");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveText");
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
			System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career vSpace4height Error>>Expected:40px");
			count = count + 1;
		}
		//Verify vTextSpace5 has the height of 13px
		try{
			
		
		String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveText");
		String line_height_1 = this.getCSS(locator, "line-height");
		String font_size_1 = this.getCSS(locator, "font-size");
		// Substring: To remove pixel(px text) from value
		String line_height_1_wopx = line_height_1.substring(0, 2);
		String font_size_1_wopx = font_size_1.substring(0, 2);
		int getsubpixel=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);
		int Totaladdedpixel =  getsubpixel+getsubpixel+Integer.parseInt("1");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vTextSpace5Height, Totalpixelvaluewithpixel);
			}
			catch (Exception ex) {
				System.out.println("Las Vegas Career vTextSpace5Height Exception>>Expected:13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career vTextSpace5Height Error>>Expected:13px");
			count = count + 1;
		}
		//Verify vTextSpace7 has the height of 27px
		try {
						
		String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveText");
		String margin_bottom = this.getCSS(locator, "margin-bottom");
		String padding_bottom = this.getCSS(locator, "padding-bottom");
		String line_height_1 = this.getCSS(locator, "line-height");
		String font_size_1 = this.getCSS(locator, "font-size");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vTextSpace5HeightAboveText");
		String line_height = this.getCSS(locator1, "line-height");
		String font_size = this.getCSS(locator1, "font-size");
		
		// Substring: To remove pixel(px text) from value
		String margin_bottom_wopx = margin_bottom.substring(0, 2);
		String line_height_wopx = line_height.substring(0, 2);
		String font_size_wopx = font_size.substring(0, 2);
		String line_height_1_wopx = line_height_1.substring(0, 2);
		String font_size_1_wopx = font_size_1.substring(0, 2);
		String padding_bottom_wopx = padding_bottom.substring(0, 1);
		
		int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
		int getsubpixel_1=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);
		int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(padding_bottom_wopx)+ getsubpixel+getsubpixel_1+Integer.parseInt("1");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vTextSpace7Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
			System.out.println("Las Vegas Career vTextSpace7Height Exception>>Expected:27px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career vTextSpace7Height Error>>Expected:27px");
			count = count + 1;
		}
		
		//Verify vSpace4 Below Text has the height of 40px
		try {
			
		String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveText");
		String margin_bottom = this.getCSS(locator, "margin-bottom");
		
		String padding_bottom = this.getCSS(locator, "padding-bottom");
		String line_height_1 = this.getCSS(locator, "line-height");
		String font_size_1 = this.getCSS(locator, "font-size");
		String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4HeightBelowText");
		String margin_top = this.getCSS(locator1, "margin-top");
		
				
		// Substring: To remove pixel(px text) from value
		String margin_bottom_wopx = margin_bottom.substring(0, 2);
		String margin_top_wopx = margin_top.substring(0, 2);
		String line_height_1_wopx = line_height_1.substring(0, 2);
		String font_size_1_wopx = font_size_1.substring(0, 2);
		String padding_bottom_wopx = padding_bottom.substring(0, 1);
		
		int getsubpixel_1=Integer.parseInt(line_height_1_wopx)- Integer.parseInt(font_size_1_wopx);
		int Totaladdedpixel = Integer.parseInt(margin_bottom_wopx)+Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt(margin_top_wopx)+getsubpixel_1-Integer.parseInt("6");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
			System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career vSpace4height Error>>Expected:40px");
			count = count + 1;
		}
		//Verify Below Second Heading vSpace4 has the height of 40px
		try {
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4HeightBelowText");
		String padding_bottom = this.getCSS(locator1, "padding-bottom");
						
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+Integer.parseInt("1");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
			System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career vSpace4height Error>>Expected:40px");
			count = count + 1;
		}
		//Verify Below Second Heading vSpace4 has the height of 40px
		try {
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4HeightBelowSecondHead");
		String padding_bottom = this.getCSS(locator1, "margin-bottom");
		
		String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveThirdText");	
		String line_height = this.getCSS(locator, "line-height");
		String font_size = this.getCSS(locator, "font-size");
		// Substring: To remove pixel(px text) from value
		String line_height_wopx = line_height.substring(0, 2);
		String font_size_wopx = font_size.substring(0, 2);
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+getsubpixel-Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
			System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career vSpace4height Error>>Expected:40px");
			count = count + 1;
		}
		//Verify Below Second Text vSpace4 has the height of 40px
		try {
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4HeightBelowThirdText1");
		String padding_bottom = this.getCSS(locator1, "margin-bottom");
		
		String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveThirdHead");	
		String margin_top = this.getCSS(locator, "margin-top");
		
		// Substring: To remove pixel(px text) from value
		String margin_top_wopx = margin_top.substring(0, 2);
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ Integer.parseInt(padding_bottom_wopx);
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
			}
			
		catch (Exception ex) {
			System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career vSpace4height Error>>Expected:40px");
			count = count + 1;
		}
		try {
			
			String locator1 = locatorReader.getLocator("VerifyPixels.vSpace4HeightBelowThirdText2");
		String padding_bottom = this.getCSS(locator1, "margin-bottom");
		
		String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveThirdHead");	
		String margin_top = this.getCSS(locator, "margin-top");
		
		// Substring: To remove pixel(px text) from value
		String margin_top_wopx = margin_top.substring(0, 2);
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ Integer.parseInt(padding_bottom_wopx);
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vSpace4height,Totalpixelvaluewithpixel);
			}
			
		catch (Exception ex) {
			System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career vSpace4height Error>>Expected:40px");
			count = count + 1;
		}
		
		
		//Verify Above Third Heading has the height of 40px
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightAboveThirdHead");	
		String padding_bottom = this.getCSS(locator, "padding-bottom");
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("1");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
			System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career vSpace4height Error>>Expected:40px");
			count = count + 1;
		}
		//Verify Below Third Heading vSpace4 has the height of 40px
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeightBelowThirdHead");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
			System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Las Vegas Career vSpace4height Error>>Expected:40px");
			count = count + 1;
		}
		
		//Verify Above Videos vSpace8 has the height of 23px
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightAboveVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace8Height Exception>>Expected:23px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace8Height Error>>Expected:23px");
		count = count + 1;
		}
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightAboveShangangVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		System.out.println("HEllo");
		System.out.println("vSpace8Height"+vSpace8Height);
		System.out.println("Totalpixelvaluewithpixel"+Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace8Height Exception>>Expected:23px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace8Height Error>>Expected:23px");
		count = count + 1;
		}
		//I haven to check in this code why it is giving error
		/*
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightAboveHappyVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		System.out.println("padding_bottom"+padding_bottom);
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace1Height Exception>>Expected Margin Top:70px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace1Height Error>>Expected Width:70px");
		count = count + 1;
		}
		*/
		//Verify Below videos vSpace4 has the height of 40px
		
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightBelowVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vSPace4HeightAboveFourthHead");	
		String padding_top = this.getCSS(locator1, "margin-top");
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		String padding_top_wopx = padding_top.substring(0, 2);
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt(padding_top_wopx);
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		}
		
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightBelowShangangVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vSPace4HeightAboveFourthHead");	
		String padding_top = this.getCSS(locator1, "margin-top");
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		String padding_top_wopx = padding_top.substring(0, 2);
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt(padding_top_wopx);
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		}
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightBelowHappyVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vSPace4HeightAboveFourthHead");	
		String padding_top = this.getCSS(locator1, "margin-top");
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		String padding_top_wopx = padding_top.substring(0, 2);
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt(padding_top_wopx);
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		}
		
		//Verify Above Fourth heading vSpace4 has the height of 40px
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace4HeightAboveFourthHead");	
		String padding_bottom = this.getCSS(locator, "padding-bottom");
		
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("1");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		}
		//Verify Below fourth Heading vSpace4 has the heading of 40px
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeihtBelowFourthHead");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		}
		//Verify Above Fourth Text vSpace8 has the height of 23px
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightAboveNightViewVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace8Height Exception>>Expected:23px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace8Height Error>>Expected:23px");
		count = count + 1;
		}
		
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightAboveZhongshanVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace8Height Exception>>Expected:23px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace8Height Error>>Expected:23px");
		count = count + 1;
		}
		
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightAboveSkyWheelVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace8Height Exception>>Expected:23px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace8Height Error>>Expected:23px");
		count = count + 1;
		}
		
		//Verify Below Videos vSpace4 has the height of 40px
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightBelowNightViewVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vSPace4HeightAboveFifthHead");	
		String padding_top = this.getCSS(locator1, "margin-top");
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		String padding_top_wopx = padding_top.substring(0, 2);
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt(padding_top_wopx);
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		}
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightBelowZhongshanVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vSPace4HeightAboveFifthHead");	
		String padding_top = this.getCSS(locator1, "margin-top");
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		String padding_top_wopx = padding_top.substring(0, 2);
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt(padding_top_wopx);
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		}
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightBelowSkyWheelVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vSPace4HeightAboveFifthHead");	
		String padding_top = this.getCSS(locator1, "margin-top");
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		String padding_top_wopx = padding_top.substring(0, 2);
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt(padding_top_wopx);
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		}
		//Verify Above Fifth heading vSpace4 has the height of 40px
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace4HeightAboveFifthHead");	
		String padding_bottom = this.getCSS(locator, "padding-bottom");
		
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("1");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		}
		//Verify Below Fifth heading vSpace4 has the height of 40px
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSpace4HeihtBelowFifthHead");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace4height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace4height Exception>>Expected:40px");
		count = count + 1;
		}
		//Verify Above Video vSpace8 has the height of 23px 
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightAboveSunYetVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace8Height Exception>>Expected:23px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace8Height Error>>Expected:23px");
		count = count + 1;
		}
		
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightAboveMedicalVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace8Height Exception>>Expected:23px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace8Height Error>>Expected:23px");
		count = count + 1;
		}
		
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightAbovetechnologyVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt("3");
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(vSpace8Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace8Height Exception>>Expected:23px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace8Height Error>>Expected:23px");
		count = count + 1;
		}
		//Verify below Videos vSpace1 has the height of 70px
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace8HeightBelowNightViewVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightFooter");	
		String padding_top = this.getCSS(locator1, "margin-top");
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		String padding_top_wopx = padding_top.substring(0, 2);
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt(padding_top_wopx);
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace1Height Exception>>Expected Margin Top:70px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace1Height Error>>Expected Width:70px");
		count = count + 1;
		}
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace1HeightBelowMedicalVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightFooter");	
		String padding_top = this.getCSS(locator1, "margin-top");
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		String padding_top_wopx = padding_top.substring(0, 2);
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt(padding_top_wopx);
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace1Height Exception>>Expected Margin Top:70px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace1Height Error>>Expected Width:70px");
		count = count + 1;
		}
		
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vSPace1HeightBelowTechnologyVideo");	
		String padding_bottom = this.getCSS(locator, "margin-bottom");
		
		String locator1 = locatorReader.getLocator("VerifyPixels.vSpace1HeightFooter");	
		String padding_top = this.getCSS(locator1, "margin-top");
		// Substring: To remove pixel(px text) from value
		String padding_bottom_wopx = padding_bottom.substring(0, 2);
		String padding_top_wopx = padding_top.substring(0, 2);
		int Totaladdedpixel = Integer.parseInt(padding_bottom_wopx)+ Integer.parseInt(padding_top_wopx);
		String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
		System.out.println("Actual result" + Totalpixelvaluewithpixel);
		Assert.assertEquals(Vspace1Height, Totalpixelvaluewithpixel);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career vSpace1Height Exception>>Expected Margin Top:70px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career vSpace1Height Error>>Expected Width:70px");
		count = count + 1;
		}
		//Verify Gutter9 has the width of 20px
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vGutter9Width");	
		String padding_right = this.getCSS(locator, "margin-right");
		
		System.out.println("Actual result" + padding_right);
		Assert.assertEquals(Gutter9Width, padding_right);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career Gutter9 Exception>>Expected:20px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career Gutter9 Error>>Expected:20px");
		count = count + 1;
		}
		//Verify Gutter16 has the width of 34px
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vGutter16Width1");	
		String padding_left = this.getCSS(locator, "margin-left");
		
		System.out.println("Actual result" + padding_left);
		Assert.assertEquals(Gutter16Width, padding_left);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career Gutter16 Exception>>Expected:34px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career Gutter16 Error>>Expected:34px");
		count = count + 1;
		}
		
		try {
		
		String locator = locatorReader.getLocator("VerifyPixels.vGutter16Width2");	
		String padding_left = this.getCSS(locator, "margin-left");
		
		System.out.println("Actual result" + padding_left);
		Assert.assertEquals(Gutter16Width, padding_left);
		}
		
		catch (Exception ex) {
		System.out.println("Las Vegas Career Gutter16 Exception>>Expected:34px");
		count = count + 1;
		} catch (Error ex) {
		System.out.println("Las Vegas Career Gutter16 Error>>Expected:34px");
		count = count + 1;
		}
		
					System.out.println("count value is :::" + count);
					Assert.assertTrue(count==0);	
							
								}
		}
