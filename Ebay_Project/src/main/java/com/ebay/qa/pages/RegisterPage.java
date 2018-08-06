package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class RegisterPage extends TestBase
{
	
	@FindBy(xpath="//input[@name='firstname']")WebElement fname;
	@FindBy(xpath="//input[@name='lastname']")WebElement lname;
	@FindBy(xpath="//input[@name='email']")WebElement email;
	@FindBy(xpath="//input[@name='PASSWORD']")WebElement pass;
	@FindBy(xpath="//input[@type='submit']")WebElement btn;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public RegisterPage saveData(String fn, String ln, String em, String ps) throws InterruptedException
	{
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		email.sendKeys(em);
		pass.sendKeys(ps);
		Thread.sleep(5000);
		btn.click();
		
		return new RegisterPage();
	}
	
}
