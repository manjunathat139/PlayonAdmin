package axx.playOn.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import axx.playOn.base.TestBase;

public class LoginPagePlayon extends TestBase {
	
	@FindBy(xpath = "//*[@text='Login']")
	WebElement username;

	@FindBy(xpath = "//*[@text='Password']")
	WebElement password;

	@FindBy(xpath = "(//android.widget.Button[@content-desc=\"Login\"])[2]")
	WebElement login;
	
	@FindBy(xpath = "(//android.view.View[@content-desc=\"Login to Play On! Canada\"])[2]")
	WebElement playOn;
	
	
	public LoginPagePlayon() {
		PageFactory.initElements(driver, this);
	}
	
	public String validLoginText() {
		return password.getText();
	}

	public HomePagePlayon loginPage( String un, String pass) {
		
		username.sendKeys(un);
	
		password.sendKeys(pass);
		
		login.click();
		return new HomePagePlayon();
	}

}
