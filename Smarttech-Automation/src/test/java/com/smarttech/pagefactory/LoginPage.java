package com.smarttech.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "username")
	private WebElement userName;
	
	@FindBy(how = How.NAME, using = "password")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Login')])[4]")
	private WebElement loginBtn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Hi, Demo User')]")
	private WebElement demoUser;
	
	@FindBy(how = How.XPATH, using = "(//*[@id='dropdownCurrency'])[2]")
	private WebElement dropDown;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Logout')]")
	private WebElement logoutBtn;
	
	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

	public WebElement getDemoUser() {
		return demoUser;
	}

	public void setDemoUser(WebElement demoUser) {
		this.demoUser = demoUser;
	}

	public WebElement getDropDown() {
		return dropDown;
	}

	public void setDropDown(WebElement dropDown) {
		this.dropDown = dropDown;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public void setLogoutBtn(WebElement logoutBtn) {
		this.logoutBtn = logoutBtn;
	}
	
	
	
	

}
