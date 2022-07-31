package com.hyr.dependes;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependensOnMethodEx {
	
	@Test
	public void login() {
		System.out.println("login page");
		Assert.fail("failTest");
	}
	
	@Test(dependsOnMethods="login", alwaysRun=true)
	public void home() {
		System.out.println("home page");
	}


}
