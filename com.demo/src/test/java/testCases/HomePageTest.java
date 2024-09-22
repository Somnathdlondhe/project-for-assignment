package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import retry.RetryAnalyser;
import testUtils.ExcelUtils;
import testUtils.TestListener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

@Listeners(TestListener.class)
public class HomePageTest extends BaseTest {
	HomePage homePage;
	
	
	@BeforeMethod
	public void init() throws Exception {
	homePage= new HomePage();
		
	}
	
	

	@Test(retryAnalyzer = RetryAnalyser.class)
	public void testFillDetailsFromExcel() throws Exception {
	    // Specify the sheet name you want to read
	    String sheetName = "demo"; 
	    
	    Object[][] excelData = ExcelUtils.readExcelData("resources/DemoForm_data.xlsx", sheetName);
	    
	    for (Object[] rowData : excelData) {
	        String firstName = (String) rowData[0];
	        String lastName = (String) rowData[1];
	        String email = (String) rowData[2];
	        String company = (String) rowData[3];
	        String phone = (String) rowData[4];
	        String title = (String) rowData[5];
	        
	        homePage.fillDetailsToDemoForm(firstName, lastName, email, company, phone, title);
	        // Optionally,we can add assertions here to validate the form submission
	    }  
	}
	
	@Test
	public void isDemoButtonWorks() {
		Assert.assertEquals(homePage.isWatchDemoButtonWorks(), true);

	}
}
