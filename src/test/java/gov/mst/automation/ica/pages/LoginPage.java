/*
 * @author Udhayakumar N
 * Created date: Nov 20,2018
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
import gov.mst.automation.ica.excelutility.DataUtils;
import gov.mst.automation.ica.extentreport.Report;

public class LoginPage {
	
	public WebDriver driver;

	@FindBy(how = How.ID, using = "username")
	public WebElement username;

	@FindBy(how = How.NAME, using = "pw")
	public WebElement pw;

	@FindBy(how = How.NAME, using = "Login")
	public WebElement Login;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//This method is used to access the Salesforce Login page
	public static void performLogin(WebDriver driver, String sheetName, String tcID) throws Exception {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		driver.get(Constant.browserurl);
		login.username.sendKeys(DataUtils.readExcel(sheetName, tcID, "UserName"));
		login.pw.sendKeys(DataUtils.readExcel(sheetName, tcID, "Password"));
		login.Login.click();
		Thread.sleep(3000);
		Report.testStepStatus("Login to Salesforce successfully", "Pass", "SF Login");
	}

}
