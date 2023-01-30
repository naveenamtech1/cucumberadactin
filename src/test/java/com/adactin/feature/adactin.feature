Feature: Hotel Booking In Adactin Application
@smokeTest
Scenario: User Login In The Web Application
Given user Launch The Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigates Search Hotel Page
@sanityTest
Scenario: User Searching A Hotel In Search Hotel Page Of Adactin Application
Given user Login In The Web Application
When user Select The Location From Location Dropdown
And user Select a Hotel From Hotel Dropdown
And user Select The Room Type From Room Type Dropdown
And user Select Number Of Rooms From Number Of Rooms Dropdown
And user Select a Hotel From Hotel Dropdown
And User Enter The Arrival Date In Check In Date Field
And user Enter The Departure Date In Check Out Date Field
And user Select Number Of Adults From Adults Per Room Dropdown
And user Select Number Of Adults From Adults Per Room Dropdown
And user Select Number Of Children From Children Per Room Dropdown
Then user Click The Search Button And It Navigates Select Hotel Page
@sanityTest
Scenario: User Selecting The Hotel Details In Select Hotel Page
Given user Click The Radio Button In Select Hotel Page
And user Click The Continue Button And It Navigates Book A Hotel Page
@regressionTest
Scenario: User Filling The Book A Hotel Page
Given user Fill The Details Asked In Book A Hotel Page
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card NUmber In Credit Card Number Field
And user Select The Credit Card Type In Credit Card Type Dropdown
And user Select The Expiry Date By Select The Month Name In Select Month Dropdown
And user Select The Year In Select Year Dropdown
And user Enter the CVV Number
Then user Click The Book Now Button And It Navigates Booking Confirmation Page
