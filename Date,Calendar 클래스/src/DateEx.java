import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateEx {

	public static void main(String[] args) {
		Date now = new date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��	");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
						
	}

}
