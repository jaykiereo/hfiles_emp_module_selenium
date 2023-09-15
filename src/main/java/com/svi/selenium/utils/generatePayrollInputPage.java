package com.svi.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.svi.selenium.config.Config;

public class generatePayrollInputPage {
	
	public static void payrollProcessingPage(WebDriver driver) throws InterruptedException {
		seleniumUtils.Login(driver);
		Thread.sleep(10000);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"cutoffBtn2\"]"));
		button.click();
		return;
	}
	
	public static void testPayrollProcessingPage(WebDriver driver) throws InterruptedException {
		payrollProcessingPage(driver);
		return;
	}
	
	public static void testPayrollProcessing(WebDriver driver) throws InterruptedException {
		payrollProcessingPage(driver);
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"payroll-modal\"]/div[2]/div[1]/select")));
		dropdown.selectByVisibleText(Config.PAYROLL_COMPANY.getValue());
//		Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id=\"payroll-modal\"]/div[2]/div[2]/select")));
//		dropdown1.selectByVisibleText(Config.PAYROLL_PERIOD.getValue());
		Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id=\"payroll-modal\"]/div[2]/div[3]/select")));
		dropdown2.selectByVisibleText(Config.PAYROLL_PERIOD_DATE.getValue());
		WebElement button = driver.findElement(By.xpath("//*[@id=\"payroll-modal\"]/div[3]/button"));
		button.click();
		return;
	}
	
	
}
