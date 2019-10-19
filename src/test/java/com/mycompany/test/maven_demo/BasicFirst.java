package com.mycompany.test.maven_demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BasicFirst {
	
@Test
public void Login() throws InterruptedException{
	  ExtentReports extent;  			//To suggest the location of the Report
	  ExtentHtmlReporter HtmlReporter;  //To suggest the location of the Report
	  ExtentTest test;  				//To capture the content of the Report
	  Logger log4j = Logger.getLogger("rootLogger");
	  PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\java\\Constants\\log4j.properties");
	  //log4j = Logger.getLogger("rootLogger");
	  HtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\test-output\\MyExtentReport.html");
	  extent = new ExtentReports();
	  extent.attachReporter(HtmlReporter);	
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  ChromeDriver MyDriver = new ChromeDriver();
	  MyDriver.get("http://newtours.demoaut.com/");
	  MyDriver.manage().window().maximize();	
		
	  log4j.info("***** Login Started Here *****");
	  test = extent.createTest("Login Test");
	
	  WebElement SignOnButton = MyDriver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]"));
	  log4j.info("Found Element: Sign On Button");
	  SignOnButton.click();
		
	  Thread.sleep(5000);
	  log4j.info("Clicked on Sign On Button");
	  test.log(Status.INFO, "Clicked on Sign On Button");
	  
	  WebElement UserName = MyDriver.findElement(By.xpath("//input[@name='userName']"));
	  log4j.info("Found Element: userName");
	  test.log(Status.INFO, "Found Element: userName");
	  
	  WebElement Password = MyDriver.findElement(By.xpath("//input[@name='password']"));
	  log4j.info("Found Element: password");
	  test.log(Status.INFO, "Found Element: password");
	  
	  WebElement SubmitButton = MyDriver.findElement(By.xpath("//input[@name='login']"));
	  log4j.info("Found Element: Submit");
	  test.log(Status.INFO, "Found Element: Submit");
	  
	  UserName.sendKeys("mercury");
	  log4j.info("Entered User Name");
	  test.log(Status.INFO, "Entered User Name");
	  
	  Password.sendKeys("mercury");
	  log4j.info("Entered Password");
	  test.log(Status.INFO, "Entered Password");
	  
	  SubmitButton.click();
	  log4j.info("Clicked on Submit Button");
	  test.log(Status.INFO, "Clicked on Submit Button");
	  
	  Thread.sleep(5000);
	  MyDriver.close();
	  extent.flush();	
}
  
@BeforeTest
public void beforeTest() {
	  
}

@AfterTest
public void afterTest() {
	
}

}
