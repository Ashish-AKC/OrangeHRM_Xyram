package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PIMpage {
	public WebDriver driver;
	WebDriverWait wait;
	@FindBy(name = "firstName")
	WebElement firstNameTxtField;
	@FindBy(name = "lastName")
	WebElement lastNameTxtField;
	@FindBy(xpath = "//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']")
	WebElement successfulTosterMssg;
	@FindBy(xpath = "//label[text()='SSN Number']/../following-sibling::div/input")
	WebElement ssnNumberTxt;
	@FindBy(xpath = "//label[text()='Nationality']/../following-sibling::div/div/div/div[2]")
	WebElement nationalityDropDown;
	@FindBy(xpath = "//p[text()=' * Required']/../button")
	WebElement savePersonalDetails;

	public PIMpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofMinutes(1));
	}

	public void menuList(String menu) {
		// driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//span[text()='" + menu + "']")).click();
	}

	public void verifyHeader(String header) {
		String orginalHeader = driver.findElement(By.xpath("//span[text()='" + header + "']")).getText();
		Assert.assertEquals(orginalHeader, header);
	}

	public void tabs(String tabs) {
		driver.findElement(By.xpath("//a[text()='" + tabs + "']")).click();
	}

	public void minPages(String verifyPage) {
		String orginalPage = driver.findElement(By.xpath("//h6[text()='" + verifyPage + "']")).getText();
		Assert.assertEquals(orginalPage, verifyPage);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterEmployeeName(String firstName, String lastName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		firstNameTxtField.sendKeys(firstName);
		lastNameTxtField.sendKeys(lastName);

	}

	public void clickCancelOrSaveButton(String button) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[text()=' " + button + " ']")).click();
	}

	public void successTosterMssg(String toster) {
		boolean orginalToster = successfulTosterMssg.isDisplayed();
		Assert.assertTrue(orginalToster);
	}

	public void verifyDefaultTab(String tab) {
		String orginalTab = driver.findElement(By.xpath("//a[text()='" + tab + "']")).getText();
		Assert.assertEquals(orginalTab, tab);
	}

	public void enerSSNNumber(String ssnNumber) {
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/div[1]/div[1]/div[2]/input")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ssnNumberTxt.sendKeys(ssnNumber);
	}

	public void nationalityAndMaritual(String nationality) {
		nationalityDropDown.click();
//		List<WebElement> natiolaityList = driver
//				.findElements(By.xpath("//label[text()='Nationality']/../following-sibling::div/div/div/div[2]/div/span[text()='Indian']"));

		driver.findElement(By.xpath("//span[text()='" + nationality + "']")).click();
	}

	public void savePersonalDetails() {
		savePersonalDetails.click();
	}

	public void selectgender(String gender) {
		driver.findElement(By.xpath("//label[normalize-space()='" + gender
				+ "']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")).click();
	}
}
