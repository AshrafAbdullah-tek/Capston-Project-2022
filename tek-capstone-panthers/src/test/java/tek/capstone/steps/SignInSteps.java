package tek.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.pages.POMFactory;
import tek.capstone.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		slowDown();


	}

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInLink);
		logger.info("Click on signIn Page");
		slowDown();


	}

	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("User enter email" + email + "password" + password);
		slowDown();


	}

	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().logInBtn);
		logger.info("User clicks on logIn Button");
		slowDown();


	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
		logger.info("User loggedIn into account");
		slowDown();
	}
	
	// Create Account

	@And("User click on Create New Account button")
	public void userClickOnCreateAccount() {
		click(factory.signInPage().newAccBtn);
		logger.info("User clicks on new account button");
		slowDown();

	}

	@And("User fill the signUp information with below data")
	public void userFillInfo(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameInput, signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailInput, signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordInput, signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmPasswordInput, signUpData.get(0).get("confirmPassword"));
		logger.info("User fill the signUp information");

	}

	@And("User click on SignUp button")
	public void userClickOnSingUpBtn() {
		click(factory.signInPage().signUpBtn);
		logger.info("User clicks on SignUp Button");

	}

	@Then("User should be logged into account page")
	public void userLoggedIntoPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
		logger.info("Account is created");
		slowDown();

	}

}
