package com.Baseclass.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_page {
public WebDriver driver;	
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement creditcardnumber;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(name="cc_exp_month")
	private WebElement cc_expmonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement cc_expyear;
	
	@FindBy(name="cc_cvv")
	private WebElement cc_number;
	
	@FindBy(name="book_now")
	private WebElement booknow_button;

	
	
	public BookHotel_page(WebDriver bcs) {
		this.driver = bcs;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcnumber() {
		return creditcardnumber;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCc_expmonth() {
		return cc_expmonth;
	}

	public WebElement getCc_expyear() {
		return cc_expyear;
	}

	public WebElement getCc_number() {
		return cc_number;
	}

	public WebElement getBooknow_button() {
		return booknow_button;
	}

}
