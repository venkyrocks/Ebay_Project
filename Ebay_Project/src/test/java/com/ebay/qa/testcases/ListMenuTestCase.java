package com.ebay.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.CameraPage;
import com.ebay.qa.pages.IndexPage;
import com.ebay.qa.pages.ListMenuPage;

public class ListMenuTestCase extends TestBase
{
	IndexPage index;
	ListMenuPage li;
	CameraPage cp;
	
	public ListMenuTestCase()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() 
	{
		initialization();
		index=new IndexPage();
	}
	
	@Test
	public void clickMenuTest()
	{
		li.clickOnListMenu();
	}
	
}
