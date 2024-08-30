package step_definition_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver_factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tutorialnijaPage.HomePage;
import tutorialnijaPage.LoginPage;


public class Login {
	
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
	
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
		driver = DriverFactory.getDriver();
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		loginpage = homepage.combiningTwoActionsToNavigateTologinPage();
		
	}
	
	@When("User enters valid email {string}")
	public void user_valid_email(String validEmailText) {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmailInEmailTextBox(validEmailText);
		
	}
	@And("User enters valid password {string}")
	public void user_enters_valid_password(String validPasswordText) {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterPasswordInPasswordTextBox(validPasswordText);
		
	}
	@And("User clicks on login button")
	public void user_enters_valid_password() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickOnLoginButton();
	}
	@Then("User is redirected to Account page")
	public void user_is_redirected_to_account_page() {
		System.out.println("User is redirected to account page");
		
	}
	
}
	


