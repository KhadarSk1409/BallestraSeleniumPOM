package testCases;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;
import utils.ConfigReader;

public class BaseTest {
	
	WebDriver driver;
	LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		
		Properties prop = ConfigReader.loadProperties();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khadh\\eclipse-workspace\\SeleniumPOMInternal\\Drivers\\chromedriver.exe");
		
		// Setup ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}



}
