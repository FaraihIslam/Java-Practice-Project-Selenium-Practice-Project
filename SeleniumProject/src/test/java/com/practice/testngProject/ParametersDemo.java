package com.practice.testngProject;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	
	@Test
	@Parameters("Browser")
	public void launchBrowser(String brow) {
		System.out.println("Launched Automation Test Case on "+brow+" Browser Successfully");
		
	}

}
