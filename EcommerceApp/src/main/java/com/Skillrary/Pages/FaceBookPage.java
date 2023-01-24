package com.Skillrary.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenricLib.BaseTest;

public class FaceBookPage {
	@FindBy(xpath="//a[text()='Forgotten account?']")private WebElement forgotAcc;

	public FaceBookPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void forgottenAccountLink()
	{
		forgotAcc.click();
	}
}
