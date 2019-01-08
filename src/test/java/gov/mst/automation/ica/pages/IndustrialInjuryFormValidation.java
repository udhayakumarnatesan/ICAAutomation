/*
 * @author Udhayakumar N
 * Created date: Jan 03,2019
 * Last Edited by: Udhayakumar N
 * Last Edited date: 
 * Description: 
 */

package gov.mst.automation.ica.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import gov.mst.automation.ica.constanturl.Constant;
import gov.mst.automation.ica.extentreport.Log;
import gov.mst.automation.ica.extentreport.Report;


public class IndustrialInjuryFormValidation {
	
	public static WebDriver driver;

	@FindBy(how = How.CLASS_NAME, using = "btn")
	public WebElement submit;

	@FindBy(how = How.XPATH, using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'LAST NAME')]//following::td[1]/div[1]/div[2]")
	public WebElement employeelastname;
	
	@FindBy(how = How.XPATH, using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'FIRST')]//following::td[1]/div[1]/div[2]")
	public WebElement employeefirstname;
	
	@FindBy(how = How.XPATH, using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'SOCIAL SECURITY NUMBER*')]//following::td[1]/div[1]/div[2]")
	public WebElement employeesocialsecuritynumber;
	
    // This method is used to Validate the Error messsage
	public static void industrialInjuryWebForm(WebDriver driver, String EmployeeLastNameValidation, String EmployeFirstNameValidation, String EmployeeSocialSecurityNumber) throws Exception {
		IndustrialInjuryFormValidation formvalidation = PageFactory.initElements(driver, IndustrialInjuryFormValidation.class);
		driver.get(Constant.industrialinjuryformurl);
		formvalidation.submit.click();
		validation(formvalidation.employeelastname, EmployeeLastNameValidation);
		Log.info("Employee Last Name Error message verified Successfully");
		validation(formvalidation.employeefirstname, EmployeFirstNameValidation);
		Log.info("Employee First Name Error message verified Successfully");
		validation(formvalidation.employeesocialsecuritynumber, EmployeeSocialSecurityNumber);
}
	
	public static void validation(WebElement ElementID, String value) throws Exception {
		String ExpectedData = value;
		String portaldata = ElementID.getText();
		if (portaldata.equals(ExpectedData)) {
			Report.testStepStatus("Validation Message correct", "Pass", "The expected " + ExpectedData + " and actual is " + portaldata + " both are same verified");
		} else {
			Report.testStepStatus("Validation Message not correct", "Fail", "The expected " + ExpectedData + " and actual is " + portaldata + " both are different not verified ");
			
		}
}
}
