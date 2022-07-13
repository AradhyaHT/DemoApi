package com.apmdemo.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apmdemo.base.base;
import com.apmdemo.pages.Date_Time_widget;
import com.apmdemo.pages.Homepage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Date_Time_widget_Test extends base {
	
	 Homepage home;
	 Date_Time_widget datetime;
	
	@BeforeMethod
	public void setUp() throws IOException {
		service=startServer();
	AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
	 home = new Homepage(driver);
	 home.viewsClick();
	 datetime = new Date_Time_widget(driver);
	 datetime.tapOn_Date_Widgets();
	 datetime.tapOn_Dialog();
	 
	}
	@Test(priority = 1)
	public void tapOn_Change_Date_Test() {
		datetime.tapOn_Change_The_Date();
		datetime.clickOn_Day_Date();
		datetime.close_the_Date_PopUp();	
	}
	
	@Test(priority = 2)
	public void tapOn_Change_Time_Test() throws InterruptedException {
		datetime.tapOn_Change_The_Time();
		datetime.clickOn_Time();
		datetime.close_the_time_PopUp();
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	

}
