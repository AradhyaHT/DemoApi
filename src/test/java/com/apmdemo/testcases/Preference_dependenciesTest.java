package com.apmdemo.testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apmdemo.base.base;
import com.apmdemo.pages.Homepage;
import com.apmdemo.pages.PreferenceWifi_Setting;
import com.apmdemo.pages.Preference_dependencies;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Preference_dependenciesTest extends base {
	
	Homepage home;
	Preference_dependencies dependencies;
	
	@BeforeMethod
	public void setUp() throws IOException {
		service=startServer();
	AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
	    home = new Homepage(driver);
	    dependencies= new Preference_dependencies(driver);
	    
	    home.preferenceClick();
	  
	    
	    
	}

@Test(priority = 1)

public void dependenciesLinkClick() throws IOException
{
	
   dependencies= new Preference_dependencies(driver);
	
	dependencies.dependenciesClick();
	
	
	}

@AfterMethod
public void tearDown() throws InterruptedException {
	
	Thread.sleep(3000);
	driver.quit();
}

}
