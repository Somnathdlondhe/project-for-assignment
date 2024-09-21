package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import junit.framework.Assert;
import pages.SummitPage;
import retry.RetryAnalyser;
import testUtils.ExcelUtils;


public class SummitRegistrationTest extends BaseTest {
	SummitPage summitPage;
	public SummitRegistrationTest() throws Exception {
		super();
	}
	
	@BeforeMethod
	public void init() throws Exception {
		summitPage= new SummitPage();
		
	}

	@Test(retryAnalyzer = RetryAnalyser.class,priority=1)

	public void registerForSummitTest() throws Exception {
		summitPage.goToRegesterFormSummit();
		
		 String sheetName = "summit"; 
		    
		    // Use relative path without leading slash
		    Object[][] excelData = ExcelUtils.readExcelData("resources/DemoForm_data.xlsx", sheetName);
		    for(Object[] rowData: excelData) {
		    	String FirstNameValue=(String) rowData[0];
		    	String lastNameValue=(String) rowData[1];
		    	String preferredNameValue=(String) rowData[2];
		    	String companyValue=(String) rowData[3];
		    	String titleValue=(String) rowData[4];
		    	String emailValue=(String) rowData[5];
		    	String mobileValue=(String) rowData[6];
		    	summitPage.fillDetailsinForm(FirstNameValue,lastNameValue, preferredNameValue, companyValue, titleValue, emailValue, mobileValue);
		    }
		
		Assert.assertEquals(true, summitPage.isIsuccessfullyFilledFirstPage());
		
	}
	
	
	
	
}
