package com.hyr.ParallelTesting;

import org.testng.annotations.Test;

public class DemoTest2 {
	@Test
	
	public void testmethod5() {
		System.out.println("Demo2  >>  testmethod5 is  >>  "+Thread.currentThread().getId());
	}
	
@Test
	
	public void testmethod6() {
		System.out.println("Demo2  >>  testmethod6 is  >>  "+Thread.currentThread().getId());
	}
@Test

public void testmethod7() {
	System.out.println("Demo2  >>  testmethod7 is  >>  "+Thread.currentThread().getId());
}




}
