package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/ENTERPRISE TOUCH/eclipse-workspace/BDDFrameWorkLearning/src/main/java/features",
		glue = {"stepDefnition"}
		)

public class TestLoginRunner {

	
}
