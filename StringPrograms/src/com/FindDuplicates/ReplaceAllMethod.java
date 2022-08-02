package com.FindDuplicates;

public class ReplaceAllMethod {

	public static void main(String[] args) {
		String s="$ja!va$&st%ar";
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		String symbols=s.replaceAll("[a-zA-Z0-9]", "");

		System.out.println(s1+"\n"+symbols);

		String s2=" j a v a s t a r";
		String s3=s2.replaceAll("\\s", "");
		System.out.println(s3);

		String s4=s2.trim();
		System.out.println(s4);

	}

}
