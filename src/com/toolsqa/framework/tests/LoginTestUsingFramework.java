package com.toolsqa.framework.tests;

import com.toolsqa.framework.TestCaseBase;
import com.toolsqa.framework.pageobjectmodel.StoreLoggedInPage;
import com.toolsqa.framework.pageobjectmodel.StoreLoginPage;

public class LoginTestUsingFramework extends TestCaseBase {

	
	@Override
	public void run() {
		
		StoreLoginPage loginPage = new StoreLoginPage();
		loginPage.setUserName("10janbatch_test1");
		loginPage.setPassword("18NYVIZMI52f");
		StoreLoggedInPage loggedInPage = loginPage.clickLoginButton();

	}

}
