package utills;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	private static SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

	public static String dateToStr(Date date, String pattern) {
		if(pattern != null) {
			format= new SimpleDateFormat(pattern);
		}
		return format.format(date);
	}
	public static Date DatestrToDate(String date, String Pattern) {
		if(Pattern != null) {
			format= new SimpleDateFormat(Pattern);
			}
		Date d = null;
		try {
			d = format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}
	
}
//public static Date strToDate(String date, String pattern) {
//	if (pattern != null) {
//		format = new SimpleDateFormat(pattern);
//	}
//	Date d = null;
//	try {
//		d = format.parse(date);
//	} catch (ParseException e) {
//		if (pattern != null) {
//			System.err.println("Truyen vao sai dinh dang => " + pattern);
//		}else {
//			System.err.println("Truyen vao sai dinh dang => dd-MM-yyyy" );
//		}
//	}
//	
//	return d;
//}
