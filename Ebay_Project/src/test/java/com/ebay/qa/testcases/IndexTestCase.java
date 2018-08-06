package com.ebay.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.DealPage;
import com.ebay.qa.pages.IndexPage;
import com.ebay.qa.pages.RegisterPage;

import junit.framework.Assert;

public class IndexTestCase extends TestBase
{
	IndexPage index;
	DealPage deal;
	RegisterPage reg;
	
	public IndexTestCase()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() 
	{
		initialization();
		index=new IndexPage();
	}
	
	@Test(priority=1)
	public void varifyTitleTest()
	{
		String title=index.varifyTitile();
		Assert.assertEquals(title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
		{
			System.out.println("Test Case is Pass");
		}
	}
	
	@Test(priority=2)
	public void varifyLogoTest()
	{
		Boolean b=index.varifyLogo();
		Assert.assertTrue(b);
		{
			System.out.println("Test case is pass: "+b);
		}
		
	}
	
//	@Test(priority=3)
//	public void overDealPageTest() 
//	{
//		deal=index.clickOnDealPage();
//		//deal=index.cliclOnTelevision();
//	}
	
	
//	@Test
//	public void clickOnRegisterTest()
//	{
//		reg=index.clickOnRegisterPage();
//	}
	
	
	
	
	@AfterMethod
	public void exit()
	{
		driver.quit();
	}
	
	
	
}
