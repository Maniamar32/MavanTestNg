
public class PrimeOrnot {

	public static void main(String[] args) {
		int num=3;
		int factor=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					factor++;
				}
			if(factor==2) {
				System.out.println("prime");
				
			}else {
				System.out.println(" not prime");

			}
		}

	}

}
