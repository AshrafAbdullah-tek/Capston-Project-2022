package tek.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.pages.POMFactory;
import tek.capstone.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account options")
	public void userClickOnAccountOption() {
		click(factory.accountPage().AccountOptions);
		logger.info("Account should be opened");
		slowDown();

	}

	@And("User update Name {string} and Phone {string}")
	public void userUpdateInfo(String name, String phone) {
		sendText(factory.accountPage().nameInput, name);
		sendText(factory.accountPage().phoneInput, phone);
		logger.info("User enters name" + name + " and Phone" + phone);
		slowDown();

	}

	@And("User click on Update button")
	public void userClickOnUpdateBtn() {
		click(factory.accountPage().updateBtn);
		logger.info("User clicks on Update Button");

	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updateBtn));
		logger.info("User Account should be updated");
		slowDown();

	}

	// Scenario 4

	@And("User enter below information")
	public void userEntersBelowInfo(DataTable data) {
		List<Map<String, String>> newPassword = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassInput, newPassword.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPassInput, newPassword.get(0).get("newPassword"));
		sendText(factory.accountPage().ConfnewPassInput, newPassword.get(0).get("confirmPassword"));
		logger.info("User entered new Pass");
		slowDown();

	}

	@When("User click on Change Password button")
	public void userClickOnChangePasswordBtn() {
		click(factory.accountPage().changePassBtn);
		logger.info("User clicks on changePass Button");
	}

	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void passWordUpdated() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().changePassBtn));
		logger.info("Password Updated Successfully");
		slowDown();

	}

	// 5
	@When("User click on Account option")
	public void UserClickOnAccOption() {
		click(factory.accountPage().AccOption);
		logger.info("User click on Account option");

	}

	@And("User click on Add a payment method link")
	public void userClickOnAddPayment() {
		click(factory.accountPage().AddPaymentMethod);
		logger.info("User click on Add a payment method link");

	}

	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInfo(DataTable data) {
		List<Map<String, String>> paymentInfo = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, paymentInfo.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, paymentInfo.get(0).get("nameOnCard"));
		sendText(factory.accountPage().expirationMonth, paymentInfo.get(0).get("expirationMonth"));
		sendText(factory.accountPage().expirationYear, paymentInfo.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityInput, paymentInfo.get(0).get("securityCode"));
		logger.info("Enter Payment Information");
		slowDown();

	}

	@And("User click on Add your card button")
	public void userClickOnAddCardBtn() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("Payment Submit");
	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void messageShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentSubmitBtn));
		logger.info("Payment Info Successfully");
		slowDown();

	}

	// Scenario 6

////	@When("User click on Account options")
////	public void ClickOnAccountOption() {
////		click(factory.accountPage().AccOption);
////		logger.info("Account should be opened");
////	}
////	
	@And("User click on Master Card")
	public void userClickOnMasterCard() {
		click(factory.accountPage().masterCard);
		logger.info("User Click on Master Card");
		slowDown();
	}

	@And("User click on Edit option of card section")
	public void clickOnEditOptionOfCard() {
		click(factory.accountPage().edit);
		logger.info("User click on Edit optoin of card section");
		slowDown();
	}

	@And("User edit information with below data")
	public void userEditInfo(DataTable data) {
		List<Map<String, String>> editCardInfo = data.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput, editCardInfo.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput, editCardInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonth, editCardInfo.get(0).get("expirationMonth"));
		// clearText(factory.accountPage().expirationMonth,
		// editCardInfo.get(0).get("expirationMonth"));
		sendText(factory.accountPage().expirationMonth, editCardInfo.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYear, editCardInfo.get(0).get("expirationYear"));
		// clearText(factory.accountPage().expirationYear,
		// editCardInfo.get(0).get("expirationYear"));
		sendText(factory.accountPage().expirationYear, editCardInfo.get(0).get("expirationYear"));
		clearText(factory.accountPage().securityCodeInput, editCardInfo.get(0).get("secrutiyCode"));
		sendText(factory.accountPage().securityCodeInput, editCardInfo.get(0).get("securityCode"));
		logger.info("User Edit Card Info");
		slowDown();

	}

	@And("User click on Update Your Card button")
	public void UpdateCardBtn() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("User Click On Update Card Button");

	}

	@Then("a message should be displayed 'Payment Method updated Successfully'")
	public void aMessageShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentSubmitBtn));
		logger.info("Payment Method updated Successfully");
		slowDown();
	}

	// #7

//	@And("User click on Master Card")
//	public void userClickMasterCard() {
//		click(factory.accountPage().masterCard);
//		logger.info("User Click on Master Card");
//		slowDown();
//	}

	@And("User click on remove option of card section")
	public void userClickOnRemoveOption() {
		click(factory.accountPage().removeOption);
		logger.info("User Click On Remove Option");

	}

	@Then("payment details should be removed")
	public void removePaymentDetail() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().removeOption));
		logger.info("Payment Details should be Removed");
		slowDown();

	}

	// #8

	@And("User click on Add address option")
	public void userClickOnAddressOption() {
		click(factory.accountPage().clickAddressOption);
		logger.info("User Click on Address Option");
	}

	@And("User fill address form with below information")
	public void userFilladdInfo(DataTable data) {
		List<Map<String, String>> AddressInfo = data.asMaps(String.class, String.class);

		// click(factory.accountPage().country);
		selectByVisibleText(factory.accountPage().country, AddressInfo.get(0).get("country"));
		// sendText(factory.accountPage().country, AddressInfo.get(0).get("country"));
		sendText(factory.accountPage().fullName, AddressInfo.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumber, AddressInfo.get(0).get("phoneNumber"));
		sendText(factory.accountPage().streetInput, AddressInfo.get(0).get("streetAddress"));
		sendText(factory.accountPage().apartmentNumber, AddressInfo.get(0).get("apt"));
		sendText(factory.accountPage().cityInput, AddressInfo.get(0).get("city"));
		click(factory.accountPage().stateInput);
		sendText(factory.accountPage().stateInput, AddressInfo.get(0).get("state"));
		sendText(factory.accountPage().zipCode, AddressInfo.get(0).get("zipCode"));
		logger.info("User add new address");
		slowDown();
	}

	@And("User click Add Your Address button")
	public void userClickAddressBtn() {
		click(factory.accountPage().addressBtn);
		logger.info("User click Add Your Address button");
	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public void addressAdded() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressBtn));
		logger.info("Address Added Successfully");
		slowDown();

	}

	// Scenario 9
	@And("User click on edit address option")
	public void userclickOnEditAddOption() {
		click(factory.accountPage().editAddBtn);
		logger.info("User click on edit address option");

	}

	@And("User fill new address form with below information")
	public void userFillNewAdd(DataTable data) {
		List<Map<String, String>> updateAddressInfo = data.asMaps(String.class, String.class);
		click(factory.accountPage().country);
		sendText(factory.accountPage().country, updateAddressInfo.get(0).get("country"));

		// clearText(factory.accountPage().editCarNumber,
		// updateAddressInfo.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().fullName);
		sendText(factory.accountPage().fullName, updateAddressInfo.get(0).get("fullName"));

		// clearText(factory.accountPage().phoneNumber,
		// updateAddressInfo.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumber);
		sendText(factory.accountPage().phoneNumber, updateAddressInfo.get(0).get("phoneNumber"));

		// clearText(factory.accountPage().streetInput,
		// updateAddressInfo.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		

		// clearText(factory.accountPage().editCarNumber,
		// updateAddressInfo.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().apartmentNumber);
		sendText(factory.accountPage().apartmentNumber, updateAddressInfo.get(0).get("apt"));

		// clearText(factory.accountPage().cityInput,
		// updateAddressInfo.get(0).get("city"));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput, updateAddressInfo.get(0).get("city"));

		click(factory.accountPage().stateInput);
		sendText(factory.accountPage().stateInput, updateAddressInfo.get(0).get("state"));

		// clearText(factory.accountPage().zipCode,
		// updateAddressInfo.get(0).get("zipCode"));
		clearTextUsingSendKeys(factory.accountPage().zipCode);
		sendText(factory.accountPage().zipCode, updateAddressInfo.get(0).get("zipCode"));
		logger.info("User add new address");
		slowDown();
	}

	@And("User click update Your Address button")
	public void userClickUpdateAddBtn() {
		click(factory.accountPage().updateYourAddBtn);
		logger.info("User click update your address button");

	}

	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void upDateAddmessageDisplay() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updateYourAddBtn));
		logger.info("Address Added Successfully");
		slowDown();

	}

	// Scenario 10
	@And("User click on remove option of Address section")
	public void userClickOnAddRemoveBtn() {
		click(factory.accountPage().addRemoveBtn);
		logger.info("User cick on remove option of Address section");
	}

	@Then("Address details should be removed")
	public void removeAddDetail() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addRemoveBtn));
		logger.info("Address details should be removed");
		slowDown();
	}
	
	// Scenario 11
    @And("User change the category to 'Smart Home'")
    public void smartHome() {
        click(factory.homePage().allSection);
        logger.info("User change the category to Smart Home");
    }
    
//    @And("User search for an item {string}")
//    public void userSearchForAnItem(String item) {
    @And("User search for an item 'kasa outdoor smart plug'")
    public void userSearchForAnItem() {
        click(factory.homePage().smartHome);
        logger.info("User search for an itme");
    }
    @And("User click on Search icon")
    public void userClickOnSearchIcon() {
        click(factory.accountPage().plugAndOutlets);
        logger.info("User click on Search icon");
    }
    @And("User click on item")
    public void userClickOnItem() {
        click(factory.accountPage().kasaOutDoorPlug);
        logger.info("User click on itme");
    }
    @And("User select quantity ‘{int}’")
    public void userSelectQuantity(Integer int1) {
        click(factory.accountPage().quantity);
        sendText(factory.accountPage().quantity, "2");
    }
    @And("User click add to Cart button")
    public void userClickAddToCartButton() {
        click(factory.accountPage().addtoCartBtn);
        logger.info("User click on add to cart button");
    }
    @Then("the cart icon quantity should change to ‘{int}’")
    public void theCartIconQuantityShouldChangeTo(Integer int1) {
        Assert.assertTrue(isElementDisplayed(factory.accountPage().addtoCartBtn));
        logger.info("Item added to the cart");
        slowDown();
    }
    
 // Scenariao 12
    @And("User click on Cart option")
    public void userClickOnCartOption() {
        click(factory.accountPage().cartOption);
        logger.info("User click on cart option");
    }
    
    @And("User click on Proceed to Checkout button")
    public void userClickOnCheckoutBtn() {
        click(factory.accountPage().proceedBtn);
        logger.info("User click on Proceed to Checkout button");
    }
    @And("User click Add a new address link for shipping address")
    public void clickOnNewAddressLink() {
        click(factory.accountPage().addAddressBtn);
        logger.info("User click Add a new address link for shipping address");
    }
    @And("User fill new address with below information")
    public void userFillNewAddWithBelowInfo(DataTable data) {
        List<Map<String, String>> updateAddressInfo = data.asMaps(String.class,String.class);
        
        selectByVisibleText(factory.accountPage().countryDropDown, updateAddressInfo.get(0).get("country"));



       clearTextUsingSendKeys(factory.accountPage().fullNameInput);
        sendText(factory.accountPage().fullNameInput, updateAddressInfo.get(0).get("fullName"));



       clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
        sendText(factory.accountPage().phoneNumberInput, updateAddressInfo.get(0).get("phoneNumber"));
    
        clearTextUsingSendKeys(factory.accountPage().streetNoInput);
        sendText(factory.accountPage().streetNoInput, updateAddressInfo.get(0).get("streetAddress"));
        
        clearTextUsingSendKeys(factory.accountPage().apartmentInput);
        sendText(factory.accountPage().apartmentInput, updateAddressInfo.get(0).get("apt"));
        
        clearTextUsingSendKeys(factory.accountPage().cityNameInput);
        sendText(factory.accountPage().cityNameInput, updateAddressInfo.get(0).get("city"));
        
        selectByVisibleText(factory.accountPage().stateDropD, updateAddressInfo.get(0).get("state"));
        
        clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
        sendText(factory.accountPage().zipCodeInput, updateAddressInfo.get(0).get("zipCode"));
        logger.info("User add new address");
        slowDown();
        }
    @And("User click on Add Your Address button")
    public void userClickYourAddBtn() {
    click(factory.accountPage().addBtn);
    logger.info("User click update your address button");
        
    }
    @And("User click Add credit card or Debit Card for Payment method")
    public void userClickCreditOrDebitCard() {
        click(factory.accountPage().addPaymentBtn);
        logger.info("User click Add a credit card or Debit Card for Payment method");
        }
    @And("User fill new Debit or credit card information")
    public void userFillCreditBebitCard(DataTable data) {
    List<Map<String, String>> paymentInfo = data.asMaps(String.class,String.class);
    sendText(factory.accountPage().cardNumberInput, paymentInfo.get(0).get("cardNumber"));
    sendText(factory.accountPage().nameOnCardInput, paymentInfo.get(0).get("nameOnCard"));
    sendText(factory.accountPage().expirationMonthInput, paymentInfo.get(0).get("expirationMonth"));
    sendText(factory.accountPage().expirationYearInput, paymentInfo.get(0).get("expirationYear"));
    sendText(factory.accountPage().securityCodeInput, paymentInfo.get(0).get("securityCode"));
    logger.info("User enter payment information");
    slowDown();    
    }
    @And("User click Add your card button")
    public void userclickOnAddCard() {
        click(factory.accountPage().paymentSubmitButton);
        logger.info("User click on Add your card button");
    }
    
    @And("User click on Place Your Order")
    public void userClickOnPlaceOrder() {
        click(factory.accountPage().placeOrdreBtn);
        }
    @And("a message should be displayed ‘Order Placed, Thanks’")
    public void messeage() {
        Assert.assertTrue(isElementDisplayed(factory.accountPage().placeOrdreBtn));
        logger.info("Order Placed, Thanks");
        slowDown();
        }

}
