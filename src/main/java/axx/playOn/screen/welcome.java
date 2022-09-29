package axx.playOn.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import axx.playOn.base.TestBase;

public class welcome extends TestBase
{
	@FindBy(id = "com.guru99app:id/edtText")
	WebElement textHere;

	@FindBy(id = "com.guru99app:id/btnShow")
	WebElement showTextButton;

	@FindBy(id = "com.guru99app:id/txtView")
	WebElement showHere;

	public welcome() {
		PageFactory.initElements(driver, this);
	}

	public welcome login( String text) {
		
		textHere.sendKeys(text);
		showTextButton.click();
	
		return new welcome();
	}
}
