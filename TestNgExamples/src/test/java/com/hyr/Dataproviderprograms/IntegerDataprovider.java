package com.hyr.Dataproviderprograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IntegerDataprovider {
	@Test(dataProvider="dp1")
	public void test(Integer[] s) {
		System.out.println(s[0]+">>>"+s[1]);
		System.out.println("hiii");
	}

	
	@DataProvider()
	public Integer[][] dp1() {
		Integer[][] data=new Integer[][] {
			{124,123},{654333,34567}
		};
		return data;
	}

}
