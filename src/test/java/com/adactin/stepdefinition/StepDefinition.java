package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	public static WebDriver driver = RunnerClass.driver;

	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("naveenamtech1");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Veenasingle@123");
	}

	@Then("^user Click The Login Button And It Navigates Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_Search_Hotel_Page() throws Throwable {
		WebElement log = driver.findElement(By.id("login"));
		log.click();

	}

	@Given("user Login In The Web Application")
	public void user_Login_In_The_Web_Application() {
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
	}

	@When("user Select The Location From Location Dropdown")
	public void user_Select_The_Location_From_Location_Dropdown() {
		WebElement location = driver.findElement(By.id("location"));
		Select s1 = new Select(location);
		s1.selectByVisibleText("New York");
	}

	@When("user Select a Hotel From Hotel Dropdown")
	public void user_Select_a_Hotel_From_Hotel_Dropdown() {
		WebElement htl = driver.findElement(By.id("hotels"));
		Select s2 = new Select(htl);
		s2.selectByVisibleText("Hotel Cornice");
	}

	@When("user Select The Room Type From Room Type Dropdown")
	public void user_Select_The_Room_Type_From_Room_Type_Dropdown() {
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s3 = new Select(roomtype);
		s3.selectByValue("Double");
	}

	@When("user Select Number Of Rooms From Number Of Rooms Dropdown")
	public void user_Select_Number_Of_Rooms_From_Number_Of_Rooms_Dropdown() {
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(roomnos);
		s4.selectByIndex(2);
	}

	@When("User Enter The Arrival Date In Check In Date Field")
	public void user_Enter_The_Arrival_Date_In_Check_In_Date_Field() {
		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.sendKeys("9/01/2023");

	}

	@When("user Enter The Departure Date In Check Out Date Field")
	public void user_Enter_The_Departure_Date_In_Check_Out_Date_Field() {
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.sendKeys("11/01/2023");
	}

	@When("user Select Number Of Adults From Adults Per Room Dropdown")
	public void user_Select_Number_Of_Adults_From_Adults_Per_Room_Dropdown() {
		WebElement adc = driver.findElement(By.id("adult_room"));
		Select s7 = new Select(adc);
		s7.selectByValue("2");
	}

	@When("user Select Number Of Children From Children Per Room Dropdown")
	public void user_Select_Number_Of_Children_From_Children_Per_Room_Dropdown() {
		WebElement child = driver.findElement(By.id("child_room"));
		Select s8 = new Select(child);
		s8.selectByValue("1");
	}

	@Then("user Click The Search Button And It Navigates Select Hotel Page")
	public void user_Click_The_Search_Button_And_It_Navigates_Select_Hotel_Page() {
		WebElement sub = driver.findElement(By.id("Submit"));
		sub.click();
	}

	@Given("user Click The Radio Button In Select Hotel Page")
	public void user_Click_The_Radio_Button_In_Select_Hotel_Page() {
		WebElement select = driver.findElement(By.id("radiobutton_0"));
		select.click();
	}

	@Given("user Click The Continue Button And It Navigates Book A Hotel Page")
	public void user_Click_The_Continue_Button_And_It_Navigates_Book_A_Hotel_Page() {
		WebElement ce = driver.findElement(By.id("continue"));
		ce.click();
	}

	@Given("user Fill The Details Asked In Book A Hotel Page")
	public void user_Fill_The_Details_Asked_In_Book_A_Hotel_Page() {
		driver.get("https://adactinhotelapp.com/BookHotel.php");
	}

	@When("user Enter The First Name In First Name Field")
	public void user_Enter_The_First_Name_In_First_Name_Field() {
		WebElement fn = driver.findElement(By.id("first_name"));
		fn.sendKeys("naveena");
	}

	@When("user Enter The Last Name In Last Name Field")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() {
		WebElement ft = driver.findElement(By.id("last_name"));
		ft.sendKeys("mathiv");
	}

	@When("user Enter The Billing Address In Billing Address Field")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() {
		WebElement ad = driver.findElement(By.id("address"));
		ad.sendKeys("4/30A,mayiladuthurai");
	}

	@When("user Enter The Credit Card NUmber In Credit Card Number Field")
	public void user_Enter_The_Credit_Card_NUmber_In_Credit_Card_Number_Field() {
		WebElement cd = driver.findElement(By.id("cc_num"));
		cd.sendKeys("4329 3879 3787 3678");
	}

	@When("user Select The Credit Card Type In Credit Card Type Dropdown")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Dropdown() {
		WebElement cc = driver.findElement(By.id("cc_type"));
		Select s9 = new Select(cc);
		s9.selectByValue("VISA");
	}

	@When("user Select The Expiry Date By Select The Month Name In Select Month Dropdown")
	public void user_Select_The_Expiry_Date_By_Select_The_Month_Name_In_Select_Month_Dropdown() {
		WebElement cm = driver.findElement(By.id("cc_exp_month"));
		Select s11 = new Select(cm);
		s11.selectByValue("6");
	}

	@When("user Select The Year In Select Year Dropdown")
	public void user_Select_The_Year_In_Select_Year_Dropdown() {
		WebElement yr = driver.findElement(By.id("cc_exp_year"));
		Select s12 = new Select(yr);
		s12.selectByValue("2022");
	}

	@When("user Enter the CVV Number")
	public void user_Enter_the_CVV_Number() {
		WebElement cv = driver.findElement(By.id("cc_cvv"));
		cv.sendKeys("351");
	}

	@Then("user Click The Book Now Button And It Navigates Booking Confirmation Page")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_Booking_Confirmation_Page() {
		WebElement yn = driver.findElement(By.id("book_now"));
		yn.click();
		
		System.out.println("Four Scenarios completed");
	}

}
