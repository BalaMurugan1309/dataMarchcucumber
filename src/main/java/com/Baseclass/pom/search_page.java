package com.Baseclass.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class search_page {
public WebDriver driver;
	
	@FindBy(name="location")
	private WebElement location;
	


	@FindBy(name="hotels")
	private WebElement Hotelname;
	
	@FindBy(name="room_type")
	private WebElement Roomtype;

	@FindBy(name="room_nos")
	private WebElement roomno;
	
	@FindBy(name="datepick_in")
	private WebElement checkindate;
	
	@FindBy(name="datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(name="adult_room")
	private WebElement Adultsperroom;
	
	@FindBy(name="child_room")
	private WebElement childperroom;
	
	@FindBy(id="Submit")
	private WebElement search;

	
	public search_page(WebDriver bcd) {
		
		this.driver = bcd;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotelname() {
		return Hotelname;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}
	
	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultsperroom() {
		return Adultsperroom;
	}

	public WebElement getChildperroom() {
		return childperroom;
	}

	public WebElement getSearch() {
		return search;
	}
}
