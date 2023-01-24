package com.Skillrary.GenricLib;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriverCommonLib {
	
	public String getPageTitle()
	{
		return BaseTest.driver.getTitle();
	}
	
	public void verify(String actual, String expected, String page)
	{
		Assert.assertEquals(actual,expected);
		Reporter.log(page+" is Displayed,Pass",true);
	}
	
	public void dropdown(WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebElement ele)
	{
		Actions a=new Actions(BaseTest.driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleClick(WebElement ele)
	{
		Actions a=new Actions(BaseTest.driver);
		a.doubleClick(ele).perform();
	}
	
	public void switchFrame()
	{
		BaseTest.driver.switchTo().frame(0);
	}
	
	public void switchBackFrame()
	{
		BaseTest.driver.switchTo().defaultContent();
	}
	
	public void alertPopup()
	{
		BaseTest.driver.switchTo().alert().accept();
	}
	
	public void switchTabs()
	{
		Set<String> window = BaseTest.driver.getWindowHandles();
		
		for(String wb:window)
		{
			BaseTest.driver.switchTo().window(wb);
		}
	}
	public void scrollBar(int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)BaseTest.driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void photo(String photo) 
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(photo);
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
