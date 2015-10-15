package com.toolsqa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SampleTestCaseException implements ITestCase {

	@Override
	public void run(WebDriver driver) {
		
		// Change timeout only for this test and revert it once you are done
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try
		{
			// Test Code
			driver.findElement(By.id("randomId"));
		}
		catch(Exception e)
		{
			// Handling Code
			
			throw e;
		}
		finally // Always Guarenteed to execute - Exception or No Exception
		{
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

	}

}
