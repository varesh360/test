package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_OrderDetailPage_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_OrderDetailPage_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_OrderDetailPage.xml");
	
	}
	
		//Click Behringer x32 product on serach result page
	public void ClickOrderonHomePage()
	
	{
		
		String locator = locatorReader.getLocator("OrdersPage.ClickOrder");
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
	
	//Reach upto B2BSearchField
	public void ReachUptoCreationHomePage()
	{
		
		//Click Behringer x32 product on serach result page
		this.ClickOrderonHomePage();
		//Check page not found
	this.checkPageNotFound();
		
	}
	public void verifyproductdetailpage(String vSpace1Heighth, String vSpace12Height,String Gutter16Width,String vSpace9Height,String vSpace15Height,String gap17width,String celldemension53width,String celldemension53Height,String celldemension54width,String celldemension54Height,String gap36width,String gutter45width,String vspace16Height,String gutter8width,String gap44width, String vSpace4Height, String vSpace10Height)
	{
		
		ReachUptoCreationHomePage();
		int count = 0;
		// Verify vSpace1Height has the width of 70px .
				
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace1HeightOrderHistory");
			String margin_top = this.getCSS(locator, "margin-top");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			
			String margin_top_wopx = margin_top.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			
			
			int getsubpixel =Integer.parseInt(line_height_wopx) - Integer.parseInt(font_size_wopx);
			int getaddpixel = Integer.parseInt(margin_top_wopx) + getsubpixel+Integer.parseInt("1");
			String getfinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
		    Assert.assertEquals(vSpace1Heighth,getfinalValue);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detial Page vSpace1Height Exception>>Expected Margin: 70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detial Page vSpace1Height Error>>Expected Margin:70px");
			count = count + 1;
		}
		
		// Verify vSpace12Height has the width of 35px .
		
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace1HeightOrderHistory");
			String font_size = this.getCSS(locator, "font-size");
			String line_height = this.getCSS(locator, "line-height");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			
			String locator1 = locatorReader.getLocator("OrdersPage.vspace12HeightSearchfilter");
			String margin_top = this.getCSS(locator1, "margin-top");
			
			
			String margin_top_wopx = margin_top.substring(0, 2);
			
			String font_size_wopx = font_size.substring(0, 2);
						
			String line_height_wopx = line_height.substring(0, 2);
						
			String margin_bottom_wopx = margin_bottom.substring(0, 1);
				
			
			int getsubpixel =Integer.parseInt(line_height_wopx) - Integer.parseInt(font_size_wopx);
						
			int getaddpixel = Integer.parseInt(margin_top_wopx) + getsubpixel+Integer.parseInt(margin_bottom_wopx)+Integer.parseInt("4");
						
			String getfinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
		    Assert.assertEquals(vSpace12Height,getfinalValue);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace12Height Exception>>Expected Margin: 35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace12Height Error>>Expected Margin:35px");
			count = count + 1;
		}
		
		// Verify gutter44width has the width of 6px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.gap44Widthshoppingicon");
			String postionright = this.getCSS(locator, "background-position-right");
			String backgroundposition = this.getCSS(locator, "background-position");
			String line_height_wopx = backgroundposition.substring(4, 7);
			System.out.println("Actual Result    " +line_height_wopx);
			Assert.assertEquals(gap44width,vSpace4Height);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page gutter44width Exception>>Expected Result: 6px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page gutter44width Error>>Expected Result:6px");
			count = count + 1;
		}
	
		// Verify vSpace4Height has the height of 40px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace4Height");
			String postion_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Result    " +postion_top);
			Assert.assertEquals(vSpace4Height,postion_top);
			 
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace4Height Exception>>Expected Result: 40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace4Height Error>>Expected Result:40px");
			count = count + 1;
		}
		// Verify gutter16width has the width of 34px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace4Height");
			String postion_left = this.getCSS(locator, "padding-left");
			String locator1 = locatorReader.getLocator("OrdersPage.gutter16width");
			String padding_left1 = this.getCSS(locator1, "padding-left");
			
			
			String padding_left_wopx = postion_left.substring(0, 2);
			String padding_left1_wopx = padding_left1.substring(0, 2);
			
			int getaddpixel = Integer.parseInt(padding_left_wopx) + Integer.parseInt(padding_left1_wopx)-Integer.parseInt("5");
            String getfinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
		    Assert.assertEquals(Gutter16Width,getfinalValue);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page Gutter16Width Exception>>Expected Result: 34px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page Gutter16Width Error>>Expected Result:34px");
			count = count + 1;
		}
		// Verify vSpace9Height has the height of 17px(Order Status) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace9Height");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			
			System.out.println("Actual Result" +margin_bottom);
		    Assert.assertEquals(vSpace9Height,margin_bottom);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace9Height Exception>>Expected Result: 17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace9Height Error>>Expected Result:17px");
			count = count + 1;
		}
		// Verify vSpace9Height has the height of 17px(calendar) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace9Height1");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			
			System.out.println("Actual Result" +margin_bottom);
		    Assert.assertEquals(vSpace9Height,margin_bottom);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace9Height Exception>>Expected Result: 17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace9Height Error>>Expected Result:17px");
			count = count + 1;
		}

		// Verify vSpace9Height has the height of 17px(Date range) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace9Height2");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			
			System.out.println("Actual Result" +margin_bottom);
		    Assert.assertEquals(vSpace9Height,margin_bottom);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace9Height Exception>>Expected Result: 17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace9Height Error>>Expected Result:17px");
			count = count + 1;
		}
		// Verify gap17width has the height of 10px(Date range) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.gap17widthcalendar");
			String padding_right = this.getCSS(locator, "padding-right");
            String padding_right_wopx = padding_right.substring(0, 1);
			
			int getaddpixel = Integer.parseInt(padding_right_wopx) + Integer.parseInt("2");
            String getfinalValue=getaddpixel+"px";
			
			
			System.out.println("Actual Result" +getfinalValue);
		    Assert.assertEquals(gap17width,getfinalValue);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page gap17width Exception>>Expected Result: 10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page gap17width Error>>Expected Result:10px");
			count = count + 1;
		}

		// Verify vSpace10Height has the height of 13px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace10height");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(vSpace10Height,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace10Height Exception>>Expected Result: 13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace10Height Error>>Expected Result:13px");
			count = count + 1;
		}
			
		// Verify gutter8width has the width of 34px 
		try {
			String locator = locatorReader.getLocator("OrdersPage.gutter8width1");
			String postion_left = this.getCSS(locator, "padding-right");
			String locator1 = locatorReader.getLocator("OrdersPage.gutter8width");
			String padding_left1 = this.getCSS(locator1, "padding-left");
			
			
			String padding_left_wopx = postion_left.substring(0, 2);
			String padding_left1_wopx = padding_left1.substring(0, 2);
			
			int getaddpixel = Integer.parseInt(padding_left_wopx) + Integer.parseInt(padding_left1_wopx)-Integer.parseInt("4");
            String getfinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
		    Assert.assertEquals(Gutter16Width,getfinalValue);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page gutter8width Exception>>Expected Result: 40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page gutter8width Error>>Expected Result:40px");
			count = count + 1;
		}
		// Verify vSpace15Height has the width of 25px (Top)
				
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace15Height");
			String postion_left = this.getCSS(locator, "padding-top");
			String locator1 = locatorReader.getLocator("OrdersPage.vSpace15Height1");
			String padding_left1 = this.getCSS(locator1, "padding-top");
			
			
			String padding_left_wopx = postion_left.substring(0, 2);
			String padding_left1_wopx = padding_left1.substring(0, 2);
			
			int getaddpixel = Integer.parseInt(padding_left_wopx) + Integer.parseInt(padding_left1_wopx);
            String getfinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
		    Assert.assertEquals(vSpace15Height,getfinalValue);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace15Height Exception>>Expected Result: 25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace15Height Error>>Expected Result:25px");
			count = count + 1;
		}
		
		// Verify vSpace15Height has the width of 25px (Top)
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace15Height");
			String postion_left = this.getCSS(locator, "padding-bottom");
			String locator1 = locatorReader.getLocator("OrdersPage.vSpace15Height1");
			String padding_left1 = this.getCSS(locator1, "padding-bottom");
			
			
			String padding_left_wopx = postion_left.substring(0, 2);
			String padding_left1_wopx = padding_left1.substring(0, 2);
			
			int getaddpixel = Integer.parseInt(padding_left_wopx) + Integer.parseInt(padding_left1_wopx);
            String getfinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
		    Assert.assertEquals(vSpace15Height,getfinalValue);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace15Height Exception>>Expected Result: 25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace15Height Error>>Expected Result:25px");
			count = count + 1;
		}

		// Verify vSpace10Height has the height of 13px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vspace10Height2");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(vSpace10Height,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace10Height Exception>>Expected Result: 13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace10Height Error>>Expected Result:13px");
			count = count + 1;
		}

		// Verify vSpace10Height has the height of 13px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vspace10Height2");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(vSpace10Height,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace10Height Exception>>Expected Result: 13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace10Height Error>>Expected Result:13px");
			count = count + 1;
		}
		// Verify gap17width has the height of 10px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.gap17width");
			String margin_top = this.getCSS(locator, "margin-left");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(gap17width,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page gap17width Exception>>Expected Result: 10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page gap17width Error>>Expected Result:10px");
			count = count + 1;
		}
		// Verify vSpace16width has the heeight of 14px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace16Height");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(vspace16Height,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vspace16Height Exception>>Expected Result: 14px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vspace16Height Error>>Expected Result:14px");
			count = count + 1;
		}
		// Verify gap17width has the height of 10px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.gap17width2col");
			String margin_top = this.getCSS(locator, "margin-left");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(gap17width,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page gap17width Exception>>Expected Result: 10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page gap17width Error>>Expected Result:10px");
			count = count + 1;
		}
		// Verify vSpace16width has the heeight of 14px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace16Height2col");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(vspace16Height,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vspace16Height Exception>>Expected Result: 14px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vspace16Height Error>>Expected Result:14px");
			count = count + 1;
		}
		// Verify gap17width has the height of 10px( 3 Col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.gap17width3col");
			String margin_top = this.getCSS(locator, "margin-left");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(gap17width,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page gap17width Exception>>Expected Result: 10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page gap17width Error>>Expected Result:10px");
			count = count + 1;
		}
		// Verify vSpace16width has the heeight of 14px (3 Col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace16Height3col");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(vspace16Height,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vspace16Height Exception>>Expected Result: 14px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vspace16Height Error>>Expected Result:14px");
			count = count + 1;
		}
		
		// Verify gap17width has the height of 10px( 4 Col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.gap17width4col");
			String margin_top = this.getCSS(locator, "margin-left");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(gap17width,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page gap17width Exception>>Expected Result: 10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page gap17width Error>>Expected Result:10px");
			count = count + 1;
		}
		// Verify vSpace16width has the heeight of 14px (4 Col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace16Height4col");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(vspace16Height,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vspace16Height Exception>>Expected Result: 14px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vspace16Height Error>>Expected Result:14px");
			count = count + 1;
		}

		// Verify gap17width has the height of 10px( 4 Col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.gap17width6col");
			String margin_top = this.getCSS(locator, "margin-left");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(gap17width,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page gap17width Exception>>Expected Result: 10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page gap17width Error>>Expected Result:10px");
			count = count + 1;
		}
		// Verify vSpace16width has the heeight of 14px (4 Col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace16Height6col");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(vspace16Height,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vspace16Height Exception>>Expected Result: 14px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vspace16Height Error>>Expected Result:14px");
			count = count + 1;
		}
		
		// Verify celldemension53 has the heeight of 105px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.celldemension53");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result  " +height);
		    Assert.assertEquals(celldemension53Height,height);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page celldemension53Height Exception>>Expected Result: 105px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page celldemension53Height Error>>Expected Result:105px");
			count = count + 1;
		}
		// Verify celldemension53 has the widtht of 142px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.celldemension53");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result  " +width);
		    Assert.assertEquals(celldemension53width,width);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page celldemension53width Exception>>Expected Result: 142px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page celldemension53width Error>>Expected Result:142px");
			count = count + 1;
		}
		// Verify celldemension53 has the heeight of 105px (2 Col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.celldemension532col");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result  " +height);
		    Assert.assertEquals(celldemension53Height,height);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page celldemension53Height Exception>>Expected Result: 105px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page celldemension53Height Error>>Expected Result:105px");
			count = count + 1;
		}
		// Verify celldemension53 has the widtht of 142px(2 col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.celldemension532col");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result  " +width);
		    Assert.assertEquals(celldemension53width,width);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page celldemension53width Exception>>Expected Result: 142px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page celldemension53width Error>>Expected Result:142px");
			count = count + 1;
		}
		// Verify celldemension53 has the heeight of 105px (3 Col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.celldemension533col");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result  " +height);
		    Assert.assertEquals(celldemension53Height,height);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page celldemension53Height Exception>>Expected Result: 105px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page celldemension53Height Error>>Expected Result:105px");
			count = count + 1;
		}
		// Verify celldemension53 has the widtht of 142px(3 col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.celldemension533col");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result  " +width);
		    Assert.assertEquals(celldemension53width,width);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page celldemension53width Exception>>Expected Result: 142px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page celldemension53width Error>>Expected Result:142px");
			count = count + 1;
		}
		// Verify celldemension54 has the heeight of 105px (3 Col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.celldemension54col");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result  " +height);
		    Assert.assertEquals(celldemension54Height,height);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page celldemension54Height Exception>>Expected Result: 105px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page celldemension54Height Error>>Expected Result:105px");
			count = count + 1;
		}
		// Verify celldemension54 has the widtht of 142px(3 col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.celldemension54col");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result  " +width);
		    Assert.assertEquals(celldemension54width,width);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page celldemension54width Exception>>Expected Result: 263px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page celldemension54width Error>>Expected Result:263px");
			count = count + 1;
		}
						
		// Verify vSpace10Height has the height of 13px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace10Heightlast");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result  " +margin_top);
		    Assert.assertEquals(vSpace10Height,margin_top);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace10Height Exception>>Expected Result: 13px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace10Height Error>>Expected Result:13px");
			count = count + 1;
		}
		// Verify gutter45widthnext1 has the width of 18px .
		try {
			String locator = locatorReader.getLocator("OrdersPage.gutter45widthnext1");
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result  " +padding_left);
		    Assert.assertEquals(gutter45width,padding_left);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page gutter45widthnext1 Exception>>Expected Result: 18px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page gutter45widthnext1 Error>>Expected Result:18px");
			count = count + 1;
		}
		// Verify gutter45widthnext1 has the width of 18px .			
		try {
			String locator = locatorReader.getLocator("OrdersPage.gutter45widthnext1");
			String margin_left = this.getCSS(locator, "margin-left");
			String locator1 = locatorReader.getLocator("OrdersPage.gutter45widthnext");
			String margin_right = this.getCSS(locator1, "margin-right");
			
			
			String margin_left_wopx = margin_left.substring(0, 2);
			String margin_right_wopx = margin_right.substring(0, 2);
			
			int getaddpixel = Integer.parseInt(margin_left_wopx) + Integer.parseInt(margin_right_wopx);
            String getfinalValue=getaddpixel+"px";
			
			System.out.println("Actual Result" +getfinalValue);
		    Assert.assertEquals(gutter45width,getfinalValue);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace15Height Exception>>Expected Result: 25px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace15Height Error>>Expected Result:25px");
			count = count + 1;
		}

		// vSpace16Heightlast has the heeight of 14px (4 Col) .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace16Heightlast");
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result  " +padding_right);
		    Assert.assertEquals(vspace16Height,padding_right);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vspace16Height Exception>>Expected Result: 14px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vspace16Height Error>>Expected Result:14px");
			count = count + 1;
		}
		// vSpace16Heightlast has the heeight of 14px  .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace16Heightlast");
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result  " +padding_left);
		    Assert.assertEquals(vspace16Height,padding_left);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vspace16Height Exception>>Expected Result: 14px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vspace16Height Error>>Expected Result:14px");
			count = count + 1;
		}
		// vSpace1Height has the height of 70px  .
		try {
			String locator = locatorReader.getLocator("OrdersPage.vSpace1Heightlast");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Result  " +padding_bottom);
		    Assert.assertEquals(vSpace1Heighth,padding_bottom);
			
			
		}

		catch (Exception ex) {
			System.out.println("B2B Order Detail Page vSpace1Height Exception>>Expected Result: 70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Order Detail Page vSpace1Height Error>>Expected Result:70px");
			count = count + 1;
		}
								
	    System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}


