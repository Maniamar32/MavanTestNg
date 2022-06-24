package LinkedListEx;

import java.util.LinkedList;

public class LinkedListToArray {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("AA");
		l.add("BB");
		l.add("CC");
		l.add("DD");
		l.add("EE");
		System.out.println("in linkedlist"+l);

		String [] s=l.toArray(new String[l.size()]);
		for(int i=0;i<l.size();i++) {
		System.out.println("array is:"+s[i]);
	}
	}
}
