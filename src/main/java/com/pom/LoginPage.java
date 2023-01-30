package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class LoginPage {
	
	public static WebDriver driver;
		
@FindBy(id = "username")
private WebElement username;

@FindBy(id = "password")
private WebElement pwd;

@FindBy(id = "login")
private WebElement log;

public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public WebElement getUsername() {
	return username;
}

public WebElement getPwd() {
	return pwd;
}

public WebElement getLog() {
	return log;
}

}
