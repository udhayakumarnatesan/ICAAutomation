/*
 * @author Udhayakumar N
 * Created date: Jan 03,2019
 * Last Edited by: Udhayakumar N
 * Last Edited date: 
 * Description: 
 */

package gov.mst.automation.ica.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import gov.mst.automation.ica.constanturl.Constant;
import gov.mst.automation.ica.excelutility.DataUtils;
import gov.mst.automation.ica.extentreport.Report;

public class IndustrialInjuryFormLink {

	public static WebDriver driver;

	@FindBy(how = How.XPATH, using = ".//a[text()='Part of Body Injured List']")
	public WebElement links;

	@FindBy(how = How.XPATH, using = ".//span[text()='Head - Multiple Head Injury']")
	public WebElement Headmultipleheadinjury;

	@FindBy(how = How.XPATH, using = ".//span[text()='Head - Skull']")
	public WebElement Headskull;

	@FindBy(how = How.XPATH, using = ".//span[text()='Head - Brain']")
	public WebElement Headbrain;

	@FindBy(how = How.XPATH, using = ".//span[text()='Head - Ear(s)']")
	public WebElement Headear;

	@FindBy(how = How.XPATH, using = ".//span[text()='Head - Eyes']")
	public WebElement Headeyes;

	@FindBy(how = How.XPATH, using = ".//span[text()='Head - Nose']")
	public WebElement Headnose;

	@FindBy(how = How.XPATH, using = ".//span[text()='Head - Teeth']")
	public WebElement Headteeth;

	@FindBy(how = How.XPATH, using = ".//span[text()='Head - Mouth']")
	public WebElement Headmouth;

	@FindBy(how = How.XPATH, using = ".//span[text()='Head - Soft Tissue']")
	public WebElement Headsofttissue;

	@FindBy(how = How.XPATH, using = ".//span[text()='Head - Facial Bones']")
	public WebElement Headfacialbones;

	@FindBy(how = How.XPATH, using = ".//span[text()='Head - Multiple Neck Injury']")
	public WebElement Headmultipleneckinjury;

	@FindBy(how = How.XPATH, using = ".//span[text()='Head - Vertebrae']")
	public WebElement Headvertebrae;

	public static void industrialInjuryWebForm(WebDriver driver, String sheetName, String tcID) throws Exception {
		IndustrialInjuryFormLink formlink = PageFactory.initElements(driver, IndustrialInjuryFormLink.class);
		driver.get(Constant.industrialinjuryformurl);
		formlink.links.click();
		Thread.sleep(10000);
		verifyLookupvalue(driver, formlink.Headmultipleheadinjury, DataUtils.readExcel(sheetName, tcID, "Headmultipleheadinjury"));
		formlink.links.click();
		verifyLookupvalue(driver, formlink.Headskull, DataUtils.readExcel(sheetName, tcID, "HeadHeadskull"));
		formlink.links.click();
		verifyLookupvalue(driver, formlink.Headbrain, DataUtils.readExcel(sheetName, tcID, "HeadHeadbrain"));
		formlink.links.click();
		verifyLookupvalue(driver, formlink.Headear, DataUtils.readExcel(sheetName, tcID, "HeadHeadear"));
		formlink.links.click();
		verifyLookupvalue(driver, formlink.Headeyes, DataUtils.readExcel(sheetName, tcID, "HeadHeadeyes"));
		formlink.links.click();
		verifyLookupvalue(driver, formlink.Headnose, DataUtils.readExcel(sheetName, tcID, "HeadHeadnose"));
		formlink.links.click();
		verifyLookupvalue(driver, formlink.Headteeth, DataUtils.readExcel(sheetName, tcID, "HeadHeadteeth"));
		formlink.links.click();
		verifyLookupvalue(driver, formlink.Headmouth, DataUtils.readExcel(sheetName, tcID, "HeadHeadmouth"));
		formlink.links.click();
		verifyLookupvalue(driver, formlink.Headsofttissue, DataUtils.readExcel(sheetName, tcID, "Headsofttissue"));
		formlink.links.click();
		verifyLookupvalue(driver, formlink.Headfacialbones, DataUtils.readExcel(sheetName, tcID, "Headfacialbones"));
		formlink.links.click();
		verifyLookupvalue(driver, formlink.Headmultipleneckinjury, DataUtils.readExcel(sheetName, tcID, "Headmultipleneckinjury"));
		formlink.links.click();
		verifyLookupvalue(driver, formlink.Headvertebrae, DataUtils.readExcel(sheetName, tcID, "Headvertebrae"));
	}

	public static void verifyLookupvalue(WebDriver driver, WebElement ElementID, String excelvalue) throws Exception {
		String parentWindow = driver.getWindowHandle();
		Set<String> totalNumberOfOpenedWindows = driver.getWindowHandles();
		for (String window : totalNumberOfOpenedWindows) {
			if (!parentWindow.equals(window)) {
				driver.switchTo().window(window);
				String ExpectedData = excelvalue;
				String portaldata = ElementID.getText();
				if (portaldata.equals(ExpectedData)) {
					Report.testStepStatus("Value same", "Pass", "The given value is " + ExpectedData
							+ " and lookup value is " + portaldata + " both are same verified");
					
				} else {
					Report.testStepStatus("Value not same", "Fail", "The given value is " + ExpectedData
							+ " and lookup value is " + portaldata + " both are different not verified ");
				}

				driver.close();
				driver.switchTo().window(parentWindow);
			}
		}
	}
	
	

}