package com.smarttech.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.smarttech.pagefactory.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef {
	static WebDriver driver;
	static LoginPage pf;
	static WebDriverWait wait;

	@Given("^user go to login page$")
	public void user_go_to_login_page() throws Throwable {
		// Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// instantiate a Chrome session
		driver = new ChromeDriver();
		// Open browser and go to home page
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		pf = PageFactory.initElements(driver, LoginPage.class);
		wait = new WebDriverWait(driver,30);
		
	}

	@Given("^user print the page title$")
	public void user_print_the_page_title() throws Throwable {
		System.out.println(driver.getTitle());
	}

	@When("^user enters a valid user name$")
	public void user_enters_a_valid_user_name() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(pf.getUserName()));
		pf.getUserName().sendKeys("user@phptravels.com");
	}

	@When("^user enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(pf.getPassword()));
		pf.getPassword().sendKeys("demouser");
	}

	@Then("^user click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(pf.getLoginBtn()));
		pf.getLoginBtn().click();
	}
	
	@Then("^verify demo user page appear$")
	public void verify_demo_user_page_appear() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(pf.getDemoUser()));
	}

	@When("^user click on log out button$")
	public void user_click_on_log_out_button() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(pf.getDropDown()));
		pf.getDropDown().click();
		wait.until(ExpectedConditions.elementToBeClickable(pf.getLogoutBtn()));
		pf.getLogoutBtn().click();
	}

	@When("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		driver.close();
	}

}
