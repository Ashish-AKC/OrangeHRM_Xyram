package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPOM;
import utils.PageObjectManager;
import utils.TestContextSetup;

public class LoginStepDefs {
	LoginPOM loginPOM;
	TestContextSetup context = new TestContextSetup();
	PageObjectManager pageObjectManager;

	/**
	 * LoginStepDefs() { this.context = context; loginPOM =
	 * context.pageObjectManager.getLoginPage();
	 *
	 * }
	 */
	@Given("I launch application")
	public void i_launc_application() {
		loginPOM = context.pageObjectManager.getLoginPage();
		System.out.println("Application launched");
	}

	@And("I enter username into username text field")
	public void i_enter_username() {
		loginPOM.usernamTxtFiled();
	}

	@And("I enter password into password text field")
	public void i_enter_password() {
		loginPOM.upassworsTxtFiled();
	}

	@And("I click Login button")
	public void i_click_login() {
		loginPOM.loginButton();
	}

	@Then("I see dashboard page")
	public void i_see_dashboard() {

	}
}
