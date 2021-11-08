package api.util;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class DdayTest {
	public static void main(String[] args) {
		Calendar today = new GregorianCalendar();
		Calendar dday = new GregorianCalendar();
		
		dday.set(2021, 8, 21);// 2021/9/21
		
		long ddayValue = dday.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(ddayValue/1000/60/60/24+"¿œ");
	}
}
