package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ebay.qa.base.TestBase;

public class SearchPage extends TestBase
{
	@FindBy(xpath="//input[@name='_nkw']")WebElement searchBox;
	@FindBy(xpath="//select[@id='gh-cat']")WebElement searchSelectComobox;
	@FindBy(xpath="//input[@id='gh-btn']")WebElement searchBtn;
	
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public SearchPage searchBox(String items,String name)
	{
		searchBox.sendKeys(items);
		Select s=new Select(searchSelectComobox);
		s.selectByVisibleText(name);
		searchBtn.click();
		
		return  new SearchPage();		
	}
	
}
