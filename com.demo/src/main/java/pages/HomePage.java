package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import testUtils.Utils;

public class HomePage extends BaseTest {
	
	public HomePage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="cookie-accept")
	WebElement cookieAccept;
	
	
//Start seeing efficiency everywhere-FORM
	
	
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Company")
	WebElement company;
	
	@FindBy(id="Phone")
	WebElement phone;
	
	@FindBy(id="Unit_Count__c")   //dropdown
	WebElement unit_Count;
	
	@FindBy(id="Title")
	WebElement title;
	
	@FindBy(id="demoRequest")   //dropdown
	WebElement demoRequest;
	
	
	
	public void fillDetailsToDemoForm(String firstNameValue, String lastNameValue, String emailValue, String companyValue, String phoneValue, String titleValue) {
//		cookieAccept.click();
		Utils.ScrollToElement(firstName);
		firstName.clear();
		firstName.sendKeys(firstNameValue);
		lastName.clear();
		lastName.sendKeys(lastNameValue);
		email.clear();
		email.sendKeys(emailValue);
		company.clear();
		company.sendKeys(companyValue);
		phone.clear();
		phone.sendKeys(phoneValue);
		
		Select sel_count= new Select(unit_Count);
		sel_count.selectByValue("101 - 200");
		
		title.clear();
		title.sendKeys(titleValue);
		
		Select demoRequest_drop= new Select(demoRequest);
		demoRequest_drop.selectByVisibleText("a Resident");
		
		
		
	}
	
	
	
}
