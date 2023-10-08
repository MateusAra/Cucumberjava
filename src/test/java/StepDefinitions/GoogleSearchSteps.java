package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("brower is open")
	public void brower_is_open() {
		System.setProperty("webdriver.edge.driver", "C:/Users/mateu/EclipseForDevelopers/Cucumberjava/src/test/resources/Drivers/msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
		
		driver.manage().window().maximize();
	}

	@And("user is on search page")
	public void user_is_on_search_page() {
		driver.navigate().to("https://www.google.com");	
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		
		driver.findElement(By.name("q")).sendKeys("Facebook");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		driver.getPageSource().contains("Entrar");
		
		driver.close();
		driver.quit();
	}
}
