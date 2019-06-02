package commands.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageobjects.InventoryPage;

public class TestAssertions {
	public static void validateElementIsVisible(WebElement element) {
		Assert.assertTrue(element.isDisplayed());
	}
}
