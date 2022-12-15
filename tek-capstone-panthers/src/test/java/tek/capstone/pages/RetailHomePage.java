package tek.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}
	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement logo;
	
	@FindBy(id = "signinLink")
	public WebElement signInLink;
	
	@FindBy(id="hamburgerBtn")
    public WebElement allSection;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronics;
	
	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computers;
	
	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smartHome;
	
	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sports;
	
	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automative;
	
	//12
	@FindBy(xpath="//span[text()='TV & Video']")
    public WebElement tvVideo;
    
    @FindBy(xpath="//span[text()='Video Games']")
    public WebElement videoGames;

}
