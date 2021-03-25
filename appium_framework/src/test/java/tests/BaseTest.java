package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import utils.Constants;
public class BaseTest {

	protected AndroidDriver<AndroidElement> driver;

	@BeforeTest 
	public void setup() throws MalformedURLException {	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Constants.PLATFORM_NAME_VALUE);
		capabilities.setCapability(MobileCapabilityType.VERSION, Constants.PLATFORM_VERSION_VALUE);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Constants.DEVICE_NAME_VALUE);
		capabilities.setCapability(MobileCapabilityType.UDID, Constants.UDID_VALUE);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		capabilities.setCapability(Constants.AUTOMATION_NAME_KEY, Constants.AUTOMATION_NAME_VALUE);
		capabilities.setCapability(Constants.APP_PACKAGE_KEY, Constants.APP_PACKAGE_VALUE);
		capabilities.setCapability(Constants.APP_ACTIVITY_KEY, Constants.APP_ACTIVITY_VALUE);

		URL url = new URL(Constants.url);
		driver = new AndroidDriver<AndroidElement>(url, capabilities);
	}
}
