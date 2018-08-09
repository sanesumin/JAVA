package 열거형;

import java.util.Calendar;

public class WeekEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		Week today = null;
		
		int year= now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		switch(week) {
		case 1: today = Week.SUNDAY_ON_WEEK; break;
		case 2: today = Week.MONDAY_ON_WEEK;  break;
		case 3: today = Week.TUESDAY_ON_WEEK;  break;
		case 4: today = Week.SUNDAY_ON_WEEK;  break;
		case 5: today = Week.THURSDAY_ON_WEEK;  break;
		case 6: today = Week.FRIDAY_ON_WEEK;  break;
		case 7: today = Week.SATURDAY_ON_WEEK; break;
		}
		
		System.out.println("오늘은"+year+"년"+month+"월"+day+"일");
		System.out.println("오늘 요일:"+today+"");
		System.out.println(""+hour+"시"+minute+"분");
		System.out.println(""+second+"초입니다.");
		
		

	}

}
