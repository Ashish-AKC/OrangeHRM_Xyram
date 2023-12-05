package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LoginStepDefs {
	LoginPage loginpage;
	TestContextSetup context;

	public LoginStepDefs(TestContextSetup context) {
		this.context = context;
		loginpage = context.pageObjectManager.getLoginPage();

	}

	@Given("I launch application")
	public void i_launc_application() {
		// loginpage = context.pageObjectManager.getLoginPage();
		System.out.println("Application launched");
	}

	@And("I enter username into username text field")
	public void i_enter_username() {
		loginpage.usernamTxtFiled();
	}

	@And("I enter password into password text field")
	public void i_enter_password() throws InterruptedException {
		loginpage.upassworsTxtFiled();
	}

	@And("I click Login button")
	public void i_click_login() {
		loginpage.loginButton();
	}

	@Then("I see dashboard page")
	public void i_see_dashboard() {
		loginpage.dashboard();
	}

	@Given("I Login to application")
	public void loginToApplication() {
		// loginpage = new LoginPage(base.webDriverManager());
		loginpage.loginToApplication();
	}
}
