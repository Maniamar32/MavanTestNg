package com.hyr.GroupTest;

import org.testng.annotations.Test;

public class NewTest {

	@Test(groups= {"smoke","sanity"})
	public void test1() {
		System.out.println("test1");
	}
	@Test(groups= {"sanity"})
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups= {"functional","smoke"})
	public void test3() {
		System.out.println("test3");
	}

	public void test4() {
		System.out.println("test4");
	}



}
