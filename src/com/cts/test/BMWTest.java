package com.cts.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cts.base.LaunchWebBrowser;
import com.cts.pages.CarPage;
import com.cts.pages.HomePage;
import com.cts.utils.ExcelWrite;

public class BMWTest extends LaunchWebBrowser {
	
	@Test
	public void dreamCar() throws  IOException
	{
		
		//clicking on Model Button
		HomePage.clickModelButton(driver);
		
		//selecting the Model
		HomePage.selectModel(driver);
		
		//selecting the car
		HomePage.selectCar(driver);
		
		//going into Technical details of Car
		CarPage.technicalDataofCar(driver);
		
		//getting HorsePower of Car
		String horsepower = CarPage.getHorsePowerofCar(driver);
		int horsePower1 = Integer.parseInt(horsepower);
		
		//Comparing if HorsePower is greater than 500 and writing it to Excel
		if(horsePower1<500)
		{
			ExcelWrite.excelWrite("BMW_Output.xlsx", "Horse_Powers", 0, 0, "Does not meet my requirements");
		}
		else
		{
			ExcelWrite.excelWrite("BMW_Output.xlsx", "Horse_Powers", 0, 0, horsepower);
		}
		
	}
}
