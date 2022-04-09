package stepDefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = BaseClass.driver;
	
	@Given("I have opened the application in browser")
	public void i_have_opened_the_application_in_browser() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		
		driver.get("https://www.simplilearn.com");
		
		// Maximize window
		driver.manage().window().maximize();

		// wait for browser to load - implicit
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@When("I click on the Login link")
	public void i_click_on_the_login_link() {
		// Write code here that turns the phrase above into concrete actions

		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	}

	@When("I enter username")
	public void i_enter_username() {
		// Write code here that turns the phrase above into concrete actions

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("email@email.com");
	}

	@When("I enter password")
	public void i_enter_password() {
		// Write code here that turns the phrase above into concrete actions

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Abc@12345");
	}

	@When("I click on the Login Button")
	public void i_click_on_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}

	@Then("I should be landed on the Login page")
	public void i_should_be_landed_on_the_login_page() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("Inside Home Page");
	}

	@When("I enter username {string}")
	public void i_enter_username(String UserNameVal) {
		// Write code here that turns the phrase above into concrete actions
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserNameVal);
	}

	@When("I enter password {string}")
	public void i_enter_password(String PasswordVal) {
		// Write code here that turns the phrase above into concrete actions

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PasswordVal);
	}
	
	@Then("I should be get the error message {string}")
	public void i_should_be_get_the_error_message(String ExpMsg) {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
		
		String ActualMsg = ErrorMsg.getText();
		
		Assert.assertEquals(ExpMsg, ActualMsg);
	}
}
