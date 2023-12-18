package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TimeSheetPage;
import utils.TestContextSetup;

public class TimeSheetStepDefs {

	TimeSheetPage timesheetpage;
	TestContextSetup context;

	public TimeSheetStepDefs(TestContextSetup context) {
		this.context = context;
		timesheetpage = context.pageObjectManager.getTimeSheet();

	}

	@When("I login to user application {string},{string}")
	public void loginToApplication(String username, String password) {
		timesheetpage.loginToApplication(username, password);
	}

	@Then("I see {string} text box")
	public void i_see_textBox(String textBox) {
		timesheetpage.iseeProjectTextBox();
	}

	@And("I see {string} dropdown")
	public void i_see_activityDropDown(String activity) {
		timesheetpage.iseeActivityDropDown(activity);
	}

	@And("I enter time sheet {string} day working {string} hrs")
	public void i_enter_timesheet(String day, String hrs) {
		timesheetpage.enterhrs(day, hrs);
	}

	@And("I select {string} in activity dropdown")
	public void selectActivity(String activity) {
		timesheetpage.activityDropDown(activity);
	}

	@When("I select {string} project")
	public void selectProject(String project) {
		timesheetpage.selectProject(project);
	}

}
