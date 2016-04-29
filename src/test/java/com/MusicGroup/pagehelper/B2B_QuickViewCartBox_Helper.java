package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_QuickViewCartBox_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_QuickViewCartBox_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_QuickViewCartBox.xml");
	
	}
	
	//Click Cart Icon
	public void clickCartIcon()
	
	{
	
		String locator = locatorReader.getLocator("QuickViewCart.ClickCart");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
			
	}
	
		
	//Check Page not found
	public void checkPageNotFound()
	{
		String actualTitle1 = driver.getTitle();
		System.out.println("Get Titile"+ actualTitle1);
		String expectedTitle1 = "Not Found | MUSIC Group";
		Assert.assertFalse(actualTitle1==expectedTitle1);
	
	}

	//Reach upto B2B_QuickViewCart
	public void ReachUptoB2BQuickViewCart()
	{
		
		//Check page not found
		this.checkPageNotFound();
		//Click on Cartlink on B2BPage
		this.clickCartIcon();
		//Check page not found
		this.checkPageNotFound();
		
		
	}
	public void verifyQuickViewCart(String TextSpace3Height,String TextSpace5Height,String FixedBoxImageWidth,String FixedBoxImageHeight,String Gutter45Width,String vSpace17Height,String vSpace9Height,String TextSpace4Height,String TextSpace11Height,String TextSpace16Height)
	{
		
		ReachUptoB2BQuickViewCart();
		int count = 0;
		
		// Verify textSpace3Height has the height 17px (Volume CBM) .
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.textSpace3Height");
			String padding_top = this.getCSS(locator, "padding-top");
			
			
			String locator1 = locatorReader.getLocator("QuickViewCart.textSpace3Height1");
			String font_size = this.getCSS(locator1, "font-size");
			String line_height = this.getCSS(locator1, "line-height");
			
			
			
			String padding_top_wopx = padding_top.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)-Integer.parseInt("2");
			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel;
			String getfinalValue= getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace3Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :17px");
			count = count + 1;
		}
		// Verify textSpace3Height has the height 17px (Amount) .
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.textSpace3Height");
			String padding_top = this.getCSS(locator, "padding-top");
			
			
			String locator1 = locatorReader.getLocator("QuickViewCart.textSpace3Height2");
			String font_size = this.getCSS(locator1, "font-size");
			String line_height = this.getCSS(locator1, "line-height");
						
			
			String padding_top_wopx = padding_top.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)-Integer.parseInt("2");
			int getaddpixel=Integer.parseInt(padding_top_wopx)+getsubpixel;
			String getfinalValue= getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace3Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B textSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B textSpace3Height Error>>Expected :17px");
			count = count + 1;
		}
	
		// Verify Gutter45Width has Width of  18px (Amount) .
		
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.gutter45widthwithtotoaltext");
			String padding_right = this.getCSS(locator, "padding-right");
						
			System.out.println("Actual Result" +padding_right);
			Assert.assertEquals(Gutter45Width,padding_right);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter45Width Exception>>Expected :18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter45Width Error>>Expected :18px");
			count = count + 1;
		}

		// Verify Gutter45Width has Width of  18px ( Right)
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.gutter45widthwithtotoaltext");
			String padding_right = this.getCSS(locator, "padding-right");
						
			System.out.println("Actual Result" +padding_right);
			Assert.assertEquals(Gutter45Width,padding_right);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter45Width Exception>>Expected :18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter45Width Error>>Expected :18px");
			count = count + 1;
		}
		// Verify Gutter45Width has Width of  18px ( Left )
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.gutter45widthwithtotoaltext");
			String padding_left = this.getCSS(locator, "padding-left");
						
			System.out.println("Actual Result" +padding_left);
			Assert.assertEquals(Gutter45Width,padding_left);
			
		}

		catch (Exception ex) {
			System.out.println("B2B Gutter45Width Exception>>Expected :18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Gutter45Width Error>>Expected :18px");
			count = count + 1;
		}
		
		// Verify textSpace4Height has the height 22px (Amount) .
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.textSpace4Height");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
			
			
			String locator1 = locatorReader.getLocator("QuickViewCart.textSpace3Height1");
			String Line_Height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			String Line_Height1_wopx = Line_Height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			int getsubpixel = Integer.parseInt(Line_Height1_wopx)- Integer.parseInt(font_size_wopx);
			
			
			String locator2 = locatorReader.getLocator("QuickViewCart.textSpace3Height2");
			String font_size1 = this.getCSS(locator2, "font-size");
			String line_height1 = this.getCSS(locator2, "line-height");
			String line_height1s_wopx = line_height1.substring(0, 2);
			String font_size1_wopx = font_size1.substring(0, 2);
			int getsubpixel1 = Integer.parseInt(line_height1s_wopx)- Integer.parseInt(font_size1_wopx);
			
			
			
			int getaddpixel=Integer.parseInt(padding_bottom_wopx)+getsubpixel+getsubpixel1+Integer.parseInt("1");
			String getfinalValue= getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace4Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace4Height Exception>>Expected :22px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace4Height Error>>Expected :22px");
			count = count + 1;
		}		
		// Verify textSpace3Height has the height 17px (Below Weight) .
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.textspace3Heightbelowwight");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
			
			String locator1 = locatorReader.getLocator("QuickViewCart.textspace3Heightbelowwight1");
			String padding_bottom1 = this.getCSS(locator1, "padding-bottom");
			String padding_bottom_wopx1 = padding_bottom1.substring(0, 1);
			
			String locator2 = locatorReader.getLocator("QuickViewCart.textspace3Heightbelowwight2");
			String line_height = this.getCSS(locator2, "line-height");
			String font_size = this.getCSS(locator2, "font-size");
			String line_height_wopx1 = line_height.substring(0, 2);
			String font_size_wopx1 = font_size.substring(0, 2);
			
						
			int getsubpixel = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
			
			
			
			
			
			
			int getaddpixel=Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(padding_bottom_wopx1)+getsubpixel-Integer.parseInt("1");
			String getfinalValue= getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace3Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace3Height Error>>Expected :17px");
			count = count + 1;
		}		
		// Verify vSpace9Height has height of 17px(Below view cart) .
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.vSpace9Height");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
						
			System.out.println("Actual Result" +padding_bottom);
			Assert.assertEquals(vSpace9Height,padding_bottom);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace9Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace9Height Error>>Expected :17px");
			count = count + 1;
		}	
		// Verify vSpace9Height has height of 17px(Above view cart) .
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.vSpace9HeightaboveViewCart");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			String margin_bottom_wopx = margin_bottom.substring(0, 2);
			
			String locator1 = locatorReader.getLocator("QuickViewCart.vSpace9HeightaboveViewCart1");
			String padding_bottom1 = this.getCSS(locator1, "padding-bottom");
			String padding_bottom_wopx1 = padding_bottom1.substring(0, 1);
			
					
						
			int getsubpixel = Integer.parseInt(margin_bottom_wopx)+ Integer.parseInt(padding_bottom_wopx1)-Integer.parseInt("1");
			
			String getfinalValue= getsubpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(vSpace9Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace9Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace9Height Error>>Expected :17px");
			count = count + 1;
		}		
		// Verify textSpace3Height has height of 17px(Above contanier utilization) .
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.textSpace3HeightContainerUtilization");
			String margin_top = this.getCSS(locator, "margin-top");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			
			
					
						
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			int getaddpixel=Integer.parseInt(margin_top_wopx)+getsubpixel+Integer.parseInt("1");
			
			String getfinalValue= getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace3Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace3Height Error>>Expected :17px");
			count = count + 1;
		}
		// Verify TextSpace5Height has height of 13px(Above contanier utilization) .
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.textSpace3HeightContainerUtilization");
			String margin_top = this.getCSS(locator, "margin-bottom");
			
			String locator1 = locatorReader.getLocator("QuickViewCart.textSpace5heightDhipFrom");
			
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
			String margin_top_wopx = margin_top.substring(0, 1);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			
									
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			int getaddpixel=Integer.parseInt(margin_top_wopx)+getsubpixel;
			
			String getfinalValue= getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace5Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace3Height Exception>>Expected :13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace3Height Error>>Expected :13px");
			count = count + 1;
		}
		// Verify TextSpace5Height has height of 13px(Above contanier utilization) .
		try {
			
			
			String locator1 = locatorReader.getLocator("QuickViewCart.textSpace11heightbetween");
			
			String line_height = this.getCSS(locator1, "line-height");
			String font_size = this.getCSS(locator1, "font-size");
								String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			
									
			int getsubpixel = Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			int getaddpixel=getsubpixel+Integer.parseInt("2");
			
			String getfinalValue= getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace11Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace3Height Exception>>Expected :13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace3Height Error>>Expected :13px");
			count = count + 1;
		}	
		// Verify textSpace3Height has the height 17px (Second Col) .
		
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.textSpace3HeightContanierUtilization");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
			
			String locator1 = locatorReader.getLocator("QuickViewCart.textSpace3HeightContanierUtilization1");
			String padding_bottom1 = this.getCSS(locator1, "padding-bottom");
			String padding_bottom_wopx1 = padding_bottom1.substring(0, 1);
			
			String locator2 = locatorReader.getLocator("QuickViewCart.textSpace11heightbetween");
			String line_height = this.getCSS(locator2, "line-height");
			String font_size = this.getCSS(locator2, "font-size");
			String line_height_wopx1 = line_height.substring(0, 2);
			String font_size_wopx1 = font_size.substring(0, 2);
			
						
			int getsubpixel = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
			
			
			
			
			
			
			int getaddpixel=Integer.parseInt(padding_bottom_wopx)+Integer.parseInt(padding_bottom_wopx1)+getsubpixel-Integer.parseInt("1");
			String getfinalValue= getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace3Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace3Height Exception>>Expected :17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace3Height Error>>Expected :17px");
			count = count + 1;
		}		
		// Verify vSpace17Height has the height 5px (Second Col) .
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.vSpace17Height");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Result" +padding_top);
			Assert.assertEquals(vSpace17Height,padding_top);
			
		}

		catch (Exception ex) {
			System.out.println("B2B vSpace17Height Exception>>Expected :5px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B vSpace17Height Error>>Expected :5px");
			count = count + 1;
		}		
		// Verify FixedBoxImageHeight has the height 52px (Second Col) .
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.fixedboximage");
			String padding_top = this.getCSS(locator, "height");
			System.out.println("Actual Result" +padding_top);
			Assert.assertEquals(FixedBoxImageHeight,padding_top);
			
		}

		catch (Exception ex) {
			System.out.println("B2B FixedBoxImageHeight Exception>>Expected :52px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B FixedBoxImageHeight Error>>Expected :52px");
			count = count + 1;
		}
		// Verify FixedBoxImageWidth has the height 52px (Second Col) .
		try {
			
			
			String locator = locatorReader.getLocator("QuickViewCart.fixedboximage");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result" +width);
			Assert.assertEquals(FixedBoxImageHeight,width);
			
		}

		catch (Exception ex) {
			System.out.println("B2B FixedBoxImageWidth Exception>>Expected :66px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B FixedBoxImageWidth Error>>Expected :66px");
			count = count + 1;
		}
		// Verify TextSpace11Height has the height 10px  .
		try {
			
			
		
			
			String locator2 = locatorReader.getLocator("QuickViewCart.textSpace11HeightProductCode");
			String line_height = this.getCSS(locator2, "line-height");
			String font_size = this.getCSS(locator2, "font-size");
			String line_height_wopx1 = line_height.substring(0, 2);
			String font_size_wopx1 = font_size.substring(0, 2);
			
						
			int getsubpixel = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
			
				
			
			
			
			
			String getfinalValue= getsubpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace11Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace11Height Exception>>Expected :10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace11Height Error>>Expected :10px");
			count = count + 1;
		}		
		// Verify TextSpace11Height has the height 10px  .
		try {
			
			String locator = locatorReader.getLocator("QuickViewCart.vSpace17Height");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
		
			
			String locator2 = locatorReader.getLocator("QuickViewCart.textSpace11Heightbelowquantity");
			String line_height = this.getCSS(locator2, "line-height");
			String font_size = this.getCSS(locator2, "font-size");
			String line_height_wopx1 = line_height.substring(0, 2);
			String font_size_wopx1 = font_size.substring(0, 2);
			
						
			int getsubpixel = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
			
			int getaddpixel=Integer.parseInt(padding_bottom_wopx)	+ getsubpixel- Integer.parseInt("1");
			
			
			
			
			String getfinalValue= getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace11Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace11Height Exception>>Expected :10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace11Height Error>>Expected :10px");
			count = count + 1;
		}		
		// Verify TextSpace16Height has the height 5px  .
		try {
			
			String locator = locatorReader.getLocator("QuickViewCart.vSpace17Height");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String padding_bottom_wopx = padding_bottom.substring(0, 1);
		
			
			String locator2 = locatorReader.getLocator("QuickViewCart.textSpace11Heightbelowquantity");
			String line_height = this.getCSS(locator2, "line-height");
			String font_size = this.getCSS(locator2, "font-size");
			String line_height_wopx1 = line_height.substring(0, 2);
			String font_size_wopx1 = font_size.substring(0, 2);
			
						
			int getsubpixel = Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1);
			
			int getaddpixel=Integer.parseInt(padding_bottom_wopx)	+ getsubpixel- Integer.parseInt("1");
			
			
			
			
			String getfinalValue= getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
			Assert.assertEquals(TextSpace11Height,getfinalValue);
			
		}

		catch (Exception ex) {
			System.out.println("B2B TextSpace11Height Exception>>Expected :10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B TextSpace11Height Error>>Expected :10px");
			count = count + 1;
		}		

		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}

