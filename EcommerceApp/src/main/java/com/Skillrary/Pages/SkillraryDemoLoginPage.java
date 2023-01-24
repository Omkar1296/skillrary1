package com.Skillrary.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenricLib.BaseTest;

public class SkillraryDemoLoginPage {
	@FindBy(xpath="//div[@class='col-sm-4']//a[text()='Selenium Training']") private WebElement seleniumTrainingLink;
	@FindBy(xpath="//select[@name='addresstype']")private WebElement dropDownOp;
	@FindBy(id="cars") private WebElement selectCourse;
	@FindBy(xpath="//input[@type='Submit']") private WebElement submitBtn;
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")private WebElement fb;
	
	public WebElement getSelectCourse() {
		return selectCourse;
	}
	
	public void selectCourseOption()
	{
		selectCourse.click();
	}
	



	public SkillraryDemoLoginPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	
	
	public WebElement getSeleniumTrainingLink() {
		return seleniumTrainingLink;
	}

	public void seleniumTrainingTab()
	{
		seleniumTrainingLink.click();
	}
	

	public WebElement getDropDownOp() {
		return dropDownOp;
	}
	
	public void dropDownOption()
	{
		dropDownOp.click();
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public void submitButton()
	{
		submitBtn.click();
	}
	public WebElement getFb() {
		return fb;
	}
	
	public void clickFBIcon()
	{
		fb.click();
	}
	

}
