package com.FindDuplicates;

import java.util.HashSet;

public class DuplicateStringArray {

	public static void main(String[] args) {
		String s[]= {"java","c","C++","PYTHON","Java","C"};
		boolean flage=false;
		HashSet<String> h=new HashSet<String>();

		for(String s1:s)
		{
			//System.out.println(h.add(s1));
 
			if(h.add(s1)==false)
			{
				
				System.out.println("Found duplicate elements\n"+s1);
				flage=true;
			}
		}
		
       if(flage=true) {
    	   
    	   System.out.println("No duplicate elemnet found");
       }
	}

}
