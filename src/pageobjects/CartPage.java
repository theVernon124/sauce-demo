package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
//	Locators
	public static WebElement liCartItem(WebDriver driver) {
		return driver.findElement(By.xpath(xpathExpression))
	}
}
