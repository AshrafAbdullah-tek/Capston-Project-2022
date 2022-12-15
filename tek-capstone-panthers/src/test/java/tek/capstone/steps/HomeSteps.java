package tek.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.capstone.pages.POMFactory;
import tek.capstone.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@And("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allSection);
		logger.info("User click on All section");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void shopByDepartment(DataTable data) {
		List<Map<String, String>> allDepartmentItems = data.asMaps(String.class, String.class);

		getElementText(factory.homePage().electronics);
		getElementText(factory.homePage().computers);
		getElementText(factory.homePage().smartHome);
		getElementText(factory.homePage().sports);
		getElementText(factory.homePage().automative);
		waitTillPresence(factory.homePage().electronics);
		Assert.assertTrue(isElementDisplayed(factory.homePage().allSection));
		logger.info("User click on All section");
		slowDown();
	}

	// Scenario 12
	@And("User on <Electronics>")
	public void userOnElectronic() {
		click(factory.homePage().electronics);
		logger.info("Userr on Electronics");
	}

	@Then("below options are present in department")
	public void allDepartment(DataTable data) {

		List<Map<String, String>> allDepartment = data.asMaps(String.class, String.class);

		getElementText(factory.homePage().tvVideo);
		getElementText(factory.homePage().videoGames);

		slowDown();

	}

}
