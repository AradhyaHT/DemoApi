package com.apmdemo.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apmdemo.base.base;
import com.apmdemo.pages.Drag_and_Drop;
import com.apmdemo.pages.Homepage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;




public class Drag_and_Drop_Test extends base {

	Homepage home;
	Drag_and_Drop dragdrop;
	@BeforeMethod
	public void setUp() throws IOException {
		service=startServer();
	AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
	home = new Homepage(driver);
	dragdrop = new Drag_and_Drop(driver);
	home.viewsClick();
	dragdrop.tapOnDrag_and_Drop();
	
	}
	
	@Test(priority = 1)
	public void longpress_Drag_and_DropTest() {
		
		dragdrop.longpress_Drag_and_Drop();
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
}
