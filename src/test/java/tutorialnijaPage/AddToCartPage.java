package tutorialnijaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage {

	public WebDriver driver;
	
	@FindBy(name= "search")
	private WebElement searchTextbox;
	
	public ProductPage clickOnSearchButton() {
		searchTextbox.click();
		return new ProductPage(driver);
	}
	
}
