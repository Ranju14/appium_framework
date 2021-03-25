package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CalendarLaunchConfirmationScreen extends BasePage {

	private AndroidElement gotItButton ;

	public CalendarLaunchConfirmationScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
		gotItButton = driver.findElement(By.id("done_button"));
	}

	public CalendarHomeScreen clickConfirm() {
		gotItButton.click();
		return new CalendarHomeScreen(driver);
	}
}