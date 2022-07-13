package com.apmdemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PreferenceWifi_Setting {
 private	AndroidDriver<AndroidElement>driver;
	
public PreferenceWifi_Setting(AndroidDriver<AndroidElement>driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		this.driver=driver;	
   }
//
// @AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
// public WebElement PreferenceClick;

// @AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
// public WebElement PreferencedependenciesClick;
// 

 @AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='android:id/checkbox']")
private WebElement Clickoncheckbox;
 
 @AndroidFindBy(xpath="//android.widget.TextView[@text='WiFi set']") //WiFi settings
 private WebElement WiFisettingsClick;
 
 @AndroidFindBy(xpath="//android.widget.EditText[@resource-id='android:id/']") //android:id/edit
 private WebElement editClickandEnterTxt;
 
 @AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
 private WebElement clickOkBnt;
 
 
 public void checkboxClick() {
	 Clickoncheckbox.click();
 }
 
 public void wifisettetingClick() {
	 
	 WiFisettingsClick.click();
 }
 
 public void editTestpop_up(String name) {
	 editClickandEnterTxt.sendKeys(name);
	 driver.hideKeyboard();
	 	 
 }
 
 public void pop_up_Ok_Btn() {
	 
	 clickOkBnt.click();
 }
 

  }
