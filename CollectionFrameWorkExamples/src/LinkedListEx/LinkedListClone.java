package LinkedListEx;

import java.util.LinkedList;

public class LinkedListClone {

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
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("EE");
		l1.add("FF");
		l1.add("GG");
		l1.add("HH");
		l1.add("II");
		l1=(LinkedList)l.clone();
		for(String s1:l1) {
			System.out.println(s1);
		}

	}

}
