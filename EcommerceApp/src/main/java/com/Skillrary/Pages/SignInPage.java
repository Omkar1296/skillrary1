package com.Skillrary.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Skillrary.GenricLib.BaseTest;

@Test
public class SignInPage {
	
	@FindBy(xpath="//button[text()='Accept']") private WebElement acceptBtn;
	@FindBy(xpath="//span[text()='GEARS']") private WebElement gearBtn;
	@FindBy(xpath="//a[text()=' SkillRary Demo APP']") private WebElement demoLinktb;
	@FindBy(name="q") private WebElement searchBox;
	@FindBy(xpath="//input[@type='submit']") private WebElement searchBtn;
	public SignInPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	public void acceptBotton()
	{
		acceptBtn.click();
	}
	public void gearButton()
	{
		gearBtn.click();
	}
	public void linkTab()
	{
		demoLinktb.click();
	}

	public WebElement getSearchBox() {
		return searchBox;
	}
	
	public void searchBoxTextFeild(String coursenmae)
	{
		searchBox.click();
		searchBox.sendKeys(coursenmae);
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public void searchButton()
	{
		searchBtn.click();
	}
	

}
