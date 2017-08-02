package com.selenium.automation.pcpartpicker.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	
protected WebDriver mWebDriver;
	
	protected WebDriverWait mWebDriverWait;
	
	protected Actions action;
	
	public Common(WebDriver webDriver) {
		mWebDriver = webDriver;
		action = new Actions(this.mWebDriver);
		mWebDriverWait = new WebDriverWait(mWebDriver, 10);
	}
	
	public String getPageTitle() {
		return mWebDriver.getTitle();
	}
}
