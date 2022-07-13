package com.apmdemo.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apmdemo.base.base;
import com.apmdemo.pages.Custom_Adapter;
import com.apmdemo.pages.Expandable_List;
import com.apmdemo.pages.Homepage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Custom_Adapter_Test extends base {

	Homepage home;
	Expandable_List expand;
	Custom_Adapter custom;
	
	@BeforeMethod
	public void setUp() throws IOException {
		service=startServer();
	AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
	home = new Homepage(driver);
	expand = new Expandable_List(driver);
	custom = new Custom_Adapter(driver);
	home.viewsClick();
	expand.tapOnExpandableLists();
	}
	
	@Test(priority = 1)
	public void tapOnCustomAdapterTest() {
		custom.tapOnCustomAdapter();
	}
	
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	
}
