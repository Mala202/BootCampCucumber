package step_definition_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver_factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tutorialnijaPage.LogoutPage;

public class LogoutScenarios {
	
	
	
	public WebDriver driver;
	@Before
	public void initializeDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("User navigates to Logout page")
	public void user_navigates_to_logout_page() {
		driver = DriverFactory.getDriver();
		LogoutPage logout = new LogoutPage();
		LogoutPage.clickOnMyAccount();
		LogoutPage.clickOnLogout();
	}
	@Then("User is redirected to Account Logout page")
	public void user_is_redirected_to_account_logout_page() {
		System.out.println("User is redirected to Account Logout Page");
	
	}

}
