package UsingMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountWords {

	public static void main(String[] args) {
		String s[]= {"java","c++","phython","c++","c","java"};
		int n=s.length;

		//  *******find string count with  map
		Map<String ,Integer> m=new HashMap<String,Integer>();
		for(String s1:s) {
			if(!m.containsKey(s1))
			{
				m.put(s1, 1);
			}else {
				int value=m.get(s1);
				m.put(s1, value+1);
			}
		}
		System.out.println("string array count"+m);

		//  ********* find dupilcates with two forloops
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(s[i]==s[j])
				{
					System.out.println("print dupicated using for loop"+s[i]);

				}
			}
		}

		
		//  *******print dupicates with hashset
		boolean flage=false;
	HashSet<String> h=new HashSet<String>();
	for(String s1:s)
	{
		if(h.add(s1)==false) {
			System.out.println("dupicates are"+s1);
			flage=true;
		}
	}
	if(flage==false) {
	System.out.println("duplicates are not found");
	}
	
	//  *******find string reverse
	for(int i=n-1;i>=0;i--) {
		System.out.println("reverse string is"+s[i]);
	}
	
	}
	
	}


