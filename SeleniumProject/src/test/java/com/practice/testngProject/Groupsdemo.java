package com.practice.testngProject;

import org.testng.annotations.Test;


public class Groupsdemo {
	
	@Test(priority=1,groups="Module-1")
	public void testCase1() {
		System.out.println("Executed Test-Case 1");
	}
	
	@Test(priority=2,groups= {"Module-1","Module-3"})
	public void testCase2() {
		System.out.println("Executed Test-Case 2");
	}
	
	@Test(priority=3,groups="Module-1")
	public void testCase3() {
		System.out.println("Executed Test-Case 3");
	}
	
	@Test(priority=4,groups="Module-2")
	public void testCase4() {
		System.out.println("Executed Test-Case 4");
	}
	
	@Test(priority=5,groups="Module-2")
	public void testCase5() {
		System.out.println("Executed Test-Case 5");
	}
	
	@Test(priority=6,groups="Module-2")
	public void testCase6() {
		System.out.println("Executed Test-Case 6");
	}

}
