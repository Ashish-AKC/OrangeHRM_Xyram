package utils;

import org.openqa.selenium.WebDriver;

/**
 * In TestContextSetup class we are initializing driver
 *
 * @author Ashok
 *
 */
public class TestContextSetup {
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	TestBase testBase;

	/**
	 * This method will helps to initialize driver to the PageObjectManager class
	 */
	public TestContextSetup() {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.webDriverManager());
	}
}
