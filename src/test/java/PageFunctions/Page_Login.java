package PageFunctions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import seleniumUtil.SeleniumUtil;

public class Page_Login {
	ChromeDriver MyDriver;
	Logger log;
	ExtentTest test;
	SeleniumUtil Util;
	
	@FindBy(xpath="//a[contains(text(),'SIGN-ON')]")
	public WebElement SignOnButton; 
	@FindBy(xpath="//input[@name='userName']")
	public WebElement UserName;
	@FindBy(xpath="//input[@name='password']")
	public WebElement Password;
	@FindBy(xpath="//input[@name='login']")
	public WebElement SubmitButton;
	
	public Page_Login(ChromeDriver MyDriver, Logger log, ExtentTest test) {
	this.MyDriver = MyDriver;
	this.log = log;
	this.test = test;
	Util = new SeleniumUtil(log, test);
	PageFactory.initElements(MyDriver, this);
	}
	
	public Page_Login() {
	}
	
	public void dologin() {
		try{
			Util.click(SignOnButton, "Sign-On Button Clicked");
			Util.sendkeys(UserName, "User Name", "mercury");
			Util.sendkeys(Password, "Password", "mercury");
			Util.click(SubmitButton, "Submit Button");
			
		}catch(Exception e){
			System.out.println("Util Exception Encountered...");
			
		}
	}
	
}
