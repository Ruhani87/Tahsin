package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"C:\\Users\\ruhan\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Featuressss"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDef")
// tags= {"@Jahan"}) 

public class RunTest extends AbstractTestNGCucumberTests{

}
