package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class ListMenuPage extends TestBase
{
	@FindBy(xpath="//button[@id='gh-shop-a']")WebElement searchBox;
	@FindBy(xpath="//a[text()='Digital Cameras']") WebElement cameraLink;
	
	
	public ListMenuPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public CameraPage clickOnListMenu() 
	{
		searchBox.click();
		//cameraLink.click();
		return new CameraPage();
	}
	
	
}
