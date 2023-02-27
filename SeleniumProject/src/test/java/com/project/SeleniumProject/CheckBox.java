package com.project.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.adactinhotelapp.com";
		driver.get(url);
		driver.findElement(By.partialLinkText("New User")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("tnc_box")).click();

	}

}
