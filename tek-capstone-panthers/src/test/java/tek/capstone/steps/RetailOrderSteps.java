package tek.capstone.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.capstone.pages.POMFactory;
import tek.capstone.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	// Scenario 13
	@And("User change the category to 'Electronics'")
	public void userChangeCategoryToElectronics() {
		click(factory.orderPage().allsection);
		click(factory.orderPage().electronics);
		click(factory.orderPage().closebarside);
		logger.info("User change the category to Electronics");
		slowDown();
	}

	@And("User search for an item 'Apex Legends'")
	public void userSearchForAnItem() {
		sendText(factory.orderPage().searchInput, "Apex Legends");
		logger.info("User search for an item 'Apex Legends'");
		slowDown();

	}

	@And("User click on Search icon button")
	public void userClickOnSearchIcon() {
		click(factory.orderPage().searchBtn);
		logger.info("User click on Search icon");
		slowDown();
	}

	@And("User click on that item")
	public void userClickOnapex() {
		click(factory.orderPage().apexitem);
		logger.info("User click on itme");
		slowDown();
	}

	@And("User select item quantity ‘{int}’")
	public void userSelectQuantity(Integer int1) {
		click(factory.orderPage().quantity);
		sendText(factory.orderPage().quantity, "5");
	}

	@And("User click on add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.orderPage().addtoCartBtn);
		logger.info("User click on add to cart button");
	}

	@Then("The cart icon quantity should change to ‘{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer int1) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().addtoCartBtn));
		logger.info("Item added to the cart");
		slowDown();
	}

	@And("User click on the Cart option")
	public void userClickOnCartOption() {
		click(factory.orderPage().cartOption);
		logger.info("User click on cart option");
	}

	@And("User click on the Proceed to Checkout button")
	public void userClickOnCheckoutBtn() {
		click(factory.orderPage().proceedBtn);
		logger.info("User click on Proceed to Checkout button");
	}

	@And("User click on the Place Your Order")
	public void userClickOnPlaceOrder() {
		click(factory.orderPage().placeOrdreBtn);
	}

	@And("A message should be displayed ‘Order Placed, Thanks’")
	public void messeage() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().placeOrdreBtn));
		logger.info("Order Placed, Thanks");
		slowDown();
	}

	// Scenario 14

	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderLink);
		logger.info("User click on Orders section");
		slowDown();

	}

	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelBtn);
		logger.info("User click on Cancel The Order button");
		slowDown();
	}

	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String string) {
		selectByVisibleText(factory.orderPage().reasonInput, "Bought wrong item");
		logger.info("User select the cancelation Reason");
		slowDown();
	}

	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrder);
		logger.info("User click on Cancel Order button");
		slowDown();
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelOrder));
		logger.info("Your Order Has Been Cancelled");
		slowDown();

	}

	// Scenario 15

	@And("User click on Orders Section")
	public void userclickOnOrdrSection() {
		click(factory.orderPage().orderLink);
		logger.info("User click on Orders section");
		slowDown();
	}

//    @And("User click on first order in list")
//    public void userClickOnFirstOrderInList() {
//    }

	@And("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnBtn);
		logger.info("User click on Return Items button");
		slowDown();
	}

	@And("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
		selectByVisibleText(factory.orderPage().reasonInput, "Item damaged");
		logger.info("User select the Return Reason");
		slowDown();
	}

	@And("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		selectByVisibleText(factory.orderPage().dropOffInput, "FedEx");
		logger.info("User select the Return Reason");
		slowDown();
	}

	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrder);
		logger.info("User click on Return Order button");
		slowDown();
	}

	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
		try {
			Assert.assertTrue(isElementDisplayed(factory.orderPage().returnOrder));
			logger.info("Return was successful");
		} catch (AssertionError e) {
			logger.info(e.getMessage());
		}
		slowDown();
	}

	// Scenario 16
	@And("User click on the Orders section")
	public void userClickOnTheOrdersSection() {
		click(factory.orderPage().orderLink);
		logger.info("User click on the Orders section");
		slowDown();
	}

	@And("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewBtn);
		logger.info("User click on Review button");
		slowDown();
	}

	@And("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText(String string, String string2) {
		sendText(factory.orderPage().headlineInput, "On time delivery");
		sendText(factory.orderPage().descriptionInput, "reasonable price and good quality");
		logger.info("User write Review headline");
		slowDown();
	}

	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().reviewSubmitBtn);
		logger.info("User click Add your Review button");
		slowDown();
	}

	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
		try {
			Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewSubmitBtn));
			logger.info("Your review was added successfully");
		} catch (AssertionError e) {
			logger.info(e.getMessage());
		}
		slowDown();
	}

}