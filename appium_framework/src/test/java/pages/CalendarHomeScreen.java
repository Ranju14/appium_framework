package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CalendarHomeScreen extends BasePage {

	protected AndroidElement plusButton;
	protected AndroidElement drawerMenu;

	public CalendarHomeScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
		plusButton = driver.findElement(By.id("floating_action_button"));
		drawerMenu = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Show Calendar List and Settings drawer\"]"));
	}

	public OverlayScreen tapOnPlus() {
		plusButton.click();
		return new OverlayScreen(driver);
	}
	
	public CalendarHomeScreen clickOnMenu() {
		drawerMenu.click();
		return this;
	}
}
