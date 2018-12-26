/*
 * @author Udhayakumar N
 * Created date: Nov 20,2018
 * Last Edited by: Udhayakumar N
 * Last Edited date: 
 * Description: 
 */

package gov.mst.automation.ica.basetest;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import gov.mst.automation.ica.browserfactory.BrowserFactory;
import gov.mst.automation.ica.extentreport.Report;

public class BaseTest {

	public WebDriver driver;

	@BeforeSuite
	public static void startReport() 
	{
		DOMConfigurator.configure("log4j.xml");
		Report.beginReport();
		System.out.println("Report created");
	}
	@BeforeTest
	@Parameters({ "browser" })
	/*This method is used to open Browser*/
	public void login(String browser) {
		driver = BrowserFactory.getDriver(browser);
		driver.manage().window().maximize();
	}

	
	@AfterMethod
	public void checkTestAfterExecution(ITestResult result) throws IOException
	{
		Report.checkTestAfterExecution(result, driver);
	}
	
	@AfterTest
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
	}
	@AfterSuite
	public static void tearDown() {
		Report.tearDown();
	} 
	
	
}
