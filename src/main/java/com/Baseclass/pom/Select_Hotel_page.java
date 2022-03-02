package com.Baseclass.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Select_Hotel_page {
public WebDriver driver;
	
@FindBy(id="radiobutton_0")
 private WebElement click_radiobutton;
 
 
@FindBy(id="continue")
 private WebElement click_continuebutton;



public Select_Hotel_page(WebDriver bde) {
	this.driver = bde;
	PageFactory.initElements(driver, this);
}


public WebElement getClick_radiobutton() {
	return click_radiobutton;
}

public WebElement getClick_continuebutton() {
	return click_continuebutton;
}

}
