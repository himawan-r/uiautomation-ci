package com.selenium.automation.pcpartpicker.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildGuidePage extends Common{

	@FindBy(xpath = "//a[@class='ui-slider-handle ui-state-default ui-corner-all']")
	private List<WebElement> priceFilterSliders;
	
	public BuildGuidePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	public BuildGuidePage slideMaxPriceSlider() {
		action.dragAndDropBy(priceFilterSliders.get(1), -100, 0).build().perform();
		return this;
	}
	
}
