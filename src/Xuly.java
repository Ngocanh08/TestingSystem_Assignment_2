import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import classCon.Account;
import classCon.Department;
import classCon.Group;
import classCon.Position;
import classCon.Position.PositionName;
import duLieu.duLieuCon;
import utills.DateFormat;
import utills.Scannerutil;

public class Xuly {

	public Xuly() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		duLieuCon duLieu = new duLieuCon();
//		duLieu.q16();
		// doi tuong nhap vao tu ben ngoai
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập a");
		int a = Scannerutil.scanInt();
		scan.nextLine();
		System.out.println(a);
//		System.out.println("Nhập b");
//		String b = scan.nextLine();
//		System.out.println(b);
//		Date now = new Date();
//		System.out.println(DateFormat.dateToStr(now, null));
//		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
//		String stringNow = format.format(now);
//		System.out.println(stringNow);
//		
//		String d = "10-12-2021";
//		try {
//			Date date = format.parse(d);// chuyen string -> Date ->.parse(String)
//			System.out.println(date);
//			System.out.println(format.format(now));// chuyen -> String-> .format(Date)
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//		Date date;
//		date = DateFormat.DatestrToDate("25-12-2012", null);

}}
