package seleniumUtil;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import Constants.ProjectConstants;

import PageFunctions.Page_Login;

public class TestBase { 
	public static ExtentReports extent;
	public static ChromeDriver MyDriver;
	public static Logger log4j;
	public static Page_Login LoginPg;
	public static ExtentTest test;
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 // PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\java\\Constants\\Env.properties");
		ChromeDriver MyDriver = new ChromeDriver();
		MyDriver.get(ProjectConstants.MyURL);
		MyDriver.manage().window().maximize();	
		LoginPg = new Page_Login(MyDriver, log4j, test);
		
		
		PropertyConfigurator.configure(ProjectConstants.log4jPropFilePath);
		log4j = Logger.getLogger("rootLogger");
		
		ExtentHtmlReporter HtmlReporter = new ExtentHtmlReporter(ProjectConstants.ExtentOutFilePath);  //To suggest the location of the Report
		extent = new ExtentReports();
		extent.attachReporter(HtmlReporter);
  }

  @AfterTest
  public void afterTest() {
	  extent.flush();
  }

}
