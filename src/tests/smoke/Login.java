package tests.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commands.utils.TestAssertions;
import commands.utils.TestUtils;
import data.LoginData;
import data.Urls;
import pageobjects.InventoryPage;
import pageobjects.LoginPage;

public class Login {
	WebDriver driver = null;
	@BeforeClass
	public void beforeClass() {
		System.out.println("INFO: Setting up test suite..");
		driver = TestUtils.setupChromeDriver();
		driver.get(Urls.homePageUrl);
	}
	@Test
	public void validLogin() {
		LoginPage.loginUser(driver, LoginData.validUsername, LoginData.validPassword);
		TestAssertions.validateElementIsVisible(InventoryPage.btnCart(driver));
	}
	@AfterClass
	public void afterClass() {
		System.out.println("INFO: Tearing down test suite..");
		driver.quit();
	}
}
