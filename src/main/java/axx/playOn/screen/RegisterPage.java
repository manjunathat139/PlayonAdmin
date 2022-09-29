package axx.playOn.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import axx.playOn.base.TestBase;

public class RegisterPage  extends TestBase
{
	@FindBy(xpath = "//*[@text='Login']")
	WebElement registerusername;

	@FindBy(xpath = "//*[@text='Password']")
	WebElement registerpassword;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Register\"]")
	WebElement register;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Create you Play On! Account\"]")
	WebElement registerText;
	
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validRegisterText() {
		return registerText.getText();
	}

	public businessPartnerRegistrationPage register( String un, String pass) {
		
		registerusername.sendKeys(un);
		
		registerpassword.sendKeys(pass);
		
		register.click();
	
		return new businessPartnerRegistrationPage();
	}

	

}
