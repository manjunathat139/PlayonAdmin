package axx.playOn.automation;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import axx.playOn.base.TestBase;
import axx.playOn.screen.HomePagePlayon;
import axx.playOn.screen.LoginPagePlayon;
import axx.playOn.screen.RegisterPage;
import axx.playOn.screen.businessPartnerRegistrationPage;
import axx.playOn.screen.corporationDeatilsPage;
import axx.playOn.util.TestUtil;







public class corporationDeatilsPageTest extends TestBase
{
	TestUtil util;
	LoginPagePlayon login;
	HomePagePlayon businessPartner;
	RegisterPage regi;
	businessPartnerRegistrationPage businessPartnerRegi;
	corporationDeatilsPage corporation;
	String sheetName="corporationDetails";
	public corporationDeatilsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		init();
		util = new TestUtil();
		
		login=new LoginPagePlayon();
		businessPartner = login.loginPage(prop.getProperty("username"), prop.getProperty("password"));
					
		regi = new RegisterPage();
		businessPartnerRegi = new businessPartnerRegistrationPage();
		corporation=new corporationDeatilsPage();
	}
	
	@Test(priority=1)
	public void verifyRegisterText() 
	{
		businessPartner.clickOnBusinessPartner();
		regi.register(prop.getProperty("registerusername"), prop.getProperty("registerpassword"));
		businessPartnerRegi.clickOnbusinessPartnerRegistrationNext();
		
		String corporationText = corporation.validcorporationDeatilsTextText();
		Assert.assertEquals(corporationText, "");
		
		
	}
	

	@Test
	public void verifycorporationpage() 
	{
		businessPartner.clickOnBusinessPartner();
		regi.register(prop.getProperty("registerusername"), prop.getProperty("registerpassword"));
		businessPartnerRegi.clickOnbusinessPartnerRegistrationNext();
		
		corporation.clickOncorporationNext("Axxonet", "Axxonet", "Axxonet");
		
	}
	
//	@DataProvider
//	public Object[][] getPlayOnTestData(){
//		Object data[][] = util.getTestData(sheetName);
//		return data;
//	}
//	
//	@Test(priority=2, dataProvider="getPlayOnTestData")
//	public void verifycorporationpage(String business) 
//	{
//		businessPartner.clickOnBusinessPartner();
//		regi.register(prop.getProperty("registerusername"), prop.getProperty("registerpassword"));
//		businessPartnerRegi.clickOnbusinessPartnerRegistrationNext();
//		
//		corporation.clickOncorporationNext(business);
//		
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
