package ArrayListExs;

import java.util.ArrayList;

public class ArraylistToArrayToArraList {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("mani");
		a.add("naga");
		a.add("sakhi");
		a.add("harshi");
		System.out.println(a);

		//normalway
		String s[]=new String[a.size()];
		for(int i=0;i<a.size();i++) {
			s[i]=a.get(i);
		}
		for(String s1:s) {
			System.out.println(s1);
		}
		System.out.println("-------using shorcut---------");
		
		String[] a1=a.toArray(new String[a.size()]);
	}

}
