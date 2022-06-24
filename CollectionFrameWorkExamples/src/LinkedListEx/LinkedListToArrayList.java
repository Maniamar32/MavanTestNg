package LinkedListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("AA");
		l.add("BB");
		l.add("CC");
		l.add("DD");
		l.add("EE");
		System.out.println("in linkedlist"+l);

	List<String> al=new ArrayList<String>(l);
	al.add("xx");
	al.add("yy");
	System.out.println("in arraylist"+al);
	}

}
