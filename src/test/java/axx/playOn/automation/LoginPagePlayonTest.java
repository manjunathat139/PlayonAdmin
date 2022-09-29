package axx.playOn.automation;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import axx.playOn.base.TestBase;
import axx.playOn.screen.LoginPagePlayon;
import axx.playOn.screen.welcome;

public class LoginPagePlayonTest extends TestBase {
	
	
	LoginPagePlayon login;
	public LoginPagePlayonTest() {
		super();
	}
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		init();
		login=new LoginPagePlayon();
		
		
	}

	

	@Test(priority = 2)
	public void login() {
		login.loginPage(prop.getProperty("username"), prop.getProperty("password"));
		
		//Assert.assertEquals(LoginScreen.choosezoneIspresent().toLowerCase(),"choose a zone");
		
	}
	
	@Test(priority = 1)
	
	public void verifyLoginText()
	{
		String flag = login.validLoginText();
		Assert.assertEquals(flag, "Password");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
