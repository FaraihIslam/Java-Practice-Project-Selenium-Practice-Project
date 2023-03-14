package com.practice.testngProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Successfully Launch the Browser");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Successfully Close the Browser");
	}
	
	
	@Test(priority=1)
	public void login() {
		System.out.println("Successfully Login");
	}
	
	@Test(priority=2)
	public void fundTransfer() {
		System.out.println("Successfully Transfered the Amount");
	}
	
	@Test(priority=3)
	public void logout() {
		System.out.println("Successfully Logout");
	}

}
