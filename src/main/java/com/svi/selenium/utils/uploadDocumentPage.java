package com.svi.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.svi.selenium.config.Config;

public class uploadDocumentPage {
	
	public static void UploadDocumentPage(WebDriver driver) throws InterruptedException {
		seleniumUtils.Login(driver);
		Thread.sleep(10000);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"uploadBtn2\"]"));
		button.click();
		return;
	}
	
	public static void testUploadDocumentPage(WebDriver driver) throws InterruptedException {
		UploadDocumentPage(driver);
		return;
	}
	
	public static void testDownloadMappingTemplate(WebDriver driver) throws InterruptedException {
		UploadDocumentPage(driver);
		WebElement span = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/div[3]/label/a"));
		span.click();
		return;
		
	}
	
	public static void testUploadDocument(WebDriver driver) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		UploadDocumentPage(driver);
		Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/select")));
		dropdown.selectByVisibleText(Config.COMPANY.getValue());
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/div[3]/input")).sendKeys(projectPath+"\\Template\\Batch Upload Documents.xlsx");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/div[5]/div/div/div[1]/input")).sendKeys(projectPath+"\\Documents\\TEST DOCUMENTS.pdf");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/div[5]/div/div/div[1]/input")).sendKeys(projectPath+"\\Documents\\TEST DOCUMENTS.pdf");
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/button"));
		button.click();
		WebElement confirm = driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/button[2]"));
		confirm.click();
		
		return;
	}

}
