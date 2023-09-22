package com.svi.selenium.main;

import org.openqa.selenium.WebDriver;

import com.svi.selenium.config.ConfigInitializer;
import com.svi.selenium.utils.addEmployeePage;
import com.svi.selenium.utils.dashboardPage;
import com.svi.selenium.utils.generatePayrollInputPage;
import com.svi.selenium.utils.myProfilePage;
import com.svi.selenium.utils.searchPage;
import com.svi.selenium.utils.seleniumUtils;
import com.svi.selenium.utils.uploadDocumentPage;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ConfigInitializer.initializeConfig();
		WebDriver driver = seleniumUtils.openBrowserAndGetDriver();
		
		//Login Page
//		seleniumUtils.testLogin(driver);
//		seleniumUtils.testLogout(driver);
//		seleniumUtils.testForgotPasswordPage(driver);
//		seleniumUtils.testForgotPassword(driver);
		
		//Dashboard Page
//		dashboardPage.testDashboardPage(driver);
		
		
		//Search Page
//		searchPage.testSearchPage(driver);
//		searchPage.testSearchBarOnSearchPage(driver);
//		searchPage.testOpenFrameWrapSearchPage(driver);
//		searchPage.radioButtonOnSearchPage(driver);
//		searchPage.testAdvanceSearch(driver);
//		searchPage.testOpenFrameWrapViaRadioButton(driver);
//		searchPage.testFrameWrapDocument(driver);
//		searchPage.testFrameWrapDocumentViaRadioButton(driver);
		
		
		//Add Employee Page
//		addEmployeePage.testAddEmployeePage(driver);
//		addEmployeePage.testSingleEntry(driver);
//		addEmployeePage.testAddEmployeePageByBatch(driver);
//		addEmployeePage.testDownloadMappingTemplate(driver);
//		addEmployeePage.testAddEmployeeByBatch(driver);
		
		
		//Upload Document Page
//		uploadDocumentPage.testUploadDocumentPage(driver);
//		uploadDocumentPage.testDownloadMappingTemplate(driver);
//		uploadDocumentPage.testUploadDocument(driver);
		
		
		//Generate Page
//		generatePayrollInputPage.testPayrollProcessingPage(driver);
//		generatePayrollInputPage.testPayrollProcessing(driver);
		
		
		//My Profile Page
//		myProfilePage.testmyProfilePage(driver);
		
		
		
	}

}
