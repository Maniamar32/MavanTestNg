package Practice;

public class FibonaciEx {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		System.out.println(n1+"\n"+n2);
		int sum=0;
		for(int i=1;i<=6;i++) {
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
			
		}

	}

}
