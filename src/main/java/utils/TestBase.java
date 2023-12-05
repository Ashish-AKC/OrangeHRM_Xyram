package utils;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	WebDriver driver;
	PropertiesFile prop;
	//
	private static final Logger LOG = LogManager.getLogger(TestBase.class);

	public WebDriver webDriverManager() {
		prop = new PropertiesFile();
		String browser = prop.getProperty("browser");
		//
		// if (driver == null) {
		LOG.info("Launching the browser...!!");
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("disable-notifications");
			driver = WebDriverManager.chromedriver().capabilities(options).create();
			// driver = new ChromeDriver(options);// driver gets the life
		}
		/**
		 * if (browser.equalsIgnoreCase("firefox")) {
		 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver(); }
		 */
		driver.manage().window().maximize();
		LOG.info("Launching the application...!!");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1)).pageLoadTimeout(Duration.ofMinutes(2))
				.scriptTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();

		// }

		return driver;

	}
}
