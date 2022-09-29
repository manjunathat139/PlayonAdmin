package axx.playOn.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import axx.playOn.base.TestBase;

public class corporationDeatilsPage extends TestBase
{
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Please tell us about your corporation\"]")
	WebElement corporationDeatilsText;
	
	@FindBy(xpath = "//android.view.View/android.widget.EditText[3]")
	WebElement yourBusiness;

	@FindBy(xpath = "//android.view.View/android.widget.EditText[2]")
	WebElement descriptionOfYourBusiness;

	@FindBy(xpath = "//android.view.View/android.widget.EditText[1]")
	WebElement nameOfOrganization;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Next\"]")
	WebElement corporationNext;
	
	public corporationDeatilsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validcorporationDeatilsTextText() {
		return corporationDeatilsText.getText();
	}
	
public contactDeatilsPage clickOncorporationNext(String  business, String organization, String description ) {
	
	yourBusiness.sendKeys(business);
	descriptionOfYourBusiness.sendKeys(description);
	nameOfOrganization.sendKeys(organization);
	corporationNext.click();
	
		return new contactDeatilsPage();
	}
	
	
	
	
	
	
}
