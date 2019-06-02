package commands.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUtils {
	public static WebDriver setupChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Utilities\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver
			.manage()
			.timeouts()
			.implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
}
