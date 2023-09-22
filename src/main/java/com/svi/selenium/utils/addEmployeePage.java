package com.svi.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	
	public static void testSingleEntry(WebDriver driver) throws InterruptedException {
		employmentDeatailsSingleEntry(driver);
		payrollAndSalaryDetailsSingleEntry(driver);
		additionalPersonalDetailsSingleEntry(driver);
		contactInformation(driver);
		presentAddressSingleEntry(driver);
		permanentAddressSingleEntry(driver);
		educationalBackgroundSingleEntry(driver);
		governmentIdSingleEntry(driver);
		professionalLicenseSingleEntry(driver);
		familyDetailsSingleEntry(driver);
		companyRelativesSingleEntry(driver);
		trainingAndSkillsDetailsSingleEntry(driver);
		workExperienceSingleEntry(driver);
		hiringEvaluationSingleEntry(driver);
	}

	public static void employmentDeatailsSingleEntry(WebDriver driver) throws InterruptedException {
		testAddEmployeePage(driver);
		Select companyDrp = new Select(driver.findElement(By.id("company_name")));
		companyDrp.selectByVisibleText(Config.COMPANY.getValue());
		driver.findElement(By.id("employee_id")).sendKeys(Config.EMP_NUMBER.getValue());
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[1]/div[2]/div/div[2]/div/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("last_name")).sendKeys(Config.LAST_NAME.getValue());
		driver.findElement(By.id("first_name")).sendKeys(Config.FIRST_NAME.getValue());
		
		WebElement jobTitleDrp =  driver.findElement(By.xpath("//*[@id=\"job_title-selectized\"]"));
		jobTitleDrp.click();
		jobTitleDrp.sendKeys(Config.JOB_TITLE.getValue());
		jobTitleDrp.sendKeys(Keys.ENTER);
		
		WebElement salaryLevelDrp =  driver.findElement(By.xpath("//*[@id=\"salary_level-selectized\"]"));
		salaryLevelDrp.click();
		salaryLevelDrp.sendKeys(Config.SALARY_LEVEL.getValue());
		salaryLevelDrp.sendKeys(Keys.ENTER);
		
		WebElement empStatus = driver.findElement(By.xpath("//*[@id=\"employment_status-selectized\"]"));
		empStatus.sendKeys(Keys.BACK_SPACE);
		empStatus.sendKeys(Config.EMP_STATUS.getValue());
		empStatus.sendKeys(Keys.ENTER);
		
		WebElement hireDate =  driver.findElement(By.xpath("//*[@id=\"hire_date\"]"));
		hireDate.clear();
		hireDate.sendKeys(Config.HIRE_DATE.getValue());	
			
		driver.findElement(By.xpath("//*[@id=\"primary_company_email_address\"]")).sendKeys(Config.PRI_COMP_EMAIL_ADDRESS.getValue());
		
		WebElement contBtn = driver.findElement(By.xpath("//*[@id=\"appRoot\"]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn.click();
		
	}

	public static void payrollAndSalaryDetailsSingleEntry(WebDriver driver) throws InterruptedException {
		WebElement slryDsbrsmntTypDrp = driver.findElement(By.xpath("//*[@id=\"salary_disburse_type-selectized\"]"));
		slryDsbrsmntTypDrp.click();
		slryDsbrsmntTypDrp.sendKeys(Config.SAL_DISBURSEMENT_TYPE.getValue());
		slryDsbrsmntTypDrp.sendKeys(Keys.ENTER);
			
		WebElement slryCmpttnBssDrp =  driver.findElement(By.xpath("//*[@id=\"salary_type-selectized\"]"));
		slryCmpttnBssDrp.sendKeys(Config.SALARY_LEVEL.getValue());
		slryCmpttnBssDrp.sendKeys(Keys.ENTER);
		
		WebElement bscRt = driver.findElement(By.xpath("//*[@id=\"basic_monthly_rate\"]"));
		bscRt.sendKeys(Config.BASIC_RATE.getValue());
		
		WebElement taxCodeDrp =  driver.findElement(By.xpath("//*[@id=\"tax_code-selectized\"]"));
		taxCodeDrp.sendKeys(Config.TAX_CODE.getValue());
		taxCodeDrp.sendKeys(Keys.ENTER);
				
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
	}

	public static void additionalPersonalDetailsSingleEntry(WebDriver driver) throws InterruptedException {
		WebElement birthDate =  driver.findElement(By.xpath("//*[@id=\"birthdate\"]"));
		birthDate.clear();
		birthDate.sendKeys(Config.BIRTH_DATE.getValue());
		
		WebElement genderDrp =  driver.findElement(By.xpath("//*[@id=\"gender-selectized\"]"));
		genderDrp.sendKeys(Config.GENDER.getValue());
		genderDrp.sendKeys(Keys.ENTER);
		
		WebElement civilStatusDrp =  driver.findElement(By.xpath("//*[@id=\"civil_status-selectized\"]"));
		civilStatusDrp.sendKeys(Config.CIVIL_STATUS.getValue());
		civilStatusDrp.sendKeys(Keys.ENTER);
		
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
	}

	public static void contactInformation(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"primary_mobile_no\"]")).sendKeys(Config.PRIMARY_MOBILE_NUMBER.getValue());
	
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
	
	}

	public static void presentAddressSingleEntry(WebDriver driver) throws InterruptedException {
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
	
	}

	public static void permanentAddressSingleEntry(WebDriver driver) throws InterruptedException {
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
	
	}

	public static void educationalBackgroundSingleEntry(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"school\"]")).sendKeys(Config.SCHOOL.getValue());
		driver.findElement(By.xpath("//*[@id=\"school_location\"]")).sendKeys(Config.LOCATION.getValue());
		
		WebElement educationalLevelDrp =  driver.findElement(By.xpath("//*[@id=\"educational_attainment_level-selectized\"]"));
		educationalLevelDrp.sendKeys(Config.LEVEL.getValue());
		educationalLevelDrp.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("degree")).sendKeys(Config.DEGREE.getValue());
		driver.findElement(By.xpath("//*[@id=\"year_started\"]")).sendKeys(Config.YEAR_STARTED.getValue());
		
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
		
	}

	public static void governmentIdSingleEntry(WebDriver driver) throws InterruptedException {
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
	
	}

	public static void professionalLicenseSingleEntry(WebDriver driver) throws InterruptedException {
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
	
	}

	public static void familyDetailsSingleEntry(WebDriver driver) throws InterruptedException {
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
	
	}

	public static void companyRelativesSingleEntry(WebDriver driver) throws InterruptedException {
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
	
	}

	public static void trainingAndSkillsDetailsSingleEntry(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"skill_name\"]")).sendKeys(Config.SKILL.getValue());
		
		WebElement skillLevelDrp =  driver.findElement(By.xpath("//*[@id=\"skill_level-selectized\"]"));
		skillLevelDrp.sendKeys(Config.SKILL_LEVEL.getValue());
		skillLevelDrp.sendKeys(Keys.ENTER);
		
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
		
	}
	
	public static void workExperienceSingleEntry(WebDriver driver) throws InterruptedException {
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
	
	}

	public static void hiringEvaluationSingleEntry(WebDriver driver) throws InterruptedException {
		WebElement type =  driver.findElement(By.xpath("//*[@id=\"type\"]"));
		type.click();
		type.sendKeys(Config.HIRING_EVALUATION_TYPE.getValue());
		type.sendKeys(Keys.ENTER);
		
		WebElement birthDate =  driver.findElement(By.xpath("//*[@id=\"start_date\"]"));
		birthDate.clear();
		birthDate.sendKeys(Config.HIRING_EVALUATION_DATE.getValue());
		
		WebElement contBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/button[1]"));
		contBtn1.click();
		
		WebElement contBtn2 = driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/button[2]"));
		contBtn2.click();
		
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
