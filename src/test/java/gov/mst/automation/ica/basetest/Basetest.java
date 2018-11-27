package gov.mst.automation.ica.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import gov.mst.automation.ica.browserfactory.Browserfactory;

public class Basetest {

	public WebDriver driver;

	@BeforeTest
	@Parameters({ "browser" })
	public void login(String browser) {
		driver = Browserfactory.getDriver(browser);
		driver.manage().window().maximize();
	}

	@AfterTest
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
	}
}
