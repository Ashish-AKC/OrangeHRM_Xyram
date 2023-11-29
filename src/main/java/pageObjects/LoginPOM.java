package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.PropertiesFile;

public class LoginPOM {

	WebDriver driver;
	PropertiesFile prop = new PropertiesFile();

	public LoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement usernameTxt;
	@FindBy(name = "password")
	WebElement passwordTxt;
	@FindBy(xpath = "//button[text()=' Login ']")
	WebElement logInButton;

	public void loginToApplication() {
		usernameTxt.sendKeys(prop.getProperty("username"));
		passwordTxt.sendKeys(prop.getProperty("password"));
		logInButton.click();
	}

	public void usernamTxtFiled() {
		usernameTxt.sendKeys(prop.getProperty("username"));
	}

	public void upassworsTxtFiled() {
		usernameTxt.sendKeys(prop.getProperty("password"));
	}

	public void loginButton() {
		logInButton.click();
	}
}
