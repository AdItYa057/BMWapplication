package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	private static By modelbuttonLocator = By.xpath("//a[contains(text(),'Models')]");
	private static By modelLocator = By.xpath("//a[contains(text(),'7')]");
	private static By selectCarLocator = By.xpath("//div[@class='cosy-image-wrapper tw-relative']");
	
	private static Actions action;
	
	public static void clickModelButton(WebDriver driver)
	{
		driver.findElement(modelbuttonLocator).click();
	}
	
	public static void selectModel(WebDriver driver)
	{
		driver.findElement(modelLocator).click();
	}
	
	public static void selectCar(WebDriver driver)
	{
		action = new Actions(driver);
		action.moveToElement(driver.findElement(selectCarLocator)).doubleClick().build().perform();
	}
	

}
