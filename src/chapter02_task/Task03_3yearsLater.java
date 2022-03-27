package chapter02_task;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Task03_3yearsLater {
	public static void main(String[] args) {
		//現在日付
		LocalDateTime date1 = LocalDateTime.now();
		
		//３年後の曜日
		DayOfWeek dayofweek3 = date1.plusYears(3).getDayOfWeek();
		System.out.println("3年後の曜日：" + dayofweek3);
	}
}
