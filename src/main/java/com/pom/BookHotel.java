package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BookHotel {
	public static WebDriver driver; 
	@FindBy(id="first_name")
	private WebElement fn;
	@FindBy(id="last_name")
	private WebElement ft;
	@FindBy(id="address")
	private WebElement adr;
	@FindBy(id="cc_num")
	private WebElement cct;
	@FindBy(id="cc_type")
	private WebElement ct;
	@FindBy(id="cc_exp_month")
	private WebElement ct3;
	@FindBy(id="cc_exp_year")
	private WebElement ct4;
	@FindBy(id="cc_cvv")
	private WebElement ct5;
	@FindBy(id="book_now")
	private WebElement c6;
	
	public BookHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	
	public WebElement getFn() {
		return fn;
	}
	public WebElement getFt() {
		return ft;
	}
	public WebElement getAdr() {
		return adr;
	}
	public WebElement getCct() {
		return cct;
	}
	public WebElement getCt() {
		return ct;
	}
	public WebElement getCt3() {
		return ct3;
	}
	public WebElement getCt4() {
		return ct4;
	}
	public WebElement getCt5() {
		return ct5;
	}
	public WebElement getC6() {
		return c6;
	}
	
	
	
	}
	