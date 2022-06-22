
 class StringToInt {

	public static void main(String[] args) {

		String s="200";
		int i=Integer.parseInt(s);
		Integer j=Integer.valueOf(s);
		System.out.println(j);
		System.out.println(i);
		System.out.println(i+100);
		System.out.println(s+100);
		
		String s1="hello";//hello gives numberformat exception
		Integer k=Integer.valueOf(s1);
		System.out.println(k);
		
		
	}

}
