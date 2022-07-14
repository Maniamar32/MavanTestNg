package com.hyr.ParallelTesting;

import org.testng.annotations.Test;

public class DemoTest3 {
	@Test
	
	public void testmethod8() {
		System.out.println("Demo3  >>  testmethod8 is  >>  "+Thread.currentThread().getId());
	}
	
@Test
	
	public void testmethod9() {
		System.out.println("Demo3  >>  testmethod9 is  >>  "+Thread.currentThread().getId());
	}




}
