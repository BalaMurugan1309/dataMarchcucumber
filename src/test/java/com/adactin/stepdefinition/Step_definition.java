package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Baseclass.Baseclass;
import com.Baseclass.page_object_manager;
import com.adactin.runner.Runner_Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_definition extends Baseclass {
	public static WebDriver driver=Runner_Test.driver;
	public static page_object_manager pom = new page_object_manager(driver);
	

	@Given("^user Will Launch The Application$")
	public void user_Will_Launch_The_Application() throws Throwable {
		
		getUrl("https://adactinhotelapp.com/");
	}

	@When("^user Will Enter The Username In The UserName Field$")
	public void user_Will_Enter_The_Username_In_The_UserName_Field() throws Throwable {
		
		Inputforvalue(pom.getinstance_h().getUser(),"Johnsonbaby1");
	}

	@When("^user Will Enter The Password In The Password Field$")
	public void user_Will_Enter_The_Password_In_The_Password_Field() throws Throwable {
		
		Inputforvalue(pom.getinstance_h().getPassword(),"123456");
	}

	@Then("^user Will Click On The Login Button And It Will Navigate To The Search Hotel Page$")
	public void user_Will_Click_On_The_Login_Button_And_It_Will_Navigate_To_The_Search_Hotel_Page() throws Throwable {
		
		Clickonbutton(pom.getinstance_h().getLogin());
	}

	@When("^user Will Select The Location In The Location Field$")
	public void user_Will_Select_The_Location_In_The_Location_Field() throws Throwable {
		
		dropdown(pom.getinstance_b().getLocation(), "by value","Sydney");
	}

	@When("^user Will Select The Hotels In The Hotels Field$")
	public void user_Will_Select_The_Hotels_In_The_Hotels_Field() throws Throwable {
	
		dropdown(pom.getinstance_b().getHotelname(),"by value","Hotel Sunshine");
	}

	@When("^user Will Select The Room Type In The Room Type Field$")
	public void user_Will_Select_The_Room_Type_In_The_Room_Type_Field() throws Throwable {
		
		dropdown(pom.getinstance_b().getRoomtype(),"by value","Double");
	}

	@When("^user Will Select Number Of Rooms In The Select Number Of Rooms Field$")
	public void user_Will_Select_Number_Of_Rooms_In_The_Select_Number_Of_Rooms_Field() throws Throwable {
	
		dropdown(pom.getinstance_b().getRoomno(),"by index", "2");
	}

	@When("^user Will Enter The CheckIn Date In The CheckIn Date Field$")
	public void user_Will_Enter_The_CheckIn_Date_In_The_CheckIn_Date_Field() throws Throwable {
	
		Inputforvalue(pom.getinstance_b().getCheckindate(),"13/02/1997");
	}

	@When("^user Will Enter The CheckOut Date In The CheckOut Date Field$")
	public void user_Will_Enter_The_CheckOut_Date_In_The_CheckOut_Date_Field() throws Throwable {
	
		Inputforvalue(pom.getinstance_b().getCheckoutdate(),"15/02/1997");
	}

	@When("^user Will Select The Adults Per Room In The Adults Per Room Field$")
	public void user_Will_Select_The_Adults_Per_Room_In_The_Adults_Per_Room_Field() throws Throwable {
	
		dropdown(pom.getinstance_b().getAdultsperroom(),"by index","2");
	}

	@When("^user Will Select The Childrens Per Room In The Childrens Per Room Field$")
	public void user_Will_Select_The_Childrens_Per_Room_In_The_Childrens_Per_Room_Field() throws Throwable {
	
		dropdown(pom.getinstance_b().getChildperroom(),"by value","3");
	}

	@Then("^user Will ClickOn Search Button To Navigate To The Select Hotel Page$")
	public void user_Will_ClickOn_Search_Button_To_Navigate_To_The_Select_Hotel_Page() throws Throwable {
	
		Clickonbutton(pom.getinstance_b().getSearch());
	}

	@Then("^user Will ClickOn The CheckBox To Select The Respective Fields$")
	public void user_Will_ClickOn_The_CheckBox_To_Select_The_Respective_Fields() throws Throwable {
	
		Clickonbutton(pom.getinstance_c().getClick_radiobutton());
	}

	@Then("^user Will ClickOn The Continue Button To Navigate To The Booking Hotel Page$")
	public void user_Will_ClickOn_The_Continue_Button_To_Navigate_To_The_Booking_Hotel_Page() throws Throwable {
	
		Clickonbutton(pom.getinstance_c().getClick_continuebutton());
	}

	@When("^user Will Enter The First Name In The First Name Field$")
	public void user_Will_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
	
		Inputforvalue(pom.getinstance_m().getFirstname(),"Bala");
	}

	@When("^user Will Enter The Last Name In The Last Name Field$")
	public void user_Will_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
	
		Inputforvalue(pom.getinstance_m().getLastname(),"Murugan");
	}

	@When("^user Will Enter The Billing Address In The Billing Address Field$")
	public void user_Will_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
	
		Inputforvalue(pom.getinstance_m().getAddress(),"1/196,iyyapanthangal,porur");
	}

	@When("^user Will Enter The Credit Card Number In The Credit Card Number Field$")
	public void user_Will_Enter_The_Credit_Card_Number_In_The_Credit_Card_Number_Field() throws Throwable {
	
		Inputforvalue(pom.getinstance_m().getCreditcnumber(),"1454345764314568");
	}

	@When("^user Will Select The Credit Card Type In The Credit Card Type Field$")
	public void user_Will_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field() throws Throwable {
	
		dropdown(pom.getinstance_m().getCctype(),"by index","2");
	}

	@When("^user Will Select The Expiry Month In The Expiry Month Field$")
	public void user_Will_Select_The_Expiry_Month_In_The_Expiry_Month_Field() throws Throwable {
	
		dropdown(pom.getinstance_m().getCc_expmonth(),"by index","2");
	}

	@When("^user Will Select The Expiry Year In The Expiry Year Field$")
	public void user_Will_Select_The_Expiry_Year_In_The_Expiry_Year_Field() throws Throwable {
	
		dropdown(pom.getinstance_m().getCc_expyear(),"by value","2022");
	}

	@When("^user Will Enter The CCV Number In The CCV Number Field$")
	public void user_Will_Enter_The_CCV_Number_In_The_CCV_Number_Field() throws Throwable {
	
		Inputforvalue(pom.getinstance_m().getCc_number(),"123");
	}

	@Then("^user Will ClickOn The Book Now Button And Navigate To Booking Confirmation Page$")
	public void user_Will_ClickOn_The_Book_Now_Button_And_Navigate_To_Booking_Confirmation_Page() throws Throwable {
	
		Clickonbutton(pom.getinstance_m().getBooknow_button());
	}
	
	@When("^user Will Use Implicit Wait To Refresh The Page$")
	public void user_Will_Use_Implicit_Wait_To_Refresh_The_Page() throws Throwable {

		implicitwait(2000);
	}

	@Then("^user Will ClickOn The MyIternary Button To Navigate To The MyIternary Page$")
	public void user_Will_ClickOn_The_MyIternary_Button_To_Navigate_To_The_MyIternary_Page() throws Throwable {
		
		Clickonbutton(pom.getinstance_j().getClickiternary());
	}
	
	
	@Then("^user Will ClickOn The LogOut Button To Navigate To The LogOut Page$")
	public void user_Will_ClickOn_The_LogOut_Button_To_Navigate_To_The_LogOut_Page() throws Throwable {
	
		Clickonbutton(pom.getinstance_j().getClicklogout());
	}


}
