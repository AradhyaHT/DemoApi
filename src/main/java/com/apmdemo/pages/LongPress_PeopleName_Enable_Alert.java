package com.apmdemo.pages;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class LongPress_PeopleName_Enable_Alert {

	AndroidDriver<AndroidElement>driver;
	
public LongPress_PeopleName_Enable_Alert(AndroidDriver<AndroidElement>driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	   this.driver=driver;
		
   }
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='People Names']")
	  private WebElement longpressPeopleNames;
   
	
	public void longPress_Open_Menu() {
	
		 
	     TouchAction touch = new TouchAction(driver);
	     
	     touch.longPress(longPressOptions().withElement(element(longpressPeopleNames)).withDuration(ofSeconds(2))).release().perform();
		
	}
}
