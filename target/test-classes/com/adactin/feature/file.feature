Feature: Hotel Booking In Adactin Application

@SmokeTest
Scenario: user Will LogIn The Web Application
Given user Will Launch The Application
When user Will Enter The Username In The UserName Field
And user Will Enter The Password In The Password Field
Then user Will Click On The Login Button And It Will Navigate To The Search Hotel Page 

@whiteboxtest
Scenario: user Will Enter InTo The Search Hotel Page
When user Will Select The Location In The Location Field
And user Will Select The Hotels In The Hotels Field
And user Will Select The Room Type In The Room Type Field 
And user Will Select Number Of Rooms In The Select Number Of Rooms Field
And user Will Enter The CheckIn Date In The CheckIn Date Field
And user Will Enter The CheckOut Date In The CheckOut Date Field
And user Will Select The Adults Per Room In The Adults Per Room Field 
And user Will Select The Childrens Per Room In The Childrens Per Room Field
Then user Will ClickOn Search Button To Navigate To The Select Hotel Page

@blackboxtest
Scenario: user Will Enter InTo The Select Hotel Page
Then user Will ClickOn The CheckBox To Select The Respective Fields
Then user Will ClickOn The Continue Button To Navigate To The Booking Hotel Page

@SanityTest
Scenario: user Will Enter InTo The Booking Hotel Page
When user Will Enter The First Name In The First Name Field
And user Will Enter The Last Name In The Last Name Field
And user Will Enter The Billing Address In The Billing Address Field
And user Will Enter The Credit Card Number In The Credit Card Number Field
And user Will Select The Credit Card Type In The Credit Card Type Field
And user Will Select The Expiry Month In The Expiry Month Field
And user Will Select The Expiry Year In The Expiry Year Field
And user Will Enter The CCV Number In The CCV Number Field
Then user Will ClickOn The Book Now Button And Navigate To Booking Confirmation Page

@RegressionTest
Scenario: user Will Enter InTo The Booking Page
When user Will Use Implicit Wait To Refresh The Page
Then user Will ClickOn The MyIternary Button To Navigate To The MyIternary Page    
Then user Will ClickOn The LogOut Button To Navigate To The LogOut Page    