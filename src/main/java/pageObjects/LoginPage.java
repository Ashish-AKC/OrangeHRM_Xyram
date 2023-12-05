package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.PropertiesFile;

public class LoginPage {

	public WebDriver driver;
	PropertiesFile prop = new PropertiesFile();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement usernameTxt;
	@FindBy(xpath = "//input[@type='password']")
	WebElement passwordTxt;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement logInButton;
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement dashboard;

	public void loginToApplication() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		usernameTxt.sendKeys(prop.getProperty("username"));
		passwordTxt.sendKeys(prop.getProperty("password"));
		logInButton.click();
		Assert.assertEquals(dashboard.getText(), "Dashboard");
	}

	public void usernamTxtFiled() {
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		usernameTxt.sendKeys("Admin");
	}

	public void upassworsTxtFiled() throws InterruptedException {
		passwordTxt.sendKeys("admin123");
	}

	public void loginButton() {
		logInButton.click();
	}

	public void dashboard() {
		Assert.assertEquals(dashboard.getText(), "Dashboard");
	}
}
