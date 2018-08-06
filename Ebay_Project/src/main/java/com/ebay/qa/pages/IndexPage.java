package com.ebay.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class IndexPage extends TestBase
{
	//WebDriver driver;
	
	@FindBy(xpath="//a[@id='gh-la']") WebElement logo;
	@FindBy(xpath="//*[@id=\"navigationFragment\"]/div/table/tbody/tr/td[4]/a") WebElement deal;
	@FindBy(xpath="//a[@title='Deals - Laptops' and contains(text(),'Laptops')]") WebElement we;
	
	
	@FindBy(xpath="//a[text()='register']") WebElement reg;
	
	
	public IndexPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String varifyTitile()
	{
		return driver.getTitle();
	}
	
	public boolean varifyLogo()
	{
		return logo.isDisplayed();
		
	}
	
	
	public void listMenu()
	{
		
	}
	
	public DealPage clickOnDealPage()
	{
		Actions a=new Actions(driver);
		a.moveToElement(deal).build().perform();
	
		we.click();
		return new DealPage();
	}

	public RegisterPage clickOnRegisterPage()
	{
		reg.click();
		return new RegisterPage();
	}
	
}
