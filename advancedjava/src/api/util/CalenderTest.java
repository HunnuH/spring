package api.util;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class CalenderTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println((cal.get(Calendar.MONTH)+1)+"월");
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTimeInMillis()/1000/60/60/24/30/12);
		
	}
}
