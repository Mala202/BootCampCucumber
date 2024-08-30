package step_definition_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver_factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tutorialnijaPage.HomePage;
import tutorialnijaPage.ProductPage;

public class AddToCart {
	
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
	
	@Given("User navigates to search product")
	public void user_navigates_to_search_product_page() {
		driver = DriverFactory.getDriver();
		HomePage homepage = new HomePage(driver);
		homepage.enterProductName("HP");
	}
	
	@And("User enter valid product name {string}")
	public void User_enter_valid_product_name(String validProductName){
		ProductPage productpage = new ProductPage(driver);
		productpage.verifyValidProduct();
	}
	@And("User click on search button")
	public void User_click_on_search_button() {
		HomePage homepage = new HomePage(driver);
		homepage.clickOnSearchButton();
	}
	@Then("User User is redirected to Products meeting the search criteria")
	public void  User_User_is_redirected_to_Products_meeting_the_search_criteria_page() {
		
		System.out.println(" User User is redirected to Products meeting the search criteria");
	}
	@And("User click on Add to Cart")
	public void User_click_on_Add_to_Cart() {
		ProductPage productpage = new ProductPage(driver);
		productpage.cliclOnAddToCartButton();
	}
	
	@Then("User is redirected to products page")
	public void  User_is_redirected_to_products_page() {
		System.out.println("User is redirected to products page");
	}
	
	@Then("User resived Success: You have added HP LP3065 to your shopping cart!")
	public void  User_resived_success_you_have_added_HP_LP3065_to_your_shopping_cart() {
		System.out.println("User resived Success: You have added HP LP3065 to your shopping cart!");
	}

	
	
	
	

}
