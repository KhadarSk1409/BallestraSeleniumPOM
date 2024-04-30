package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement usernameInput;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordInput;

	@FindBy(css = "button[type='submit']")
	private WebElement loginButton;

	@FindBy(xpath = "//img[@alt='Ballestra-logo']")
	private WebElement logo;

	public void clickLoginButton() {
		loginButton.click();
	}

	public void verifyLogoAfterLogin() {
		logo.isDisplayed();
	}

	public void login(String username, String password) {
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		clickLoginButton();

	}
}
