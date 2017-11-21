package av.timedate;

import java.time.LocalDate;
import java.time.Month;

public class DateTest {

	public static void main(String[] args) {
		/*LocalDate date = LocalDate.of(2018, 1, 40); // java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 40
		LocalDate date1 = LocalDate.of(2018, 13, 30); // java.time.DateTimeException: Invalid value for MonthOfYear (valid values 1 - 12): 13
		LocalDate date3 = LocalDate.of(20181, 1, 30); //Output: +20181-01-30
		*/
		//LocalDate date4 = LocalDate.of(2018, Month.FEBRUARY, 29); //java.time.DateTimeException: Invalid date 'February 29' as '2018' is not a leap year
		//LocalDate date5 = LocalDate.of(2016, Month.FEBRUARY, 30); // java.time.DateTimeException: Invalid date 'FEBRUARY 30'
		LocalDate date6 = LocalDate.of(2016, Month.FEBRUARY, 29);
		System.out.println(date6); //2016-02-29
		date6 = date6.plusDays(-10);
		System.out.println(date6); //2016-02-19
		date6 = date6.plusDays(5);
		System.out.println(date6); //2016-02-24
		
		/*System.out.println(date);
		System.out.println(date1);
		System.out.println(date3);
		//System.out.println(date4);
		//System.out.println(date5);
		 */
		
		
		 
	}

}
