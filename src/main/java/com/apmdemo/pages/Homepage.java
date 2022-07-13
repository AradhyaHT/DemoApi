package com.apmdemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homepage {

 
 
public Homepage(AndroidDriver<AndroidElement>driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	 // AppiumFieldDecorator()  this class will give compartabality giving to run ur test across  android and iOs 
       
   }


@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
private WebElement PreferenceClick;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Views']") //Views
private WebElement ViewsClick;


public void preferenceClick()
{
	PreferenceClick.click();

  }

public void viewsClick() {
	
	ViewsClick.click();
}



}

