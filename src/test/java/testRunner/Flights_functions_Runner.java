package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Feature_files/Registration.feature",
glue = "stepDefination",
dryRun = false,
plugin = {"pretty","html:TestReports/Flight_functionality.html"})
public class Flights_functions_Runner extends AbstractTestNGCucumberTests
{

}
