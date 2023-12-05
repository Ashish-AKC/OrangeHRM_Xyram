package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/features/PIM.feature" }, glue = { "stepDefinitions" },
		// tags = "@abc",
		dryRun = false, monochrome = true, plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class TestRunner extends AbstractTestNGCucumberTests {

}
