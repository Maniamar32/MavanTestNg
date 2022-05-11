import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalToString {

	public static void main(String[] args) {
		
LocalDate d1=LocalDate.now();
String s=d1.format(DateTimeFormatter.ISO_DATE);
System.out.println("date in string:"+s);

LocalDate d3=LocalDate.of(2016,11,01);
String s1=d3.format(DateTimeFormatter.ISO_DATE);
System.out.println("date in string:"+s1);

String s3="2012-07-12";
LocalDate d4=LocalDate.parse(s3);
System.out.println("String localdate:"+d4);


	}

}
