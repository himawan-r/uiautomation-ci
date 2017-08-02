package com.selenium.automation.pcpartpicker.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Common{

	@FindBy(xpath="//a[@href='/accounts/login/']")
	private WebElement loginLink;
	
	@FindBy(xpath="//a[@href='/guide/']")
	private WebElement buildGuideLink;
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getBuildGuideLink() {
		return buildGuideLink;
	}

}
