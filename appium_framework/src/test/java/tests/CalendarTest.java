package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.CalendarLaunchScreen;

public class CalendarTest extends BaseTest {

	private static final String CalenderTitle = "Workshop";
	
	@DataProvider(name = "Title")
    public static Object[][] Titles() {
        return new Object[][]{{CalenderTitle}};
    }
	
	@Test(dataProvider = "Title")		
	public void createCalendarInvite(String title) {
		new CalendarLaunchScreen(driver)
		.gotoConfirmationScreen()
		.clickConfirm()
		.tapOnPlus()
		.tapEvents()
		.enterTitle(title)
		.clickOnSave();
	}
}