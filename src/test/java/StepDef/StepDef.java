package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	
	
	@Given("^Launch url$")
	public void launch_url() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" ); 
	driver=new ChromeDriver();
	driver.get("https://www.dell.com/en-us");
	driver.manage().window().maximize();
	
	}

	@Then("^Enter user name$")
	public void enter_user_name() throws Throwable {
	    
	}

	@Then("^Enter user password$")
	public void enter_user_password() throws Throwable {
	   
	}

	@When("^Click log in button$")
	public void click_log_in_button() throws Throwable {
	    
	}

	@Then("^Verify user can log in$")
	public void verify_user_can_log_in() throws Throwable {
	   
	}



}
