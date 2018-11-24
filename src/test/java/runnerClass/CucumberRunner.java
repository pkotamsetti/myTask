package runnerClass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/Features" }, glue = { "classpath:stepDef" })


public class CucumberRunner {

}
