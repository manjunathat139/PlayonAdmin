package axx.playOn.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import axx.playOn.util.TestUtil;
import axx.playOn.util.WebEventListener;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class TestBase {

	public static AppiumDriver<MobileElement> driver;
	public static Properties prop;
//	public static EventFiringWebDriver ev_driver;
//	public static WebEventListener eventListener;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/Users/axxonet/eclipse-workspace/PlayOnAppium/src/main/java/axx/playOn/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void init() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
	//	dc.setCapability(CapabilityType.BROWSER_NAME, "");
	//	dc.setCapability("automationName","Selendroid");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		//dc.setCapability("udid", "c574c286");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"100");
		//dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Glaxy M12");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
	//	Capabilities.setCapability(MobileCapabilityType.APP, "D:\\src\\playon-flutter-flutterflow\\playon-flutter-flutterflow\\build\\app\\outputs\\apk\\release\\app-release.apk");
		
		//dc.setCapability("appPackage", "com.playon.app.enduser");
		dc.setCapability("appPackage", "com.playon.app.player");
		dc.setCapability("appActivity", "com.playon.app.player.MainActivity");
		
		//dc.setCapability("appActivity", "com.playon.app.enduser.MainActivity");
//		
	//	dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\axxonet\\Downloads\\Guru99App.apk");
	//	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
//		dc.setCapability("appPackage", "com.guru99app");
//		dc.setCapability("appActivity", "com.guru99app.MainActivity");
//		//dc.setCapability("autoGrantPermissions", "true");
	//	dc.setCapability("autoDismissAlerts", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		
	
	}
	

}