package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;
import testUtils.TabSwitcher;
import testUtils.Utils;

public class SummitPage extends BaseTest {
	public SummitPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div/a[contains(text(),'Summit')]")
	WebElement summit;

	
	
//Personal Information - Summit 2024

	@FindBy(xpath="//*[contains(text(),'Register Now')]")
	WebElement registerNow_Button;
	
	@FindBy(xpath="//*[@aria-label='First Name']")
	WebElement firstName;
	
	@FindBy(xpath="//*[@aria-label='Last Name']")
	WebElement lastName;

	@FindBy(xpath="//*[@aria-label='Preferred Name:']")
	WebElement preferredName;
	
	@FindBy(xpath="//*[@aria-label='Company']")
	WebElement company;
	
	@FindBy(xpath="//*[@aria-label='Title']")
	WebElement title;
	
	@FindBy(xpath="//*[@aria-label='Email Address']")
	WebElement email;
	
	@FindBy(xpath="//*[@aria-label='Mobile']")
	WebElement mobile;

	@FindBy(id="forward")
	WebElement forwardButton;

	//Page=2
	
//	@FindBy(xpath="//input[@aria-label='* Do you currently use Entrata?']")
//	WebElement useEntrata;
	
	@FindBy(xpath="//*[@data-cvent-id='async-dropdown-wrapper']")
	WebElement useEntrata;
	
	@FindBy(xpath="	//input[@aria-activedescendant='react-select-4-option-2']")
	WebElement option_2;

	
	
	

	@FindBy(id="backward")
	WebElement backwardButton;
	
	
	
	public void goToRegesterFormSummit() {
		Utils.waitElementToBeClickable(summit);
		summit.click();
		TabSwitcher.switchToTab(driver, "Entrata Summit 2024 | The Best Week in Multifamily Sept 23-26");
		registerNow_Button.click();
		
	}
	
	public void fillDetailsinForm(String firstNameValue,String lastNameValue,String preferredNameValue,String companyValue,String titleValue,String emailValue,String mobileValue ) {
		Utils.staticSleep(5000);
		TabSwitcher.switchToTab(driver, "Personal Information - Summit 2024");
		Utils.waitElementToBeClickable(firstName);
		firstName.clear();
		firstName.sendKeys(firstNameValue);
		lastName.clear();
		lastName.sendKeys(lastNameValue);
		preferredName.clear();
		preferredName.sendKeys(preferredNameValue);
		company.clear();
		company.sendKeys(companyValue);
		title.clear();
		title.sendKeys(titleValue);
		email.clear();
		email.sendKeys(emailValue);
		mobile.clear();
		mobile.sendKeys(mobileValue);
		forwardButton.click();
		Utils.staticSleep(3000);
		
		;
		
	}
	
	//check weather we filled page one and upon clicking Next we moved to page 2
	public boolean isIsuccessfullyFilledFirstPage() {
	Utils.waitUntilElementToBeVisible(backwardButton);
		return backwardButton.isDisplayed() ;
		
		
	}
	
	
}
