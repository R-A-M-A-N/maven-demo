package com.mycompany.test.maven_demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import org.a.log4testng.Logger;

public class GenerateLogNExtentReport {
	ExtentReports extent;  //To suggest the location of the Report
	ExtentHtmlReporter HtmlReporter;  //To suggest the location of the Report
	ExtentTest test;  //To capture the content of the Report
		
	Logger log4j;
	
  @Test
  public void DemoReportPass() {
	  test = extent.createTest("DemoReportPass_TestName");
	  Assert.assertTrue(true);
	  test.log(Status.PASS, "Test Pass as condition is true....");
	  log4j.info("Just Completed DemoReportPass Method...");
  }
  
  @Test
  public void DemoReportFail() {
	  test = extent.createTest("DemoReportFail_TestName");
	  log4j.info("DemoReport Method Executed and Test Failed......");
	  log4j.warn("This is a Warning...");
	  test.log(Status.FAIL, "Test Failed as condition was not met....");
	  Assert.assertTrue(false);
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\java\\Constants\\log4j.properties");
	  log4j = Logger.getLogger("rootLogger");
	  HtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\test-output\\MyExtentReport.html");
	  extent = new ExtentReports();
	  extent.attachReporter(HtmlReporter);
	  extent.setSystemInfo("Host Name", "Local Host");
	  extent.setSystemInfo("Environment", "USER ACCEPTANCE");
	  extent.setSystemInfo("User Name", "Raman");
  }

  @AfterTest
  public void afterTest() {
	  extent.flush();
  }

}
