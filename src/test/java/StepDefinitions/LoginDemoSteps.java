package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	
	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.edge.driver", "C:/Users/mateu/EclipseForDevelopers/Cucumberjava/src/test/resources/Drivers/msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
		
		driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	}

	@When("^users enter (.*) and (.*)$")
	public void users_enter_username_and_password(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	@And("users click in submit")
	public void users_click_in_submit() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.findElement(By.className("post-title")).isDisplayed();
		driver.close();
		driver.quit();
	}
	@When("users enter username and password invalids")
	public void users_enter_username_and_password_invalids() {
		driver.findElement(By.id("username")).sendKeys("studentsss");
		driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@Then("user view error message text is Your username is invalid!")
	public void user_view_error_message_text_is_your_username_is_invalid() {
		driver.findElement(By.id("error")).isDisplayed();
		driver.close();
		driver.quit();
	}



}
