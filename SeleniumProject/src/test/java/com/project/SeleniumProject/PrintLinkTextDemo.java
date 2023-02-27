package com.project.SeleniumProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintLinkTextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> link=driver.findElements(By.tagName("a"));
		int size=link.size();
		System.out.println("Total Number of elements present on webpage is :"+size);
		try {
		for(WebElement ele:link) {
			String linkName=ele.getText();
			if(linkName.length()>0)
			System.out.println(linkName);	
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		String pageTitle=driver.getCurrentUrl();
		System.out.println(pageTitle);
		driver.close();

	}

}
