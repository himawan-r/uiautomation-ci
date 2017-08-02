package com.selenium.automation.pcpartpicker.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.selenium.automation.pcpartpicker.jsonobject.Credential;
import com.selenium.automation.pcpartpicker.pageobject.HomePage;
import com.selenium.automation.pcpartpicker.pageobject.LoginPage;

public class LoginTest extends WebDriverTestBase {
	
	private static final String INVALID_USERNAME = "invalid_username";
	private static final String INVALID_PASSWORD = "invalid_password";
	
	@Test
	public void validateNavigateAndLogin() {
		HomePage homePage =  PageFactory.initElements(driver, HomePage.class);
		homePage.getLoginLink().click();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		assertNotNull(loginPage.getUserNameInput());
		assertNotNull(loginPage.getPasswordInput());
		assertNotNull(loginPage.getLoginButton());
		
		Credential credential = getCredential();
		assertNotNull(credential);
		
		loginPage.typeUsername(credential.getUsername());
		loginPage.typePassword(credential.getPassword());
		HomePage redirectedPage = loginPage.submitLogin();
		PageFactory.initElements(driver, redirectedPage);
		assertEquals(homePage.getPageTitle(), redirectedPage.getPageTitle());
	}
	
	@Test
	public void validateNavigateAndLoginWithInvalidCredential() {
		HomePage homePage =  PageFactory.initElements(driver, HomePage.class);
		homePage.getLoginLink().click();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		assertNotNull(loginPage.getUserNameInput());
		assertNotNull(loginPage.getPasswordInput());
		assertNotNull(loginPage.getLoginButton());
		
		Credential credential = getCredential();
		assertNotNull(credential);
		
		loginPage.typeUsername(INVALID_USERNAME);
		loginPage.typePassword(INVALID_PASSWORD);
		LoginPage redirectedPage = loginPage.submitLoginExpectingFailure();
		PageFactory.initElements(driver, redirectedPage);
		assertEquals(loginPage.getPageTitle(), redirectedPage.getPageTitle());
		assertTrue(redirectedPage.getErrorText().isDisplayed());
	}
}
