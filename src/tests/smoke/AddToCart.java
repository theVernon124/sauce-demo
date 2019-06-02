package tests.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commands.utils.TestAssertions;
import commands.utils.TestUtils;
import data.AddToCartData;
import data.LoginData;
import data.Urls;
import pageobjects.InventoryPage;
import pageobjects.LoginPage;

public class AddToCart {
	WebDriver driver = null;
	@BeforeClass
	public void beforeClass() {
		System.out.println("INFO: Setting up test suite..");
		driver = TestUtils.setupChromeDriver();
		driver.get(Urls.homePageUrl);
	}
	@Test
	public void validAddToCart() {
		LoginPage.loginUser(driver, LoginData.validUsername, LoginData.validPassword);
		InventoryPage.addToCart(driver, AddToCartData.itemName);
		TestAssertions.validateElementIsVisible(InventoryPage.btnRemove(driver, AddToCartData.itemName));
		InventoryPage.goToCart(driver);
	}
}
