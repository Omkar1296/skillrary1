package com.Skillrary.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenricLib.BaseTest;

public class SeleniumCoursePage {
	@FindBy(xpath="//span[text()='Testing']") private WebElement testingTxt;
	@FindBy(xpath="//a[text()='Automation Testing']") private WebElement autxt;
	
	public SeleniumCoursePage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}

	
	public WebElement getTestingTxt() {
		return testingTxt;
	}

	public void testingText()
	{
		testingTxt.click();
	}

	public WebElement getAutxt() {
		return autxt;
	}
	
	public void automationTextFeild()
	{
		autxt.click();
	}
}
