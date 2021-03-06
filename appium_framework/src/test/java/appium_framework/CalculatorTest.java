package appium_framework;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

static AppiumDriver<MobileElement> driver;


public static void main(String[] args) {

	try {
		
		openCalculator();
	}catch(Exception e) {
		System.out.println(e.getCause().getCause());
		System.out.println(e.getMessage());
		e.printStackTrace();
	}

}

public static void openCalculator() throws Exception {

	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "Pixel");
	cap.setCapability("udid", "emulator-5554");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "11");

	cap.setCapability("appPackage", "com.google.android.calculator");
	cap.setCapability("appActivity", "com.android.calculator2.Calculator");

	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AppiumDriver<MobileElement>(url,cap);

	System.out.println("Application started ...");
}
}


