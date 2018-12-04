/*
 * @author Udhayakumar N
 * Created date: Nov 20,2018
 * Last Edited by: Udhayakumar N
 * Last Edited date: 
 * Description: 
 */

package gov.mst.automation.ica.excelutility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import gov.mst.automation.ica.constant.Constanturl;

public class ReadExcel {
	private static Cell cell = null;
	private static Row row = null;
	private static int totalRows;
	private static int totalCols;

	/*This method is used to Read the data from excel*/
	public static String readData(String tcID, String header) throws Exception {
		Object result = null;
		File filepath = new File(Constanturl.filepathxlxs);
		FileInputStream demoin = new FileInputStream(filepath);

		if (filepath.isFile() && filepath.exists()) {

			XSSFWorkbook udhayaWorkbook = new XSSFWorkbook(demoin);
			XSSFSheet udhayaWorksheet = udhayaWorkbook.getSheet("Test sheet");
			row = udhayaWorksheet.getRow(0);
			totalCols = row.getLastCellNum();
			totalRows = udhayaWorksheet.getLastRowNum();

			for (int row = 0; row <= totalRows; row++) {
				String TCID = udhayaWorksheet.getRow(row).getCell(0).getStringCellValue();

				if (TCID.equalsIgnoreCase(tcID)) {

					for (int col = 1; col < totalCols; col++) {
						String FieldName = udhayaWorksheet.getRow(0).getCell(col).getStringCellValue();

						if (FieldName.equalsIgnoreCase(header)) {
							cell = udhayaWorksheet.getRow(row).getCell(col);

							if (cell != null) {
								switch (cell.getCellType()) {

								case Cell.CELL_TYPE_STRING:
									result = cell.getStringCellValue();
									break;

								case Cell.CELL_TYPE_NUMERIC:
									result = cell.getNumericCellValue();
									break;

								case Cell.CELL_TYPE_BOOLEAN:
									result = cell.getBooleanCellValue();
									break;

								case Cell.CELL_TYPE_ERROR:
									result = cell.getErrorCellValue() + "";
									break;
								}
							}
						}
					}
				}
			}
		}
		return result.toString();
	}

}
