package com.Skillrary.GenricLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


//Written in global repo(Github)
public class BaseTest implements IAutoConstant {
	public static WebDriver driver;
	@BeforeMethod
	public void openBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		String browserName = flib.readPropertyData(PROP_PATH, "browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GEKO_KEY, GEKO_VALUE);
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("dabba Fellow enter proper browser name");
		}
		String appURL = flib.readPropertyData(PROP_PATH, "url");
		driver.get(appURL);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "title"), "Page Name");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
