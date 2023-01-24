package com.Skillrary.CourseAdd;

import org.testng.annotations.Test;

import com.Skillrary.GenricLib.BaseTest;
import com.Skillrary.GenricLib.WebDriverCommonLib;
import com.Skillrary.Pages.AddToCartPage;
import com.Skillrary.Pages.SignInPage;
import com.Skillrary.Pages.SkillraryDemoLoginPage;



public class AddingCourseToCart extends BaseTest {
	@Test
	public void addingCourseToCartTest()
	{
		SignInPage s=new SignInPage();
		s.acceptBotton();
		s.gearButton();
		s.linkTab();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.switchTabs();
		
		SkillraryDemoLoginPage lp=new SkillraryDemoLoginPage();
		//wlib.scrollBar(0, 1589);
		wlib.mouseHover(lp.getSeleniumTrainingLink());
		lp.seleniumTrainingTab();
		
		AddToCartPage a=new AddToCartPage();
		wlib.doubleClick(a.getAddBtn());
		a.addToCartButton();
		wlib.alertPopup();
		
	}
	

}
