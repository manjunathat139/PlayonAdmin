package axx.playOn.automation;

import java.net.MalformedURLException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import axx.playOn.base.TestBase;
import axx.playOn.screen.HomeScreen;
import axx.playOn.screen.LoginScreen;

public class HomeScreenTest extends TestBase {
	LoginScreen loginscreen;
	HomeScreen homescreen;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		init();
		loginscreen = new LoginScreen();
		homescreen = new HomeScreen();
		loginscreen.login("sudynamic@dynamic.com", "axxonet");
		loginscreen.choosezoneIspresent();
		loginscreen.selectZone();
		loginscreen.selectSurvey();
	}

	public HomeScreenTest() {
		super();
	}

	@Test
	public void selectForms() {
		homescreen.selectStudentForm();
		// homescreen.selectbaseline();
		homescreen.getallsurvey();

	}
}

