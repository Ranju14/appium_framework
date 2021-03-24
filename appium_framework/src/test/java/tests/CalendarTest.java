package tests;

import org.testng.annotations.Test;
import pages.CalenderLaunchScreen;

public class CalendarTest extends BaseTest {

	@Test
	public void createCalendarInvite() {
		new CalenderLaunchScreen(driver)
		.gotoConfirmationScreen()
		.clickConfirm();
	}
}
