/*
 * @author Udhayakumar N
 * Created date: Nov 20,2018
 * Last Edited by: Udhayakumar N
 * Last Edited date: 
 * Description: 
 */

package gov.mst.automation.ica.browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import gov.mst.automation.ica.constanturl.Constant;
import gov.mst.automation.ica.extentreport.Log;

public class BrowserFactory {
	
	public static WebDriver driver;

	/*This method is used to select Browser*/ 
	public static WebDriver getDriver(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", Constant.chromedriverexepath);
			driver = new ChromeDriver();
			Log.info("Chrome Browser opened successfully");
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", Constant.firefoxdriverexepath);
			driver = new FirefoxDriver();
			Log.info("Firefox Browser opened Successfully");
		} else {
			System.out.println("Browser is not correct");
			Log.error("Invalid browser");
		}
		return driver;
	}
}
