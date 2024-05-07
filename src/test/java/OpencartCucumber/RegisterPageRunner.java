package OpencartCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/OpencartCucumber",glue="StepDefination",monochrome=true,plugin={"html:target/cucumberTest.html"})
public class RegisterPageRunner extends AbstractTestNGCucumberTests{

}
