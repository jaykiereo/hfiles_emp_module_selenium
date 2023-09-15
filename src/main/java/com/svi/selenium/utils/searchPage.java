package com.svi.selenium.utils;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import com.svi.selenium.config.Config;

public class searchPage {

	public static void testSearchPage(WebDriver driver) throws InterruptedException {
		seleniumUtils.Login(driver);
		Thread.sleep(10000);
		WebElement searchBtn = driver.findElement(By.id("searchBtn2"));
		searchBtn.click();
		Thread.sleep(5000);
		return;
	}
		
	public static void testSearchBarOnSearchPage(WebDriver driver) throws InterruptedException {
		testSearchPage(driver);
		Thread.sleep(5000);
		WebElement SearchBar = driver.findElement(By.id("inp"));
		SearchBar.sendKeys(Config.SEARCH.getValue());
		Thread.sleep(5000);
		WebElement searchNowBtn = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/button"));
		searchNowBtn.click();
		return;
	}
	
	public static void testOpenFrameWrapSearchPage(WebDriver driver) throws InterruptedException {
		testSearchBarOnSearchPage(driver);
		Thread.sleep(5000);
		WebElement result1 = driver.findElement(By.xpath("/html/body/div[12]/div[2]/div[3]/div[3]/div[2]/div[1]"));
		result1.click();
		return;
	}
	
	public static void radioButtonOnSearchPage(WebDriver driver) throws InterruptedException {
		testSearchPage(driver);
		WebElement detailedSearchRadioBtn = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[2]/p/button"));
		detailedSearchRadioBtn.click();
		Thread.sleep(5000);
		detailedSearchRadioBtn.click();
		return;
	}
	
	public static void testAdvanceSearch (WebDriver driver) throws InterruptedException {
		radioButtonOnSearchPage(driver);
		WebElement detailedSearchRadioBtn = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[2]/p/button"));
		detailedSearchRadioBtn.click();
		Select drpDown = new Select(driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[2]/div/div[1]/div[1]/select")));
		drpDown.selectByVisibleText(Config.SEARCH_DEPARTMENT.getValue());
		WebElement station = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[2]/div/div[1]/div[2]/input"));
		station.sendKeys(Config.SEARCH_STATION.getValue());
		WebElement employeeNumber = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[2]/div/div[1]/div[3]/input"));
		employeeNumber.sendKeys(Config.SEARCH_EMP_NUMBER.getValue());
		WebElement fName = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[2]/div/div[1]/div[4]/input"));
		fName.sendKeys(Config.SEARCH_FIRST_NAME.getValue());
		WebElement lName = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[2]/div/div[1]/div[5]/input"));
		lName.sendKeys(Config.SEARCH_LAST_NAME.getValue());
		WebElement mName = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[2]/div/div[1]/div[6]/input"));
		mName.sendKeys(Config.SEARCH_MIDDLE_NAME.getValue());
//		Select position = new Select(driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[2]/div/div[1]/div[7]/select")));
//		position.selectByVisibleText(Config.SEARCH_POSITION.getValue());
		WebElement SG = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[2]/div/div[1]/div[8]/input"));
		SG.sendKeys(Config.SEARCH_SG.getValue());
//		Select empStatus = new Select(driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[2]/div/div[1]/div[9]/select")));
//		empStatus.selectByVisibleText(Config.SEARCH_EMP_STATUS.getValue());
		Thread.sleep(5000);
		WebElement searchNowBtn = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/button"));
		searchNowBtn.click();
		Thread.sleep(5000);
		return;
	}
			
	public static void testOpenFrameWrapViaRadioButton (WebDriver driver) throws InterruptedException {
		testAdvanceSearch(driver);
		WebElement result1 = driver.findElement(By.xpath("/html/body/div[12]/div[2]/div[3]/div[3]/div[2]/div[1]"));
		result1.click();
	}	
	
	public static void testFrameWrapDocument(WebDriver driver) throws InterruptedException {
		testSearchPage(driver);
		Thread.sleep(5000);
		WebElement SearchBar = driver.findElement(By.id("inp"));
		SearchBar.sendKeys(Config.SEARCH.getValue());
		WebElement docTab = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[1]/div/button[2]"));
		docTab.click();
		Thread.sleep(5000);
		WebElement searchNowBtn = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/button"));
		searchNowBtn.click();
		Thread.sleep(5000);
		WebElement result1 = driver.findElement(By.xpath("/html/body/div[12]/div[2]/div[3]/div[3]/div[2]/div[1]"));
		result1.click();
	}
	
	public static void testFrameWrapDocumentViaRadioButton(WebDriver driver) throws InterruptedException {
		testSearchPage(driver);
		Thread.sleep(5000);
		WebElement docTab = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[1]/div/button[2]"));
		docTab.click();
		Thread.sleep(5000);
		WebElement detailedSearchRadioBtn = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[3]/div[2]/p/button"));
		detailedSearchRadioBtn.click();
		Thread.sleep(5000);
	}	
	
}
