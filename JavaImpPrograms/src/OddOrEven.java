
public class OddOrEven {

	public static void main(String[] args) {
		int num=1234;
		int evencount = 0;
		int oddcount=0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				evencount++;
			}else {
				oddcount++;	
			}
          num=num/10;
		}
System.out.println(evencount);
System.out.println(oddcount);
	}
}