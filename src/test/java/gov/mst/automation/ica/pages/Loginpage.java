package gov.mst.automation.ica.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import gov.mst.automation.ica.contant.Constanturl;

public class Loginpage {
	
	public WebDriver driver;

	@FindBy(how = How.ID, using = "username")
	public WebElement username;

	@FindBy(how = How.NAME, using = "pw")
	public WebElement pw;

	@FindBy(how = How.NAME, using = "Login")
	public WebElement Login;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public static void performLogin(WebDriver driver, String tcname) throws Exception {
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		driver.get(Constanturl.browserusrl);
		login.username.sendKeys(gov.mst.automation.ica.excelutility.Readexcel.readData(tcname, "Username"));
		login.pw.sendKeys(gov.mst.automation.ica.excelutility.Readexcel.readData(tcname, "Password"));
		login.Login.click();
		Thread.sleep(3000);
	}

}
