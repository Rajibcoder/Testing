package in.amazon.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features//verify_error_msg.feature",
		glue = "in.amazon.teststeps"
		//tags = "@TC_002 and @TC_003"
		//tags = "@TC_001 or @TC_002"
		//dryRun = true
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
