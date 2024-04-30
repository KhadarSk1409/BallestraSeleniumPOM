package testCases;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjects.OnboardingPage;
import utils.ConfigReader;
import utils.MyTestListener;

@Listeners(MyTestListener.class)
public class OnboardingTest extends BaseTest {

	@Test
	public void customerOnboarding() throws InterruptedException, IOException {
		
		Properties prop = ConfigReader.loadProperties();

		OnboardingPage onboard = new OnboardingPage(driver);

		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		onboard.createUser();
	}

}
