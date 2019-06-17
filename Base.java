package com.dd;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\JARZ\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(10000);
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
