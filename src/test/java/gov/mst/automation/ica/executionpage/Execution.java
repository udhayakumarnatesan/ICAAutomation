/*
 * @author Udhayakumar N
 * Created date: Nov 20,2018
 * Last Edited by: Udhayakumar N
 * Last Edited date: 
 * Description: 
 */

package gov.mst.automation.ica.executionpage;

import org.testng.annotations.Test;
import gov.mst.automation.ica.basetest.BaseTest;
import gov.mst.automation.ica.extentreport.Report;
import gov.mst.automation.ica.pages.IndustrialInjuryForm;
import gov.mst.automation.ica.pages.LoginPage;

public class Execution extends BaseTest {

	@Test
	/* This method is used to Run the all pages */
	public void executionPage() throws Exception {
		Report.beginTest("Emloyer's Report Form", "Verify the able to fill only required fields in Employer's Report Form", "Udhaya", "ICATestCase");
		String tcID = "TC_001";
		String sheetName = "Testsheet";
		
		IndustrialInjuryForm.industrialInjuryWebForm(driver, sheetName, tcID);
	    LoginPage.performLogin(driver, sheetName, tcID);
}
}