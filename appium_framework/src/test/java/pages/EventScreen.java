package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class EventScreen extends BasePage {
	
	protected AndroidElement title;
	protected AndroidElement saveButton;
	
	public EventScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
		title = driver.findElement(By.id("title"));
	    saveButton = driver.findElement(By.id("save"));
	}
	
	public EventScreen enterTitle(String Title) {
		title.click();
		title.sendKeys(Title);
		return this;
	}
	
	public EventScreen clickOnSave() {
		saveButton.click();
		return this;
	}
}

