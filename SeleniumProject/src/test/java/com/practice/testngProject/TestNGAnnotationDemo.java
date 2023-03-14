package com.practice.testngProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotationDemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://courses.letskodeit.com/practice");
		System.out.println("Successfully Launched the Browser");
	}
	
	@Test(priority=1)
	public void checkRadioButton() throws InterruptedException {
		driver.findElement(By.id("benzradio")).click();
		Thread.sleep(2000);	
		System.out.println("Executed Checked Radio Button Method");
	}
	
	@Test(priority=2)
	public void clickCheckBox() throws InterruptedException {
		driver.findElement(By.id("bmwcheck")).click();
		Thread.sleep(2000);
		System.out.println("Executed Checked Check Box Method");
	}
	
	@BeforeMethod
	public void verifyTitle() {
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void methodExecuted() {
		System.out.println("Successfully Executed Method");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		System.out.println("Successfully Closed the Browser");
	}

}
