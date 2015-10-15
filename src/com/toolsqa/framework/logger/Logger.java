package com.toolsqa.framework.logger;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Logger {

	public static void logInfo(String msg)
	{
		
	}
	
	public static void logException(Exception e, WebDriver driver)
	{
		// Take Screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcFile, new File("C:\\Users\\Sandy\\Desktop\\Screenshot.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Capture Source of the page
		System.out.println("=============================");
		System.out.println(driver.getPageSource());
		System.out.println("=============================");
		
		// Capture
		System.out.println("URL:" + driver.getCurrentUrl());
		System.out.println("TITLE :" +driver.getTitle());
		
		// Inform the TestRunner
		//throw e;
	}
	
}
