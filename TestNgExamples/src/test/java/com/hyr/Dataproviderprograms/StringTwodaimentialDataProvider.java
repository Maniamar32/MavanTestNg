package com.hyr.Dataproviderprograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringTwodaimentialDataProvider {
    
	//send parameters as string,to read the dataprovider data 
	@Test(dataProvider="dp1")
    
	public void test(String username,String password) {
		System.out.println(username+">>"+password);
	}
    
	//data read as string array parameter
	@Test(dataProvider="dp1")
   public void test1(String [] s) {
	   System.out.println(s[0]+">>>"+s[1]);
   }
   
	
	// Dataprovider stored data in the form of String [][] two daimentional array
	@DataProvider()
	public String[][] dp1() {
		String[][] data=new String[][] {
			{"mani","123"},
			{"143","naga"}
		};
		return data;
		
	}
	
}
