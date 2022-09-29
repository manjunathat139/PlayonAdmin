package axx.playOn.automation;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import axx.playOn.base.TestBase;
import axx.playOn.screen.HomePagePlayon;
import axx.playOn.screen.LoginPagePlayon;
import axx.playOn.screen.RegisterPage;

public class RegisterPageTest extends TestBase 
{
	LoginPagePlayon login;
	HomePagePlayon businessPartner;
	RegisterPage regi;
	public RegisterPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		init();
		login=new LoginPagePlayon();
		businessPartner = login.loginPage(prop.getProperty("username"), prop.getProperty("password"));
		regi = new RegisterPage();
	}
	
	@Test(priority=1)
	public void verifyRegisterText() 
	{
		businessPartner.clickOnBusinessPartner();
		String regiText = regi.validRegisterText();
		Assert.assertEquals(regiText, "");
		
	}
	@Test(priority=2)
	
	public void clickOnRegister() 
	{
		businessPartner.clickOnBusinessPartner();
		regi.register(prop.getProperty("registerusername"), prop.getProperty("registerpassword"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
