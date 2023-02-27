package com.project.SeleniumProject;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open New Page")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		Iterator<String> itr=windowHandles.iterator();
		String parentWindow=itr.next();
		String childWindow=itr.next();
		Thread.sleep(1000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-400)");
		driver.findElement(By.name("fname")).sendKeys("Faraih Islam");
		Thread.sleep(2000);
		driver.switchTo().window(childWindow);
		Thread.sleep(1000);
		driver.findElement(By.id("fname")).sendKeys("Sunny");
		

	}

}
