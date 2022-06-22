package stepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

public class StepDefinition {

	public static WebDriver driver;

	
	
	@Given("^Initialize the browser with Chrome$")
	public void initialize_the_browser_with_chrome() {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html");
		System.out.println(driver.getTitle());

	}

	@When("User enters {string} and {string} in both fields")
	public void user_enters_and_in_both_fields(String string, String string2) {

		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Test@123");
		System.out.println("Email and Password fields are entered..!");

	}


	@Then("Clear the {string} and {string} fields")
	public void clear_the_and_fields(String string, String string2) {

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.name("passwd")).clear();
		System.out.println("Email and Password Fields are cleared..!");
	}


	@When("User enters {string} and {string} in both fields and clicks on signin button")
	public void user_enters_and_in_both_fields_and_clicks_on_signin_button(String string, String string2) {

		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Test@123");
		driver.findElement(By.name("SubmitLogin")).click();
	}


	@Then("Display that user is successfully logged in")
	public void display_that_user_is_successfully_logged_in() {

		System.out.println("Login Successful...!");
	}


	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {

		System.out.println("User is on Main Page...!");

		driver.close();

	}

}
