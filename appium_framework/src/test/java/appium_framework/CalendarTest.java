package appium_framework;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalendarTest {

	static AppiumDriver<MobileElement> driver;


	public static void main(String[] args) {

		try {

			launchCalender();
		}catch(Exception e) {
			System.out.println(e.getCause().getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static void launchCalender() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Nexus5");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("appPackage", "com.google.android.calendar");
		cap.setCapability("appActivity", "com.android.calendar.event.LaunchInfoActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);

		System.out.println("Application started ...");

	}
}


