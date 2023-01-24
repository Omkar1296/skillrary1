package com.Skillrary.Facebook;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Skillrary.GenricLib.BaseTest;
import com.Skillrary.GenricLib.WebDriverCommonLib;
import com.Skillrary.Pages.FaceBookPage;
import com.Skillrary.Pages.SignInPage;
import com.Skillrary.Pages.SkillraryDemoLoginPage;

public class FacebookCreateAccount extends BaseTest {
	@Test
	public void facebookCreateAccountTest()
	{
		SignInPage si=new SignInPage();
		si.acceptBotton();
		si.gearButton();
		si.linkTab();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.switchTabs();
		
		SkillraryDemoLoginPage sl=new SkillraryDemoLoginPage();
		WebElement d = sl.getFb();
		Point loc = d.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		wlib.scrollBar(x,y);
		
		sl.getFb().click();
		
		FaceBookPage fb=new FaceBookPage();
		fb.forgottenAccountLink();
		
	}

}
