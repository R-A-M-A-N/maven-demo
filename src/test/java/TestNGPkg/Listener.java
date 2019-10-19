package TestNGPkg;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {
	public void onTestStart(ITestResult tr) {
		System.out.println("Listener Msg: Test Started");
	}
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Listener Msg: Test Passed...");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Listener Msg: Test Failed...");
	}
	
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Listener Msg: Test Skipped...");
	}
}
