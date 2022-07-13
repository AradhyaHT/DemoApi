package com.apmdemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Preference_dependencies {
	
public Preference_dependencies(AndroidDriver<AndroidElement>driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	
		
   }

@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
private WebElement PreferencedependenciesClick;


public void dependenciesClick() {
	PreferencedependenciesClick.click();
}


}
