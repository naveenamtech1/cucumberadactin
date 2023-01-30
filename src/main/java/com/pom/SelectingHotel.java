package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectingHotel {
	public static WebDriver driver;
	@FindBy(id = "radiobutton_0")
	private WebElement select;
	@FindBy(id = "continue")
	private WebElement ct;
	
	public SelectingHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getCt() {
		return ct;
	}


}
