package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import pageObjects.PIMpage;

/**
 * This single class responsible to create objects for all page object classes
 *
 * @author Ashok
 *
 */
public class PageObjectManager {
	public WebDriver driver;
	LoginPage login;
	PIMpage pimpage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Here we are initializing driver to Login page.
	 *
	 * @return
	 */
	public LoginPage getLoginPage() {
		return login = new LoginPage(driver);
	}

	public PIMpage getPimPage() {
		return pimpage = new PIMpage(driver);
	}
}
