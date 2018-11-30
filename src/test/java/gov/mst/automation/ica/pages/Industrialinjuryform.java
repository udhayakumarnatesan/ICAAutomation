/*
 * @author Udhayakumar N
 * Created date: Nov 20,2018
 * Last Edited by: Udhayakumar N
 * Last Edited date: 
 * Description: 
 */

package gov.mst.automation.ica.pages;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import gov.mst.automation.ica.constant.Constanturl;
import gov.mst.automation.ica.excelutility.Readexcel;

public class Industrialinjuryform {

	public WebDriver driver;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id14:j_id15:last")
	public WebElement employeelastname;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id14:j_id18:first")
	public WebElement employeefirstname;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id14:j_id23:social")
	public WebElement employeesocialsecuritynumber;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id14:j_id26:birth")
	public WebElement employeebirthdate;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id14:j_id29:home")
	public WebElement employeehomeaddress;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id14:j_id32:CITY")
	public WebElement employeecity;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id14:j_id35:STATE")
	public WebElement employeestate;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id14:j_id38:ZIPCODE")
	public WebElement employeezipcode;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id14:j_id41:TELEPHONE")
	public WebElement employeetelephone;
	
	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id14:j_id44:SEX")
	public WebElement employeesex;
	
	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id14:j_id46:MARITALSTATUS")
	public WebElement employeemaritalstatus;
	
	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id48:j_id49:EMPLOYERNAME")
	public WebElement employername;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id48:j_id52:FEINNUMBER")
	public WebElement employerfeinnumber;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id48:j_id57:officeadd")
	public WebElement employerofficeaddress;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id48:j_id60:officecity")
	public WebElement employercity;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id48:j_id63:officstate")
	public WebElement employerstate;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id48:j_id66:officzip")
	public WebElement employerzipcode;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id48:j_id69:telephone")
	public WebElement employertelephone;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id72:j_id73:doi")
	public WebElement addateofinjury;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id72:j_id76:empnotif")
	public WebElement addateemployernotified;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id72:j_id81:lastday")
	public WebElement adlastdateofworkafterinjury;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id72:j_id84:1")
	public WebElement adhasemployeereturnedtowork;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id72:j_id88:empcontri")
	public WebElement ademployeeoccupation;
	
	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id72:j_id96:empconpre")
	public WebElement addidinjuryoccur;
	
	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id72:j_id109:injurill")
	public WebElement adwhatwastheinjury;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id72:j_id112:partofbody")
	public WebElement adpartofbodyinjured;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id72:j_id121:fatal']")
	public WebElement adfatal;
	
	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id72:j_id126:empemergency")
	public WebElement adwasemployeetreatedinanemergencyroom;
	
	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id72:j_id139:overnight")
	public WebElement adwasemployeehospitalizedovernight;
	
	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id72:j_id152")
	public WebElement adisvalidityclaimdoubted;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id155:j_id156:what")
	public WebElement coawhathappened;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id155:j_id159:whatsus")
	public WebElement coawhatobject;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id155:j_id172:empdoing")
	public WebElement coawhatwasemployeedoing;
	
	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id155:j_id177:workemp")
	public WebElement coawasworkerinyouremploy;
	
	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id155:j_id179:datehire")
	public WebElement coadateoflasthire;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id181:j_id200:datehire")
	public WebElement ewdactualgrossearnings;

	@FindBy(how = How.ID, using = "j_id0:j_id5:j_id9:j_id227:j_id228:subemail")
	public WebElement assubmitteremail;

	@FindBy(how = How.NAME, using = "j_id0:j_id5:j_id9:j_id247")
	public WebElement iagree;

	@FindBy(how = How.CLASS_NAME, using = "btn")
	public WebElement submit;

	public Industrialinjuryform(WebDriver driver) {
		this.driver = driver;
	}
	
	/*This method is used to submit the Employer report form*/
	public static void Industrialinjurywebform(WebDriver driver, String tcname) throws Exception {
		Industrialinjuryform form = PageFactory.initElements(driver, Industrialinjuryform.class);
		driver.get(Constanturl.industrialinjuryformurl);
		form.employeelastname.sendKeys(Readexcel.readData(tcname, "Employee Last Name"));
		form.employeefirstname.sendKeys(Readexcel.readData(tcname, "Employee First Name"));
		form.employeesocialsecuritynumber.sendKeys(Readexcel.readData(tcname, "Employee Social Security Number"));
		form.employeebirthdate.sendKeys(Readexcel.readData(tcname, "Employee Birth Date"));
		form.employeehomeaddress.sendKeys(Readexcel.readData(tcname, "Employee Home Address"));
		form.employeecity.sendKeys(Readexcel.readData(tcname, "Employee City"));
		form.employeestate.sendKeys(Readexcel.readData(tcname, "Employee State"));
		form.employeezipcode.sendKeys(Readexcel.readData(tcname, "Employee Zipcode"));
		form.employeetelephone.sendKeys(Readexcel.readData(tcname, "Employee Telephone"));
		selectDropdown(form.employeesex,"Male");
		selectDropdown(form.employeemaritalstatus,"Single");
		form.employername.sendKeys(Readexcel.readData(tcname, "Employer Name"));
		form.employerfeinnumber.sendKeys(Readexcel.readData(tcname, "Employer Fein Number"));
		form.employerofficeaddress.sendKeys(Readexcel.readData(tcname, "Employer Office Address"));
		form.employercity.sendKeys(Readexcel.readData(tcname, "Employer City"));
		form.employerstate.sendKeys(Readexcel.readData(tcname, "Employer State"));
		form.employerzipcode.sendKeys(Readexcel.readData(tcname, "Employer Zipcode"));
		form.employertelephone.sendKeys(Readexcel.readData(tcname, "Employer Telephone"));
		form.addateofinjury.sendKeys(Readexcel.readData(tcname, "AD Date of Injury"));
		form.addateemployernotified.sendKeys(Readexcel.readData(tcname, "AD Date Employer Notified of Injury"));
		form.adlastdateofworkafterinjury.sendKeys(Readexcel.readData(tcname, "AD Last Date of Work After Injury"));
		form.adhasemployeereturnedtowork.click();
		form.ademployeeoccupation.sendKeys(Readexcel.readData(tcname, "AD Employee Occupation"));
		selectDropdown(form.addidinjuryoccur,"No");
		form.adwhatwastheinjury.sendKeys(Readexcel.readData(tcname, "AD What was the Injury"));
		form.adpartofbodyinjured.sendKeys(Readexcel.readData(tcname, "AD Part of the Body Injured"));
		form.adpartofbodyinjurytablelookup(driver);
		selectDropdown(form.adfatal,"Yes");
		selectDropdown(form.adwasemployeetreatedinanemergencyroom,"No");
		selectDropdown(form.adwasemployeehospitalizedovernight,"No");
		selectDropdown(form.adisvalidityclaimdoubted,"No");
		form.coawhathappened.sendKeys(Readexcel.readData(tcname, "COA What happened"));
		form.coawhatobject.sendKeys(Readexcel.readData(tcname, "COA What object"));
		form.coanatureofinjurylookup(driver);
		form.coacauseofinjurylookup(driver);
		form.coawhatwasemployeedoing.sendKeys(Readexcel.readData(tcname, "COA What was the Employee Doing Just Before the Incidient"));
		selectDropdown(form.coawasworkerinyouremploy,"No");
		form.coadateoflasthire.sendKeys(Readexcel.readData(tcname, "COA Date of Last Hire"));
		form.ewdactualgrossearnings.sendKeys(Readexcel.readData(tcname, "EWD Actual Gross Earnings of Employee"));
		form.assubmitteremail.sendKeys(Readexcel.readData(tcname, "AS Submitter Email Address"));
		form.iagree.click();
		form.submit.click();
	}

	/*This method is used for Picklist dropdown*/ 
	public static void selectDropdown(WebElement Dropdownname, String Value) {
		Select Picklist = new Select(Dropdownname);
		Picklist.selectByValue(Value);
	}

	/*This method is used for Lookup*/
	public void adpartofbodyinjurytablelookup(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='j_id0:j_id5:j_id9:j_id72:j_id114:partofbodyinjury_lkwgt']/img")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> totalNumberOfOpenedWindows = driver.getWindowHandles();
		for (String window : totalNumberOfOpenedWindows) {
			if (!parentWindow.equals(window)) {
				driver.switchTo().window(window);
				driver.switchTo().frame("searchFrame");
				driver.findElement(By.xpath(".//*[@id='lksrch']")).sendKeys("Head - Brain");
				driver.findElement(By.name("go")).click();
				Thread.sleep(2000);
				driver.switchTo().defaultContent();
				driver.switchTo().frame("resultsFrame");
				driver.findElement(By.cssSelector(".dataCell")).click();
			}
		}
		driver.switchTo().window(parentWindow);
	}

	public void coacauseofinjurylookup(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='j_id0:j_id5:j_id9:j_id155:j_id167:cause_lkwgt']/img")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> totalNumberOfOpenedWindows = driver.getWindowHandles();
		for (String window : totalNumberOfOpenedWindows) {
			if (!parentWindow.equals(window)) {
				driver.switchTo().window(window);
				driver.switchTo().frame("searchFrame");
				driver.findElement(By.xpath(".//*[@id='lksrch']")).sendKeys("Motor Vehicle - Vehicle Upset");
				driver.findElement(By.name("go")).click();
				Thread.sleep(2000);
				driver.switchTo().defaultContent();
				driver.switchTo().frame("resultsFrame");
				driver.findElement(By.cssSelector(".dataCell")).click();
			}
		}
		driver.switchTo().window(parentWindow);
	}

	public void coanatureofinjurylookup(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='j_id0:j_id5:j_id9:j_id155:j_id162:nature_lkwgt']/img")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> totalNumberOfOpenedWindows = driver.getWindowHandles();
		for (String window : totalNumberOfOpenedWindows) {
			if (!parentWindow.equals(window)) {
				driver.switchTo().window(window);
				driver.switchTo().frame("searchFrame");
				driver.findElement(By.xpath(".//*[@id='lksrch']")).sendKeys("Specific Injury - Laceration");
				driver.findElement(By.name("go")).click();
				Thread.sleep(2000);
				driver.switchTo().defaultContent();
				driver.switchTo().frame("resultsFrame");
				driver.findElement(By.cssSelector(".dataCell")).click();
			}
		}
		driver.switchTo().window(parentWindow);
	}
}
