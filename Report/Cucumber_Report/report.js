$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user Will LogIn The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-will-login-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Will Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Will Enter The Username In The UserName Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Will Enter The Password In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Will Click On The Login Button And It Will Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Will_Launch_The_Application()"
});
formatter.result({
  "duration": 5642009001,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_Enter_The_Username_In_The_UserName_Field()"
});
formatter.result({
  "duration": 258350400,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_Enter_The_Password_In_The_Password_Field()"
});
formatter.result({
  "duration": 121700299,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_Click_On_The_Login_Button_And_It_Will_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1511185400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "user Will Enter InTo The Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-will-enter-into-the-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@whiteboxtest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user Will Select The Location In The Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Will Select The Hotels In The Hotels Field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Will Select The Room Type In The Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Will Select Number Of Rooms In The Select Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Will Enter The CheckIn Date In The CheckIn Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Will Enter The CheckOut Date In The CheckOut Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Will Select The Adults Per Room In The Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Will Select The Childrens Per Room In The Childrens Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Will ClickOn Search Button To Navigate To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Will_Select_The_Location_In_The_Location_Field()"
});
formatter.result({
  "duration": 186571800,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_Select_The_Hotels_In_The_Hotels_Field()"
});
formatter.result({
  "duration": 200601100,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_Select_The_Room_Type_In_The_Room_Type_Field()"
});
formatter.result({
  "duration": 183543100,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_Select_Number_Of_Rooms_In_The_Select_Number_Of_Rooms_Field()"
});
formatter.result({
  "duration": 204622700,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_Enter_The_CheckIn_Date_In_The_CheckIn_Date_Field()"
});
formatter.result({
  "duration": 107996499,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_Enter_The_CheckOut_Date_In_The_CheckOut_Date_Field()"
});
formatter.result({
  "duration": 106684200,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_Select_The_Adults_Per_Room_In_The_Adults_Per_Room_Field()"
});
formatter.result({
  "duration": 221715101,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_Select_The_Childrens_Per_Room_In_The_Childrens_Per_Room_Field()"
});
formatter.result({
  "duration": 159175901,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_ClickOn_Search_Button_To_Navigate_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 2105246800,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "user Will Enter InTo The Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-will-enter-into-the-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@blackboxtest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user Will ClickOn The CheckBox To Select The Respective Fields",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user Will ClickOn The Continue Button To Navigate To The Booking Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Will_ClickOn_The_CheckBox_To_Select_The_Respective_Fields()"
});
formatter.result({
  "duration": 113105800,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_ClickOn_The_Continue_Button_To_Navigate_To_The_Booking_Hotel_Page()"
});
formatter.result({
  "duration": 1473696600,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "user Will Enter InTo The Booking Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-will-enter-into-the-booking-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "user Will Use Implicit Wait To Refresh The Page",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "user Will ClickOn The MyIternary Button To Navigate To The MyIternary Page",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "user Will ClickOn The LogOut Button To Navigate To The LogOut Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Will_Use_Implicit_Wait_To_Refresh_The_Page()"
});
formatter.result({
  "duration": 24696900,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Will_ClickOn_The_MyIternary_Button_To_Navigate_To_The_MyIternary_Page()"
});
formatter.result({
  "duration": 15653436400,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using name\u003dmy_itinerary\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-E6I6CAP\u0027, ip: \u0027192.168.5.20\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_311\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.Baseclass.Baseclass.Clickonbutton(Baseclass.java:57)\r\n\tat com.adactin.stepdefinition.Step_definition.user_Will_ClickOn_The_MyIternary_Button_To_Navigate_To_The_MyIternary_Page(Step_definition.java:171)\r\n\tat ✽.Then user Will ClickOn The MyIternary Button To Navigate To The MyIternary Page(file.feature:42)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Step_definition.user_Will_ClickOn_The_LogOut_Button_To_Navigate_To_The_LogOut_Page()"
});
formatter.result({
  "status": "skipped"
});
});