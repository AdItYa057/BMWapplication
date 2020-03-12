package com.cts.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class LaunchWebBrowser {
	protected WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void initialization(@Optional("ch") String browsername)
	{
		//Launching the WebDriver
		if(browsername == "ff")
		{
			//to launch in Firefox Browser
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browsername == "ie")
		{
			//to launch in Internet Explorer
			System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			//to launch in Chrome Browser by default
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		//for maximizing the window
		driver.manage().window().maximize();

		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		//navigating to the URL
		driver.get("https://www.bmw.in/en/");
	}
	
	@AfterMethod
	public void termination()
	{
		//for closing the Web Browser
		driver.quit();
	}
	
}
