package axx.playOn.automation;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import axx.playOn.base.TestBase;
import axx.playOn.screen.welcome;

public class WelcomeTest extends TestBase 
{
	welcome wel;
	public WelcomeTest() {
		super();
	}
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		init();
		wel=new welcome();
		
		
	}

	

	@Test(priority = 1)
	public void login() {
		wel.login("sudynamic@dynamic.com");
		
		//Assert.assertEquals(LoginScreen.choosezoneIspresent().toLowerCase(),"choose a zone");
		
	}
	
}
