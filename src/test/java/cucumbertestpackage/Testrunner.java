package cucumbertestpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = {"src/main/java/resources"},glue={"Stepdef"}
	,dryRun=false)	 
 
public class Testrunner {

}
