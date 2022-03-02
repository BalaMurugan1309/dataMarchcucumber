package com.Baseclass;

import org.openqa.selenium.WebDriver;

import com.Baseclass.pom.BookHotel_page;
import com.Baseclass.pom.Bookingconfirmation_page;
import com.Baseclass.pom.Login_page;
import com.Baseclass.pom.Select_Hotel_page;
import com.Baseclass.pom.search_page;

public class page_object_manager {
public static WebDriver driver;
	private Login_page h;
	 
	public page_object_manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public  Login_page getinstance_h() {        //login page
		h = new Login_page(driver);
		return h;
	}

	
	private search_page b;
	
	public search_page getinstance_b() {
		b = new search_page(driver);
		return b;
	}
	
	private Select_Hotel_page c;
	
	public  Select_Hotel_page getinstance_c() {
		 c = new Select_Hotel_page(driver);
		 return c;
	}
	
	private BookHotel_page m;
	
	public BookHotel_page getinstance_m() {
		m = new BookHotel_page(driver);
		return m;
	}
	
	
	private Bookingconfirmation_page j;
	
	 public Bookingconfirmation_page getinstance_j() {
		  j = new Bookingconfirmation_page(driver);
		  return j;
	}
	
	
	
	
	
}
