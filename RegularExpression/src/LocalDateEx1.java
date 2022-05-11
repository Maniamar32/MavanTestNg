import java.time.LocalDate;

public class LocalDateEx1 {

	public static void main(String[] args) {
    LocalDate today=LocalDate.now();
    System.out.println("today date is:"+today);
    LocalDate yesterday=today.minusDays(1);
    System.out.println("yesterday date is:"+yesterday);
    LocalDate tomarow=today.plusDays(1);
    System.out.println("tomarow date is:"+tomarow);
    
    //leap year
    LocalDate leapyear=LocalDate.of(2016, 1, 13);
    System.out.println(leapyear.isLeapYear());


	}

}
