package axx.playOn.automation;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import axx.playOn.base.TestBase;
import axx.playOn.screen.LoginScreen;

public class LoginScreenTest extends TestBase {
	LoginScreen LoginScreen;

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		init();
		LoginScreen=new LoginScreen();
		LoginScreen.login("sudynamic@dynamic.com", "axxonet");
		LoginScreen.choosezoneIspresent();	
		LoginScreen.selectZone();
		LoginScreen.selectSurvey();
	}

	public LoginScreenTest() {
		super();
	}

	@Test(priority = 1)
	public void verifylogin() {
		//Assert.assertEquals(LoginScreen.choosezoneIspresent().toLowerCase(),"choose a zone");
		
	}
	
}
