package seleniumUtil;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class SeleniumUtil {
	Logger log4j;
	ExtentTest test;
	
	public SeleniumUtil(Logger log, ExtentTest test) {
		this.log4j = log;
		this.test = test;
	}
	
	public void click(WebElement ele, String eleName) {
		ele.click();
		log4j.info("Clicked On" + eleName);
		test.log(Status.INFO, "Clicked On" + eleName);
	}
	
	public void sendkeys(WebElement ele, String eleName, String StrName) {
		ele.sendKeys(StrName);
		log4j.info(StrName + "Entered in Field..." + eleName);
		test.log(Status.INFO, StrName + "Entered in Field..." + eleName);
	}
}
