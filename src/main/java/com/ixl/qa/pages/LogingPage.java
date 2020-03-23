package com.ixl.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ixl.qa.base.TestBase;


public class LogingPage extends TestBase {

	// Page Factory or Object Repository

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "qlsubmit")
	WebElement LoginBtn;

	@FindBy(xpath = "//a[@class='btn-become-a-member crisp-button']")
	WebElement BecomeaMemberBtn;

	@FindBy(xpath = "//a[@id=\"hd-logo\"]")
	WebElement IXLLogo;

	@FindBy(xpath = "//a[@class='modal-close' and @id='yui_3_18_1_1_1581974960183_95']")
	WebElement User;

	@FindBy(xpath = "//div[@class='ixl-modal-underlay']")
	WebElement childWindowId;
	
	@FindBy(xpath ="//a[@class='hdr-f1-h1 hdr-where-learner-excel']")
	WebElement Advert;
	
	@FindBy(xpath = "//div[contains(text(),'dara')]")
	WebElement person;
	
	@FindBy(xpath= "//*[@id=\"ixl-nav-categories\"]/ul/li[1]/a")
	WebElement Learning;
	
	@FindBy(xpath="//*[@id=\"user-nav-wrapper\"]/h4/span[1]")
	WebElement Userid;
			
	// @FindBy(xpath="//div[@class='squished-name font-15px']")
	// WebElement owner;

	// Initializing page objects

	public LogingPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:

	public String validateloginpageTitle() {
		return driver.getTitle();
	}

	public boolean validateIXLimage() {
		return IXLLogo.isDisplayed();
	}

	public HomePage login(String un, String pwd) {

		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		
		
		person.click();
		
	
		return new HomePage();
	
	}

	public BecomememberPage validateMembership() {
		BecomeaMemberBtn.click();
		return new BecomememberPage();
	}
	public boolean validateBecomeaMemberBtne() {
		return BecomeaMemberBtn.isDisplayed();
	}
	public boolean validateCompMessage() {
		return Advert.isDisplayed();
	}
	
	public LearningPage validateLearningPage() {
		Learning.click();
		return  new LearningPage();
		
	}

	
	}

