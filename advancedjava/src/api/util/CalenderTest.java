package api.util;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class CalenderTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR)+"��");
		System.out.println((cal.get(Calendar.MONTH)+1)+"��");
		System.out.println(cal.get(Calendar.DATE)+"��");
		System.out.println(cal.get(Calendar.HOUR)+"��");
		System.out.println(cal.get(Calendar.MINUTE)+"��");
		System.out.println(cal.get(Calendar.SECOND)+"��");
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTimeInMillis()/1000/60/60/24/30/12);
		
	}
}
