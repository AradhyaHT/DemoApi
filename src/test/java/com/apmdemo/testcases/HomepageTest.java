package com.apmdemo.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apmdemo.base.base;
import com.apmdemo.pages.Homepage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomepageTest extends base {
	
	Homepage home;
	
	@BeforeMethod
	public void setUp() throws IOException {
		service=startServer();
	AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
	    home = new Homepage(driver);
	}
	
	@Test(priority = 1)
	public void viewsLinkClick() throws IOException {
//		
//	service=startServer();
//		
//	AndroidDriver<AndroidElement> driver=capabilities("apiDemo");

  // Homepage home = new Homepage(driver);
	//  home = new Homepage(driver);
		 home.viewsClick();
  // home.preferenceClick();
		
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	

}
