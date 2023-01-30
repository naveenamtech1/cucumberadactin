package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(features = "src//test//java//com//adactin//feature",glue = "com.adactin.stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
tags="@smokeTest,@sanityTest,@sanityTest,@regressionTest",
plugin= {"html:Target/Html_Report",
		"pretty",
		"html:target/results",
		"html:target/cucumber-reports/cucumber-pretty",
		"json:Target/cucmber.json",
		"rerun:target/cucumber-reports/rerun.txt"})
public class RunnerClass {

	public static WebDriver driver;
	
      @BeforeClass
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
      @AfterClass
public static void teardown() {
    	  
	driver.close();

}

}

