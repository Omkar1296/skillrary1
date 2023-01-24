package com.Skillrary.ShareTwitter;

import org.testng.annotations.Test;

import com.Skillrary.GenricLib.BaseTest;
import com.Skillrary.GenricLib.FileLib;
import com.Skillrary.GenricLib.WebDriverCommonLib;
import com.Skillrary.Pages.CoreJavaPage;
import com.Skillrary.Pages.CoreJavaVideoPage;
import com.Skillrary.Pages.SeleniumCoursePage;
import com.Skillrary.Pages.SignInPage;

public class ShareViaTwitter extends BaseTest{
	@Test
	public void shareViaTwitterTest() throws Throwable
	{
		FileLib flib=new FileLib();
		SignInPage sp=new SignInPage();
		sp.acceptBotton();
		sp.searchBoxTextFeild(PROP_PATH);
		sp.searchButton();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "pageTitle"), "Page Name");
		
		SeleniumCoursePage scp=new SeleniumCoursePage();
		wlib.mouseHover(scp.getTestingTxt());
		scp.automationTextFeild();
		
		CoreJavaPage cjp=new CoreJavaPage();
		cjp.clickCoreJavaTxt();
		
		CoreJavaVideoPage vp=new CoreJavaVideoPage();
		//wlib.switchFrame();
	    //vp.playButton();
		//Thread.sleep(10000);
		//vp.playButton();
		vp.clickSharViaTwitterLink();;
		
		
		
	}

}
