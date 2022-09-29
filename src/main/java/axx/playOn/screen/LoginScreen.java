package axx.playOn.screen;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import axx.playOn.base.TestBase;

public class LoginScreen extends TestBase {
	@FindBy(id = "com.axxonet.dynamic:id/input_email")
	WebElement emailid;
	@FindBy(id = "com.axxonet.dynamic:id/input_pass")
	WebElement password;

	@FindBy(id = "com.axxonet.dynamic:id/sign_in_button")
	WebElement signin;

	@FindBy(id = "android:id/alertTitle")
	WebElement choosezone;

	@FindBy(id = "android:id/text1")
	List<WebElement> zonelist;
	
	@FindBy(id = "android:id/text1")
	List<WebElement> surveylist;

	public LoginScreen() {
		PageFactory.initElements(driver, this);
	}

	public LoginScreen login(String un, String pwd) {
		emailid.sendKeys(un);
		password.sendKeys(pwd);
		signin.click();
		return new LoginScreen();
	}

	public String choosezoneIspresent() {
		String zoneheader = choosezone.getText();
		System.out.println(zoneheader + "_______________________>>>");
		return zoneheader;
	}

	public void selectZone() {
		System.out.println(zonelist.size());
		for (int i = 0; i < zonelist.size(); i++) {
			String zonename = zonelist.get(i).getText();
			System.out.println(zonename);
			if (zonename.equalsIgnoreCase("Test Zone 2")) {
				zonelist.get(i).click();
			}
		}
	}
	public void selectSurvey() {
		System.out.println(surveylist.size());
		for (int i = 0; i < surveylist.size(); i++) {
			String surveyname = surveylist.get(i).getText();
			System.out.println(surveyname);
			if (surveyname.equalsIgnoreCase("Data Test Survey")) {
				surveylist.get(i).click();
			}
		}
	}

}

