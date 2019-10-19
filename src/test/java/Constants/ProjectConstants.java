package Constants;
/** This Interface creates constants */
public interface ProjectConstants {
	String log4jPropFilePath = System.getProperty("user.dir")+"\\src\\test\\java\\Constants\\log4j.properties";
	String ExtentOutFilePath = System.getProperty("user.dir")+"\\test-output\\MyExtentReport.html";
	String MyURL = "http://newtours.demoaut.com/";
	String TestDataPath = System.getProperty("user.dir")+"\\src\\test\\java\\inputs\\TestData.xlsx";

}
