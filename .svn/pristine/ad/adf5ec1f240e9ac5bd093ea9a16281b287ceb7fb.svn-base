/*==============================================================================================================================
File Name    : MG_Partner_Page_Helper.java
ClassName    : MG_Partner_Page_Helper
Summary      : Contains helping methods for MG_Partner_Helper Page.
===============================================================================================================================
History      :   Company            Created By     
	  360logica                         

===============================================================================================================================
Remarks      :   Tests - 
===============================================================================================================================*/

package test.java.com.MusicGroup.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test.java.com.MusicGroup.locators.LocatorReader;
import test.java.com.MusicGroup.util.DriverHelper;

public class MG_Partner_Page_Helper extends DriverHelper {
	private LocatorReader locatorReader;

	public MG_Partner_Page_Helper(WebDriver driver) {
		super(driver);
		locatorReader = new LocatorReader("MG_Partner_Page.xml");
	}

	public void clickMenuIcon() {
		String locator = locatorReader.getLocator("MGPartnerPage.MenuIcon");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		System.out.println("Function executed");
		
	}

	// Click on a brand
	public void Clickonbrandsdisplayedonmenu() {
		String locator = locatorReader.getLocator("MGPartnerPage.ClickonBehringer");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		this.WaitForElementEnabled(locator, 50);
		System.out.println(" Brand Display Menus");
	}

	//Click first product displayed on Product Home Page
	public void CliclFirstProduct()
	{
		String locator = locatorReader.getLocator("MGPartnerPage.ClickFirstProduct");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		this.WaitForElementEnabled(locator, 50);
		System.out.println(" Click First product");
	}
	//Click feature menu displayed
	public void CliclFeaturemenu()
	{
		String locator = locatorReader.getLocator("MGPartnerPage.ClickFeatureMenu");
		this.WaitForElementEnabled(locator, 10);
		clickOn(locator);
		System.out.println(" Click Feature Menu");
	}
	//Click Warranty Link
	public void CliclWarrantyLink()
	{
		String locator = locatorReader.getLocator("MGPartnerPage.ClickWarrantyLink");
		this.WaitForElementEnabled(locator,10);
		clickOn(locator);
		System.out.println(" ClicK Warranty Menu");
	}
	//Click Partner Link
	public void CliclPartnerLink()
	{
		String locator = locatorReader.getLocator("MGPartnerPage.ClickPartnerLink");
		this.WaitForElementEnabled(locator, 50);
		clickOn(locator);
		System.out.println(" ClicK Partner Menu");
	}		
	// enter the product "X32" text in search field
	public void EnterProductinSearchField() {
		String locator = locatorReader.getLocator("MGPartnerPage.searchproduct");
		this.WaitForElementEnabled(locator, 10);
		String val = "X32";
		clickOn(locator);
		sendKeys(locator, val);
		presEnterKey(locator);

	}

	// click on Partner link displayed on search page
	public void ClickonPartnerLink() {
		String locator = locatorReader.getLocator("MGPartnerPage.ClickonPartnerLink");
		this.WaitForElementEnabled(locator, 10);
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
	// Reach upto MG Partner page
	public void ReachUptoPartnerPage() {
		// Click on the Menu icon
		this.clickMenuIcon();
		// Click on a brand
		this.Clickonbrandsdisplayedonmenu();
		// enter the product "Partner" text in search field
		//this.EnterProductinSearchField();
		// Then we click on Partner link displayed on search page
	//	this.ClickonPartnerLink();
		
		// enter the product "Partner" text in search field
		this.EnterProductinSearchField();
		//Click First product Displayed
		this.CliclFirstProduct();
		
		//Click Feature Link
		this.CliclFeaturemenu();
		//Click Warranty Link
		this.CliclWarrantyLink();
		//Click Partner Link
		this.CliclPartnerLink();
		
		//Check page not found
		this.checkPageNotFound();

	}

	// Verify MG Partner page
	public void verifyMGPartnerPage(String vSpace14Height,String gap17width, String vspace1height,String vSpace4Height, String Textspace4Height,String Textspace13Height, String vSpace16Height)
	{

		 ReachUptoPartnerPage();
		int count = 0;

		// Verify vSpace1Height has the height of 70px.
		try {
			String locator = locatorReader.getLocator("MGPartnerPage.vspace1heightlocator");
			String margin_top = this.getCSS(locator, "margin-top");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			// Substring: To remove pixel(px text) from value
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("3");
			
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel;
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(vspace1height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace1Height Exception>>Expected Margin Top:70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace1Height Error>>Expected Width:70px");
			count = count + 1;
		}

		//  Verify vSpace4Height has the height of 40px(Above table).
		try {
			String locator = locatorReader.getLocator("MGPartnerPage.vspace1heightlocator");
			String margin_top = this.getCSS(locator, "margin-bottom");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			// Substring: To remove pixel(px text) from value
			String margin_top_wopx = margin_top.substring(0, 2);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			
			int Totaladdedpixel = Integer.parseInt(margin_top_wopx)+ getsubpixel+Integer.parseInt("21");
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			
			Assert.assertEquals(vSpace4Height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace4Height Exception>>Expected Margin bottom:40px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace4Height Error>>Expected Width:40px");
			count = count + 1;
		}

	//  Verify vSpace14Height has the height of 10px(Above Country Text).
		try {
			String locator = locatorReader.getLocator("MGPartnerPage.vSpace10HeightCountry");
			String padding_top = this.getCSS(locator, "padding-top");
			String line_height = this.getCSS(locator, "line-height");
			String font_size = this.getCSS(locator, "font-size");
			
			
			// Substring: To remove pixel(px text) from value
			String padding_top_wopx = padding_top.substring(0, 1);
			String line_height_wopx = line_height.substring(0, 2);
			String font_size_wopx = font_size.substring(0, 2);
			
			
			int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
			int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+ getsubpixel;
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			
			Assert.assertEquals(vSpace14Height, Totalpixelvaluewithpixel);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace14Height Exception>>Expected Result:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace14Height Error>>Expected Result:10px");
			count = count + 1;
		}
	//  Verify vSpace14Height has the height of 10px(Below Country Text).
			try {
				String locator = locatorReader.getLocator("MGPartnerPage.vSpace10HeightCountry");
				String padding_top = this.getCSS(locator, "padding-bottom");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				// Substring: To remove pixel(px text) from value
				String padding_top_wopx = padding_top.substring(0, 1);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)-Integer.parseInt("1");
				
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+ getsubpixel;
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				Assert.assertEquals(vSpace14Height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("Partner Page vSpace14Height Exception>>Expected Result:10px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Partner Page vSpace14Height Error>>Expected Result:10px");
				count = count + 1;
			}
		//  Verify vSpace14Height has the height of 10px(Above Company Text).
			try {
				String locator = locatorReader.getLocator("MGPartnerPage.vSpace10HeightCompany");
				String padding_top = this.getCSS(locator, "padding-top");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				// Substring: To remove pixel(px text) from value
				String padding_top_wopx = padding_top.substring(0, 1);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
				
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+ getsubpixel;
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				Assert.assertEquals(vSpace14Height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("Partner Page vSpace14Height Exception>>Expected Result:10px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Partner Page vSpace14Height Error>>Expected Result:10px");
				count = count + 1;
			}
		//  Verify vSpace14Height has the height of 10px(Below Company Text).
			try {
				String locator = locatorReader.getLocator("MGPartnerPage.vSpace10HeightCompany");
				String padding_top = this.getCSS(locator, "padding-bottom");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				// Substring: To remove pixel(px text) from value
				String padding_top_wopx = padding_top.substring(0, 1);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)-Integer.parseInt("1");
				
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+ getsubpixel;
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				
				Assert.assertEquals(vSpace14Height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("Partner Page vSpace14Height Exception>>Expected Result:10px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Partner Page vSpace14Height Error>>Expected Result:10px");
				count = count + 1;
			}
		//  Verify vSpace16Height has the height of 14px(Above Argentina Text).
			try {
				String locator = locatorReader.getLocator("MGPartnerPage.vSpace16HeightArgentina");
				String padding_top = this.getCSS(locator, "padding-top");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				// Substring: To remove pixel(px text) from value
				String padding_top_wopx = padding_top.substring(0, 1);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
				
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+ getsubpixel+Integer.parseInt("1");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				System.out.println("vSpace16Height" + vSpace16Height);
				Assert.assertEquals(vSpace16Height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("Partner Page vSpace16Height Exception>>Expected Result:16px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Partner Page vSpace16Height Error>>Expected Result:16px");
				count = count + 1;
			}
		//  Verify gap17width has the height of 10px(Argintina).
			try {
				String locator = locatorReader.getLocator("MGPartnerPage.vSpace16HeightArgentina");
				String padding_right = this.getCSS(locator, "padding-right");
				System.out.println("Actual result" + padding_right);
				System.out.println("gap17width" + gap17width);
				Assert.assertEquals(gap17width, padding_right);
			}

			catch (Exception ex) {
				System.out.println("Partner Page gap17width Exception>>Expected Result:10px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Partner Page gap17width Error>>Expected Result:10px");
				count = count + 1;
			}
		//  Verify vSpace16Height has the height of 14px(Above Teveam Argentina Text).
			try {
				String locator = locatorReader.getLocator("MGPartnerPage.vSpace16HeightArgintina2col");
				String padding_top = this.getCSS(locator, "padding-top");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				// Substring: To remove pixel(px text) from value
				String padding_top_wopx = padding_top.substring(0, 1);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx);
				
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+ getsubpixel+Integer.parseInt("1");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				System.out.println("vSpace16Height" + vSpace16Height);
				Assert.assertEquals(vSpace16Height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("Partner Page vSpace16Height Exception>>Expected Result:16px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Partner Page vSpace16Height Error>>Expected Result:16px");
				count = count + 1;
			}
		//  Verify gap17width has the height of 10px(Argintina).
			try {
				String locator = locatorReader.getLocator("MGPartnerPage.vSpace16HeightArgintina2col");
				String padding_right = this.getCSS(locator, "padding-right");
				System.out.println("Actual result" + padding_right);
				System.out.println("gap17width" + gap17width);
				Assert.assertEquals(gap17width, padding_right);
			}

			catch (Exception ex) {
				System.out.println("Partner Page gap17width Exception>>Expected Result:10px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Partner Page gap17width Error>>Expected Result:10px");
				count = count + 1;
			}
		//  Verify gap17width has the height of 10px(Argintina).
			try {
				String locator = locatorReader.getLocator("MGPartnerPage.vSpace16HeightArgintina2col");
				String padding_right = this.getCSS(locator, "padding-left");
				System.out.println("Actual result" + padding_right);
				System.out.println("gap17width" + gap17width);
				Assert.assertEquals(gap17width, padding_right);
			}

			catch (Exception ex) {
				System.out.println("Partner Page gap17width Exception>>Expected Result:10px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Partner Page gap17width Error>>Expected Result:10px");
				count = count + 1;
			}
		//  Verify Textspace4Height has the height of 22px(1 Row last col).
			try {
				String locator = locatorReader.getLocator("MGPartnerPage.TextSpace4Height2dd");
				String padding_top = this.getCSS(locator, "margin-top");
				String line_height = this.getCSS(locator, "line-height");
				String font_size = this.getCSS(locator, "font-size");
				
				// Substring: To remove pixel(px text) from value
				String padding_top_wopx = padding_top.substring(0, 1);
				String line_height_wopx = line_height.substring(0, 2);
				String font_size_wopx = font_size.substring(0, 2);
				
				int getsubpixel=Integer.parseInt(line_height_wopx)- Integer.parseInt(font_size_wopx)+Integer.parseInt("2");
				String locator1 = locatorReader.getLocator("MGPartnerPage.TextSpace4Height2dd");
				
				String line_height1 = this.getCSS(locator1, "line-height");
				String font_size1 = this.getCSS(locator1, "font-size");
				
				// Substring: To remove pixel(px text) from value
			
				String line_height_wopx1 = line_height1.substring(0, 2);
				String font_size_wopx1 = font_size1.substring(0, 2);
				
				int getsubpixel1=Integer.parseInt(line_height_wopx1)- Integer.parseInt(font_size_wopx1)+Integer.parseInt("2");

				
				int Totaladdedpixel = Integer.parseInt(padding_top_wopx)+ getsubpixel1+getsubpixel+Integer.parseInt("1");
				String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
				System.out.println("Actual result" + Totalpixelvaluewithpixel);
				System.out.println("vSpace16Height" + vSpace16Height);
				Assert.assertEquals(Textspace4Height, Totalpixelvaluewithpixel);
			}

			catch (Exception ex) {
				System.out.println("Partner Page Textspace4Height Exception>>Expected Result:22px");
				count = count + 1;
			} catch (Error ex) {
				System.out.println("Partner Page Textspace4Height Error>>Expected Result:22px");
				count = count + 1;
			}			

			/*	//  Verify vSpace14Height has the height of 10px(above country text in a table).
		try {
			String locator = locatorReader.getLocator("MGPartnerPage.vSpace14Hight");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual result" + padding_top);
			Assert.assertEquals(vSpace14Height, padding_top);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace14Height Exception>>Expected padding Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace14Height Error>>Expected Width:10px");
			count = count + 1;
		}
		//  Verify vSpace14Height has the height of 10px(below country text with in a table column).
		try {
			String locator = locatorReader.getLocator("MGPartnerPage.vSpace14Hight");
			String padding_bottom = this.getCSS(locator, "padding-bottom");
			System.out.println("Actual result" + padding_bottom);
			Assert.assertEquals(vSpace14Height, padding_bottom);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace14Height Exception>>Expected padding Bottom:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace14Height Error>>Expected Padding:10px");
			count = count + 1;
		}
		//  Verify vSpace16Height has the height of 14px(above Argintina in a table).
		try {
			String locator = locatorReader.getLocator("MGPartnerPage.vSpace14Hight");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual result" + padding_top);
			Assert.assertEquals(vSpace16Height, padding_top);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace16Height Exception>>Expected padding Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace16Height Error>>Expected Width:10px");
			count = count + 1;
		}
		//  Verify TextSpace4Height has the height of 22px.
		try {
			String locator = locatorReader.getLocator("MGPartnerPage.vTextSpace4Heightlocator");
			String margin_top = this.getCSS(locator, "margin-top");
			System.out.println("Actual result" + margin_top);
			Assert.assertEquals(Textspace4Height, margin_top);
		} catch (Exception ex) {
			System.out.println("Partner Page vTextSpace4Height Exception>>Expected Margin Top:22px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vTextSpace4Height Error>>Expected Margin:22px");
			count = count + 1;
		}

		// Verify TextSpace13Height has the height of 7px.
		try {
			String locator = locatorReader.getLocator("MGPartnerPage.vTextSpace13Heightlocator");
			String locatorspanright = locatorReader.getLocator("MGPartnerPage.vTextspace17Height2spanlocator");
			String line_hight = this.getCSS(locator, "line-height");
			String margin_top = this.getCSS(locatorspanright, "margin-top");
			// Substring: To remove pixel(px text) from value
			String LineHeightLocatorValue = line_hight.substring(0, 2);
			String MArginTopLocatorValue = margin_top.substring(0, 2);
			int finalTextSpace13Heightpixel = Integer.parseInt(MArginTopLocatorValue)- Integer.parseInt(LineHeightLocatorValue);
			String Totalpixelvaluewithpixel = finalTextSpace13Heightpixel+ "px";
			System.out.println("Actual result" + Totalpixelvaluewithpixel);
			Assert.assertEquals(Textspace13Height, Totalpixelvaluewithpixel);
		} 
		catch (Exception ex) {
			System.out.println("Partner Page TextSpace13Height Exception>>Expected Line Hight:7px");
			count = count + 1;
		} 
		catch (Error ex) {
			System.out.println("Partner Page TextSpace13Height Error>>Expected Line Hight:7px");
			count = count + 1;
		}

		//  Verify Gap17 has the width of 10px.
		try {
			String locator = locatorReader.getLocator("MGPartnerPage.gap17widthlocator");
			String padding_right = this.getCSS(locator, "padding-right");
			System.out.println("Actual result" + padding_right);
			Assert.assertEquals(gap17widthlocator, padding_right);
		} catch (Exception ex) {
			System.out.println("Partner Page page Gap17 Exception>>Expected PAdding Left:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page Page Gap17 Error>>Expected PAdding Left:10px");
			count = count + 1;
		}
		//  Verify vSpace16Height has the height of 14px(above Belarus in a table).
		try {
			String locator = locatorReader.getLocator("MGPartnerPage.vSpace16HeightLocatorBelarus");
			String padding_top = this.getCSS(locator, "padding-top");
			System.out.println("Actual result" + padding_top);
			Assert.assertEquals(vSpace16Height, padding_top);
		}

		catch (Exception ex) {
			System.out.println("Partner Page vSpace16Height Exception>>Expected padding Top:10px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vSpace16Height Error>>Expected Width:10px");
			count = count + 1;
		}

		//  Verify vspace1height has the height of 70px.
		try {
			String locator = locatorReader.getLocator("MGPartnerPage.vspace1hightlocatoronfooter");
			String locatortable = locatorReader.getLocator("MGPartnerPage.vspaceh1hightlocatortable");
			String locator24Span = locatorReader.getLocator("MGPartnerPage.vspace1heightlocatorspan24");
			String padding_right = this.getCSS(locator, "line-height");
			String padding_top = this.getCSS(locator, "padding-top");
			String span24MarginBottom = this.getCSS(locator, "margin-bottom");
			// Substring: To remove pixel(px text) from value
			String padtop = padding_top.substring(0, 1);
			String padRight = padding_right.substring(0, 2);
			String span24Value = span24MarginBottom.substring(0, 2);
			int Totaladdedpixel = Integer.parseInt(padtop)+ Integer.parseInt(padRight)+ Integer.parseInt(span24Value);
			String Totalpixelvaluewithpixel = Totaladdedpixel + "px";
			System.out.println("Actual result" + padding_top);
			Assert.assertEquals(vspace1height, Totalpixelvaluewithpixel);
		} catch (Exception ex) {
			System.out.println("Partner Page vspace1height Exception>>Expected Top :70px");
			count = count + 1;
		} catch (Error ex) {
			System.out.println("Partner Page vspace1height Error>>Expected Top:10px");
			count = count + 1;
		}
*/
		// Verify the final result
		System.out.println("count value is :::" + count);
		Assert.assertTrue(count == 0);
	}

}
