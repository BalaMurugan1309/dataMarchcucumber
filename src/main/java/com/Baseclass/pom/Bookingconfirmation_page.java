package com.Baseclass.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfirmation_page {
public WebDriver driver;	
	@FindBy(name="my_itinerary")
	private WebElement clickiternary;
	
	
	@FindBy(name="logout")
	private WebElement clicklogout;

	public Bookingconfirmation_page(WebDriver kjl) {
		this.driver = kjl;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public WebElement getClickiternary() {
		return clickiternary;
	}

	public WebElement getClicklogout() {
		return clicklogout;
	}

}
