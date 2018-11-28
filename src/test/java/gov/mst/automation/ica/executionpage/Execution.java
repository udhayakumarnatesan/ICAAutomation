/*
 * @author Udhayakumar N
 * Created date: Nov 20,2018
 * Last Edited by: Udhayakumar N
 * Last Edited date: 
 * Description: 
 */

package gov.mst.automation.ica.executionpage;

import org.testng.annotations.Test;
import gov.mst.automation.ica.basetest.Basetest;
import gov.mst.automation.ica.pages.Industrialinjuryform;
import gov.mst.automation.ica.pages.Loginpage;

public class Execution extends Basetest{
	
	@Test
	public void executionPage() throws Exception {
	String TcID = "TC_001";
	//Loginpage.performLogin(driver, TcID);
	Industrialinjuryform.Industrialinjurywebform(driver, TcID);
	}

}
