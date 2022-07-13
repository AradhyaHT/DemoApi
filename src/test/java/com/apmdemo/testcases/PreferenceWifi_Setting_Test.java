package com.apmdemo.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apmdemo.base.base;
import com.apmdemo.pages.Homepage;
import com.apmdemo.pages.PreferenceWifi_Setting;
import com.apmdemo.pages.Preference_dependencies;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PreferenceWifi_Setting_Test extends base{
	
 Homepage home;
 Preference_dependencies dependencies;
 PreferenceWifi_Setting wifisetting;
 

	@BeforeMethod
	public void setUp() throws IOException {
		service=startServer();
	AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
	    home = new Homepage(driver);
	    dependencies= new Preference_dependencies(driver);
	    wifisetting = new PreferenceWifi_Setting(driver);
	    home.preferenceClick();
	    dependencies.dependenciesClick();
	    
	    
	}
 
	@Test

	public void dependenciesLinkClick() throws IOException, InterruptedException
	{
//		service=startServer();
//		
//		AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
//		
     //      home = new Homepage(driver);
          
	//	Preference_dependencies dependencies= new Preference_dependencies(driver);
		
	//	PreferenceWifi_Setting wifisetting = new PreferenceWifi_Setting(driver);
//		 home.preferenceClick();
//		dependencies.dependenciesClick();
		
		wifisetting.checkboxClick();
		wifisetting.wifisettetingClick();
		wifisetting.editTestpop_up("Aradhya");
		wifisetting.pop_up_Ok_Btn();
		
		
  }
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
