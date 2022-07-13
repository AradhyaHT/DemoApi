package com.apmdemo.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apmdemo.base.base;
import com.apmdemo.pages.Expandable_List;
import com.apmdemo.pages.Homepage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Expandable_List_Test extends base {
	
	Homepage home;
	Expandable_List expand;
	
	@BeforeMethod
	public void setUp() throws IOException {
		service=startServer();
	AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
	home = new Homepage(driver);
	expand = new Expandable_List(driver);
	home.viewsClick();
	
	}
	
	@Test(priority = 1)
	public void tapOnExpandableListsTest() {
		expand.tapOnExpandableLists();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	
   }
