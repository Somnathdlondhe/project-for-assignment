package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Products_AccountingPage;
;

public class Products_AccountingLinksTest extends BaseTest {

	Products_AccountingPage products_AccountingPage;
	
	
	
	
	@BeforeMethod
	public void init() throws Exception {
		products_AccountingPage= new Products_AccountingPage();

	}
	
	@Test
	public void linksTest() {
		products_AccountingPage.isGeneral_BudgetingLinkWorksUnderAccounting();
	}
}
