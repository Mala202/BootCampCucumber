package runner_files;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
 @RunWith(Cucumber.class)
 @CucumberOptions(
		 dryRun = false,
		 monochrome = true,
		 features = {"src/test/resources/feature_files"},
		 glue = {"step_definition_files"},
		 tags = "@Tutorialsninja"

        )
 
 
 
 public class Runner_junit {
 
 
}
