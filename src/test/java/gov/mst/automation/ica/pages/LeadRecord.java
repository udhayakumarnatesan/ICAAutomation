package gov.mst.automation.ica.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import gov.mst.automation.ica.excelutility.DataUtils;
import gov.mst.automation.ica.extentreport.Report;

public class LeadRecord {

	protected static WebDriver driver;
	
	@FindBy(how = How.XPATH, using = ".//input[@class='slds-input slds-text-color_default slds-p-left--none slds-size--1-of-1 input default input uiInput uiInputTextForAutocomplete uiInput--{remove}']")
	public WebElement salesforceglobalsearch;

	/*@FindBy(how = How.XPATH, using = ".//span[contains(.,'101 No.')]/following::a[1]")
	public WebElement openrecentrecord;*/

	@FindBy(how = How.XPATH, using = ".//span[text()='Last Name']/following::span[1]")
	public WebElement leademployeelastname;

	@FindBy(how = How.XPATH, using = ".//span[text()='First Name']/following::span[1]/span")
	public WebElement leademployeefirstname;

	@FindBy(how = How.XPATH, using = ".//span[text()='Social Security Number']//following::div[2]/span/span[1]")
	public WebElement leademployeesocialsecuritynumber;

	@FindBy(how = How.XPATH, using = ".//span[text()= 'Date of Birth']/following::span[1]/span[1]")
	public WebElement leademployeebirthdate;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Home Address']/following::span[1]")
	public WebElement leademployeehomeaddress;
	
	@FindBy(how = How.XPATH, using = ".//div[7]/div[1]/div/div[1]/span[text()= 'City']/following::span[1]/span")
	public WebElement leademployeecity;
	
	@FindBy(how = How.XPATH, using = ".//div/div[8]/div[1]/div/div[1]/span[text()='State']/following::span[1]/span")
	public WebElement leademployeestate;
	
	@FindBy(how = How.XPATH, using = ".//div/div[9]/div[1]/div/div[1]/span[text()='Zip Code']/following::span[1]/span")
	public WebElement leademployeezipcode;
	
	@FindBy(how = How.XPATH, using = ".//div[10]/div[1]/div/div[1]/span[text()='Telephone']/following::span[1]/span")
	public WebElement leademployeetelephone;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Sex']/following::span[1]/span")
	public WebElement leademployeesex;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Marital Status']/following::span[1]/span")
	public WebElement leademployeemaritalstatus;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Policy Number']/preceding::div[1]/span[1]/span")
	public WebElement leademployername;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='FEIN Number']/following::span[1]/span")
	public WebElement leademployerfeinnumber;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Office Address']/following::span[1]/span")
	public WebElement leademployerofficeaddress;
	
	@FindBy(how = How.XPATH, using = ".//div/div[5]/div[1]/div/div[1]/span[text()='City']/following::span[1]/span")
	public WebElement leademployercity;
	
	@FindBy(how = How.XPATH, using = ".//div/div[6]/div[1]/div/div[1]/span[text()='State']/following::span[1]/span")
	public WebElement leademployerstate;
	
	@FindBy(how = How.XPATH, using = ".//div/div[7]/div[1]/div/div[1]/span[text()='Zip Code']/following::span[1]/span")
	public WebElement leademployerzipcode;
	
	@FindBy(how = How.XPATH, using = ".//div[8]/div[1]/div/div[1]/span[text()='Telephone']/following::span[1]/span")
	public WebElement leademployertelephone;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Date of Injury']//following::div[2]/span/span[1]")
	public WebElement leadaddateofinjury;

	@FindBy(how = How.XPATH, using = ".//span[text()='Date Employer notified of Injury']/following::span[1]/span")
	public WebElement leadaddateemployernotified;

	@FindBy(how = How.XPATH, using = ".//span[text()='Last Day of Work after Injury']/following::span[1]/span")
	public WebElement leadadlastdateofworkafterinjury;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Did Injury occur on Employer Premises?']/following::span[1]/span")
	public WebElement leadaddidinjuryoccur;

	@FindBy(how = How.XPATH, using = ".//span[text()='What was the Injury or Illness?']/following::div[2]/span/span[1]")
	public WebElement leadadwhatwastheinjury;

	@FindBy(how = How.XPATH, using = ".//span[text()='Part of Body Injured']/following::span[1]/span")
	public WebElement leadadpartofbodyinjured;

	@FindBy(how = How.XPATH, using = ".//div/div[15]/div[2]/div/div[1]/span[text()='Part of Body Injured']/following::div[2]/span[1]/div/a")
	public WebElement leadadpartofbodyinjurytable;

	@FindBy(how = How.XPATH, using = ".//span[text()='Fatal']/following::span[1]/span")
	public WebElement leadadfatal;

	@FindBy(how = How.XPATH, using = ".//span[text()='Was EE Treated in an Emergency Room?']/following::div[2]/span[1]/span")
	public WebElement leadadwasemployeetreatedinanemergencyroom;

	@FindBy(how = How.XPATH, using = ".//span[text()='Employee Hospitalized Overnight?']/following::div[2]/span[1]/span")
	public WebElement leadadwasemployeehospitalizedovernight;

	@FindBy(how = How.XPATH, using = ".//span[text()='Is Validity of Claim Doubted?']/following::span[1]/span")
	public WebElement leadadisvalidityclaimdoubted;

	@FindBy(how = How.XPATH, using = ".//span[text()='What Happened?']/following::div[2]/span[1]/span")
	public WebElement leadcoawhathappened;

	@FindBy(how = How.XPATH, using = ".//span[text()='Object/Substance That Harmed the EE?']/following::div[2]/span[1]/span")
	public WebElement leadcoawhatobject;

	@FindBy(how = How.XPATH, using = ".//span[text()='Nature of Injury']/following::div[2]/span[1]/div/a")
	public WebElement leadcoanatureofinjury;

	@FindBy(how = How.XPATH, using = ".//span[text()='Cause of Injury']/following::div[2]/span[1]/div/a")
	public WebElement leadcoacauseofinjury;

	@FindBy(how = How.XPATH, using = ".//span[text()='What Was EE Doing Before Incident?']/following::span[2]/span")
	public WebElement leadcoawhatwasemployeedoing;

	@FindBy(how = How.XPATH, using = ".//span[text()='Was EE in your Employ When Injured?']/following::span[2]/span")
	public WebElement leadcoawasworkerinyouremploy;

	@FindBy(how = How.XPATH, using = ".//span[text()='Date of Last Hire']/following::span[2]")
	public WebElement leadcoadateoflasthire;

	@FindBy(how = How.XPATH, using = ".//span[text()='Submitter Email Address']/following::span[2]")
	public WebElement leadassubmitteremail;
	
	public static void verifyLead(WebDriver driver, String sheetName, String tcID) throws Exception {
		final LeadRecord leadpage = PageFactory.initElements(driver, LeadRecord.class);
		Thread.sleep(10000);
		leadpage.salesforceglobalsearch.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employee Last Name"));
		leadpage.salesforceglobalsearch.sendKeys(Keys.ENTER);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) // Fluent wait
				.withTimeout(50, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);           
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath(".//span[contains(.,'101 No.')]/following::a[1]"));	
			}
		});
		element.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		verifyApplication(leadpage.leademployeelastname, DataUtils.readExcel(sheetName, tcID, "Employee Last Name"));
		verifyApplication(leadpage.leademployeefirstname, DataUtils.readExcel(sheetName, tcID, "Employee First Name"));
		verifyApplication(leadpage.leademployeesocialsecuritynumber, DataUtils.readExcel(sheetName, tcID, "Employee Social Security Number"));
		verifyApplication(leadpage.leademployeebirthdate, DataUtils.readExcel(sheetName, tcID, "Employee Birth Date"));
		verifyApplication(leadpage.leademployeehomeaddress, DataUtils.readExcel(sheetName, tcID, "Employee Home Address"));
		verifyApplication(leadpage.leademployeecity, DataUtils.readExcel(sheetName, tcID, "Employee City"));
		verifyApplication(leadpage.leademployeestate, DataUtils.readExcel(sheetName, tcID, "Employee State"));
		verifyApplication(leadpage.leademployeezipcode, DataUtils.readExcel(sheetName, tcID, "Employee Zipcode"));
		verifyApplication(leadpage.leademployeetelephone, DataUtils.readExcel(sheetName, tcID, "Employee Telephone"));
		verifyApplication(leadpage.leademployeesex, DataUtils.readExcel(sheetName, tcID, "Employee Sex"));
		verifyApplication(leadpage.leademployeemaritalstatus, DataUtils.readExcel(sheetName, tcID, "Marital Status"));
		verifyApplication(leadpage.leademployername, DataUtils.readExcel(sheetName, tcID, "Employer Name"));
		verifyApplication(leadpage.leademployerfeinnumber, DataUtils.readExcel(sheetName, tcID, "Employer Fein Number"));
		verifyApplication(leadpage.leademployerofficeaddress, DataUtils.readExcel(sheetName, tcID, "Employer Office Address"));
		verifyApplication(leadpage.leademployercity, DataUtils.readExcel(sheetName, tcID, "Employer City"));
		verifyApplication(leadpage.leademployerstate, DataUtils.readExcel(sheetName, tcID, "Employer State"));
		verifyApplication(leadpage.leademployerzipcode, DataUtils.readExcel(sheetName, tcID, "Employer Zipcode"));
		verifyApplication(leadpage.leademployertelephone, DataUtils.readExcel(sheetName, tcID, "Employer Telephone"));
		verifyApplication(leadpage.leadaddateofinjury, DataUtils.readExcel(sheetName, tcID, "AD Date of Injury"));
		verifyApplication(leadpage.leadaddateemployernotified, DataUtils.readExcel(sheetName, tcID, "AD Date Employer Notified of Injury"));
		verifyApplication(leadpage.leadadlastdateofworkafterinjury, DataUtils.readExcel(sheetName, tcID, "AD Last Date of Work After Injury"));
		verifyApplication(leadpage.leadaddidinjuryoccur, DataUtils.readExcel(sheetName, tcID, "Did Injury Occur"));
		verifyApplication(leadpage.leadadwhatwastheinjury, DataUtils.readExcel(sheetName, tcID, "AD What was the Injury"));
		verifyApplication(leadpage.leadadpartofbodyinjured, DataUtils.readExcel(sheetName, tcID, "AD Part of the Body Injured"));
		verifyApplication(leadpage.leadadpartofbodyinjurytable, DataUtils.readExcel(sheetName, tcID, "AD Part of the Body Injury Table"));
		verifyApplication(leadpage.leadadfatal, DataUtils.readExcel(sheetName, tcID, "ADFatal"));
		verifyApplication(leadpage.leadadwasemployeetreatedinanemergencyroom, DataUtils.readExcel(sheetName, tcID, "AD Was Employee Treated in an Emergency Room"));
		verifyApplication(leadpage.leadadwasemployeehospitalizedovernight, DataUtils.readExcel(sheetName, tcID, "AD Was Employee Hospitalized Overnight"));
		verifyApplication(leadpage.leadadisvalidityclaimdoubted, DataUtils.readExcel(sheetName, tcID, "AD Is Validity Claim Doubted"));
		verifyApplication(leadpage.leadcoawhathappened, DataUtils.readExcel(sheetName, tcID, "COA What happened"));
		verifyApplication(leadpage.leadcoawhatobject, DataUtils.readExcel(sheetName, tcID, "COA What object"));
		verifyApplication(leadpage.leadcoanatureofinjury, DataUtils.readExcel(sheetName, tcID, "COA Nature of Injury"));
		verifyApplication(leadpage.leadcoacauseofinjury, DataUtils.readExcel(sheetName, tcID, "COA Cause of Injury"));
		verifyApplication(leadpage.leadcoawhatwasemployeedoing, DataUtils.readExcel(sheetName, tcID, "COA What was the Employee Doing Just Before the Incidient"));
		verifyApplication(leadpage.leadcoawasworkerinyouremploy, DataUtils.readExcel(sheetName, tcID, "COA Was Worker in Your Employ"));
		verifyApplication(leadpage.leadcoadateoflasthire, DataUtils.readExcel(sheetName, tcID, "COA Date of Last Hire"));
		verifyApplication(leadpage.leadassubmitteremail, DataUtils.readExcel(sheetName, tcID, "AS Submitter Email Address"));
	}

	public static void verifyApplication(WebElement ElementID, String value) throws Exception {
		String ExpectedData = value;
		String portaldata = ElementID.getText();
		if (portaldata.equals(ExpectedData)) {
			Report.testStepStatus("Value mapped correctly", "Pass", "The value entered in form " + ExpectedData + " and record value is " + portaldata + " both are same verified");
		} else {
			Report.testStepStatus("Value not mapped correctly", "Fail", "The value entered in form " + ExpectedData + " and record value is " + portaldata + " both are different not verified ");
			
		}
	}
}