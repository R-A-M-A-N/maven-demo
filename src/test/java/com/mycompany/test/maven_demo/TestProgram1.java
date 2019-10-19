package com.mycompany.test.maven_demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import seleniumUtil.SeleniumUtil;
import PageFunctions.Page_Login;
import seleniumUtil.TestBase;

public class TestProgram1 extends TestBase{
	ExtentTest test;
	
	@Test
	public void Login() throws InterruptedException {
		try {
		
		log4j.info("#### Login Started Here #####");
		ExtentTest test = extent.createTest("LoginTest");
		new Page_Login (MyDriver,log4j,test).dologin(); 
		}
		catch(Exception e){
			System.out.println("Exception Encountered" + e);
		}
	}

}
