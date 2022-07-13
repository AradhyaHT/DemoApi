package com.apmdemo.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import com.apmdemo.util.TestUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base {
	private static final String String = null;
	public static AndroidDriver< AndroidElement> driver;
//	public static void main(String[] args) throws IOException  {
//		capabilities("apiDemo");
//	}

	@BeforeTest
	public static void killAllNodes() throws IOException, InterruptedException
	{
		
		//taskkill /F /IM node.exe
		
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}
	



public static AppiumDriverLocalService service;
	
	public static AppiumDriverLocalService startServer() {
		
		Boolean flag =checkIfServerIsRunning(4723);
		
		if(!flag)
		{
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
		}
		
		return service;
	}
	
	public static Boolean checkIfServerIsRunning(int port)
	{
	Boolean isServerRunning = false;
	ServerSocket serverSocket;       // import java.net.ServerSocket;
	try{
	serverSocket = new ServerSocket(port);
	serverSocket.close();
	}catch(IOException e){
	// If control comes here , then it means that the port is in use 
	isServerRunning = true;
	} finally
	{
	serverSocket = null;
	}
	return isServerRunning;
	}

	
	
	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException 

	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\apmdemo\\config\\global.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		File appDir = new File("src");
		File app = new File(appDir,(String) prop.get(appName));
		
		DesiredCapabilities capabilities =new DesiredCapabilities();
		  
//		String  device = (String) prop.get("device");
//		System.out.println(device);
		 
	String device = System.getProperty("deviceName"); // it'll get run time device given by ex tester 
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,device);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,15);
		capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		capabilities.setCapability("noReset", true);
		
	  driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	 // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 // driver.findElement(By.xpath("//android.widget.TextView[@index='4']")).click();
	  
	 
	  System.out.println("hiii");
	return driver;
	  	
	}
	
	public static void getScreenshot(String s) throws IOException
	{
		
	File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\failed-screenshot-output"+"\\"+s+".png"));
	}
	
}
	


	