package ������;

public class WeekEx2 {

	public static void main(String[] args) {
		Week today = Week.SUNDAY_ON_WEEK;
		String name = today.name();
		System.out.println(name);

		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY_ON_WEEK;
		Week day2 = Week.TUESDAY_ON_WEEK;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		if(args.length==1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay==Week.SATURDAY_ON_WEEK || 
					weekDay==Week.SUNDAY_ON_WEEK) {
				System.out.println("�ָ��̱���");
			}else {
				System.out.println("�����̱���");
			}
		}
		
		Week[] days = Week.values();
		for(Week day:days) {
			System.out.println(day);
		}
		
		
	}

}
