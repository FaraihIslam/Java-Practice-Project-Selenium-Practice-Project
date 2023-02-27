package com.project.SeleniumProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		try {
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();
		String actualTitle=driver.getTitle();
		String expectedTitle="Selenium - Google Search";
		System.out.println(actualTitle);
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Verified Page Title Successfully");
		}else {
			System.out.println("Not Verified Failed");
		}
		
		}catch(Exception e) {
			System.out.println("Error-"+e);
		}
		finally
		{
			Thread.sleep(2000);
			driver.close();
		}

	}

}
