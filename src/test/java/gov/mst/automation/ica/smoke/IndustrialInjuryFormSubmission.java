/*
 * @author Udhayakumar N
 * Created date: Nov 20,2018
 * Last Edited by: Udhayakumar N
 * Last Edited date: 
 * Description: 
 */

package gov.mst.automation.ica.smoke;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import gov.mst.automation.ica.basetest.BaseTest;
import gov.mst.automation.ica.excelutility.DataUtils;
import gov.mst.automation.ica.extentreport.Report;
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
	
	 
	@Test(priority = 1, dataProvider = "industrialInjuryFormValidationData")
	// This method is used to Run the all pages
	public void industrialInjuryFormValidation(String tcId, String EmployeeLastNameValidation, String EmployeFirstNameValidation, String EmployeeSocialSecurityNumber) throws Exception {
		Report.beginTest("Industrial Injury Form", "Verify the required fields in Form", "Udhaya", "ICATestCase");
		IndustrialInjuryFormValidation.industrialInjuryWebForm(driver, EmployeeLastNameValidation, EmployeFirstNameValidation, EmployeeSocialSecurityNumber);
	}

	@DataProvider(name = "industrialInjuryFormValidationData")
	public static Object[][] industrialInjuryFormValidationData() throws Exception {
		Workbook workbook = DataUtils.accessExcel();
		Sheet sheet = workbook.getSheet("industrialInjuryFormValidation");
		int totalRows = sheet.getLastRowNum();
		Row row = sheet.getRow(0);
		int totalCols = row.getLastCellNum();
		Object[][] excelData = new Object[totalRows][totalCols];
		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j < totalCols; j++) {
				excelData[i - 1][j] = sheet.getRow(i).getCell(j).toString();
				// System.out.println(excelData[i - 1][j].toString());
			}
		}
		return excelData;
	}		
	}
	
