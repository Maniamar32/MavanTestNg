package com.hyr.Dataproviderprograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ObjectDataprovider {
	@Test(dataProvider="dp1")
	public void test(Object[] s) {
		System.out.println(s[0]+">>>"+s[1]);
	}

	
	@DataProvider()
	public Object dp1() {
		Object[][] data=new Object[][] {
			{"mani",123},{"sakhi",34567}
		};
		return data;
	}
	
}
