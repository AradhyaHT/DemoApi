package com.apmdemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Date_Time_widget {
	
	
	public Date_Time_widget(AndroidDriver<AndroidElement>driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Date Widgets']")
    private WebElement DateWidgetsClick;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='1. Dialog']")
	private WebElement DialogClick;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='change the date']") //change the date
	private WebElement changethedateClick;
	
	@AndroidFindBy(xpath="//android.view.View[@text='29']")
	private WebElement dateClick;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='O']") //OK
    private WebElement okBtnClick;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='CHANGE THE TIME']")
	private WebElement changeTheTimeClick;
	
	@AndroidFindBy(xpath="//*[@content-desc='']") // 9
	private WebElement Clickontime;
	
	@AndroidFindBy(xpath="//*[@content-desc='15']")
	private WebElement Clickon15;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	private WebElement ClickOnOkBtn;
	



 public void tapOn_Date_Widgets() {
	 
	 DateWidgetsClick.click();	 
 }
 
 public void tapOn_Dialog() {
	 DialogClick.click();
     }
 
 public void tapOn_Change_The_Date() {
	 changethedateClick.click();
	 
    }
 public void clickOn_Day_Date() {
	 dateClick.click();
	 
      }
 public void close_the_Date_PopUp() {
	 okBtnClick.click();
 }
 
 public void tapOn_Change_The_Time() {
	 changeTheTimeClick.click();
	 
 }
 
 public void clickOn_Time() throws InterruptedException {
	 Clickontime.click();
	 Thread.sleep(2000);
	 Clickon15.click();
	 
 }
 public void close_the_time_PopUp() {
	 ClickOnOkBtn.click();
 }
 }