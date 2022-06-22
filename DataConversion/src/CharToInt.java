
public class CharToInt {

	public static void main(String[] args) {
		System.out.println("----chatToint-------");
		char c='a';
		char c1='1';
		int a=c;
		int b=c1;
		System.out.println(a);//97
		System.out.println(b);//49
		//second way
		int i=Character.getNumericValue(c1);
		System.out.println(i);//1
		//third way
		int j=Integer.parseInt(String.valueOf(c1));
		System.out.println(j);//1

		System.out.println("-----int to char-----");
		int i2=65;
		char c2=(char)i2;
		System.out.println(c2);//A
		
		int i1=1;
       char c3=(char)(i1+'0');
		System.out.println(c3);//1
		
		

	}

}
