package com.selenium.automation.pcpartpicker.test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.selenium.automation.pcpartpicker.pageobject.BuildGuidePage;
import com.selenium.automation.pcpartpicker.pageobject.HomePage;

public class BuildGuidePageTest extends WebDriverTestBase{
	
	private void navigateToBuildGuidePage() {
		HomePage homePage =  PageFactory.initElements(driver, HomePage.class);
		homePage.getBuildGuideLink().click();
	}
	
	@Test
	public void filteringItem() {
		navigateToBuildGuidePage();
		BuildGuidePage buildGuidePage =  PageFactory.initElements(driver, BuildGuidePage.class);
		buildGuidePage.slideMaxPriceSlider();
		
		HomePage homePage =  PageFactory.initElements(driver, HomePage.class);
	}
}
