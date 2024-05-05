package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//We can run these TestCases using either Junit or TestNG

//@RunWith(Cucumber.class)  // used to run Testcase with Junit
@CucumberOptions(features= "Feature_files/AdminLogin.feature",
glue="stepDefination",
dryRun = false,
plugin = {"pretty","html:TestReports/Admin_Login_FunctionalityWithInvalidInputs.html"})

public class AdminLoginTestRunner extends AbstractTestNGCucumberTests
{

}
