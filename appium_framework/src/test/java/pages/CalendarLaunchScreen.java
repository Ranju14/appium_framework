package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CalendarLaunchScreen extends BasePage {

	private AndroidElement nextPageArrow ;

	public CalendarLaunchScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
		nextPageArrow = driver.findElement(By.id("next_arrow"));
	}

	public CalendarLaunchConfirmationScreen gotoConfirmationScreen() {
		nextPageArrow.click();
		nextPageArrow.click();
		return new CalendarLaunchConfirmationScreen(driver);
	}
}