package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import junit.framework.Assert;
import pages.Products_AccountingPage;
;

public class Products_AccountingLinksTest extends BaseTest {

	Products_AccountingPage products_AccountingPage;
	
	
	
	
	@BeforeMethod
	public void init() throws Exception {
		products_AccountingPage= new Products_AccountingPage();

	}
	
	@Test
	public void Budgeting_linksTest() {
		
		Assert.assertEquals(true, products_AccountingPage.isGeneral_BudgetingLinkWorksUnderAccounting());
	}
	
	@Test
	public void JobCostingLinkTest() {
		Assert.assertEquals(true, products_AccountingPage.isJob_CostingLinkWorks());
	}
	
	@Test
	public void Bill_PayLinkTest() {
		Assert.assertEquals(true, products_AccountingPage.isBill_Pay_LinkWorks());
	}
	@Test
	public void General_AccountingLinkTest() {
		Assert.assertEquals(true, products_AccountingPage.isGeneral_AccountingLinkWorks());
		
	}
	
}
