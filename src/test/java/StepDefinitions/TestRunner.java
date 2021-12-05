package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature",glue={"StepDefinitions"},plugin= {"pretty","html:target/HTMLReports"},tags= {"@smoke"})
public class TestRunner {
	
	

}
