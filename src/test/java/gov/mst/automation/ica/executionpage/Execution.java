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
		Report.beginTest("Emloyer Report Form", "Verify filling Employer Report Form", "Udhaya", "Test case");
		String TcID = "TC_001";
		IndustrialInjuryForm.industrialInjuryWebForm(driver, TcID);
		LoginPage.performLogin(driver, TcID);
	}

}
