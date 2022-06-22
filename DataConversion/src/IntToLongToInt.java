
public class IntToLongToInt {

	public static void main(String[] args) {
		System.out.println("---int to long-----");
		int i=200;
		long l=i;
		//or
		Long l1=new Long(i);
		//or
		Long l2=Long.valueOf(i);
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l2);

		System.out.println("---long to int----");

		long l3=500;
		int j=(int)l3;
		//or
		Long l4=new Long(10);
		int k=l4.intValue();

		System.out.println(j);
		System.out.println(k);
	}

}
