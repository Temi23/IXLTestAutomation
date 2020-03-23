package com.ixl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ixl.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath= "//*[@id=\"yui_3_18_1_1_1582344480536_599\"]")
	WebElement Grade;
	
	@FindBy(xpath="//*[@id=\"yui_3_18_1_1_1582344480536_587\"]")
	WebElement SubjectTab;
	
	@FindBy(xpath = "//*[@id=\"yui_3_18_1_1_1582345298620_587\"]")
	WebElement GradeBtn;
	
	
	
	
}
