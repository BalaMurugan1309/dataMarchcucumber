package com.Baseclass.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement user;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement login;
	
	//abc is a runner class driver
	public Login_page(WebDriver abc) {
		
		this.driver = abc;
		PageFactory.initElements(driver,this );
		
	}
	
	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
