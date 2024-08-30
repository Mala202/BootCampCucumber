package runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		 dryRun = false,
		 monochrome = true,
		 features = {"src/test/resources/feature_files"},
		 glue = {"step_definition_files"},
		 tags = "@Tutorialsninja",
		 plugin = {"pretty", "html:target/site/cucumber-html","json:target/cucumber1.json"}

       )






public class Runner_TestNG extends AbstractTestNGCucumberTests{

}
