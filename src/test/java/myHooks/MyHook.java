package myHooks;

import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import Utilities.ConfigReader;
import driver_factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class MyHook {
	
	public WebDriver driver;
	
	@Before
	public void setup() throws Exception{
		Properties prop = ConfigReader.initializePropertiesFile();
		DriverFactory.initializeBrowser(prop.getProperty("browser"));
		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.Util.implicit_wait_time));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.Util.page_load_time));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Utilities.Util.script_time));
		driver.get(prop.getProperty("url"));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
