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
import tutorialnijaPage.RegisterPage;

public class Register {
	public WebDriver driver;
	
	public Register(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

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
	@Given("User navigates to Register page")
	public void user_navigates_to_login_page() {
		driver = DriverFactory.getDriver();
		HomePage homepage =  new HomePage(driver);
		homepage.combiningTwoActionsToNavigateToRegisterPage();
		
	}
	
	@When("User enters valid FirstName {string}")
	public void user_valid_firstname(String validFirstnameText) {
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.enterFirstnameText(validFirstnameText);
		
	}
	@And("User enters valid LastName {string}")
	public void user_enters_valid_lastname(String validLastnameText) {
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.enterlastnameText(validLastnameText);
		
	}
	@And("User enters valid Email {string}")
	public void user_enters_valid_email(String validEmailText) {
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.enteremailText(validEmailText);
	}
	@And("User enters valid Telephone {string}")
	public void user_enters_valid_telephone(String validTelephone) {
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.entertelephoneText(validTelephone);
	}
	@And("User enters valid password {string}")
	public void user_enters_valid_password() {
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.enterpasswordText(validpassword);
	
	}
	@And("User enters valid password confirm {string}")
	public void user_eneters_valid_password_confirm() {
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.enterconfirmpasswordText(confirmpassword);
		
	}
	@And("User click yes subscribe radio button")
	public void User_click_yes_subscribe_radio_button() {
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.clickYesSubscribeRadioButton();
	}
	@And("User clicks on privacy policy")
	public void user_clicks_on_privacy_policy() {
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.clickOnPrivacyPolicy();
		
	}

	@And("User clicks on continue button")
	public void User_clicks_on_continue_button() {
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.clickOncontinuebutton();
	}
	
	@Then("User is redirected to Account Success Page")
	public void user_is_redirected_to_account_success_page() {
		System.out.println("User is redirected to Account Success Page");
	}
}
