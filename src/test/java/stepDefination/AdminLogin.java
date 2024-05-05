package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class AdminLogin {

	public static WebDriver driver;

	@Given("i open the broeser and url {string}")
	public void i_open_the_broeser_and_url(String url) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(url);
	}
	@Then("i should see login page")
	public void i_should_see_login_page() {

		if(driver.findElement(By.id("btnLogin")).isDisplayed()){

			System.out.println("System displayed Login page");
		}

	}
	@When("i enter user name as {string}")
	public void i_enter_user_name_as(String username) {

		driver.findElement(By.id("txtUsername")).sendKeys(username);

	}
	@When("i enter password as {string}")
	public void i_enter_password_as(String password) {

		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}
	@When("i click login")
	public void i_click_login() {

		driver.findElement(By.name("Submit")).click();

	}
	@Then("i should see admin module")
	public void i_should_see_admin_module() {

		if(driver.findElement(By.linkText("Admin")).isDisplayed());

		{
			System.out.println("System displayed Admin module");
		}

	}
	@When("i click logout")
	public void i_click_logout() {

		driver.findElement(By.partialLinkText("Welcome")).click();

		driver.findElement(By.linkText("Logout")).click();
	}
	@Then("i see login page")
	public void i_see_login_page() {

		if(driver.findElement(By.id("btnLogin")).isDisplayed()){

			System.out.println("System displayed Login page");
		}
	}
	@When("i close browser")
	public void i_close_browser() {
		
		driver.close();
	}
	
	@Then("i sould see error message")
	public void i_sould_see_error_message() {
	    
		String errmsg;
		errmsg = driver.findElement(By.id("spanMessage")).getText().toLowerCase();
		
		if(errmsg.contains("Invalid") || errmsg.contains("empty")) {
			
			System.out.println("System displayed the expected error message");
		}
	}
}
