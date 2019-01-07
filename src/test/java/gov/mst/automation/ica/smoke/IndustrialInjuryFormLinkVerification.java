package gov.mst.automation.ica.smoke;

import org.testng.annotations.Test;

import gov.mst.automation.ica.basetest.BaseTest;
import gov.mst.automation.ica.extentreport.Report;
import gov.mst.automation.ica.pages.IndustrialInjuryFormLink;

public class IndustrialInjuryFormLinkVerification extends BaseTest {
	
	public String tcID;
	public String sheetName;

	@Test
	/* This method is used to Run the all pages */
	public void executionPage() throws Exception {
		Report.beginTest("Wish Child Referral Form", "Verify the Sections and its appropriate fields are available in Form", "Udhaya", "MAWATestCase");
		tcID = "TC_001";
		sheetName = "Testsheet";
		IndustrialInjuryFormLink.industrialInjuryWebForm(driver, sheetName, tcID);
}
}

