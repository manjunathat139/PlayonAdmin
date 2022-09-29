package axx.playOn.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import axx.playOn.base.TestBase;

public class businessPartnerRegistrationPage extends TestBase
{
	@FindBy(id = "Business Partner Registration")
	WebElement businessPartnerRegistration;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Next\"]")
	WebElement businessPartnerRegistrationNext;
	
	public businessPartnerRegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validbusinessPartnerRegistrationText() {
		return businessPartnerRegistration.getText();
	}
	
public corporationDeatilsPage clickOnbusinessPartnerRegistrationNext( ) {
	
	businessPartnerRegistrationNext.click();
	
		return new corporationDeatilsPage();
	}
	
	
}
