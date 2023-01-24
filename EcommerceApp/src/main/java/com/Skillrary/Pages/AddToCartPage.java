package com.Skillrary.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenricLib.BaseTest;

public class AddToCartPage {
	@FindBy (id="add") private WebElement addBtn;
	@FindBy(xpath="//button[text()=' Add to Cart']") private WebElement cartBtn;
	
	public AddToCartPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getAddBtn() {
		return addBtn;
	}
	
	public void addButton()
	{
		addBtn.click();
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public void addToCartButton()
	{
		cartBtn.click();
	}
}
