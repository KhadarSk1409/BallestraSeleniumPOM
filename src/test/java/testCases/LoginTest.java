package testCases;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import utils.ConfigReader;
import utils.MyTestListener;

@Listeners(MyTestListener.class)
public class LoginTest extends BaseTest {


	@Test
	public void testLogin() throws IOException {
		Properties prop = ConfigReader.loadProperties();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.verifyLogoAfterLogin();

	}

}
