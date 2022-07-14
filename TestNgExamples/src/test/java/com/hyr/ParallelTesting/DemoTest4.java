package com.hyr.ParallelTesting;

import org.testng.annotations.Test;

public class DemoTest4 {
	@Test
	
	public void testmethod10() {
		System.out.println("Demo4  >>  testmethod10 is  >>  "+Thread.currentThread().getId());
	}
	
@Test
	
	public void testmethod11() {
		System.out.println("Demo4  >>  testmethod11 is  >>  "+Thread.currentThread().getId());
	}
@Test

public void testmethod12() {
	System.out.println("Demo4  >>  testmethod12 is  >>  "+Thread.currentThread().getId());
}




}
