package com.svi.selenium.utils;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.svi.selenium.config.Config;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumUtils {

	public static WebDriver openBrowserAndGetDriver() throws InterruptedException {

		String browser = Config.BROWSER.getValue();
		String url = Config.URL.getValue();

		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid Browser value");
		}

		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		return driver;
	}
	
	public static void Login (WebDriver driver) {
        WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        usernameInput.sendKeys(Config.USERNAME.getValue());
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordInput.sendKeys(Config.PASSWORD.getValue());
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"kc-login\"]"));
        loginButton.click();
        return;
        
        
	}
	
	public static void testLogin(WebDriver driver) throws InterruptedException {
		Login(driver);
        Thread.sleep(5000);
        System.out.println("Test Login Success");
        driver.close();
        return;
        
        
	}
	
	public static void testLogout(WebDriver driver) throws InterruptedException {
		Login(driver);
        
        Thread.sleep(5000);
        
        WebElement signOutbtn = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/button[2]"));
        signOutbtn.click();
        Thread.sleep(2000);
        WebElement chckBtn = driver.findElement(By.xpath("/html/body/div[8]/div[8]/div/div[2]/button[2]"));
        chckBtn.click();
        Thread.sleep(3000);
        driver.close();
        System.out.println("Test Login&Logout Success");
        return;
        
	}
	
	public static void ForgotPasswordPage(WebDriver driver) throws InterruptedException {
		WebElement span = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/form/div[3]/div[2]/span/a"));
		span.click();
	}
	
	public static void testForgotPasswordPage(WebDriver driver) throws InterruptedException {
		WebElement span = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/form/div[3]/div[2]/span/a"));
		span.click();
		WebElement span1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[2]/div[1]/div/span/a"));
		span1.click();
	}
	
	public static void testForgotPassword(WebDriver driver) throws InterruptedException {
		ForgotPasswordPage(driver);
		WebElement input = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		input.sendKeys(Config.EMAIL.getValue());
		WebElement button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[2]/div[2]/input"));
		button.click();
		
	}

}
