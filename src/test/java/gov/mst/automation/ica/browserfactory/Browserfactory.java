package gov.mst.automation.ica.browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import gov.mst.automation.ica.contant.Constanturl;

public class Browserfactory {
	
	public static WebDriver driver;

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
