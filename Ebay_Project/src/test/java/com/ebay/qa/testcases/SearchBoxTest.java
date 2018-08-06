package com.ebay.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.DealPage;
import com.ebay.qa.pages.IndexPage;
import com.ebay.qa.pages.RegisterPage;
import com.ebay.qa.pages.SearchPage;

public class SearchBoxTest extends TestBase
{

	IndexPage index;
	DealPage deal;
	RegisterPage reg;
	SearchPage search;
	
	public SearchBoxTest()
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
	
	@Test
	public void searchPageTest() 
	{
		search.searchBox("nike", "Shoes");
	}
}
