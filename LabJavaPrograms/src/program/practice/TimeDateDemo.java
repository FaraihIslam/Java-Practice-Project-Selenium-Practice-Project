package program.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld=LocalDate.now();
		System.out.println("Today's Date-"+ld);
		LocalDate ldate=LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Today's Date-"+ldate);
		
		System.out.println("---------------------------------");
		
		LocalTime lt=LocalTime.now();
		System.out.println("Today's Time-"+lt);
		LocalTime ltime=LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Today's Time-"+ltime);
		
		System.out.println("---------------------------------");
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("Today's Date_Time -"+ldt);
		LocalDateTime ldtime=LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Today's Date_Time -"+ldtime);
		
		System.out.println("---------------------------------");
		
		LocalDate dateFormat = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(dateFormat));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(dateFormat));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(dateFormat));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dateFormat));

	}

}
