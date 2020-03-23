package com.ixl.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ixl.qa.base.TestBase;
import com.ixl.qa.pages.HomePage;
import com.ixl.qa.pages.LogingPage;
import com.ixl.qa.util.TestUtil;

public class LogingPageTest extends TestBase {
	LogingPage logingPage;
	HomePage homePage;
	TestUtil testUtil;

	public LogingPageTest() {

		super();
	}

	@BeforeTest
	public void setup() {
		initializationBrowser();
		logingPage = new LogingPage();
		testUtil = new TestUtil();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = logingPage.validateloginpageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "IXL | Math and English Language Arts Practice", "Wrong Title");

	}

	@Test(priority = 2)
	public void IXLLogoImage() {
		boolean flag = logingPage.validateIXLimage();
		Assert.assertTrue(flag);
	}

	@Test(priority = 6)
	public void loginTest() {
		homePage = logingPage.login(prop.getProperty("username"), prop.getProperty("password"));
		

	}
	@Test(priority = 5)
	public void BecomeMemberTest() {
		logingPage.validateMembership();
					
	}
	@Test(priority = 4)
	public void BecomeaMemberBtnTest() {
		 boolean flag =logingPage.validateBecomeaMemberBtne();
		 Assert.assertTrue(flag);
		
	}
	@Test(priority = 3)
	public void CompMessageTest() {
		boolean flag2 = logingPage.validateCompMessage();
		Assert.assertTrue(flag2);
	}
	@Test(priority =7)
	public void useridTest() {
		
	}
	

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
