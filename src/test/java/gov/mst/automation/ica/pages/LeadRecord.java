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
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id29:CITY']")
	public WebElement employeecity;
	
	

	/*@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id11:j_id32:STATE")
	public WebElement employeestate;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id11:j_id35:ZIPCODE")
	public WebElement employeezipcode;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id11:j_id38:TELEPHONE")
	public WebElement employeetelephone;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id11:j_id41:SEX")
	public WebElement employeesex;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id11:j_id43:MARITALSTATUS")
	public WebElement employeemaritalstatus;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id45:j_id46:EMPLOYERNAME")
	public WebElement employername;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id45:j_id49:FEINNUMBER")
	public WebElement employerfeinnumber;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id45:j_id54:officeadd")
	public WebElement employerofficeaddress;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id45:j_id57:officecity")
	public WebElement employercity;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id45:j_id60:officstate")
	public WebElement employerstate;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id45:j_id63:officzip")
	public WebElement employerzipcode;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id45:j_id66:telephone")
	public WebElement employertelephone;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id69:j_id70:doi")
	public WebElement addateofinjury;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id69:j_id73:empnotif")
	public WebElement addateemployernotified;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id69:j_id78:lastday")
	public WebElement adlastdateofworkafterinjury;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id69:j_id81:1")
	public WebElement adhasemployeereturnedtowork;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id69:j_id85:empcontri")
	public WebElement ademployeeoccupation;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id69:j_id93:empconpre")
	public WebElement addidinjuryoccur;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id69:j_id106:injurill")
	public WebElement adwhatwastheinjury;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id69:j_id109:partofbody")
	public WebElement adpartofbodyinjured;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id111:partofbodyinjury_lkwgt']/img")
	public WebElement adpartofbodyinjurytable;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id118:fatal']")
	public WebElement adfatal;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id69:j_id123:empemergency")
	public WebElement adwasemployeetreatedinanemergencyroom;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id69:j_id136:overnight")
	public WebElement adwasemployeehospitalizedovernight;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id69:j_id149")
	public WebElement adisvalidityclaimdoubted;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id152:j_id153:what")
	public WebElement coawhathappened;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id152:j_id156:whatsus")
	public WebElement coawhatobject;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id152:j_id159:nature_lkwgt']/img")
	public WebElement coanatureofinjury;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id152:j_id164:cause_lkwgt']/img")
	public WebElement coacauseofinjury;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id152:j_id169:empdoing")
	public WebElement coawhatwasemployeedoing;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id152:j_id174:workemp")
	public WebElement coawasworkerinyouremploy;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id152:j_id176:datehire")
	public WebElement coadateoflasthire;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id178:j_id197:datehire")
	public WebElement ewdactualgrossearnings;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id224:j_id225:subemail")
	public WebElement assubmitteremail;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id224:j_id231:j_id233")
	public WebElement uploadfile;

	@FindBy(how = How.NAME, using = "j_id0:j_id5:j_id9:j_id242:j_id244")
	public WebElement iagree;*/
	
	public static void verifyLead(WebDriver driver, String sheetName, String tcID) throws Exception {
		final LeadRecord leadpage = PageFactory.initElements(driver, LeadRecord.class);
		Thread.sleep(10000);
		leadpage.salesforceglobalsearch.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employee Last Name"));
		leadpage.salesforceglobalsearch.sendKeys(Keys.ENTER);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) // Fluent wait
				.withTimeout(30, TimeUnit.SECONDS)
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
		
	}

	public static void verifyApplication(WebElement ElementID, String value) throws Exception {
		String ExpectedData = value;
		String portaldata = ElementID.getText();
		if (portaldata.equals(ExpectedData)) {
			Report.testStepStatus("Value mapped correctly", "Pass", "The value entered in form " + ExpectedData + " and record value is " + portaldata
					+ " both are same verified ");
		} else {
			Report.testStepStatus("Value not mapped correctly", "Fail", "The value entered in form " + ExpectedData + " and record value is " + portaldata
					+ " both are same verified ");
			
		}
	}
}