package com.hyr.GroupTest;

import org.testng.annotations.Test;

public class NewTest1 {
	@Test(groups= {"smoke"})
	public void test5() {
		System.out.println("test5");
	}
	
	@Test(groups= {"sanity","smoke","functional"})
	public void test6() {
		System.out.println("test6");
	}
	
	@Test(groups= {"sanity","smoke"})
	public void test7() {
		System.out.println("test7");
	}

	public void test8() {
		System.out.println("test8");
	}


}
