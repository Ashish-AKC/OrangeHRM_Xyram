package utils;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

/**
 *
 * @author Ashok
 *
 */

public class Hooks {

	TestContextSetup testContextSetup;
	public WebDriver driver;

	public Hooks(TestContextSetup testContextSetup) {

		this.testContextSetup = testContextSetup;
	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws Throwable {
		WebDriver driver = testContextSetup.testBase.webDriverManager();

		if (scenario.isFailed()) {
			// take screenshot and attached to the report
			File sourcePath = null;
			try {
				sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			} catch (Exception e1) {

				e1.printStackTrace();
			}
			try {
				byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
				scenario.attach(fileContent, "image/png", "imageOfFailedTestCese");
			} catch (FileAlreadyExistsException e) {

				System.out.println(e.getStackTrace());
			}

		}

	}

}
