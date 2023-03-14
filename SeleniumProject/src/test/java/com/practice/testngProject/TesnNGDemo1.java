package com.practice.testngProject;

import org.testng.annotations.Test;

public class TesnNGDemo1 {
	
	@Test(priority=1)
	public void login() {
		System.out.println("Successfully Login");
	}
	
	@Test(priority=4)
	public void logout() {
		System.out.println("Successfully Logout");
	}
	
	@Test(priority=2)
	public void fundTransfer() {
		System.out.println("Successfully Transfered the Amount");
	}
	
	@Test(priority=3)
	public void updateAddress() {
		System.out.println("Successfully Updated the Address");
	}

}
