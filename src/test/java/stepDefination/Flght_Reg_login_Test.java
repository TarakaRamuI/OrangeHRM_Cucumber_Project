package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class Flght_Reg_login_Test 
{
	public static WebDriver driver;

	@Given("I open the browser with url {string}")
	public void i_open_the_browser_with_url(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(url);
	}

	@Then("I should see registration page")
	public void i_should_see_registration_page() {

		if(driver.findElement(By.name("submit")).isDisplayed()) {

			System.out.println("system displying the registration page");
		}
	}

	@When("I enter the data")
	public void i_enter_the_data(List<String> dataTable) {

		driver.findElement(By.id("name")).sendKeys(dataTable.get(0));
		driver.findElement(By.id("contact")).sendKeys(dataTable.get(1));
		driver.findElement(By.id("email")).sendKeys(dataTable.get(2));
		driver.findElement(By.id("address")).sendKeys(dataTable.get(3));
		driver.findElement(By.id("popupDatepicker")).sendKeys(dataTable.get(4));
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByVisibleText("Male");
		
		driver.findElement(By.id("flexCheckChecked")).click();

		
	}
	@When("I click the Register button")
	public void i_click_the_register_button() {

		driver.findElement(By.name("submit")).click();
	}

	@Then("I sould see login page")
	public void i_sould_see_login_page1() {

		if(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed()) {

			System.out.println("System displayes the login page");
		}

	}

	@When("I close browser")
	public void i_close_browser() {

		driver.close();
	}

	@Given("I open the browser url {string}")
	public void i_open_the_browser_url(String url) {

		driver.get(url);

	}

	@Then("I sould see Login page")
	public void i_sould_see_login_page() {

		if(driver.findElement(By.linkText("Sign In")).isDisplayed()) {

			System.out.println("System displayes the login page");
		}

	}

	@When("I login into the appliction with {string} and {string}")
	public void i_login_into_the_appliction_with_and(String Username, String Password) {

		driver.findElement(By.name("email")).sendKeys(Username);

		driver.findElement(By.name("password")).sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}


	@Then("I should see home page")
	public void i_should_see_home_page() {

		System.out.println("This is the Home page");
	}

	@When("I click logout button")
	public void i_click_logout_button() {

		driver.findElement(By.xpath("//a[@class='dropdown-toggle after_login']")).click();

		driver.findElement(By.linkText("Logout")).click();


	}


}
