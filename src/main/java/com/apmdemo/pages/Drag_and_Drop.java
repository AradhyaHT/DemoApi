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

public class Drag_and_Drop {
	
	AndroidDriver<AndroidElement>driver;
	
public Drag_and_Drop(AndroidDriver<AndroidElement>driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	
		this.driver=driver;
   }

@AndroidFindBy(xpath="//android.widget.TextView[@text='Drag and Drop']")
private WebElement ClickOnDragandDrop;

@AndroidFindBy(xpath="//android.view.View[@index='1']")
private WebElement drag1;

@AndroidFindBy(xpath="//android.view.View[@index='2']")
private  WebElement drop2;


public void tapOnDrag_and_Drop() {
	ClickOnDragandDrop.click();
	
}

public void longpress_Drag_and_Drop() {
	 TouchAction touch = new TouchAction(driver);
     
     touch.longPress(longPressOptions().withElement(element(drag1))).moveTo(element(drop2)).release().perform();
	
}

}
