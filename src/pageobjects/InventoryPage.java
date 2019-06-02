package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
//	Locators
	public static WebElement btnCart(WebDriver driver) {
		return driver.findElement(By.cssSelector("#shopping_cart_container"));
	}
	public static WebElement btnAddToCart(WebDriver driver, String itemName) {
		if(itemName == null) itemName = "";
		return driver.findElement(By.xpath(String.format("//div[@class='inventory_item_name'][contains(text(), '%s')]"
				+ "/ancestor::div[@class='inventory_item']//button[text()='ADD TO CART']", itemName)));
	}
	public static WebElement btnRemove(WebDriver driver, String itemName) {
		if(itemName == null) itemName = "";
		return driver.findElement(By.xpath(String.format("//div[@class='inventory_item_name'][contains(text(), '%s')]"
				+ "/ancestor::div[@class='inventory_item']//button[text()='REMOVE']", itemName)));
	}
//	Methods
	public static void addToCart(WebDriver driver, String itemName) {
		btnAddToCart(driver, itemName).click();
	}
	public static void goToCart(WebDriver driver) {
		btnCart(driver).click();
	}
}
