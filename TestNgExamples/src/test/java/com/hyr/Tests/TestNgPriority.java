package com.hyr.Tests;

import org.testng.annotations.Test;

public class TestNgPriority {
	@Test(priority=1)
	
	public void SignUp() {
		System.out.println("signup");
	}
	
@Test(priority=-1)
	
	public void Login() {
		System.out.println("Login");
	}

@Test(priority=-1)  //defalut value is zero
public void searchForFlights() {
	System.out.println("searchForFlights");
}

@Test(priority=4)

public void BookTickets() {
	System.out.println("BookTickets");
}

@Test(priority=5)

public void Logout() {
	System.out.println("Logout");
}


}
