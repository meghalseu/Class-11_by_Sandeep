package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;

public interface ITestCase {
	
	// They are public and abstract
	public abstract void run(WebDriver driver);
	
}
