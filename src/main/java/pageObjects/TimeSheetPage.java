package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TimeSheetPage {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='username']")
	WebElement usernameTxt;
	@FindBy(xpath = "//input[@type='password']")
	WebElement passwordTxt;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement logInButton;
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//input[@placeholder = 'Type for hints...']")
	WebElement projectTxtBox;
	@FindBy(xpath = "//div[@class = 'oxd-select-wrapper']")
	WebElement activityDropDown;

	public TimeSheetPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginToApplication(String username, String password) {
		usernameTxt.sendKeys(username);
		passwordTxt.sendKeys(password);
		logInButton.click();
		Assert.assertEquals(dashboard.getText(), "Dashboard");
	}

	public void iseeProjectTextBox() {
		boolean textBox = projectTxtBox.isDisplayed();
		Assert.assertTrue(textBox);
	}

	public void iseeActivityDropDown(String activty) {
		boolean dropDown = activityDropDown.isDisplayed();
		Assert.assertTrue(dropDown);
	}

	public void enterhrs(String day, String hrs) {
		switch (day) {
		case "Mon":
			driver.findElement(By.xpath("//tbody[1]/tr[1]/td[3]/div[1]/div[2]/input[1]")).sendKeys(hrs);
			break;
		case "Tue":
			driver.findElement(By.xpath("//tbody[1]/tr[1]/td[4]/div[1]/div[2]/input[1]")).sendKeys(hrs);
			break;
		case "Web":
			driver.findElement(By.xpath("//tbody[1]/tr[1]/td[5]/div[1]/div[2]/input[1]")).sendKeys(hrs);
			break;
		case "Thu":
			driver.findElement(By.xpath("//tbody[1]/tr[1]/td[6]/div[1]/div[2]/input[1]")).sendKeys(hrs);
			break;
		case "Fri":
			driver.findElement(By.xpath("//tbody[1]/tr[1]/td[7]/div[1]/div[2]/input[1]")).sendKeys(hrs);
			break;
		case "Sat":
			driver.findElement(By.xpath("//tbody[1]/tr[1]/td[8]/div[1]/div[2]/input[1]")).sendKeys(hrs);
			break;
		case "Sun":
			driver.findElement(By.xpath("//tbody[1]/tr[1]/td[9]/div[1]/div[2]/input[1]")).sendKeys(hrs);
			break;
		default:
			break;
		}
	}

	public void activityDropDown(String activity) {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		driver.findElement(By.xpath("//span[text()='" + activity + "']")).click();
	}

	public void selectProject(String project) {
		driver.findElement(By.xpath("//tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys(project);
		driver.findElement(By.xpath("//span[text()='Internal - Recruitment']")).click();
	}
}
