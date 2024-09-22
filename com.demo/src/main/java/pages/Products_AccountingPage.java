package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;
import testUtils.Utils;

public class Products_AccountingPage extends BaseTest {
	
	public Products_AccountingPage() throws Exception {
		PageFactory.initElements(driver, this);
	}

	
	
	
	@FindBy(xpath="//div[contains(text(),'Products')]")
	WebElement Products;
	
	//*[@class='footer-column mb-bg']//a[contains(text(),'General Accounting')]

	@FindBy(xpath="//nav/div/div/a[@href='/products/general-accounting']")
	WebElement General_Accounting;
	
	@FindBy(xpath="//*[@class='footer-column mb-bg']//a[contains(text(),'Budgeting')]")
	WebElement Budgeting;
	
	@FindBy(xpath="//*[@class='footer-column mb-bg']//a[contains(text(),'Job Costing')]")
	WebElement 	Job_Costing;
	
	@FindBy(xpath="//*[@class='footer-column mb-bg']//a[contains(text(),'Bill Pay')]")
	WebElement 	Bill_Pay;
	

	public boolean isGeneral_BudgetingLinkWorksUnderAccounting() {
		//hover to product
		Utils.waitUntilElementToBeVisibleAndHover(Products);
		Utils.staticSleep(5000);
		Utils.JsClick(Budgeting);
		Utils.staticSleep(5000);
		String Actual_title=driver.getTitle();
		System.out.println("Title of Budgeting Page: "+Actual_title);
		return Actual_title.equals("Budgeting by Entrata | Ditch the Spreadsheets");
		
	}	
}
