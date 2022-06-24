package LinkedListEx;

import java.util.LinkedList;

public class ReplaceElemnetbtSet {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("AA");
		l.add("BB");
		l.add("CC");
		l.add("DD");
		l.add("EE");
		for(String s:l) {
			System.out.println(s);
		}
//change the value at index2
		l.set(2,"element changed");
		System.out.println("------*****   after replacement    *****-------");
		for(String s:l) {
			System.out.println(s);
		}	}

}
