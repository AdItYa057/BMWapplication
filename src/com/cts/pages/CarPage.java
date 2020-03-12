package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarPage {
	private static By technicalDataLocator = By.xpath("(//a[contains(text(),'Technical Data')])[2]");
	private static By horsepowerLocator = By.xpath("(//table[@class='ds2-component ds2-tracking-aware'])[5]/tbody/tr[4]/td[2]");
	public static void technicalDataofCar(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(technicalDataLocator));
		driver.findElement(technicalDataLocator).click();
	}
	
	public static String getHorsePowerofCar(WebDriver driver)
	{
		String power = driver.findElement(horsepowerLocator).getText();
		String horsepower = power.substring(5, 8);
		
		return horsepower;
	}
}
