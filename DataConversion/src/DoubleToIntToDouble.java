
public class DoubleToIntToDouble {

	public static void main(String[] args) {
		System.out.println("---double to int----");
		Double d=new Double(10.5);//firstway
		int i=d.intValue();
		
		double d1=10.5;//second way
		int j=(int)d1;
		
		System.out.println(j);
		System.out.println(i);
		System.out.println("---int to double----");
		int k=200;
		double  d2=k;//firstway
		System.out.println(d2);
		
		Double d3=new Double(i);
		Double d4=Double.valueOf(k);
		System.out.println(d3);
		System.out.println(d4);
		
		
	}

}
