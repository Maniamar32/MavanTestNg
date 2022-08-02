package UsingMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountCharecters {

	public static void main(String[] args) {
		String s="hello";
		char c[]=s.toCharArray();
		Map<Character ,Integer> m=new HashMap<Character,Integer>();
		int n=c.length;

		// **********count characters**********
		for(char ch:c) {
			if(!m.containsKey(ch)) {
				m.put(ch, 1);
			}else {
				int value=m.get(ch);
				m.put(ch, value+1);
			}
		}
		System.out.println(m);

		//  **********print reverse ****************
		for(int i=n-1;i>=0;i--) {
			System.out.println(c[i]);
		}

		//  ********find duplicates******
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(c[i]==c[j])
				{
					System.out.println("duplicates are:"+c[i]);
				}
			}

		}
		
		//   *****Find duplicates with hashset
		boolean flage=false;
		HashSet h=new HashSet();
		for(char c1:c) {
			
			
			
		}
	}
}