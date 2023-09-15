package com.svi.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.svi.selenium.config.Config;

public class addEmployeePage {
	
	public static void testAddEmployeePage(WebDriver driver) throws InterruptedException {
		seleniumUtils.Login(driver);
		Thread.sleep(10000);
		WebElement addBtn = driver.findElement(By.id("addBtn2"));
		addBtn.click();
		Thread.sleep(5000);
		return;
	}
	
	public static void testAddEmployeeSingleEntry(WebDriver driver) throws InterruptedException {
		testAddEmployeePage(driver);
		Select companyDrp = new Select(driver.findElement(By.id("company_name")));
		companyDrp.selectByVisibleText(Config.COMPANY.getValue());
		driver.findElement(By.id("employee_id")).sendKeys(Config.EMP_NUMBER.getValue());
		driver.findElement(By.id("last_name")).sendKeys(Config.LAST_NAME.getValue());
		driver.findElement(By.id("first_name")).sendKeys(Config.FIRST_NAME.getValue());
		
		Select jobTitleDrp = new Select(driver.findElement(By.xpath("//select[@id=\"job_title\"]")));
		jobTitleDrp.selectByVisibleText(Config.JOB_TITLE.getValue());
						
		Select salaryLvlDrp = new Select(driver.findElement(By.xpath("//select[@id=\"salary_level\"]")));
		salaryLvlDrp.selectByVisibleText(Config.SALARY_LEVEL.getValue());
		
		Select empStatusDrp = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[1]/div[2]/div/div[2]/div/div[12]/div[2]/div[2]")));
		empStatusDrp.selectByVisibleText(Config.EMP_STATUS.getValue());
		
		driver.findElement(By.id("//*[@id=\"primary_company_email_address\"]")).sendKeys(Config.PRI_COMP_EMAIL_ADDRESS.getValue());
		
		WebElement contBtn = driver.findElement(By.id("//*[@id=\"appRoot\"]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn.click();
		
	}
	
	public static void testAddEmployeePageByBatch(WebDriver driver) throws InterruptedException {
		testAddEmployeePage(driver);
		WebElement Tab2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/button[2]"));
		Tab2.click();
	}
	
	public static void testDownloadMappingTemplate(WebDriver driver) throws InterruptedException {
		testAddEmployeePageByBatch(driver);
		WebElement download = driver.findElement(By.xpath("//*[@id=\"appRoot\"]/div[3]/div[2]/div[2]/div[1]/label/a"));
		download.click();
	}
	
			
	public static void testAddEmployeeByBatch(WebDriver driver) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		testAddEmployeePageByBatch(driver);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/div[1]/input")).sendKeys(projectPath+"\\Template\\Batch Upload Employees.xlsx");
		Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/select")));
		dropdown.selectByVisibleText(Config.COMPANY.getValue());
		WebElement submit = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[2]/button"));
		submit.click();
		WebElement Confim = driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/button[2]"));
		Confim.click();
		}
		
}
