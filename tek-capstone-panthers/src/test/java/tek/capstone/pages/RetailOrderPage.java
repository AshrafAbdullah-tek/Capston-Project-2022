package tek.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	// 13
	@FindBy(xpath = "//span[text()='All']")
	public WebElement allsection;

	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronics;

	@FindBy(id = "searchInput")
	public WebElement searchInput;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;

	@FindBy(xpath = "//*[name()='path' and contains(@d,'M19 6.41L1')]")
	public WebElement closebarside;

	@FindBy(xpath = "//p[@class='products__name']")
	public WebElement apexitem;

	@FindBy(xpath = "//span[text()='Add to Cart']")
	public WebElement addtoCartBtn;

	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement quantity;

	@FindBy(xpath = "//div[@id='cartBtn']")
	public WebElement cartOption;

	@FindBy(id = "proceedBtn")
	public WebElement proceedBtn;

	@FindBy(xpath = "//button[@id='placeOrderBtn']")
	public WebElement placeOrdreBtn;

	// 14
	@FindBy(id = "orderLink")
	public WebElement orderLink;

	@FindBy(id = "cancelBtn")
	public WebElement cancelBtn;

	@FindBy(id = "reasonInput")
	public WebElement reasonInput;

	@FindBy(xpath = "//button[@class='order__cancel-submit']")
	public WebElement cancelOrder;

	// Scenario 15

	@FindBy(id = "returnBtn")
	public WebElement returnBtn;

	@FindBy(id = "dropOffInput")
	public WebElement dropOffInput;

	@FindBy(xpath = "//button[@class='order__cancel-submit']")
	public WebElement returnOrder;

	// Scenario 16
	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;

	@FindBy(id = "headlineInput")
	public WebElement headlineInput;

	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;

	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;
}