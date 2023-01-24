package com.Skillrary.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenricLib.BaseTest;

public class CoreJavaVideoPage {
	
	//@FindBy(xpath="//button[@aria-label='Play']") private WebElement playBtn;
	//@FindBy(xpath="//button[@aria-label='Pause']") private WebElement pauseBtn;
	@FindBy(xpath="//span[contains(text(),'Share via Twitter')]")private WebElement clickTwitterLink;
	public CoreJavaVideoPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}

	/*public WebElement getPlayBtn() {
		return playBtn;
	}
	
	
	public WebElement getPauseBtn() {
		return pauseBtn;
	}
	*/
	

	public WebElement getClickShareViaTwitterTxt() {
		return clickTwitterLink;
	}
	
/*
	public void playButton()
	{
		playBtn.click();
	}
	
	public void pauseButton()
	{
		pauseBtn.click();
	}
	*/
	public void clickSharViaTwitterLink()
	{
		clickTwitterLink.click();
	}
}
