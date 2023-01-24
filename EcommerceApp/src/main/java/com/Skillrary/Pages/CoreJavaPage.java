package com.Skillrary.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenricLib.BaseTest;

public class CoreJavaPage {
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")private WebElement coreJavatxt;
	
	public CoreJavaPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}

	public WebElement getCoreJavatxt() {
		return coreJavatxt;
	}
	
	public void clickCoreJavaTxt()
	{
		coreJavatxt.click();
	}

}
