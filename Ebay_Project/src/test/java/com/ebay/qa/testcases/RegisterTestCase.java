package com.ebay.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.DealPage;
import com.ebay.qa.pages.IndexPage;
import com.ebay.qa.pages.RegisterPage;
import com.ebay.qa.utils.TestUtils;

public class RegisterTestCase extends TestBase
{

	IndexPage index;
	DealPage deal;
	RegisterPage reg;
	
	String sheetName="register";
	
	public RegisterTestCase()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() 
	{
		initialization();
		index=new IndexPage();
		reg=index.clickOnRegisterPage();
	}
	
	@DataProvider
	public Object[][] getEbayTestData()
	{
		TestUtils.getTestData(sheetName);
		Object data[][]=TestUtils.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getEbayTestData")
	public void registerFillDataTest(String firstname, String lastname, String email_id, String password) throws InterruptedException
	{
		//reg=reg.saveData("Tom", "Jerry", "ve35@gmail.com", "Jefs@132");
		
		reg=reg.saveData(firstname, lastname, email_id, password);
		
	}
	
}
