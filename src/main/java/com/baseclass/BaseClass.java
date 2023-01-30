F package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
//1.Browser Launch
	public static WebDriver browserLaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else if (type.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	//34.geturl
	
	public static WebDriver getUrl(String url) {
		driver.get(url);
		return driver;
		
	}
	//2.Close
	public static WebDriver close() {
		driver.close();
		return driver;
	}
	//3.Quit
	public static WebDriver quit() {
		driver.quit();
		return driver;
	}
	//4.NavigateTo
	public static WebDriver navigateTo(String url) {
		driver.navigate().to(url);
		return driver;
				}
	//5.NavigateBack
	public static WebDriver navigateBack() {
		driver.navigate().back();
		return driver;
	}
	//6.NavigateForward
	public static WebDriver navigateForward() {
		driver.navigate().forward();
		return driver;
	}
	//7.NavigateRefresh
	public static WebDriver navigateRefresh() {
		driver.navigate().refresh();
		return driver;
	}
	//8.Get
	public static WebDriver get() {
		driver.get(null);;
		return driver;
	}
	//9.Alert Accept
	public static void alertAccept() {
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	//9.1 Alert Dismiss
		public static void alertDismiss() {
			Alert a=driver.switchTo().alert();
			a.dismiss();
		}
	//9.2 Alert Dialog Box
		public static void alertBoxSendKeys(String input) {
			Alert a=driver.switchTo().alert();
			a.sendKeys(input);
				}
	//9.3 Alert Text
		public static void getAlertText() {
			Alert a=driver.switchTo().alert();
			System.out.println(a.getText());
				}
	//10.Action
	public static Actions actionsac() {
		Actions ac= (Actions)driver;
		return ac;
	}
	//10.1 Action click
	public static void actionsClick( WebElement element) {
		actionsac().click(element).perform();
		
	}
	//10.2 Action context click
	public static void contextClick( WebElement element) {
	    actionsac().contextClick(element).perform();
			
    }
	//10.3 Action double click
	public static void doubleClick( WebElement element) {
		 actionsac().doubleClick(element).perform();
	}
	//10.4 Action Move to Element
		public static void moveToElement( WebElement element) {
			 actionsac().moveToElement(element).perform();
	}
	//10.5 Action Drag and Drop
		public static void dragAndDrop( WebElement element,WebElement element1) {
			 actionsac().dragAndDrop(element,element1).build().perform();
	}
	
	//11.Frame by Id
	public static void frameid(String id) {
		driver.switchTo().frame(id);
	}
	//11.1 Frame by Index
		public static void frameIndex(int index) {
		driver.switchTo().frame(index);
	}
	//11.2 Frame by Web Element
		public static void frameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	//11.3 Frame Exit
		public static void frameexit() {
		driver.switchTo().defaultContent();
	}
	//11.4  Outer Frame
		public static void outerFrame() {
		driver.switchTo().parentFrame();
	}
	//12.Robot
	public static Robot robott()throws AWTException {
		Robot rt= new Robot();
		return rt;
	}
	//Up Key
	public static Robot upKey()throws AWTException {
		robott().keyPress(KeyEvent.VK_KP_UP);
		robott().keyRelease(KeyEvent.VK_KP_UP);
	}
	//Down Key	
	public static Robot downKey()throws AWTException {
	robott().keyPress(KeyEvent.VK_DOWN);
	robott().keyRelease(KeyEvent.VK_DOWN);
	}
	
	
	//13.WindowHandle
	public static void getwindowHandle() {
		String handle=driver.getWindowHandle();
		System.out.println(handle);
	}
	//14.DropDown
	public static void dropDown(WebElement element, String type, String value, int i) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("index")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		} else if (type.equalsIgnoreCase("visibleText")) {
			s.selectByVisibleText(value);
		}
	}
//15.CheckBox..
	public static void check_Box(WebElement element) {
		element.click();
	}
	//16.IsEnabled
	public static void isEnabled(WebElement element) {
		System.out.println(element.isEnabled());
	}

	//17.IsDisplayed
	public static void isDisplayed(WebElement element) {
		System.out.println(element.isDisplayed());
	}
	//18.IsSelected
	public static void isSelected(WebElement element) {
		System.out.println(element.isSelected());
	}
	//19.GetOptions.....
	public static void getOptions(WebElement element) {
		Select s1 = new Select(element);
		List<WebElement> alloption = s1.getOptions();
		for (WebElement opt : alloption) {
			System.out.println(opt.getText());
	}
	}
	//20.GetTitle
	public static void getTitle() {
		driver.getTitle();
		
		}
	//21.GetCurrentUrl
	public static WebDriver getCurrentUrl( String url) {
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		}
	//22.GetText
	public static WebDriver getText( WebElement element) {
		String text=element.getText();
		System.out.println(text);
		}
	//23.GetAttribute..
	public static WebDriver getAttribute(String value) { 
		driver.get(value);
		System.out.println(value);
		}
	//24.Wait
	public static void wait(int timeOutInSeconds) {
		driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS);
	}
		
	//25.Takes Screenshot
	public static void screenshot(String location)throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File ds=new File("location");
				FileUtils.copyFile(src, ds);	
		}
	//26.ScrollUp and Down
	public static void scrollUpAndDown(String value,WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript(value, element);
		
	}
	//27.Send keys
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	//28.Get First Selected Options
	public static void getFirstSelectedOptions(WebElement element) {
		Select s1 = new Select(element);
		WebElement firstsel = s1.getFirstSelectedOption();
		System.out.println(firstsel.getText());
		
	}
	//29.Get All Selected Options
	public static void getAllSelectedOptions(WebElement element) {
		Select s1 = new Select(element);
		List<WebElement> geta = s1.getAllSelectedOptions();
		for (WebElement getf1 : geta) {
			System.out.println(getf1.getText());
		}
	}
	
	//30.Is Multiple
	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		System.out.println(s.isMultiple());
	}
	//31.Click
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	//32.Radio Button
	public static void radioButton(WebElement element) {
		element.click();
		
	}
	//33.Get Page Source 
    public static WebDriver getPageSource() {
	driver.getPageSource();
	return driver;
    }

}













}
