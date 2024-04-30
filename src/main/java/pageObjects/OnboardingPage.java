package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OnboardingPage {

	WebDriver driver;

	public OnboardingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "a[href='/ui/onboarding']")
	private WebElement OnboardingBtn;

	@FindBy(css = "input[placeholder='Company Name']")
	private WebElement companyNameInputField;

	@FindBy(xpath = "//select[@name='countryName']")
	private WebElement selectCountryDropdwon;

	@FindBy(css = "input[placeholder='First Name']")
	private WebElement firstNameInputField;

	@FindBy(css = "input[placeholder='Last Name']")
	private WebElement lastNameInputField;

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement emailInputField;

	@FindBy(css = "input[placeholder='Mobile Number']")
	private WebElement mobileNumInputField;

	@FindBy(css = "textarea[name='address']")
	private WebElement addressField;

	@FindBy(css = "textarea[name='description']")
	private WebElement descriptionField;

	@FindBy(css = "div[class='lg:pt-8 pt-5'] button[role='combobox']")
	private WebElement plantsSelectionDropdown;

	@FindBy(css = "button[type='submit']")
	private WebElement createButton;

	@FindBy(xpath = "//input[@placeholder='Plant Name']")
	private WebElement plantNameInputField;

	public void clickOnOnboardingBtn() {
		OnboardingBtn.click();
	}

	@FindBy(css = "input[placeholder='No of Users']")
	private WebElement numOfUsers;

	@FindBy(xpath = "//input[@placeholder='Plant Address']")
	private WebElement plantAddressField;
	
	@FindBy(xpath = "(//button[@type='button'])[10]")
	private WebElement departmentsDropDownBtn;
	
	@FindBy(css = "div[data-value='quality-lab']")
	private WebElement selectQualityLabDept;
	
	@FindBy(xpath = "(//button[@type='button'])[11]")
	private WebElement techDropdown;
	
	@FindBy(css = "div[data-value='soap']")
	private WebElement selectSoap;

	public void enterCompanyName() {
		companyNameInputField.sendKeys("Technoidentity");
	}

	public void selectCountry() {

		Select dropdown = new Select(selectCountryDropdwon);
		dropdown.selectByVisibleText("Afghanistan");
		WebElement selectedOption = dropdown.getFirstSelectedOption();
		String selectedCountry = selectedOption.getText();
		System.out.println("The selected country is: " + selectedCountry);

	}

	public void enterFirstName() {
		firstNameInputField.sendKeys("Shaik");
	}

	public void enterLastName() {
		lastNameInputField.sendKeys("Khadar Basha");
	}

	public void enterEmail() {
		emailInputField.sendKeys("Test@gmail.com");
	}

	public void enterPhoneNum() {
		mobileNumInputField.sendKeys("7013771877");
	}

	public void enterAddress() {
		addressField.sendKeys("Hyderabad");
	}

	public void enterDescription() {
		descriptionField.sendKeys("Test");
	}

	public void selectNumOfPlants() {
		//plantsSelectionDropdown.click();
		//driver.findElement(By.xpath("(//option[@value='1'])[1]")).click();
		//WebElement plants = driver.findElement(By.cssSelector("select[name='numOfPlants'] option[value='1']"));
		
		// Wait for the dropdown options to be visible
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement dropdownOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='numOfPlants'] option[value='1']")));

		// Click on the desired option
		//dropdownOption.click();
		//Select numOfPlants =  new Select(plants);
		//numOfPlants.selectByValue("1");
		
		  WebElement e2= driver.findElement(By.xpath("//*[@id='root']/div/article/div[2]/div/form/div[3]/div[1]/div/button/following-sibling::select"));
		  Select s = new Select(e2); 
		  s.selectByValue("1");
		 
	}
	
	
	public void enterPlantName() {
		plantNameInputField.sendKeys("Plant 001");
	}
	
	public void enterNumOfUsers() {
		numOfUsers.sendKeys("2");
	}
	
	public void enterPlantAddress(){
		plantAddressField.sendKeys("Telangana");
	}
	
	public void selectDept() {
		departmentsDropDownBtn.click();
		selectQualityLabDept.click();
	}
	
	public void selectTech() {
		techDropdown.click();
		selectSoap.click();
	}

	public void createUser() {
		clickOnOnboardingBtn();
		enterCompanyName();
		selectCountry();
		enterFirstName();
		enterLastName();
		enterEmail();
		enterPhoneNum();
		enterAddress();
		enterDescription();
		selectNumOfPlants();
		enterPlantName();
		enterPlantAddress();
		selectDept();
		selectTech();
		clickOnCreateBtn();
	}

	public void clickOnCreateBtn() {
		createButton.click();
	}

}
