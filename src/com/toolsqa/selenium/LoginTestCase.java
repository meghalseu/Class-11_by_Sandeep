package com.toolsqa.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.toolsqa.framework.logger.Logger;

public class LoginTestCase implements ITestCase {

	@Override
	public void run(WebDriver driver) {

		driver.get("http://store.demoqa.com");
		
		try{
			driver.findElement(By.partialLinkText("My Account")).click();
			
			WebDriverWait waiter = new WebDriverWait(driver, 10);
			
			WebElement loginTxt =waiter.until(ExpectedConditions.presenceOfElementLocated(By.name("log")));  
			
			loginTxt.sendKeys("10janbatch_test1");
			
			driver.findElement(By.id("pwd")).sendKeys("18NYVIZMI52f");
			
			driver.findElement(By.id("login")).submit();
			
			waiter.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Logout"))).click();
		}
		catch(Exception e)
		{
			Logger.logException(e, driver);
		}
		

	}

}
