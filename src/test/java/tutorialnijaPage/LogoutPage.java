package tutorialnijaPage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogoutPage {
	
	public WebElement driver;
	
	@FindBy(xpath ="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	private static WebElement MyAccountButton;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
	private static WebElement LogoutButton;
	

	public static void clickOnMyAccount() {
		MyAccountButton.click();
	}
	
	public static void clickOnLogout() {
		LogoutButton.click();
	}
	
	
}
