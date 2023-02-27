package com.project.SeleniumProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("Amazon");
		ele.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[contains(text(),'Amazon.com')]")).click();
		List<WebElement> elem=driver.findElements(By.tagName("a"));
		int size=elem.size();
		System.out.println("Total Number of Elements is:"+size);

	}

}
