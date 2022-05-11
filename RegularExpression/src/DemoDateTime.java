import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoDateTime {

	public static void main(String[] args) {
LocalDateTime d=LocalDateTime.now();
System.out.println("before time:\n"+d);//2022-03-15T09:30:43.768770100
DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy \n HH:mm:ss");
String s=d.format(f);
System.out.println("after time:\n"+s);//15-03-2022 09:30:43

	}

}
