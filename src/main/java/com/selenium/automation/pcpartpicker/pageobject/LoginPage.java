package com.selenium.automation.pcpartpicker.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Common{
	
	@FindBy(xpath="//input[@id='id_username']")
	private WebElement userNameInput;
	
	@FindBy(xpath="//input[@id='id_password']")
	private WebElement passwordInput;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[@class='pad-block login-error']")
	private WebElement errorText;
	
	public LoginPage(WebDriver webDriver) {
		super(webDriver);
	}

	public LoginPage typeUsername(String username) {
		userNameInput.sendKeys(username);
		return this;	
    }
	
	public LoginPage typePassword(String password) {
		passwordInput.sendKeys(password);
		return this;	
    }
	
	public HomePage submitLogin() {
		loginButton.submit();
        return new HomePage(this.mWebDriver);	
    }
	
	public LoginPage submitLoginExpectingFailure() {
		loginButton.submit();
        return new LoginPage(this.mWebDriver);	
    }

	public WebElement getUserNameInput() {
		return userNameInput;
	}

	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getErrorText() {
		return errorText;
	}
	
}
