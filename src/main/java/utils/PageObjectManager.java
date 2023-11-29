package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPOM;

/**
 * This single class responsible to create objects for all page object classes
 *
 * @author Ashok
 *
 */
public class PageObjectManager {
	public WebDriver driver;
	LoginPOM login;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPOM getLoginPage() {
		return login = new LoginPOM(driver);
	}
}
