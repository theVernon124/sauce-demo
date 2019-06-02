package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
//	Locators
	private static String fldUsername = "#user-name";
	private static String fldPassword = "#password";
	private static String btnLogin = "input.btn_action";
//	Methods
	public static void loginUser(WebDriver driver, String username, String password) {
		driver.findElement(By.cssSelector(fldUsername))
			.sendKeys(username);
		driver.findElement(By.cssSelector(fldPassword))
			.sendKeys(password);
		driver.findElement(By.cssSelector(btnLogin))
			.click();
	}
}
