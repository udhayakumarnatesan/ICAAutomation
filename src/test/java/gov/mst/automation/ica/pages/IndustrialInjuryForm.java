/*
 * @author Udhayakumar N
 * Created date: Nov 20,2018
 * Last Edited by: Udhayakumar N
 * Last Edited date: 
 * Description: 
 */

package gov.mst.automation.ica.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import gov.mst.automation.ica.constanturl.Constant;
import gov.mst.automation.ica.email.EmailVerify;
import gov.mst.automation.ica.excelutility.DataUtils;
import gov.mst.automation.ica.extentreport.Report;
import gov.mst.automation.ica.screenshotutility.ScreenShotCapture;

public class IndustrialInjuryForm {

	public static WebDriver driver;

	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[2]/table/tbody/tr/td/form/div[2]/div/div/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[1]/div/input")
	public WebElement employeelastname;

	@FindBy(how = How.XPATH, using = ".//*[@name='j_id0:j_id5:j_id9:j_id11:j_id15:first']")
	public WebElement employeefirstname;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id20:social']")
	public WebElement employeesocialsecuritynumber;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id23:birth']")
	public WebElement employeebirthdate;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id26:home']")
	public WebElement employeehomeaddress;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id29:CITY']")
	public WebElement employeecity;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id11:j_id32:STATE")
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
	public WebElement iagree;

	@FindBy(how = How.CLASS_NAME, using = "btn")
	public WebElement submit;

	public IndustrialInjuryForm(WebDriver driver) {
		this.driver = driver;
	}

	/* This method is used to submit the Employer report form */
	public static void industrialInjuryWebForm(WebDriver driver, String sheetName, String tcID) throws Exception {
		IndustrialInjuryForm form = PageFactory.initElements(driver, IndustrialInjuryForm.class);
		driver.get(Constant.industrialinjuryformurl);
		ScreenShotCapture.captureScreenshot(driver, "Industrialform");
		form.employeelastname.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employee Last Name"));
		form.employeefirstname.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employee First Name"));
		form.employeesocialsecuritynumber.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employee Social Security Number"));
		form.employeebirthdate.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employee Birth Date"));
		form.employeehomeaddress.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employee Home Address"));
		form.employeecity.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employee City"));
		form.employeestate.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employee State"));
		form.employeezipcode.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employee Zipcode"));
		form.employeetelephone.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employee Telephone"));
		selectDropdown(form.employeesex, DataUtils.readExcel(sheetName, tcID, "Employee Sex"));
		selectDropdown(form.employeemaritalstatus, DataUtils.readExcel(sheetName, tcID, "Marital Status"));
		form.employername.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employer Name"));
		form.employerfeinnumber.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employer Fein Number"));
		form.employerofficeaddress.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employer Office Address"));
		form.employercity.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employer City"));
		form.employerstate.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employer State"));
		form.employerzipcode.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employer Zipcode"));
		form.employertelephone.sendKeys(DataUtils.readExcel(sheetName, tcID, "Employer Telephone"));
		form.addateofinjury.sendKeys(DataUtils.readExcel(sheetName, tcID, "AD Date of Injury"));
		form.addateemployernotified.sendKeys(DataUtils.readExcel(sheetName, tcID, "AD Date Employer Notified of Injury"));
		form.adlastdateofworkafterinjury.sendKeys(DataUtils.readExcel(sheetName, tcID, "AD Last Date of Work After Injury"));
		form.adhasemployeereturnedtowork.click();
		form.ademployeeoccupation.sendKeys(DataUtils.readExcel(sheetName, tcID, "AD Employee Occupation"));
		selectDropdown(form.addidinjuryoccur, DataUtils.readExcel(sheetName, tcID, "Did Injury Occur"));
		form.adwhatwastheinjury.sendKeys(DataUtils.readExcel(sheetName, tcID, "AD What was the Injury"));
		form.adpartofbodyinjured.sendKeys(DataUtils.readExcel(sheetName, tcID, "AD Part of the Body Injured"));
		lookupWindowHandler(form.adpartofbodyinjurytable, "Head - Brain");
		selectDropdown(form.adfatal, DataUtils.readExcel(sheetName, tcID, "ADFatal"));
		selectDropdown(form.adwasemployeetreatedinanemergencyroom, DataUtils.readExcel(sheetName, tcID, "AD Was Employee Treated in an Emergency Room"));
		selectDropdown(form.adwasemployeehospitalizedovernight, DataUtils.readExcel(sheetName, tcID, "AD Was Employee Hospitalized Overnight"));
		selectDropdown(form.adisvalidityclaimdoubted, DataUtils.readExcel(sheetName, tcID, "AD Is Validity Claim Doubted"));
		form.coawhathappened.sendKeys(DataUtils.readExcel(sheetName, tcID, "COA What happened"));
		form.coawhatobject.sendKeys(DataUtils.readExcel(sheetName, tcID, "COA What object"));
		lookupWindowHandler(form.coanatureofinjury, "Specific Injury - Laceration");
		lookupWindowHandler(form.coacauseofinjury, "Motor Vehicle - Vehicle Upset");
		form.coawhatwasemployeedoing.sendKeys(DataUtils.readExcel(sheetName, tcID, "COA What was the Employee Doing Just Before the Incidient"));
		selectDropdown(form.coawasworkerinyouremploy, DataUtils.readExcel(sheetName, tcID, "COA Was Worker in Your Employ"));
		form.coadateoflasthire.sendKeys(DataUtils.readExcel(sheetName, tcID, "COA Date of Last Hire"));
		form.ewdactualgrossearnings.sendKeys(DataUtils.readExcel(sheetName, tcID, "EWD Actual Gross Earnings of Employee"));
		form.assubmitteremail.sendKeys(DataUtils.readExcel(sheetName, tcID, "AS Submitter Email Address"));
		WebElement fileInput = driver.findElement(By.id("j_id0:j_id5:j_id9:j_id224:j_id231:j_id233"));
		fileInput.sendKeys(Constant.uploadfile);
		form.iagree.click();
		form.submit.click();
		System.out.println("Induatrial Injury Form submitted successfully");
		Report.testStepStatus("Employer's form submitted successfully", "Pass", "Employer's form");
		EmailVerify.emailVerify();
	}

	/* This method is used for Picklist dropdown */
	public static void selectDropdown(WebElement Dropdownname, String Value) {
		Select Picklist = new Select(Dropdownname);
		Picklist.selectByValue(Value);
	}

	/* This method is used for Window Handler */
	public static void lookupWindowHandler(WebElement lookupIcon, String value) throws InterruptedException {
		lookupIcon.click();
		String parentWindow = driver.getWindowHandle();
		Set<String> totalNumberOfOpenedWindows = driver.getWindowHandles();
		for (String window : totalNumberOfOpenedWindows) {
			if (!parentWindow.equals(window)) {
				driver.switchTo().window(window);
				driver.switchTo().frame("searchFrame");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath(".//*[@id='lksrch']")).sendKeys(value);
				driver.findElement(By.name("go")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.switchTo().defaultContent();
				driver.switchTo().frame("resultsFrame");
				driver.findElement(By.cssSelector(".dataCell")).click();
			}
		}
		driver.switchTo().window(parentWindow);
	}
}
