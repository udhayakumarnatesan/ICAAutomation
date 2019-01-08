/*
 * @author Udhayakumar N
 * Created date: Nov 20,2018
 * Last Edited by: Udhayakumar N
 * Last Edited date: 
 * Description: 
 */

package gov.mst.automation.ica.smoke;

import org.testng.annotations.Test;
import gov.mst.automation.ica.basetest.BaseTest;
import gov.mst.automation.ica.extentreport.Report;
import gov.mst.automation.ica.pages.IndustrialInjuryForm;
import gov.mst.automation.ica.pages.IndustrialInjuryFormLink;
import gov.mst.automation.ica.pages.IndustrialInjuryFormValidation;

public class IndustrialInjuryFormSubmission extends BaseTest {
	
	public String tcID;
	public String sheetName;

	/*@Test(priority=1)
	 This method is used to Run the all pages 
	public void industrialInjuryFormSubmission() throws Exception {
		Report.beginTest("Emloyer's Report Form", "Verify the able to fill only required fields in Employer's Report Form", "Udhaya", "ICATestCase");
		tcID = "TC_001";
		sheetName = "Testsheet";
		IndustrialInjuryForm.industrialInjuryWebForm(driver, sheetName, tcID);
}
	
	@Test(priority=2)
	 This method is used to Run the all pages 
	public void industrialInjuryFormLinkVerification() throws Exception {
		Report.beginTest("Industrial Injury Form", "Verify the link in Form", "Udhaya", "ICATestCase");
		tcID = "TC_001";
		sheetName = "Testsheet";
		IndustrialInjuryFormLink.industrialInjuryWebForm(driver, sheetName, tcID);
}*/
	
	@Test
	/* This method is used to Run the all pages */
	public void industrialInjuryFormValidation() throws Exception {
		Report.beginTest("Industrial Injury Form", "Verify the required fields in Form", "Udhaya", "ICATestCase");
		tcID = "TC_001";
		sheetName = "Testsheet";
		IndustrialInjuryFormValidation.industrialInjuryWebForm(driver, sheetName, tcID);
	}
}