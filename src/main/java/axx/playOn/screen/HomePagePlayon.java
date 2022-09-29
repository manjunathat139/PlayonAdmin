package axx.playOn.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import axx.playOn.base.TestBase;

public class HomePagePlayon extends TestBase
{

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Business Partner\"]")
	WebElement businessPartner;
	
	public HomePagePlayon() {
		PageFactory.initElements(driver, this);
	}
	
	
	public RegisterPage clickOnBusinessPartner() {
		businessPartner.click();
		return new RegisterPage();
	}
}
