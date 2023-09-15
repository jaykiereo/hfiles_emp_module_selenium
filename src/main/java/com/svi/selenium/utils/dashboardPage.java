package com.svi.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboardPage {
	
	public static void testDashboardPage(WebDriver driver) throws InterruptedException {
		seleniumUtils.Login(driver);
		
		Thread.sleep(10000);

		WebElement dashBtn = driver.findElement(By.id("dashBoardBtn2"));
		dashBtn.click();
		Thread.sleep(5000);
		WebElement tab1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button[1]"));
		tab1.click();
		Thread.sleep(5000);
		WebElement tab2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button[2]"));
		tab2.click();
		Thread.sleep(5000);
		WebElement tab3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button[3]"));
		tab3.click();
		
		driver.close();
		System.out.println("Test Dashboard Sucess");
		

		return;
	}

}
