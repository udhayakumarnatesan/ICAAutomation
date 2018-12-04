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

import gov.mst.automation.ica.constant.Constanturl;

public class BrowserFactory {
	
	public static WebDriver driver;

	/*This method is used to select Browser*/ 
	public static WebDriver getDriver(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", Constanturl.driverexepath);
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Browser is not correct");
		}
		return driver;
	}
}
