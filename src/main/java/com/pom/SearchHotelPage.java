package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	
	public static WebDriver driver; 
	@FindBy(id="location")
	public WebElement location;

	@FindBy(id="hotels")
	public WebElement htl;
	
	@FindBy(id="room_type")
	public WebElement roomtype;
	
	@FindBy(id="room_nos")
	public WebElement roomnos;
	
	@FindBy(id="datepick_in")
	public WebElement dp;
	
	@FindBy(id="datepick_out")
	public WebElement dp2;
	
	@FindBy(id="adult_room")
	public WebElement adc;
	
	@FindBy(id="child_room")
	public WebElement child; 
	
	@FindBy(id="Submit")
	public WebElement sub;

	

	public SearchHotelPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHtl() {
		return htl;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDp() {
		return dp;
	}

	public WebElement getDp2() {
		return dp2;
	}

	public WebElement getAdc() {
		return adc;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSub() {
		return sub;
	}
}
