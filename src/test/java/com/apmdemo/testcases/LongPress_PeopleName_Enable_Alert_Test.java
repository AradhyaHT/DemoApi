package com.apmdemo.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apmdemo.base.base;
import com.apmdemo.pages.Custom_Adapter;
import com.apmdemo.pages.Expandable_List;
import com.apmdemo.pages.Homepage;
import com.apmdemo.pages.LongPress_PeopleName_Enable_Alert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LongPress_PeopleName_Enable_Alert_Test extends base {
    
	Homepage home;
	Expandable_List expand;
	Custom_Adapter custom;
	LongPress_PeopleName_Enable_Alert peoplename;
	
	@BeforeMethod
	public void setUp() throws IOException {
		service=startServer();
	AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
	home = new Homepage(driver);
	expand = new Expandable_List(driver);
	custom = new Custom_Adapter(driver);
	peoplename = new LongPress_PeopleName_Enable_Alert(driver);
	home.viewsClick();
	expand.tapOnExpandableLists();
	custom.tapOnCustomAdapter();
	}
	
	@Test(priority = 1)
	public void longPress_Open_Menu_Test() {
		
		peoplename.longPress_Open_Menu();
	}
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	
}
