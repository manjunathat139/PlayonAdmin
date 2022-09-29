package axx.playOn.automation;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import axx.playOn.base.TestBase;
import axx.playOn.screen.HomePagePlayon;
import axx.playOn.screen.LoginPagePlayon;

public class HomePagePlayonTest extends TestBase 
{
	LoginPagePlayon login;
	HomePagePlayon businessPartner;
	public HomePagePlayonTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		init();
		login=new LoginPagePlayon();
		businessPartner = login.loginPage(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test
	
		public void clickOnBusinessPartnerTest() {
			businessPartner.clickOnBusinessPartner();
		}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	}



