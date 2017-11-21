package av.timedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class SampleDateTime {

	public static void main(String[] args) {
		// befor Java-8
		Date now = new Date();
		System.out.println(now);
		long nowTime = now.getTime();
		System.out.println(nowTime);
		
		Calendar calender = Calendar.getInstance();
		System.out.println(calender.getTime());
		
		//After Java-8
		/*LocalTime nowTime8 = LocalTime.now();
		System.out.println(nowTime8);
		//nowTime8.plusMinutes(120);
		 */		
		LocalDate nowData8 = LocalDate.now();
		System.out.println(nowData8);
		nowData8 = LocalDate.of(2018, Month.FEBRUARY, 28);
		System.out.println(nowData8);
		
		/*LocalDateTime nowDateTime8 = LocalDateTime.now();
		LocalDateTime nowDateTime = LocalDateTime.of(nowData8, nowTime8);
		//nowDateTime8.plusHours(24);
		
		System.out.println(nowDateTime8 +" --- "+nowDateTime);*/
		

	}

}
