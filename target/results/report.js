$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/adactin/feature/adactin.feature");
formatter.feature({
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User Login In The Web Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Username In Username Field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Username_In_Username_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click The Login Button And It Navigates Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_Search_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Searching A Hotel In Search Hotel Page Of Adactin Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "name": "user Login In The Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Login_In_The_Web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Location From Location Dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Location_From_Location_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select a Hotel From Hotel Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Select_a_Hotel_From_Hotel_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Room Type From Room Type Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Room_Type_From_Room_Type_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select Number Of Rooms From Number Of Rooms Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Select_Number_Of_Rooms_From_Number_Of_Rooms_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select a Hotel From Hotel Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Select_a_Hotel_From_Hotel_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter The Arrival Date In Check In Date Field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Arrival_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Departure Date In Check Out Date Field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Departure_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select Number Of Adults From Adults Per Room Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Select_Number_Of_Adults_From_Adults_Per_Room_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select Number Of Adults From Adults Per Room Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Select_Number_Of_Adults_From_Adults_Per_Room_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select Number Of Children From Children Per Room Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Select_Number_Of_Children_From_Children_Per_Room_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click The Search Button And It Navigates Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Search_Button_And_It_Navigates_Select_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Selecting The Hotel Details In Select Hotel Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "name": "user Click The Radio Button In Select Hotel Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Radio_Button_In_Select_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click The Continue Button And It Navigates Book A Hotel Page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Continue_Button_And_It_Navigates_Book_A_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Filling The Book A Hotel Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "name": "user Fill The Details Asked In Book A Hotel Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Fill_The_Details_Asked_In_Book_A_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The First Name In First Name Field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Last Name In Last Name Field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Credit Card NUmber In Credit Card Number Field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Credit_Card_NUmber_In_Credit_Card_Number_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Credit Card Type In Credit Card Type Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Expiry Date By Select The Month Name In Select Month Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Expiry_Date_By_Select_The_Month_Name_In_Select_Month_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Year In Select Year Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Year_In_Select_Year_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter the CVV Number",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Enter_the_CVV_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click The Book Now Button And It Navigates Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Book_Now_Button_And_It_Navigates_Booking_Confirmation_Page()"
});
formatter.result({
  "status": "passed"
});
});