package utils;

import org.openqa.selenium.WebDriver;

/**
 * In TestContextSetup class we are intializing driver
 *
 * @author Ashok
 *
 */
public class TestContextSetup {
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	TestBase testBase;

	public TestContextSetup() {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.webDriverManager());
	}
}
