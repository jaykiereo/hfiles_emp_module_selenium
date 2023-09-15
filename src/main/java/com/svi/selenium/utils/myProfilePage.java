package com.svi.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myProfilePage {
	
	public static void myProfile(WebDriver driver) throws InterruptedException {
		seleniumUtils.Login(driver);
		Thread.sleep(10000);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"myprofileBtn2\"]"));
		button.click();
		return;
	}
	
	public static void testmyProfilePage(WebDriver driver) throws InterruptedException {
		myProfile(driver);
		return;
	}

}
