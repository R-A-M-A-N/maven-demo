package com.mycompany.test.maven_demo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Constants.ProjectConstants;
import seleniumUtil.ExcelUtil;

public class DataProviderDemo {

	@DataProvider (name="TestData")
	public Object[][] dataProvider() throws IOException {
		Object[][] data = new ExcelUtil().getExcelData(ProjectConstants.TestDataPath, "LoginData");
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void login(String userName, String password) {
		System.out.println(userName + " - " + password);
	}
}
