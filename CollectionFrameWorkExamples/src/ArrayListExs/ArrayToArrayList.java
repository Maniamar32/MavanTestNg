package ArrayListExs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

	public static void main(String[] args) {
String []s= {"AA","BB","CC","DD"};
for(String s1:s)
{
	System.out.println(s1);//print array
	}

System.out.println("----------  *************  ---------");
ArrayList<String> a=new ArrayList<String>(Arrays.asList(s));
for(String s1:a)
{
	System.out.println(s1);//print ArrayList
	}

System.out.println("----------  *****Using collections.addAll method********  ---------");
ArrayList<String> a1=new ArrayList<String>();

System.out.println(Collections.addAll(a1,s));
for(String s1:a)
{
	System.out.println(s1);//print ArrayList
	}

System.out.println("----------  *****Using  forloop********  ---------");

ArrayList<String> forloop=new ArrayList<String>();
for(int i=0;i<s.length;i++) {

	forloop.add(s[i]);
	
	for(String s1:forloop)
	{
		System.out.println(s1);//print ArrayList
		}

}

}

}
