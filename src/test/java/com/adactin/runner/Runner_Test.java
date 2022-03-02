package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",glue = "com.adactin.stepdefinition",
monochrome = true,dryRun = false,strict = true,
tags = ("@SmokeTest,@blackboxtest,@whiteboxtest,@sanityTest,@RegressionTest"),
plugin = {"html:Report/Cucumber_Report",
		"pretty",
		"json:Reports/Cucumber.json",
		
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
}
)
public class Runner_Test {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver=Baseclass.getbrowser("chrome");
	}
	
	@AfterClass
	public static void teardown() {
		driver=Baseclass.CloseElement();
	}
	

}
