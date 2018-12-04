/*
 * @author Udhayakumar N
 * Created date: Dec 03,2018
 * Last Edited by: Udhayakumar N
 * Last Edited date: 
 * Description: 
 */

package gov.mst.automation.ica.screenshotutility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ScreenShotCapture {
	
	public static void captureScreenshot(WebDriver driver, String screenname) throws IOException 
	{
		TakesScreenshot file = ((TakesScreenshot)driver);
		File screenshotFile = file.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("./Screenshots/"+screenname+".png"));
	}
}
