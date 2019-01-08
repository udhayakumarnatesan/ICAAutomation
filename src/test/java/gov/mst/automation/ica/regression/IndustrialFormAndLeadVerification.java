package gov.mst.automation.ica.regression;

import org.testng.annotations.Test;

import gov.mst.automation.ica.basetest.BaseTest;
import gov.mst.automation.ica.extentreport.Report;
import gov.mst.automation.ica.pages.IndustrialInjuryForm;
import gov.mst.automation.ica.pages.LeadRecord;
import gov.mst.automation.ica.pages.LoginPage;

public class IndustrialFormAndLeadVerification extends BaseTest {
	public String tcID;
	public String sheetName;

	@Test
	/* This method is used to Run the all pages */
	public void executionPage() throws Exception {
		Report.beginTest("Emloyer's Report Form", "Verify the able to fill only required fields in Employer's Report Form", "Udhaya", "ICATestCase");
		tcID = "TC_001";
		sheetName = "Testsheet";
		IndustrialInjuryForm.industrialInjuryWebForm(driver, sheetName, tcID);
	    LoginPage.performLogin(driver, sheetName, tcID);
	    LeadRecord.verifyLead(driver, sheetName, tcID);
}

}
