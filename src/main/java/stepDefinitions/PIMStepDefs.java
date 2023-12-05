package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PIMpage;
import utils.TestContextSetup;

public class PIMStepDefs {

	PIMpage pimpage;
	TestContextSetup context;

	public PIMStepDefs(TestContextSetup context) {
		this.context = context;
		pimpage = context.pageObjectManager.getPimPage();
	}

	@When("I click {string} menue")
	public void i_click_menue(String menue) {

		pimpage.menuList(menue);
	}

	@Then("I see {string} on header")
	public void i_see_on_header(String header) {
		pimpage.verifyHeader(header);
	}

	@When("I click {string} Tab")
	public void i_click_tab(String tab) {
		pimpage.tabs(tab);
	}

	@Then("I see {string} page")
	public void i_see_page(String page) {
		pimpage.minPages(page);
	}

	@When("I enter first name {string} and last name {string}")
	public void i_enter_employeeDetails(String firstName, String lastName) {
		pimpage.enterEmployeeName(firstName, lastName);
	}

	@When("I click {string} button")
	public void i_click_button(String cancelOrSaveButton) {
		pimpage.clickCancelOrSaveButton(cancelOrSaveButton);
	}

	@Then("I see {string} toster message")
	public void i_see_toster_message(String tosterMessage) {
		pimpage.successTosterMssg(tosterMessage);
	}

	@Then("I see default as {string} Tab")
	public void i_see_default_as_tab(String defaultTab) {
		pimpage.verifyDefaultTab(defaultTab);
	}

	@When("I enter drivers licence number {string} and expiry date {string}")
	public void i_enter_driver_s_license_number_and(String licenceNumber, String expiryDate) {

	}

	@When("I enter SSN number {string}")
	public void i_enter_ssn_number(String ssn) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pimpage.enerSSNNumber(ssn);
	}

	@When("I select Nationality {string}")
	public void i_select_nationality(String nationality) {
		pimpage.nationalityAndMaritual(nationality);
	}

	@When("I select Date of Birth {string}")
	public void i_select_date_of_birth(String dob) {

	}

	@When("I select gender {string}")
	public void i_selecgender(String gender) {
		pimpage.selectgender(gender);
	}

	@Then("I save personal details")
	public void i_save_personaldetails() {
		pimpage.savePersonalDetails();
	}
}
