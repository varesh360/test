/*==============================================================================================================================
 File Name    : B2B_ShoppingCart_Helper.java
 ClassName    : B2B_ShoppingCart_Helper
 Summary      : Contains helping methods for B2B_ShoppingCart_Helper Page.
 ===============================================================================================================================
 History      :   Company            Created By     
                  360logica                         

 ===============================================================================================================================
 Remarks      :   Tests - 
 ===============================================================================================================================*/
package test.java.com.MusicGroup.pagehelper;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class B2B_ShoppingCart_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public B2B_ShoppingCart_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("B2B_ShoppingCart.xml");
	
	}
	
	//Click on Cartlink on B2BPage
	public void clickonCart()
	
	{
			
		
		String locator = locatorReader.getLocator("B2B_ShoppingCart.ClickCartLocator");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
	}
	
	
	//Click on Brand Midas
		public void clickonViewCart()
		
		{
				
			
			String locator = locatorReader.getLocator("B2B_ShoppingCart.viewCartlocator");
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
		
	//Reach upto Midas Training  page(Midas)
	public void ReachUptoAskAQuestiontPage()
	{
		//Click on Cartlink on B2BPage
		this.clickonCart();
		//Click on a ViewCart Link
		this.clickonViewCart();
		//Check page not found
		this.checkPageNotFound();
		
	}
	public void verifyAskAQuestionPage(String VSpace1Height, String VSpace4Height, String vSpace12Height, String TextSpace4Height, String Gap36Width, String CellDemension40Width, String CellDemension40Height, String Gutter28Width, String CellDemension37Width, String CellDemension37Height,String ImageArea38Width, String ImageArea38Heigt, String gap9Width, String gap17Width, String textSpace1Height, String Gutter17Width, String vSpace14Height, String CellDemension42Height, String CellDemension42Width, String textSpace3Height)
	{
		
		ReachUptoAskAQuestiontPage();
		int count = 0;
		// Verify vSpace1Height has the height of 70px .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.vSpace1Locator");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Result: " + padding_top);
			Assert.assertEquals(VSpace1Height,padding_top);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart vSpace1Height Exception>>Expected Pading Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping CartvSpace1Height Error>>Expected Padding:70px");
			count = count + 1;
		}
		
		// Verify vSpace4Height has the height of 40px(Margin_Bottom) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.vSpace1Locator");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Result: " + margin_bottom);
			Assert.assertEquals(VSpace4Height,margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart4 Error>>Expected Padding:40px");
			count = count + 1;
		}
		
		// Verify vSpace4Height has the height of 40px(Margin_Bottom) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.vSpace1Locator");
			String margin_bottom = this.getCSS(locator, "margin-bottom");
			System.out.println("Actual Result: " + margin_bottom);
			Assert.assertEquals(VSpace4Height,margin_bottom);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart vSpace4Height Exception>>Expected Pading Top:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart4 Error>>Expected Padding:40px");
			count = count + 1;
		}
		
		
		// Verify vSpace12Height has the height of 35px .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.vSpace12Heightaboverefrence");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result: " + margin_top);
			Assert.assertEquals(vSpace12Height,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart vSpace12Height Exception>>Expected Pading Top:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart4 Error>>Expected Padding:40px");
			count = count + 1;
		}
		
		// Verify gutter 34 has the height of 23px (Left).
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.vSpace12Heightaboverefrence");
			String margin_left = this.getCSS(locator, "margin-left");
			System.out.println("Actual Result: " + margin_left);
			Assert.assertEquals(vSpace12Height,margin_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping CartMarginLeft Exception>>Expected Pading Top:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping CartMarginLeft Error>>Expected Padding:23px");
			count = count + 1;
		}
		
		// Verify gutter 34 has the height of 23px (Right).
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.vSpace12Heightaboverefrence");
			String margin_right = this.getCSS(locator, "margin-right");
			System.out.println("Actual Result: " + margin_right);
			Assert.assertEquals(vSpace12Height,margin_right);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping CartMarginLeft Exception>>Expected Pading Top:23px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping CartMarginLeft Error>>Expected Padding:23px");
			count = count + 1;
		}
		
		// Verify TextSpace4 has the height of 22px (Right).
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.textSpace4");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			String Font_size= this.getCSS(locator, "font-size");
			String Font_size_wopx = Font_size.substring(0, 2);
			System.out.println("Actual Result: " + Font_size_wopx);
			String padding_bottom_wopx = padding_bottom.substring(0, 2);
			System.out.println("Actual Result: " + padding_bottom_wopx);
			int getsubpixel = Integer.parseInt(Font_size_wopx)+ Integer.parseInt(padding_bottom_wopx);
			System.out.println("Actual Result: " + getsubpixel);
			String getfinalresult=getsubpixel+"px";
			System.out.println("Actual Result: " + getfinalresult);
			Assert.assertEquals(TextSpace4Height,getfinalresult);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping CartTextSpace4Height Exception>>Expected Result:22px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping CartTextSpace4Height Error>>Expected Result:22px");
			count = count + 1;
		}
		
		// Verify vspace12height has the height of 35px (Right).
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.vspace12Height");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Result: " + padding_bottom);
			Assert.assertEquals(vSpace12Height,padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cartvspace12height Exception>>Expected Result:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cartvspace12height Error>>Expected Result:35px");
			count = count + 1;
		}

		
		// Verify vspace12height has the height of 35px (Right).
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.vspace12Heightabovecart");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			Assert.assertEquals(vSpace12Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cartvspace12height Exception>>Expected Result:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cartvspace12height Error>>Expected Result:35px");
			count = count + 1;
		}
		
		// Verify gap36width has the width of 4px (Right).
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.gap36widthlocator1");
			String margin_left = this.getCSS(locator, "margin-left");
			String margin_left_wopx = margin_left.substring(0, 2);
			int margin_left_wopx1=-(Integer.parseInt(margin_left_wopx));
			String actualresult=margin_left_wopx1+"px";
			System.out.println("Actual Result: " + actualresult);
			Assert.assertEquals(Gap36Width,actualresult);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping CartGap36Width Exception>>Expected Result:4px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping CartGap36Width Error>>Expected Result:4px");
			count = count + 1;
		}
		
		// Verify cell demension has the width of 40px .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemension40");
			String min_width = this.getCSS(locator, "min-width");
			System.out.println("Actual Result: " + min_width);
			Assert.assertEquals(CellDemension40Width,min_width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping CartGap36Width Exception>>Expected Result:4px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping CartGap36Width Error>>Expected Result:4px");
			count = count + 1;
		}
		
		// Verify cell demension has the width of 85px .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemension40");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			Assert.assertEquals(CellDemension40Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping CartCellDemension40Height Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping CartCellDemension40Height Error>>Expected Result:85px");
			count = count + 1;
		}	
		
		// Verify cell demension has the width of 40px .
			
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemension40lastcol");
			String min_width = this.getCSS(locator, "width");
			System.out.println("Actual Result: " + min_width);
			Assert.assertEquals(CellDemension40Width,min_width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cartcell demension Exception>>Expected Result:30px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cartcell demension Error>>Expected Result:30px");
			count = count + 1;
		}
		
		// Verify cell demension has the width of 85px .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemension40lastcol");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			Assert.assertEquals(CellDemension40Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping CartCellDemension40Height Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping CartCellDemension40Height Error>>Expected Result:85px");
			count = count + 1;
		}
		
		// Verify cell demension has the width of 50px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemensionlocator1");
			String min_width = this.getCSS(locator, "width");
			System.out.println("Actual Result: " + min_width);
			Assert.assertEquals(CellDemension40Width,min_width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cartcell demension Exception>>Expected Result:50px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cartcell demension Error>>Expected Result:50px");
			count = count + 1;
		}
		
		// Verify cell demension has the width of 85px .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemensionlocator1");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			Assert.assertEquals(CellDemension40Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping CartCellDemension40Height Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping CartCellDemension40Height Error>>Expected Result:85px");
			count = count + 1;
		}
		
		
		// Verify cell demension has the padding of 17 .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemensionlocator1");
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result: " + padding_left);
			Assert.assertEquals(Gutter28Width,padding_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping CartGutter28Width Exception>>Expected Result:17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping CartGutter28Width Error>>Expected Result:17px");
			count = count + 1;
		}

		// Verify cell demension 39 has the width of 40px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemension39locator");
			String min_width = this.getCSS(locator, "width");
			System.out.println("Actual Result: " + min_width);
			Assert.assertEquals(CellDemension40Width,min_width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cartcell demension Exception>>Expected Result:65px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cartcell demension Error>>Expected Result:65px");
			count = count + 1;
		}	
				
				// Verify cell demension 39has the width of 85px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemension39locator");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			Assert.assertEquals(CellDemension40Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping CartCellDemension40Height Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping CartCellDemension40Height Error>>Expected Result:85px");
			count = count + 1;
		}			
		
		
	// Verify cell demension 38 has the width of 40px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemension39locator");
			String min_width = this.getCSS(locator, "min-width");
			System.out.println("Actual Result: " + min_width);
			Assert.assertEquals(CellDemension37Width,min_width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cartcell demension 38 Exception>>Expected Result:65px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cartcell demension 38 Error>>Expected Result:65px");
			count = count + 1;
		}	
				
				// Verify cell demension 38 has the width of 85px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemension39locator");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			Assert.assertEquals(CellDemension37Width,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping CartCellDemension38Height Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping CartCellDemension38Height Error>>Expected Result:85px");
			count = count + 1;
		}
	// Verify cell demension 37 has the width of 40px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemension37locator");
			String min_width = this.getCSS(locator, "width");
			System.out.println("Actual Result: " + min_width);
			Assert.assertEquals(CellDemension37Width,min_width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cartcell demension Exception>>Expected Result:65px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cartcell demension Error>>Expected Result:65px");
			count = count + 1;
		}	
				
				// Verify cell demension 37 has the width of 85px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemension37locator");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			Assert.assertEquals(CellDemension37Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cartcell demension 37 Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart cell demension 37 Error>>Expected Result:85px");
			count = count + 1;
		}
		
	// Verify cell gap9 width has the width of 20px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.gap9width");
			String margin_left = this.getCSS(locator, "margin-left");
			System.out.println("Actual Result: " + margin_left);
			Assert.assertEquals(gap9Width,margin_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart gap9 width Exception>>Expected Result:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart c gap9 widthError>>Expected Result:20px");
			count = count + 1;
		}
		
		
	// Verify cell gap9 width has the width of 20px( CheckOut) .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.gap9widthcheckout");
			String margin_left = this.getCSS(locator, "margin-left");
			System.out.println("Actual Result: " + margin_left);
			Assert.assertEquals(gap9Width,margin_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart gap9 width Exception>>Expected Result:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart c gap9 widthError>>Expected Result:20px");
			count = count + 1;
		}
	// Verify gap17Width width has the width of 20px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.gap17width");
			String margin_left = this.getCSS(locator, "margin-left");
			System.out.println("Actual Result: " + margin_left);
			Assert.assertEquals(gap17Width,margin_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart gap9 width Exception>>Expected Result:20px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart c gap9 widthError>>Expected Result:20px");
			count = count + 1;
		}
	
		// Verify Cell demension42 width has the width of 85px (Ship From) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsnion42locatorCN");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			
			Assert.assertEquals(CellDemension42Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:85px");
			count = count + 1;
		}
			
		// Verify Cell demension42 width has the width of 80px (Ship From) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsnion42locatorCN");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result: " + width);
			
			Assert.assertEquals(CellDemension42Width,width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:80px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:80px");
			count = count + 1;
		}
		
		// Verify Cell demension42 width has the width of 85px (Unit price) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsnion42locatorUnitPrice");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			
			Assert.assertEquals(CellDemension42Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:85px");
			count = count + 1;
		}
			
		// Verify Cell demension42 width has the width of 80px (Unit Price) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsnion42locatorUnitPrice");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result: " + width);
			
			Assert.assertEquals(CellDemension42Width,width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:80px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:80px");
			count = count + 1;
		}
		
		// Verify Cell demension42 width has the width of 85px (Unit per MC ) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsnion42locatorUnitPerMC");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			
			Assert.assertEquals(CellDemension42Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:85px");
			count = count + 1;
		}
			
		// Verify Cell demension42 width has the width of 80px (Unit per MC) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsnion42locatorUnitPerMC");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result: " + width);
			
			Assert.assertEquals(CellDemension42Width,width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:80px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:80px");
			count = count + 1;
		}
		
		// Verify Cell demension42 width has the width of 85px (MC price) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsnion42locatorMCPrice");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			
			Assert.assertEquals(CellDemension42Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:85px");
			count = count + 1;
		}
			
		// Verify Cell demension42 width has the width of 80px (MC Price) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsnion42locatorMCPrice");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result: " + width);
			
			Assert.assertEquals(CellDemension42Width,width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:80px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:80px");
			count = count + 1;
		}
		
		// Verify Cell demension42 width has the width of 85px (Avaliable MC QTY) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsnion42locatorAvailableMCQTY");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			
			Assert.assertEquals(CellDemension42Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:85px");
			count = count + 1;
		}
			
		// Verify Cell demension42 width has the width of 80px (Avaliable MC QTY) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsnion42locatorAvailableMCQTY");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result: " + width);
			
			Assert.assertEquals(CellDemension42Width,width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:80px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:80px");
			count = count + 1;
		}
		
		// Verify Cell demension42 width has the width of 85px (MC Ordered) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsnion42locatorMCOrdered");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			
			Assert.assertEquals(CellDemension42Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:85px");
			count = count + 1;
		}
			
		// Verify Cell demension42 width has the width of 80px (MC Ordered) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsnion42locatorMCOrdered");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result: " + width);
			
			Assert.assertEquals(CellDemension42Width,width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:80px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:80px");
			count = count + 1;
		}
		
		// Verify Cell demension37 width has the width of 85px (Total price) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsion37locatortotoalPrice");
			String height = this.getCSS(locator, "height");
			System.out.println("Actual Result: " + height);
			
			Assert.assertEquals(CellDemension37Height,height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Exception>>Expected Result:85px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell demension42 Error>>Expected Result:85px");
			count = count + 1;
		}
			
		// Verify Cell demension37 width has the width of 80px (Total price) .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.celldemsion37locatortotoalPrice");
			String width = this.getCSS(locator, "width");
			System.out.println("Actual Result: " + width);
			
			Assert.assertEquals(CellDemension37Width,width);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell textSpace3Height Exception>>Expected Result:17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell textSpace3Height Error>>Expected Result:17px");
			count = count + 1;
		}
		
		// Verify Cell textSpace3 Height  has the width of 80px () .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.textSpace3Locator");
			String line_height = this.getCSS(locator, "line-height");
			System.out.println("Actual Result: " + line_height);
			
			Assert.assertEquals(textSpace3Height,line_height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell textSpace3 Exception>>Expected Result:17px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell textSpace3 Error>>Expected Result:17px");
			count = count + 1;
		}
		
		// Verify Cell textSpace13 Height  has the width of 80px () .
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.textSpace13locator");
			String line_height = this.getCSS(locator, "line-height");
			System.out.println("Actual Result: " + line_height);
			
			Assert.assertEquals(textSpace3Height,line_height);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart Cell textSpace13 Exception>>Expected Result:7px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart Cell textSpace13 Error>>Expected Result:7px");
			count = count + 1;
		}
	// Verify gutter17Width width has the width of 10px( left image) .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.gutter17widthlocator");
			String padding_left = this.getCSS(locator, "padding-left");
			System.out.println("Actual Result: " + padding_left);
			
			Assert.assertEquals(Gutter17Width,padding_left);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart gutter17Width Exception>>Expected Result:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart cgutter17Width Error>>Expected Result:10px");
			count = count + 1;
		}
		
	// Verify gutter17Width width has the width of 10px( left image) .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.gutter17widthlocator");
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual Result: " + padding_right);
			
			Assert.assertEquals(Gutter17Width,padding_right);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart gutter17Width Exception>>Expected Result:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart gutter17Width Error>>Expected Result:10px");
			count = count + 1;
		}	
		
	// Verify vSpace14Height width has the width of 10px( left image) .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.gutter17widthlocator");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual Result: " + padding_top);
			
			Assert.assertEquals(vSpace14Height,padding_top);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart vSpace14Height Exception>>Expected Result:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart vSpace14Height Error>>Expected Result:10px");
			count = count + 1;
		}
		
	// Verify vSpace14Height width has the width of 10px( right image) .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.gutter17widthlocator");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual Result: " + padding_bottom);
			
			Assert.assertEquals(vSpace14Height,padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart vSpace14Height Exception>>Expected Result:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart vSpace14Height widthError>>Expected Result:10px");
			count = count + 1;
		}
		
		
	// Verify textSpace1Height width has the width of 35px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.textspace1locatorfootercol");
			String height = this.getCSS(locator, "height");
			String locator1 = locatorReader.getLocator("B2B_ShoppingCart.textspace1locatorbutton");
			String height1 = this.getCSS(locator1, "height");
			
			String height_wopx = height.substring(0, 2);
			String height1_wopx = height1.substring(0, 2);
			int getsubpixel = Integer.parseInt(height_wopx)- Integer.parseInt(height1_wopx);
			String getfinalValue=getsubpixel+"px";
			System.out.println("Actual Result:" + getfinalValue);
			Assert.assertEquals(textSpace1Height,getfinalValue);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart textSpace1Height Exception>>Expected Result:35px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart textSpace1HeightwidthError>>Expected Result:35px");
			count = count + 1;
		}
		// Verify v1spacelocatoar has the height of 70px .
		
		try {
			String locator = locatorReader.getLocator("B2B_ShoppingCart.v1spacelocatoarfooter");
			
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual Result: " + margin_top);
			Assert.assertEquals(VSpace1Height,margin_top);
		}

		catch (Exception ex) {
			System.out.println("B2B Shopping Cart v1spacelocatoar Exception>>Expected Result:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("B2B Shopping Cart v1spacelocatoar Error>>Expected Result:70px");
			count = count + 1;
		}		
		
		
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	
	}
	
	
	
		
}

