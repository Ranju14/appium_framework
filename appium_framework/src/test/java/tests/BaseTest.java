package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class BaseTest {

	protected AndroidDriver<AndroidElement> driver;

	@BeforeTest 
	public void setup() throws MalformedURLException {	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.VERSION, "11");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5");
		capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("appPackage", "com.google.android.calendar");
		capabilities.setCapability("appActivity", "com.android.calendar.event.LaunchInfoActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<AndroidElement>(url, capabilities);
	}
}
